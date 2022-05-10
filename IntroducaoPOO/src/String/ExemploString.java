package String;

public class ExemploString {

	public static void main(String[] args) {
		
		System.out.println("\nTESTE STRING 1");
		String nome1;
		/* System.out.println(nome1.length());
		 * 
		 * Ocorrerá a erro devido a falta de um valor atribuido a string
		 * pois se a variavel não for alocada ela estará em cash utilizado 
		 * pelo Java e não em um espaço reservado para a variável
		 */
		nome1 = "Teste nome 1";
		System.out.println(nome1.length());
		
		System.out.println("\nTESTE STRING 2");
		String nome2 = new String();
		System.out.println(nome2.length());
		System.out.println(nome2);
		nome2 = "Teste nome 2";
		System.out.println(nome2.length());
		System.out.println(nome2.length());
		
		System.out.println("\nTESTE STRING 3");
		String nome3 = new String("Teste nome 3");
		System.out.println(nome3.length());
		
		// EXEMPLO DE ESCAPE DE EXCEÇÃO
		
		System.out.println("\nTESTE STRING 4");
		String nome4 = "FIAP \nA melhor faculdade de tecnologia\n";
		System.out.println(nome4);
		System.out.println("FIAP \nA melhor faculdade de tecnologia\n");
		// IMPRIMINDO ASPAS DUPLAS
		System.out.println("FIAP \"A melhor faculdade de tecnologia\"\n");
		
		//CONCATENAÇÃO
		String nome5 = "FIAP";
		String slogan = "A melhor faculdade de tecnologia";
		String texto = nome5 + " " + slogan;
		System.out.println(texto);
		
		texto = nome5;
		texto += " - ";
		texto += slogan;
		System.out.println(texto);
		
		System.out.println(nome5.concat(" - ").concat(slogan).concat("!"));
	}
}
