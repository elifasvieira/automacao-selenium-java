package br.ce.elifas.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DriverFactory {
	
	private static WebDriver driver;
	
	//Construtor vazio, pois nenhuma classe ir� instanciar esta classe
	private DriverFactory() {}

	//m�todo que vai retornar o driver, caso este ainda n�o exista
	public static WebDriver getDriver() {
		
		if (driver == null) {
			switch(Propriedades.browser) {
				case FIREFOX:
					System.setProperty("webdriver.gecko.driver", "/Drivers/geckodriver.exe");
					FirefoxOptions options = new FirefoxOptions().setProfile(new FirefoxProfile());
					driver = new FirefoxDriver(options);
				break;
				
				case CHROME:
					System.setProperty("webdriver.chrome.driver", "/Drivers/chromedriver.exe");
					driver = new ChromeDriver();					
				break;
			}
			
		}		
		return driver;
	}
	
	//m�todo que "reseta" o driver
	public static void killDriver() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
