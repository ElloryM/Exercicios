package aula03_exemplo04;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Aula03_Exemplo04 {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setLayout(new GridBagLayout());
        GridBagConstraints cons = new GridBagConstraints();
        cons.fill = GridBagConstraints.BOTH; //Crescimento
        JTextArea textArea1 = new JTextArea("TextArea1", 5, 10);
        JTextArea textArea2 = new JTextArea("TextArea2", 2, 2);
        JTextField textField = new JTextField("TextField");
        JButton botao1 = new JButton("Botao 1");
        JButton botao2 = new JButton("Botao 2");
        JButton botao3 = new JButton("Botao 3");
        f.add(textArea1,cons) ;
        f.add(textArea2,cons) ;
        f.add(textField,cons) ;
        f.add(botao1,cons) ;
        f.add(botao2,cons) ;
        f.add(botao3,cons) ;
        f.setSize(500, 150); //diminua a altura
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
