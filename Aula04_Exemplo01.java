package aula04_exemplo01;

/**
 *
 * @author RonaldoCandido
 */
public class Aula04_Exemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Usando a classe Math e seus métodos estáticos
        double x = 144.0;
        double y = Math.sqrt(x); // calcula a raiz quadrada de x
        long z     = Math.round(y); // arredonda o valor de y
        double n = Math.pow(y,3); // potência de y elevado ao cubo

        //exibindo
        System.out.println("x= " + x) ;
        System.out.println("y= " + y) ;
        System.out.println("z= " + z) ;
        System.out.println("n= " + n) ;
        System.out.println("n= " + Math.round(n)) ;

        // mais métodos
        double raio = 10.0 ; 
        double areaCirculo = Math.PI * raio * raio ; // PI vale 3,14159...
        int arredonda = (int) Math.round(areaCirculo) ; // casting
        double arredondaParaCima = Math.ceil(areaCirculo) ;
        double arredondaParaBaixo  = Math.floor(areaCirculo) ;

        // exibindo
        System.out.println(areaCirculo) ;
        System.out.println(arredonda) ;
        System.out.println(arredondaParaCima) ;
        System.out.println(arredondaParaBaixo) ;
        
        // usando random()
        System.out.println(Math.random()) ; // número entre 0.0 e 0.99999
        // simulando 6 lançamentos de um dado de jogo
        for (int i=0 ; i < 6 ; i++)
        {
            System.out.println((int)(Math.random() * 6 + 1)) ;
        }
    }
    
}
