package Excecoes;

public class TratExcecCalculadora {

	public String dividir(int n1, int n2) throws Exception {
		try {
			return "Sua divis�o �" +n1/n2;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		return "N�o foi poss�vel realizar o calculo com esses parametros";
	}
	
}
