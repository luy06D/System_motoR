
package Interfaces;
import java.util.ArrayList;
import java.util.HashMap;

public interface Compra_Interface {
   public ArrayList<HashMap<String, Object>> listRep_oc(String search);
   public ArrayList<HashMap<String, Object>> listRepuesto(int idrepuesto); 
}
