package teste.SpringBootApplication;


public @interface SpringBootApplication {
	
	private String insercaoProjetos;
	private String exclusaoProjetos;
	private String alteracaoProjetos;
	private String consultaProjetos;
	
	@Test
	public String getInsercaoProjetos() {
		return insercaoProjetos;
	}
	@Test
	public void setInsercaoProjetos(String insercaoProjetos) {
		this.insercaoProjetos = insercaoProjetos;
	}
	@Test
	public String getExclusaoProjetos() {
		return exclusaoProjetos;
	}
	@Test
	public void setExclusaoProjetos(String exclusaoProjetos) {
		this.exclusaoProjetos = exclusaoProjetos;
	}
	@Test
	public String getAlteracaoProjetos() {
		return alteracaoProjetos;
	}
	@Test
	public void setAlteracaoProjetos(String alteracaoProjetos) {
		this.alteracaoProjetos = alteracaoProjetos;
	}
	@Test
	public String getConsultaProjetos() {
		return consultaProjetos;
	}
	@Test
	public void setConsultaProjetos(String consultaProjetos) {
		this.consultaProjetos = consultaProjetos;
	}
			
}




}
