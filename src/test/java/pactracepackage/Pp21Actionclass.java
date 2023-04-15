package pactracepackage;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pp21Actionclass {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		WebElement ele = driver.findElement(By.xpath("//div[text()='Best of Shavers']"));
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		
		a.moveToElement(ele).perform();
		
	}

}
