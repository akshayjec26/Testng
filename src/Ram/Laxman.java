package Ram;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Laxman {
	
	
	@Test
	public void younger() {
		Reporter.log(" i am younger",true);
	}
	
	@Test(groups= {"smokeTest"})
	public void elder() {
		Reporter.log(" i am elder",true);
	}
	
	@Test
	public void small() {
		Reporter.log(" i am small",true);
	}
	
	@Test(groups= {"smokeTest","regressionTest"})
	public void big() {
		Reporter.log(" i am big",true);
	}

}
