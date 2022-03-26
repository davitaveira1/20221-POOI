package Aula03;

import java.util.Scanner;
public class Ex03 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String s1, s2, s3;
        int idade;
                
        idade = entrada.nextInt(); 
        entrada.nextLine();
        s1 = entrada.nextLine();
        s2 = entrada.nextLine();        
        s3 = entrada.nextLine();
        
        System.out.println("idade: "+idade);
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        System.out.println("s3:"+s3);
        
        
    }
    
}
