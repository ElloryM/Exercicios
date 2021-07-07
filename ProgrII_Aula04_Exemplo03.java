public class Exemplo03 { 
  public static void main(String[] args) {
    // Usando Generics no tipo da lista
    List<Aluno> alunos = new ArrayList<Aluno>();  // <tipo do objeto>
    alunos.add(new Aluno(123, "Joao"));
    alunos.add(new Aluno(456, "Rosa"));
    alunos.add(new Aluno(789, "Ana"));
    alunos.add(new Aluno(246, "Lucas"));

    for (int i = 0; i < alunos.size(); i++) {
         System.out.print(alunos.get(i));
    }
    // Tarefas para substituir o for :
    // percorra a lista com for-each
    for (Aluno a : alunos) {
         System.out.print(a);
    }
    // percorra a lista com ListIterator
    ListIterator it = alunos.listIterator(); 
    while (it.hasNext()) 
    {
         Aluno elemento = it.next();
         System.out.print(elemento);
    }

  } // fim do main()
 } // fim da classe
