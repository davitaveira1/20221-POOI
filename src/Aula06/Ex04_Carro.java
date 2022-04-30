package Aula06;

public class Ex04_Carro {
    
    Ex02_Pessoa proprietario;
    String marca;
    String modelo;
    int ano;
    String placa;
    String cor;
    double preco;
    
    void mostrarAtributos(){
        System.out.println("Proprietário: "+proprietario.nome);
        System.out.println("Modelo: "+modelo+"\tMarca: "+marca);
        System.out.println("Ano: "+ano+"\tPlaca: "+placa);
        System.out.println("Cor: "+cor+"\tPreço: "+preco);
    }
    
    void valorTabelaFIPE(){
        System.out.println("Valor tabela FIPE: "+0.8*preco);
    }
    
    double valorTabelaFIPEv2(){
        return 0.8*preco;
    }
    
    void valorIPVA(){
        System.out.println("IPVA: "+0.05*valorTabelaFIPEv2());
    }
    
    
}
