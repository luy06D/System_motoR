
package Interfaces;
import Models.Cliente;
import java.util.ArrayList;

public interface Cliente_Interface {
    public boolean createClient(Cliente cli);
    public boolean updateClient(Cliente cli);
    public boolean deleteClient(int idcliente);
    public ArrayList<Cliente> listClient();
    
}
