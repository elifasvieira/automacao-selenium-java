package br.ce.elifas.test;

import org.junit.Assert;
import org.junit.Test;
import br.ce.elifas.core.BaseTeste;
import br.ce.elifas.core.Propriedades;
import br.ce.elifas.page.PageContasListadas;
import br.ce.elifas.page.PageHome;


public class TestTentarInserirContaJaExistente extends BaseTeste {

	PageHome pageHome = new PageHome();
	PageContasListadas pageContasListadas = new PageContasListadas();
	
	@Test
	public void tentarInserirContaJaExistente () {
		
		pageHome.clicarOpcaoAdicionar();
		pageHome.setNomeConta(Propriedades.NOME_CONTA_TESTE);
		pageHome.clicaBotaoSalvar();
		
		Assert.assertEquals(pageHome.retornaMensagemErro(), "Já existe uma conta com esse nome!");
	}
	
}
