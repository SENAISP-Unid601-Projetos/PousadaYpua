package pousadaYpua.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pousadaYpua.model.Clientes;
import pousadaYpua.model.Quarto;
import pousadaYpua.model.Reserva;
import pousadaYpua.utils.Path;

public class ReservasDao {

	private Connection con;

	public ReservasDao() {

		try {
			// Exemplo de inicialização da conexão
			this.con = DriverManager.getConnection(Path.getPathBanco());

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insert(Reserva reserva) {
		Clientes cliente = reserva.getCliente();
		Quarto quarto = reserva.getQuarto();

		String sql = "INSERT INTO Reservas (cpf, numero_quarto) VALUES (  ?, ?)";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, cliente.getCpf());
			stmt.setString(2, quarto.getNumero());

			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public void delete(String numeroPedido) {
		String sql = "DELETE FROM Reserva WHERE numero_pedido = ?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, numeroPedido);
			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public boolean existeReserva(String cpf) {
		String sql = "SELECT * FROM Reservas WHERE cpf = ?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, cpf);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				String cpf2 = rs.getString("cpf");

				return true;

			}

		} catch (Exception e) {

		}
		return false;
	}

	public String buscarDatas(Reserva reserva, String date) {
		String sql = "SELECT numero_quarto, datas_reservadas FROM DatasReservadas WHERE numero_quarto = ? AND datas_reservadas = ?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, reserva.getQuarto().getNumero());
			stmt.setString(2, date);

			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				String numeroQuarto = rs.getString("numero_quarto");
				String data = rs.getString("datas_reservadas");

				return data;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public String buscarPedido() {
		String sql = "SELECT MAX(numero_pedido) AS numero_pedido FROM Reservas ";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {

			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				String numeroPedido = rs.getString("numero_pedido");

				return numeroPedido;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public void deleteDatas(String numeroPedido) {
		String sql = "DELETE FROM DatasReservadas WHERE numero_pedido = ?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, numeroPedido);
			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public void insert2(Reserva reserva) {
		Clientes cliente = reserva.getCliente();
		Quarto quarto = reserva.getQuarto();

		String sql = "INSERT INTO Reserva (cpf, numero_quarto, data_entrada, data_saida) VALUES ( ?,?, ?, ?)";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, cliente.getCpf());
			stmt.setString(2, quarto.getNumero());
			stmt.setString(3, reserva.getDataEntrada());
			stmt.setString(4, reserva.getDataSaida());

			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public boolean verificaDisponibilidade(String numeroQuarto, String entrada, String saida) {
		String sql = "SELECT 1 FROM Reserva WHERE numero_quarto = ? AND (data_entrada < ? AND data_saida > ?)";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, numeroQuarto);
			stmt.setString(2, saida);
			stmt.setString(3, entrada);

			ResultSet rs = stmt.executeQuery();
			return !rs.next(); // Se não retornar nada o quarto ta disponível
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

	}

	public List<Object[]> buscaReservas() {
		List<Object[]> reservas = new ArrayList<>();

		String sql = "SELECT * FROM Reserva WHERE (checkin_status = 'feito' OR  checkin_status = 'pendente') AND checkout_status = 'pendente' ";

		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Object[] reserva = { rs.getInt("numero_pedido"), rs.getString("cpf"), rs.getString("numero_quarto"),
						rs.getString("data_entrada"), rs.getString("data_saida"), rs.getString("checkin_status"),
						rs.getString("checkout_status") };

				reservas.add(reserva); // Adiciona a reserva à lista
			}

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return reservas;
	}

	public Reserva buscarPorId(int idReserva) {
	    Reserva reserva = null;

	    String sql = "SELECT * FROM Reserva WHERE numero_pedido = ?";

	    try (PreparedStatement stmt = con.prepareStatement(sql)) {
	        // Define o parâmetro no SQL
	        stmt.setInt(1, idReserva);

	        // Executa a consulta
	        try (ResultSet rs = stmt.executeQuery()) {
	            if (rs.next()) {
	                // Obtém os dados da reserva
	                String numeroPedido = rs.getString("numero_pedido");
	                String cpf = rs.getString("cpf");
	                String numQuarto = rs.getString("numero_quarto");
	                String dataEntrada = rs.getString("data_entrada");
	                String dataSaida = rs.getString("data_saida");
	                String checkin = rs.getString("checkin_status");
	                String checkout = rs.getString("checkout_status");

	                // Cria os objetos relacionados
	                Clientes cliente = new Clientes(cpf); // Cria um cliente usando o CPF
	                Quarto quarto = new Quarto(numQuarto); // Cria um quarto usando o número do quarto

	                // Instancia a reserva
	                reserva = new Reserva(numeroPedido, dataEntrada, dataSaida, cliente, quarto, checkin, checkout);
	            }
	        }
	    } catch (SQLException e) {
	        throw new RuntimeException("Erro ao buscar reserva pelo ID", e);
	    }

	    return reserva; // Retorna a reserva encontrada ou null
	}


	public List<Reserva> buscaReservaPorCpf(String cpf) {
		List<Reserva> reservas = new ArrayList<>();
		String sql = "SELECT * FROM Reserva WHERE cpf = ?";

		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, cpf);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				String numeroPedido = rs.getString("numero_pedido");
				cpf = rs.getString("cpf");
				String numeroQuarto = rs.getString("numero_quarto");
				String dataEntrada = rs.getString("data_entrada");
				String dataSaida = rs.getString("data_saida");
				String checkin = rs.getString("checkin_status");
				String checkout = rs.getString("checkout_status");

				// Supondo que Cliente e Quarto são classes que você tem no seu modelo
				Clientes cliente = new Clientes(cpf); // Criando um cliente com o CPF
				Quarto quarto = new Quarto(numeroQuarto); // Criando um quarto com o número

				// Criando a reserva
				reservas.add(new Reserva(numeroPedido, dataEntrada, dataSaida, cliente, quarto, checkin, checkout));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return reservas;
	}

	public void updateCheckin(Reserva reserva) {
		String sql = "UPDATE Reserva SET checkin_status = 'feito' WHERE numero_pedido = ?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, reserva.getNumeroPedido());

			stmt.executeUpdate();

		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void updateCheckout(Reserva reserva) {
		String sql = "UPDATE Reserva SET checkout_status = 'feito' WHERE numero_pedido = ?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, reserva.getNumeroPedido());

			stmt.executeUpdate();

		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
	}

}
