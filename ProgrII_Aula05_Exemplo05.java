package progrii_aula05_exemplo05;

public class ProgrII_Aula05_Exemplo05 {

// método a executar
public static void main (String args[]) { 
  int x = 3 ;
  int y = 0 ;
  // código que pode gerar uma exceção
  try {
     JOptionPane.showMessageDialog(null, x/y);
  }
  catch (ArithmeticException e) {
         JOptionPane.showMessageDialog(null, 
	“Divisão por zero”);
   }
   finally {
        JOptionPane.showMessageDialog(null, "imprime"); 
   }
} // fim do main()
}