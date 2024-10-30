package pousadaYpua.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField textSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 396, 416);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBackground(new Color(212, 212, 212));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login ");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setBounds(79, 22, 212, 56);
		contentPane.add(lblLogin);
		
		txtUsuario = new JTextField();
		txtUsuario.setHorizontalAlignment(SwingConstants.LEFT);
		txtUsuario.setToolTipText("");
		txtUsuario.setBounds(131, 116, 160, 30);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUsuario.setBounds(51, 108, 71, 41);
		contentPane.add(lblUsuario);
		
		textSenha = new JTextField();
		textSenha.setToolTipText("");
		textSenha.setHorizontalAlignment(SwingConstants.LEFT);
		textSenha.setColumns(10);
		textSenha.setBounds(131, 165, 160, 30);
		contentPane.add(textSenha);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSenha.setBounds(51, 157, 71, 41);
		contentPane.add(lblSenha);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(new Color(255, 255, 255));
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLogin.setBounds(195, 239, 113, 30);
		contentPane.add(btnLogin);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBackground(new Color(255, 255, 255));
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSair.setBounds(64, 239, 113, 30);
		contentPane.add(btnSair);
	}
}
