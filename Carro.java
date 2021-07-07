/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;

/**
 *
 * @author RonaldoCandido
 */
public class Carro {
    
    private String modelo ;
    private Motor motor ; 

    public Carro() {
        
    }

    public Carro(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    public float obterVelocidadeMaxima()
    {
        float vm = 0 ;
        if (motor.getCilindrada() <= 1.0)
            vm = 140 ;
        else
        if (motor.getCilindrada() <= 1.6)
            vm = 180 ;
        else
        if (motor.getCilindrada() <= 2.0)
            vm = 220 ;
        else
            vm = 260 ;
        
       return vm ;
    }

}
