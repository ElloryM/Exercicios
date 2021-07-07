package aula02_exemplo03;

import javax.swing.JOptionPane;

public class Aula02_Exemplo03 {


    public static void main(String[] args) {
        //exemplo03 - Sorteio de número de 1 a 100
        int numero = (int) (Math.random() * 100) + 1 ;
        boolean par = (numero%2 == 0) ;
        //Lista dos botões
        Object[] botoes = { "Par","Ímpar"} ;
        String mensagem = "" ;
        //exibir a pergunta com os botões
        int resposta = JOptionPane.showOptionDialog(null, 
                "Fiz o sorteio de um número de 1 a 100. Será que é Par ou Ímpar ?",
                "Sorteio",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, 
                null, botoes, botoes[0]);
        // verifica se o usuario clicou no botão Par  
        if (resposta == 0)
            if (par)
               mensagem = "Acertou, era par: ";
            else
               mensagem = "Errou era ímpar: ";
        // verifica se o usuario clicou no botão Ímpar  
        else
            if (!par)
               mensagem = "Acertou, era ímpar: ";
            else
               mensagem = "Errou era par: ";
        //exibir o resultado
        JOptionPane.showMessageDialog(null, mensagem + numero);
    }
}
