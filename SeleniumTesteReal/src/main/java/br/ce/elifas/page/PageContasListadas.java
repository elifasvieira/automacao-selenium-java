package br.ce.elifas.page;

import org.openqa.selenium.By;

import br.ce.elifas.core.BasePage;

public class PageContasListadas extends BasePage {

	public void listarContas() {
		dsl.clicarBotao(By.xpath("//a[@class='dropdown-toggle']"));
		dsl.clicarBotao(By.xpath("//li/a[.=\"Listar\"]"));
	}
	
	public void clicarBotaoAlterarConta(String NomeConta) {
		dsl.clicarBotao(By.xpath("//tbody/tr/td[.='"+NomeConta+"']/../td[2]/a"));	
	}
	
	public void setarNovoNomeConta(String novoNome) {
		dsl.escrever("nome", novoNome);
	}
	
	public void clicarBotaoSalvar() {
		dsl.clicarBotao(By.xpath("//button[.='Salvar']"));
	}
	
	public String retornaAlertaSucessoAlteracaoConta() {
		return dsl.obterTexto(By.xpath("//div[@class='alert alert-success']"));
	}
		
	public void clicarRemoverConta (String nomeConta) {
		dsl.clicarBotao(By.xpath("//tbody/tr/td[contains(text(),'" + nomeConta + "')]/../td[2]/a[2]"));
	}
	
	public String retornaMsgErroNaRemocao() {
		return dsl.obterTexto(By.xpath("//div[@class='alert alert-danger']"));
	}
	
	public String retornaMsgSucessoNaRemocao() {
		return dsl.obterTexto(By.xpath("//div[@class='alert alert-success']"));
	}
}
