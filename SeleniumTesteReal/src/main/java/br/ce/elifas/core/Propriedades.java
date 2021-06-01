package br.ce.elifas.core;

public class Propriedades {
	
	/*Propriedade usada para indicar se o browser deve fechar a 
	cada teste ou se deve manter aberto para o próximo teste*/
	public static boolean FECHAR_BROWSER_NO_FIM_DO_TESTE = true;
	
	public static boolean PRINT_NO_FIM_DO_TESTE = true;
	
	public static String NOME_CONTA_TESTE;
	
	public static int TEMPO_DE_ESPERA_EXPLICITA = 30;
	
	// Definindo o Browser do teste
	public static Browsers browser = Browsers.FIREFOX;
	public enum Browsers{CHROME, FIREFOX}
	
	

}
