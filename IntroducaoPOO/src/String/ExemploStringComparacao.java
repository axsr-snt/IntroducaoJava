package String;

import java.util.Arrays;

public class ExemploStringComparacao {
	
	/* Quanto utilizamos strings o ideal é instanciar o objeto em memória
	 * heap, pois quando não instanciamos a string ela fica alocada no 
	 * pool de memória do java 
	 */
	
	public static void main(String[] args) {
		
		String nome1 = new String("maça");
		String nome2 = new String("Maça");
		String nome3 = new String("maça");
		
		System.out.println(nome1.equals(nome2));
		/* Devido a caracteristica case sensitive as váriáveis não contém
		 * dados iguais.
		 */
		
		System.out.println(nome1.equalsIgnoreCase(nome2));
		/* O metodo equalsIgnoreCasa compara os dados ignorando a caracteristica
		 * case sensitive.
		 */
		
		System.out.println(nome1.equals(nome3));
		/* Os valores são exatamente iguais, pois o equals está comparando
		 * o conteúdo dos objetos
		 * (!nome1.equals(nome3)) adicionando um ! antes do objeto retorna
		 * a comparação negativa !==
		 */
		
		boolean teste = (nome1 == nome3);
		System.out.println(teste);
		/* Quando se utiliza o operador == o java compara o endereço de memória
		 * em vez dos valores atribuidos aos objetos.
		 */
		
		String nome4 = "maça";
		String nome5 = "maça";
		
		teste = (nome4 == nome5);
		System.out.println(teste);
		/* Por estarem n o mesmo pool de memória do java os valores estão alocados
		 * no mesmo endereço de memória sendo assim o operador == dará o resultado
		 * positivo para a igualdade, pois estão sendo comparados os endereços
		 * de memória.
		 */
		
		String descricao = new String("Maça Gala, a maça mais doce do mercado");
		
		System.out.println(descricao.length());
		//Retorna o tamanho da string
		
		System.out.println(descricao.startsWith("Maça")); 
		//Retorna se a string começa com Maça
		
		System.out.println(descricao.endsWith("doce"));
		//Retorna se a string termina com doce
		
		System.out.println(descricao.charAt(2));
		//Retorna o caractere que está na posição 2
		
		System.out.println(descricao.indexOf("G"));
		//Retorna o index da posição do caracter "G"
		
		System.out.println(descricao.indexOf("Gala"));
		//Retorna o index do início da palavra "Gala"
		
		System.out.println(descricao.indexOf("a"));
		/* Retorna o indice da primeira ocorrência do caractere "a", caso
		 * retorne -1 significa que a string não possui o valor procurado
		 */
		
		System.out.println(descricao.lastIndexOf("a"));
		//Retorna o indice da última ocorrência do caractere "a"
		
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
		//Retorna um trecho da string iniciando em 4 até o indice final
		
		System.out.println(descricao.substring(
				descricao.indexOf("Maça"), 
				descricao.indexOf(" ")));
		/* Retorna um trecho delimitado pelo index da palavra "Maça" até 
		 * o index do caractere  " "
		 */
		
		System.out.println(descricao);
		
	}
}
