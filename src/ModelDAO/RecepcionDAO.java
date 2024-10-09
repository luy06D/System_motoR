
package ModelDAO;

import Connection.Conexion;
import Models.Kardex;
import Models.Recepcion_producto;
import Interfaces.Recepcion_Interface;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RecepcionDAO implements Recepcion_Interface{
    
    Conexion conexion = new Conexion();
    Connection connec;
    CallableStatement cs;
    ResultSet rs;
    Recepcion_producto rp;
    
    ArrayList<HashMap<String, Object>> vectorPend = new ArrayList<>();

    @Override
    public ArrayList<HashMap<String, Object>> listPendiente() {
        
        try{
            String queryList = "{CALL spu_ordenes_listar()}";
            connec = conexion.getConexion();
            cs = connec.prepareCall(queryList);
            rs = cs.executeQuery();
            
            while(rs.next()){
                HashMap<String, Object> map = new HashMap<>();
                map.put("razon_social", rs.getString("razon_social"));
                map.put("num_ordenC", rs.getInt("num_ordenC"));
                map.put("estado", rs.getString("estado"));
                map.put("subtotal", rs.getDouble("subtotal"));
                map.put("total_costos", rs.getDouble("total_costos"));
                vectorPend.add(map);
                
            }
            
        }catch(Exception ex){
            Logger.getLogger(RecepcionDAO.class.getName()).log(Level.SEVERE, null , ex);  
        }
        return vectorPend;
        
    }
    
}
