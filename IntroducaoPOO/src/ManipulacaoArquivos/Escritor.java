package ManipulacaoArquivos;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;


public class Escritor {
	
	public static void main(String[] args) {
		
		try {
			FileWriter streamer = new FileWriter("arquivo.txt");
			PrintWriter printer = new PrintWriter(streamer);
			
			printer.println("Teste");
			printer.println("Escrevendo no arquivo");
			
			
			printer.close();
			streamer.close(); // fecha o arquivo
			
		
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
