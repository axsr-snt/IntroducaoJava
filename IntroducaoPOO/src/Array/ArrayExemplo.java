package Array;

public class ArrayExemplo {

	public static void main(String[] args) {
	
		//Scanner leitor = new Scanner(System.in);
	
/* 
		PRIMEIRA FORMA PARA ATRIBUIR VALORES PARA O ARRAY	
		float valores[] = new float[5];	
		valores[0] = 10;
		valores[1] = 20;
		valores[2] = 30;
		valores[3] = 40;
		valores[4] = 50;
		 
		
		float valores[] = {10, 20, 30, 40, 50};
		float valores2[] = new float[] {10, 20, 30, 40, 50};
		
		
		System.out.println(valores[4]);
		System.out.println(valores2[4]);
		
*/	
/*
		// ARRAY COM OBJETOS
		
		ArrayExemploProduto produtos[] = new ArrayExemploProduto[2];
		
		ArrayExemploProduto prod1 = new ArrayExemploProduto();
		prod1.setNome("Limão");
		prod1.setDescricao("Galego");
		prod1.setValor(4);
		
		ArrayExemploProduto prod2 = new ArrayExemploProduto();
		prod2.setNome("Maça");
		prod2.setDescricao("Gala");
		prod2.setValor(5);
		
		produtos[0] = prod1;
		produtos[1] = prod2;
		
		for(int i = 0; i < produtos.length; i++) {
			System.out.println(produtos[i].toString());
		}
		
		// PARA PERCORRER UM OBJETO
		
		for(ArrayExemploProduto prod: produtos) {
			System.out.println(prod.toString());
		}
		
		//ARRAY MULTIDIMENSIONAL
		// 10 CORREDORES COM TRÊS PRATELEIRAS CADA
		
		ArrayExemploProduto[][] localizacaoProduto = new ArrayExemploProduto[10][3];
	
		localizacaoProduto[2][1] = prod1;
		localizacaoProduto[2][2] = prod2;
		
		System.out.println(localizacaoProduto[2][1].getNome());
*/
		
		ArrayExemploCarro[] carros = new ArrayExemploCarro[5];
		
		ArrayExemploCarro carro = new ArrayExemploCarro();
		
		carro.setModelo("Gol");
		
		carros[0] = carro;
		
		String modelo = carros[0].getModelo();
		System.out.println(modelo);
	}
}
