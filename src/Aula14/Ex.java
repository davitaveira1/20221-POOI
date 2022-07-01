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
import java.util.Scanner;
import java.util.TimeZone;

/**
 *
 * @author Davi
 */
public class Ex {
    
    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner(System.in);
        
        //System.out.println("Data (MM/dd/yyyy):");
        String data = "30/06/1983 03:04:05";
        
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        //sdf1.setTimeZone(TimeZone.getTimeZone("America/Sao_Paulo"));

        Date x1 = sdf1.parse(data);         
        Calendar cal = Calendar.getInstance();
        cal.setTime(x1);
        
        int dia = cal.get(Calendar.DAY_OF_MONTH);        
        System.out.println("Dia: "+dia);
        int mes = 1+cal.get(Calendar.MONTH);
        System.out.println("Mês: "+mes);
        int ano = cal.get(Calendar.YEAR);
        System.out.println("Ano: "+ano);
        int hora = cal.get(Calendar.HOUR);
        System.out.println("Hora: "+hora);
        int min = cal.get(Calendar.MINUTE);
        System.out.println("Minuto: "+min);
        int seg = cal.get(Calendar.SECOND);
        System.out.println("Segundo: "+seg);
    }
    
}
