package pousadaYpua.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReservaDeQuarto extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReservaDeQuarto frame = new ReservaDeQuarto();
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
	public ReservaDeQuarto() {
		setMaximizable(true);
		setClosable(true);
		setBounds(100, 100, 1185, 640);
		getContentPane().setLayout(null);
		
		JLabel lblImagem = new JLabel("");
		lblImagem.setBackground(new Color(128, 64, 64));
		lblImagem.setBounds(20, 10, 445, 147);
		getContentPane().add(lblImagem);
		
		JLabel lblCpfCliente = new JLabel("CPF CLIENTE :");
		lblCpfCliente.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lblCpfCliente.setHorizontalAlignment(SwingConstants.LEFT);
		lblCpfCliente.setBounds(475, 10, 145, 35);
		getContentPane().add(lblCpfCliente);
		
		JFormattedTextField ftfCpfCliente = new JFormattedTextField();
		ftfCpfCliente.setBounds(474, 40, 320, 35);
		getContentPane().add(ftfCpfCliente);
		
		JLabel lblDataEntrada = new JLabel("DATA CHECK-IN");
		lblDataEntrada.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lblDataEntrada.setBounds(475, 82, 145, 31);
		getContentPane().add(lblDataEntrada);
		
		JLabel lblSaida = new JLabel("DATA CHECK-OUT");
		lblSaida.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lblSaida.setBounds(475, 154, 145, 19);
		getContentPane().add(lblSaida);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(475, 109, 319, 35);
		getContentPane().add(formattedTextField);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setBounds(475, 185, 319, 35);
		getContentPane().add(formattedTextField_1);
		
		JButton btnReservar = new JButton("Reservar");
		
		btnReservar.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		btnReservar.setBounds(475, 259, 319, 35);
		getContentPane().add(btnReservar);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(33, 313, 432, 220);
		getContentPane().add(textArea);
		
		JButton btnConfirmar = new JButton("New button");
		btnConfirmar.setBounds(296, 543, 145, 42);
		getContentPane().add(btnConfirmar);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(166, 543, 120, 42);
		getContentPane().add(btnNewButton_1);
		
		
		btnReservar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				ConfirmacaoInfo con = new ConfirmacaoInfo();
				con.show();
				
			}
		});
	

	}
}
