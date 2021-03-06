package Encapsulamento;

public class Teste {
	public static void main(String[] args) {
		System.out.println("Ol?, Mundo!");
		
		/*
		O operador "new" inicializa uma inst?ncia/refer?ncia de um objeto de uma classe;
		O operador "new" cria um objeto na ?rea de aloca??o dinamica da mem?ria deixando acess?vel pela aplica??o;
		*/
		
		Conta c1 = new Conta("00001","0021012","888.888.888.88");
		
		/*
		O construtor ? definido como um m?todo cujo nome deve ser o mesmo nome da classe e sem indica??o do tipo de retorno
		new Classe("xxxxxx","xxxxxxxxx"...);
		O construtor ? invocado unicamente no momento da cria??o do objeto atrav?s do operador new;
		*/
		
		//c1.setAgencia("000001"); set = atribuir um valor
		c1.getCliente().setNome("Caio");
		float novoSaldo = c1.Depositar(100);
		
		System.out.println(c1.getCliente().getNome());
		System.out.println(novoSaldo);
		System.out.println(c1.toString());
	}
}
