package progri_aula08_exercicio01;

import javax.swing.JOptionPane;
import progri_aula08_exercicio01.modelo.CD;
import progri_aula08_exercicio01.modelo.Livro;
import progri_aula08_exercicio01.modelo.Software;

public class ProgrI_Aula08_Exercicio01 {

    public static void main(String[] args) {

        //entrada de dados
        int tipo = Integer.parseInt(JOptionPane.showInputDialog("Tipo de produto: 1-Livro / 2-CD / 3-Software"));
        if (tipo < 1 || tipo > 3) {
            JOptionPane.showMessageDialog(null, "Opção inválida");
        } else {
            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código:"));
            String descricao = JOptionPane.showInputDialog("Informe a descrição:");
            float preco = Float.parseFloat(JOptionPane.showInputDialog("Informe o preço: R$"));
            float peso = Float.parseFloat(JOptionPane.showInputDialog("Informe o peso:"));

            switch (tipo) {
                case 1: {
                    String autor = JOptionPane.showInputDialog("Informe o autor:");
                    Livro l = new Livro(codigo, descricao, preco, peso, autor);
                    JOptionPane.showMessageDialog(null, l.imprimir());
                    break;
                }
                case 2: {
                    String artista = JOptionPane.showInputDialog("Informe o artista:");
                    CD cd = new CD(artista, codigo, descricao, preco, peso);
                    JOptionPane.showMessageDialog(null, cd.imprimir());
                    break;
                }
                case 3: {
                    String categoria = JOptionPane.showInputDialog("Informe a categoria:");
                    Software sf = new Software();
                    sf.setCodigo(codigo);
                    sf.setDescricao(descricao);
                    sf.setPreco(preco);
                    sf.setPeso(peso);
                    sf.setCategoria(categoria);
                    JOptionPane.showMessageDialog(null, sf.imprimir());
                }
            } // fim do switch 
        }//fim do if
        // processamento de dados
        //saída de dados
    }

}
