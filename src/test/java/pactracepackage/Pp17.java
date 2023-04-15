package pactracepackage;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pp17 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/registration/createAccount");
		Set<String> id = driver.getWindowHandles();
		int count = id.size();
		System.out.println(count);
		
		for(String a:id)
		{
			System.out.println(a);
		}
	}

}
