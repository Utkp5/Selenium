package Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.skillrary.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//1.    js.executeScript("window.scrollBy(0,1000)");
   	    //2.	js.executeScript("window.scrollTo(0,1000)");
		
		//3. Scroll into view
		 WebElement target_element = driver.findElement(By.xpath("//h2[text()='Our Services']"));
		 js.executeScript("arguments[0].scrollIntoView(true);", target_element);
		
		 //there is difference between scrollintoview(true) and scrollintoview(false)
		
	}
}
