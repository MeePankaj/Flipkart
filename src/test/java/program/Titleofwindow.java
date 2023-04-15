package program;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Titleofwindow {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount");
		driver.manage().window().maximize();
		String parent_id=driver.getWindowHandle();
		System.out.println(parent_id);
		Set<String> allid=driver.getWindowHandles();
		int count=allid.size();
		System.out.println(count);
		Thread.sleep(2000);
		for(String a:allid)
		{
			driver.switchTo().window(a);
			String title=driver.getTitle();
			System.out.println(title);
		
		}
		
	}

}
