package Ram;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Kush {
	
	
	@Test (groups= {"smokeTest"})
	public void great() {
		Reporter.log(" i am great",true);
	}
	
	
	@Test(groups= {"smokeTest","regressionTest"})
	public void silly() {
		Reporter.log(" i am silly",true);
	}
	
	@Test(groups= {"smokeTest"})
	public void foolish() {
		Reporter.log(" i am foolish",true);
	}
	
	@Test(groups= {"regressionTest"})
	public void skill() {
		Reporter.log(" i am skill",true);
	}

}
