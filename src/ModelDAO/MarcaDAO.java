
package ModelDAO;
import Connection.Conexion;
import Interfaces.Marca_Interface;
import Models.Marca;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MarcaDAO implements Marca_Interface {
    Conexion conexion = new Conexion();
    Connection connec;
    CallableStatement cs;
    ResultSet rs;
    Marca mar;

    @Override
    public boolean createMarca(Marca mar) {
        try{
            String queryInsert = "{CALL spu_marcas_create(?)}";
            connec = conexion.getConexion();
            cs = connec.prepareCall(queryInsert);
            cs.setString(1, mar.getMarca());
            
            cs.executeUpdate();
            connec.close();
            
        }catch(Exception ex){
           Logger.getLogger(MarcaDAO.class.getName()).log(Level.SEVERE, null , ex);   
        }
        
    return false;
    }
    
}
