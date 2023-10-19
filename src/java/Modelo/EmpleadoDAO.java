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
    
    public Empleado validar(String user, String dni){
        Empleado emp=new Empleado();
        String sql="SELECT * FROM empleado WHERE User=? and Dni=?";
        try{
            con=cn.getConexion();
            ps=con.prepareStatement(sql);
            ps.setString(1,user);
            ps.setString(1,dni);
            rs=ps.executeQuery();
            while(rs.next()){
                emp.setId(rs.getInt("IdEmpleado"));
                emp.setUser(rs.getString("User"));
                emp.setDni(rs.getString("Dni"));
                emp.setNom(rs.getString("Nombres"));
            }
            
        }catch(Exception e){
            
        }
        return emp;
    }
    
}
