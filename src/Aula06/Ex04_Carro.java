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
    
}
