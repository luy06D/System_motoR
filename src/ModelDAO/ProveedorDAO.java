
package ModelDAO;
import Connection.Conexion;
import Models.Proveedor;
import Interfaces.Provedor_Interface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProveedorDAO implements Provedor_Interface{
    Conexion conexion = new Conexion();
    Connection connec;
    PreparedStatement ps;
    ResultSet rs;
    Proveedor pro;
    
    ArrayList<Proveedor> vp = new ArrayList<>();

    @Override
    public ArrayList<Proveedor> getProvedor() {
        
        try{
            String getQuery = "SELECT * FROM PROVEEDORES";
            connec = conexion.getConexion();
            ps = connec.prepareStatement(getQuery);
            rs = ps.executeQuery();
            while(rs.next()){
                pro = new Proveedor();
                pro.setIdprovedor(rs.getInt("idprovedor"));
                pro.setRazon_social(rs.getString("razon_social"));
                vp.add(pro);
                
            }
            
            connec.close();

        }catch(Exception ex){
            Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null , ex);   
        }
        return vp;

    }

    @Override
    public int listarOne(String provedor) {
        int idProvedor = -1;
         try{
            String querySelect = "SELECT * FROM PROVEEDORES WHERE razon_social=?";
            connec = conexion.getConexion();
            ps = connec.prepareStatement(querySelect);
            ps.setString(1, provedor);
            rs = ps.executeQuery();
            if(rs.next()){
                pro = new Proveedor();
                idProvedor = rs.getInt("idprovedor");
                    
            }
            
            connec.close();
            
        }catch(Exception ex){
            Logger.getLogger(MarcaDAO.class.getName()).log(Level.SEVERE, null , ex);   
        }
        
        return idProvedor;
    }
    
    
    
}
