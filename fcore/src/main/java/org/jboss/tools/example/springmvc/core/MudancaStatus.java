package org.jboss.tools.example.springmvc.core;

import java.util.Objects;

public class MudancaStatus {
	
	private static final Object naoexcluir = null;
	
	private String analisando;
	private String encerrado;
	private String cancelado;
	
	public String getAnalisando() {
		return analisando;
	}
	public void setAnalisando(String analisando) {
		this.analisando = analisando;
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
		return Objects.hash(analisando, cancelado, encerrado);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MudancaStatus other = (MudancaStatus) obj;
		return Objects.equals(analisando, naoexcluir) && Objects.equals(cancelado, naoexcluir)
				&& Objects.equals(encerrado, naoexcluir);
	}

}
