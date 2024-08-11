
package ModelDAO;

import Connection.Conexion;
import Interfaces.Cliente_Interface;
import Models.Cliente;
import Models.Persona;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteDAO implements Cliente_Interface{
    Conexion conexion = new Conexion();
    Connection connec;
    CallableStatement cs;
    ResultSet rs;
    Cliente cli;
    Persona per;
    
    ArrayList<HashMap<String, Object>> vectorCli = new ArrayList<>();
    

    @Override
    public boolean createClient(Persona per) {
            // Convertir a Date
            Date fechaNac = per.getFechaNac();
        try{
            String queryInsert = "{CALL spu_clientes_create(?,?,?,?,?)}";  
            connec = conexion.getConexion();
            cs = connec.prepareCall(queryInsert);
            cs.setString(1, per.getNombres());
            cs.setString(2, per.getApellidos());
            cs.setString(3, per.getDni());
            cs.setDate(4, (java.sql.Date) fechaNac);
            cs.setString(5, per.getTelefono());
            
            cs.executeUpdate();
            connec.close();
  
        }catch(Exception ex){
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null , ex);  
        }
        
        return false;
    }

    @Override
    public boolean updateClient(Persona per) {
            // Convertir a Date
            Date fechaNac = per.getFechaNac();
        try{
            String queryInsert = "{CALL spu_personas_update(?,?,?,?,?,?)}";  
            connec = conexion.getConexion();
            cs = connec.prepareCall(queryInsert);
            cs.setInt(1, per.getIdpersona());
            cs.setString(2, per.getNombres());
            cs.setString(3, per.getApellidos());
            cs.setString(4, per.getDni());
            cs.setDate(5, (java.sql.Date) fechaNac);
            cs.setString(6, per.getTelefono());
            
            cs.executeUpdate();
            connec.close();
  
        }catch(Exception ex){
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null , ex);  
        }
        
        return false;
    }

    @Override
    public boolean deleteClient(int idpersona) {
        try{
            
            String queryDelete = "CALL spu_clientes_delete(?)";
            connec = conexion.getConexion();
            cs = connec.prepareCall(queryDelete);
            cs.setInt(1, idpersona);
            
            cs.executeUpdate();
            connec.close();
            
        }catch(Exception ex){
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null , ex);  
        }
        
        return false;
    }

    @Override
    public ArrayList<HashMap<String, Object>> listClient() {
        
        try{
            String querySelect = "{CALL spu_clientes_listar()}";
            connec = conexion.getConexion();
            cs = connec.prepareCall(querySelect);
            rs = cs.executeQuery();
            
            while(rs.next()){       
                HashMap<String, Object> map = new HashMap<>();
                map.put("idcliente", rs.getInt("idcliente"));
                map.put("idpersona", rs.getInt("idpersona"));
                map.put("nombres", rs.getString("nombres"));
                map.put("apellidos", rs.getString("apellidos"));
                map.put("dni", rs.getString("dni"));
                map.put("fechaNac", rs.getDate("fechaNac").toLocalDate());
                map.put("telefono", rs.getString("telefono"));
                map.put("estado", rs.getString("estado"));
                vectorCli.add(map);
            }
            
        }catch(Exception ex){
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null , ex);  
        }
        
        return vectorCli;
       
    }

  
    
}
