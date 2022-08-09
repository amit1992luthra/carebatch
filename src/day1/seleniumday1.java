package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumday1 {

	public static void main(String[] args) throws InterruptedException  {
		
		
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		/*driver.get("https://www.careinsurance.com/");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);*/
		
		driver.navigate().to("https://www.careinsurance.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.google.com/");	
		Thread.sleep(3000);
		
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		
		driver.quit();
		
		
		

	}

}
