    
package Interfaces;

import Models.Persona;
import java.util.ArrayList;

public interface Persona_Interface {
    public boolean insertPeople(Persona per);
    public boolean updatePeople(Persona per);
    public boolean updatePeople(int idpersona);
    public ArrayList<Persona> ListPersona();
    
}
