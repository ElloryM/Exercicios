/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03_exercicio02;

import java.util.Scanner;
import modelo.Livro;

/**
 *
 * @author RonaldoCandido
 */
public class Aula03_Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variáveis
        String a = "" ;
        String e = "" ;
        float p = 0 ;
        Scanner sc = new Scanner(System.in) ;
        
        // Entrada de dados - Livro 1
        System.out.print("Digite o autor: ") ;
        a = sc.next() ;
        System.out.print("Digite a editora: ") ;
        e = sc.next() ;
        System.out.print("Digite o preço: ") ;
        p = sc.nextFloat() ;
        
        // Processamento
        Livro l1 = new Livro() ;
        l1.setAutor(a);
        l1.setEditora(e);
        l1.setPreco(p);
        
        // Outro livro
        // Entrada de dados - Livro 2
        System.out.print("Digite o autor: ") ;
        a = sc.next() ;
        System.out.print("Digite a editora: ") ;
        e = sc.next() ;
        System.out.print("Digite o preço: ") ;
        p = sc.nextFloat() ;
        
        // Processamento
        Livro l2 = new Livro() ;
        l2.setAutor(a);
        l2.setEditora(e);
        l2.setPreco(p);
        
        //Saída de dados
        System.out.println("Autor: " + l1.getAutor());
        System.out.println("Editora: " + l1.getEditora());
        System.out.println("Preço: " + l1.getPreco());
        System.out.println() ;
        System.out.println("Autor: " + l2.getAutor());
        System.out.println("Editora: " + l2.getEditora());
        System.out.println("Preçoc: " + l2.getPreco());
        
        // exercício 3
        l2.setAutor("Harlan Coben");
        l2.setEditora("Arqueiro");
        l2.setPreco(30);
        
        // exercício 4
        String editora = "" ;
        if (l1.getPreco() < l2.getPreco())
           editora = l1.getEditora() ;
        else
           editora = l2.getEditora() ; 
        
        //exibe a editora com livro mais barato    
        System.out.println("Editora: " + editora) ;

    }
}
