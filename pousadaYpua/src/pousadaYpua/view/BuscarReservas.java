package pousadaYpua.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import pousadaYpua.DAO.ReservasDao;
import pousadaYpua.model.Reserva;

public class BuscarReservas extends JInternalFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable tabelaReservas;
    private DefaultTableModel modeloTabela;
    
    ReservasDao reservaDao = new ReservasDao();

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
    	tabelaReservas.setRowSelectionAllowed(true);
    	tabelaReservas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
    	
    	
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
                new Object[]{"ID Reserva", "CPF Cliente", "Quarto", "Data Entrada", "Data Saída", "Check-in", "Check-out"}, 0);
        tabelaReservas = new JTable(modeloTabela);
        JScrollPane scrollPane = new JScrollPane(tabelaReservas);
        scrollPane.setBounds(20, 20, 1080, 500);
        contentPane.add(scrollPane);
        
        tabelaReservas.getSelectedRow();
        tabelaReservas.setRowSelectionAllowed(true);

        
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
        // Limpa a tabela antes de adicionar novas linhas
        modeloTabela.setRowCount(0);

        // Recupera os dados de reservas
        List<Object[]> reservas = reservaDao.buscaReservas();

        // Adiciona os dados no modelo da tabela
        for (Object[] reserva : reservas) {
            modeloTabela.addRow(reserva);
        }
    }
}
