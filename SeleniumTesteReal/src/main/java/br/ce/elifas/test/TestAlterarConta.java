package br.ce.elifas.test;

import org.junit.Assert;
import org.junit.Test;

import br.ce.elifas.core.BaseTeste;
import br.ce.elifas.core.Propriedades;
import br.ce.elifas.page.PageContasListadas;


public class TestAlterarConta extends BaseTeste {

	private PageContasListadas page = new PageContasListadas();
	
	@Test
	public void alterarConta() {
		
		page.listarContas();
		page.clicarBotaoAlterarConta(Propriedades.NOME_CONTA_TESTE);
		Propriedades.NOME_CONTA_TESTE = "Conta_"+page.retornaDataAtual()+"_"+page.retornaHoraAtual();
		page.setarNovoNomeConta(Propriedades.NOME_CONTA_TESTE);
		page.clicarBotaoSalvar();
		
		Assert.assertEquals(page.retornaAlertaSucessoAlteracaoConta(), "Conta alterada com sucesso!");
	}
	
	
}
