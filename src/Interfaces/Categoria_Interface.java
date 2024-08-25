
package Interfaces;

import Models.Categoria;
import java.util.ArrayList;

public interface Categoria_Interface {
    public boolean createCategoria(Categoria cat);
    public boolean deleteCategoria(int idcategoria);
    public ArrayList<Categoria> getCategorias();
    public int listarOne(String categoria);
    
}
