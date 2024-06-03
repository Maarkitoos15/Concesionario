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
import javax.swing.JTextArea;

public class VENDER1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField marca;
	private JTextField modelo;
	private JTextField color;
	private JTextField puertas;
	private JTextField combustible;
	private JTextField fecha;
	private JTextField kilometros;
	private JTextField textField;


	/**
	 * Create the frame.
	 */
	public VENDER1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 943, 648);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(184, 251, 172));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon imagen = new ImageIcon("C:\\Users\\marki\\Desktop\\VENDER(1).png");

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
		
		
		

		JLabel lblNewLabel = new JLabel("vender coche...");
		lblNewLabel.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel.setBounds(235, 42, 532, 83);
		lblNewLabel.setBorder(new LineBorder(new Color(0, 117, 0), 2));
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setFont(new Font("MS PGothic", Font.BOLD | Font.ITALIC, 45));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
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

		
		JButton btnNewButton1 = new JButton("BUSCAR");
		btnNewButton1.setBorder(new LineBorder(new Color(255, 255, 255), 5));
		btnNewButton1.setFont(new Font("MS Gothic", Font.BOLD | Font.ITALIC, 25));
		btnNewButton1.setBackground(new Color(0, 255, 128));
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				consultas consultas = new consultas();
				
				String marca1 = marca.getText();
				String modelo1 = modelo.getText();
				String color1 = color.getText();
				String numeropuertas1 = puertas.getText();
				String fecha1  = fecha.getText();
				String kilometros1 = kilometros.getText();
				String combustible1 = combustible.getText();
				
				if(marca1.isEmpty()& modelo1.isEmpty()& color1.isEmpty()&numeropuertas1.isEmpty()&fecha1.isEmpty()& kilometros1.isEmpty()& combustible1.isEmpty()){
			  
					JOptionPane.showMessageDialog(null,"Primero debes introducir datos!");
					return;
		}
				
				consultas.buscarCoche(marca1, modelo1, color1, numeropuertas1, fecha1, kilometros1, combustible1);
				
				
			}
		});
		btnNewButton1.setBounds(533, 498, 151, 52);
		contentPane.add(btnNewButton1);

		JButton btnNewButton = new JButton("VENDER");
		btnNewButton.setBorder(new LineBorder(new Color(255, 255, 255), 5));
		btnNewButton.setFont(new Font("MS Gothic", Font.BOLD | Font.ITALIC, 25));
		btnNewButton.setBackground(new Color(0, 255, 128));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id_coche = textField.getText().trim();
				
				if (id_coche.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Ingresa primero el ID");
					return;
				}
				
	
				
				 try {			            
			            consultas.venderCochePorID(id_coche);
			        } catch (NumberFormatException a) {
			            JOptionPane.showMessageDialog(null, "ID inválido. Debe ser un número entero.", "Error", JOptionPane.ERROR_MESSAGE);
			        }
				
				
				
			}
		});
		btnNewButton.setBounds(711, 498, 151, 52);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel_1_6 = new JLabel("KILOMETROS");
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6.setBorder(new LineBorder(new Color(0, 117, 0), 2));
		lblNewLabel_1_6.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_1_6.setBounds(23, 534, 189, 38);
		contentPane.add(lblNewLabel_1_6);
		
		marca = new JTextField();
		marca.setColumns(10);
		marca.setBounds(242, 173, 244, 20);
		contentPane.add(marca);
		
		modelo = new JTextField();
		modelo.setColumns(10);
		modelo.setBounds(242, 238, 244, 20);
		contentPane.add(modelo);
		
		color = new JTextField();
		color.setColumns(10);
		color.setBounds(242, 301, 244, 20);
		contentPane.add(color);
		
		puertas = new JTextField();
		puertas.setColumns(10);
		puertas.setBounds(242, 361, 244, 20);
		contentPane.add(puertas);
		
		combustible = new JTextField();
		combustible.setColumns(10);
		combustible.setBounds(242, 421, 244, 20);
		contentPane.add(combustible);
		
		fecha = new JTextField();
		fecha.setColumns(10);
		fecha.setBounds(242, 483, 244, 20);
		contentPane.add(fecha);
		
		kilometros = new JTextField();
		kilometros.setColumns(10);
		kilometros.setBounds(242, 543, 244, 20);
		contentPane.add(kilometros);
								
								textField = new JTextField();
								textField.setForeground(Color.BLACK);
								textField.setHorizontalAlignment(SwingConstants.CENTER);
								textField.setFont(new Font("Verdana", Font.BOLD, 29));
								textField.setBounds(744, 449, 86, 38);
								contentPane.add(textField);
								textField.setColumns(10);
								
								JLabel lblNewLabel_2 = new JLabel("");
								lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
								lblNewLabel_2.setIcon(new ImageIcon(".//src//ImagenesProyecto//icovender.png"));
								lblNewLabel_2.setBounds(566, 196, 264, 204);
								contentPane.add(lblNewLabel_2);

		
	}
	}
