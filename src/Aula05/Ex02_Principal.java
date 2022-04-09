package Aula05;

public class Ex02_Principal {
    
    public static void main(String[] args) {
        
        Ex02_Pessoa p1 = new Ex02_Pessoa();
        Ex02_Pessoa p2 = new Ex02_Pessoa();
        Ex02_Pessoa p3 = new Ex02_Pessoa();
        
        p1.nome = "Davi";
        p1.telefone = "(62)98123-0013";
        p1.cpf = "888.777.712-09";
        
        p2.nome = "Daniel";
        p2.telefone = "(62)99765-0123";
        p2.cpf = "222.111.712-09";

        p3.nome = "Lucas";
        p3.telefone = "(62)99881-9987";
        p3.cpf = "222.123.981-13";    
        
        p1.mostrarNome();
        p1.mostrarTelefone();
    }
    
}
