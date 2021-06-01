package br.ce.elifas.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.ce.elifas.test.TestAlterarConta;
import br.ce.elifas.test.TestCamposObrigatoriosCriarMovimentacao;
import br.ce.elifas.test.TestCriarMovimentacao;
import br.ce.elifas.test.TestInserirConta;
import br.ce.elifas.test.TestRealizarLogin;
import br.ce.elifas.test.TestRemoverConta;
import br.ce.elifas.test.TestRemoverMovimentacao;
import br.ce.elifas.test.TestTentarInserirContaJaExistente;
import br.ce.elifas.test.TestTentarRemoverContaComMovimentacao;

@RunWith(Suite.class)
@SuiteClasses({
	TestRealizarLogin.class,
	TestInserirConta.class,
	TestAlterarConta.class,
	TestTentarInserirContaJaExistente.class,
	TestCriarMovimentacao.class,
	TestCamposObrigatoriosCriarMovimentacao.class,	
	TestTentarRemoverContaComMovimentacao.class,
	TestRemoverMovimentacao.class,
	TestRemoverConta.class
})

public class SuiteDeTeste_1 {

}

