package progrii_aula05_exemplo02;


import java.awt.FlowLayout;

import javax.swing.JFrame;

import javax.swing.JList;

import javax.swing.JScrollPane;

import javax.swing.ListSelectionModel;


public class ProgrII_Aula05_Exemplo02 extends JFrame {

    
private JList lista_de_cores;
    
private final String cores[] = {"Preto", "Azul", "Ciano", "Cinza Escuro",
        "Cinza", "Verde", "Cinza Claro", "Magenta"};

    
public ProgrII_Aula05_Exemplo02() {
        
super("Usando JList");
        
setLayout(new FlowLayout());
        
// criando a lista
        
lista_de_cores = new JList(cores);
        lista_de_cores.setVisibleRowCount(5);
        lista_de_cores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //única seleção
        
add(new JScrollPane(lista_de_cores));
    
}

    
public static void main(String[] args) {
        
ProgrII_Aula05_Exemplo02 programa = new ProgrII_Aula05_Exemplo02();
        programa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        programa.setSize(350, 150);
        
programa.setVisible(true);
    
}

}
