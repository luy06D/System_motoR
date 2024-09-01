
package ModelDAO;
import Connection.Conexion;
import Interfaces.Repuesto_Interface;
import Models.Repuesto;
import java.util.ArrayList;
import java.util.HashMap;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RepuestoDAO implements Repuesto_Interface{
    Conexion conexion = new Conexion();
    Connection connec;
    CallableStatement cs;
    ResultSet rs;
    Repuesto rep;
    
    ArrayList<HashMap<String, Object>> vectorRep = new ArrayList<>();

    @Override
    public boolean insertRepuesto(Repuesto rep) {
        try{
            String querInsert = "{CALL spu_repuestos_create(?,?,?,?,?,?,?,?)}";
            connec = conexion.getConexion();
            cs = connec.prepareCall(querInsert);
              cs.setInt(1, rep.getIdcategoria());
            cs.setInt(2, rep.getIdmarca());
            cs.setString(3, rep.getNombreR());
            cs.setString(4, rep.getModelo());
            cs.setDouble(5, rep.getPrecio());
            cs.setString(6, rep.getUnidad_med());
            cs.setString(7, rep.getGarantia());
            cs.setString(8, rep.getDescripcion());
            
            cs.executeUpdate();
            connec.close();
            
        }catch(Exception ex){
          Logger.getLogger(RepuestoDAO.class.getName()).log(Level.SEVERE, null , ex);    
        }
        
        return false;
    }

    @Override
    public boolean updateRepuesto(Repuesto rep) {
           try{
            String querInsert = "{CALL spu_repuestos_update(?,?,?,?,?,?,?,?)}";
            connec = conexion.getConexion();
            cs = connec.prepareCall(querInsert);
            cs.setInt(1, rep.getIdrepuesto());
            cs.setInt(2, rep.getIdcategoria());
            cs.setInt(3, rep.getIdmarca());
            cs.setString(4, rep.getNombreR());
            cs.setString(5, rep.getModelo());
            cs.setDouble(6, rep.getPrecio());
            cs.setString(7, rep.getUnidad_med());
            cs.setString(8, rep.getGarantia());
          //  cs.setString(9, rep.getDescripcion());
            
            cs.executeUpdate();
            connec.close();
            
        }catch(Exception ex){
          Logger.getLogger(RepuestoDAO.class.getName()).log(Level.SEVERE, null , ex);    
        }
        
        return false;
        
    }

    @Override
    public boolean deleteRepuesto(int idrepuesto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<HashMap<String, Object>> listRepuestos() {
        try{
            String querySelect = "{CALL spu_repuestos_listar()}";
            connec = conexion.getConexion();
            cs = connec.prepareCall(querySelect);
            rs = cs.executeQuery();
            while(rs.next()){
                HashMap<String, Object> map = new HashMap<>();
                map.put("idrepuesto", rs.getInt("idrepuesto"));
                map.put("nombreR", rs.getString("nombreR"));
                map.put("marca", rs.getString("marca"));
                map.put("modelo", rs.getString("modelo"));
                map.put("categoria", rs.getString("categoria"));
                map.put("precio", rs.getDouble("precio"));
                map.put("stock", rs.getInt("stock"));
                map.put("unidad_med", rs.getString("unidad_med"));
                map.put("garantia", rs.getString("garantia"));
                map.put("estado", rs.getString("estado"));
                map.put("create_at", rs.getString("create_at"));
                vectorRep.add(map);
                
            }
                      
        }catch(Exception ex){
            Logger.getLogger(RepuestoDAO.class.getName()).log(Level.SEVERE, null , ex);  
        }
        
        return vectorRep;
        
    }

   
    
    
}
