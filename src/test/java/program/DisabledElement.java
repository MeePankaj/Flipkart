package program;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DisabledElement {
	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/ReNew/Desktop/SQL/ddisable.html");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		//dought in this topic
		//js.executeScript("arguments[0].value='Ab' ", driver.findElement(By.xpath("//input[@type='text']")));
		
	}

	
		
		


}
