package br.ce.elifas.page;

import org.openqa.selenium.By;

import br.ce.elifas.core.BasePage;
import br.ce.elifas.core.DriverFactory;

public class PageLogin extends BasePage {
	
	public void acessarTelaLogin() {
		DriverFactory.getDriver().get("https://seubarriga.wcaquino.me/");
	}
		
	public void setEmail(String email) {
		dsl.escrever("email", email);	
	}
	public void setSenha(String senha) {
		dsl.escrever("senha", senha);
	}
	
	public void clicarBotaoEntrarLogin() {
		dsl.clicarBotao(By.xpath("//button[.=\"Entrar\"]"));
	}
	
	public String retornaMensagemAlertaLogin() {
		String alerta = dsl.obterTexto(By.xpath("//body/div[@role=\"alert\"]"));
		return alerta;
	}

}
