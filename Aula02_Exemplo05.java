// pacote
package aula02_exemplo05;
//importações de classes
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//classe estendendo JFrame
public class Aula02_Exemplo05 extends JFrame {

    //atributos
    private JButton btnSim, btnNao, btnCancelar;
    private JLabel lblMensagem;
    private JTextField txtCampo;

    //construtor
    public Aula02_Exemplo05() {
        //título da janela
        super("Exemplo05");
        //define os botões
        btnSim = new JButton("Sim");
        btnNao = new JButton("Não");
        btnCancelar = new JButton("Cancelar");
        //define o label
        lblMensagem = new JLabel("Mensagem: ");
        //define o campo de texto com tamanho
        txtCampo = new JTextField(20);
        //adiciona um layout
        getContentPane().setLayout(new FlowLayout());
    }//fim do construtor

    //método de inicialização
    public void init() {
        //cor da frente e do fundo
        setForeground(Color.BLACK);
        getContentPane().setBackground(new Color(0, 200, 192)) ;
        //tamanho do frame
        setSize(300, 100);
        // centraliza o frame
        setLocationRelativeTo(null); 
        //adiciona componentes
        getContentPane().add(lblMensagem);
        getContentPane().add(txtCampo);
        getContentPane().add(btnSim);
        getContentPane().add(btnNao);  
        getContentPane().add(btnCancelar);
        //fechar o frame ao sair
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //fixar as bordas do frame
        //setResizable(false) ;
        //ocupar o menor espaço possível
        //pack(); ;
        //tirar barra de título e bordas
        //setUndecorated(false) ; // usar Alt F4 para sair
    }//fim do init()

    // método principal
    public static void main(String[] args) {
        //cria o frame e o inicializa
        Aula02_Exemplo05 janela = new Aula02_Exemplo05() ;
        janela.init() ;
        //frame visível
        janela.setVisible(true);
    }//fim do main()

}//fim da classe
