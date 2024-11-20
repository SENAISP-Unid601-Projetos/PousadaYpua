package pousadaYpua.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JInternalFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import pousadaYpua.DAO.ClientesDao;
import pousadaYpua.model.Clientes;

public class BuscarReservas extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	
	private Clientes clientes;
	ClientesDao clienteDao;
	private JPanel contentPane;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuscarReservas frame = new BuscarReservas();
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
	public BuscarReservas() {
		
		
		

		
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

		
		
		
		DefaultListModel<String> listModel = new DefaultListModel<>();
		ArrayList<Clientes> reservations = clienteDao.buscaClientes();
        JList<String> reservationList = new JList(listModel);
        reservationList.setBounds(33, 45, 538, 470);
        getContentPane().add(reservationList);

		
		
		
		
		
		ArrayList<String> clientes = new ArrayList<String>();
		for (Clientes reservation : reservations) {
			clientes.add(reservation.getNome()+ " "+reservation.getCpf());	
		}
		
		for (String reservation : clientes) {
            listModel.addElement(reservation);
        }
		 // Evento de clique duplo na reserva
        reservationList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    int index = reservationList.getSelectedIndex();
                    if (index != -1) {
                        Clientes selectedReservation = reservations.get(index);
                        showReservationDetails(selectedReservation);
                    }
                }
            }
        });

		
	}

}
