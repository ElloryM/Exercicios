package progrii_aula05_exemplo05;

public class ProgrII_Aula05_Exemplo05 {

// m�todo a executar
public static void main (String args[]) { 
  int x = 3 ;
  int y = 0 ;
  // c�digo que pode gerar uma exce��o
  try {
     JOptionPane.showMessageDialog(null, x/y);
  }
  catch (ArithmeticException e) {
         JOptionPane.showMessageDialog(null, 
	�Divis�o por zero�);
   }
   finally {
        JOptionPane.showMessageDialog(null, "imprime"); 
   }
} // fim do main()
}