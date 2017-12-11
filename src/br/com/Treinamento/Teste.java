package br.com.Treinamento;

import org.apache.commons.exec.ExecuteException;

public class Teste {
	
	static String url = "https://www.smiles.com.br/home";

	public static void main(String[] args) throws ExecuteException, InterruptedException{
		
	Navegador navegador = new Navegador();
	Page page = new Page();
	
	navegador.abrirChrome(url);
	page.abrirCadastroSmiles();
	page.cancelarPropaganda();
	page.setNome("Tassio");
	page.setSobreNome("Lima");
	page.clickNacionalidade();
	page.clickIdioma();
	page.clickGenero("M");
	

	}
}
