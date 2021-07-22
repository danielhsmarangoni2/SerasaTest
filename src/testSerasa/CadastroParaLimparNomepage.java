package testSerasa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CadastroParaLimparNomepage {
	
	private static final String URL_Serasa_Home = "https://www.serasa.com.br/";
	private WebDriver browser;
	public CadastroParaLimparNomepage() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\daniel.marangoni\\eclipse-workspace\\SerasaTest\\chromedriver/chromedriver.exe");
		this.browser= new ChromeDriver();
		this.browser.navigate().to(URL_Serasa_Home);
		this.browser.manage().window().maximize(); // Maximizando o chrome
		this.browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Tempo para dar time-out
		// Manipulando dentro do navegador
		this.browser.findElement(By.xpath("//button[contains(.,'O que você precisa?')]")).click(); // Abre o Menu
		this.browser.findElement(By.linkText("Serasa Limpa Nome")).click(); // Clicando no botão Limpa Nome no menu
		this.browser.findElement(By.xpath("//button[@type='submit']")).click(); // Clicando no botão "Consultar Dividas Grátis"

		// Obs não cheguei a finaizar pois não se trata de um CPF valido.
		

}
	public void fechar() {
		this.browser.quit();
}
	}
