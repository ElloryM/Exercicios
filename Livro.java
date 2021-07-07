package progri_aula08_exercicio01.modelo;

public class Livro extends Produto {

    private String autor ;
    
    public Livro()
    {
        super() ;
        this.autor = "" ;
    }
    
    public Livro(int codigo, String descricao,
            float preco, float peso, String autor)
    {
        super(codigo, descricao, preco, peso) ;
        this.autor = autor ;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String imprimir()
    {
        return super.imprimir() + "\nAutor: " + autor ;
    }
}
