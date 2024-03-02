package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ilovepdf.com/pdf_to_powerpoint");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\utkarsh.pandit\\Documents\\Automation\\XPath.pdf");
	}
	
}
