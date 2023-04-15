package program;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount");
		driver.manage().window().maximize();
		String parent_id=driver.getWindowHandle();
		System.out.println(parent_id);
		Set<String> allid=driver.getWindowHandles();
		int count=allid.size();
		System.out.println(count);
		
		for(String a:allid)
		{
			
		}
	}

}
