package Aula03;

public class Ex04 {
    
    public static void main(String[] args) {
        
        double x=3.0,y=4.0,z=-5.0;
        double a,b,c;
        
        a = Math.sqrt(x);
        b = Math.sqrt(y);
        c = Math.sqrt(Math.abs(z));
        
        System.out.printf("a: %.2f \nb: %.2f %nc: %.2f",a,b,c);  

        
    }
    
}
