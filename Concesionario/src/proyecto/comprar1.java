package proyecto;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class comprar1 extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField marca;
	private JTextField modelo;
	private JTextField color;
	private JTextField puertas;
	private JTextField combustible;
	private JTextField kilometros;
	private JTextField fecha;



	/**
	 * Create the frame.
	 */
	public comprar1() {
		
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 945, 650);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(184, 251, 172));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);

			ImageIcon imagen = new ImageIcon(".//src/ImagenesProyecto/logovendercoche.png");

			JLabel lblImagen = new JLabel(imagen);

			lblImagen.setBounds(620, 190, 237, 248);

			contentPane.add(lblImagen);

			ImageIcon imagen2 = new ImageIcon("C:\\Users\\marki\\Downloads\\file.png");

			JButton btnImagen = new JButton(imagen2);

			btnImagen.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {

					dispose();

					menu1 menu1 = new menu1();

					menu1.setVisible(true);

				}

			});
			btnImagen.setBounds(59, 28, 82, 71);

			btnImagen.setBorderPainted(false);

			btnImagen.setContentAreaFilled(false);

			getContentPane().add(btnImagen);

			JLabel lblNewLabel = new JLabel("Compra tu coche");
			lblNewLabel.setBorder(new LineBorder(new Color(15, 115, 40), 3));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("MS Gothic", Font.BOLD | Font.ITALIC, 35));
			lblNewLabel.setBackground(new Color(168, 255, 190));
			lblNewLabel.setBounds(244, 28, 490, 87);
			contentPane.add(lblNewLabel);

			JLabel lblNewLabel_1 = new JLabel("MARCA");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setBorder(new LineBorder(new Color(0, 117, 0), 2));
			lblNewLabel_1.setBackground(new Color(240, 240, 240));
			lblNewLabel_1.setBounds(23, 164, 189, 38);
			contentPane.add(lblNewLabel_1);

			JLabel lblNewLabel_1_5 = new JLabel("MODELO");
			lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_5.setBorder(new LineBorder(new Color(0, 117, 0), 2));
			lblNewLabel_1_5.setBackground(UIManager.getColor("Button.background"));
			lblNewLabel_1_5.setBounds(23, 229, 189, 38);
			contentPane.add(lblNewLabel_1_5);

			JLabel lblNewLabel_1_1 = new JLabel("COLOR");
			lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_1.setBorder(new LineBorder(new Color(0, 117, 0), 2));
			lblNewLabel_1_1.setBackground(UIManager.getColor("Button.background"));
			lblNewLabel_1_1.setBounds(23, 292, 189, 38);
			contentPane.add(lblNewLabel_1_1);

			JLabel lblNewLabel_1_2 = new JLabel("NUMERO DE PUERTAS");
			lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_2.setBorder(new LineBorder(new Color(0, 117, 0), 2));
			lblNewLabel_1_2.setBackground(UIManager.getColor("Button.background"));
			lblNewLabel_1_2.setBounds(23, 352, 189, 38);
			contentPane.add(lblNewLabel_1_2);

			JLabel lblNewLabel_1_3 = new JLabel("COMBUSTIBLE");
			lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_3.setBorder(new LineBorder(new Color(0, 117, 0), 2));
			lblNewLabel_1_3.setBackground(UIManager.getColor("Button.background"));
			lblNewLabel_1_3.setBounds(23, 412, 189, 38);
			contentPane.add(lblNewLabel_1_3);

			JLabel lblNewLabel_1_4 = new JLabel("FECHA MATRICULACION");
			lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_4.setBorder(new LineBorder(new Color(0, 117, 0), 2));
			lblNewLabel_1_4.setBackground(UIManager.getColor("Button.background"));
			lblNewLabel_1_4.setBounds(23, 474, 189, 38);
			contentPane.add(lblNewLabel_1_4);
			
			JLabel lblNewLabel_1_6 = new JLabel("KILOMETROS");
			lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_6.setBorder(new LineBorder(new Color(0, 117, 0), 2));
			lblNewLabel_1_6.setBackground(UIManager.getColor("Button.background"));
			lblNewLabel_1_6.setBounds(23, 534, 189, 38);
			contentPane.add(lblNewLabel_1_6);

			marca = new JTextField();
			marca.setBounds(261, 173, 244, 20);
			contentPane.add(marca);
			marca.setColumns(10);

			modelo = new JTextField();
			modelo.setColumns(10);
			modelo.setBounds(261, 238, 244, 20);
			contentPane.add(modelo);

			color = new JTextField();
			color.setColumns(10);
			color.setBounds(261, 301, 244, 20);
			contentPane.add(color);

			puertas = new JTextField();
			puertas.setColumns(10);
			puertas.setBounds(261, 361, 244, 20);
			contentPane.add(puertas);

			combustible = new JTextField();
			combustible.setColumns(10);
			combustible.setBounds(261, 421, 244, 20);
			contentPane.add(combustible);

			fecha = new JTextField();
			fecha.setColumns(10);
			fecha.setBounds(261, 483, 244, 20);
			contentPane.add(fecha);
			
			kilometros = new JTextField();
			kilometros.setColumns(10);
			kilometros.setBounds(261, 543, 244, 20);
			contentPane.add(kilometros);

			JButton btnNewButton = new JButton("COMPRAR");
			btnNewButton.setBorder(new LineBorder(new Color(255, 255, 255), 5));
			btnNewButton.setFont(new Font("MS Gothic", Font.BOLD | Font.ITALIC, 25));
			btnNewButton.setBackground(new Color(0, 255, 128));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String marca1 = marca.getText().trim(); 
					String modelo1 = modelo.getText().trim(); 
					String color1 = color.getText().trim(); 
					String puertas1 = puertas.getText().trim(); 
					String combustible1 = combustible.getText().trim(); 
					String fecha1 = fecha.getText().trim(); 
					String kilometros1 = kilometros.getText().trim(); 
					
					if (marca1.isEmpty()||modelo1.isEmpty()||color1.isEmpty()||puertas1.isEmpty()||combustible1.isEmpty()||fecha1.isEmpty()||kilometros1.isEmpty()) {
						
						JOptionPane.showMessageDialog(null, "Faltan datos por introducir, intentalo de nuevo!");
						return;
					}
					
					consultas.comprarCoche(marca1, modelo1, color1, puertas1, fecha1, kilometros1, combustible1);
					
				}
			});
			btnNewButton.setBounds(681, 498, 151, 52);
			contentPane.add(btnNewButton);

			

			

		}

}
