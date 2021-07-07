package progrii_aula03_exemplo06;

public class ProgrII_Aula03_Exemplo06 {

    //método principal
    public static void main(String[] args) {

	Aluno a1 = new Aluno(00001,”Maria”) ; //Necessária a classe Aluno
	Aluno a2 = new Aluno(00002,”José”) ;
	List<Aluno> alunos = new ArrayList<Aluno>(); 
	alunos.add(a1) ;
	alunos.add(a2) ;
	Aluno a = alunos.get(1); // Sem casting, pois o método get() retorna um Aluno !!! 
	JOptionPane.showMessageDialog(null, a.getNome()) ;
    }
}