package progrii_aula05_exemplo01;

//lista de importações

import progrii_aula05_exemplo01.visao.MeuFrame;


//classe principal

public class ProgII_Aula05_Exemplo01 {

    
//método principal
    
public static void main(String[] args) {
        
//Cria o objeto da janela
        
MeuFrame mf = new MeuFrame() ;
        
mf.init() ;
        
mf.setVisible(true); //tornar visível        
    
}//fim do main()

}//fim da classe
