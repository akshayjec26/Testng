package Ram;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sita {
	
	
	@Test(groups= {"smokeTest"})
	public void potato() {
		Reporter.log(" i am potato",true);
	}
	
	
	@Test(groups= {"smokeTest"})
	public void onion() {
		Reporter.log(" i am onion",true);
	}
	
	
	@Test(groups= {"regressionTest"})
	public void tamato() {
		Reporter.log(" i am tomato",true);
	}
	
	
	@Test(groups= {"regressionTest"})
	public void jackFruit() {
		Reporter.log(" i am jackFruit",true);
	}

}
