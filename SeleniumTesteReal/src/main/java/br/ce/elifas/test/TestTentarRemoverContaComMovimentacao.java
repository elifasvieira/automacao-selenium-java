package br.ce.elifas.test;

import org.junit.Assert;
import org.junit.Test;
import br.ce.elifas.core.BaseTeste;
import br.ce.elifas.core.Propriedades;
import br.ce.elifas.page.PageContasListadas;


public class TestTentarRemoverContaComMovimentacao extends BaseTeste {

	PageContasListadas pageContListadas = new PageContasListadas();
	
	@Test
	public void testeTentarRemoverContaComMovimentacao() {
		
		pageContListadas.listarContas();
		pageContListadas.clicarRemoverConta(Propriedades.NOME_CONTA_TESTE);
		
		Assert.assertEquals(pageContListadas.retornaMsgErroNaRemocao(), "Conta em uso na movimentações");
		
	}
	
}
