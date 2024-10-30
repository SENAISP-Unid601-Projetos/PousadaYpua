package pousadaYpua.view;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Tela {

    private JFrame frame;
    private JDesktopPane desktopPane;
    private JMenuBar menuBar; // Precisamos de referência ao menuBar para desabilitar
    private JMenu mnNewMenu;
    private JMenu mnFuncionario;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Tela window = new Tela();
                    window.frame.setVisible(true);
                    window.frame.setLocationRelativeTo(null);
                    window.frame.setExtendedState(Frame.MAXIMIZED_BOTH);
                   
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public Tela() {
        initialize();
    }

    /**
     * 
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 1920, 1080);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        desktopPane = new JDesktopPane();
        frame.setContentPane(desktopPane);
        
        menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        
       
        
        mnFuncionario = new JMenu("Cadastros");
        menuBar.add(mnFuncionario);
        
        JMenuItem mntmCadastrarFuncionario = new JMenuItem("Cadastrar Funcionario");
        mntmCadastrarFuncionario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CadastroFuncionario cadastroFuncionario = new CadastroFuncionario();
                desktopPane.add(cadastroFuncionario);
                cadastroFuncionario.setVisible(true);
                
                // Desabilitando os menus enquanto a tela interna estiver aberta
                setMenuEnabled(false);

                // Listener para reabilitar o menu quando o JInternalFrame for fechado
                cadastroFuncionario.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
                    @Override
                    public void internalFrameClosed(javax.swing.event.InternalFrameEvent e) {
                        setMenuEnabled(true);
                    }
                });
            }
        });
        mnFuncionario.add(mntmCadastrarFuncionario);
        
        
        JMenuItem mntmCadastrarClientes = new JMenuItem("Cadastrar Clientes");
        mntmCadastrarClientes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CadastroCliente telaCadastroCliente = new CadastroCliente();
                desktopPane.add(telaCadastroCliente);
                telaCadastroCliente.setVisible(true);
                
                // Desabilitando os menus enquanto a tela interna estiver aberta
                setMenuEnabled(false);

                // Listener para reabilitar o menu quando o JInternalFrame for fechado
                telaCadastroCliente.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
                    @Override
                    public void internalFrameClosed(javax.swing.event.InternalFrameEvent e) {
                        setMenuEnabled(true);
                    }
                });
            }
        });
        mnFuncionario.add(mntmCadastrarClientes);
        
        mnNewMenu = new JMenu("Quartos");
        menuBar.add(mnNewMenu);
        
        JMenuItem mntmReservarQuarto = new JMenuItem("Reserva de Quarto");
        mntmReservarQuarto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReservaQuarto reserva = new ReservaQuarto();
                desktopPane.add(reserva);
                reserva.setVisible(true);
                
                // Desabilitando os menus enquanto a tela interna estiver aberta
                setMenuEnabled(false);

                // Listener para reabilitar o menu quando o JInternalFrame for fechado
                reserva.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
                    @Override
                    public void internalFrameClosed(javax.swing.event.InternalFrameEvent e) {
                        setMenuEnabled(true);
                    }
                });
            }
        });
        mnNewMenu.add(mntmReservarQuarto);
        
        JMenuItem mntmQuartosReservados = new JMenuItem("Quartos Reservados");
        mntmQuartosReservados.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                QuartosReservados quartoReservado = new QuartosReservados();
                desktopPane.add(quartoReservado);
                quartoReservado.setVisible(true);
                
                // Desabilitando os menus enquanto a tela interna estiver aberta
                setMenuEnabled(false);

                // Listener para reabilitar o menu quando o JInternalFrame for fechado
                quartoReservado.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
                    @Override
                    public void internalFrameClosed(javax.swing.event.InternalFrameEvent e) {
                        setMenuEnabled(true);
                    }
                });
            }
        });
        mnNewMenu.add(mntmQuartosReservados);
        
    }
    
    // Método para habilitar ou desabilitar os menus
    private void setMenuEnabled(boolean enabled) {
        menuBar.setEnabled(enabled); // Desabilita o JMenuBar
        for (Component component : menuBar.getComponents()) {
            component.setEnabled(enabled); // Desabilita cada componente (como JMenu) dentro do JMenuBar
        }
    }
}
