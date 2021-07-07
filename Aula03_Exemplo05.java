package aula03_exemplo05;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Aula03_Exemplo05 {

    public static void main(String[] args) {
        JFrame j = new JFrame("Teste");
        JPanel p1 = new JPanel(new FlowLayout());
        JPanel p2 = new JPanel(new BorderLayout());
        p1.add(new JButton("B1 - painel 1"));
        p1.add(new JButton("B2 - painel 1"));
        p1.setBackground(Color.BLUE); //define cor de fundo
        p2.add(new JButton("B1 - painel 2"), BorderLayout.WEST);
        p2.add(new JButton("B2 - painel 2"), BorderLayout.EAST);
        p2.setBackground(Color.YELLOW); //define cor de fundo
        j.add(p1, BorderLayout.NORTH);
        j.getContentPane().add(new JButton("Botão central"),BorderLayout.CENTER);
        j.add(p2, BorderLayout.SOUTH);
        j.setSize(300, 300);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
    }

}
