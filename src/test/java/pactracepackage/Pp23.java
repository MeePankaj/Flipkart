package pactracepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pp23 {
	public static void main(String[] args)  {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.naukri.com/registration/createAccount");
		 driver.manage().window().maximize();
		 
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 String id = driver.getWindowHandle();
		 System.out.println(id);

	
		
	
		
	}

}
