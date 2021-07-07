package progrii_aula01_exercicio02.modelo;

public class Medico {

    //atributos
    private int crm;
    private String nome;
    private String[] especialidade;

    //construtor
    public Medico(int crm, String nome, String[] especialidade) {
        this.crm = crm;
        this.nome = nome;
        this.especialidade = especialidade;
    }
    
    //métodos de acesso
    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[] getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String[] especialidade) {
        this.especialidade = especialidade;
    }

    //método para exibir
    public String imprimirDados() {
        String lista = "" ;
        for (String e : especialidade)
        {
            lista += e + " " ;
        }
        
        String saida = "\nCRM: " + crm + "\nNome: Dr(a). " + nome 
                + "\nEspecialidade(s): " + lista;
        return saida ;
    }
}
