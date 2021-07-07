package aula03_exemplo03;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Aula03_Exemplo03 {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setLayout(new BorderLayout()); //Precisa desta linha ?
        f.add(new JButton("Botão 1 "), BorderLayout.NORTH);
        f.add(new JTextField("TEXTO 2"), BorderLayout.EAST);
        f.add(new JTextField("TEXTO 1"), BorderLayout.WEST);
        f.add(new JButton("Botão 2"), BorderLayout.CENTER);
        f.add(new JButton("Botão 3"), BorderLayout.SOUTH);
        f.setSize(300, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
