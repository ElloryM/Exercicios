/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02_exercicio05;

import java.util.Scanner;

/**
 *
 * @author RonaldoCandido
 */
public class Aula02_Exercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // variável inteira
        int n ;
        
        //objeto para digitar no console de texto
        Scanner teclado = new Scanner(System.in) ;
        
        // entrada de dados
        System.out.print("Digite um número inteiro: ");
        n = teclado.nextInt() ;
        
        //processamento
        if (n%5 == 0)
            // saída de dados
            System.out.println("Número: " + n + " é múltiplo de 5") ;
        else
            System.out.println("Número: " + n + " não é múltiplo de 5") ;
        
    }
    
}
