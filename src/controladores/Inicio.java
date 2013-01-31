package controladores;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("Imagenes"+File.separator+"Imagen1.png"));
		lblNewLabel.setBounds(0, 0, 608, 61);
		contentPane.add(lblNewLabel);
		
		JButton btnInicio = new JButton("Inicio");
		btnInicio.setForeground(new Color(0, 0, 255));
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			IniciarSesion miSesion = new IniciarSesion();
			miSesion.setVisible(true);
			miSesion.setDefaultCloseOperation(1);
			dispose();
			
			
			}
		});
		btnInicio.setBounds(0, 62, 91, 23);
		contentPane.add(btnInicio);
		
		JButton btnNewButton = new JButton("Mapa");
		btnNewButton.setBounds(94, 62, 91, 23);
		contentPane.add(btnNewButton);
		
		JButton btnDirectorio = new JButton("Directorio");
		btnDirectorio.setBounds(190, 62, 91, 23);
		contentPane.add(btnDirectorio);
		
		JButton btnClasificados = new JButton("Clasificados");
		btnClasificados.setBounds(284, 62, 91, 23);
		contentPane.add(btnClasificados);
		
		JButton btnServicios = new JButton("Servicios");
		btnServicios.setBounds(379, 62, 91, 23);
		contentPane.add(btnServicios);
		
		JButton btnContactos = new JButton("Contactos");
		btnContactos.setBounds(476, 62, 91, 23);
		contentPane.add(btnContactos);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("Imagenes"+File.separator+"Imagen2.jpg"));
		lblNewLabel_1.setBounds(10, 96, 289, 153);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("Imagenes"+File.separator+"Imagen3.jpg"));
		lblNewLabel_2.setBounds(309, 96, 258, 157);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("Imagenes"+File.separator+"Imagen4.jpg"));
		lblNewLabel_3.setBounds(0, 260, 400, 135);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("Imagenes"+File.separator+"Imagen5.jpg"));
		lblNewLabel_4.setBounds(242, 264, 335, 51);
		contentPane.add(lblNewLabel_4);
	}
}
