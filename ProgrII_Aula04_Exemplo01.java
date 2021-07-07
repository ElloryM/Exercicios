package progii_aula04_exemplo01;
//lista de importações
import java.awt.Cursor;
import progii_aula04_exemplo01.visao.MeuFrame;
//classe principal
public class ProgII_Aula04_Exemplo01 {
    //método principal
    public static void main(String[] args) {
	   MeuFrame mf = new MeuFrame() ; //Criar o objeto da janela
        mf.init() ; //executar método init()
  	   //alterar o cursor
  	   Cursor hand = new Cursor (Cursor.HAND_CURSOR);
  	   mf.setCursor(hand);
	   mf.setVisible(true); //tornar frame visível
 	}//fim do main()
}//fim da classe
