package day1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript_executor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
	//	js.executeScript("document.getElementById('email').value='amit';");//substitute of sendkeys
		
		String title = js.executeScript("return document.title;").toString();
		System.out.println(title);
		
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); 
		js.executeScript("window.scrollBy(0,500)"); 

	}

}
