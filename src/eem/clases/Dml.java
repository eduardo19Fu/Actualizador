/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eem.clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class Dml {
    
    private Conexion conexion;
    private Connection connection;
    private Consultas consultas;
    
    public Dml(){
        conexion = new Conexion();
        connection = conexion.getConnection();
        consultas = new Consultas();
    }
    
    private int actualizarDatos(String clave,String dpi,String nit,String telefono,String email,String tipo_documento, String referencia){
        String sql = "update persona set identificacion = ?,nit=?,telefono = ?,correo_electronico = ?,tipo_identificacion = ? where idpersona = ?";
        String sql2 = "update cuenta set referencia = ? where clave = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            PreparedStatement ps2 = connection.prepareStatement(sql2);
            
            ps.setString(1, dpi);
            ps.setString(2, nit);
            ps.setString(3, telefono);
            ps.setString(4, email);
            ps.setString(5, tipo_documento);
            ps.setInt(6, consultas.getIdPersona(clave));
            
            ps2.setString(1, referencia);
            ps2.setString(2, clave);
            
            int rs = ps.executeUpdate();
            
            if(rs > 0){
                int rs2 = ps2.executeUpdate();
                
                if(rs2 > 0){
                    return rs2;
                }else{
                    return 0;
                }
            }else{
                return 0;
            }
            
        } catch (SQLException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return 0;
        }
    }
    
    public int getActualizarDatos(String clave,String dpi,String nit,String telefono,String email,String tipo_documento, String referencia){
        return actualizarDatos(clave, dpi, nit, telefono, email, tipo_documento, referencia);
    }
    
    private int registroActualizacion(String clave, Timestamp fechaAct){
        String sql = "insert into actualizacion_cuenta(idcuenta,fecha_actualizacion) values(?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, consultas.getIdCuenta(clave));
            ps.setTimestamp(2, fechaAct);
            int rs = ps.executeUpdate();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return 0;
        }
    }
    
    public int getRegistroActualizacion(String c, Timestamp fa){
        return registroActualizacion(c, fa);
    }
}
