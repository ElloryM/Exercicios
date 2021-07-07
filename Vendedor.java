package aula08_exercicio02.modelo;

public class Vendedor extends Funcionario {

    private float bonus ;

    public Vendedor() {
        bonus = 0 ;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public float calcularSalarioLiquido() {
        return super.calcularSalarioLiquido() + bonus * getSalarioBruto() / 100 ; 
    }
    
}
