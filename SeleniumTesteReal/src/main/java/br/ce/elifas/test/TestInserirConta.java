package br.ce.elifas.test;

import org.junit.Assert;
import org.junit.Test;

import br.ce.elifas.core.BaseTeste;
import br.ce.elifas.core.Propriedades;
import br.ce.elifas.page.PageHome;



public class TestInserirConta extends BaseTeste {
	
		PageHome page = new PageHome();
		
		@Test
		public void testeInserirNovaConta() {
			
		Propriedades.NOME_CONTA_TESTE = "Conta"+"_"+page.retornaDataAtual()+"_"+page.retornaHoraAtual();
		
		page.clicarOpcaoAdicionar();
		page.setNomeConta(Propriedades.NOME_CONTA_TESTE);
		page.clicaBotaoSalvar();
		
		Assert.assertEquals(page.retornaMensagemSucesso(), "Conta adicionada com sucesso!");
	}

}
