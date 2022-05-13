package CollectionFramework;

import java.util.HashSet;

public class InterfaceSet {

	/* A Interface Set define uma coleção que não pode conter valores duplicados. Nem
	 * Sempre a ordem de inserção dos elementos será a ordem dos elementos dispostos
	 * na coleção, isso pode variar de implementação para implementação.
	 */
	
	public static void main(String[] args) {
		
		/* Uma das principais implementações de Set é a classe HashSet, que armazena
		 * seus elementos em uma tabela hash. É uma implementação muito simples e 
		 * eficiente.
		 * A vantagem do Set é a performance nas opetações de busca(método contains) em
		 * Relação a List
		 */
		
		HashSet<String> cursos = new HashSet<String>();
		
		cursos.add("Java");
		cursos.add(".NET");
		cursos.add("Android");
		
		cursos.add("Java");
		
		/* Como pode ser visto na execução desse programa a segunda palavra Java não 
		 * foi adicionada ao HashSet por ser repetida;
		 */
		
		System.out.println(cursos);
		
		
		/* O método contains verifica se um objeto determinado faz parte da do Set
		 */
		
		System.out.println(cursos.contains(".NET"));
		
		
		/* O método isEmpty verifica se o Set está vazio
		 */
		
		System.out.println(cursos.isEmpty());
		
		
		/* O método remove remove um objeto do Set
		 */
		
		cursos.remove("Android");
		
		System.out.println(cursos);
		
		
		/* O método size retorna a quantidade de objeto está armazenada no Set
		 */
		
		System.out.println(cursos.size());
		
		
		/* O método toArray retorna um array contendo os objetos contidos no Set
		 */
		
		System.out.println(cursos.toArray());
		
		
		/* O método remove um objeto determinado contido no Set
		 */
		
		cursos.remove(".NET");
		
		System.out.println(cursos);
	}
}
