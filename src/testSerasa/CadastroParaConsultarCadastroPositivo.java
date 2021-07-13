package testSerasa;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CadastroParaConsultarCadastroPositivo {

	@Test
	public void CadastroPositivo() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\daniel.marangoni\\eclipse-workspace\\SerasaTest\\chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // Maximizando o chrome
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Tempo para dar time-out

		driver.get("https://www.serasa.com.br/"); // Acessando a HomePage
		driver.findElement(By.xpath("//button[contains(.,'O que você precisa?')]")).click(); // Abre o Menu
		driver.findElement(By.linkText("Serasa Cadastro Positivo")).click(); // Clicando na Op��o Cadastro Positivo
		driver.findElement(By.linkText("Consultar agora")).click(); // Clicando em Consultar
		driver.findElement(By.xpath("//a[contains(text(),'Cadastrar')]")).click(); // Clicando no bot�o Cadastrar

		// Realizando o cadastro
		driver.findElement(By.id("cpf")).sendKeys("11180686020"); // preenchendo o campo CPF
		driver.findElement(By.id("name")).sendKeys("Teste Serasa"); // preenchendo o campo Nome
		driver.findElement(By.id("birthDate")).sendKeys("10/12/1990"); // preenchendo o campo Data de aniversario
		driver.findElement(By.id("email")).sendKeys("daniel.marangoni@gmail.com"); // preenchendo o campo E-mail
		driver.findElement(By.id("password")).sendKeys("Serasa13@"); // preenchendo o campo Senha
		driver.findElement(By.xpath("//form[@id='sign_up_form']/div[7]/label/span")).click(); // Aceitando os termos

		// Obs não cheguei a finaizar pois não se trata de um CPF valido.

		driver.close();
	}
}
