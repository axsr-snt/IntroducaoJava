package CollectionFramework;

import java.util.ArrayList;

public class InterfaceList {
	
	/* A Interface List representa uma sequência de elementos ordenados e pode conter
	 * elementos repetidos dispostos pela ordem de inserção;
	 */

	public static void main(String[] args) {
		
		/* ArrayList é uma implementação do da interface List da API de Collections do
		 * Java. A ArrayList não é uma array, mas utiliza uma array interna para armazenar
		 * valores.
		 */
		
		ArrayList<String> lista = new ArrayList<String>();
		
		/* O método add adiciona um objeto no final da lista
		 */
		
		System.out.println("OBJETOS ADICIONADOS A LISTA COM add");
		
		lista.add("LTP");
		lista.add("Web");
		lista.add("Algoritmos");
		lista.add("Java");
		lista.add("Framework Collections");
		lista.add("Interface List");
		lista.add("ArrayList");
		lista.add("Web");
		
		System.out.println(lista);
		
		/* O método set permite indicar em qual posição da lista será adicionado o novo
		 * objeto, porém exclui o objeto que está contido nessa posição, se houver.
		 */
		
		lista.set(1, "Algoritmos");
		
		System.out.println("\nLISTA DEPOIS DO SET " + lista);
		
		/* Para remover um item salvo na lista é utilizado o método remove quando 
		 * se fornece a posição do item;
		 */
		
		lista.remove(1);
		
		System.out.println("\nLISTA DEPOIS DO DELETE" + lista);
		
		/* O método get recupera um elemento dado a sua posição;
		 */
		
		System.out.println(lista.get(1));
		
		
		/* O método size retorna a quantidade de elementos na coleção;
		 */
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista .get(i));
		}
		
		/* Para localizar um valor no ArrayList é utilizado indexOf e lasIndexOf semelhante
		 * a classe string. Se for retornado -1 o valor pesquisado não existe na lista;
		 */
		
		int indice = lista.indexOf("Interface List");
		
		System.out.println("O valor \"Interface List\" " + "está na posição: " + indice);
		
		/* De forma funcional semelhante temos o lastIndexOF que retorna a ultima 
		 * ocorrência do item pequisado;
		 */
		
		System.out.println();
	}
}
