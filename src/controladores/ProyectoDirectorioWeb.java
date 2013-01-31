package controladores;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import java.awt.Button;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

import java.awt.TextArea;

public class ProyectoDirectorioWeb {

	private JFrame frame;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProyectoDirectorioWeb window = new ProyectoDirectorioWeb();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ProyectoDirectorioWeb() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(211, 211, 211));
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setForeground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 639, 408);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Inicio");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(10, 80, 72, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Mapa");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton_1.setBounds(95, 80, 80, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Directorio");
		btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton_2.setBounds(185, 80, 91, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnClasificados = new JButton("Clasificados");
		btnClasificados.setBounds(286, 81, 91, 23);
		frame.getContentPane().add(btnClasificados);
		
		JButton btnServicios = new JButton("Servicios");
		btnServicios.setBounds(386, 81, 91, 23);
		frame.getContentPane().add(btnServicios);
		
		JButton btnContactos = new JButton("Contactos");
		btnContactos.setBounds(487, 81, 91, 23);
		frame.getContentPane().add(btnContactos);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(10, 67, 600, 2);
		frame.getContentPane().add(separator);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 82, 72, 21);
		frame.getContentPane().add(panel);
		
		JLabel lblIniciarSesion_1 = new JLabel("Iniciar Sesion");
		lblIniciarSesion_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblIniciarSesion_1.setBounds(126, 177, 80, 14);
		frame.getContentPane().add(lblIniciarSesion_1);
		
		JLabel lblNombreDeUsuario = new JLabel("Contrase\u00F1a :");
		lblNombreDeUsuario.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNombreDeUsuario.setBounds(139, 230, 104, 28);
		frame.getContentPane().add(lblNombreDeUsuario);
		
		JLabel label = new JLabel("Nombre de Usuario :");
		label.setFont(new Font("Arial", Font.PLAIN, 11));
		label.setBounds(139, 202, 104, 28);
		frame.getContentPane().add(label);
		
		JButton btnEnviar = new JButton("Ingresar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEnviar.setBounds(398, 233, 91, 23);
		frame.getContentPane().add(btnEnviar);
		
		JLabel lblOlvidoContrasea = new JLabel("Olvido Contrase\u00F1a?");
		lblOlvidoContrasea.setForeground(new Color(30, 144, 255));
		lblOlvidoContrasea.setFont(new Font("Arial", Font.PLAIN, 11));
		lblOlvidoContrasea.setBounds(386, 289, 104, 14);
		frame.getContentPane().add(lblOlvidoContrasea);
		
		JLabel lblRegistrarse_1 = new JLabel("Registrarse");
		lblRegistrarse_1.setForeground(new Color(30, 144, 255));
		lblRegistrarse_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblRegistrarse_1.setBounds(386, 314, 79, 14);
		frame.getContentPane().add(lblRegistrarse_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(242, 234, 135, 20);
		frame.getContentPane().add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(242, 199, 135, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(new Color(0, 0, 0));
		separator_3.setBounds(490, 296, -91, 2);
		frame.getContentPane().add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(Color.BLACK);
		separator_4.setBounds(386, 305, 104, 2);
		frame.getContentPane().add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setForeground(Color.BLACK);
		separator_5.setBounds(386, 329, 82, 10);
		frame.getContentPane().add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setForeground(Color.BLACK);
		separator_6.setBounds(216, 177, 282, 14);
		frame.getContentPane().add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setForeground(Color.BLACK);
		separator_7.setBounds(114, 269, 384, 2);
		frame.getContentPane().add(separator_7);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setOrientation(SwingConstants.VERTICAL);
		separator_8.setForeground(Color.BLACK);
		separator_8.setBounds(114, 181, 5, 87);
		frame.getContentPane().add(separator_8);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setOrientation(SwingConstants.VERTICAL);
		separator_9.setForeground(Color.BLACK);
		separator_9.setBounds(497, 177, 5, 94);
		frame.getContentPane().add(separator_9);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("Imagenes//Imagen1.png"));
		lblNewLabel.setBounds(10, 0, 621, 70);
		frame.getContentPane().add(lblNewLabel);
		
		TextArea textArea = new TextArea();
		textArea.setForeground(Color.BLACK);
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setText("      Publicidad");
		textArea.setBounds(496, 176, 135, 205);
		frame.getContentPane().add(textArea);
	}
}
