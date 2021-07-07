/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02_exercicio07;

import java.util.Scanner;

/**
 *
 * @author RonaldoCandido
 */
public class Aula02_Exercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // variáveis
        int n ;
        float nota, soma=0, media=0 ;
        
        //objeto para digitar no console de texto
        Scanner teclado = new Scanner(System.in) ;
        
        // entrada de dados
        System.out.print("Digite o número de alunos:  ");
        n = teclado.nextInt() ;
        
        // percorrer com for para as notas
        for (int i=0; i < n; i++)
        {
            System.out.print("Digite a nota: ");
            nota = teclado.nextFloat() ;
            // processamento
            soma += nota ;
        }        
        media = soma / n ;
        
        // saída de dados
        System.out.println("Usando o for, a média da turma foi " + media) ;
        
        // ou com while
        int i = 0 ;
        soma = 0 ; // zerar a soma das notas anteriores
        while(i < n)
        {
            System.out.print("Digite a nota: ");
            nota = teclado.nextFloat() ;
            // processamento
            soma += nota ;
            i++ ;
        }        
        media = soma / n ;
        
        // saída de dados
        System.out.println("Usando o while, a média da turma foi " + media) ;
        
    }
}
