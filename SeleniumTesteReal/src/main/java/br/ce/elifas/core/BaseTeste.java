package br.ce.elifas.core;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import br.ce.elifas.page.PageLogin;

public class BaseTeste {
	
	protected PageLogin pageLogin;
	
	public  BaseTeste() {
		pageLogin = new PageLogin();
	}
	
	@Rule
	public TestName testName = new TestName();
	
	@Before
	public void realizaLogin() {
		pageLogin.acessarTelaLogin();
		pageLogin.setEmail("teste@selenium");
		pageLogin.setSenha("123456");
		pageLogin.clicarBotaoEntrarLogin();
	}
	
	@After
	public void finalizaTeste() throws IOException {
		
		if (Propriedades.PRINT_NO_FIM_DO_TESTE) {
			TakesScreenshot ss = (TakesScreenshot) DriverFactory.getDriver();
			File arquivo = ss.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(arquivo, new File("target" + File.separator + "screenshot" + File.separator +
												  testName.getMethodName() + ".jpg"));
		}
		
		if (Propriedades.FECHAR_BROWSER_NO_FIM_DO_TESTE) {
			DriverFactory.killDriver();
		}
	}

}
