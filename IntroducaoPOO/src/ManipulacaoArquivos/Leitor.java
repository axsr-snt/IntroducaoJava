package ManipulacaoArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leitor {
	
	public static void main(String[] args) {
		
		try {
			
			FileReader streamer = new FileReader("arquivo.txt");
			BufferedReader reader = new BufferedReader(streamer);
			
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				
				line = reader.readLine(); // lê a próxima linha do arquivo
			}
			
			reader.close();
			streamer.close(); // fecha o arquivo
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
