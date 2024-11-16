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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import pousadaYpua.DAO.UsuarioDao;
import pousadaYpua.model.Usuario;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.DefaultComboBoxModel;

public class CadastroFuncionario extends JInternalFrame {

    private static final long serialVersionUID = 1L;
    private JTextField txtName;
    private JTextField txtSenha;
    private JTextField txtId;
    private String nome;
    private String senha;
    private Usuario usuario;
    JComponent contentPane = new JPanel();
    
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
        setBounds(270, 205, 449, 389);
        setClosable(true);
        setMaximizable(true);
        setIconifiable(true);

        contentPane.setBackground(Color.DARK_GRAY);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null); 
        setContentPane(contentPane); 

        JPanel panel = new JPanel();
        panel.setBackground(UIManager.getColor("Button.shadow"));
        panel.setBounds(0, 0, 449, 360); // Dimensão do painel
        panel.setLayout(null);
        contentPane.add(panel); 
        
        
        JLabel lblCadastroFuncionario = new JLabel("Cadastrar Funcionario");
        lblCadastroFuncionario.setHorizontalAlignment(SwingConstants.CENTER);
        lblCadastroFuncionario.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 18));
        lblCadastroFuncionario.setBounds(80, 44, 266, 54);
        panel.add(lblCadastroFuncionario);
        
        JLabel lblNome = new JLabel("Nome: ");
        lblNome.setHorizontalAlignment(SwingConstants.LEFT);
        lblNome.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
        lblNome.setBounds(80, 146, 67, 24);
        panel.add(lblNome);
        
        txtName = new JTextField();
        txtName.setBounds(154, 150, 148, 24);
        panel.add(txtName);
        txtName.setColumns(10);
        
        JLabel lblSenha = new JLabel("Senha: ");
        lblSenha.setHorizontalAlignment(SwingConstants.LEFT);
        lblSenha.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
        lblSenha.setBounds(80, 188, 67, 24);
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
        lblId.setBounds(80, 102, 67, 24);
        panel.add(lblId);
        
        JButton btnCadastrar = new JButton("CADASTRAR");
        btnCadastrar.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
        btnCadastrar.setBackground(new Color(255, 255, 255));
        btnCadastrar.setBounds(239, 302, 139, 29);
        panel.add(btnCadastrar);
        
        JButton btnSair = new JButton("SAIR");
        btnSair.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
        btnSair.setForeground(Color.BLACK);
        btnSair.setBackground(new Color(250, 255, 253));
        btnSair.setBounds(88, 302, 117, 29);
        panel.add(btnSair);
                
        JPanel panel_Fundo = new JPanel();
        panel_Fundo.setBorder(UIManager.getBorder("DesktopIcon.border"));
        panel_Fundo.setBackground(Color.GRAY);
        panel_Fundo.setBounds(0, 0, 446, 360);
        panel.add(panel_Fundo);
        panel_Fundo.setLayout(null);
        
        JComboBox comboBoxAcesso = new JComboBox();
        comboBoxAcesso.setModel(new DefaultComboBoxModel(new String[] {"", "Admin ", "Funcionario"}));
        comboBoxAcesso.setBounds(154, 227, 148, 24);
        panel_Fundo.add(comboBoxAcesso);
        
        JLabel lblAcesso = new JLabel("Acesso:");
        lblAcesso.setHorizontalAlignment(SwingConstants.LEFT);
        lblAcesso.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
        lblAcesso.setBounds(77, 227, 67, 24);
        panel_Fundo.add(lblAcesso);
        
        
        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nome = txtName.getText();
                senha = txtSenha.getText();
                String id = txtId.getText();
                String permissoes = (String) comboBoxAcesso.getSelectedItem();

                if (nome.isEmpty() || senha.isEmpty() || id.isEmpty() || permissoes.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                Usuario u = new Usuario(nome, senha, id, permissoes);

                try {
                    userDao.insert(u);
                    JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    txtName.setText("");
                    txtSenha.setText("");
                    txtId.setText("");
                    comboBoxAcesso.setSelectedIndex(0);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao cadastrar funcionário: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        
        btnSair.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 dispose();			
        	}
        });
    }
}
