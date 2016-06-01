/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_videoclub;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class conexion {

    public static Connection con = null;
    public static ResultSet set = null;
    public static Statement st = null;

    public void desconectar() {
        con = null;
    }

    public static void cerrarconexion() {
        try {
            con.close();
            con = null;
        } catch (Exception e) {
            System.out.println("Problema al cerrar la conexion");
        }

    }

    public static void conectar() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/videoclub?zeroDateTimeBehavior=convertToNull", "root", "sistema");
            if (con != null) {
                System.out.println("Conexión a base de datos " + " ... Ok");
                //conn.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
}
