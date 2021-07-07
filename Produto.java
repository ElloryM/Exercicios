package progri_aula08_exercicio01.modelo;

public class Produto {

    //atributos
    private int codigo ;
    private String descricao ;
    private float preco, peso ;
    
    //construtor
    public Produto() {
        codigo = 0 ;
        descricao = "" ;
        preco = 0 ;
        peso = 0 ;
    }
    
    public Produto (int codigo, String descricao,
            float preco, float peso)
    {
        this.codigo = codigo ;
        this.descricao = descricao ;
        this.preco = preco ;
        this.peso = peso ;
    }
    
    //métodos de acesso
    public void setCodigo(int codigo)
    {
        this.codigo = codigo ;
    }
    
    public int getCodigo()
    {
        return this.codigo ;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    //retornar todos os dados
    public String imprimir()
    {
        return "Código: " + codigo +
                "\nDescrição: " + descricao +
                "\nPreço R$ " + preco +
                "\nPeso : " + peso + 
                "\nFrete : R$ " + calcularFrete();
    }
    
    //cálculo do frete
    public float calcularFrete()
    {
        return peso * 6.50F ;
    }
    
} // fim da classe
