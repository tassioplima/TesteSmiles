package br.com.Treinamento;

import org.apache.commons.exec.ExecuteException;

public class Teste {

	public static void main(String[] args) throws ExecuteException, InterruptedException{
		
	
		Navegador nav = new Navegador();
		nav.abrirChrome();
		nav.cadastroSmiles();
		nav.inserirDados();


	}
}
