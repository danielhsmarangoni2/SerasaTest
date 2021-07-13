package testSerasa;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class CadastroParaLimparNome {
	
		@Test
		public void LimpaNome () {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\daniel.marangoni\\eclipse-workspace\\SerasaTest\\chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // Maximizando o chrome
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Tempo para dar time-out

		driver.get("https://www.serasa.com.br/"); // Acessando a HomePage
		driver.findElement(By.xpath("//button[contains(.,'O que você precisa?')]")).click(); // Abre o Menu
		driver.findElement(By.linkText("Serasa Limpa Nome")).click(); // Clicando no botão Limpa Nome no menu
		driver.findElement(By.xpath("//button[@type='submit']")).click(); // Clicando no botão "Consultar Dividas
																			// Gr�tis"

		// Obs não cheguei a finaizar pois não se trata de um CPF valido.

		driver.close();

	}
}