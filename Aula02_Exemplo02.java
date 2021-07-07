package aula02_exemplo02;

import javax.swing.JOptionPane;

public class Aula02_Exemplo02 {

    public static void main(String[] args) {
        //Exemplo02
        String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        String opt[] = {"Sim","Não"};
        int resposta = JOptionPane.showConfirmDialog(null, "O seu nome é " + nome + "?");
        if (resposta == JOptionPane.YES_OPTION) // ou (resposta == 0)
        // verifica se o usuario clicou no botão SIM  
        {
            JOptionPane.showMessageDialog(null, "Seu nome é " + nome);
        } else {
            JOptionPane.showMessageDialog(null, "Ok, usuário!!!");
        }
    }
}
