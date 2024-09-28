
package Interfaces;
import java.util.ArrayList;
import java.util.HashMap;
import Models.Detalle_orden;
import Models.Orden_compras;

public interface Compra_Interface {
   public ArrayList<HashMap<String, Object>> listRep_oc(String search);
   public ArrayList<HashMap<String, Object>> listRepuesto(int idrepuesto);
   public boolean insertOrdenCompra(Orden_compras orden);
   public boolean insertDetalleOrden(Detalle_orden orden);
   

}
