/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eem.clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class Consultas {
    private Conexion conexion;
    private Connection connection;
    
    public Consultas(){
        conexion = new Conexion();
        connection = conexion.getConnection();
    }
    
    private int idPersona(String clave){
        String sql = "select idpersona from cuenta where clave = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, clave);
            ResultSet rs = ps.executeQuery();
            rs.next();
            return rs.getInt(1);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return 0;
        }
    }
    
    public int getIdPersona(String c){
        return idPersona(c);
    }
    
    private int idCuenta(String clave){
        String sql = "select idcuenta from cuenta where clave = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, clave);
            ResultSet rs = ps.executeQuery();
            rs.next();
            return rs.getInt(1);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return 0;
        }
    }
    
    public int getIdCuenta(String c){
        return idCuenta(c);
    }
}
