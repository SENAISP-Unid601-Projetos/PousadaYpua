package pousadaYpua;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 998, 645);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(234, 234, 234));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblQ1 = new JLabel("Quarto - 01");
		lblQ1.setBounds(134, 216, 111, 22);
		lblQ1.setBackground(new Color(255, 255, 255));
		lblQ1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblQ1);
		contentPane.add(lblQ1, Integer.valueOf(1));
		
		Canvas canvas = new Canvas();
		canvas.setBounds(0, 0, 100, 608);
		canvas.setBackground(new Color(177, 177, 177));
		contentPane.add(canvas);
		
		JLabel lblReservas = new JLabel("Reservas");
		lblReservas.setBounds(106, 0, 229, 63);
		lblReservas.setFont(new Font("Tahoma", Font.PLAIN, 40));
		contentPane.add(lblReservas);
		
		Canvas canvas_1 = new Canvas();
		canvas_1.setBounds(106, 72, 858, 2);
		canvas_1.setBackground(new Color(0, 0, 0));
		contentPane.add(canvas_1);
		
		JLabel lblQuartos = new JLabel("Quartos");
		lblQuartos.setBounds(106, 117, 229, 71);
		lblQuartos.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(lblQuartos);
		
		Canvas canvas_3 = new Canvas();
		canvas_3.setBounds(106, 201, 17, 114);
		canvas_3.setBackground(new Color(0, 210, 0));
		contentPane.add(canvas_3);
		
		JLabel lblDisponivel = new JLabel("Disponivel");
		lblDisponivel.setBounds(203, 281, 92, 22);
		lblDisponivel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDisponivel.setBackground(Color.WHITE);
		contentPane.add(lblDisponivel);
		
		JLabel lblDisponivel_1 = new JLabel("Disponivel");
		lblDisponivel_1.setBounds(424, 281, 92, 22);
		lblDisponivel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDisponivel_1.setBackground(Color.WHITE);
		contentPane.add(lblDisponivel_1);
		
		Canvas canvas_3_1 = new Canvas();
		canvas_3_1.setBounds(327, 201, 17, 114);
		canvas_3_1.setBackground(new Color(0, 210, 0));
		contentPane.add(canvas_3_1);
		
		JLabel lblQ2 = new JLabel("Quarto - 02");
		lblQ2.setBounds(355, 216, 111, 22);
		lblQ2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblQ2.setBackground(Color.WHITE);
		contentPane.add(lblQ2);
		
		JLabel lblDisponivel_2 = new JLabel("Disponivel");
		lblDisponivel_2.setBounds(640, 281, 92, 22);
		lblDisponivel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDisponivel_2.setBackground(Color.WHITE);
		contentPane.add(lblDisponivel_2);
		
		Canvas canvas_3_2 = new Canvas();
		canvas_3_2.setBounds(543, 201, 17, 114);
		canvas_3_2.setBackground(new Color(0, 210, 0));
		contentPane.add(canvas_3_2);
		
		JLabel lblQ3 = new JLabel("Quarto - 03");
		lblQ3.setBounds(571, 216, 111, 22);
		lblQ3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblQ3.setBackground(Color.WHITE);
		contentPane.add(lblQ3);
		
		JLabel lblDisponivel_3 = new JLabel("Disponivel");
		lblDisponivel_3.setBounds(855, 281, 92, 22);
		lblDisponivel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDisponivel_3.setBackground(Color.WHITE);
		contentPane.add(lblDisponivel_3);
		
		Canvas canvas_3_3 = new Canvas();
		canvas_3_3.setBounds(758, 201, 17, 114);
		canvas_3_3.setBackground(new Color(0, 210, 0));
		contentPane.add(canvas_3_3);
		
		JLabel lblQ4 = new JLabel("Quarto - 04");
		lblQ4.setBounds(786, 216, 111, 22);
		lblQ4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblQ4.setBackground(Color.WHITE);
		contentPane.add(lblQ4);
	}
}
