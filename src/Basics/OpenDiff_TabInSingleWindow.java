package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenDiff_TabInSingleWindow {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Actions act = new Actions(driver);
		
		 List<WebElement> links = driver.findElements(By.xpath("//ul[@class='top-menu']/li/a"));
		 for (WebElement web : links) {
			act.keyDown(Keys.CONTROL).click(web).build().perform();
			Thread.sleep(2000);
		}
		driver.quit();
	}
	
}
