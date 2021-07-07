/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02_exercicio06;

import java.util.Scanner;

/**
 *
 * @author RonaldoCandido
 */
public class Aula02_Exercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // variáveis
        char op ;
        float a,b, resultado = 0 ;
        boolean flag = true ; // sinalizar a operação bem sucedida
        
        //objeto para digitar no console de texto
        Scanner teclado = new Scanner(System.in) ;
        
        // entrada de dados
        System.out.print("Digite o caracter (+, -, *, /): ");
        op = teclado.next().charAt(0) ; // ler um caracter
        
       System.out.print("Digite o primeiro número real: ");
        a = teclado.nextFloat() ;
        
        System.out.print("Digite o segundo número real: ");
        b = teclado.nextFloat() ;
        
        // processamento
        switch (op)
        {
            case '+' : resultado = a + b ;
                          break ;   
            case '-' : resultado = a - b ;
                          break ;   
            case '*' : resultado = a * b ;
                          break ;   
            case '/' : resultado = a / b ;
                          break ;   
            default :  flag = false ;  // operação mal sucedida 
        }
        
        //saída de dados
        if (flag)
            System.out.printf("%.2f %c %.2f = %.2f",a,op,b,resultado) ;
        else
            System.out.println("Caracter não reconhecido") ;
        
        System.out.println() ;
    }
    
}
