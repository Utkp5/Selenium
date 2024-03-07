package Basics;

import java.time.Duration;

import org.openqa.selenium.By;

public class Iframe extends Utilizingmethods{

	public static void main(String[] args) {
		
		preforChromeCondition();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.dream11.com/");
		//driver.switchTo().frame(0);                          //By index
		driver.switchTo().frame("send-sms-iframe");            // By Id/name
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("9875864520");
		
		//driver.switchTo().parentFrame(); //it is basically used to switch to the immediate parent frame 
		driver.switchTo().defaultContent();
		driver.findElement(By.id("hamburger")).click();
		
	}
	
}
