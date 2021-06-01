package br.ce.elifas.test;

import org.junit.Assert;
import org.junit.Test;

import br.ce.elifas.core.BaseTeste;
import br.ce.elifas.core.Propriedades;
import br.ce.elifas.page.PageContasListadas;


public class TestRemoverConta extends BaseTeste {
	
	PageContasListadas pageContListadas = new PageContasListadas();
	
	@Test
	public void testeRemoverConta() {
		pageContListadas.listarContas();
		pageContListadas.clicarRemoverConta(Propriedades.NOME_CONTA_TESTE);
		
		Assert.assertEquals("Conta removida com sucesso!", pageContListadas.retornaMsgSucessoNaRemocao());
	}

}
