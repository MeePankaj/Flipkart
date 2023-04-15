package pactracepackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pp1 {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		JavascriptExecutor ts=(JavascriptExecutor) driver;
		
		for(int i=0; i<3; i++)
		{
			ts.executeScript("window.scrollBy(0,500)");
		}
	}

}
