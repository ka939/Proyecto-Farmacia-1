/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import static Conexion.Conexion.getConex;
import Modelo.Mod_Usu;
import Modelo.Mod_Usu_Nom_Dni;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NARAKU_001
 */
public class Neg_Usu {
    
        public int registrar(Modelo.Mod_Usu car) {
        int rst = 0;
        String sp = "insert into usuario values(?,?,?,?,?,?,?,?)";
        try {
          
            CallableStatement csmt = getConex().prepareCall(sp);

            csmt.setInt(1, car.getDni());
            csmt.setString(2, car.getNombre());
            csmt.setString(3, car.getApellido());
            csmt.setInt(4, car.getTelefono());
            csmt.setString(5, car.getDireccion());
            csmt.setString(6, car.getCorreo());
            csmt.setString(7, car.getUsuario());
            csmt.setString(8, car.getPassword());


            
            rst = csmt.executeUpdate();
        } catch (SQLException e) {
        }
        return rst;
    }
        public List<Mod_Usu> listar() {
        Mod_Usu proveedor;
        List<Mod_Usu> lis_emp = new ArrayList<Mod_Usu>();
        String query = "select * from usuario ";
        try {
            
            PreparedStatement psmt = getConex().prepareStatement(query);
            ResultSet rs = psmt.executeQuery();
            while (rs.next()) {
                proveedor = new Mod_Usu();
                proveedor.setDni(rs.getInt("dni"));
                proveedor.setNombre(rs.getString("nombre_usu"));
                proveedor.setApellido(rs.getString("apellido"));
                proveedor.setTelefono(rs.getInt("telefono"));
                proveedor.setDireccion(rs.getString("direccion"));
                proveedor.setCorreo(rs.getString("correo"));
                proveedor.setUsuario(rs.getString("usuario"));
                proveedor.setPassword(rs.getString("password"));
         
                lis_emp.add(proveedor);
            }
        } catch (Exception e) {
        }
        return lis_emp;

    }
        
        
             public int eliminar(int id) {
        int rst = 0;
        String sp = "delete from usuario where dni=?";
        try {
            CallableStatement csmt = getConex().prepareCall(sp);
            csmt.setInt(1, id);
            rst = csmt.executeUpdate();
        } catch (SQLException e) {
        }
        return rst;
    }
             
        public int modificar(Mod_Usu cli) {
        int rst = 0;
        String sp = "update usuario set nombre_usu=?,apellido=?,telefono=?,direccion=?,correo=?,usuario=?,password=? where dni=?;";
        try {
            CallableStatement csmt = getConex().prepareCall(sp);

            csmt.setString(1, cli.getNombre());
            csmt.setString(2, cli.getApellido());
            csmt.setInt(3, cli.getTelefono());
            csmt.setString(4, cli.getDireccion());
            csmt.setString(5, cli.getCorreo());
            csmt.setString(6, cli.getUsuario());
            csmt.setString(7, cli.getPassword());
            csmt.setInt(8, cli.getDni());

            rst = csmt.executeUpdate();
        } catch (SQLException e) {
        }
        return rst;
    } 


    public List<Mod_Usu> buscar(int id) {
        Mod_Usu producto;
        List<Mod_Usu> lis_pro = new ArrayList<Mod_Usu>();
        String query = "select * from usuario where dni=?";
        try {
            PreparedStatement psmt = getConex().prepareStatement(query);
            psmt.setInt(1, id);

            ResultSet rs = psmt.executeQuery();
            while (rs.next()) {
                producto = new Mod_Usu();
                producto.setDni(rs.getInt("dni"));
                producto.setNombre(rs.getString("nombre_usu"));
                producto.setApellido(rs.getString("apellido"));
                producto.setTelefono(rs.getInt("telefono"));
                producto.setDireccion(rs.getString("direccion"));
                producto.setCorreo(rs.getString("correo"));
                producto.setUsuario(rs.getString("usuario"));
                producto.setPassword(rs.getString("password"));

                lis_pro.add(producto);
            }
        } catch (Exception e) {
        }
        return lis_pro;
    }
    
    public List<Mod_Usu_Nom_Dni> listar_dni_nom() {
        Mod_Usu_Nom_Dni proveedor;
        List<Mod_Usu_Nom_Dni> lis_emp = new ArrayList<Mod_Usu_Nom_Dni>();
        String query = "  select dni,nombre_USU from usuario";
        try {
            PreparedStatement psmt = getConex().prepareStatement(query);
            ResultSet rs = psmt.executeQuery();
            while (rs.next()) {
                proveedor = new Mod_Usu_Nom_Dni();
                proveedor.setDni(rs.getInt("dni"));
                proveedor.setNombre(rs.getString("nombre_usu"));

                lis_emp.add(proveedor);
            }
        } catch (Exception e) {
        }
        return lis_emp;

    }
   
     public boolean Validar_logo( String usuario,String password){       
        String mensaje="";
        String query="select * from usuario  where usuario=? and password=md5(?)";       
         try {             
                PreparedStatement psmt=getConex().prepareStatement(query);
                psmt.setString(1, usuario);
                psmt.setString(2, password);
                ResultSet st=psmt.executeQuery();
                while (st.next()) {                 
                  return true; 
                }   
            } catch (SQLException e) {
            String msg = "Error al buscar un codigo"+e.getMessage();
            }return false;   
    } 

}
