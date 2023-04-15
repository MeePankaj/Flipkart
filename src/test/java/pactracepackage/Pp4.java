package pactracepackage;

import org.testng.annotations.Test;

public class Pp4 {
	@Test(priority=1)
	public void createcontact() {
		System.out.println("createcontact");
	}
	@Test(priority=2)
	public void modifycontact() {
		System.out.println("modifiycontact");
	}
	@Test(priority=3)
	public void deletecontact() {
		System.out.println("delectcontact");
	}

}
