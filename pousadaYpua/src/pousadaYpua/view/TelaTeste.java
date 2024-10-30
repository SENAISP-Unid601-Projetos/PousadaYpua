package pousadaYpua.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TelaTeste {

	private JFrame frame;
	private JDesktopPane desktopPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaTeste window = new TelaTeste();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaTeste() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 913, 776);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmTelaInterna = new JMenuItem("Tela interna");
		mntmTelaInterna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 TelaInterna tela = new TelaInterna();
	                desktopPane.add(tela);
	                tela.setVisible(true);
	                
	                // Desabilitando os menus enquanto a tela interna estiver aberta
//	                setMenuEnabled(false);

	                // Listener para reabilitar o menu quando o JInternalFrame for fechado
	               tela.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	                    @Override
	                    public void internalFrameClosed(javax.swing.event.InternalFrameEvent e) {
//	                        setMenuEnabled(true);
	                    }
			
		});
		mnNewMenu.add(mntmTelaInterna);
	}
	});
	}
}
