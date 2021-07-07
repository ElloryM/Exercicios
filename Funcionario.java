package aula08_exemplo01.modelo;

public class Funcionario extends Pessoa {
    // atributos específicos
    private int matricula ;
    private double salario ;
    
    // construtor

    public Funcionario() {
        this.matricula = 0 ;
        this.salario = 0 ;
    }

    public Funcionario(int matricula, double salario, String nome, String endereco) {
        super(nome, endereco); // Chama o construtor da superclasse
        this.matricula = matricula;
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // polimorfismo
    public String imprimir()   {
        return super.imprimir() + "\nMatrícula= " + matricula + "\nSalário= " + salario ; 
    }
    
}
