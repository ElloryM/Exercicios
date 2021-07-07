package aula04_exercicio02;
public class Aula04_Exercicio02 {

    
public static void main(String[] args) {
        
System.out.println("Sorteio para MegaSena") ;
        
        
//repete o sorteio 6 vezes
        
for (int i = 0; i < 6; i++) {
            
//entrada de dados
            
// usando random()
            
int numero = (int) (Math.random() * 60 + 1);

            
//saída de dados
            
System.out.println("Número :" + numero);
        
}
    
}

}
