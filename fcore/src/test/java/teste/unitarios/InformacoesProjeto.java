package teste.unitarios;

import org.junit.Test;

public class InformacoesProjeto {
	
	private String nomeProjeto;
	private String dataInicio;
	private String gerenteResponsavel;
	private String previsaoTermino;
	private String dataRealTermino;
	private String orcamentoTotal;
	private String descricao;
	private String status;
	
	@Test
	public String getNomeProjeto() {
		return nomeProjeto;
	}
	@Test
	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}
	@Test
	public String getDataInicio() {
		return dataInicio;
	}
	@Test
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	@Test
	public String getGerenteResponsavel() {
		return gerenteResponsavel;
	}
	@Test
	public void setGerenteResponsavel(String gerenteResponsavel) {
		this.gerenteResponsavel = gerenteResponsavel;
	}
	@Test
	public String getPrevisaoTermino() {
		return previsaoTermino;
	}
	@Test
	public void setPrevisaoTermino(String previsaoTermino) {
		this.previsaoTermino = previsaoTermino;
	}
	@Test
	public String getDataRealTermino() {
		return dataRealTermino;
	}
	@Test
	public void setDataRealTermino(String dataRealTermino) {
		this.dataRealTermino = dataRealTermino;
	}
	@Test
	public String getOrcamentoTotal() {
		return orcamentoTotal;
	}
	@Test
	public void setOrcamentoTotal(String orcamentoTotal) {
		this.orcamentoTotal = orcamentoTotal;
	}
	@Test
	public String getDescricao() {
		return descricao;
	}
	@Test
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Test
	public String getStatus() {
		return status;
	}
	@Test
	public void setStatus(String status) {
		this.status = status;
	}
	
		
}
