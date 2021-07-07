package progri_aula08_exercicio01.modelo;

public class CD extends Produto{
    
    private String nomeArtista ;

    public CD() {
        super() ;
        this.nomeArtista = "";
    }

    public CD(String nomeArtista, int codigo, 
            String descricao, float preco, float peso) {
        super(codigo, descricao, preco, peso);
        this.nomeArtista = nomeArtista;
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }
    
    public String imprimir()
    {
        return super.imprimir() + "\nArtista: " + nomeArtista ;
    }
    
}
