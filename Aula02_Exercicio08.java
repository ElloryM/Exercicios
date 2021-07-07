/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02_exercicio08;

import java.util.Scanner;

/**
 *
 * @author RonaldoCandido
 */
public class Aula02_Exercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // variáveis
        float nota = 0, soma = 0, media = 0, maiorNota = -999, menorNota = 999;
        int i = 0;

        //objeto para digitar no console de texto
        Scanner teclado = new Scanner(System.in);

        // entrada de dados
        while (nota != -1) {
            System.out.print("Digite a nota: ");
            nota = teclado.nextFloat();

            // processamento
            if (nota != -1) {
                soma += nota;
                if (nota > maiorNota) {
                    maiorNota = nota;
                }

                if (nota < menorNota) {
                    menorNota = nota;
                }
                i++;
            }
        }
        media = soma / i;

        // saída de dados
        System.out.println("Quantidade de alunos: " + i);
        System.out.println("Média da turma: " + media);
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);
    }

}
