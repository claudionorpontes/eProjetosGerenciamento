package teste.unitarios;

import org.junit.Test;

public class StatusEspecificoUnico {
	
	private String analisando;
	private String analiseRealizada;
	private String analiseAprovada;
	private String iniciado;
	private String planejado;
	private String prosseguindo;
	private String encerrado;
	private String cancelado;
	
	@Test
	public String getAnalisando() {
		return analisando;
	}
	@Test
	public void setAnalisando(String analisando) {
		this.analisando = analisando;
	}
	@Test
	public String getAnaliseRealizada() {
		return analiseRealizada;
	}
	@Test
	public void setAnaliseRealizada(String analiseRealizada) {
		this.analiseRealizada = analiseRealizada;
	}
	@Test
	public String getAnaliseAprovada() {
		return analiseAprovada;
	}
	@Test
	public void setAnaliseAprovada(String analiseAprovada) {
		this.analiseAprovada = analiseAprovada;
	}
	@Test
	public String getIniciado() {
		return iniciado;
	}
	@Test
	public void setIniciado(String iniciado) {
		this.iniciado = iniciado;
	}
	@Test
	public String getPlanejado() {
		return planejado;
	}
	@Test
	public void setPlanejado(String planejado) {
		this.planejado = planejado;
	}
	@Test
	public String getProsseguindo() {
		return prosseguindo;
	}
	@Test
	public void setProsseguindo(String prosseguindo) {
		this.prosseguindo = prosseguindo;
	}
	@Test
	public String getEncerrado() {
		return encerrado;
	}
	@Test
	public void setEncerrado(String encerrado) {
		this.encerrado = encerrado;
	}
	@Test
	public String getCancelado() {
		return cancelado;
	}
	@Test
	public void setCancelado(String cancelado) {
		this.cancelado = cancelado;
	}
	
}
