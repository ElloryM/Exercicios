package aula02_exercicio01;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Aula02_Exercicio01 {

    public static void main(String[] args) {
        //variáveis
        boolean dados_ok = false;
        double altura = 0;
        double peso = 0;
        double imc = 0;
        String resultado = "";

        //entrada de dados
        do {
            try {
                String a = JOptionPane.showInputDialog("Informe a altura:");
                String p = JOptionPane.showInputDialog("Informe o peso:");

                //processamento
                altura = Double.parseDouble(a);
                peso = Double.parseDouble(p);
                imc = peso / (altura * altura);
                dados_ok = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido!!!");
            }
        } while (!dados_ok); //enquanto não for ok

        //verificar o resultado
        if (imc < 18.5) {
            resultado = "Abaixo do peso";
        } else if (imc < 25) {
            resultado = "Normal";
        } else {
            resultado = "Acima do peso"; }

        //saída de dados
        DecimalFormat df = new DecimalFormat("#0.00");
        JOptionPane.showMessageDialog(null, "IMC: " + df.format(imc)
                + "\nResultado: " + resultado, "IMC", JOptionPane.INFORMATION_MESSAGE);
    }

}
