package CollectionFramework;

import java.util.HashMap;

public class InterfaceMap {

	/* A Inteface Map funciona como uma tabela que indexa o objeto a uma chave que 
	 * n�o pode se repetir (chave, valor). A chave � utilizada para recuperar o objetos;
	 */
	
	public static void main(String[] args) {
		
		/* A principal implementa��o da interface Map � a classe HashMap;
		 */
		
		HashMap<String, String> mapa = new HashMap<String, String>();
		
		
		/* O m�todo put � utilizado para adicionar a chave e o valor no Map;
		 */
		
		mapa.put("RM1234", "Thiago");
		mapa.put("RM1231", "Jo�o");
		mapa.put("RM1232", "Roberto");
		mapa.put("RM3213", "F�tima");
		mapa.put("RM1234", "Alice");
		mapa.put("RM1235", "Jade");
		
		System.out.println(mapa);
		
		
		/* O m�todo containKey verifica se determinada chave est� presente no Map;
		 */
		
		System.out.println(mapa.containsKey("RM1234"));
		
		
		/* O m�todo containValue verifica se determinado valor est� presente no Map;
		 */
		
		System.out.println(mapa.containsValue("Paulo"));
		
		
		/* O m�todo get retorna o valor associado a uma determinada chave;
		 */
		
		System.out.println(mapa.get("RM4321"));
	
	
		/* o m�todo isEmpty retorna se o mapeamento est� vazio;
		 */
		
		System.out.println(mapa.isEmpty());
		
		
		/* O m�todo keySet retorna um Set contendo as chaves;
		 */
		
		System.out.println(mapa.keySet());
		
		
		/* O m�todo remove remove um mapeamento de uma determinada chave;
		 */
		
		mapa.remove("RM4321");
		
		System.out.println(mapa);
		
		
		/* O m�todo size retorna a quantidade de mapeamentos; 
		 */
		
		System.out.println(mapa.size());
		
		
		/* O m�todo values retorna um Set dos valores mapeados;
		 */
		
		System.out.println(mapa.values());
		
	}
}
