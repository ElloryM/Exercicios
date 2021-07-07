/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author RonaldoCandido
 */
public class Livro {
    //atributos
    private int codigo ;
    private String autor, titulo, editora;    
    private float preco;

    // construtores
    public Livro() {
        codigo = 0 ;
        autor = "" ;
        titulo = "" ;
        editora = "" ;
        preco = 0 ;
    }    

    public Livro(int codigo, String autor, String titulo, String editora, float preco) {
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.editora = editora;
        this.preco = preco;
    }

    
    // métodos de acesso
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    //Outros métodos
    public String imprimirDados() 
    { 
        return "Código: " + codigo + " Autor: " + autor + " Título: " + titulo+ " Editora: " + editora + " Preco: " + preco ;
    }
}
