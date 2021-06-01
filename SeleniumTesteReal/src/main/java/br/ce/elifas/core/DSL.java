package br.ce.elifas.core;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DSL {
	
	/********* TextField e TextArea ************/
	
	public void escrever (By by, String texto) {
		DriverFactory.getDriver().findElement(by).clear();
		DriverFactory.getDriver().findElement(by).sendKeys(texto);
	}
	
	public void escrever (String id_campo, String texto) {
		escrever(By.id(id_campo),texto);
	}
	
	public void obterValorCampoTexto (By by) {
		DriverFactory.getDriver().findElement(by).getAttribute("value");
	}
	
	public void obterValorCampoTexto (String id_campo) {
		DriverFactory.getDriver().findElement(By.id(id_campo));
	}
	
	public void limparCampoTexto (By by) {
		DriverFactory.getDriver().findElement(by).clear();
	}
	
	public void limparCampoTexto (String id_campo) {
		limparCampoTexto(id_campo);
	}
	
	/********* Textos ************/
	
	public String obterTexto (By by) {
		return DriverFactory.getDriver().findElement(by).getText();
	}
	
	public void obterTexto (String id_elemento) {
		obterTexto(By.id(id_elemento));
	}
	
	/********* Radio e CheckBox ************/
	
	public void clicaRadioOrCheckBox (By by) {
		DriverFactory.getDriver().findElement(by).click();
	}
	
	public void clicaRadioOrCheckBox (String id_elemento) {
		clicaRadioOrCheckBox(By.id(id_elemento));
	}
	
	public boolean isRadioOrCheckMarcado (By by) {
		return DriverFactory.getDriver().findElement(by).isSelected();
	}
	
	public boolean isRadioOrCheckMarcado (String id_elemento) {
		return isRadioOrCheckMarcado(By.id(id_elemento));
	}
	
	
	/********* Combo ************/
	
	public void selecionaCombo (By by, String textoVisivel) {
		WebElement elemento = DriverFactory.getDriver().findElement(by);
		Select combo = new Select(elemento);
		combo.selectByVisibleText(textoVisivel);		
	}
	
	public void selecionaCombo (String id_combo, String textoVisivel) {
		selecionaCombo(By.id(id_combo),textoVisivel);
	}
	
	public void deselecionaCombo (By by, String textoVisivel) {
		WebElement elemento = DriverFactory.getDriver().findElement(by);
		Select combo = new Select(elemento);
		combo.deselectByVisibleText(textoVisivel);
	}
	
	public void deselecionaCombo (String id_combo, String textoVisivel) {
		deselecionaCombo(By.id(id_combo),textoVisivel);
	}
	
	public String obterValorMarcadoCombo (By by){
		WebElement elemento = DriverFactory.getDriver().findElement(by);
		Select combo = new Select(elemento);
		return combo.getFirstSelectedOption().getText();
	}
	
	public String obterValorMarcadoCombo (String id_combo){
		return obterValorMarcadoCombo(By.id(id_combo));
	}
	
	public List<String> obterValoresMarcadosCombo (By by){
		WebElement elemento = DriverFactory.getDriver().findElement(by);
		Select combo = new Select(elemento);
		List<WebElement> valores = combo.getAllSelectedOptions();
		List<String> valoresSelecionados = new ArrayList<String>();
		for (WebElement valor: valores) {
			valoresSelecionados.add(valor.getText());
		}
		return valoresSelecionados;
	}
	
	public List<String> obterValoresMarcadosCombo (String id_combo){
		return obterValoresMarcadosCombo(By.id(id_combo));
	}
	
	/********* Botao ************/
	
	public void clicarBotao (By by) {
		DriverFactory.getDriver().findElement(by).click();
	}
	
	public void clicarBotao (String id_botao) {
		clicarBotao(By.id(id_botao));
	}
	
	/********* Link ************/
	
	public void clicarLink (String link) {
		DriverFactory.getDriver().findElement(By.linkText(link)).click();
	}
	
/********* Alerts ************/
	
	public String alertaObterTexto(){
		Alert alert = DriverFactory.getDriver().switchTo().alert();
		return alert.getText();
	}
	
	public String alertaObterTextoEAceita(){
		Alert alert = DriverFactory.getDriver().switchTo().alert();
		String valor = alert.getText();
		alert.accept();
		return valor;
		
	}
	
	public String alertaObterTextoENega(){
		Alert alert = DriverFactory.getDriver().switchTo().alert();
		String valor = alert.getText();
		alert.dismiss();
		return valor;
		
	}
	
	public void alertaEscrever(String valor) {
		Alert alert = DriverFactory.getDriver().switchTo().alert();
		alert.sendKeys(valor);
		alert.accept();
	}
	
	/********* Frames e Janelas ************/
	
	public void entrarFrame(String id) {
		DriverFactory.getDriver().switchTo().frame(id);
	}
	
	public void sairFrame(){
		DriverFactory.getDriver().switchTo().defaultContent();
	}
	
	public void trocarJanela(String id) {
		DriverFactory.getDriver().switchTo().window(id);
	}
	
	/********* Data e Hora ************/
	
	public String retornaDataAtual() {
		Date dataHoraAtual = new Date();
		String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
		return data;
	}
	
	public String retornaHoraAtual() {
		Date dataHoraAtual = new Date();
		String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);
		return hora;
	}
	
}

