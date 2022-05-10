package String;


/* Indique se uma expressão é palídrome
 */

public class ExercicioB {

	public static void main(String[] args) {
		String string = "amor me ama em roma";
		System.out.println("String: " + string);
		char[] rev = string.toCharArray();
		char temp;
		int ls = string.length()-1;
		//System.out.println(Arrays.toString(rev));
		
		for(int i = 0; i < ls; i++) {
			temp = rev[i];
			rev[i] = rev[ls];
			rev[ls] = temp;
			ls --;
		}
		
		String stringRev = new String(rev);
		System.out.println("String invertida: " + stringRev);
		
		if(string.equals(stringRev)) {
			System.out.println("É um palídrome");
		} else {
			System.out.println("Não é um palídrome");
		}
	}
}