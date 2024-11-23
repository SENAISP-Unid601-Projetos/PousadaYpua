package pousadaYpua.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import pousadaYpua.DAO.ReservasDao;
import pousadaYpua.model.Reserva;

public class BuscarReservas extends JInternalFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable tabelaReservas;
    private DefaultTableModel modeloTabela;
    
    private Reserva reserva;
    
    ReservasDao reservaDao = new ReservasDao();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                BuscarReservas frame = new BuscarReservas();
                frame.setVisible(true);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the frame.
     */
    @SuppressWarnings("deprecation")
	public BuscarReservas() {
        setTitle("Buscar Reservas");
        setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        setBounds(0, 0, 1125, 675);
        setClosable(true);
        setMaximizable(true);
        setIconifiable(true);

        contentPane = new JPanel();
        contentPane.setBackground(Color.DARK_GRAY);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        modeloTabela = new DefaultTableModel(
        	    new Object[]{"ID Reserva", "CPF Cliente", "Quarto", "Data Entrada", "Data Saída", "Check-in", "Check-out"}, 0) {
        	    private static final long serialVersionUID = 1L;

				@Override
        	    public boolean isCellEditable(int row, int column) {
        	        return false; // Todas as células não editáveis
        	    }
        	};
        	tabelaReservas = new JTable(modeloTabela);

        
        JScrollPane scrollPane = new JScrollPane(tabelaReservas);
        scrollPane.setBounds(20, 20, 1080, 500);
        contentPane.add(scrollPane);

        JButton btnCheckIn = new JButton("Realizar Check-In");
        btnCheckIn.setBounds(950, 550, 150, 30);
        contentPane.add(btnCheckIn);

        
        tabelaReservas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                if (e.getClickCount() == 1) {
                    
                    int linhaSelecionada = tabelaReservas.getSelectedRow();
                    if (linhaSelecionada != -1) {
                        
                        Object idReserva = tabelaReservas.getValueAt(linhaSelecionada, 0);
                        Object cpfCliente = tabelaReservas.getValueAt(linhaSelecionada, 1);
                        Object quarto = tabelaReservas.getValueAt(linhaSelecionada, 2);
                        Object dataEntrada = tabelaReservas.getValueAt(linhaSelecionada, 3);
                        Object dataSaida = tabelaReservas.getValueAt(linhaSelecionada, 4);

                        
                        System.out.println("ID Reserva: " + idReserva);
                        System.out.println("CPF Cliente: " + cpfCliente);
                        System.out.println("Quarto: " + quarto);
                        System.out.println("Data Entrada: " + dataEntrada);
                        System.out.println("Data Saída: " + dataSaida);
                        
                        String id = idReserva.toString();
                        reserva = new Reserva(id);
                        
                        
                        
                    }
                }
            }
        });

        carregarReservas();

        btnCheckIn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtém a linha selecionada
                int linhaSelecionada = tabelaReservas.getSelectedRow();
                if (linhaSelecionada != -1) {
                	
               
                    // Obtém os dados da linha selecionada
                    Object idReserva = tabelaReservas.getValueAt(linhaSelecionada, 0);
                    reservaDao.updateCheckin(reserva);
                    carregarReservas();
                    // Realiza o Check-In (simulado com mensagem)
                    JOptionPane.showMessageDialog(contentPane, 
                            "Check-In realizado para a reserva ID: " + idReserva,
                            "Check-In", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    // Caso nenhuma linha esteja selecionada
                    JOptionPane.showMessageDialog(contentPane, 
                            "Selecione uma reserva para realizar o Check-In.",
                            "Aviso", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    /**
     * Simula carregamento de dados na tabela.
     */
    private void carregarReservas() {
        // Limpa a tabela antes de adicionar novas linhas
        modeloTabela.setRowCount(0);

        // Recupera os dados de reservas
        List<Object[]> reservas = reservaDao.buscaReservas();

        
       

        // Adiciona os dados no modelo da tabela
        for (Object[] reserva : reservas) {
            modeloTabela.addRow(reserva);
        }
    }
}
