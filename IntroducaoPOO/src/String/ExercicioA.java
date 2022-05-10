package String;

import java.util.Arrays;

/* Considere a string BANANADA e combine as intruções de manipulação
 * de string para:
 * 1 - Imprimir ANA, usando substring;
 * 2 - Substituir a string BANANADA por BANDA, usando a instrução replace;
 * 3 - Indicar as posições de todos os A's existentes na palara BANANADA;
 */

public class ExercicioA {

	public static void main(String[] args) {
		
		String string = "BANANADA";
		
		// PARTE 1
		
		String substr = string.substring(string.indexOf("AN"),4);
		System.out.println(substr);
		
		// PARTE 2
		
		String rep = string.replace("BANANADA", "BANDA");
		System.out.println(rep);
		
		// PARTE 3
		
		String[] letras = string.split("");
		System.out.println(Arrays.toString(letras));
		for(int i = 0; i < string.length(); i++) {
			char l = string.charAt(i);
			if(l == 'A') {
				System.out.println(i);
			}			
		}
	}
}
