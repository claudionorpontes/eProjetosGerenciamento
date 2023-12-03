package org.jboss.tools.example.springmvc.core;

import java.util.Objects;

public class StatusEspecificoUnico {
	
	private String analisando;
	private String analiseRealizada;
	private String analiseAprovada;
	private String iniciado;
	private String planejado;
	private String prosseguindo;
	private String encerrado;
	private String cancelado;
	
	public String getAnalisando() {
		return analisando;
	}
	public void setAnalisando(String analisando) {
		this.analisando = analisando;
	}
	public String getAnaliseRealizada() {
		return analiseRealizada;
	}
	public void setAnaliseRealizada(String analiseRealizada) {
		this.analiseRealizada = analiseRealizada;
	}
	public String getAnaliseAprovada() {
		return analiseAprovada;
	}
	public void setAnaliseAprovada(String analiseAprovada) {
		this.analiseAprovada = analiseAprovada;
	}
	public String getIniciado() {
		return iniciado;
	}
	public void setIniciado(String iniciado) {
		this.iniciado = iniciado;
	}
	public String getPlanejado() {
		return planejado;
	}
	public void setPlanejado(String planejado) {
		this.planejado = planejado;
	}
	public String getProsseguindo() {
		return prosseguindo;
	}
	public void setProsseguindo(String prosseguindo) {
		this.prosseguindo = prosseguindo;
	}
	public String getEncerrado() {
		return encerrado;
	}
	public void setEncerrado(String encerrado) {
		this.encerrado = encerrado;
	}
	public String getCancelado() {
		return cancelado;
	}
	public void setCancelado(String cancelado) {
		this.cancelado = cancelado;
	}
	@Override
	public int hashCode() {
		return Objects.hash(analisando, analiseAprovada, analiseRealizada, cancelado, encerrado, iniciado, planejado,
				prosseguindo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StatusEspecificoUnico other = (StatusEspecificoUnico) obj;
		return Objects.equals(analisando, other.analisando) && Objects.equals(analiseAprovada, other.analiseAprovada)
				&& Objects.equals(analiseRealizada, other.analiseRealizada)
				&& Objects.equals(cancelado, other.cancelado) && Objects.equals(encerrado, other.encerrado)
				&& Objects.equals(iniciado, other.iniciado) && Objects.equals(planejado, other.planejado)
				&& Objects.equals(prosseguindo, other.prosseguindo);
	}
	
}













