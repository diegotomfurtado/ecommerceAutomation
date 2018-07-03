package com.diegotomfurtado.webdriverpageobject.testsuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.diegotomfurtado.webdriverpageobject.testexecution.AuthenticationAndCreateAccount;
import com.diegotomfurtado.webdriverpageobject.testexecution.UsersAccountCreation;

@RunWith(Suite.class)
@SuiteClasses({ 
	AuthenticationAndCreateAccount.class,
	UsersAccountCreation.class })

public class ExecutionSuites {
	// Nothing To describe
}
