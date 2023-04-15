package pactracepackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pp6_Screenshot {
	public static void main(String[] args) throws Throwable  {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\ReNew\\Desktop\\img\\Am.png");
		
		FileUtils.copyFile(src, dest);
		
		
		
	}

}
