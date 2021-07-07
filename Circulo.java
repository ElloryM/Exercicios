package aula04_exercicio03.modelo;

/**
 *
 * @author RonaldoCandido
 */
public class Circulo {
    
    private float raio ;
    private int x,y ;

    // item c)
    public Circulo() {
        raio = 1 ;
        x = 0 ;
        y = 0 ;
    }

    public Circulo(float raio, int x, int y) {
        this.raio = raio;
        this.x = x;
        this.y = y;
    }

    //item b)
    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    //item d)
    public float distancia(Circulo outroCirculo)
    {
        return (float) Math.sqrt(Math.pow((x-outroCirculo.getX()),2) + (Math.pow((y - outroCirculo.getY()),2))) ;
    }
    
    //item e
    public double calcularArea()
    {
        return Math.PI * Math.pow(raio,2) ;
    }
    
    //item f
    public double calcularPerimetro()
    {
        return 2 * Math.PI * raio ;
    }
            
    // item g
      public String imprimirDados()
      {
          return "Centro: (" + x + ", " + y + ")\n" + "Raio: " + raio + "\n";
          
      }
}
