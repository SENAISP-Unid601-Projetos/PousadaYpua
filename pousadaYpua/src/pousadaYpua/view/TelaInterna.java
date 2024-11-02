package pousadaYpua.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

import pousadaYpua.DAO.ClientesDao;
import pousadaYpua.model.Clientes;

public class TelaInterna extends JInternalFrame {
	
	private ClientesDao clientesBd =  new ClientesDao();

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInterna frame = new TelaInterna();
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
	public TelaInterna() {
		setResizable(true);
		setMaximizable(true);
		setClosable(true);
		setBounds(0, 0, 902, 682);
		getContentPane().setLayout(null);
		
		
		DefaultListModel<String> listModel = new DefaultListModel<>();
		ArrayList<Clientes> reservations = clientesBd.buscaClientes();
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
	
	
	private void showReservationDetails(Clientes reservation) {
        JFrame detailFrame = new JFrame("Detalhes da Reserva");
        detailFrame.setSize(300, 200);
        detailFrame.getContentPane().add(new JLabel(reservation.getInfo()), BorderLayout.CENTER);
        detailFrame.setVisible(true);
    }
}
