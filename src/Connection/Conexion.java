
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
        
        String cadenaConecction = "jdbc:sqlserver://localhost:1433;"
                + "database=PRUEBA;"
                + "user=luisd;"
                + "password =060903;"
                + "loginTimeout=30;";
        try{
            Connection con = DriverManager.getConnection(cadenaConecction);
            return con;
            
        }catch(SQLException ex){
            System.out.println(ex.toString());
            return null;
            
        }

    
    }

    
}
