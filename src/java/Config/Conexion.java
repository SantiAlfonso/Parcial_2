/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    private Connection con;
    private String url = "jdbc:mysql://localhost:3306/sis_ventas";
    private String user = "root";
    private String pass = "123456";

    public Connection getConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Use "com.mysql.cj.jdbc.Driver" for newer versions of MySQL Connector/J.
            con = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"ERROR AL CONECTAR CON LA BASE DE DATOS");
           
        }
        return con;
    }
           
}