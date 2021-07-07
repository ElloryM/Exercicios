/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05_exercicio01;

import javax.swing.JOptionPane;

/**
 *
 * @author RonaldoCandido
 */
public class Aula05_Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variáveis
        String sRaio; 
        double raio, volume;
        //entrada de dados
        sRaio = JOptionPane.showInputDialog("Digite o raio da esfera : ");
        // processamento de dados
        //conversão de dados
        raio = Double.parseDouble(sRaio);
        // cálculo
        volume = (4 * Math.PI * Math.pow(raio, 3))/3;
        //saída de dados
        JOptionPane.showMessageDialog(null,"Volume da esfera = " + volume );
        JOptionPane.showMessageDialog(null,"Volume da esfera = " + String.format("%,3.2f",volume) ); 
    }
}
