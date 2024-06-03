package proyecto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class consultas {
	
	
	public static void comprarCoche(String marca1, String modelo1, String color1, String puertas1, String fecha1, String kilometros1, String combustible1) {
        Connection conn = null;
        PreparedStatement coche = null;

        try {
            conn = conexion.getConnection(); 

            StringBuilder cocheInfo = new StringBuilder();

            cocheInfo.append("\nMarca: ").append(marca1)
                     .append("\nModelo: ").append(modelo1)
                     .append("\nColor: ").append(color1)
                     .append("\nNumero de puertas: ").append(puertas1)
                     .append("\nFecha: ").append(fecha1)
                     .append("\nCombustible: ").append(combustible1)
                     .append("\nKilometros: ").append(kilometros1);

            int confirm = JOptionPane.showConfirmDialog(null, "¿Desea comprar el siguiente coche?\n\n" + cocheInfo.toString(), "Confirmar", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                String sqlCompra = "INSERT INTO cochescompra (marca, modelo, color, numero_puertas, fecha_matriculacion, combustible, kilometros) VALUES (?, ?, ?, ?, ?, ?, ?)";

                coche = conn.prepareStatement(sqlCompra);
                coche.setString(1, marca1);
                coche.setString(2, modelo1);
                coche.setString(3, color1);
                coche.setString(4, puertas1);
                coche.setString(5, fecha1);
                coche.setString(6, combustible1);
                coche.setString(7, kilometros1);

                int rowsInserted = coche.executeUpdate();

                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(null, "Tu coche ha sido comprado correctamente. Gracias :)");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo realizar la compra.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Compra cancelada.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al comprar el coche: " + e.getMessage());
        } finally {
            try {
                if (coche != null) coche.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
	
	public static void venderCochePorID(String id) {
        Connection conn = null;
        PreparedStatement selectStmt = null;
        PreparedStatement insertStmt = null;
        PreparedStatement deleteStmt = null;
        ResultSet rs = null;

        try {
            conn = conexion.getConnection();

           
            String selectSQL = "SELECT * FROM CochesVenta WHERE id = ?";
            selectStmt = conn.prepareStatement(selectSQL);
            selectStmt.setString(1, id);
            rs = selectStmt.executeQuery();

            if (rs.next()) {
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                String color = rs.getString("color");
                int numero_puertas = rs.getInt("numero_puertas");
                String fecha_matriculacion = rs.getString("fecha_matriculacion");
                String combustible = rs.getString("combustible");
                int kilometros = rs.getInt("kilometros");

               
                StringBuilder cocheInfo = new StringBuilder();
                cocheInfo.append("Marca: ").append(marca).append("\nModelo: ").append(modelo)
                         .append("\nColor: ").append(color).append("\nNúmero de puertas: ").append(numero_puertas)
                         .append("\nFecha matriculación: ").append(fecha_matriculacion)
                         .append("\nCombustible: ").append(combustible).append("\nKilómetros: ").append(kilometros);

                int confirm = JOptionPane.showConfirmDialog(null, "¿Desea vender el siguiente coche?\n\n" + cocheInfo.toString(), "Confirmar Venta", JOptionPane.YES_NO_OPTION);

                if (confirm == JOptionPane.YES_OPTION) {
                    String nombreComprador = JOptionPane.showInputDialog("Ingrese el nombre completo del comprador:");

                    
                    String insertSQL = "INSERT INTO CochesFacturados (marca, modelo, color, numero_puertas, fecha_matriculacion, combustible, kilometros) VALUES (?, ?, ?, ?, ?, ?, ?)";
                    insertStmt = conn.prepareStatement(insertSQL);
                    insertStmt.setString(1, marca);
                    insertStmt.setString(2, modelo);
                    insertStmt.setString(3, color);
                    insertStmt.setInt(4, numero_puertas);
                    insertStmt.setString(5, fecha_matriculacion);
                    insertStmt.setString(6, combustible);
                    insertStmt.setInt(7, kilometros);
                    insertStmt.executeUpdate();

                    
                    String deleteSQL = "DELETE FROM CochesVenta WHERE id = ?";
                    deleteStmt = conn.prepareStatement(deleteSQL);
                    deleteStmt.setString(1, id);
                    deleteStmt.executeUpdate();

                    JOptionPane.showMessageDialog(null, "El coche ha sido vendido correctamente a " + nombreComprador);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningún coche con el ID especificado.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al vender el coche: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (selectStmt != null) selectStmt.close();
                if (insertStmt != null) insertStmt.close();
                if (deleteStmt != null) deleteStmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

	
	
	
	  public static void buscarCoche(String marca1, String modelo1, String color1, String numeropuertas1, String fecha1, String kilometros1, String combustible1) {
	        
		  try {
	            
	            Connection conn = conexion.getConnection();

	           
	            StringBuilder sql = new StringBuilder("SELECT * FROM CochesVenta WHERE ");
	            boolean firstCondition = true;

	            if (marca1 != null && !marca1.isEmpty()) {
	                sql.append("marca LIKE ?");
	                firstCondition = false;
	            }
	            if (modelo1 != null && !modelo1.isEmpty()) {
	                if (!firstCondition) sql.append(" OR ");
	                sql.append("modelo LIKE ?");
	                firstCondition = false;
	            }
	            if (color1 != null && !color1.isEmpty()) {
	                if (!firstCondition) sql.append(" OR ");
	                sql.append("color LIKE ?");
	                firstCondition = false;
	            }
	            if (numeropuertas1 != null && !numeropuertas1.isEmpty()) {
	                if (!firstCondition) sql.append(" OR ");
	                sql.append("numero_puertas LIKE ?");
	                firstCondition = false;
	            }
	            if (fecha1 != null && !fecha1.isEmpty()) {
	                if (!firstCondition) sql.append(" OR ");
	                sql.append("fecha_matriculacion LIKE ?");
	                firstCondition = false;
	            }
	            if (kilometros1 != null && !kilometros1.isEmpty()) {
	                if (!firstCondition) sql.append(" OR ");
	                sql.append("kilometros LIKE ?");
	                firstCondition = false;
	            }
	            if (combustible1 != null && !combustible1.isEmpty()) {
	                if (!firstCondition) sql.append(" OR ");
	                sql.append("combustible LIKE ?");
	                firstCondition = false;
	            }

	            PreparedStatement stmt = conn.prepareStatement(sql.toString());

	            int paramIndex = 1;
	            if (marca1 != null && !marca1.isEmpty()) {
	                stmt.setString(paramIndex++, "%" + marca1 + "%");
	            }
	            if (modelo1 != null && !modelo1.isEmpty()) {
	                stmt.setString(paramIndex++, "%" + modelo1 + "%");
	            }
	            if (color1 != null && !color1.isEmpty()) {
	                stmt.setString(paramIndex++, "%" + color1 + "%");
	            }
	            if (numeropuertas1 != null && !numeropuertas1.isEmpty()) {
	                stmt.setString(paramIndex++, "%" + numeropuertas1 + "%");
	            }
	            if (fecha1 != null && !fecha1.isEmpty()) {
	                stmt.setString(paramIndex++, "%" + fecha1 + "%");
	            }
	            if (kilometros1 != null && !kilometros1.isEmpty()) {
	                stmt.setString(paramIndex++, "%" + kilometros1 + "%");
	            }
	            if (combustible1 != null && !combustible1.isEmpty()) {
	                stmt.setString(paramIndex++, "%" + combustible1 + "%");
	            }

	            
	            ResultSet rs = stmt.executeQuery();

	          
	            StringBuilder resultados = new StringBuilder();
	            while (rs.next()) {
	                resultados.append("ID: ").append(rs.getInt("id"))
	                          .append("\nMarca: ").append(rs.getString("marca"))
	                          .append("\nModelo: ").append(rs.getString("modelo"))
	                          .append("\nColor: ").append(rs.getString("color"))
	                          .append("\nNúmero de puertas: ").append(rs.getInt("numero_puertas"))
	                          .append("\nFecha de matriculación: ").append(rs.getString("fecha_matriculacion"))
	                          .append("\nCombustible: ").append(rs.getString("combustible"))
	                          .append("\nKilómetros: ").append(rs.getInt("kilometros"))
	                          .append("\n\n");
	            }

	           
	            if (resultados.length() > 0) {
	                JOptionPane.showMessageDialog(null, resultados.toString(), "Resultados de la búsqueda", JOptionPane.INFORMATION_MESSAGE);
	            } else {
	                JOptionPane.showMessageDialog(null, "No se encontraron resultados", "Resultados de la búsqueda", JOptionPane.INFORMATION_MESSAGE);
	            }

	         
	            rs.close();
	            stmt.close();
	            conn.close();

	        } catch (Exception e) {
	            e.printStackTrace();
	            JOptionPane.showMessageDialog(null, "Error al buscar en la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
	        }
	    }
	
	
	

}
