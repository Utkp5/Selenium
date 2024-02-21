package Basics;

import org.openqa.selenium.By;

public class Xpath extends Utilizingmethods{

	public static void main(String[] args) throws InterruptedException {
		
		// How to write our own xpath?
		//*[@attribute='value']
		//tagname[@attribute='value']
		

		
		preforChromeCondition();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='NewsletterEmail']")).sendKeys("Ya sure I want subscription!"); 
		System.out.println("success!");
		
		
		
	}
	
}
