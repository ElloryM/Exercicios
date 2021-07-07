package aula03_exemplo02;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Aula03_Exemplo02 {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setLayout(new GridLayout(2, 3)); //2 linhas e 3 colunas
        f.add(new JButton("Botão 1"));
        f.add(new JTextField("TEXTO 1"));
        f.add(new JButton("Botão 2"));
        f.add(new JTextField("TEXTO 2"));
        f.add(new JButton("Botão 3"));
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
