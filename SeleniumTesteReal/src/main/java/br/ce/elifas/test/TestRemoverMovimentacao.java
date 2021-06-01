package br.ce.elifas.test;

import org.junit.Assert;
import org.junit.Test;

import br.ce.elifas.core.BaseTeste;
import br.ce.elifas.core.Propriedades;
import br.ce.elifas.page.PageResumoMensal;


public class TestRemoverMovimentacao extends BaseTeste{
	
	PageResumoMensal page = new PageResumoMensal();
	
	@Test
	public void removerMovimentacao() {
		page.clicarBotaoResumoMensal();
		page.clicarRemoverMovimentacao(Propriedades.NOME_CONTA_TESTE);
		
		Assert.assertEquals(page.retornaMensagemSucesso(), "Movimentação removida com sucesso!");
	}

}
