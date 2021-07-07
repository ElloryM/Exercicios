package progrii_aula01_exercicio02;

import progrii_aula01_exercicio02.modelo.Medico;

public class ProgrII_Aula01_Exercicio02 {

    public static void main(String[] args) {
        
        //definir as especialidades
        String v[] = {"Pediatria", "Cirurgia", "Cardiologia"} ;
        //cadastrar o médico
        Medico m = new Medico(11111, "Carlos Soares", v) ;
        //exibir os dados
        System.out.println(m.imprimirDados());
    }

}
