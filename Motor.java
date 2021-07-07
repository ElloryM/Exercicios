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
public class Motor {
    
    private float cilindrada ;

    public Motor() {
            
    }

    public Motor(float cilindrada) {
        this.cilindrada = cilindrada;
    }

    public float getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    
}
