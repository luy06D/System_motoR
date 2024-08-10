
package ModelDAO;
import Connection.Conexion;
import Interfaces.Categoria_Interface;
import Models.Categoria;

import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CategoriaDAO implements Categoria_Interface {
    
    Conexion conexion = new Conexion();
    Connection connec;
    CallableStatement cs;
    ResultSet rs;
    Categoria cat;

    @Override
    public boolean createCategoria(Categoria cat) {
        try{
            String queryInsert = "{CALL spu_categorias_create(?,?)}";
            connec = conexion.getConexion();
            cs = connec.prepareCall(queryInsert);
            cs.setString(1, cat.getCategoria());
            cs.setString(2, cat.getDescripcion());
            cs.executeUpdate();
            connec.close();
            
        }catch(Exception ex){
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null , ex);  
            
        }
        
        return false;
    }

    @Override
    public boolean deleteCategoria(int idcategoria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
