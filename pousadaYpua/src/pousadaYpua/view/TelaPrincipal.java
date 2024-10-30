package pousadaYpua.view;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import pousadaYpua.model.Quarto;

public class TelaPrincipal extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	Quarto quarto;
	private JDesktopPane desktopPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		desktopPane = new JDesktopPane();
       
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setBounds(0, 0, 1125, 675);
	    JComponent contentPane = new JPanel();
	    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(234, 234, 234));
		setClosable(true);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Canvas canvas_3_2_1 = new Canvas();
		canvas_3_2_1.setBackground(new Color(0, 210, 0));
		canvas_3_2_1.setBounds(333, 206, 17, 107);
		contentPane.add(canvas_3_2_1);
		
		Canvas canvas = new Canvas();
		canvas.setBounds(0, 0, 100, 709);
		canvas.setBackground(new Color(177, 177, 177));
		contentPane.add(canvas);
		
		JLabel lblReservas = new JLabel("Reservas");
		lblReservas.setBounds(106, 0, 229, 63);
		lblReservas.setFont(new Font("Tahoma", Font.PLAIN, 40));
		contentPane.add(lblReservas);
		
		Canvas canvas_1 = new Canvas();
		canvas_1.setBounds(106, 72, 870, 2);
		canvas_1.setBackground(new Color(0, 0, 0));
		contentPane.add(canvas_1);
		
		JLabel lblQuartos = new JLabel("Quartos");
		lblQuartos.setBounds(106, 117, 229, 71);
		lblQuartos.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(lblQuartos);
		
		Canvas canvas_3_2 = new Canvas();
		canvas_3_2.setBackground(new Color(0, 210, 0));
		canvas_3_2.setBounds(120, 206, 17, 107);
		contentPane.add(canvas_3_2);
		
		JButton btnQuarto1 = new JButton("Quarto 01");
		
		btnQuarto1.setFocusPainted(false);
		btnQuarto1.setBackground(new Color(240, 240, 240));
		btnQuarto1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnQuarto1.setBounds(130, 206, 175, 107);
		contentPane.add(btnQuarto1);
		
		JButton btnQuarto = new JButton("Quarto 02");
		btnQuarto.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnQuarto.setFocusPainted(false);
		btnQuarto.setBackground(new Color(240, 240, 240));
		btnQuarto.setBounds(343, 206, 175, 107);
		contentPane.add(btnQuarto);
		
		Canvas canvas_3_2_1_1 = new Canvas();
		canvas_3_2_1_1.setBackground(new Color(0, 210, 0));
		canvas_3_2_1_1.setBounds(552, 206, 17, 107);
		contentPane.add(canvas_3_2_1_1);
		
		JButton btnQuarto_3 = new JButton("Quarto - 03");
		btnQuarto_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnQuarto_3.setFocusPainted(false);
		btnQuarto_3.setBackground(new Color(240, 240, 240));
		btnQuarto_3.setBounds(562, 206, 175, 107);
		contentPane.add(btnQuarto_3);
		
		Canvas canvas_3_2_1_2 = new Canvas();
		canvas_3_2_1_2.setBackground(new Color(0, 210, 0));
		canvas_3_2_1_2.setBounds(769, 206, 17, 107);
		contentPane.add(canvas_3_2_1_2);
		
		JButton btnQuarto_1 = new JButton("Quarto - 04");
		btnQuarto_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnQuarto_1.setFocusPainted(false);
		btnQuarto_1.setBackground(new Color(240, 240, 240));
		btnQuarto_1.setBounds(779, 206, 175, 107);
		contentPane.add(btnQuarto_1);
		
		Canvas canvas_3_2_2 = new Canvas();
		canvas_3_2_2.setBackground(new Color(0, 210, 0));
		canvas_3_2_2.setBounds(120, 344, 17, 107);
		contentPane.add(canvas_3_2_2);
		
		JButton btnQuarto_5 = new JButton("Quarto - 05");
		btnQuarto_5.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnQuarto_5.setFocusPainted(false);
		btnQuarto_5.setBackground(new Color(240, 240, 240));
		btnQuarto_5.setBounds(130, 344, 175, 107);
		contentPane.add(btnQuarto_5);
		
		Canvas canvas_3_2_1_3 = new Canvas();
		canvas_3_2_1_3.setBackground(new Color(0, 210, 0));
		canvas_3_2_1_3.setBounds(333, 344, 17, 107);
		contentPane.add(canvas_3_2_1_3);
		
		JButton btnQuarto_6 = new JButton("Quarto - 06");
		btnQuarto_6.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnQuarto_6.setFocusPainted(false);
		btnQuarto_6.setBackground(new Color(240, 240, 240));
		btnQuarto_6.setBounds(343, 344, 175, 107);
		contentPane.add(btnQuarto_6);
		
		Canvas canvas_3_2_1_1_1 = new Canvas();
		canvas_3_2_1_1_1.setBackground(new Color(0, 210, 0));
		canvas_3_2_1_1_1.setBounds(552, 344, 17, 107);
		contentPane.add(canvas_3_2_1_1_1);
		
		JButton btnQuarto_3_1 = new JButton("Quarto - 07");
		btnQuarto_3_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnQuarto_3_1.setFocusPainted(false);
		btnQuarto_3_1.setBackground(new Color(240, 240, 240));
		btnQuarto_3_1.setBounds(562, 344, 175, 107);
		contentPane.add(btnQuarto_3_1);
		
		Canvas canvas_3_2_1_2_1 = new Canvas();
		canvas_3_2_1_2_1.setBackground(new Color(0, 210, 0));
		canvas_3_2_1_2_1.setBounds(769, 344, 17, 107);
		contentPane.add(canvas_3_2_1_2_1);
		
		JButton btnQuarto_1_1 = new JButton("Quarto - 08");
		btnQuarto_1_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnQuarto_1_1.setFocusPainted(false);
		btnQuarto_1_1.setBackground(new Color(240, 240, 240));
		btnQuarto_1_1.setBounds(779, 344, 175, 107);
		contentPane.add(btnQuarto_1_1);
		
		Canvas canvas_3_2_3 = new Canvas();
		canvas_3_2_3.setBackground(new Color(0, 210, 0));
		canvas_3_2_3.setBounds(120, 479, 17, 107);
		contentPane.add(canvas_3_2_3);
		
		JButton btnQuarto_2 = new JButton("Quarto - 09");
		btnQuarto_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnQuarto_2.setFocusPainted(false);
		btnQuarto_2.setBackground(new Color(240, 240, 240));
		btnQuarto_2.setBounds(130, 479, 175, 107);
		contentPane.add(btnQuarto_2);
		
		Canvas canvas_3_2_1_4 = new Canvas();
		canvas_3_2_1_4.setBackground(new Color(0, 210, 0));
		canvas_3_2_1_4.setBounds(333, 479, 17, 107);
		contentPane.add(canvas_3_2_1_4);
		
		JButton btnQuarto_7 = new JButton("Quarto - 10");
		btnQuarto_7.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnQuarto_7.setFocusPainted(false);
		btnQuarto_7.setBackground(new Color(240, 240, 240));
		btnQuarto_7.setBounds(343, 479, 175, 107);
		contentPane.add(btnQuarto_7);
		
		Canvas canvas_3_2_1_1_2 = new Canvas();
		canvas_3_2_1_1_2.setBackground(new Color(0, 210, 0));
		canvas_3_2_1_1_2.setBounds(552, 479, 17, 107);
		contentPane.add(canvas_3_2_1_1_2);
		
		JButton btnQuarto_3_2 = new JButton("Quarto - 11");
		btnQuarto_3_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnQuarto_3_2.setFocusPainted(false);
		btnQuarto_3_2.setBackground(new Color(240, 240, 240));
		btnQuarto_3_2.setBounds(562, 479, 175, 107);
		contentPane.add(btnQuarto_3_2);
		
		Canvas canvas_3_2_1_2_2 = new Canvas();
		canvas_3_2_1_2_2.setBackground(new Color(0, 210, 0));
		canvas_3_2_1_2_2.setBounds(769, 479, 17, 107);
		contentPane.add(canvas_3_2_1_2_2);
		
		JButton btnQuarto_1_2 = new JButton("Quarto - 12");
		btnQuarto_1_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnQuarto_1_2.setFocusPainted(false);
		btnQuarto_1_2.setBackground(new Color(240, 240, 240));
		btnQuarto_1_2.setBounds(779, 479, 175, 107);
		contentPane.add(btnQuarto_1_2);
		
		btnQuarto1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quarto.setNumero("1");

				 ReservaQuarto reserva = new ReservaQuarto();
				 desktopPane.add(reserva);
				reserva.setVisible(true);
		               
				
				
				
			
			}
		});
		
	}
	
}
