package br.ce.elifas.page;

import org.openqa.selenium.By;

import br.ce.elifas.core.BasePage;

public class PageCriarMovimentacao extends BasePage{
	
	public void clicarBotaoCriarMovimentacao () {
		dsl.clicarBotao(By.xpath("//a[@href='/movimentacao']"));
	}

	public void setTipoDaMovimentacao (String tipoMovimentacao) {
		if (tipoMovimentacao == "Receita" || tipoMovimentacao == "Despesa" ) {
			dsl.selecionaCombo("tipo", tipoMovimentacao);
		} else {
			System.out.println("Tipo movimentação inválido");
		}
	}
	
	public void setDataMovimentacao (String dataMovimentacao) {
		dsl.escrever("data_transacao", dataMovimentacao);
	}
	
	public void setDataPagamento (String dataPagamento) {
		dsl.escrever("data_pagamento", dataPagamento);
	}
	
	public void setDescricao (String descricao) {
		dsl.escrever("descricao", descricao);
	}
	
	public void setInteressado (String interessado) {
		dsl.escrever("interessado", interessado);
	}
	
	public void setValor (String valor) {
		dsl.escrever("valor", valor);
	}
	
	public void setConta (String conta) {
		dsl.selecionaCombo("conta", conta);
	}
	
	public void setSituacao (String situacao) {
		if(situacao == "Pago") {
			dsl.clicaRadioOrCheckBox("status_pago");
		}else if (situacao == "Pendente") {
			dsl.clicaRadioOrCheckBox("status_pendente");
		}else {
			System.out.println("Situação inválida");
		}
		
	}
	
	public void clicarBotaoSalvar () {
		dsl.clicarBotao(By.xpath("//button[.='Salvar']"));
	}
	
		
	public String retornaMensagemSucesso() {
		return dsl.obterTexto(By.xpath("//div[@class='alert alert-success']"));
	}
	
	public String retornaMensagemErro() {
		return dsl.obterTexto(By.xpath("//div[@class='alert alert-danger']/ul/li"));
	}
	
}
