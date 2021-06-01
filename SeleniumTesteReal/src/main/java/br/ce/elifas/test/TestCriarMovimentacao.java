package br.ce.elifas.test;

import org.junit.Assert;
import org.junit.Test;

import br.ce.elifas.core.BaseTeste;
import br.ce.elifas.core.Propriedades;
import br.ce.elifas.page.PageContasListadas;
import br.ce.elifas.page.PageCriarMovimentacao;

public class TestCriarMovimentacao extends BaseTeste{
	
	PageCriarMovimentacao pageCriarMovimentacao = new PageCriarMovimentacao();
	PageContasListadas pageContasListadas = new PageContasListadas();
	
	@Test
	public void testeCriarMovimentacao() {
		 
		pageCriarMovimentacao.clicarBotaoCriarMovimentacao();
		pageCriarMovimentacao.setTipoDaMovimentacao("Receita");
		pageCriarMovimentacao.setDataMovimentacao(pageCriarMovimentacao.retornaDataAtual());
		pageCriarMovimentacao.setDataPagamento(pageCriarMovimentacao.retornaDataAtual());
		pageCriarMovimentacao.setDescricao("Teste");
		pageCriarMovimentacao.setInteressado("Teste");
		pageCriarMovimentacao.setValor("1000");
		pageCriarMovimentacao.setConta(Propriedades.NOME_CONTA_TESTE);
		pageCriarMovimentacao.setSituacao("Pago");
		pageCriarMovimentacao.clicarBotaoSalvar();
		
		Assert.assertEquals(pageCriarMovimentacao.retornaMensagemSucesso(), "Movimentação adicionada com sucesso!");
	}
	

}
