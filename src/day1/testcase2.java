package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.id("email")).sendKeys("amit luthra");
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("amit luthra");
		
		//String tagname = driver.findElement(By.className("_8eso")).getTagName();
		
		//System.out.println(tagname);
		
	
		String attribute = driver.findElement(By.name("email")).getAttribute("class");
		System.out.println(attribute);
		
		 
		 

	}

}
