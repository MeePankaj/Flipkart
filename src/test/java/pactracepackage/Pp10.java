package pactracepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pp10 {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
	}

}
