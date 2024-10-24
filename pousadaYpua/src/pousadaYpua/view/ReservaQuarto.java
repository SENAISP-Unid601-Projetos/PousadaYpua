package pousadaYpua.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import pousadaYpua.DAO.ClientesDao;
import pousadaYpua.DAO.ReservasDao;
import pousadaYpua.model.Clientes;
import pousadaYpua.model.Gerenciador;
import pousadaYpua.model.Quarto;
import pousadaYpua.model.Reserva;
import pousadaYpua.utils.DataUtils;
import javax.swing.JFormattedTextField;

public class ReservaQuarto extends JInternalFrame {

	private static final long serialVersionUID = 1L;
Clientes clientes;
Quarto quarto;
Reserva reserva;
Gerenciador gerenciador;
private JTextField textDiasReservados;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReservaQuarto frame = new ReservaQuarto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ReservaQuarto() {
		ClientesDao clienteDao = new ClientesDao();
		ReservasDao reservaDao = new ReservasDao();
		Gerenciador gerenciador = new Gerenciador();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setBounds(0, 0, 1125, 675);
	    JComponent contentPane = new JPanel();
	    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
	    setContentPane(contentPane);
	    contentPane.setLayout(null);
	    
	    JPanel panel = new JPanel();
	    panel.setBackground(new Color(113, 177, 187));
	    panel.setBounds(0, 17, 1120, 617);
	    
	    contentPane.add(panel);
	    panel.setLayout(null);
		
		
		JTextField textCpf = new JTextField();
		textCpf.setBounds(380, 76, 263, 30);
		panel.add(textCpf);
		textCpf.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Status da Reserva:");
		lblNewLabel_6.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_6.setBounds(745, 481, 153, 30);
		panel.add(lblNewLabel_6);
		
		JTextField textStatus = new JTextField();
		textStatus.setBounds(908, 481, 135, 30);
		panel.add(textStatus);
		textStatus.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Preferências Especiais:");
		lblNewLabel_7.setFont(new Font("Yu Gothic", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_7.setBounds(380, 381, 244, 30);
		panel.add(lblNewLabel_7);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(380, 411, 328, 111);
		panel.add(textArea);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lblCpf.setBounds(380, 41, 183, 30);
		panel.add(lblCpf);
		
		JLabel lblInfo = new JLabel("INFORMAÇÕES DO CLIENTE");
		lblInfo.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lblInfo.setBounds(10, 41, 229, 30);
		panel.add(lblInfo);
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.setBackground(Color.WHITE);
		btnBuscar.setBounds(526, 110, 117, 29);
		panel.add(btnBuscar);
		
		JTextArea txtArea_InfoClient = new JTextArea();
		txtArea_InfoClient.setEditable(false);
		txtArea_InfoClient.setBounds(10, 83, 229, 150);
		panel.add(txtArea_InfoClient);
		
		JComboBox comboBoxQuarto = new JComboBox();
		comboBoxQuarto.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14"}));
		comboBoxQuarto.setMaximumRowCount(12);
		comboBoxQuarto.setBounds(380, 170, 122, 27);
		panel.add(comboBoxQuarto);
		
		JLabel lblNQuarto = new JLabel("NUMERO DO QUARTO");
		lblNQuarto.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lblNQuarto.setBounds(380, 134, 183, 30);
		panel.add(lblNQuarto);
		
		textDiasReservados = new JTextField();
		textDiasReservados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textDiasReservados.setColumns(10);
		textDiasReservados.setBounds(550, 235, 130, 30);
		panel.add(textDiasReservados);
		
		JLabel lblDataEntrada = new JLabel("DATA ENTRADA");
		lblDataEntrada.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lblDataEntrada.setBounds(380, 209, 183, 30);
		panel.add(lblDataEntrada);
		
		JLabel lblDataSaida = new JLabel("DIAS RESERVADOS");
		lblDataSaida.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lblDataSaida.setBounds(550, 209, 183, 30);
		panel.add(lblDataSaida);
		
		JButton btnReservar = new JButton("RESERVAR");
	
		btnReservar.setBounds(563, 290, 117, 29);
		panel.add(btnReservar);
		
		JFormattedTextField textDataEntrada = new JFormattedTextField("##/##/####");
		textDataEntrada.setBounds(380, 235, 122, 30);
		panel.add(textDataEntrada);
		
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtArea_InfoClient.setText("");
				String cpf = textCpf.getText();
				

				clientes = new Clientes(cpf);
				clientes = clienteDao.buscar(clientes);
				txtArea_InfoClient.setText(clientes.getInfo());
				System.out.println(clientes.getCpf() + clientes.getNome());
			}
		});
		
		comboBoxQuarto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String numero = (String) comboBoxQuarto.getSelectedItem();
				 
				  quarto = new Quarto(numero);
				  
				  System.out.println(numero);
			}
		});
		
		btnReservar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 ArrayList<Reserva> datasReserva = new ArrayList();
				 
				String dataEntradaStr = textDataEntrada.getText();
				String diasReservados = textDiasReservados.getText();
				int dias = Integer.parseInt(diasReservados);
				
				String numero = quarto.getNumero();
				
				String cpf = textCpf.getText();            
				
				
				
				LocalDate dataEntrada = DataUtils.stringToDate(dataEntradaStr);
				
				for(int i = 0; i < dias; i++) {
					LocalDate increment = dataEntrada.plusDays(i);
					
					datasReserva.add(new Reserva(DataUtils.dateToString(increment), clientes, quarto));
//					reserva = new Reserva(DataUtils.dateToString(increment), clientes, quarto);
				}
				if(gerenciador.verificaDatas(datasReserva)) {
					for(Reserva r : datasReserva) {
						reservaDao.insert(r);
						System.out.println(r);
					}
					
				}else {
					System.out.println("ja tem a reserva no dia ");
				}
		
			
				
	
				
				
				
				
				
				
				
			}
		});
	}
}
