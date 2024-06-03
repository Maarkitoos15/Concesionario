package proyecto;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.LineBorder;

public class inisesion1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Create the frame.
	 */
	public inisesion1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 946, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(184, 251, 172));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("MS Gothic", Font.BOLD | Font.ITALIC, 45));
		lblNewLabel.setBackground(new Color(128, 255, 128));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(141, 11, 581, 84);
		contentPane.add(lblNewLabel);
		
		ImageIcon imagen4 = new ImageIcon(".//src/ImagenesProyecto/logousuario1.png");

		JLabel lblImagen = new JLabel(imagen4);

		lblImagen.setBounds(325, 82, 237, 234);

		contentPane.add(lblImagen);


		JLabel userLabel = new JLabel("USUARIO");
		userLabel.setBorder(new LineBorder(new Color(6, 6, 6), 2));
		userLabel.setHorizontalAlignment(SwingConstants.CENTER);
		userLabel.setForeground(new Color(6, 6, 6));
		userLabel.setFont(new Font("Noto Sans", Font.BOLD, 14));
		userLabel.setBounds(133, 338, 226, 54);
		contentPane.add(userLabel);

		textField = new JTextField();
		textField.setBackground(new Color(106, 242, 87));
		textField.setBounds(402, 352, 219, 31);
		contentPane.add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(106, 242, 87));
		passwordField.setBounds(402, 439, 219, 31);
		contentPane.add(passwordField);

		JButton btnNewButton = new JButton("enter");
		btnNewButton.setBackground(new Color(78, 228, 61));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Microsoft YaHei", Font.BOLD, 19));
		btnNewButton.setBounds(668, 484, 194, 78);
		contentPane.add(btnNewButton);

		JLabel lblTelefono = new JLabel("Telefono: 924842038");
		lblTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelefono.setForeground(new Color(0, 128, 0));
		lblTelefono.setFont(new Font("Dialog", Font.BOLD, 14));
		lblTelefono.setBounds(0, 572, 155, 39);
		contentPane.add(lblTelefono);

		JLabel lblAutosextremacargmailcom = new JLabel("Autosextremacar@gmail.com");
		lblAutosextremacargmailcom.setHorizontalAlignment(SwingConstants.CENTER);
		lblAutosextremacargmailcom.setForeground(new Color(0, 128, 0));
		lblAutosextremacargmailcom.setFont(new Font("Dialog", Font.BOLD, 14));
		lblAutosextremacargmailcom.setBounds(175, 572, 226, 39);
		contentPane.add(lblAutosextremacargmailcom);

		JLabel lblContrasea = new JLabel("CONTRASEÑA");
		lblContrasea.setHorizontalAlignment(SwingConstants.CENTER);
		lblContrasea.setForeground(new Color(6, 6, 6));
		lblContrasea.setFont(new Font("Dialog", Font.BOLD, 14));
		lblContrasea.setBorder(new LineBorder(new Color(6, 6, 6), 2));
		lblContrasea.setBounds(133, 425, 226, 54);
		contentPane.add(lblContrasea);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkLogin();
			}
		});

		passwordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkLogin();
			}
		});
	}

	private void checkLogin() {
		String username = textField.getText();
		String password = new String(passwordField.getPassword());

		if ("admin".equals(username) && "admin".equals(password)) {
			dispose();
			menu1 mainFrame = new menu1();
			mainFrame.setVisible(true);
			
		} else {
			JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}


		
	}



