package TestSuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.diegotomfurtado.webdriverJava.pageObject.AuthenticationAndCreateAccount;
import br.com.diegotomfurtado.webdriverJava.pageObject.UsersAccountCreation;

@RunWith(Suite.class)
@SuiteClasses({ 
	AuthenticationAndCreateAccount.class,
	UsersAccountCreation.class })

public class ExecutionSuites {
	// Nothing To describe
}
