/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Santiago199
 */
public class Conexion {
    private String DB="secretaria",USR="root",KEY="123456",HST="localhost",URL="jdbc:mysql://"+HST+":3306/"+DB;
    Connection con=null;
    
    public Connection getConexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.URL,this.USR,this.KEY);
        }catch(SQLException | ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Error al establecer la conexion con la BD...","Conexion",1);
        }
        return con;
  }
}
