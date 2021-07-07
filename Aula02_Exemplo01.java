package aula02_exemplo01;

//Exemplo01: Faça um programa que, através de caixas de diálogo, 

import javax.swing.JOptionPane;

//solicite dois números inteiros, e exiba o resultado da soma desses números.
public class Aula02_Exemplo01 {

    //método principal
    public static void main(String[] args) {
        //exibe a caixa de diálogo de digitação
        String n1 = JOptionPane.showInputDialog("Primeiro número:") ;
        String n2 = JOptionPane.showInputDialog("Segundo número:") ;

        // Converter para números inteiros
        int a = Integer.parseInt(n1);
        int b = Integer.parseInt(n2);
        int soma = a + b;

        //exibe a caixa de diálogo com o resultado
        JOptionPane.showMessageDialog(null,"Resultado: " + soma) ;
        //outra sintaxe
        JOptionPane.showMessageDialog(null,"Resultado: " + soma, 
                "Exemplo01", JOptionPane.WARNING_MESSAGE) ;
        System.exit(0); // encerra o programa
    } // fim do main
} //fim da classe
