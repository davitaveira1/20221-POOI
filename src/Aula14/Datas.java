/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula14;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author Davi
 */
public class Datas {
    
    public static void main(String[] args) {
        
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");        
        sdf3.setTimeZone(TimeZone.getTimeZone("America/Sao_Paulo"));
        
        Date x4 = new Date(1000L * 60L * 60L * 6L);
        
        System.out.println("x4: "+sdf3.format(x4));
        
        
    }
    
}
