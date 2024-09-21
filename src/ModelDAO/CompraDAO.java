
package ModelDAO;
import Connection.Conexion;
import Interfaces.Compra_Interface;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CompraDAO implements Compra_Interface {
    Conexion conexion = new Conexion();
    Connection connec;
    CallableStatement cs;
    ResultSet rs;
    
    ArrayList<HashMap<String, Object>> vectorRep = new ArrayList<>();

    @Override
    public ArrayList<HashMap<String, Object>> listRep_oc(String search) {
        try{
            String querySearch = "{CALL spu_product_buscar(?)}";
            connec = conexion.getConexion();
            cs = connec.prepareCall(querySearch);
            cs.setString(1, search);
            rs = cs.executeQuery();
            while(rs.next()){
                HashMap<String, Object> map = new HashMap<>();
                map.put("idrepuesto", rs.getInt("idrepuesto"));
                map.put("nombreR", rs.getString("nombreR"));
                map.put("marca", rs.getString("marca"));
                map.put("modelo", rs.getString("modelo"));
                map.put("categoria", rs.getString("categoria"));
                map.put("unidad_med", rs.getString("unidad_med"));
                vectorRep.add(map);
            }
            
        }catch(Exception ex){
             Logger.getLogger(CompraDAO.class.getName()).log(Level.SEVERE, null , ex);  
        }
        
        return vectorRep;
    }

    @Override
    public ArrayList<HashMap<String, Object>> listRepuesto(int idrepuesto) {
         try{
            String querySearch = "{CALL spu_getRepuesto(?)}";
            connec = conexion.getConexion();
            cs = connec.prepareCall(querySearch);
            cs.setInt(1, idrepuesto);
            rs = cs.executeQuery();
            while(rs.next()){
                HashMap<String, Object> map = new HashMap<>();
                map.put("idrepuesto", rs.getInt("idrepuesto"));
                map.put("nombreR", rs.getString("nombreR"));
                map.put("marca", rs.getString("marca"));
                map.put("modelo", rs.getString("modelo"));
                map.put("categoria", rs.getString("categoria"));
                map.put("unidad_med", rs.getString("unidad_med"));
                vectorRep.add(map);
            }
            
        }catch(Exception ex){
             Logger.getLogger(CompraDAO.class.getName()).log(Level.SEVERE, null , ex);  
        }
        
        return vectorRep;
        
    }
    
    
    
}
