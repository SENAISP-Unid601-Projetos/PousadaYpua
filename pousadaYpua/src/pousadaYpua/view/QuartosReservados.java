package pousadaYpua.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTable;
import java.awt.BorderLayout;

public class QuartosReservados extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuartosReservados frame = new QuartosReservados();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QuartosReservados() {
        setClosable(true);
        setResizable(true);
        setMaximizable(true);
        setIconifiable(true);
		setBounds(0, 0, 1125, 675);
		
		table = new JTable();
		getContentPane().add(table, BorderLayout.NORTH);

	}

}
