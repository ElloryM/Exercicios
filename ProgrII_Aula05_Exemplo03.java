package progrii_aula05_exemplo03;

import java.awt.BorderLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ProgrII_Aula05_Exemplo03 extends JFrame {

    private JComboBox nomes;
    private DefaultComboBoxModel nomesModelo;

    public ProgrII_Aula05_Exemplo03() {
        super("Usando JComboBox");
        nomesModelo = new DefaultComboBoxModel();
        nomes = new JComboBox(nomesModelo);
    }

    public void init() {
        setSize(350, 150);
        setLocationRelativeTo(null);
        nomesModelo.addElement(new String("Teste1"));
        nomesModelo.addElement(new String("Teste2"));
        nomesModelo.addElement(new String("Teste3"));
        nomesModelo.addElement(new String("Teste4"));
        nomes.setEditable(true);
        JPanel auxNomes = new JPanel();
        auxNomes.add(nomes);
        getContentPane().add(auxNomes, BorderLayout.CENTER);
        getContentPane().add(new JLabel("Escolha um elemento"), BorderLayout.NORTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ProgrII_Aula05_Exemplo03().init();
    }

}
