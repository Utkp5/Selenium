package Basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		//Simple alert
//		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
//		Alert alt = driver.switchTo().alert();
//		Thread.sleep(2000);
//		alt.accept();
		
		//Confirmation alert  
//		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
//		Alert alt1 = driver.switchTo().alert();
//		Thread.sleep(2000);
//		alt1.accept();
		
		//Prompt alert  
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert alt2 = driver.switchTo().alert();
		Thread.sleep(2000);
		alt2.sendKeys("Utkarsh pandit");
		alt2.accept();
		String expected_text = "Hello Utkarsh pandit How are you today";
		
		String actual_text = driver.findElement(By.id("demo1")).getText();
		
		if(actual_text.equalsIgnoreCase(expected_text))
		{
			System.out.println(expected_text + " Test passed!");
		}
		else {
			System.out.println("Failed to get the text!");
		}
		
		
	}
	
}
