package progri_aula08_exercicio01.modelo;

public class Software extends Produto{
    
    private String categoria ;

    public Software() {
        this.categoria = "";
    }

    public Software(String categoria, int codigo, String descricao, float preco, float peso) {
        super(codigo, descricao, preco, peso);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public String imprimir()
    {
        return super.imprimir() + "\nCategoria: " + categoria ;
    }
}
