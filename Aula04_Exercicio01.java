package aula04_exercicio01;


import java.util.Scanner;


public class Aula04_Exercicio01 {

    
//método principal
    
public static void main(String[] args) {
        
//entrada de dados
        
// usando random()
        
int numeroSorteado = (int)(Math.random() * 10 + 1) ;
        
int numeroDigitado = 0 ;
        
String mensagem = "";
        
Scanner sc = new Scanner(System.in) ;
        
System.out.println("Tente advinhar o número que estou pensando...(de 1 a 10)") ;
        
numeroDigitado = sc.nextInt() ;
        
        
//processamento
        
if (numeroDigitado == numeroSorteado) {
            
mensagem = "Acertou!!!";
        }

        else {
            
mensagem = "Errou!!!";
        }
        
        
//saída de dados
        
System.out.println(mensagem + " Era o número " + numeroSorteado) ;
    
} //fim do main()

}//fim da classe
