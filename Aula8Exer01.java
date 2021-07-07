package aula.pkg8.exer.pkg01;

import aula.pkg8.exer.pkg01.modelo.Produto;
import aula.pkg8.exer.pkg01.modelo.Livro;
import aula.pkg8.exer.pkg01.modelo.CD;
import aula.pkg8.exer.pkg01.modelo.Software;

import javax.swing.JOptionPane;

public class Aula8Exer01 {

    public static void main(String[] args) {

        //entrada de dados
        int tipo = Integer.parseInt(JOptionPane.showInputDialog
        ("Tipo de produto: 1-Livro / 2-CD / 3-Software"));
        if (tipo < 1 || tipo > 3){
            JOptionPane.showMessageDialog(null, "Opção Inválida");
        }
        else{
            int codigo = Integer.parseInt (JOptionPane.showInputDialog
                    ("Informe o código: "));
            String descricao = JOptionPane.showInputDialog
                    ("Informe a descrição: ");        
            float preco = Float.parseFloat(JOptionPane.showInputDialog
                    ("Informe o preço: "));
            float peso = Float.parseFloat(JOptionPane.showInputDialog
                    ("Informe a peso: "));            
        }
            
        int codigo = Integer.parseInt (JOptionPane.showInputDialog
            ("Informe o código: "));
        String descricao = JOptionPane.showInputDialog
            ("Informe a descrição: ");        
        float preco = Float.parseFloat(JOptionPane.showInputDialog
            ("Informe o preço: "));
        float peso = Float.parseFloat(JOptionPane.showInputDialog
            ("Informe a peso: "));
        
        switch (tipo){
            case 1:{
                String autor = JOptionPane.showInputDialog
                                    ("Informe o autor: ");
                
                Livro l = new Livro (codigo, descricao, preco, peso, autor);
                JOptionPane.showMessageDialog(null, l.imprimir());
                
            break;
            }
            case 2:{
                String nomeArtista = JOptionPane.showInputDialog
                                    ("Informe o artista: ");
                
                CD cd = new CD (codigo, descricao, preco, peso, nomeArtista);
                JOptionPane.showMessageDialog(null, cd.imprimir());
                
            break;
            }
            case 3:{
                String categoria = JOptionPane.showInputDialog
                                    ("Informe a categoria: ");
                
                Software sf = new Software (codigo, descricao, preco, peso, categoria);
                JOptionPane.showMessageDialog(null, sf.imprimir());
            break;
            }
            
        }
    }
    
}
