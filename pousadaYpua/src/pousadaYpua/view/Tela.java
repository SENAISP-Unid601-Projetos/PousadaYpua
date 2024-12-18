package pousadaYpua.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

import pousadaYpua.model.Gerenciador;
import pousadaYpua.utils.Path;
import pousadaYpua.utils.Resolucao;

public class Tela {
    private JFrame frame;
    private JDesktopPane desktopPane;
    private JMenuBar menuBar; // Precisamos de referência ao menuBar para desabilitar
    private JMenu mnNewMenu;
    private JMenu mnFuncionario;
    private JTextArea textArea;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;
    private JLabel lblNewLabel_3;
    private Gerenciador gerenciador;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            TelaLogin telaLogin = new TelaLogin();
            telaLogin.setVisible(true);

            if (telaLogin.isLoginSuccessful()) {
                Tela tela = new Tela();
                tela.frame.setVisible(true);
                tela.frame.setLocationRelativeTo(null);
                tela.frame.setExtendedState(Frame.MAXIMIZED_BOTH);
                System.out.println(Path.getPathResources());
            } else {
                System.exit(0);
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
    	
    
        frame = new JFrame("Pousada Ypuã");
        frame.setBounds(100, 100, 1280,1024 );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Carregar a imagem do ícone
        Image icon = Toolkit.getDefaultToolkit().getImage(Path.getPathResources()+"\\logo-pousada.png");
        frame.setIconImage(icon);

        frame.setVisible(true);
        
        desktopPane = new JDesktopPane();
        frame.setContentPane(desktopPane);
        
        lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(Path.getPathResources()+"\\imagemPousada.jpg"));
        lblNewLabel.setBounds(0, 0, 744, 355);
        desktopPane.add(lblNewLabel);
        
        lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon(Path.getPathResources()+"\\pousada2.jpg"));
        lblNewLabel_1.setBounds(0, 355, 744, 468);
        desktopPane.add(lblNewLabel_1);
        
        lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon(Path.getPathResources()+"\\PousadaYpua.jpg"));
        lblNewLabel_2.setBounds(745, 0, 795, 355);
        desktopPane.add(lblNewLabel_2);
        
        lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setIcon(new ImageIcon(Path.getPathResources()+"\\pousada1.jpg"));
        lblNewLabel_3.setBounds(743, 355, 787, 468);
        desktopPane.add(lblNewLabel_3);
        
        int largura = Resolucao.getLargura();
        int altura = Resolucao.getAltura();
        
        textArea = new JTextArea();
        textArea.setBackground(new Color(99, 99, 99));
        textArea.setBounds(0, 0, largura, altura);
        desktopPane.add(textArea);
        
       
        menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        
       
        
        mnFuncionario = new JMenu("Cadastros");
        menuBar.add(mnFuncionario);
        
        JMenuItem mntmCadastrarFuncionario = new JMenuItem("Cadastrar Funcionario");
        mntmCadastrarFuncionario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CadastroFuncionario cadastroFuncionario = new CadastroFuncionario(desktopPane);
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
                CadastroCliente telaCadastroCliente = new CadastroCliente(desktopPane);
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
        
        JMenuItem mntmBuscarReservas = new JMenuItem("Buscar Reservas");
        mntmBuscarReservas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BuscarReservas buscarReservas = new BuscarReservas(desktopPane);
                desktopPane.add(buscarReservas);
                buscarReservas.setVisible(true);
                
                // Desabilitando os menus enquanto a tela interna estiver aberta
                setMenuEnabled(false);

                // Listener para reabilitar o menu quando o JInternalFrame for fechado
                buscarReservas.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
                    @Override
                    public void internalFrameClosed(javax.swing.event.InternalFrameEvent e) {
                        setMenuEnabled(true);
                    }
                });
            }
        });
        mnNewMenu.add(mntmBuscarReservas);
        
        
       
        
    }
    
    // Método para habilitar ou desabilitar os menus
    private void setMenuEnabled(boolean enabled) {
        menuBar.setEnabled(enabled); // Desabilita o JMenuBar
        for (Component component : menuBar.getComponents()) {
            component.setEnabled(enabled); // Desabilita cada componente (como JMenu) dentro do JMenuBar
        }
    }
}
