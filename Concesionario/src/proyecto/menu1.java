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
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class menu1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		}
	/**
	 * Create the frame.
	 */
	public menu1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 945, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(129, 252, 132));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel TITULOCONCESIONARIO = new JLabel("AUTOS EXTREMACAR");
		TITULOCONCESIONARIO.setBounds(167, 0, 518, 138);
		TITULOCONCESIONARIO.setHorizontalAlignment(SwingConstants.CENTER);
		TITULOCONCESIONARIO.setBorder(new LineBorder(new Color(0, 64, 0), 0));
		TITULOCONCESIONARIO.setBackground(new Color(6, 6, 6));
		TITULOCONCESIONARIO.setForeground(new Color(255, 255, 255));
		TITULOCONCESIONARIO.setFont(new Font("MS Gothic", Font.BOLD, 35));
		contentPane.add(TITULOCONCESIONARIO);

		JLabel lblNewLabel = new JLabel("¡Bienvenidos a nuestro servicio!");
		lblNewLabel.setBounds(153, 87, 601, 138);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("MS Gothic", Font.BOLD, 30));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(new Color(128, 128, 128));
		contentPane.add(lblNewLabel);
		
		ImageIcon imagen3 = new ImageIcon(".//src/ImagenesProyecto/car.png");

		JLabel lblImagen = new JLabel(imagen3);

		lblImagen.setBounds(331, 178, 286, 234);

		contentPane.add(lblImagen);

		JButton btnComprar = new JButton("COMPRAR");
		btnComprar.setBorder(new LineBorder(new Color(255, 255, 255), 4));
		btnComprar.setForeground(new Color(0, 0, 0));
		btnComprar.setBackground(new Color(0, 255, 128));
		btnComprar.setBounds(230, 419, 204, 118);
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				comprar1 comprarFrame = new comprar1();
				comprarFrame.setVisible(true);
			}
		});
		btnComprar.setFont(new Font("MS PGothic", Font.BOLD | Font.ITALIC, 14));
		contentPane.add(btnComprar);
		
		JButton btnComprar_1 = new JButton("VENDER");
		btnComprar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				VENDER1 venderFrame = new VENDER1();
				venderFrame.setVisible(true);
			}
		});
		btnComprar_1.setForeground(Color.BLACK);
		btnComprar_1.setFont(new Font("MS PGothic", Font.BOLD | Font.ITALIC, 14));
		btnComprar_1.setBorder(new LineBorder(new Color(255, 255, 255), 4));
		btnComprar_1.setBackground(new Color(0, 255, 128));
		btnComprar_1.setBounds(512, 419, 204, 118);
		contentPane.add(btnComprar_1);
	}
}