/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06_exemplo01;

import fabrica.Carro;
import fabrica.Motor;

/**
 *
 * @author RonaldoCandido
 */
public class Aula06_Exemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // objetos
        Motor m1 = new Motor(1.0F) ;
        Motor m2 = new Motor(1.6F) ;
        
        Carro c1 = new Carro("Volkswagen",m1) ;
        Carro c2 = new Carro("Chevrolet",m2) ;
        
        //Exibição
        System.out.println("Carro 1 : " + c1.getModelo() 
                + "\tMotor: " + c1.getMotor().getCilindrada() + "\tVel. Máx.: " + c1.obterVelocidadeMaxima());
        System.out.println("Carro 2 : " + c2.getModelo() 
                + "\tMotor: " + c2.getMotor().getCilindrada() + "\tVel. Máx.: " + c2.obterVelocidadeMaxima());
    }
    
}
