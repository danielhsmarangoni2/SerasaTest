package testSerasa;

import org.junit.Test;



public class CadastroParaConsultarCadastroPositivotest {

	private CadastroParaConsultarCadastroPositivopage CadastroParaConsultarCadastroPositivopage;


	@Test
	public void CadastroPositivo() {
	    CadastroParaConsultarCadastroPositivopage = new CadastroParaConsultarCadastroPositivopage();	
		CadastroParaConsultarCadastroPositivopage.CPF("11180686020");
		CadastroParaConsultarCadastroPositivopage.Nome("Teste Serasa");
		CadastroParaConsultarCadastroPositivopage.DatadeAniversario("10/12/1990");
		CadastroParaConsultarCadastroPositivopage.Email("daniel.marangoni@gmail.com");
		CadastroParaConsultarCadastroPositivopage.Senha("Serasa13@");
		CadastroParaConsultarCadastroPositivopage.AceiteTermos();
		CadastroParaConsultarCadastroPositivopage.fechar();
		// Obs não cheguei a finaizar pois não se trata de um CPF valido.

	}
}
