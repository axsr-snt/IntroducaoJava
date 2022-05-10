package String;

import java.util.Arrays;

public class ExemploStringComparacao {
	
	/* Quanto utilizamos strings o ideal � instanciar o objeto em mem�ria
	 * heap, pois quando n�o instanciamos a string ela fica alocada no 
	 * pool de mem�ria do java 
	 */
	
	public static void main(String[] args) {
		
		String nome1 = new String("ma�a");
		String nome2 = new String("Ma�a");
		String nome3 = new String("ma�a");
		
		System.out.println(nome1.equals(nome2));
		/* Devido a caracteristica case sensitive as v�ri�veis n�o cont�m
		 * dados iguais.
		 */
		
		System.out.println(nome1.equalsIgnoreCase(nome2));
		/* O metodo equalsIgnoreCasa compara os dados ignorando a caracteristica
		 * case sensitive.
		 */
		
		System.out.println(nome1.equals(nome3));
		/* Os valores s�o exatamente iguais, pois o equals est� comparando
		 * o conte�do dos objetos
		 * (!nome1.equals(nome3)) adicionando um ! antes do objeto retorna
		 * a compara��o negativa !==
		 */
		
		boolean teste = (nome1 == nome3);
		System.out.println(teste);
		/* Quando se utiliza o operador == o java compara o endere�o de mem�ria
		 * em vez dos valores atribuidos aos objetos.
		 */
		
		String nome4 = "ma�a";
		String nome5 = "ma�a";
		
		teste = (nome4 == nome5);
		System.out.println(teste);
		/* Por estarem n o mesmo pool de mem�ria do java os valores est�o alocados
		 * no mesmo endere�o de mem�ria sendo assim o operador == dar� o resultado
		 * positivo para a igualdade, pois est�o sendo comparados os endere�os
		 * de mem�ria.
		 */
		
		String descricao = new String("Ma�a Gala, a ma�a mais doce do mercado");
		
		System.out.println(descricao.length());
		//Retorna o tamanho da string
		
		System.out.println(descricao.startsWith("Ma�a")); 
		//Retorna se a string come�a com Ma�a
		
		System.out.println(descricao.endsWith("doce"));
		//Retorna se a string termina com doce
		
		System.out.println(descricao.charAt(2));
		//Retorna o caractere que est� na posi��o 2
		
		System.out.println(descricao.indexOf("G"));
		//Retorna o index da posi��o do caracter "G"
		
		System.out.println(descricao.indexOf("Gala"));
		//Retorna o index do in�cio da palavra "Gala"
		
		System.out.println(descricao.indexOf("a"));
		/* Retorna o indice da primeira ocorr�ncia do caractere "a", caso
		 * retorne -1 significa que a string n�o possui o valor procurado
		 */
		
		System.out.println(descricao.lastIndexOf("a"));
		//Retorna o indice da �ltima ocorr�ncia do caractere "a"
		
		System.out.println(descricao.replace("G", "g"));
		//Substitui o caractere "G" pelo caractere "g"
		
		System.out.println(descricao.replace("Gala", "fuji"));
		//Substitui a palavra "Gala" pela palavra "Fuji"
		
		System.out.println(descricao.replace("a", "A"));
		//Substitui o caractere "a" pelo caracter "A"
		
		System.out.println(descricao.split(" ").length);
		/* O atributo split quebra a string em toda ocorrencia de " " e 
		 * o atributo length retorna quantas strings foram geradas
		 */
		
		System.out.println(Arrays.toString(descricao.split(" ")));
		/* O atributo split quebra a string em toda a ocorrencia de " " e
		 * o atributo toString retorna o array gerado em strings no print
		 */
		
		System.out.println(descricao.toLowerCase());
		//Transforma todos os caracteres em minusculos
		
		System.out.println(descricao.toUpperCase());
		//Transforma todos os caracteres em maiusculos
		
		System.out.println(descricao.substring(0,4));
		//Retorna um trecho da string entre os indice 0 e 4
		
		System.out.println(descricao.substring(4));
		//Retorna um trecho da string iniciando em 4 at� o indice final
		
		System.out.println(descricao.substring(
				descricao.indexOf("Ma�a"), 
				descricao.indexOf(" ")));
		/* Retorna um trecho delimitado pelo index da palavra "Ma�a" at� 
		 * o index do caractere  " "
		 */
		
		System.out.println(descricao);
		
	}
}
