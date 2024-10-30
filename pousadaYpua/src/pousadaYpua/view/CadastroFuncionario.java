package pousadaYpua.view;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import pousadaYpua.DAO.UsuarioDao;
import pousadaYpua.model.Usuario;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Color;

public class CadastroFuncionario extends JInternalFrame {

    private static final long serialVersionUID = 1L;
    private JTextField txtName;
    private JTextField txtSenha;
    private JTextField txtId;
    private String nome;
    private String senha;
    
    private Usuario usuario;
    

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	
                    CadastroFuncionario frame = new CadastroFuncionario();
                    frame.setVisible(true);
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public CadastroFuncionario() {
    	UsuarioDao userDao = new UsuarioDao();
    	
        setTitle("Cadastro de Funcionário");
        setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
       
        setBounds(0, 0, 1000, 520);
        
        setClosable(true);
        setResizable(true);
        setMaximizable(true);
        setIconifiable(true);

        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);
        
        JLabel lblCadastroFuncionario = new JLabel("Cadastrar Funcionario");
        lblCadastroFuncionario.setHorizontalAlignment(SwingConstants.CENTER);
        lblCadastroFuncionario.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblCadastroFuncionario.setBounds(387, 98, 224, 32);
        panel.add(lblCadastroFuncionario);
        
        JLabel lblNome = new JLabel("Nome: ");
        lblNome.setHorizontalAlignment(SwingConstants.LEFT);
        lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNome.setBounds(345, 178, 148, 24);
        panel.add(lblNome);
        
        txtName = new JTextField();
        txtName.setBounds(419, 182, 148, 24);
        panel.add(txtName);
        txtName.setColumns(10);
        
        JLabel lblSenha = new JLabel("Senha: ");
        lblSenha.setHorizontalAlignment(SwingConstants.LEFT);
        lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblSenha.setBounds(345, 220, 148, 24);
        panel.add(lblSenha);
        
        txtSenha = new JPasswordField();
        txtSenha.setColumns(10);
        txtSenha.setBounds(419, 221, 148, 24);
        panel.add(txtSenha);
        
        txtId = new JTextField();
        txtId.setColumns(10);
        txtId.setBounds(419, 138, 148, 24);
        panel.add(txtId);
        
        JLabel lblId = new JLabel("ID: ");
        lblId.setHorizontalAlignment(SwingConstants.LEFT);
        lblId.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblId.setBounds(345, 134, 148, 24);
        panel.add(lblId);
        
        JButton btnCadastrar = new JButton("CADASTRAR");
        btnCadastrar.setBackground(new Color(255, 255, 255));
        btnCadastrar.setBounds(504, 281, 117, 29);
        panel.add(btnCadastrar);
        
        JButton btnSair = new JButton("SAIR");
        btnSair.setForeground(Color.BLACK);
        btnSair.setBackground(new Color(250, 255, 253));
        btnSair.setBounds(353, 281, 117, 29);
        panel.add(btnSair);
        
        btnCadastrar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		nome = txtName.getText();
        		senha = txtSenha.getText();
        		String id = txtId.getText();
        		
        		txtName.setText("");
        		txtSenha.setText("");
        		txtId.setText("");
        		
        		
        		 usuario = new Usuario(nome, senha, id);
        		 userDao.insert(usuario);
        		
        	}
        });
        
        btnSair.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
			
        	}
        });
     
    }
}
