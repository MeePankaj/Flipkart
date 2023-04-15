package advance_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchVtiger {
	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://localhost:8888");
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@align='center'][3]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@style='width:50px']")).click();
		
		driver.findElement(By.xpath("//td[@align='center'][4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@style='width:50px']")).click();
		
		
	
	
	}
	}
