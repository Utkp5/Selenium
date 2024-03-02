package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri_com {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='nI-gNb-log-reg']/a[2]")).click();
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//div[@class='radioWrap']/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='uploadAction']")).sendKeys("C:\\Users\\utkarsh.pandit\\Documents\\Automation\\Xpath.pdf");
		
		
	}
	
}
