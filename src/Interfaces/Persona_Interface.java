    
package Interfaces;

import Models.Persona;
import java.util.ArrayList;

public interface Persona_Interface {
    public boolean insertPeople(Persona p);
    public boolean updatePeople(Persona p);
    public boolean updatePeople(int idpersona);
    public ArrayList<Persona> ListPersona();
    
}
