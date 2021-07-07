
package aula08_exemplo01.modelo;

public class Pessoa extends Object { // classe mãe
    
    // atributos
    private String nome, endereco ;
    
    // construtor

    public Pessoa() {
         this. nome = "" ;
         this.endereco = "" ;
    }

    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    // método para imprimir os dados
    public String imprimir() {
        return "Nome= " + nome + "\nEndereço= " + endereco;
    }
      
} // fim da classe
