package br.org.dbserver.helloworld.testSuites;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.org.dbserver.helloworld.testcase.LoginTestCase;

@RunWith(Suite.class)
@SuiteClasses({
	LoginTestCase.class
})
public class RegressionTests {
	@BeforeClass
	public static void initPrepair() {
		System.out.println("Iniciando execussão");		
	}
	
	
	@AfterClass
	public static void endExecution() {
		System.out.println("Finalizando...");		
	}

}
