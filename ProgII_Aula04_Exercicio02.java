package progrii_aula04_exercicio02;

//lista de importações
import progrii_aula04_exercicio02.visao.MeuFrame;

//classe principal
public class ProgII_Aula04_Exercicio02 {

    //método principal
    public static void main(String[] args) {

        //Cria o objeto da janela
        MeuFrame mf = new MeuFrame();
        mf.init();
        //tornar visível        
        mf.setVisible(true);
    }//fim do main()
}//fim da classe
