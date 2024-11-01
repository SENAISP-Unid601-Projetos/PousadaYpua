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
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JTextField;

public class QuartosReservados extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtConheaNossas;

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
		getContentPane().setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		setBackground(SystemColor.scrollbar);
		getContentPane().setBackground(new Color(46, 139, 87));
		setBorder(UIManager.getBorder("DesktopIcon.border"));
        setClosable(true);
        setResizable(true);
        setMaximizable(true);
        setIconifiable(true);
		setBounds(0, 0, 1125, 675);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 205, 170));
		panel.setBounds(21, 163, 420, 227);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(47, 79, 79));
		panel_1.setBounds(0, 0, 21, 227);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Quarto Suite");
		lblNewLabel.setBackground(SystemColor.controlHighlight);
		lblNewLabel.setForeground(SystemColor.windowText);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(31, 10, 278, 31);
		panel.add(lblNewLabel);
		
		JButton btnInformacao = new JButton("Informações");
		btnInformacao.setBackground(new Color(46, 139, 87));
		
		btnInformacao.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		btnInformacao.setBounds(275, 194, 135, 23);
		panel.add(btnInformacao);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\nicol\\OneDrive\\Desktop\\PousadaYpua\\pousadaYpua\\resources\\suite.jpg"));
		lblNewLabel_9.setBounds(31, 29, 270, 188);
		panel.add(lblNewLabel_9);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(102, 205, 170));
		panel_2.setBounds(21, 408, 420, 227);
		getContentPane().add(panel_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(47, 79, 79));
		panel_1_1.setBounds(0, 0, 21, 227);
		panel_2.add(panel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Quarto Cabana");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setBounds(31, 10, 278, 31);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\nicol\\OneDrive\\Desktop\\PousadaYpua\\pousadaYpua\\resources\\cabana.jpg"));
		lblNewLabel_10.setBounds(31, 32, 285, 185);
		panel_2.add(lblNewLabel_10);
		
		JButton btnInformacao_1_3 = new JButton("Informações");
		btnInformacao_1_3.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		btnInformacao_1_3.setBackground(new Color(46, 139, 87));
		btnInformacao_1_3.setBounds(275, 194, 135, 23);
		panel_2.add(btnInformacao_1_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(102, 205, 170));
		panel_4.setBounds(451, 163, 420, 227);
		getContentPane().add(panel_4);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBackground(new Color(47, 79, 79));
		panel_1_3.setBounds(0, 0, 21, 227);
		panel_4.add(panel_1_3);
		
		JLabel lblNewLabel_3 = new JLabel("Chalé Familia");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_3.setBounds(31, 10, 278, 31);
		panel_4.add(lblNewLabel_3);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\nicol\\OneDrive\\Desktop\\PousadaYpua\\pousadaYpua\\resources\\chaleFamilia.jpg"));
		lblNewLabel_11.setBounds(32, 33, 240, 184);
		panel_4.add(lblNewLabel_11);
		
		JButton btnInformacao_1 = new JButton("Informações");
		btnInformacao_1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		btnInformacao_1.setBackground(new Color(46, 139, 87));
		btnInformacao_1.setBounds(275, 194, 135, 23);
		panel_4.add(btnInformacao_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(new Color(102, 205, 170));
		panel_5.setBounds(451, 408, 420, 227);
		getContentPane().add(panel_5);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setBackground(new Color(47, 79, 79));
		panel_1_4.setBounds(0, 0, 21, 227);
		panel_5.add(panel_1_4);
		
		JLabel lblNewLabel_4 = new JLabel("Quarto Domo");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_4.setBounds(31, 10, 278, 31);
		panel_5.add(lblNewLabel_4);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon("C:\\Users\\nicol\\OneDrive\\Desktop\\PousadaYpua\\pousadaYpua\\resources\\quartoDomo.jpeg"));
		lblNewLabel_12.setBounds(31, 26, 270, 191);
		panel_5.add(lblNewLabel_12);
		
		JButton btnInformacao_1_2 = new JButton("Informações");
		btnInformacao_1_2.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		btnInformacao_1_2.setBackground(new Color(46, 139, 87));
		btnInformacao_1_2.setBounds(275, 194, 135, 23);
		panel_5.add(btnInformacao_1_2);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBackground(new Color(102, 205, 170));
		panel_7.setBounds(880, 163, 229, 227);
		getContentPane().add(panel_7);
		
		JPanel panel_1_6 = new JPanel();
		panel_1_6.setBackground(new Color(47, 79, 79));
		panel_1_6.setBounds(0, 0, 21, 226);
		panel_7.add(panel_1_6);
		
		JLabel lblNewLabel_6 = new JLabel("Estacionamento");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_6.setBounds(22, 10, 197, 31);
		panel_7.add(lblNewLabel_6);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\nicol\\OneDrive\\Desktop\\PousadaYpua\\pousadaYpua\\resources\\estacionamento.jpg"));
		lblNewLabel_2.setBounds(31, 43, 188, 146);
		panel_7.add(lblNewLabel_2);
		
		JButton btnInformacao_1_1 = new JButton("Informações");
		btnInformacao_1_1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		btnInformacao_1_1.setBackground(new Color(46, 139, 87));
		btnInformacao_1_1.setBounds(57, 194, 135, 23);
		panel_7.add(btnInformacao_1_1);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\nicol\\OneDrive\\Desktop\\PousadaYpua\\pousadaYpua\\resources\\imagemRe.png"));
		lblNewLabel_5.setBounds(239, 10, 870, 103);
		getContentPane().add(lblNewLabel_5);
		
		txtConheaNossas = new JTextField();
		txtConheaNossas.setEnabled(false);
		txtConheaNossas.setHorizontalAlignment(SwingConstants.TRAILING);
		txtConheaNossas.setEditable(false);
		txtConheaNossas.setText("Nossas acomodações ");
		txtConheaNossas.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 16));
		txtConheaNossas.setBackground(new Color(102, 205, 170));
		txtConheaNossas.setBounds(21, 10, 220, 103);
		getContentPane().add(txtConheaNossas);
		txtConheaNossas.setColumns(10);

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
