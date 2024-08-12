
package ModelDAO;

import Interfaces.Usuario_Interface;
import Models.Usuario;
import Connection.Conexion;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO implements Usuario_Interface{
    Conexion conexion = new Conexion();
    Connection connec;
    CallableStatement cs;
    ResultSet rs;
    Usuario usu;
    
    @Override
    public Usuario Login(String username, String password) {
       try{
           String queryLogin = "{CALL spu_usuarios_login(?)}";
           connec = conexion.getConexion();
           cs = connec.prepareCall(queryLogin);
           cs.setString(1, username);
          // cs.setString(2, password);
           rs = cs.executeQuery();
           if(rs.next()){
               usu = new Usuario();
               usu.setIdusuario(rs.getInt("idusuario"));
               usu.setUsername(rs.getString("username"));
               usu.setClave_acceso(rs.getString("clave_acceso"));
               usu.setNivel_acceso(rs.getString("nivel_acceso"));                  
           }  
           
       }catch(Exception ex){
           Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);     
       }
       
       return usu;
    }

    @Override
    public boolean createUser(Usuario usu) {
        try{
            String queryInsert = "{CALL spu_usuarios_create(?,?,?,?)}";
            connec = conexion.getConexion();
            cs = connec.prepareCall(queryInsert);
            cs.setInt(1, usu.getIdpersona());
            cs.setString(2, usu.getUsername());
            cs.setString(2, usu.getClave_acceso());
            cs.setString(2, usu.getNivel_acceso());
            
            cs.executeUpdate();
            connec.close();
            
        }catch(Exception ex){
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex); 
        }
        
        return false;
    }

    @Override
    public boolean updateUser(Usuario usu) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean deleteUser(int idusuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Usuario> listUsuarios() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
