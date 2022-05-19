package ManipulacaoArquivos;

import java.io.File;
import java.io.IOException;

public class Gerenciador {
	
	public static void main(String[] args) {
		
		File arquivo = new File("arquivo.txt");
		
		// Verifica se o arquivo existe
		if (arquivo.exists()) {
			System.out.println("O arquivo existe! " +
								"\nPode ser lido: " + arquivo.canRead() + 
								"\nPode ser gravado: " + arquivo.canWrite() +
								"\nTamanho: " + arquivo.length() +
								"\nCaminho: " + arquivo.getPath());
		} else {
			// Cria o arquivo
			try {
				if (arquivo.createNewFile())
					System.out.println("Arquivo criado!");
				else
					System.out.println("Arquivo n�o criado!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
/* Verifica se um diret�rio existe, caso negativo cria o diret�rio;
			File diretorio = new File("fiap");
			
			if (diretorio.exists()){
				System.out.println("Diret�rio existe!");
				
			}else{
				if (diretorio.mkdir())
					System.out.println("Diret�rio criado!");
					
				else
					System.out.println("Diret�rio n�o criado.");
					
			}
			// Depois de criado o diret�rio � criado um arquivo dentro dele
			File arquivo = new File(diretorio,"file.txt");
			
			try {
				if (arquivo.createNewFile())
					System.out.println("Arquivo criado!");
				
				else
					System.out.println("Arquivo n�o criado!");
			
			} catch (IOException e) {
				e.printStackTrace();
			
			}
*/
	}
}
