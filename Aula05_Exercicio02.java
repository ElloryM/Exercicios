/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05_exercicio02;

import javax.swing.JOptionPane;

/**
 *
 * @author RonaldoCandido
 */
public class Aula05_Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variáveis
        int n;
        float soma, media;
        float[] notas;
        String nome;
        //entrada de dados
        nome = JOptionPane.showInputDialog("Qual o nome do curso ? ");
        n = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de alunos ? "));
        //validar a quantidade de alunos
        if (n <= 0) {
            JOptionPane.showMessageDialog(null, "Quantidade inválida");
        } 
        else 
        {   // define o tamanho do vetor
            notas = new float[n];
            soma = 0;
            // digitar as notas e somá-las
            for (int i = 0; i < notas.length; i++) {
                notas[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota" +  (i + 1)));
                soma += notas[i];
            }
            // processamento
            //cálculo da média
            media = soma / n;
            //saída de dados
            //Nome do curso em maiúsculas.
            JOptionPane.showMessageDialog(null, "Nome do curso : " + nome.toUpperCase() + 
                    "\nMédia : " + media);
            // percorre o vetor concatenando as notas acima da média
            String saida = "";
            for (int i = 0; i < notas.length; i++) {
                if (notas[i] > media) {
                    saida += "Nota" + (i + 1) + " " + notas[i] + "\n" ;
                }
            } // fim do for
            //exibe a saída de notas acima da média
            JOptionPane.showMessageDialog(null, saida);
        } //fim else
    } // fim main()
} // fim da classe
