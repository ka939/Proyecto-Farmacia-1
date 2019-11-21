package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static Connection cnx = null;

    private Conexion() {
        //cambiar password
        String url = "jdbc:mysql://localhost:3306/tienda?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String driver = "com.mysql.cj.jdbc.Driver";
        String usuario = "root";
        String password = "12345678";

        try {
            Class.forName(driver);
            cnx = DriverManager.getConnection(url, usuario, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConex() {
        if (cnx == null) {
            new Conexion();
        }
        return cnx;
    }

    public static void main(String[] args) {
        if (getConex()!=null) {
            System.out.println("Conectado");
            return;
        }System.out.println("nope");

    }
}
