package aula08_exemplo01;

import aula08_exemplo01.modelo.Funcionario;

public class Aula08_Exemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // objeto do tipo funcionario
        Funcionario f = new Funcionario();
        f.setNome("Alberto");
        f.setEndereco("R.das Esmeraldas, 500");
        f.setMatricula(123);
        f.setSalario(1200.00);
        System.out.println(f.imprimir()); // Usando método de Pessoa
        // e os outros dados ???
        // Implementar o método polimórfico imprimir() na classe Funcionario 
        
    }

}
