package String;


/* Indique se uma express�o � pal�drome
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
			System.out.println("� um pal�drome");
		} else {
			System.out.println("N�o � um pal�drome");
		}
	}
}