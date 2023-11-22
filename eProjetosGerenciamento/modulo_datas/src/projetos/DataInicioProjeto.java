package projetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataInicioProjeto {
	
	private static Date dataInicioProjeto;

	public static void main(String[] args) throws ParseException{
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataInicioProjeto = simpleDateFormat.parse("11/11/2023");
		
		Date dataAtualHoje = simpleDateFormat.parse("10/10/2023");
		
		if (dataInicioProjeto.after(dataAtualHoje)) {
			System.out.println("Boleto não vencido");
		}else {
			System.out.println("Data de Início do Projeto");
		}
		
		if (dataInicioProjeto.before(dataAtualHoje)) {
			System.out.println("Data de Início do Projeto");
		}else {
			System.out.println("Projeto Iniciado");
		}
				
	}

	public static Date getDataInicioProjeto() {
		return dataInicioProjeto;
	}

	public static void setDataInicioProjeto(Date dataInicioProjeto) {
		DataInicioProjeto.dataInicioProjeto = dataInicioProjeto;
	}
		
}	
	
	
	
