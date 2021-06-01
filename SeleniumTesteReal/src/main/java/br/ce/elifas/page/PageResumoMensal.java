package br.ce.elifas.page;

import org.openqa.selenium.By;

import br.ce.elifas.core.BasePage;
import br.ce.elifas.core.EsperaExplicita;

public class PageResumoMensal extends BasePage{
	
	public void clicarBotaoResumoMensal() {
		dsl.clicarBotao(By.xpath("//a[@href=\"/extrato\"]"));
	}
	
	public void clicarRemoverMovimentacao(String nomeConta) {
		EsperaExplicita.esperaExplicita(By.xpath("//tbody/tr/td[3][.='"+nomeConta+"']/../td[6]/a"));
		dsl.clicarBotao(By.xpath("//tbody/tr/td[3][.='"+nomeConta+"']/../td[6]/a"));
	}
	
	public String retornaMensagemSucesso() {
		return dsl.obterTexto(By.xpath("//div[@class=\"alert alert-success\"]"));
	}
}
