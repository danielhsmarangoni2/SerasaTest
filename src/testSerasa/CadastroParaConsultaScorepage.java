package testSerasa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CadastroParaConsultaScorepage {

	private static final String URL_Serasa_Home = "https://www.serasa.com.br/";
	private WebDriver browser;
	public CadastroParaConsultaScorepage() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\daniel.marangoni\\eclipse-workspace\\SerasaTest\\chromedriver/chromedriver.exe");
		this.browser= new ChromeDriver();
		this.browser.navigate().to(URL_Serasa_Home);
		this.browser.manage().window().maximize(); // Maximizando o chrome
		this.browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Tempo para dar time-out
		// Manipulando dentro do navegador
		this.browser.navigate().to(URL_Serasa_Home);
		this.browser.findElement(By.xpath("//button[contains(.,'O que você precisa?')]")).click(); // Abre o Menu
		this.browser.findElement(By.xpath("//div[2]/a[4]")).click(); // Seleciona o Consulta Score
		this.browser.findElement(By.linkText("Consulte agora")).click(); // Clicando no bot�o Consulte Agora
		this.browser.findElement(By.xpath("//a[contains(text(),'Crie uma conta')]")).click(); // Clicando no botão Cadastrar

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
