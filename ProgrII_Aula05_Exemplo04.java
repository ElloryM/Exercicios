package progrii_aula05_exemplo04;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ProgrII_Aula05_Exemplo04 extends JFrame {

    private JTable nomes;
    private DefaultTableModel nomesModelo;

    public ProgrII_Aula05_Exemplo04() {
        super("Usando JTable");
        String[] colunas = {"col1", "col2"};
        nomesModelo = new DefaultTableModel(colunas, 3);
        nomes = new JTable(nomesModelo);
    }

    public void init() {
        setSize(400, 300);
        setLocationRelativeTo(null);
        String[] linha0 = {"0", "teste0"};
        String[] linha1 = {"1", "teste1"};
        String[] linha2 = {"2", "teste2"};
        nomesModelo.insertRow(0, linha0);
        nomesModelo.insertRow(1, linha1);
        nomesModelo.insertRow(2, linha2);
        JScrollPane auxNomes = new JScrollPane(nomes, 
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        getContentPane().add(nomes, BorderLayout.CENTER);
        getContentPane().add(new JLabel("Tabela"),BorderLayout.NORTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ProgrII_Aula05_Exemplo04().init();
    }
}
