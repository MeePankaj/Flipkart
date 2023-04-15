package pactracepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pp12Assert {
	@Test
	public void pp() throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		String actual = driver.getTitle();
		System.out.println(actual);
		String expected = "Log in to Facebook";
		Thread.sleep(2000);
		Assert.assertEquals(actual, expected);
		
		
	}

}
