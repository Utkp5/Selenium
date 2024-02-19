package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentAndDependent {

	public static void main(String[] args) {
		
		String given_url = "https://demowebshop.tricentis.com/digital-downloads";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/digital-downloads");

		if(given_url.equalsIgnoreCase(driver.getCurrentUrl()))
		{
			System.out.println("entering into the digital page is successfull");
			
			//approach 1
//			String price = driver.findElement(By.xpath("{//a[text()='Music 2']}[2]/../../div[3]/div/span")).getText();
//			System.out.println(price);
			
			
			//approach 2
			WebElement price = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[3]/div/div[2]/div[3]/div[1]/span"));
			System.out.println(price.getText());
		}
		else {
			System.out.println("entering into the digital page is unsuccessfull");
		}
	}
	
}
