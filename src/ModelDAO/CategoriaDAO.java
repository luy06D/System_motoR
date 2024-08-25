
package ModelDAO;
import Connection.Conexion;
import Interfaces.Categoria_Interface;
import Models.Categoria;

import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CategoriaDAO implements Categoria_Interface {
    
    Conexion conexion = new Conexion();
    Connection connec;
    CallableStatement cs;
    PreparedStatement ps;
    ResultSet rs;
    Categoria cat;
    
    ArrayList<Categoria> vc = new ArrayList<>();

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

    @Override
    public ArrayList<Categoria> getCategorias() {
        try{
            String querySelect = "SELECT * FROM CATEGORIAS";
            connec = conexion.getConexion();
            ps = connec.prepareStatement(querySelect);
            rs = ps.executeQuery();
            while(rs.next()){
                cat = new Categoria();
                cat.setIdcategoria(Integer.parseInt(rs.getString("idcategoria")));
                cat.setCategoria(rs.getString("categoria"));
                vc.add(cat);
            }
            
            connec.close();
            
        }catch(Exception ex){
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null , ex);  
        }
        
        return vc;

    }

    @Override
    public int listarOne(String categoria) {
          int idCategoria = -1;
         try{
            String querySelect = "SELECT * FROM CATEGORIAS WHERE categoria=?";
            connec = conexion.getConexion();
            ps = connec.prepareStatement(querySelect);
            ps.setString(1, categoria);
            rs = ps.executeQuery();
            if(rs.next()){
                cat = new Categoria();
                idCategoria = rs.getInt("idcategoria");
                    
            }
            
            connec.close();
            
        }catch(Exception ex){
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null , ex);   
        }
        
        return idCategoria;
       
    }
    
    
    
}
