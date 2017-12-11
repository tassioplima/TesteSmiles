package br.com.Treinamento;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navegador {

	static WebDriver driver = null;

	public void abrirChrome(String url) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tassi\\git\\br.com.Treinamento\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public void fecharChrome() {

		driver.close();

	}

	public void abrirFirefox(String url) {

		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\tassi\\git\\br.com.Treinamento\\lib\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

}
