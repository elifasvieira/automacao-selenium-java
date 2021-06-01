package br.ce.elifas.test;

import org.junit.Assert;

import org.junit.Test;

import br.ce.elifas.core.BaseTeste;




public class TestRealizarLogin extends BaseTeste {

		
	@Test
	public void realizarLogin() {			
		Assert.assertEquals(pageLogin.retornaMensagemAlertaLogin(), "Bem vindo, teste!");
	}
	
}
