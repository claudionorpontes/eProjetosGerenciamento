package arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arquivos {
	
	private static Object entradaArquivo;

	public static void main(String[] args) throws IOException {
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setEmail("pessoa1@gmail.com");
		pessoa1.setIdade(50);
		pessoa1.setNome("Alex Egidio");
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setEmail("pessoa2@gmail.com");
		pessoa2.setIdade(25);
		pessoa2.setNome("Marcos Tadeu");
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setEmail("pessoa3@gmail.com");
		pessoa3.setIdade(40);
		pessoa3.setNome("Maria Jesus");
		
		/*Esses dados podem vir de um banco de dados ou qualquer outra fonte*/
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		File arquivo = new File("C:\\ws java ee\\AulaPOO\\src\\arquivos\\arquivo.csv");
		
		Scanner lerArquivo = new Scanner((InputStream) entradaArquivo, "UTF-8");
		
		List<Pessoa> pessoas1 = new ArrayList<Pessoa>();
		
		while (lerArquivo.hasNext()) {
			
			String linha = lerArquivo.nextLine();
			
			if (linha != null !=linha.isEmpty()) {
				
				String[] dados = linha.split("\\;");
			}
		}
		
		/*Condição "caso o arquivo não exista*/
		
		if (!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		FileWriter escrever_no_arquivo = new FileWriter(arquivo);
		
		for(Pessoa p : pessoas1) {
			escrever_no_arquivo.write(p.getNome() + ";" + p.getEmail() + ";" + p.getIdade() + "\n");
			
	}	
		escrever_no_arquivo.flush();
		escrever_no_arquivo.close();	
	
	}

}






