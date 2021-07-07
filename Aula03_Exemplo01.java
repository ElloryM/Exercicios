//pacote do programa
package aula03_exemplo01;

//classe do programa

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Aula03_Exemplo01 {
    //método principal
    public static void main(String[] args) {
        JFrame f = new JFrame("Usando FlowLayout");
        FlowLayout layout = new FlowLayout() ;
        layout.setAlignment(FlowLayout.CENTER);
        f.setLayout(layout);
        JButton botao1 = new JButton("Botão 1");
        JButton botao2 = new JButton("Botão 2");
        f.add(botao1);
        f.add(botao2);
        f.setLocationRelativeTo(null); 
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true); //Não usei setSize. O que acontecerá ? Teste !
    }
}
