/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula04;

/**
 *
 * @author Davi
 */
import java.util.Scanner;
public class Ex05 {
    
    public static void main(String[] args) {
        double salario,despesas,saldo;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o salario: ");
        salario = entrada.nextDouble();
        System.out.println("Informe a despesa: ");
        despesas = entrada.nextDouble();
        
        saldo = salario - despesas;
        
        System.out.println("Saldo: "+saldo);
        
    }
    
}
