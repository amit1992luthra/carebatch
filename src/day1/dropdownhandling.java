package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownhandling {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		/*driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement ele = driver.findElement(By.name("country"));
	
		
		Select obj = new Select(ele);
		
	//	obj.selectByVisibleText("AUSTRALIA"); 
		
	//	obj.selectByValue("INDIA");
		
		obj.selectByIndex(6);*/
		
		
		driver.get("http://output.jsbin.com/osebed/2");
		
		WebElement ele = driver.findElement(By.id("fruits"));
	
		
		Select obj = new Select(ele);
		
		obj.selectByVisibleText("Banana");
		
		obj.selectByValue("orange");
		
		obj.selectByIndex(1);
		Thread.sleep(5000);
		
		obj.deselectByVisibleText("Banana");
		
	}

}
