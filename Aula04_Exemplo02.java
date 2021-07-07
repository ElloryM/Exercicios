/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04_exemplo02;

import aula04_exemplo02.modelo.Produto;

/**
 *
 * @author RonaldoCandido
 */
public class Aula04_Exemplo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instância
        Produto p = new Produto() ;
        System.out.println(p.getCodigo()) ;

        // estático, usando a classe
        double f = Produto.freteUnico ;
        double c = Produto.calcularImposto() ;

         System.out.println("Frete: " + f) ;
         System.out.println("Imposto: " + c) ;

    } // fim do main()
} // fim da classe
