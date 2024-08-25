
package Interfaces;
import Models.Marca;
import java.util.ArrayList;


public interface Marca_Interface <M> {
    public boolean createMarca(Marca mar);
    public ArrayList<Marca> getMarcas();
    public int listarOne(String marca);
    
}
