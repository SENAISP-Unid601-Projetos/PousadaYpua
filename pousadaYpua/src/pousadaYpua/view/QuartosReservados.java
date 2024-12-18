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

import pousadaYpua.utils.Path;

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
import javax.swing.JTextPane;

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
		super("Reserva de Quartos");
		getContentPane().setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		setBackground(SystemColor.scrollbar);
		getContentPane().setBackground(Color.GRAY);
//		setBorder(UIManager.getBorder("DesktopIcon.border"));
        setClosable(true);
        setResizable(true);
        setMaximizable(true);
        setIconifiable(true);
		setBounds(0, 0, 1125, 675);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(21, 163, 375, 227);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(Path.getPathBanco() + "/QuartoSuite.jpg"));
		lblNewLabel_9.setBounds(41, 41, 240, 147);
		panel.add(lblNewLabel_9);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(0, 0, 21, 227);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Quarto Suite");
		lblNewLabel.setBackground(SystemColor.controlHighlight);
		lblNewLabel.setForeground(SystemColor.windowText);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(31, 0, 278, 31);
		panel.add(lblNewLabel);
		
		JButton btnInformacao = new JButton("Informações");
		btnInformacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnInformacao.setBackground(Color.LIGHT_GRAY);
		
		btnInformacao.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		btnInformacao.setBounds(230, 194, 135, 23);
		panel.add(btnInformacao);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(21, 408, 375, 227);
		getContentPane().add(panel_2);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon(Path.getPathBanco() + "/QuartoCabana.jpg"));
		lblNewLabel_10.setBounds(43, 37, 240, 147);
		panel_2.add(lblNewLabel_10);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setForeground(Color.DARK_GRAY);
		panel_1_1.setBackground(Color.DARK_GRAY);
		panel_1_1.setBounds(0, 0, 21, 227);
		panel_2.add(panel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Quarto Cabana");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setBounds(33, 0, 278, 31);
		panel_2.add(lblNewLabel_1);
		
		JButton btnInformacao_1_3 = new JButton("Informações");
		btnInformacao_1_3.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		btnInformacao_1_3.setBackground(Color.LIGHT_GRAY);
		btnInformacao_1_3.setBounds(230, 194, 135, 23);
		panel_2.add(btnInformacao_1_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.LIGHT_GRAY);
		panel_4.setBounds(406, 163, 351, 227);
		getContentPane().add(panel_4);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon(Path.getPathBanco() + "/QuartoFamilia.jpg"));
		lblNewLabel_11.setBounds(55, 38, 240, 147);
		panel_4.add(lblNewLabel_11);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setForeground(Color.DARK_GRAY);
		panel_1_3.setBackground(Color.DARK_GRAY);
		panel_1_3.setBounds(0, 0, 21, 227);
		panel_4.add(panel_1_3);
		
		JLabel lblNewLabel_3 = new JLabel("Chalé Familia");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_3.setBounds(31, 0, 278, 31);
		panel_4.add(lblNewLabel_3);
		
		JButton btnInformacao_1 = new JButton("Informações");
		btnInformacao_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnInformacao_1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		btnInformacao_1.setBackground(Color.LIGHT_GRAY);
		btnInformacao_1.setBounds(206, 193, 135, 24);
		panel_4.add(btnInformacao_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(Color.LIGHT_GRAY);
		panel_5.setBounds(406, 408, 351, 227);
		getContentPane().add(panel_5);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon(Path.getPathBanco() + "/quartoDomo.jpeg"));
		lblNewLabel_12.setBounds(31, 27, 246, 157);
		panel_5.add(lblNewLabel_12);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setForeground(Color.DARK_GRAY);
		panel_1_4.setBackground(Color.DARK_GRAY);
		panel_1_4.setBounds(0, 0, 21, 227);
		panel_5.add(panel_1_4);
		
		JLabel lblNewLabel_4 = new JLabel("Quarto Domo");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_4.setBounds(31, 0, 278, 31);
		panel_5.add(lblNewLabel_4);
		
		JButton btnInformacao_1_2 = new JButton("Informações");
		btnInformacao_1_2.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		btnInformacao_1_2.setBackground(Color.LIGHT_GRAY);
		btnInformacao_1_2.setBounds(150, 194, 135, 23);
		panel_5.add(btnInformacao_1_2);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBackground(Color.LIGHT_GRAY);
		panel_7.setBounds(767, 163, 297, 227);
		getContentPane().add(panel_7);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Path.getPathBanco() + "/estacionamento.jpg"));
		lblNewLabel_2.setBounds(28, 40, 240, 147);
		panel_7.add(lblNewLabel_2);
		
		JPanel panel_1_6 = new JPanel();
		panel_1_6.setForeground(Color.DARK_GRAY);
		panel_1_6.setBackground(Color.DARK_GRAY);
		panel_1_6.setBounds(0, 0, 21, 226);
		panel_7.add(panel_1_6);
		
		JLabel lblNewLabel_6 = new JLabel("Estacionamento");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_6.setBounds(31, 0, 197, 31);
		panel_7.add(lblNewLabel_6);
		
		JButton btnInformacao_1_1 = new JButton("Informações");
		btnInformacao_1_1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		btnInformacao_1_1.setBackground(Color.LIGHT_GRAY);
		btnInformacao_1_1.setBounds(57, 194, 135, 23);
		panel_7.add(btnInformacao_1_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(Color.LIGHT_GRAY);
		panel_1_2.setBounds(10, 10, 82, 103);
		getContentPane().add(panel_1_2);
		
		JLabel lblNewLabel_7 = new JLabel("");
		panel_1_2.add(lblNewLabel_7);
		lblNewLabel_7.setIcon(new ImageIcon(Path.getPathBanco() + "/logo-pousada.png"));
		
		JTextPane txtpnNossasAcomodaoes = new JTextPane();
		txtpnNossasAcomodaoes.setForeground(Color.LIGHT_GRAY);
		txtpnNossasAcomodaoes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnNossasAcomodaoes.setText("Nossas Acomododações");
		txtpnNossasAcomodaoes.setBackground(Color.DARK_GRAY);
		txtpnNossasAcomodaoes.setBounds(92, 10, 159, 103);
		getContentPane().add(txtpnNossasAcomodaoes);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(Color.DARK_GRAY);
		textPane.setBounds(249, 10, 860, 103);
		getContentPane().add(textPane);
		
		
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
