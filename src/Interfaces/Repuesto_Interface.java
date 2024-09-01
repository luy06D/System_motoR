
package Interfaces;
import Models.Repuesto;
import java.util.ArrayList;
import java.util.HashMap;

public interface Repuesto_Interface {
    public boolean insertRepuesto(Repuesto rep);
    public boolean updateRepuesto(Repuesto rep);
    public boolean deleteRepuesto(int idrepuesto);
    public ArrayList<HashMap<String, Object>> listRepuestos();
    public ArrayList<HashMap<String, Object>> listRepuestosCate(int idcategoria);
    
    
}
