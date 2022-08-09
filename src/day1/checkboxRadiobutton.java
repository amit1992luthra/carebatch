package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxRadiobutton {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		
		driver.findElement(By.xpath("//input[@id='vfb-7-3']")).click();
		
		Thread.sleep(3000);
		
		boolean result = driver.findElement(By.id("vfb-7-3")).isSelected();
		
		if(result)
		{
			System.out.println("Radio Button is selected");
		}
		 
		else
		{
			System.out.println("Radio button is not selected");
		}
			
		

	}

}
