package progrii_aula05_exercicio01;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
//classe estende Jframe
public class ProgrII_Aula05_Exercicio01 extends JFrame {
    //atributo
    private JTable tabela;
    public ProgrII_Aula05_Exercicio01() {
        //armazenam os títulos das colunas e os dados da tabela.
        Object[] colunas = {"Tipo", "Empresa", "Mercado", "Preco", "Teste"};
        Object[][] dados = {{"Servidores", "IBM", new Integer(1000), new Double(80.50), false},
        {"Software", "MicroSoft", new Integer(2000), new Double(6.25), true},
        {"Automoveis", "Toyota", new Integer(3000), new Double(7.35), true},
        {"Esportes", "Nike", new Integer(4000), new Double(20.00), false}
        };
        DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
        tabela = new JTable(modelo) {
            private static final long serialVersionUID = 1L;
            @Override
            public Class getColumnClass(int coluna) {
                switch (coluna) {
                    case 0:
                        return String.class;
                    case 1:
                        return String.class;
                    case 2:
                        return Integer.class;
                    case 3:
                        return Double.class;
                    default:
                        return Boolean.class;
                }
            }
        };
        		tabela.setPreferredScrollableViewportSize(tabela.getPreferredSize());
        JScrollPane scrollPane = new JScrollPane(tabela);
        getContentPane().add(scrollPane);
    }
 
   public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                ProgrII_Aula05_Exercicio01 frame = new ProgrII_Aula05_Exercicio01();
                frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                frame.setTitle("Usando JTable") ;
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
       });
    }
}
