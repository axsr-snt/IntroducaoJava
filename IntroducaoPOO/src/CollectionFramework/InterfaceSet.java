package CollectionFramework;

import java.util.HashSet;

public class InterfaceSet {

	/* A Interface Set define uma cole��o que n�o pode conter valores duplicados. Nem
	 * Sempre a ordem de inser��o dos elementos ser� a ordem dos elementos dispostos
	 * na cole��o, isso pode variar de implementa��o para implementa��o.
	 */
	
	public static void main(String[] args) {
		
		/* Uma das principais implementa��es de Set � a classe HashSet, que armazena
		 * seus elementos em uma tabela hash. � uma implementa��o muito simples e 
		 * eficiente.
		 * A vantagem do Set � a performance nas opeta��es de busca(m�todo contains) em
		 * Rela��o a List
		 */
		
		HashSet<String> cursos = new HashSet<String>();
		
		cursos.add("Java");
		cursos.add(".NET");
		cursos.add("Android");
		
		cursos.add("Java");
		
		/* Como pode ser visto na execu��o desse programa a segunda palavra Java n�o 
		 * foi adicionada ao HashSet por ser repetida;
		 */
		
		System.out.println(cursos);
		
		
		/* O m�todo contains verifica se um objeto determinado faz parte da do Set
		 */
		
		System.out.println(cursos.contains(".NET"));
		
		
		/* O m�todo isEmpty verifica se o Set est� vazio
		 */
		
		System.out.println(cursos.isEmpty());
		
		
		/* O m�todo remove remove um objeto do Set
		 */
		
		cursos.remove("Android");
		
		System.out.println(cursos);
		
		
		/* O m�todo size retorna a quantidade de objeto est� armazenada no Set
		 */
		
		System.out.println(cursos.size());
		
		
		/* O m�todo toArray retorna um array contendo os objetos contidos no Set
		 */
		
		System.out.println(cursos.toArray());
		
		
		/* O m�todo remove um objeto determinado contido no Set
		 */
		
		cursos.remove(".NET");
		
		System.out.println(cursos);
	}
}
