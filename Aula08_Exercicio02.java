package aula08_exercicio02;

import aula08_exercicio02.modelo.Estagiario;
import aula08_exercicio02.modelo.Funcionario;
import aula08_exercicio02.modelo.Vendedor;

public class Aula08_Exercicio02 {

    public static void main(String[] args) {
        
        // Criando funcionário
        Funcionario f = new Funcionario (1200) ;
        System.out.println("Funcionário: \nSalário Bruto: " + f.getSalarioBruto()
                + "\nDesconto: " + f.calcularDesconto() + "\nSalário Líquido: " 
                + f.calcularSalarioLiquido()) ;
  
        // Criando estagiário
        Estagiario e = new Estagiario () ;
        e.setSalarioBruto(900);
        System.out.println("\nEstagiário: \nSalário Bruto: " + e.getSalarioBruto()
                + "\nDesconto: " + e.calcularDesconto() + "\nSalário Líquido: " 
                + e.calcularSalarioLiquido()) ;

        // Criando vendedor
        Vendedor v = new Vendedor () ;
        v.setSalarioBruto(1000);
        v.setBonus(10);
        System.out.println("\nVendedor: \nSalário Bruto: " + v.getSalarioBruto()
                + "\nDesconto: " + v.calcularDesconto() + "\nBônus %: " + v.getBonus() +
                "\nSalário Líquido: " + v.calcularSalarioLiquido()) ;
    }
    
}
