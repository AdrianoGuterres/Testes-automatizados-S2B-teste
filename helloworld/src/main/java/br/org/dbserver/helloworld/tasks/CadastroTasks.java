package br.org.dbserver.helloworld.tasks;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import br.org.dbserver.helloworld.app.object.CadastroAppObject;

public class CadastroTasks {
	private CadastroAppObject cadastroAppObjects;
	

	
	
	public CadastroTasks(WebDriver driver) {
		this.cadastroAppObjects = new CadastroAppObject(driver);
	}
	
	public void preencherCadastro(String nome, String email, String senha, String confSenha, String telefone, String cidade) {
		this.cadastroAppObjects.getNomeColpletoTextField().sendKeys(nome);
		this.cadastroAppObjects.getEmailTextField().sendKeys(email);
		this.cadastroAppObjects.getSenhaTextField().sendKeys(senha);		
		this.cadastroAppObjects.getSenhaConf().sendKeys(confSenha);
		this.cadastroAppObjects.getTelefoneTextField().sendKeys(telefone);
		
		this.cadastroAppObjects.getCidadesComboBox().sendKeys(Keys.ARROW_DOWN);
		this.cadastroAppObjects.getCidadesComboBox().sendKeys(Keys.ENTER);
		
	
		
		
	}
	
	public void enviarFormulario() {
		this.cadastroAppObjects.getCadastrarButton().click();
	}

}
