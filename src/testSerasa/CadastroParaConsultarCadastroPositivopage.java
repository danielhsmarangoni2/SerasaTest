package testSerasa;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CadastroParaConsultarCadastroPositivopage {
	private static final String URL_Serasa_Home = "https://www.serasa.com.br/";
	private WebDriver browser;

	public CadastroParaConsultarCadastroPositivopage() {
		// configuração Chrome		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\daniel.marangoni\\eclipse-workspace\\SerasaTest\\chromedriver/chromedriver.exe");
		this.browser= new ChromeDriver();
		this.browser.navigate().to(URL_Serasa_Home);
		this.browser.manage().window().maximize(); // Maximizando o chrome
		this.browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Tempo para dar time-out
		// Manipulando dentro do navegador
		this.browser.findElement(By.xpath("//button[contains(.,'O que você precisa?')]")).click(); // Abre o Menu
		this.browser.findElement(By.linkText("Serasa Cadastro Positivo")).click(); // Clicando na Opção Cadastro //
																					// Positivo
		this.browser.findElement(By.linkText("Consultar agora")).click(); // Clicando em Consultar
		this.browser.findElement(By.xpath("//a[contains(text(),'Crie uma conta')]")).click(); // Clicando no botão
		// Cadastrar

	}

	public void fechar() {
		this.browser.quit();

	}

	public void CPF(String CPF) {
		this.browser.findElement(By.id("cpf")).sendKeys(CPF);

	}

	public void Nome(String Nome) {
		this.browser.findElement(By.id("name")).sendKeys(Nome);

	}

	public void DatadeAniversario(String DatadeAniversario) {
		this.browser.findElement(By.id("birthDate")).sendKeys(DatadeAniversario);

	}

	public void Email(String Email) {
		this.browser.findElement(By.id("email")).sendKeys(Email);

	}

	public void Senha(String Senha) {
		this.browser.findElement(By.id("password")).sendKeys(Senha);

	}

	public void AceiteTermos() {
		this.browser.findElement(By.xpath("//form[@id='sign_up_form']/div[7]/label/span")).click();
	}

}
