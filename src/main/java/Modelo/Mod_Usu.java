/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author NARAKU_001
 */
public class Mod_Usu {
    
    private int dni;
    private String nombre;
    private String apellido;
    private int telefono;
    private String direccion;
    private String correo;
    private String usuario;
    private String password;

    public Mod_Usu() {
    }

    public Mod_Usu(int dni, String nombre, String apellido, int telefono, String direccion, String correo, String usuario, String password) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.usuario = usuario;
        this.password = password;
    }

    public Mod_Usu(String nombre, String apellido, int telefono, String direccion, String correo, String usuario, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.usuario = usuario;
        this.password = password;
    }

    public Mod_Usu(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
}
