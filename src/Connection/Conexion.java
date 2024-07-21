
package Connection;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
    
        Connection conn;

    public Connection getConexion() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=PRUEBA", "root", "password");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
      public static void main(String[] args) {
        Conexion conexion = new Conexion();
        Connection conn = conexion.getConexion();
        
        if (conn != null) {
            System.out.println("La conexión se ha establecido correctamente.");
            try {
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT 1");
                if (rs.next()) {
                    System.out.println("La consulta de prueba fue exitosa: " + rs.getInt(1));
                }
            } catch (SQLException ex) {
                System.out.println("Error al ejecutar la consulta: " + ex.getMessage());
            }
        } else {
            System.out.println("No se pudo establecer la conexión.");
        }
    }
    
}
