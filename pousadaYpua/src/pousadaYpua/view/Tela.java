package pousadaYpua.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Tela {

    private JFrame frame;
    private JDesktopPane desktopPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Tela window = new Tela();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Tela() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 1141, 736);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        desktopPane = new JDesktopPane();
        frame.setContentPane(desktopPane);
        
        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        
        JMenu mnNewMenu = new JMenu("Quartos");
        menuBar.add(mnNewMenu);
        
        JMenuItem mntmNewMenuItem = new JMenuItem("Usuario");
        mntmNewMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaInterna tela = new TelaInterna();
                desktopPane.add(tela);
                tela.setVisible(true);
            }
        });
        mnNewMenu.add(mntmNewMenuItem);
        
        JMenu mnFuncionario = new JMenu("Funcionario");
        menuBar.add(mnFuncionario);
        
        JMenuItem mntmCadastrarFuncionario = new JMenuItem("Cadastrar Funcionario");
        mntmCadastrarFuncionario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CadastroFuncionario cadastroFuncionario = new CadastroFuncionario();
                desktopPane.add(cadastroFuncionario);
                cadastroFuncionario.setVisible(true);
            }
        });
        mnFuncionario.add(mntmCadastrarFuncionario);
    }
}

