package CollectionFramework;

import java.util.HashMap;

public class InterfaceMap {

	/* A Inteface Map funciona como uma tabela que indexa o objeto a uma chave que 
	 * não pode se repetir (chave, valor). A chave é utilizada para recuperar o objetos;
	 */
	
	public static void main(String[] args) {
		
		/* A principal implementação da interface Map é a classe HashMap;
		 */
		
		HashMap<String, String> mapa = new HashMap<String, String>();
		
		
		/* O método put é utilizado para adicionar a chave e o valor no Map;
		 */
		
		mapa.put("RM1234", "Thiago");
		mapa.put("RM1231", "João");
		mapa.put("RM1232", "Roberto");
		mapa.put("RM3213", "Fátima");
		mapa.put("RM1234", "Alice");
		mapa.put("RM1235", "Jade");
		
		System.out.println(mapa);
		
		
		/* O método containKey verifica se determinada chave está presente no Map;
		 */
		
		System.out.println(mapa.containsKey("RM1234"));
		
		
		/* O método containValue verifica se determinado valor está presente no Map;
		 */
		
		System.out.println(mapa.containsValue("Paulo"));
		
		
		/* O método get retorna o valor associado a uma determinada chave;
		 */
		
		System.out.println(mapa.get("RM4321"));
	
	
		/* o método isEmpty retorna se o mapeamento está vazio;
		 */
		
		System.out.println(mapa.isEmpty());
		
		
		/* O método keySet retorna um Set contendo as chaves;
		 */
		
		System.out.println(mapa.keySet());
		
		
		/* O método remove remove um mapeamento de uma determinada chave;
		 */
		
		mapa.remove("RM4321");
		
		System.out.println(mapa);
		
		
		/* O método size retorna a quantidade de mapeamentos; 
		 */
		
		System.out.println(mapa.size());
		
		
		/* O método values retorna um Set dos valores mapeados;
		 */
		
		System.out.println(mapa.values());
		
	}
}
