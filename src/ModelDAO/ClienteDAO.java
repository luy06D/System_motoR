
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
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteDAO implements Cliente_Interface{
    Conexion conexion = new Conexion();
    Connection connec;
    CallableStatement cs;
    ResultSet rs;
    Cliente cli;
    Persona per;
    

    @Override
    public boolean createClient(Persona per) {
            // COnvertir a Date
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
    public boolean updateClient(Cliente cli) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean deleteClient(int idcliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Cliente> listClient() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
