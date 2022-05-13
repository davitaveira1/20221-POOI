/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula08;

/**
 *
 * @author Davi
 */
public class Calculos {
    
    final double PI = 3.14;
    
    double perimetro(double raio){
        return 2*PI*raio;
    }
    
    double volume(double raio){
        return 4*PI*raio*raio*raio/3;
    }
    
}
