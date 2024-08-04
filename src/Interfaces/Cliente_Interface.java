
package Interfaces;
import Models.Cliente;
import Models.Persona;
import java.util.ArrayList;
import java.util.HashMap;

public interface Cliente_Interface {
    public boolean createClient(Persona per);
    public boolean updateClient(Cliente cli);
    public boolean deleteClient(int idcliente);
    public ArrayList<HashMap<String, Object>> listClient();
    
}
