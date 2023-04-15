package program;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrool  {
	public static void main(String[] args) throws Throwable {
		//key indicates specific type of browser
		String key="webdriver.chrome.driver";
		
		//value indicates path of the driver exefile
		String value="C:\\Users\\ReNew\\Downloads\\chromedriver_win32\\chromedriver.exe";
		
		//Specify the path of drivers to the server
		System.setProperty(key, value);
		
		//Launch Empty Chrome Browser
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		for(int i=0; i<3; i++)
		{
			js.executeScript("window.scrollBy(0,500)");
		}
		Thread.sleep(4000);
		for(int i=0; i<3; i++)
		{
			js.executeScript("window.scrollBy(0,-500)");
		}
	}

}
