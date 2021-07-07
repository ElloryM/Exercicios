/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05_exercicio03;

import javax.swing.JOptionPane;
import modelo.Livro;

/**
 *
 * @author RonaldoCandido
 */
public class Aula05_Exercicio03 {

    //constante para limite do vetor
    public static final int MAX = 2 ;
 
    public static void main(String[] args) {
        // Variáveis
        Livro v[ ] = new Livro[MAX];
        int codigo;
        String titulo, autor, editora; 
        float preco;
        
        // entrada de dados
        //Guardando no vetor de livros com dados obtidos via teclado
        for (int i = 0; i < v.length; i++) 
        { 
            // digitação e conversão, se necessário
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo ? ")); 
            titulo = JOptionPane.showInputDialog("Título ? "); 
            autor = JOptionPane.showInputDialog("Autor ? "); 
            editora = JOptionPane.showInputDialog("Editora ? "); 
            preco = Float.parseFloat(JOptionPane.showInputDialog("Preço ? ")); 

            // criar objeto com os dados
            Livro livro = new Livro(codigo,autor, titulo, editora,preco); 
            // guardar o livro no vetor na posição i
            v[i] = livro ;
        }
        
        //item a) apresente todos os dados de todos os livros. 
        for (int i = 0; i < v.length; i++) 
            JOptionPane.showMessageDialog(null, v[i].imprimirDados());     
        
        // item b) apresente os preços e códigos dos livros de um determinado autor passado como parâmetro
        autor = JOptionPane.showInputDialog("Autor ? "); 
        for (Livro liv : v) { // percorre o vetor (for-each)
            if (liv.getAutor().equals(autor)) {
                JOptionPane.showMessageDialog(null, "Preço: " + liv.getPreco() + " Código: " + liv.getCodigo());
            }     
        }
        
        // item c) apresente os códigos e títulos, em maiúsculas, dos livros que custam abaixo de um preço
        // previamente obtido via teclado.
        preco = Float.parseFloat(JOptionPane.showInputDialog("Preço ? ")); 
        for (Livro liv : v) { // percorre o vetor (for-each)
            if (liv.getPreco() < preco) {
                JOptionPane.showMessageDialog(null, "Código: " + liv.getCodigo() + 
                        " Título: " + liv.getTitulo().toUpperCase());
            }     
        }

        
    } // fim main()
} //fim da classe
