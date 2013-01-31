package controladores;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Font;
import java.awt.Label;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.io.File;

import javax.swing.UIManager;



public class Portada extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtPublicidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Portada frame = new Portada();
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
	public Portada() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 639, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setBounds(69, 353, -34, -42);
		contentPane.add(list);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("Imagenes"+File.separator+"Imagen1.png"));
		lblNewLabel.setBounds(0, 0, 631, 68);
		contentPane.add(lblNewLabel);
		
		JButton btnInicio = new JButton("Inicio");
		btnInicio.setFont(new Font("Arial", Font.PLAIN, 12));
		btnInicio.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnInicio.setBounds(0, 72, 91, 23);
		contentPane.add(btnInicio);
		
		JButton btnNewButton = new JButton("Mapa");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton.setBounds(101, 72, 91, 23);
		contentPane.add(btnNewButton);
		
		JButton btnDirectorio = new JButton("Directorio");
		btnDirectorio.setFont(new Font("Arial", Font.PLAIN, 12));
		btnDirectorio.setBounds(202, 72, 91, 23);
		contentPane.add(btnDirectorio);
		
		JButton btnNewButton_1 = new JButton("Clasificados");
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton_1.setBounds(298, 72, 91, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Servicios");
		btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton_2.setBounds(399, 72, 91, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnContactos = new JButton("Contactos");
		btnContactos.setFont(new Font("Arial", Font.PLAIN, 12));
		btnContactos.setBounds(500, 73, 101, 23);
		contentPane.add(btnContactos);
		
		JButton btnInformacion = new JButton("Informacion");
		btnInformacion.setFont(new Font("Arial", Font.PLAIN, 12));
		btnInformacion.setBackground(Color.WHITE);
		btnInformacion.setBounds(133, 142, 112, 23);
		contentPane.add(btnInformacion);
		
		JButton btnClasificados = new JButton("Clasificados");
		btnClasificados.setFont(new Font("Arial", Font.PLAIN, 12));
		btnClasificados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnClasificados.setBackground(Color.WHITE);
		btnClasificados.setBounds(241, 142, 112, 23);
		contentPane.add(btnClasificados);
		
		JLabel lblNuevo = new JLabel("Nuevo");
		lblNuevo.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNuevo.setBounds(133, 176, 46, 14);
		contentPane.add(lblNuevo);
		
		JLabel lblTitulo = new JLabel("Titulo: ");
		lblTitulo.setBounds(133, 201, 46, 14);
		contentPane.add(lblTitulo);
		
		textField = new JTextField();
		textField.setBounds(167, 201, 143, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(132, 226, 76, 14);
		contentPane.add(lblDescripcion);
		
		textField_1 = new JTextField();
		textField_1.setBounds(133, 251, 177, 68);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ciudad", "Armenia", "Calarca", "Pereira", "Genova", "Salento", "Manizales"}));
		comboBox.setFont(new Font("Arial", Font.PLAIN, 12));
		comboBox.setToolTipText("");
		comboBox.setBounds(133, 330, 91, 22);
		contentPane.add(comboBox);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(168, 188, 301, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(133, 402, 198, 2);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(133, 402, 198, 2);
		contentPane.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBackground(UIManager.getColor("Button.background"));
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setForeground(Color.BLACK);
		separator_3.setBounds(469, 188, 91, 216);
		contentPane.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setForeground(Color.BLACK);
		separator_4.setBounds(111, 188, 68, 216);
		contentPane.add(separator_4);
		
		txtPublicidad = new JTextField();
		txtPublicidad.setBackground(UIManager.getColor("Button.background"));
		txtPublicidad.setText("             Publicidad");
		txtPublicidad.setHorizontalAlignment(SwingConstants.LEFT);
		txtPublicidad.setBounds(469, 188, 162, 216);
		contentPane.add(txtPublicidad);
		txtPublicidad.setColumns(10);
		
		JButton btnPublicar = new JButton("Publicar");
		btnPublicar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnPublicar.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnPublicar.setBounds(133, 370, 91, 23);
		contentPane.add(btnPublicar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnCancelar.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnCancelar.setBounds(219, 370, 91, 23);
		contentPane.add(btnCancelar);
		
		JButton btnCrearNuevo = new JButton("Crear nuevo");
		btnCrearNuevo.setFont(new Font("Arial", Font.PLAIN, 12));
		btnCrearNuevo.setBounds(347, 197, 122, 23);
		contentPane.add(btnCrearNuevo);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnEditar.setBounds(347, 226, 91, 23);
		contentPane.add(btnEditar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnEliminar.setBounds(347, 260, 91, 23);
		contentPane.add(btnEliminar);
	}
}
