//Exemplo01
package progrii_aula05_exemplo01.visao;

//lista de importações
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

//estende da classe JFrame
public class MeuFrame extends JFrame{
   //atributos do menu
   private JMenuBar mnuBarra ;
   private JMenu mnuArquivo, mnuEditar ;
   private JMenuItem mnuSalvar, mnuFechar, mnuRecortar ;
    
   // método construtor 
   public MeuFrame () {
      // título da janela
      super("Usando menus");
   }
   
   // método de inicialização
   public void init() {  
       //configurar frame
       setSize(400, 200); //largura e altura
       setLocationRelativeTo(null); //centralizar  
       //definir o botão de fechar
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        // Cria barra do Menu
        mnuBarra = new JMenuBar();
        // Cria menus principais
        mnuArquivo = new JMenu("Arquivo");
        mnuEditar = new JMenu("Editar");
 
        // Cria item do menu
        mnuSalvar = new JMenuItem("Salvar");
        mnuFechar = new JMenuItem("Fechar");
        mnuRecortar = new JMenuItem("Recortar");
        
        // Adiciona menus à barra
        mnuBarra.add(mnuArquivo);
        mnuBarra.add(mnuEditar);
        // Adiciona item ao Menu
        mnuArquivo.add(mnuSalvar);
        // Adiciona um separador de menu
        mnuArquivo.addSeparator();
         // Adiciona item ao Menu
        mnuArquivo.add(mnuFechar);
        mnuEditar.add(mnuRecortar);
        // Adiciona barra de menus ao frame
        setJMenuBar(mnuBarra);

    }//fim do método
}//fim da classe
