package projetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataRealTermino {
	
	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance(); 
		
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-10-2023"));
		
		calendar.add(Calendar.DAY_OF_MONTH, 40); 
		
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.MONTH, 1); 
		
		System.out.println("Somando o mês : " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.YEAR, 1); 
		
		System.out.println("Somando 1 ano : " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		
	}

}
