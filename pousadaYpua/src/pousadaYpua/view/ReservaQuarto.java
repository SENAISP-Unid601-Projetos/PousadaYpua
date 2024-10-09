package pousadaYpua.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ReservaQuarto extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReservaQuarto frame = new ReservaQuarto();
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
	public ReservaQuarto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setBounds(100, 100, 1125, 675);
	    JComponent contentPane = new JPanel();
	    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
	    setContentPane(contentPane);
	    contentPane.setLayout(null);
	    
	    JPanel panel = new JPanel();
	    panel.setBackground(new Color(113, 177, 187));
	    panel.setBounds(0, 17, 1053, 618);
	    
	    contentPane.add(panel);
	    panel.setLayout(null);
	    
		JLabel lblImagePousada = new JLabel("");
		lblImagePousada.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagePousada.setBounds(10, 22, 345, 266);
		panel.add(lblImagePousada);
		
        // Carregando e inserindo a imagem
        ImageIcon quartoImage = new ImageIcon("resources/quarto2.jpg"); // Caminho para a imagem
        lblImagePousada.setIcon(quartoImage);
        
        JLabel lblNewLabel_2 = new JLabel("Nome :");
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_2.setBounds(380, 36, 106, 30);
		panel.add(lblNewLabel_2);
		
		JTextField textField = new JTextField();
		textField.setBounds(380, 76, 663, 30);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Data de Nascimento:");
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_3.setBounds(380, 124, 183, 30);
		panel.add(lblNewLabel_3);
		
		JTextField textField_1 = new JTextField();
		textField_1.setBounds(380, 164, 663, 30);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Documento (RG/CPF):");
		lblNewLabel_4.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_4.setBounds(379, 198, 184, 30);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Telefone: ");
		lblNewLabel_5.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_5.setBounds(380, 281, 106, 30);
		panel.add(lblNewLabel_5);
		
		JTextField textField_2 = new JTextField();
		textField_2.setBounds(380, 311, 663, 30);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JTextField textField_3 = new JTextField();
		textField_3.setBounds(380, 238, 663, 33);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Status da Reserva:");
		lblNewLabel_6.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_6.setBounds(745, 481, 153, 30);
		panel.add(lblNewLabel_6);
		
		JTextField textField_4 = new JTextField();
		textField_4.setBounds(908, 481, 135, 30);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Preferências Especiais:");
		lblNewLabel_7.setFont(new Font("Yu Gothic", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_7.setBounds(380, 381, 244, 30);
		panel.add(lblNewLabel_7);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(380, 411, 328, 111);
		panel.add(textArea);
		
		JTextArea txtrAnicarea = new JTextArea();
		txtrAnicarea.setLineWrap(true);
		txtrAnicarea.setText(" A única área que eu acho, que vai exigir muita atenção nossa, e aí eu já aventei a hipótese de até criar um ministério. É na área de... Na área... Eu diria assim, como uma espécie de analogia com o que acontece na área agrícola.\r\n\r\nPrimeiro eu queria cumprimentar os internautas. -Oi Internautas! Depois dizer que o meio ambiente é sem dúvida nenhuma uma ameaça ao desenvolvimento sustentável. E isso significa que é uma ameaça pro futuro do nosso planeta e dos nossos países. O desemprego beira 20%, ou seja, 1 em cada 4 portugueses.\r\n\r\nAi você fala o seguinte: \"- Mas vocês acabaram isso?\" Vou te falar: -\"Não, está em andamento!\" Tem obras que \"vai\" durar pra depois de 2010. Agora, por isso, nós já não desenhamos, não começamos a fazer projeto do que nós \"podêmo fazê\"? 11, 12, 13, 14... Por que é que não?\r\n\r\nNo meu xinélo da humildade eu gostaria muito de ver o Neymar e o Ganso. Por que eu acho que.... 11 entre 10 brasileiros gostariam. Você veja, eu já vi, parei de ver. Voltei a ver, e acho que o Neymar e o Ganso têm essa capacidade de fazer a gente olhar.");
		txtrAnicarea.setEnabled(false);
		txtrAnicarea.setEditable(false);
		txtrAnicarea.setBounds(10, 313, 345, 209);
		panel.add(txtrAnicarea);
		

	}
}
