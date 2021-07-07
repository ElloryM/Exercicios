/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03_atividade01;

import java.util.Scanner;

/**
 *
 * @author RonaldoCandido
 */
public class Aula03_Atividade01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variáveis
        int ncc, saldo, totalCartao, totalCredito, limite, novoSaldo ;
        Scanner sc = new Scanner(System.in) ;
        
        // entrada de dados
        System.out.print("Número da conta corrente: ") ;
        ncc = sc.nextInt() ;
        System.out.print("Saldo do início do mês: ") ;
        saldo = sc.nextInt() ;
        System.out.print("Total comprado no cartão: ") ;
        totalCartao = sc.nextInt() ;
        System.out.print("Total de créditos no mês: ") ;
        totalCredito = sc.nextInt() ;
        System.out.print("Limite autorizado: ") ;
        limite = sc.nextInt() ;
        
        // Processamento
        novoSaldo = (saldo + totalCartao - totalCredito) ;
        
        //Saída de dados
        System.out.println("Novo saldo: " + novoSaldo) ;
        if (novoSaldo > limite)
           System.out.println("Limite de crédito excedido") ;
    }
    
}
