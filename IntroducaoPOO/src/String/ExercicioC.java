package String;

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
		
		String newString = new String();
		
		int idx = arrayString.length - 1;
		
		for(int i = 0; i < idx; i++) {
			String test = arrayString[i];
			if(newString.indexOf(test) == -1){
				newString += test + " ";
			}
		}
		StringBuilder outString = new StringBuilder(newString);
		outString.setLength(newString.length());
		int idxLastSpace = newString.lastIndexOf(" ");
		outString = outString.deleteCharAt(idxLastSpace);
		System.out.println(outString);
	}
}


