package br.ce.elifas.core;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EsperaExplicita {
	
		public static void esperaExplicita(By locator) {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Propriedades.TEMPO_DE_ESPERA_EXPLICITA);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}

}
