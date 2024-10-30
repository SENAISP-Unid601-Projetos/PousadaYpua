package pousadaYpua.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.JDesktopPane;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;

public class QuartosReservados extends JInternalFrame {

	private static final long serialVersionUID = 1L;

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
		setBorder(UIManager.getBorder("DesktopIcon.border"));
        setClosable(true);
        setResizable(true);
        setMaximizable(true);
        setIconifiable(true);
		setBounds(0, 0, 1125, 675);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(177, 48, 300, 145);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 0, 0));
		panel_1.setBounds(0, 0, 21, 145);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Quarto 1");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel.setBounds(22, 0, 278, 31);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Informações");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 9));
		btnNewButton.setBounds(191, 111, 99, 23);
		panel.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(177, 230, 300, 145);
		getContentPane().add(panel_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.RED);
		panel_1_1.setBounds(0, 0, 21, 145);
		panel_2.add(panel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Quarto 1");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_1.setBounds(22, 0, 278, 31);
		panel_2.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Informações");
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 9));
		btnNewButton_1.setBounds(191, 111, 99, 23);
		panel_2.add(btnNewButton_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(177, 408, 300, 145);
		getContentPane().add(panel_3);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(Color.RED);
		panel_1_2.setBounds(0, 0, 21, 145);
		panel_3.add(panel_1_2);
		
		JLabel lblNewLabel_2 = new JLabel("Quarto 1");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_2.setBounds(22, 0, 278, 31);
		panel_3.add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("Informações");
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 9));
		btnNewButton_2.setBounds(191, 111, 99, 23);
		panel_3.add(btnNewButton_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(499, 48, 300, 145);
		getContentPane().add(panel_4);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBackground(Color.RED);
		panel_1_3.setBounds(0, 0, 21, 145);
		panel_4.add(panel_1_3);
		
		JLabel lblNewLabel_3 = new JLabel("Quarto 1");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_3.setBounds(22, 0, 278, 31);
		panel_4.add(lblNewLabel_3);
		
		JButton btnNewButton_3 = new JButton("Informações");
		btnNewButton_3.setFont(new Font("Arial", Font.BOLD, 9));
		btnNewButton_3.setBounds(191, 111, 99, 23);
		panel_4.add(btnNewButton_3);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(499, 230, 300, 145);
		getContentPane().add(panel_5);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setBackground(Color.RED);
		panel_1_4.setBounds(0, 0, 21, 145);
		panel_5.add(panel_1_4);
		
		JLabel lblNewLabel_4 = new JLabel("Quarto 1");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_4.setBounds(22, 0, 278, 31);
		panel_5.add(lblNewLabel_4);
		
		JButton btnNewButton_4 = new JButton("Informações");
		btnNewButton_4.setFont(new Font("Arial", Font.BOLD, 9));
		btnNewButton_4.setBounds(191, 111, 99, 23);
		panel_5.add(btnNewButton_4);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(499, 408, 300, 145);
		getContentPane().add(panel_6);
		
		JPanel panel_1_5 = new JPanel();
		panel_1_5.setBackground(Color.RED);
		panel_1_5.setBounds(0, 0, 21, 145);
		panel_6.add(panel_1_5);
		
		JLabel lblNewLabel_5 = new JLabel("Quarto 1");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_5.setBounds(22, 0, 278, 31);
		panel_6.add(lblNewLabel_5);
		
		JButton btnNewButton_5 = new JButton("Informações");
		btnNewButton_5.setFont(new Font("Arial", Font.BOLD, 9));
		btnNewButton_5.setBounds(191, 111, 99, 23);
		panel_6.add(btnNewButton_5);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(819, 48, 300, 145);
		getContentPane().add(panel_7);
		
		JPanel panel_1_6 = new JPanel();
		panel_1_6.setBackground(Color.RED);
		panel_1_6.setBounds(0, 0, 21, 145);
		panel_7.add(panel_1_6);
		
		JLabel lblNewLabel_6 = new JLabel("Quarto 1");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_6.setBounds(22, 0, 278, 31);
		panel_7.add(lblNewLabel_6);
		
		JButton btnNewButton_6 = new JButton("Informações");
		btnNewButton_6.setFont(new Font("Arial", Font.BOLD, 9));
		btnNewButton_6.setBounds(191, 111, 99, 23);
		panel_7.add(btnNewButton_6);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(819, 230, 300, 145);
		getContentPane().add(panel_8);
		
		JPanel panel_1_7 = new JPanel();
		panel_1_7.setBackground(Color.RED);
		panel_1_7.setBounds(0, 0, 21, 145);
		panel_8.add(panel_1_7);
		
		JLabel lblNewLabel_7 = new JLabel("Quarto 1");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_7.setBounds(22, 0, 278, 31);
		panel_8.add(lblNewLabel_7);
		
		JButton btnNewButton_7 = new JButton("Informações");
		btnNewButton_7.setFont(new Font("Arial", Font.BOLD, 9));
		btnNewButton_7.setBounds(191, 111, 99, 23);
		panel_8.add(btnNewButton_7);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(819, 408, 300, 145);
		getContentPane().add(panel_9);
		
		JPanel panel_1_8 = new JPanel();
		panel_1_8.setBackground(Color.RED);
		panel_1_8.setBounds(0, 0, 21, 145);
		panel_9.add(panel_1_8);
		
		JLabel lblNewLabel_8 = new JLabel("Quarto 1");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_8.setBounds(22, 0, 278, 31);
		panel_9.add(lblNewLabel_8);
		
		JButton btnNewButton_8 = new JButton("Informações");
		btnNewButton_8.setFont(new Font("Arial", Font.BOLD, 9));
		btnNewButton_8.setBounds(191, 111, 99, 23);
		panel_9.add(btnNewButton_8);

	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
