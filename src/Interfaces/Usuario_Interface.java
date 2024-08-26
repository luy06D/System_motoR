
package Interfaces;

import Models.Usuario;
import java.util.ArrayList;

public interface Usuario_Interface {
    public Usuario Login(String username);
    public boolean createUser(Usuario usu);
    public boolean updateUser(Usuario usu);
    public boolean deleteUser(int idusuario);
    public ArrayList<Usuario> listUsuarios();
    
}
    