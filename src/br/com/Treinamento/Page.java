package br.com.Treinamento;

import org.apache.commons.exec.ExecuteException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page extends Navegador {

	static WebDriverWait wait;

	public void abrirCadastroSmiles() {

		WebElement cadastro = driver.findElement(By.xpath(".//*[contains(@class,'btn btn-link new cadastro')]"));
		cadastro.click();

	}

	public WebElement getPropaganda() {
		return driver.findElement(By.xpath(".//*[@id='onesignal-popover-cancel-button']"));

	}

	public void cancelarPropaganda() throws InterruptedException {
		
			getPropaganda().click();

	}

	public WebElement getNome() {

		return driver
				.findElement(By.xpath(".//*[@id='_smilesregistermemberportlet_WAR_smilesaccountportlet_firstname']"));
	}

	public void setNome(String nome) {

		getNome().sendKeys(nome);
	}

	public WebElement getSobreNome() {

		return driver
				.findElement(By.xpath(".//*[@id='_smilesregistermemberportlet_WAR_smilesaccountportlet_lastname']"));
	}

	public void setSobreNome(String sobre) {

		getSobreNome().sendKeys(sobre);
	}

	public WebElement getNacionalidade() {

		return driver.findElement(By.xpath(
				".//*[@id='dk_container__smilesregistermemberportlet_WAR_smilesaccountportlet_selectNacionality']/a"));
	}

	public void clickNacionalidade() {
		getNacionalidade().click();
		getNacionalidadeBr().click();

	}

	public WebElement getNacionalidadeBr() {

		return driver.findElement(By.xpath(
				".//*[@id='dk_container__smilesregistermemberportlet_WAR_smilesaccountportlet_selectNacionality']/div/ul/li[17]/a"));
	}

	public WebElement getIdioma() {

		return driver.findElement(By.xpath(
				".//*[@id='dk_container__smilesregistermemberportlet_WAR_smilesaccountportlet_selectLanguage']/a"));
	}

	public void clickIdioma() {

		getIdioma().click();
		getIdiomaPt().click();
	}

	public WebElement getIdiomaPt() {

		return driver.findElement(By.xpath(
				".//*[@id='dk_container__smilesregistermemberportlet_WAR_smilesaccountportlet_selectLanguage']/div/ul/li[4]/a"));
	}

	public WebElement getNome1() {

		return driver.findElement(By.xpath(""));
	}

	public WebElement getGenero(String gen) {

		return driver.findElement(By.xpath(".//*[@type='radio' and contains(@value,'" + gen + "')]"));
	}

	public void clickGenero(String gen) {

		getGenero(gen).click();
	}

	public WebElement getDia() {

		return driver
				.findElement(By.xpath(".//*[@id='_smilesregistermemberportlet_WAR_smilesaccountportlet_birthDay']"));
	}

	public WebElement getMes() {

		return driver
				.findElement(By.xpath(".//*[@id='_smilesregistermemberportlet_WAR_smilesaccountportlet_birthMonth']"));
	}

	public WebElement getAno() {

		return driver
				.findElement(By.xpath(".//*[@id='_smilesregistermemberportlet_WAR_smilesaccountportlet_birthYear']"));
	}

	public void setNascimento(String dia, String mes, String ano) {

		getDia().sendKeys(dia);
		getMes().sendKeys(mes);
		getAno().sendKeys(ano);

	}

	public WebElement getDocumento() {

		return driver.findElement(By.xpath(".//*[@id='_smilesregistermemberportlet_WAR_smilesaccountportlet_rg']"));
	}

	public void setDocumento(String doc) {

		getDocumento().sendKeys(doc);
	}

	public WebElement getCPF() {

		return driver.findElement(By.xpath(".//*[@id='_smilesregistermemberportlet_WAR_smilesaccountportlet_cpf']"));
	}

	public void setCPF(String cpf) {

		getCPF().sendKeys(cpf);

	}

	public WebElement getDDI() {

		return driver.findElement(
				By.xpath(".//*[@id='_smilesregistermemberportlet_WAR_smilesaccountportlet_homePhoneDDI']"));
	}

	public WebElement getDDD() {

		return driver.findElement(
				By.xpath(".//*[@id='_smilesregistermemberportlet_WAR_smilesaccountportlet_homePhoneDDD']"));
	}

	public WebElement getTel() {

		return driver.findElement(
				By.xpath("//*[@id='_smilesregistermemberportlet_WAR_smilesaccountportlet_homePhoneNumber']"));
	}

	public void setTelefone(String ddi, String ddd, String tel) {

		getDDI().sendKeys(ddi);
		getDDD().sendKeys(ddd);
		getTel().sendKeys(tel);

	}

	public WebElement getEmail() {

		return driver.findElement(By.xpath(".//*[contains(@class,'field width330 transformLowercase')]"));
	}

	public void setEmail(String email) {

		getEmail().sendKeys(email);

	}

	public WebElement getConfirmarEmail() {

		return driver.findElement(By.xpath(".//*[contains(text(),'Confirmar E-mail')]/following::input"));
	}

	public void setConfirmarEmail(String conf) {

		getConfirmarEmail().sendKeys(conf);
	}

	public WebElement getResidencia() {

		return driver.findElement(By.xpath(
				".//*[@id='dk_container__smilesregistermemberportlet_WAR_smilesaccountportlet_selectCountry']/a"));
	}

	public WebElement getResidenciaBR() {

		return driver.findElement(By.xpath(
				".//*[@id='dk_container__smilesregistermemberportlet_WAR_smilesaccountportlet_selectCountry']/div/ul/li[34]/a"));
	}

	public void setResidencia(String res) {

		getResidencia().sendKeys(res);
	}

	public void clickResidencia() {

		getResidencia().click();
		getResidenciaBR().click();

	}

	public WebElement getCEP() {

		return driver.findElement(By.xpath(".//label[contains(text(),'CEP')]/following::input[1]"));
	}

	public void setCEP(String cep) {

		getCEP().sendKeys(cep);
	}

	public WebElement getEndereco() {

		return driver.findElement(By.xpath(".//*[@id='_smilesregistermemberportlet_WAR_smilesaccountportlet_street']"));
	}

	public WebElement getNumero() {

		return driver.findElement(By.xpath(".//input[@id='_smilesregistermemberportlet_WAR_smilesaccountportlet_streetNumber']"));

	}

	public WebElement getComplemento() {
		
		return driver
				.findElement(By.xpath(".//*[@id='_smilesregistermemberportlet_WAR_smilesaccountportlet_complement']"));
	}
	
	public void setEndereco(String end, String num, String comp) {

		getEndereco().sendKeys(end);
		getNumero().sendKeys(num);
		getComplemento().sendKeys(comp);
	}


	public WebElement getAC() {

		return driver.findElement(By.xpath(
				".//*[@id='dk_container__smilesregistermemberportlet_WAR_smilesaccountportlet_stateBrazilian']/a"));
	}

	public WebElement getACSP() {

		return driver.findElement(By.xpath(
				".//*[@id='dk_container__smilesregistermemberportlet_WAR_smilesaccountportlet_stateBrazilian']/div/ul/li[27]/a"));
	}

	public void clickAC() {

		getAC().click();
		getACSP().click();

	}

	public WebElement getCidade() {

		return driver.findElement(By.xpath(".//*[@id='_smilesregistermemberportlet_WAR_smilesaccountportlet_city']"));
	}

	public void setCidade(String cid) {

		getCidade().sendKeys(cid);
	}

	public WebElement getSenha() {

		return driver
				.findElement(By.xpath(".//*[@id='_smilesregistermemberportlet_WAR_smilesaccountportlet_password']"));
	}

	public WebElement getConfirmaSenha() {

		return driver.findElement(
				By.xpath(".//*[@id='_smilesregistermemberportlet_WAR_smilesaccountportlet_passwordConfirm']"));
	}

	public void setSenha(String senha, String confirma) {

		getSenha().sendKeys(senha);
		getConfirmaSenha().sendKeys(confirma);

	}

	public WebElement getFinalizarCadastro() {

		return driver
				.findElement(By.xpath("//*[@id='_smilesregistermemberportlet_WAR_smilesaccountportlet_saveButton']"));
	}

	public void cliqueFinalizar() {

		getFinalizarCadastro().click();

	}

}
