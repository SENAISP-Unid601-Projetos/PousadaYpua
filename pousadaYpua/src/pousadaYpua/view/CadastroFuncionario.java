package pousadaYpua.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import pousadaYpua.DAO.UsuarioDao;
import pousadaYpua.model.Usuario;
import javax.swing.border.LineBorder;

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
    	setBorder(UIManager.getBorder("DesktopIcon.border"));
    	UsuarioDao userDao = new UsuarioDao();
    	
        setTitle("Cadastro de Funcionário");
        setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
       
        setBounds(270,205, 449, 389);
        
        setClosable(true);
        setMaximizable(true);
        setIconifiable(true);

        JPanel panel = new JPanel();
        panel.setBackground(UIManager.getColor("Button.shadow"));
        getContentPane().add(panel);
        panel.setLayout(null);
        
        JLabel lblCadastroFuncionario = new JLabel("Cadastrar Funcionario");
        lblCadastroFuncionario.setHorizontalAlignment(SwingConstants.CENTER);
        lblCadastroFuncionario.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 18));
        lblCadastroFuncionario.setBounds(80, 44, 266, 54);
        panel.add(lblCadastroFuncionario);
        
        JLabel lblNome = new JLabel("Nome: ");
        lblNome.setHorizontalAlignment(SwingConstants.LEFT);
        lblNome.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
        lblNome.setBounds(80, 146, 148, 24);
        panel.add(lblNome);
        
        txtName = new JTextField();
        txtName.setBounds(154, 150, 148, 24);
        panel.add(txtName);
        txtName.setColumns(10);
        
        JLabel lblSenha = new JLabel("Senha: ");
        lblSenha.setHorizontalAlignment(SwingConstants.LEFT);
        lblSenha.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
        lblSenha.setBounds(80, 188, 148, 24);
        panel.add(lblSenha);
        
        txtSenha = new JPasswordField();
        txtSenha.setColumns(10);
        txtSenha.setBounds(154, 189, 148, 24);
        panel.add(txtSenha);
        
        txtId = new JTextField();
        txtId.setColumns(10);
        txtId.setBounds(154, 106, 148, 24);
        panel.add(txtId);
        
        JLabel lblId = new JLabel("ID: ");
        lblId.setHorizontalAlignment(SwingConstants.LEFT);
        lblId.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
        lblId.setBounds(80, 102, 148, 24);
        panel.add(lblId);
        
        JButton btnCadastrar = new JButton("CADASTRAR");
        btnCadastrar.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
        btnCadastrar.setBackground(new Color(255, 255, 255));
        btnCadastrar.setBounds(239, 249, 139, 29);
        panel.add(btnCadastrar);
        
        JButton btnSair = new JButton("SAIR");
        btnSair.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
        btnSair.setForeground(Color.BLACK);
        btnSair.setBackground(new Color(250, 255, 253));
        btnSair.setBounds(88, 249, 117, 29);
        panel.add(btnSair);
                
        JPanel panel_Fundo = new JPanel();
        panel_Fundo.setBorder(UIManager.getBorder("DesktopIcon.border"));
        panel_Fundo.setBackground(UIManager.getColor("Button.disabledForeground"));
        panel_Fundo.setBounds(0, 0, 446, 360);
        panel.add(panel_Fundo);
        
        
        btnCadastrar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		nome = txtName.getText();
        		senha = txtSenha.getText();
        		String id = txtId.getText();
        		String permissoes = null;
        		txtName.setText("");
        		txtSenha.setText("");
        		txtId.setText("");
        		
        		
        		 usuario = new Usuario(nome, senha, id, permissoes);
        		 userDao.insert(usuario);
        		
        	}
        });
        
        btnSair.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
			
        	}
        });
    }
}
