package pactracepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pp22iFrame {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/ReNew/Desktop/SQL/iframe.html");
		driver.manage().window().maximize();
		WebElement f = driver.findElement(By.xpath("//iframe[@id='f1']"));
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.switchTo().frame("f1");
		driver.switchTo().frame(f);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='t2']")).sendKeys("Pankaj");
		driver.switchTo().defaultContent();
		
	
		
		
		
	}

}
