package br.com.Treinamento;

import java.awt.Choice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.pagefactory.ByAll;

public class Navegador {

	WebDriver driver = null;

	public void abrirChrome() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tassi\\git\\br.com.Treinamento\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.smiles.com.br/home");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public void cadastroSmiles() {

		WebElement cadastro = driver.findElement(By.xpath(".//*[contains(@class,'btn btn-link new cadastro')]"));
		cadastro.click();

	}

	public void inserirDados() throws InterruptedException {

		WebElement nome = driver
				.findElement(By.xpath(".//*[@id='_smilesregistermemberportlet_WAR_smilesaccountportlet_firstname']"));
		nome.sendKeys("Tassio");
		WebElement sobrenome = driver
				.findElement(By.xpath(".//*[@id='_smilesregistermemberportlet_WAR_smilesaccountportlet_lastname']"));
		sobrenome.sendKeys("Lima");
		WebElement nacionalidade = driver.findElement(By.xpath(
				".//*[@id='dk_container__smilesregistermemberportlet_WAR_smilesaccountportlet_selectNacionality']/a"));
		nacionalidade.click();
		WebElement nacionalidadebr = driver.findElement(By.xpath(
				".//*[@id='dk_container__smilesregistermemberportlet_WAR_smilesaccountportlet_selectNacionality']/div/ul/li[17]/a"));
		nacionalidadebr.click();
		WebElement idioma = driver.findElement(By.xpath(
				".//*[@id='dk_container__smilesregistermemberportlet_WAR_smilesaccountportlet_selectLanguage']/a"));
		idioma.click();
		WebElement pt = driver.findElement(By.xpath(
				".//*[@id='dk_container__smilesregistermemberportlet_WAR_smilesaccountportlet_selectLanguage']/div/ul/li[4]/a"));
		pt.click();
		WebElement genero = driver
				.findElement(By.xpath(".//*[contains(@class,'field labelOption')]/following::input[1]"));
		genero.click();
		WebElement dia = driver
				.findElement(By.xpath(".//*[@id='_smilesregistermemberportlet_WAR_smilesaccountportlet_birthDay']"));
		dia.sendKeys("11");
		WebElement mes = driver
				.findElement(By.xpath(".//*[@id='_smilesregistermemberportlet_WAR_smilesaccountportlet_birthMonth']"));
		mes.sendKeys("06");
		WebElement ano = driver
				.findElement(By.xpath(".//*[@id='_smilesregistermemberportlet_WAR_smilesaccountportlet_birthYear']"));
		ano.sendKeys("1993");;
		WebElement documento = driver
				.findElement(By.xpath(".//*[@id='_smilesregistermemberportlet_WAR_smilesaccountportlet_rg']"));
		documento.sendKeys("853545584");
		WebElement cpf = driver
				.findElement(By.xpath(".//*[@id='_smilesregistermemberportlet_WAR_smilesaccountportlet_cpf']"));
		cpf.sendKeys("372.808.622-33");
		WebElement dditel = driver.findElement(
				By.xpath(".//*[@id='_smilesregistermemberportlet_WAR_smilesaccountportlet_homePhoneDDI']"));
		dditel.sendKeys("55");
		WebElement dddtel = driver.findElement(
				By.xpath(".//*[@id='_smilesregistermemberportlet_WAR_smilesaccountportlet_homePhoneDDD']"));
		dddtel.sendKeys("11");
		WebElement tel = driver.findElement(
				By.xpath("//*[@id='_smilesregistermemberportlet_WAR_smilesaccountportlet_homePhoneNumber']"));
		tel.sendKeys("956854524");
		WebElement email = driver.findElement(
				By.xpath(".//*[contains(@class,'field width330 transformLowercase')]"));
		email.sendKeys("tassio@teste.com");
		WebElement confirmar = driver.findElement(
				By.xpath(".//*[contains(text(),'Confirmar E-mail')]/following::input"));
		confirmar.sendKeys("tassio@teste.com");;
		WebElement residencia = driver.findElement(
				By.xpath(".//*[@id='dk_container__smilesregistermemberportlet_WAR_smilesaccountportlet_selectCountry']/a"));
		residencia.click();
		WebElement residenciabr = driver.findElement(
				By.xpath(".//*[@id='dk_container__smilesregistermemberportlet_WAR_smilesaccountportlet_selectCountry']/div/ul/li[34]/a"));
		residenciabr.click();
		WebElement cep = driver.findElement(
				By.xpath(".//label[contains(text(),'CEP')]/following::input[1]"));
		cep.sendKeys("030010-10");
		WebElement endereco = driver.findElement(
				By.xpath(".//*[@id='_smilesregistermemberportlet_WAR_smilesaccountportlet_street']"));
		endereco.sendKeys("RUa doa bairro");
		WebElement number = driver.findElement(
				By.xpath(".//*[@id='_smilesregistermemberportlet_WAR_smilesaccountportlet_streetNumber']"));
		number.sendKeys("2452");
		WebElement complemento = driver.findElement(
				By.xpath(".//*[@id='_smilesregistermemberportlet_WAR_smilesaccountportlet_complement']"));
		complemento.sendKeys("ap 112");
		WebElement ac = driver.findElement(
				By.xpath(".//*[@id='dk_container__smilesregistermemberportlet_WAR_smilesaccountportlet_stateBrazilian']/a"));
		ac.click();
		WebElement acsp = driver.findElement(
				By.xpath(".//*[@id='dk_container__smilesregistermemberportlet_WAR_smilesaccountportlet_stateBrazilian']/div/ul/li[27]/a"));
		acsp.click();
		WebElement cidade = driver.findElement(
				By.xpath(".//*[@id='_smilesregistermemberportlet_WAR_smilesaccountportlet_city']"));
		cidade.sendKeys("São Pablo");;
		WebElement senha = driver.findElement(
				By.xpath(".//*[@id='_smilesregistermemberportlet_WAR_smilesaccountportlet_password']"));
		senha.sendKeys("85354565");
		WebElement confirmarsenha = driver.findElement(
				By.xpath(".//*[@id='_smilesregistermemberportlet_WAR_smilesaccountportlet_passwordConfirm']"));
		confirmarsenha.sendKeys("85354565");
		
		WebElement finalizar = driver.findElement(
				By.xpath("//*[@id='_smilesregistermemberportlet_WAR_smilesaccountportlet_saveButton']"));
		finalizar.click();
		
		

	}

	public void abrirFirefox() {
		WebDriver driver = null;
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tassi\\git\\br.com.Treinamento\\lib\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https:\\www.google.com.br");

	}

}
