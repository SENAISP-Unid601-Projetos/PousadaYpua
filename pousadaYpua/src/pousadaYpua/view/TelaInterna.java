package pousadaYpua.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;

public class TelaInterna extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtOiiiiiiiiiiiiiiiiiiiiii;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInterna frame = new TelaInterna();
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
	public TelaInterna() {
		setResizable(true);
		setMaximizable(true);
		setClosable(true);
		setBounds(100, 100, 450, 300);
		
		JButton btnNewButton = new JButton("New button");
		getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		txtOiiiiiiiiiiiiiiiiiiiiii = new JTextField();
		txtOiiiiiiiiiiiiiiiiiiiiii.setText("OIIIIIIIIIIIIIIIIIIIIII");
		getContentPane().add(txtOiiiiiiiiiiiiiiiiiiiiii, BorderLayout.NORTH);
		txtOiiiiiiiiiiiiiiiiiiiiii.setColumns(10);

	}

}
