/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula08_ex2;

/**
 *
 * @author Davi
 */
import Aula08.*;
import java.util.Scanner;
public class Principal {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o valor do raio: ");
        double raio = entrada.nextDouble();
        
        System.out.println("Valor do PI: "+Calculos.PI);
        System.out.println("Perímetro: "+Calculos.perimetro(raio));
        System.out.println("Volume: "+Calculos.volume(raio));
    }
    
}
