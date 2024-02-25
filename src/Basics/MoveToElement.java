package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Actions act = new Actions(driver);
		WebElement search_field = driver.findElement(By.id("small-searchterms"));
		
		act.moveToElement(search_field).click().click().sendKeys("T-shirts for sale").perform();
		act.keyDown(Keys.TAB).keyDown(Keys.ENTER).build().perform();
	}
	
}
