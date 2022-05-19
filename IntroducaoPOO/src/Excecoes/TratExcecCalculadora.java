package Excecoes;

public class TratExcecCalculadora {

	public String dividir(int n1, int n2) throws Exception {
		try {
			return "Sua divisão é" +n1/n2;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		return "Não foi possível realizar o calculo com esses parametros";
	}
	
}
