package Ram;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Luv {
	
	
	@Test(groups= {"regressionTest"})
	public void apple() {
		Reporter.log(" i am apple",true);
	}
	
	@Test
	public void mango() {
		Reporter.log(" i am mango",true);
	}
	
	@Test(groups= {"smokeTest"})
	public void banana() {
		Reporter.log(" i am banana",true);
	}
	
	@Test
	public void orange() {
		Reporter.log(" i am orange",true);
	}

}
