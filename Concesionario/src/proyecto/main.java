package proyecto;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;

public class main {


	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
					inisesion1 inicio1 = new inisesion1();
					inicio1.setVisible(true);
				
				
				}
			
		});
	}

}
