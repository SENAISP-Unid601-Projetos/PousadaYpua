package pousadaYpua.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import pousadaYpua.DAO.ClientesDao;
import pousadaYpua.DAO.ReservasDao;
import pousadaYpua.model.Clientes;
import pousadaYpua.model.Gerenciador;
import pousadaYpua.model.Quarto;
import pousadaYpua.model.Reserva;
import pousadaYpua.utils.DataUtils;

public class ReservaQuarto extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	Clientes clientes;
	Quarto quarto;
	Reserva reserva;
	Gerenciador gerenciador;
	JComponent contentPane = new JPanel();
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
		
		
		
		super("Reserva de Quartos");
		setClosable(true);

		ClientesDao clienteDao = new ClientesDao();
		ReservasDao reservaDao = new ReservasDao();
		Gerenciador gerenciador = new Gerenciador();
		MaskFormatter dataMask = null;

		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    setBounds(0, 0, 1125, 675);
	    
	    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
	    setContentPane(contentPane);
	    contentPane.setLayout(null);
	    
	    JPanel panel = new JPanel();
	    panel.setBackground(UIManager.getColor("Button.shadow"));
	    panel.setBounds(0, 17, 1120, 617);
	    
	    contentPane.add(panel);
	    panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nicol\\Documentos\\GitHub\\PousadaYpua\\pousadaYpua\\resources\\imagemInterna.jpg"));
		lblNewLabel.setBounds(376, 287, 714, 320);
		panel.add(lblNewLabel);
		
		
		JTextField textCpf = new JTextField();
		textCpf.setBounds(468, 39, 263, 30);
		panel.add(textCpf);
		textCpf.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Preferências Especiais:");
		lblNewLabel_7.setFont(new Font("Yu Gothic", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_7.setBounds(20, 427, 244, 30);
		panel.add(lblNewLabel_7);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(20, 467, 328, 140);
		panel.add(textArea);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lblCpf.setBounds(468, 10, 183, 30);
		panel.add(lblCpf);
		
		JLabel lblInfo = new JLabel("INFORMAÇÕES DO CLIENTE");
		lblInfo.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lblInfo.setBounds(20, 23, 229, 30);
		panel.add(lblInfo);
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.setBackground(Color.WHITE);
		btnBuscar.setBounds(751, 39, 117, 29);
		panel.add(btnBuscar);
		
		JTextArea txtArea_InfoClient = new JTextArea();
		txtArea_InfoClient.setEditable(false);
		txtArea_InfoClient.setBounds(20, 63, 311, 290);
		panel.add(txtArea_InfoClient);
		
		JComboBox comboBoxQuarto = new JComboBox();
		comboBoxQuarto.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14"}));
		comboBoxQuarto.setMaximumRowCount(12);
		comboBoxQuarto.setBounds(468, 145, 122, 27);
		panel.add(comboBoxQuarto);
		
		JLabel lblNQuarto = new JLabel("NUMERO DO QUARTO");
		lblNQuarto.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lblNQuarto.setBounds(468, 103, 183, 30);
		panel.add(lblNQuarto);
		
		textDiasReservados = new JTextField();
		textDiasReservados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textDiasReservados.setColumns(10);
		textDiasReservados.setBounds(626, 222, 130, 30);
		panel.add(textDiasReservados);
		
		JLabel lblDataEntrada = new JLabel("DATA ENTRADA");
		lblDataEntrada.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lblDataEntrada.setBounds(468, 182, 183, 30);
		panel.add(lblDataEntrada);
		
		JLabel lblDataSaida = new JLabel("DIAS RESERVADOS");
		lblDataSaida.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lblDataSaida.setBounds(626, 182, 183, 30);
		panel.add(lblDataSaida);
		
		JButton btnReservar = new JButton("RESERVAR");
	
		btnReservar.setBounds(787, 222, 117, 29);
		panel.add(btnReservar);
		
		try {
		    dataMask = new MaskFormatter("##/##/####");
		    dataMask.setPlaceholderCharacter('_'); // Define o caractere de preenchimento como "_"
		} catch (ParseException e) {
		    e.printStackTrace();
		}
		
		JFormattedTextField textDataEntrada = new JFormattedTextField(dataMask);
		textDataEntrada.setBounds(468, 222, 122, 30);
		panel.add(textDataEntrada);
		
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtArea_InfoClient.setText("");
				String cpf = textCpf.getText();
				

				
				clientes = clienteDao.buscar(cpf);
				if(clientes != null) {
					txtArea_InfoClient.setText(clientes.getInfo());
					System.out.println(clientes.getCpf() + clientes.getNome());
				}else {
					txtArea_InfoClient.setText("O cliente buscado não existe!\nDigite um CPF valido ou \ncadatre um novo Cliente!");
					System.out.println("Cliente Inexistente");
				}
				
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
				
				
				
				clientes = new Clientes(cpf);
				
				reserva = new Reserva(clientes, quarto);
				reservaDao.insert(reserva);
				
				
				String numeroPedido = reservaDao.buscarPedido(cpf);
				LocalDate dataEntrada = DataUtils.stringToDate(dataEntradaStr);
				
				for(int i = 0; i < dias; i++) {
					
					LocalDate increment = dataEntrada.plusDays(i);
					if(!increment.isBefore(LocalDate.now())) {
						datasReserva.add(new Reserva(DataUtils.dateToString(increment),numeroPedido, clientes, quarto));
//						reserva = new Reserva(DataUtils.dateToString(increment), clientes, quarto);
						
						System.out.println(increment);
					
					}
					else {
						System.out.println("data invalida");
					}
					
					}
					
					
					
					
				
				if(gerenciador.verificaDatas(datasReserva)) {
					for(Reserva r : datasReserva) {
						
						
//						if(gerenciador.verificaCpf(datasReserva, cpf) == false) {
//							reservaDao.insert(r);
//						}
						reservaDao.insertDatas(r);
						System.out.println(r.getNumeroPedido());
					}
						
					
				}else {
					System.out.println("ja tem a reserva no dia ");
				}
		
			
				
	
				
				
				
				
				
				
				
			}
		});
	}
}