package testSerasa;

import org.junit.Test;

public class CadastroParaConsultaScoretest {

	private CadastroParaConsultaScorepage CadastroParaConsultaScorepage;

	@Test
	public void Score() {

		CadastroParaConsultaScorepage = new CadastroParaConsultaScorepage();
		CadastroParaConsultaScorepage.CPF("11180686020");
		CadastroParaConsultaScorepage.Nome("Teste Serasa");
		CadastroParaConsultaScorepage.DatadeAniversario("10/12/1990");
		CadastroParaConsultaScorepage.Email("daniel.marangoni@gmail.com");
		CadastroParaConsultaScorepage.Senha("Serasa13@");
		CadastroParaConsultaScorepage.AceiteTermos();
		CadastroParaConsultaScorepage.fechar();
		// Obs não cheguei a finaizar pois não se trata de um CPF valido.
	}
}
