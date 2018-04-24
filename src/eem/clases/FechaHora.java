/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eem.clases;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Eduardo
 */
public class FechaHora {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        DateFormat formato;
        Date fecha;
        formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        fecha = new Date();
        System.out.println(""+formato.format(fecha));
        System.out.println("" + new Timestamp(fecha.getTime()));
    }
    
}
