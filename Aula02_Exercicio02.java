package aula02_exercicio02;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Aula02_Exercicio02 {

    public static void main(String[] args) {
        JFrame f = new JFrame("Conversão de temperatura");
        FlowLayout layout = new FlowLayout() ;
        layout.setAlignment(FlowLayout.CENTER);
        f.setLayout(layout);
        JLabel lblCelsius = new JLabel("Temperatura em Celsius") ;
        JLabel lblFahr = new JLabel("Temperatura em Fahrenheit") ;
        JTextField txtCelsius = new JTextField(8) ;
        JTextField txtFahr = new JTextField(8) ;
        JButton btnConverter = new JButton("Converter >>>");
        f.add(lblCelsius);
        f.add(txtCelsius);
        f.add(btnConverter);
        f.add(lblFahr);
        f.add(txtFahr);
        f.setSize(630,120);
        f.setLocationRelativeTo(null); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);       
    }

}
