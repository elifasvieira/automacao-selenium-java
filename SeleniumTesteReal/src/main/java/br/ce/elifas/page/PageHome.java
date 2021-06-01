package br.ce.elifas.page;

import org.openqa.selenium.By;

import br.ce.elifas.core.BasePage;


public class PageHome extends BasePage{	
	
		
	// Opcoes Adicionar Conta
	public void clicarOpcaoAdicionar() {
		dsl.clicarBotao(By.xpath("//a[@class='dropdown-toggle']"));
		dsl.clicarBotao(By.xpath("//li/a[.=\"Adicionar\"]"));
	}
	
	public void setNomeConta(String nomeConta) {
		dsl.escrever("nome", nomeConta);
	}
	
	public void clicaBotaoSalvar() {
		dsl.clicarBotao(By.xpath("//div/button[.='Salvar']"));
	}
	
	public String retornaMensagemSucesso() {
		return dsl.obterTexto(By.xpath("//div[@class='alert alert-success']"));
	}
	
	public String retornaMensagemErro() {
		return dsl.obterTexto(By.xpath("//div[@class='alert alert-danger']"));
	}
	

}
