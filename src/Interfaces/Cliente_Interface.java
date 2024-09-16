
package Interfaces;
import Models.Persona;
import java.util.ArrayList;
import java.util.HashMap;

public interface Cliente_Interface {
    public boolean createClient(Persona per);
    public boolean updateClient(Persona p);
    public boolean deleteClient(int idpersona);
    public ArrayList<HashMap<String, Object>> listClient();
    
}
