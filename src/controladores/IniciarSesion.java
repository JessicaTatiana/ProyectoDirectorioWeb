package controladores;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class IniciarSesion extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IniciarSesion frame = new IniciarSesion();
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
	public IniciarSesion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("Imagenes//Imagen1.png"));
		lblNewLabel.setBounds(0, 0, 572, 70);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Inicio");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(0, 69, 72, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Mapa");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton_1.setBounds(77, 69, 80, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Directorio");
		btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton_2.setBounds(162, 69, 91, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnClasificados = new JButton("Clasificados");
		btnClasificados.setFont(new Font("Arial", Font.PLAIN, 12));
		btnClasificados.setBounds(257, 70, 113, 23);
		contentPane.add(btnClasificados);
		
		JButton btnServicios = new JButton("Servicios");
		btnServicios.setFont(new Font("Arial", Font.PLAIN, 12));
		btnServicios.setBounds(380, 70, 91, 23);
		contentPane.add(btnServicios);
		
		JButton btnContactos = new JButton("Contactos");
		btnContactos.setFont(new Font("Arial", Font.PLAIN, 12));
		btnContactos.setBounds(481, 70, 91, 23);
		contentPane.add(btnContactos);
		
		
		JLabel lblIniciarSesion_1 = new JLabel("Iniciar Sesion");
		lblIniciarSesion_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblIniciarSesion_1.setBounds(126, 177, 80, 14);
		contentPane.add(lblIniciarSesion_1);
		
		JLabel lblNombreDeUsuario = new JLabel("Contrase\u00F1a :");
		lblNombreDeUsuario.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNombreDeUsuario.setBounds(139, 230, 62, 28);
		contentPane.add(lblNombreDeUsuario);
		
		JLabel label = new JLabel("Nombre de Usuario :");
		label.setFont(new Font("Arial", Font.PLAIN, 11));
		label.setBounds(139, 202, 104, 28);
		contentPane.add(label);
		
		JButton btnEnviar = new JButton("Ingresar");
		btnEnviar.setForeground(new Color(0, 0, 255));
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Portada miPortada = new Portada();
				miPortada.setVisible(true);
				miPortada.setDefaultCloseOperation(1);
				dispose();

			}
		});
		btnEnviar.setBounds(398, 233, 91, 23);
		contentPane.add(btnEnviar);
		
		JLabel lblOlvidoContrasea = new JLabel("Olvido Contrase\u00F1a?");
		lblOlvidoContrasea.setForeground(new Color(30, 144, 255));
		lblOlvidoContrasea.setFont(new Font("Arial", Font.PLAIN, 11));
		lblOlvidoContrasea.setBounds(386, 289, 104, 14);
		contentPane.add(lblOlvidoContrasea);
		
		JLabel lblRegistrarse_1 = new JLabel("Registrarse");
		lblRegistrarse_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		lblRegistrarse_1.setForeground(new Color(30, 144, 255));
		lblRegistrarse_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblRegistrarse_1.setBounds(386, 314, 79, 14);
		contentPane.add(lblRegistrarse_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(new Color(0, 0, 0));
		separator_3.setBounds(490, 296, -91, 2);
		contentPane.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(Color.BLACK);
		separator_4.setBounds(386, 305, 104, 2);
		contentPane.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setForeground(Color.BLACK);
		separator_5.setBounds(386, 329, 82, 10);
		contentPane.add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setForeground(Color.BLACK);
		separator_6.setBounds(216, 177, 282, 14);
		contentPane.add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setForeground(Color.BLACK);
		separator_7.setBounds(114, 269, 384, 2);
		contentPane.add(separator_7);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setOrientation(SwingConstants.VERTICAL);
		separator_8.setForeground(Color.BLACK);
		separator_8.setBounds(114, 181, 5, 87);
		contentPane.add(separator_8);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setOrientation(SwingConstants.VERTICAL);
		separator_9.setForeground(Color.BLACK);
		separator_9.setBounds(497, 177, 5, 94);
		contentPane.add(separator_9);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(238, 234, 132, 20);
		contentPane.add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(238, 206, 132, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
	}
}
