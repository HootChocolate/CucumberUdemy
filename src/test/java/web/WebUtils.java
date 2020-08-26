package web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebUtils {

	public static WebDriver getChromeWebSite(String url) {
		System.setProperty("webdriver.chrome.driver", "/home/jay/programs/drivers/chromedriver");
		WebDriver navegador = new ChromeDriver();
		
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		navegador.get(url);
		
		return navegador;
	}

}
