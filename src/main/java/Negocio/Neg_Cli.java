package Negocio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import static Conexion.Conexion.getConex;
import Modelo.Mod_Cli;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Neg_Cli {
     
    public int registrar(Modelo.Mod_Cli car) {
        int rst = 0;
        String sp = "insert into cliente values(?,?,?,?,?)";
        try {
            PreparedStatement csmt = getConex().prepareStatement(sp);
            csmt.setInt(1, car.getDni());
            csmt.setString(2, car.getNombre());
            csmt.setString(3, car.getApellido());
            csmt.setInt(4, car.getTelefono());
            csmt.setString(5, car.getCorreo());
           
            rst = csmt.executeUpdate();
        
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return rst;
    }
    
    
    public List<Mod_Cli> listar() {
        Mod_Cli cliente;
        List<Mod_Cli> lis_emp = new ArrayList<Mod_Cli>();
        String query = "select * from cliente ";
        try {
           
            PreparedStatement psmt = getConex().prepareStatement(query);
            ResultSet rs = psmt.executeQuery();
            while (rs.next()) {
                cliente = new Mod_Cli();
                cliente.setDni(rs.getInt("dni"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setTelefono(rs.getInt("telefono"));
                cliente.setCorreo(rs.getString("correo"));
         
                lis_emp.add(cliente);
            }
        } catch (Exception e) {
        }
        return lis_emp;

    }
    
      public int eliminar(int id) {
        int rst = 0;
        String sp = "delete from cliente where dni=?";
        try {
            CallableStatement csmt = getConex().prepareCall(sp);
            csmt.setInt(1, id);
            rst = csmt.executeUpdate();
        } catch (SQLException e) {
        }
        return rst;
    }
      
        public List<Mod_Cli>buscar(int id){
        Mod_Cli cliente;
        List<Mod_Cli> lis_pro=new ArrayList<Mod_Cli>();
        String query="select * from cliente where dni=?";
        try {
            PreparedStatement psmt=getConex().prepareStatement(query);
             psmt.setInt(1, id);
             
            ResultSet rs=psmt.executeQuery();
            while(rs.next()){
                cliente=new Mod_Cli();
                cliente.setDni(rs.getInt("dni"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setTelefono(rs.getInt("telefono"));
                cliente.setCorreo(rs.getString("correo"));
             
                

                lis_pro.add(cliente);
            }
        } catch (Exception e) {
        }
        return lis_pro;     
    }   
        
            public int modificar(Mod_Cli cli) {
        int rst = 0;
        String sp = "update cliente set nombre=?,apellido=?,telefono=?,correo=? where dni=?;";
        try {
            CallableStatement csmt = getConex().prepareCall(sp);
            csmt.setString(1, cli.getNombre());
            csmt.setString(2, cli.getApellido());
            csmt.setInt(3, cli.getTelefono());
            csmt.setString(4, cli.getCorreo());
            csmt.setInt(5, cli.getDni());

            rst = csmt.executeUpdate();
        } catch (SQLException e) {
        }
        return rst;
    } 
}
