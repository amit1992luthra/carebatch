package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Action_Mouseevents {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		Actions obj = new Actions(driver);
		driver.manage().window().maximize();
		//driver.switchTo().frame(0);
		//driver.switchTo().defaultContent();  this function is used to come out from the frame
		
		//WebElement drag = driver.findElement(By.id("draggable"));
		//WebElement drop = driver.findElement(By.id("droppable"));
		
		//obj.clickAndHold(drag).moveToElement(drop).release().build().perform();
		
		//obj.dragAndDrop(drag, drop).build().perform();
		
		//obj.contextClick(drag).build().perform();
		
		WebElement download = driver.findElement(By.xpath("//a[text()='Download']"));
		
		obj.click(download).build().perform();
		

	}

}
