
package ModelDAO;
import Connection.Conexion;
import Interfaces.Persona_Interface;
import Models.Persona;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonaDAO implements Persona_Interface {
    Conexion conexion = new Conexion();
    Connection connec;
    CallableStatement cs;
    ResultSet rs;
    Persona per;

    @Override
    public boolean insertPeople(Persona per) {
         // Convertir a Date
            Date fechaNac = per.getFechaNac();
        try{
            
            String queryInsert = "{CALL spu_personas_create(?,?,?,?,?)}";
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
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex); 
        }
        
        return false;
    }

    @Override
    public boolean updatePeople(Persona per) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean updatePeople(int idpersona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Persona> ListPersona() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
   

    
    
}
