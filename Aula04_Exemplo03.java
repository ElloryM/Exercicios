/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04_exemplo03;

import aula04_exemplo03.desenho.Circulo;
import aula04_exemplo03.desenho.Retangulo;

/**
 *
 * @author RonaldoCandido
 */
public class Aula04_Exemplo03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // programa a executar
        Retangulo r1, r2;
        Circulo c1, c2;
        r1 = new Retangulo(10, 20, 30, 40);
        r2 = new Retangulo(r1);
        c1 = new Circulo(5, 15, 50);
        c2 = new Circulo(c1);
        System.out.println("Altura de r1: " + r1.getAltura()) ;
        System.out.println("Altura de r2: " + r2.getAltura()) ;
        System.out.println("Raio de c1: " + c1.getRaio()) ;
        System.out.println("Raio de c2: " + c2.getRaio()) ;

    }
    
}
