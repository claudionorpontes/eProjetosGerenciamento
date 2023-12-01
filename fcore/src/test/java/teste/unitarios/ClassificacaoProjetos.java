package teste.unitarios;

import org.junit.Test;

public class ClassificacaoProjetos {

	private String baixoRisco;
	private String medioRisco;
	private String altoRisco;
	
	@Test
	public String getBaixoRisco() {
		return baixoRisco;
	}
	@Test
	public void setBaixoRisco(String baixoRisco) {
		this.baixoRisco = baixoRisco;
	}
	@Test
	public String getMedioRisco() {
		return medioRisco;
	}
	@Test
	public void setMedioRisco(String medioRisco) {
		this.medioRisco = medioRisco;
	}
	@Test
	public String getAltoRisco() {
		return altoRisco;
	}
	@Test
	public void setAltoRisco(String altoRisco) {
		this.altoRisco = altoRisco;
	}

}
