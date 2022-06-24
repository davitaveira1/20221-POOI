/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula12_ex04;

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
        } finally {
            entrada.close();
            System.out.println("Fim do programa!");
        }

    }

}
