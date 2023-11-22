package projetos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataRealTerminoProjeto {
	
public static void main(String[] args) {
		
		LocalDate dataBase = LocalDate.parse("2024-10-05");
		
		for(int mes = 1 ; mes <= 12; mes ++) {
			dataBase = dataBase.plusMonths(1);
			System.out.println("Data termino projeto : " 
			+ dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " do mês: " + mes);
			
		}

}
}
