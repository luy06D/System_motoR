
package ModelDAO;
import Connection.Conexion;
import Interfaces.Marca_Interface;
import Models.Marca;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MarcaDAO implements Marca_Interface {
    Conexion conexion = new Conexion();
    Connection connec;
    CallableStatement cs;
    PreparedStatement ps;
    ResultSet rs;
    Marca mar;
    
    ArrayList<Marca> vm = new ArrayList<>();

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

    @Override
    public ArrayList<Marca> getMarcas() {
        try{
            String querySelect = "SELECT * FROM MARCAS";
            connec = conexion.getConexion();
            ps = connec.prepareStatement(querySelect);
            rs = ps.executeQuery();
            while(rs.next()){
                mar = new Marca();
                mar.setIdmarca(Integer.parseInt(rs.getString("idmarca")));
                mar.setMarca(rs.getString("marca"));
                vm.add(mar);
            }
            
            connec.close();
            
        }catch(Exception ex){
            Logger.getLogger(MarcaDAO.class.getName()).log(Level.SEVERE, null , ex);   
        }
        
        return vm;
    }

    @Override
    public int listarOne(String marca) {
        int idMarca = -1;
         try{
            String querySelect = "SELECT * FROM MARCAS WHERE marca=?";
            connec = conexion.getConexion();
            ps = connec.prepareStatement(querySelect);
            ps.setString(1, marca);
            rs = ps.executeQuery();
            if(rs.next()){
                mar = new Marca();
                idMarca = rs.getInt("idmarca");
                    
            }
            
            connec.close();
            
        }catch(Exception ex){
            Logger.getLogger(MarcaDAO.class.getName()).log(Level.SEVERE, null , ex);   
        }
        
        return idMarca;
        
    }
    
    
    
}
