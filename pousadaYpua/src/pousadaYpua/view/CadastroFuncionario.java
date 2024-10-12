package pousadaYpua.view;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class CadastroFuncionario extends JInternalFrame {

    private static final long serialVersionUID = 1L;
    private JTextField textField;

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
        setTitle("Cadastro de Funcionário");
        setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 400, 300);
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
        lblCadastroFuncionario.setBounds(82, 22, 224, 32);
        panel.add(lblCadastroFuncionario);
        
        JLabel lblNome = new JLabel("Nome: ");
        lblNome.setHorizontalAlignment(SwingConstants.LEFT);
        lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNome.setBounds(28, 72, 45, 32);
        panel.add(lblNome);
        
        textField = new JTextField();
        textField.setBounds(82, 78, 148, 24);
        panel.add(textField);
        textField.setColumns(10);
    }
}
