package pousadaYpua;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JTextField;

public class QuartoReservado extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuartoReservado frame = new QuartoReservado();
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
	public QuartoReservado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1125, 675);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 96, 1053, 532);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextPane txtpnDescubraOConforto = new JTextPane();
		txtpnDescubraOConforto.setForeground(new Color(0, 0, 102));
		txtpnDescubraOConforto.setBackground(new Color(255, 255, 255));
		txtpnDescubraOConforto.setEditable(false);
		txtpnDescubraOConforto.setFont(new Font("Verdana", Font.ITALIC, 14));
		txtpnDescubraOConforto.setText("Descubra o conforto e a praticidade do nosso Quarto Standard. Projetado para oferecer uma estadia relaxante, este quarto conta com uma cama de casal ou duas camas de solteiro, ideal para casais ou pequenas famílias.\r\n\r\nComodidades Inclusas:\n\nAr-condicionado para um ambiente fresco e agradável.\n\r\nTV de tela plana com canais a cabo para entretenimento.\r\n\nFrigobar abastecido com bebidas e lanches.\r\n\nBanheiro privativo com chuveiro aquecido e amenidades de higiene pessoal.\r\n\nMesa de trabalho e cadeira, perfeita para quem precisa de um espaço para se concentrar.\r\n\r\n\nAmbiente Aconchegante: A decoração moderna e aconchegante, com tons neutros e toques de cor, cria um ambiente acolhedor para relaxar após um dia de passeios.\r\n\r\n\n\nConectividade: Aproveite o Wi-Fi gratuito para se manter conectado durante sua estadia.\n\nIdeal para viajantes a negócios ou lazer, o Quarto Standard oferece tudo o que você precisa para uma experiência confortável e memorável. Venha aproveitar!");
		txtpnDescubraOConforto.setBounds(10, 10, 360, 512);
		panel.add(txtpnDescubraOConforto);
		
		JLabel lblNewLabel_2 = new JLabel("Nome :");
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_2.setBounds(572, 19, 106, 30);
		panel.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(669, 23, 330, 30);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Data de Nascimento:");
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_3.setBounds(495, 63, 183, 33);
		panel.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(669, 61, 330, 30);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Quarto 1");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBackground(new Color(128, 128, 128));
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(27, 10, 340, 66);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Standart ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBackground(new Color(192, 192, 192));
		lblNewLabel_1.setFont(new Font("Verdana", Font.ITALIC, 18));
		lblNewLabel_1.setBounds(63, 56, 158, 30);
		contentPane.add(lblNewLabel_1);
	}
}
