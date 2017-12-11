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
	page.setNascimento("11", "06", "1993");
	page.setDocumento("1010515151");
	page.setCPF("283.933.274-40");
	page.setTelefone("55", "041", "985854521");
	page.setEmail("tassio@email.com");
	page.setConfirmarEmail("tassio@email.com");
	page.clickResidencia();
	page.setCEP("03003010");
	page.setEndereco("Rua helo", "450", "23");
	page.clickAC();
	page.setSenha("123456", "123456");
	navegador.fecharChrome();

	}
}
