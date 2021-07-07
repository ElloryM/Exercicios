//Aula03_Exemplo07
package progrii_aula03_exemplo07;
import java.lang.reflect.Field;
import javax.swing.JOptionPane;

public class ProgrII_Aula03_Exemplo07 {
    @Deprecated
    public static int value = 1;

    public static void main(String[] args) throws Exception {
        String mensagem = "";
        Field field = ProgrII_Aula03_Exemplo07.class.getField("value");
        if (field.isAnnotationPresent(Deprecated.class)) {
            mensagem = "Campo anotado com Deprecated";
        } else {
            mensagem = "Campo não anotado com Deprecated";  }
        JOptionPane.showMessageDialog(null, mensagem) ;     }
} // fim da classe
