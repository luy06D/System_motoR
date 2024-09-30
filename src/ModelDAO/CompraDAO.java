
package ModelDAO;
import Connection.Conexion;
import Interfaces.Compra_Interface;
import Models.Detalle_orden;
import Models.Orden_compras;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
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

    @Override
    public int insertOrdenCompra(Orden_compras orden) {
        int idCompra = 0 ;
        
        try{
            
            String queryInsert = "{CALL spu_ordenC_register(?,?,?)}";
            connec = conexion.getConexion();
            cs = connec.prepareCall(queryInsert);
            
            cs.setInt(1, orden.getIdprovedor());
            cs.setString(2, orden.getNum_ordenC());
            cs.setDouble(3, orden.getTotal_costos());
            
            rs = cs.executeQuery();
            
            if(rs.next()){
               idCompra = rs.getInt(1);  
            }  
            
        }catch(Exception e){
            Logger.getLogger(CompraDAO.class.getName()).log(Level.SEVERE, null , e);
        }
       return idCompra;
    }
    

    @Override
    public boolean insertDetalleOrden(Detalle_orden det) {
       try{
           String insertDetalleOc = "{CALL spu_detalleOrden_register(?,?,?,?,?)}";
           connec = conexion.getConexion();
           cs = connec.prepareCall(insertDetalleOc);
           cs.setInt(1, det.getIdrepuesto());
           cs.setInt(2, det.getIdordencompra());
           cs.setInt(3, det.getCantidad());
           cs.setDouble(4, det.getPrecio_unitario());
           cs.setDouble(5, det.getSubtotal());
           
           cs.executeUpdate();
           connec.close();
           
       }catch(Exception ex){
           Logger.getLogger(CompraDAO.class.getName()).log(Level.SEVERE, null , ex); 
       }
       
       return false;
    }
    
    
    
}
