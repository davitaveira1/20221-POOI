/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author Davi
 */
public class ManipularDatas {
    
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        //sdf1.setTimeZone(TimeZone.getTimeZone("America/São_Paulo"));

        Date x1 = sdf1.parse("25/09/2021 10:30:22");        
        System.out.println("x1: " + sdf1.format(x1));
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(x1);
        cal.add(Calendar.HOUR_OF_DAY,4);
        
        x1 = cal.getTime();
        System.out.println("x1: " + sdf1.format(x1));
        
        cal.add(Calendar.DAY_OF_MONTH,10);
        
        x1 = cal.getTime();
        System.out.println("x1: " + sdf1.format(x1));        
        
        int minutos = cal.get(Calendar.MINUTE);
        System.out.println("Minutos: "+minutos);
        
        int mes = 1+cal.get(Calendar.MONTH);
        System.out.println("Mês: "+mes);
        
    }
    
    
}
