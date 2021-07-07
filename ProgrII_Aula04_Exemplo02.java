// método principal
public static void main(String[] args) {
   // Criar uma nova lista. Qual o tipo ?     
   List lista = new ArrayList();
    // Adicionar na lista
   lista.add("Dinardo");
   lista.add("Rosa");
   lista.add("Dinardo"); // item repetido
   lista.add("Rafael");
   lista.add("Luís");
   lista.add(2465); // Isto é possível ?
   // Percorrer a lista
   for (Object obj : lista)
        System.out.println(obj.toString());
   // remover da lista
   lista.remove("Rafael");      
   lista.remove("Carlos"); // ???
// Qual será removido ?
 lista.remove("Dinardo");
 //Percorrer novamente a lista
 for (Object obj : lista)
 {  String s = obj.toString() ;
    System.out.println(s); } 
 //obter o primeiro da lista              
 System.out.println(lista.get(0));
 //obter tamanho da lista
 int t = lista.size() ;
 // obter o último da lista
 System.out.println(lista.get(t-1));
 //alterar item da lista
 lista.set(1, 200);
 lista.set(2, "Andre");
} // fim do main() 
