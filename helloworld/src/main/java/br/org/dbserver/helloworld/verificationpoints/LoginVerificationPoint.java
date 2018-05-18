package br.org.dbserver.helloworld.verificationpoints;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.openqa.selenium.WebDriver;

public class LoginVerificationPoint {
	
	private WebDriver driver;
	
	
	
	public LoginVerificationPoint(WebDriver driver) {
		this.driver = driver;
	}



	public void checkHelloMessage() {
		final String expectedMessage = "Hi demo!";
		
		if(this.driver.getPageSource().contains("Mensagem de sucesso") != true) {
			System.out.println("O test de login passou!");
		}else {
			
			assertTrue(this.driver.getPageSource().contains("Mensagem de sucesso"));
			System.out.println("O teste passou!");			
		}
	}

}
