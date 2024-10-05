package pousadaYpua.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import pousadaYpua.model.Usuario;

import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class TelaCadastroUsuario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCelular;
	private JTextField txtCpf;
	private JTextField txtEmail;
	private JTextField txtEndereco;
	private JTextField txtNumeHome;
	private JTextField txtCidade;
	private JTextField txtCep;
	private JTextField txtEstado;
	private Usuario usuario;
	UsuarioDao userDao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroUsuario frame = new TelaCadastroUsuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	

	//Criação do contrutor com encapsulamento e parametros;
	public TelaCadastroUsuario() {
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 951, 623);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlCadastro = new JPanel();
		pnlCadastro.setBackground(new Color(128, 128, 128));
		pnlCadastro.setBorder(UIManager.getBorder("OptionPane.border"));
		pnlCadastro.setBounds(10, 11, 917, 73);
		contentPane.add(pnlCadastro);
		pnlCadastro.setLayout(null);
		
		JLabel lblCadastro = new JLabel("Cadastro Cliente");
		lblCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastro.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 24));
		lblCadastro.setBounds(302, 15, 319, 47);
		pnlCadastro.add(lblCadastro);
		
		JButton btnReservas = new JButton("Reservas");
		btnReservas.setFont(new Font("Verdana", Font.BOLD, 16));
		btnReservas.setForeground(new Color(0, 0, 0));
		btnReservas.setBackground(new Color(192, 192, 192));
		btnReservas.setBounds(10, 95, 129, 73);
		contentPane.add(btnReservas);
		
		JButton btnNewButton = new JButton("Clientes");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 16));
		btnNewButton.setBounds(10, 179, 129, 80);
		contentPane.add(btnNewButton);
		
		JPanel pnlInfoCliente = new JPanel();
		pnlInfoCliente.setBackground(new Color(192, 192, 192));
		pnlInfoCliente.setBorder(UIManager.getBorder("OptionPane.border"));
		pnlInfoCliente.setBounds(149, 95, 769, 468);
		contentPane.add(pnlInfoCliente);
		pnlInfoCliente.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Verdana", Font.ITALIC, 18));
		lblNewLabel.setBounds(10, 11, 128, 30);
		pnlInfoCliente.add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setBounds(148, 11, 258, 29);
		pnlInfoCliente.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Celular");
		lblNewLabel_1.setFont(new Font("Verdana", Font.ITALIC, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(416, 11, 104, 30);
		pnlInfoCliente.add(lblNewLabel_1);
		
		txtCelular = new JTextField();
		txtCelular.setBounds(534, 11, 194, 29);
		pnlInfoCliente.add(txtCelular);
		txtCelular.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("CPF");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Verdana", Font.ITALIC, 18));
		lblNewLabel_2.setBounds(10, 52, 128, 32);
		pnlInfoCliente.add(lblNewLabel_2);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(148, 51, 258, 33);
		pnlInfoCliente.add(txtCpf);
		txtCpf.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Verdana", Font.ITALIC, 18));
		lblNewLabel_3.setBounds(417, 52, 110, 32);
		pnlInfoCliente.add(lblNewLabel_3);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(534, 51, 194, 33);
		pnlInfoCliente.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Endereço");
		lblNewLabel_4.setFont(new Font("Verdana", Font.ITALIC, 18));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(10, 95, 128, 30);
		pnlInfoCliente.add(lblNewLabel_4);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(148, 95, 258, 29);
		pnlInfoCliente.add(txtEndereco);
		txtEndereco.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Numero");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Verdana", Font.ITALIC, 18));
		lblNewLabel_5.setBounds(416, 95, 104, 26);
		pnlInfoCliente.add(lblNewLabel_5);
		
		txtNumeHome = new JTextField();
		txtNumeHome.setBounds(534, 94, 194, 30);
		pnlInfoCliente.add(txtNumeHome);
		txtNumeHome.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("CEP");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Verdana", Font.ITALIC, 18));
		lblNewLabel_6.setBounds(10, 136, 128, 26);
		pnlInfoCliente.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Cidade");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Verdana", Font.ITALIC, 18));
		lblNewLabel_7.setBounds(10, 177, 128, 29);
		pnlInfoCliente.add(lblNewLabel_7);
		
		txtCidade = new JTextField();
		txtCidade.setBounds(148, 177, 204, 28);
		pnlInfoCliente.add(txtCidade);
		txtCidade.setColumns(10);
		
		txtCep = new JTextField();
		txtCep.setBounds(148, 135, 204, 28);
		pnlInfoCliente.add(txtCep);
		txtCep.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Estado");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Verdana", Font.ITALIC, 18));
		lblNewLabel_8.setBounds(410, 137, 110, 25);
		pnlInfoCliente.add(lblNewLabel_8);
		
		txtEstado = new JTextField();
		txtEstado.setBounds(534, 135, 194, 28);
		pnlInfoCliente.add(txtEstado);
		txtEstado.setColumns(10);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Verdana", Font.ITALIC, 16));
		btnDelete.setBounds(483, 410, 125, 23);
		pnlInfoCliente.add(btnDelete);
		
		JButton btnGravar = new JButton("Gravar");
		
		btnGravar.setFont(new Font("Verdana", Font.ITALIC, 16));
		btnGravar.setBounds(618, 410, 115, 23);
		pnlInfoCliente.add(btnGravar);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 245, 396, 212);
		pnlInfoCliente.add(textArea);
		
		
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				String celular = txtCelular.getText();
				String cpf = txtCpf.getText();
				String email = txtEmail.getText();
				String endereco = txtEndereco.getText();
				String numero = txtNumeHome.getText();
				String cidade = txtCidade.getText();
				String cep = txtCep.getText();
				String estado = txtEstado.getText();
				
				txtNome.setText(""); txtCelular.setText("");txtEmail.setText("");txtEndereco.setText("");txtNumeHome.setText("");txtCidade.setText("");txtCep.setText("");
				txtEstado.setText("");
				
				usuario = new Usuario(nome,celular,cpf,email,endereco,numero,cidade,cep,estado);
				userDao.insert(usuario);
				textArea.append(usuario.getInfo());
				
			}
		});
		
	}
}
