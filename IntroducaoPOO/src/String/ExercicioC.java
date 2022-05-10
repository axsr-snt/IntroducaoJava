package String;

import java.util.Arrays;

/* Dado um texto contendo comente palavras separadas por caracteres em
 * branco, terminando em ponto final, escreva apenas as palavras distintas
 * existentes no texto
 */

public class ExercicioC {
	
	public static void main(String[] args) {
		String string = "EU SOU MAIS EU ENQUANTO SOU EU";
		
		String removedDot = string.replace(".", "");
		System.out.println(removedDot);
		
		String[] arrayString = removedDot.split(" ");
		System.out.println(Arrays.toString(arrayString));
		
		int idx = arrayString.length -1;
		for(int i = 0; i < idx;i++) {
			for(int j = i+1; j < idx; j++) {
				int k = j+1;
				if(arrayString[i].equals(arrayString[k])) {
					arrayString[k].
				}
			}
		}
	}
}
