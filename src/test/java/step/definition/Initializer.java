package step.definition;

import core.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Initializer extends Base {

	@Before
	public void beforeHooks(Scenario scenario) {
		logger.info("Scenario " + scenario.getName() + " started");
		selectBrowser();  
	    launchBrowser(); 
	
	}
	
	
	@After
    public void afterHooks(Scenario scenario) {
		tearDown();
		logger.info("Scenario " +scenario.getName() + " " + scenario.getStatus() );
	}
}
