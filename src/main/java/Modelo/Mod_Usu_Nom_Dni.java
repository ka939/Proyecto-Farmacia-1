
package Modelo;

/**
 *
 * @author NARAKU_001
 */
public class Mod_Usu_Nom_Dni {
    
    private int dni;
    private String nombre;

    public Mod_Usu_Nom_Dni() {
    }

    public Mod_Usu_Nom_Dni(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
