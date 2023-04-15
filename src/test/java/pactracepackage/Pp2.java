package pactracepackage;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pp2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		Set<String> pid = driver.getWindowHandles();

		int count = pid.size();
		System.out.println(count);
		
		
		//to get id we use get window handle
		
		/*for(String a:pid)
		{
			a.getText();
			
		}*/
		
	}

}
