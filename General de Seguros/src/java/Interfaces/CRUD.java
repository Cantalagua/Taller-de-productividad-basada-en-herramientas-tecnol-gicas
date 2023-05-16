
package Interfaces;

import Modelo.Persona;
import java.util.List;

/**
 *
 * @author Alexis Murillo
 */
public interface CRUD {
    public List listar();
    public Persona list(int id);
    public boolean add(Persona per);
    
}
