package Tasks;

import java.time.Duration;

import org.openqa.selenium.By;

import Basics.Utilizingmethods;

public class Dream11_Task extends Utilizingmethods{

	public static void main(String[] args) {
		
		preforChromeCondition();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.dream11.com/");
		//driver.switchTo().frame(0);
		driver.switchTo().frame("send-sms-iframe");
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("9875864520");
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("hamburger")).click();
		
	}
	
}
