package pousadaYpua.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import pousadaYpua.DAO.ClientesDao;
import pousadaYpua.DAO.ReservasDao;
import pousadaYpua.model.Clientes;
import pousadaYpua.model.Gerenciador;
import pousadaYpua.model.Quarto;
import pousadaYpua.model.Reserva;
import pousadaYpua.utils.DataUtils;
import pousadaYpua.utils.Path;

public class ReservaQuarto extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	Clientes clientes;
	Quarto quarto;
	Reserva reserva;
	Gerenciador gerenciador;
	JComponent contentPane = new JPanel();
	 private JDesktopPane desktopPane;

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
		
		desktopPane = new JDesktopPane(); 
	    setContentPane(desktopPane); 
	    contentPane = new JPanel(); 
	    contentPane.setLayout(null);
	    desktopPane.add(contentPane);		 
		 
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
	    panel.setBackground(Color.GRAY);
	    panel.setBounds(0, 17, 1120, 617);
	    
	    contentPane.add(panel);
	    panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Path.getPathResources()+File.pathSeparator+"imgInterna.jpg"));
		lblNewLabel.setBounds(430, 352, 661, 255);
		panel.add(lblNewLabel);

		JTextField textCpf = new JTextField();
		textCpf.setBounds(468, 38, 263, 30);
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
		txtArea_InfoClient.setBounds(20, 63, 311, 150);
		panel.add(txtArea_InfoClient);

		JComboBox comboBoxQuarto = new JComboBox();
		comboBoxQuarto.setToolTipText("");
		comboBoxQuarto.setName("");
		comboBoxQuarto.setModel(new DefaultComboBoxModel(
				new String[] {" ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14" }));
		comboBoxQuarto.setSelectedIndex(0);
		comboBoxQuarto.setMaximumRowCount(12);
		comboBoxQuarto.setBounds(468, 145, 122, 27);
		panel.add(comboBoxQuarto);

		JLabel lblNQuarto = new JLabel("NUMERO DO QUARTO");
		lblNQuarto.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lblNQuarto.setBounds(468, 103, 183, 30);
		panel.add(lblNQuarto);

		JLabel lblDataEntrada = new JLabel("DATA ENTRADA");
		lblDataEntrada.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lblDataEntrada.setBounds(468, 182, 183, 30);
		panel.add(lblDataEntrada);

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
		textDataEntrada.setBounds(468, 221, 122, 30);
		panel.add(textDataEntrada);
		
		JFormattedTextField textDataSaida1 = new JFormattedTextField(dataMask);
		
		textDataSaida1.setBounds(623, 221, 122, 30);
		panel.add(textDataSaida1);
		
		JLabel lblDataSaid = new JLabel("DATA SAIDA");
		lblDataSaid.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lblDataSaid.setBounds(623, 182, 183, 30);
		panel.add(lblDataSaid);

		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtArea_InfoClient.setText("");
				String cpf = textCpf.getText();

				clientes = clienteDao.buscar(cpf);
				if (clientes != null) {
					txtArea_InfoClient.setText(clientes.getInfo());
					System.out.println(clientes.getCpf() + clientes.getNome());
				} else {
					JOptionPane.showMessageDialog(null, "Digite um CPF válido ou cadastre novo cliente! ", "Erro",
							  JOptionPane.ERROR_MESSAGE);
				    
				}

			}
		});

		comboBoxQuarto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBoxQuarto.getSelectedIndex() == 0) {
					JOptionPane.showMessageDialog(null, "Escolha um quarto!", "Erro",
							  JOptionPane.ERROR_MESSAGE);
					return;
				}
				String numero = (String) comboBoxQuarto.getSelectedItem();

				quarto = new Quarto(numero);

				System.out.println(numero);
			}
		});

		btnReservar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<String> datasReserva = new ArrayList();

				String dataEntradaStr = textDataEntrada.getText();
				
				String dataSaidaStr = textDataSaida1.getText();
				
				boolean reservaCriada = false;

				String numero = quarto.getNumero();

				String cpf = textCpf.getText();

				clientes = new Clientes(cpf);



				clientes = clienteDao.buscar(cpf);
				

//				if (c.getCpf() == null || c.getCpf() == cpf) {
//
//					reservaDao.insert(reserva);
//				}
				
//				if(comboBoxQuarto.getSelectedIndex() == 0) {
//					JOptionPane.showMessageDialog(null, "Escolha um quarto!", "Erro",
//							  JOptionPane.ERROR_MESSAGE);
//					return;
//				}
				

				LocalDate dataEntrada = DataUtils.stringToDate(dataEntradaStr);
				if(dataEntrada.isBefore(LocalDate.now())) {
					JOptionPane.showMessageDialog(null, "Digite uma Data valida! ", "Erro",
												  JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				LocalDate dataSaida = DataUtils.stringToDate(dataSaidaStr);
				if(dataSaida.isBefore(dataEntrada) || dataSaida.isEqual(dataEntrada)) 
 {
					JOptionPane.showMessageDialog(null, "Digite uma Data valida! ", "Erro",
												  JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				
				if(reservaDao.verificaDisponibilidade(numero, dataEntradaStr, dataSaidaStr) ) {
					reserva = new Reserva(dataEntradaStr, dataSaidaStr, clientes, quarto);
					
					reservaDao.insert2(reserva);
					JOptionPane.showMessageDialog(null, "Reserva registrada com sucesso! ", "Sucesso",
							  JOptionPane.INFORMATION_MESSAGE);
					
					
				}else {JOptionPane.showMessageDialog(null, "Data já reservada ", "Erro",
						  JOptionPane.ERROR_MESSAGE);
					
				}
				
				
//				for (int i = 0; i < dias; i++) {
//
//					LocalDate increment = dataEntrada.plusDays(i);
//					datasReserva.add(DataUtils.dateToString(increment));
////					reserva = new Reserva(DataUtils.dateToString(increment), clientes, quarto);
//					System.out.println(increment);
//				}
//				
//				reserva = new Reserva(datasReserva, clientes, quarto);
//				if(gerenciador.verificaDatas(reserva)) {
//					reservaDao.insert(reserva);
//					reserva.setNumeroPedido(reservaDao.buscarPedido());
//					System.out.println(reservaDao.buscarPedido());
//					reservaDao.insertDatas(reserva);
//					JOptionPane.showMessageDialog(null, "Reserva registrada com sucesso! ", "Sucesso",
//							JOptionPane.INFORMATION_MESSAGE);
//				}else {
//
//					JOptionPane.showMessageDialog(null, "Data já está reservada! ", "Erro",
//							JOptionPane.ERROR_MESSAGE);
//				
//
//				}

			}
		});
	}
}