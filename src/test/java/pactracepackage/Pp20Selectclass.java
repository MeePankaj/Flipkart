package pactracepackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pp20Selectclass {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/ReNew/Desktop/SQL/Dropdown.html");
		WebElement ele = driver.findElement(By.id("nadanapalace"));
		
		Select s=new Select(ele);
		List<WebElement> op = s.getOptions();
		int count = op.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			s.selectByIndex(i);
		}
		s.deselectAll();
		
		for(WebElement a:op)
		{
			System.out.println(a.getText());
		}
	}

}
