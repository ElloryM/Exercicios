package progrii_aula05_exemplo06;
 
public class ProgrII_Aula05_Exemplo06 {

private static void aumentarLetras() throws NullPointerException   {
    String frase = null;
    String novaFrase = null;
    novaFrase = frase.toUpperCase();
    JOptionPane.showMessageDialog(null, "Frase antiga: " + frase);
    JOptionPane.showMessageDialog(null, "Frase nova: " + novaFrase);     
}

public static void main(String args[])
{
    try {
            aumentarLetras();     }
    catch (NullPointerException e)
    {  JOptionPane.showMessageDialog(null, "Ocorreu um erro ao executar o método”) ; 
       aumentarLetras() " + e);  }
} // fim do main()

}