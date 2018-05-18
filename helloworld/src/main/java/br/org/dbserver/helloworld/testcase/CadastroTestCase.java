package br.org.dbserver.helloworld.testcase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import br.org.dbserver.helloworld.tasks.CadastroTasks;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CadastroTestCase {

	private WebDriver driver;
	private CadastroTasks cadastro;

	@Before
	public void setUp() {
		WebDriverManager.firefoxdriver().setup();
		this.driver = new FirefoxDriver();

		this.driver.get("http://www.xiru.rs/d/trocas/homolog/usuarios/cadastrar");		
		this.cadastro = new CadastroTasks(driver);
	}

	@Test
	public void tesMain() {
		this.cadastro.preencherCadastro("Maria", "maria@maria.com", "minhaSenha", "minhaSenha", "999999999", "Porto Alegre");
		this.cadastro.enviarFormulario();		
	}

	@After
	public void tearDown() {
		//this.driver.quit();	
	}


}
