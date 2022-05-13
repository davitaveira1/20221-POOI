/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula08_ex2;

import Aula08.*;

/**
 *
 * @author Davi
 */
public class Calculos {
    
    static final double PI = 3.14;
    
    static double perimetro(double raio){
        return 2*PI*raio;
    }
    
    static double volume(double raio){
        return 4*PI*raio*raio*raio/3;
    }
    
}
