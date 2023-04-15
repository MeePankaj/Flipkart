package pactracepackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Pp13Testdis {
	@Test(invocationCount=0)
	public void contact() {
		System.out.println("CreateContact");
	}
	@Test(enabled=false)
	public void pro() {
		Reporter.log("A",true);
	}
	@Test
	public void dee() {
		Reporter.log("B",true);
	}
	

}
