/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02_exercicio03;

import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author RonaldoCandido
 */
public class Aula02_Exercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Ler valor do raio de um círculo
        float raio = 0 ; // ponto flutuante
        Scanner teclado = new Scanner(System.in) ;
        
        System.out.print("Digite o valor do raio: ");
        raio = teclado.nextFloat() ;
        
        // exibir os resultados
        System.out.println("Comprimento : " + (2*PI*raio)); // PI é uma constante
        System.out.println("Área : " + (PI*raio*raio)); 
    }
    
}
