/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07_exemplo01;

import aula07_exemplo01.modelo.Cliente;
import java.util.Scanner;

/**
 *
 * @author RonaldoCandido
 */
public class Aula07_Exemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // criar um vetor de até 8 clientes, numerados de 0 a 7
        Cliente[] listaClientes = new Cliente[7];

        // objeto do tipo cliente
        Cliente c = new Cliente();
        c.setNome("Alberto");
        c.setCpf(123456789);

        // guardar o objeto no vetor
        int indice = 0;
        listaClientes[indice] = c;

        // ler objeto do vetor
        Cliente c1 = new Cliente();
        c1 = listaClientes[indice];
        System.out.println(c1.getNome() + "\n" + c1.getCpf());

        // ou ler diretamente do vetor 
        System.out.println(listaClientes[indice].getNome());

        // Podemos usar um laço for para percorrer um vetor do início ao fim
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < listaClientes.length; i++) {
            Cliente c2 = new Cliente();
            System.out.print("Digite o nome: ");
            c2.setNome(sc.next());
            System.out.print("Digite o cpf: ");
            c2.setCpf(sc.nextInt());
            listaClientes[i] = c2;
            System.out.print(i + " Nome: " + c2.getNome());
            System.out.println(" / CPF: " + c2.getCpf());        
        }

        // Podemos usar um laço for para percorrer um vetor do início ao fim
        for (int i = 0; i < listaClientes.length; i++) {
            c = listaClientes[i]; // não precisa recriar o objeto c
            System.out.print(i + " Nome: " + c.getNome());
            System.out.println(" / CPF: " + c.getCpf());
        }

        // ou com for-each (sem índice)
        for (Cliente c3 : listaClientes) {
            System.out.print(" Nome: " + c3.getNome());
            System.out.println(" / CPF: " + c3.getCpf());
        }
    }

}
