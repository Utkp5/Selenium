package Basics;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		//****Open the browser then go to Login page**** 
		
//		driver.findElement(By.className("ico-login")).click();
//		driver.findElement(By.id("small-searchterms")).sendKeys("Tv");
//		driver.findElement(By.linkText("Register")).click();
//		driver.findElement(By.partialLinkText("Shopping")).click();
//		
		//CSS selectors
//		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Laptop");
//		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		List<WebElement> Polls = driver.findElements(By.cssSelector("input[type='radio']"));
		
		for (WebElement web : Polls) {
			web.click();
			Thread.sleep(2000);
		}
		
		
	}
	
}
