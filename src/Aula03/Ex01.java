package Aula03;

import java.util.Locale;
import java.util.Scanner;
public class Ex01 {
    
    public static void main(String[] args) {
         Locale.setDefault(Locale.US);
         Scanner entrada = new Scanner(System.in);
         double x;
         
         System.out.println("Informe o número: ");
         x = entrada.nextDouble();
         
         System.out.println("X: "+x);
         System.out.printf("X: %.2f",x);
        
    }
    
}
