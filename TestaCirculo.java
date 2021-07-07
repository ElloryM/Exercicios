package aula04_exercicio;

import aula04_exercicio03.modelo.Circulo;
import java.util.Scanner;

/**
 *
 * @author RonaldoCandido
 */
public class TestaCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // item a)
        Circulo c1 = new Circulo(2, 5, 10) ;
        Scanner teclado = new Scanner(System.in) ;
        System.out.print("Digite o raio: ") ;
        float raio = teclado.nextFloat() ;
        System.out.print("Digite a posição x: ") ;
        int x = teclado.nextInt() ;
        System.out.print("Digite a posição y: ") ;
        int y = teclado.nextInt() ;
        Circulo c2 = new Circulo(raio,x,y) ;
        
        // item g)
        System.out.println(c1.imprimirDados()) ;
        System.out.println(c2.imprimirDados()) ;
    }
}
