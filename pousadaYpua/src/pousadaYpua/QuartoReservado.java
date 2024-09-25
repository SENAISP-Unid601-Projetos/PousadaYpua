package pousadaYpua;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.text.StyledDocument;

public class QuartoReservado extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

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
	    panel.setBorder(new RoundedBorder(15));
	    panel.setBackground(new Color(113, 177, 187));
	    panel.setBounds(10, 96, 1053, 532);
	    
	    contentPane.add(panel);
	    panel.setLayout(null);
	    
	    // Criando o JTextPane
	    JTextPane txtDescricao = new JTextPane();
	    txtDescricao.setForeground(new Color(0, 0, 102));
	    txtDescricao.setBackground(new Color(255, 255, 255));
	    txtDescricao.setEditable(false);
	    txtDescricao.setFont(new Font("Verdana", Font.ITALIC, 14));
	    
	    // Adicionando texto e imagem ao JTextPane
	    StyledDocument doc = txtDescricao.getStyledDocument();
	    try {
	        // Adicionando texto
	        doc.insertString(doc.getLength(), "Descubra o conforto e a praticidade do nosso Quarto Standard. Projetado para oferecer uma estadia relaxante, este quarto conta com uma cama de casal ou duas camas de solteiro, ideal para casais ou pequenas famílias.\n\n", null);
	        doc.insertString(doc.getLength(), "Comodidades Inclusas:\n", null);
	        doc.insertString(doc.getLength(), "Ar-condicionado para um ambiente fresco e agradável.\n", null);
	        doc.insertString(doc.getLength(), "TV de tela plana com canais a cabo para entretenimento.\n", null);
	        doc.insertString(doc.getLength(), "Frigobar abastecido com bebidas e lanches.\n", null);
	        doc.insertString(doc.getLength(), "Banheiro privativo com chuveiro aquecido e amenidades de higiene pessoal.\n", null);
	        doc.insertString(doc.getLength(), "Mesa de trabalho e cadeira, perfeita para quem precisa de um espaço para se concentrar.\n\n", null);
	        doc.insertString(doc.getLength(), "Ambiente Aconchegante: A decoração moderna e aconchegante, com tons neutros e toques de cor, cria um ambiente acolhedor para relaxar após um dia de passeios.\n\n", null);
	        doc.insertString(doc.getLength(), "Conectividade: Aproveite o Wi-Fi gratuito para se manter conectado durante sua estadia.\n\n", null);
	        doc.insertString(doc.getLength(), "Ideal para viajantes a negócios ou lazer, o Quarto Standard oferece tudo o que você precisa para uma experiência confortável e memorável. Venha aproveitar!", null);
	        
	        // Carregando e inserindo a imagem
	        ImageIcon quartoImage = new ImageIcon("\\imagens\\quarto.jpg"); // Caminho para a imagem
	        Image img = quartoImage.getImage().getScaledInstance(200, 150, Image.SCALE_SMOOTH); // Redimensionando a imagem
	        JLabel label = new JLabel(new ImageIcon(img));
	        
	        // Inserindo a imagem no JTextPane
	        doc.insertString(doc.getLength(), "\n", null); // Linha em branco antes da imagem
	        txtDescricao.insertComponent(label); // Adicionando a imagem

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    txtDescricao.setBounds(10, 10, 360, 512);
	    panel.add(txtDescricao);
	    
	   
	
		JLabel lblNewLabel_2 = new JLabel("Nome :");
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_2.setBounds(380, 23, 106, 30);
		panel.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(461, 27, 330, 30);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Data de Nascimento:");
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_3.setBounds(380, 68, 183, 30);
		panel.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(568, 67, 330, 30);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Documento (RG/CPF):");
		lblNewLabel_4.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_4.setBounds(379, 111, 184, 30);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Telefone: ");
		lblNewLabel_5.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_5.setBounds(380, 151, 106, 30);
		panel.add(lblNewLabel_5);
		
		textField_2 = new JTextField();
		textField_2.setBounds(486, 151, 222, 30);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(568, 112, 233, 33);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Status da Reserva:");
		lblNewLabel_6.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_6.setBounds(745, 481, 153, 30);
		panel.add(lblNewLabel_6);
		
		textField_4 = new JTextField();
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
