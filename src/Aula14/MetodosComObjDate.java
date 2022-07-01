/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Davi
 */
public class MetodosComObjDate {
    
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date entrada = sdf1.parse("24/09/2021 12:00:00");
        Date saida = sdf1.parse("25/09/2021 12:00:00");    
        
        //SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        //Date entrada = sdf1.parse("21/09/2021");
        //Date saida = sdf1.parse("25/09/2021");         
        
        if(entrada.after(saida)){
            System.out.println("Erro!!Entrada após saída!");
        }
        
        if(entrada.before(saida)){
            System.out.println("OK!Entrada antes da saída!");
        }      
        
        if(entrada.equals(saida)){
            System.out.println("Datas iguais!");
        }
        
        System.out.println("Diferença entre datas (em horas): "+duracaoHoras(saida, entrada));
        
        System.out.println("Diferença entre datas (em dias): "+duracaoDias(saida, entrada));
        
    }
    
    public static long duracaoHoras(Date saida,Date entrada){
        long duracao = saida.getTime() - entrada.getTime();
        return TimeUnit.HOURS.convert(duracao, TimeUnit.MILLISECONDS);        
    }

    public static long duracaoDias(Date saida,Date entrada){
        long duracao = saida.getTime() - entrada.getTime();
        return TimeUnit.DAYS.convert(duracao, TimeUnit.MILLISECONDS);        
    }    
    
}
