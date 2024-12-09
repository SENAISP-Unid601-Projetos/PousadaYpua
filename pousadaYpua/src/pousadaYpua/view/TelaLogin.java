package pousadaYpua.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import pousadaYpua.DAO.UsuarioDao;
import pousadaYpua.model.Usuario;
import pousadaYpua.utils.Path;

public class TelaLogin extends JDialog {

    private static final long serialVersionUID = 1L;
    private final JPanel contentPanel = new JPanel();
    private JTextField textFieldUsuario;
    private JPasswordField passwordFieldSenha;
    private boolean loginSuccessful = false;
    private UsuarioDao userDao;
    private Usuario usuario;

    public static void main(String[] args) {
        try {
            TelaLogin dialog = new TelaLogin();
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
           
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public TelaLogin() {
    	userDao = new UsuarioDao();
    	
        setTitle("Login - Pousada Ypuã");
        
        
        
        setBounds(100, 100, 450, 300);
        setModal(true); // Bloqueia a interação com outras janelas até que este diálogo seja fechado
        setLocationRelativeTo(null);
        getContentPane().setLayout(new BorderLayout());

        contentPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);

        JLabel lblUsuario = new JLabel("Usuário:");
        lblUsuario.setBounds(30, 30, 80, 25);
        contentPanel.add(lblUsuario);

        textFieldUsuario = new JTextField();
        textFieldUsuario.setBounds(120, 30, 250, 25);
        contentPanel.add(textFieldUsuario);
        textFieldUsuario.setColumns(10);

        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setBounds(30, 80, 80, 25);
        contentPanel.add(lblSenha);

        passwordFieldSenha = new JPasswordField();
        passwordFieldSenha.setBounds(120, 80, 250, 25);
        contentPanel.add(passwordFieldSenha);

        JPanel buttonPane = new JPanel();
        buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
        getContentPane().add(buttonPane, BorderLayout.SOUTH);

        JButton okButton = new JButton("Entrar");
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                validarLogin();
//            	 String rootPath = new File("").getAbsolutePath();
//                 System.out.println(Path.getPathBanco() +"\n"+ Path.getPathResources());
            }
        });
        okButton.setActionCommand("OK");
        buttonPane.add(okButton);
        getRootPane().setDefaultButton(okButton);

        JButton cancelButton = new JButton("Cancelar");
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loginSuccessful = false; 
                dispose(); 
            }
        });
        cancelButton.setActionCommand("Cancel");
        buttonPane.add(cancelButton);
    }

    private void validarLogin() {
        String id = textFieldUsuario.getText();
        String senha = new String(passwordFieldSenha.getPassword());
        
        usuario = userDao.buscarFuncionario(id);
        
        
        System.out.println(usuario.getNome()
        		+ usuario.getSenha());
        System.out.println(usuario.getSenha());
        

        if (id.equals(usuario.getId()) && senha.equals(usuario.getSenha())) {
            JOptionPane.showMessageDialog(this, "Login bem-sucedido!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            loginSuccessful = true;
            dispose(); 
        } else {
            JOptionPane.showMessageDialog(this, "Usuário ou senha incorretos.", "Erro", JOptionPane.ERROR_MESSAGE);
            loginSuccessful = false;
        }
    }

    public boolean isLoginSuccessful() {
        return loginSuccessful;
    }
}
