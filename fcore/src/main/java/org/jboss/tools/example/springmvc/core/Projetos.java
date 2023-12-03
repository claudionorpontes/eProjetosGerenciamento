package org.jboss.tools.example.springmvc.core;

import java.util.Objects;

public class Projetos {

	private static final Object encerrado = null;
	private static final Object analisando = true;
	private static final Object prosseguindo = true;
	private static final Object iniciado = true;
	
	private static final Object baixoRisco = null;
	private static final Object medioRisco = null;
	private static final Object altoRisco = null;
	
	private String softwaresGestao;
	private String comunicacaoInterna;
	private String metodologiaAgia;
	private String homeOffice;
	private String pesquisaDesenvolvimento;
	private String treinamentoPessoas;
	private String climaOrganizacional;
	private String monitorarAcoes;
	
	
	public String getSoftwaresGestao() {
		return softwaresGestao;		
	}
	public void setSoftwaresGestao(String softwaresGestao) {
		this.softwaresGestao = softwaresGestao;
	}
	public String getComunicacaoInterna() {
		return comunicacaoInterna;
	}
	public void setComunicacaoInterna(String comunicacaoInterna) {
		this.comunicacaoInterna = comunicacaoInterna;
	}
	public String getMetodologiaAgia() {
		return metodologiaAgia;
	}
	public void setMetodologiaAgia(String metodologiaAgia) {
		this.metodologiaAgia = metodologiaAgia;
	}
	public String getHomeOffice() {
		return homeOffice;
	}
	public void setHomeOffice(String homeOffice) {
		this.homeOffice = homeOffice;
	}
	public String getPesquisaDesenvolvimento() {
		return pesquisaDesenvolvimento;
	}
	public void setPesquisaDesenvolvimento(String pesquisaDesenvolvimento) {
		this.pesquisaDesenvolvimento = pesquisaDesenvolvimento;
	}
	public String getTreinamentoPessoas() {
		return treinamentoPessoas;
	}
	public void setTreinamentoPessoas(String treinamentoPessoas) {
		this.treinamentoPessoas = treinamentoPessoas;
	}
	public String getClimaOrganizacional() {
		return climaOrganizacional;
	}
	public void setClimaOrganizacional(String climaOrganizacional) {
		this.climaOrganizacional = climaOrganizacional;
	}
	public String getMonitorarAcoes() {
		return monitorarAcoes;
	}
	public void setMonitorarAcoes(String monitorarAcoes) {
		this.monitorarAcoes = monitorarAcoes;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(climaOrganizacional, comunicacaoInterna, homeOffice, metodologiaAgia, monitorarAcoes,
				pesquisaDesenvolvimento, softwaresGestao, treinamentoPessoas);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Projetos other = (Projetos) obj;
		return Objects.equals(climaOrganizacional, analisando)
				&& Objects.equals(comunicacaoInterna, baixoRisco)
				&& Objects.equals(homeOffice, baixoRisco)
				&& Objects.equals(metodologiaAgia, prosseguindo)
				&& Objects.equals(monitorarAcoes, medioRisco)
				&& Objects.equals(pesquisaDesenvolvimento, altoRisco)
				&& Objects.equals(softwaresGestao, iniciado)
				&& Objects.equals(treinamentoPessoas, encerrado);
	}
	
}
