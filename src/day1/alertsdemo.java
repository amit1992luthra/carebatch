package day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertsdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.manage().window().maximize(); //maximise the window
		
		driver.findElement(By.name("cusid")).sendKeys("123456");
		
		driver.findElement(By.name("submit")).click();
		
		Alert alt = driver.switchTo().alert();
		
		String alertvalue = alt.getText();
		//alt.accept();
		System.out.println(alertvalue);
		
		//alt.dismiss();
		
		
		
		
		
		
		
	}

}
