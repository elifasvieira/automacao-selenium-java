package br.ce.elifas.core;

public class BasePage {

	protected DSL dsl;
	
	public BasePage() {
		dsl = new DSL();
	}
	
	public String retornaDataAtual() {
		return dsl.retornaDataAtual();
	}
	
	public String retornaHoraAtual() {
		return dsl.retornaHoraAtual();
	}
}
