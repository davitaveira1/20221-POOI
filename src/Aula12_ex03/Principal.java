/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula12_ex03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Davi
 */
public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            String[] vetor = entrada.nextLine().split(" ");
            int posicao = entrada.nextInt();
            System.out.println(vetor[posicao]);
        } catch (InputMismatchException e) {
            System.out.println("Erro de entrada!");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Erro de posição!");
        }

        System.out.println("Fim do programa!");

    }

}
