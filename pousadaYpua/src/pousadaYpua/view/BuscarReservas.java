package pousadaYpua.view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BuscarReservas extends JInternalFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable tabelaReservas;
    private DefaultTableModel modeloTabela;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                BuscarReservas frame = new BuscarReservas();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the frame.
     */
    public BuscarReservas() {
        setTitle("Buscar Reservas");
        setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        setBounds(0, 0, 1125, 675);
        setClosable(true);
        setMaximizable(true);
        setIconifiable(true);

        contentPane = new JPanel();
        contentPane.setBackground(Color.DARK_GRAY);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Tabela para exibir reservas
        modeloTabela = new DefaultTableModel(
                new Object[]{"ID Reserva", "Cliente", "Quarto", "Data Entrada", "Data Saída", "Ações"}, 0);
        tabelaReservas = new JTable(modeloTabela);
        JScrollPane scrollPane = new JScrollPane(tabelaReservas);
        scrollPane.setBounds(20, 20, 1080, 500);
        contentPane.add(scrollPane);

        
        JButton btnCheckIn = new JButton("Realizar Check-In");
        btnCheckIn.setBounds(950, 550, 150, 30);
        contentPane.add(btnCheckIn);

        
        carregarReservas();
    
        btnCheckIn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
    }

    /**
     * Simula carregamento de dados na tabela.
     */
    private void carregarReservas() {
        modeloTabela.addRow(new Object[]{1, "João Silva", 101, "2024-10-20", "2024-10-25", "Check-In"});
        modeloTabela.addRow(new Object[]{2, "Maria Oliveira", 202, "2024-10-22", "2024-10-28", "Check-In"});
    }
}
