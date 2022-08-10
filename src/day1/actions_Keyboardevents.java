package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions_Keyboardevents {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Actions obj = new Actions(driver);
		
		WebElement username = driver.findElement(By.name("email"));
		
		obj.keyDown(username, Keys.SHIFT).sendKeys(username,"12345678").keyDown(Keys.BACK_SPACE).keyUp(Keys.SHIFT).build().perform();
		//sendKeys("1234").keyUp(Keys.SHIFT).build().perform();

	}

}
