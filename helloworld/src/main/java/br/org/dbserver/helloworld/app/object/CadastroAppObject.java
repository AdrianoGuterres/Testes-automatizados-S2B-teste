package br.org.dbserver.helloworld.app.object;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroAppObject {

	private WebDriver driver;

	
	public CadastroAppObject(WebDriver driver) {
		this.driver = driver;		
	}

	public WebElement getNomeColpletoTextField() {

		return this.driver.findElement(By.id("nome"));
	}

	public WebElement getEmailTextField() {

		return this.driver.findElement(By.id("email"));
	}
	
	public WebElement getSenhaTextField() {

		return this.driver.findElement(By.id("password"));
	}	
	
	public WebElement getSenhaConf() {

		return this.driver.findElement(By.id("passconf"));
	}
	
	public WebElement getTelefoneTextField() {

		return this.driver.findElement(By.id("telefone"));
	}
	
	public WebElement getCidadesComboBox() {

		return this.driver.findElement(By.id("cidade"));
	}
	
	public WebElement getCadastrarButton() {

		return this.driver.findElement(By.xpath("//*[@id=\"cadastrar\"]/fieldset/div[8]/div/input"));
	}

	

}
