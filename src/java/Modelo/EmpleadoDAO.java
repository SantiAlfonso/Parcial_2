/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Santiago199
 */
public class EmpleadoDAO {
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public Empleado validar(String user, String cedula){
        Empleado emp=new Empleado();
        String sql="SELECT * FROM empleado WHERE user=? and cedula=?";
        try{
            con=cn.getConexion();
            ps=con.prepareStatement(sql);
            ps.setString(1,user);
            ps.setString(2,cedula);
            rs=ps.executeQuery();
            while(rs.next()){
                emp.setCedula(rs.getInt("cedula"));
                emp.setUser(rs.getString("user"));
            }
            
        }catch(Exception e){
            
        }
        return emp;
    }
    
}
