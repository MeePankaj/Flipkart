package program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertionss {
	@Test
	public void pork() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("login")).click();
		String actual = driver.getTitle();
		System.out.println(actual);
		
		
		String expected = "Facebook – log in or sign up";
		
		
		Assert.assertEquals(actual, expected);
		System.out.println("testcase is pass");
		
		
	}

}
