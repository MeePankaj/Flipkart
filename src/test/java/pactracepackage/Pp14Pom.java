package pactracepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pp14Pom {
	@Test
	public void login() throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.name("login"));
		ele.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		ele.click();		
	}

}
