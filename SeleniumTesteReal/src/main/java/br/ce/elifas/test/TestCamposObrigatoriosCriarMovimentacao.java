package br.ce.elifas.test;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import br.ce.elifas.core.BaseTeste;
import br.ce.elifas.page.PageCriarMovimentacao;


@RunWith(Parameterized.class)
public class TestCamposObrigatoriosCriarMovimentacao extends BaseTeste{
	
	static PageCriarMovimentacao page = new PageCriarMovimentacao();
	
	@Parameter
	public String tipoMovimentacao;
	@Parameter(value=1)
	public String dataMovimentacao;
	@Parameter(value=2)
	public String dataPagamento;
	@Parameter(value=3)
	public String descricao;
	@Parameter(value=4)
	public String interessado;
	@Parameter(value=5)
	public String valor;
	@Parameter(value=6)
	public String mensagem;
	
	@Parameters
	public static Collection<Object[]> getCollection(){
		return Arrays.asList(new Object[][] {
			{"Receita","","","","","","Data da Movimentação é obrigatório"},
			{"Receita",page.retornaDataAtual(),"","","","","Data do pagamento é obrigatório"},
			{"Receita",page.retornaDataAtual(),page.retornaDataAtual(),"","","","Descrição é obrigatório"},
			{"Receita",page.retornaDataAtual(),page.retornaDataAtual(),"teste","","","Interessado é obrigatório"},
			{"Receita",page.retornaDataAtual(),page.retornaDataAtual(),"teste","teste","","Valor é obrigatório"},
			{"Receita",page.retornaDataAtual(),page.retornaDataAtual(),"teste","teste","teste","Valor deve ser um número"}
		});
	}
	
	@Test
	public void testeCamposObrigatoriosCriarMovimentacao() {
		page.clicarBotaoCriarMovimentacao();
		page.setTipoDaMovimentacao(tipoMovimentacao);
		page.setDataMovimentacao(dataMovimentacao);
		page.setDataPagamento(dataPagamento);
		page.setDescricao(descricao);
		page.setInteressado(interessado);
		page.setValor(valor);
		
		page.clicarBotaoSalvar();
		
		Assert.assertEquals(page.retornaMensagemErro(), mensagem);
	}
}
