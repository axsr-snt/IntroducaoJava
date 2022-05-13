package CollectionFramework;

import java.util.ArrayList;

public class InterfaceList {
	
	/* A Interface List representa uma sequ�ncia de elementos ordenados e pode conter
	 * elementos repetidos dispostos pela ordem de inser��o;
	 */

	public static void main(String[] args) {
		
		/* ArrayList � uma implementa��o do da interface List da API de Collections do
		 * Java. A ArrayList n�o � uma array, mas utiliza uma array interna para armazenar
		 * valores.
		 */
		
		ArrayList<String> lista = new ArrayList<String>();
		
		/* O m�todo add adiciona um objeto no final da lista
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
		
		/* O m�todo set permite indicar em qual posi��o da lista ser� adicionado o novo
		 * objeto, por�m exclui o objeto que est� contido nessa posi��o, se houver.
		 */
		
		lista.set(1, "Algoritmos");
		
		System.out.println("\nLISTA DEPOIS DO SET " + lista);
		
		/* Para remover um item salvo na lista � utilizado o m�todo remove quando 
		 * se fornece a posi��o do item;
		 */
		
		lista.remove(1);
		
		System.out.println("\nLISTA DEPOIS DO DELETE" + lista);
		
		/* O m�todo get recupera um elemento dado a sua posi��o;
		 */
		
		System.out.println(lista.get(1));
		
		
		/* O m�todo size retorna a quantidade de elementos na cole��o;
		 */
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista .get(i));
		}
		
		/* Para localizar um valor no ArrayList � utilizado indexOf e lasIndexOf semelhante
		 * a classe string. Se for retornado -1 o valor pesquisado n�o existe na lista;
		 */
		
		int indice = lista.indexOf("Interface List");
		
		System.out.println("O valor \"Interface List\" " + "est� na posi��o: " + indice);
		
		/* De forma funcional semelhante temos o lastIndexOF que retorna a ultima 
		 * ocorr�ncia do item pequisado;
		 */
		
		System.out.println();
	}
}
