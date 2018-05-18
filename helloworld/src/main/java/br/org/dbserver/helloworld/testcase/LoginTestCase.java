package br.org.dbserver.helloworld.testcase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import br.org.dbserver.helloworld.verificationpoints.LoginVerificationPoint;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestCase {
	private WebDriver driver;
	private LoginVerificationPoint loginVerificationPoint;

	@Before
	public void setUp() {
		
		
		WebDriverManager.firefoxdriver().setup();
		this.driver = new FirefoxDriver();

		this.driver.get("http://www.xiru.rs/d/trocas/homolog/usuarios/cadastrar");
		
		loginVerificationPoint = new LoginVerificationPoint(driver);


	}

	@Test
	public void testMain() {
		WebElement userNameTextField =  this.driver.findElement(By.id("modlgn-username"));
		WebElement passwordUserNameTextField = this.driver.findElement(By.id("modlgn-passwd"));
		WebElement loginBtn = this.driver.findElement(By.name("Submit"));
		
		
		
		userNameTextField.sendKeys("demo");
		passwordUserNameTextField.sendKeys("demo");
		loginBtn.click();
		
		loginVerificationPoint.checkHelloMessage();		
	}

	

	@After
	public void tearDown() {
		this.driver.quit();				
	}



}
