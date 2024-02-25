package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Pandit");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Utkarsh");		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9875652598");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("648598");
				
		//Drop down birthday
		WebElement dropdown_day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s_refday = new Select(dropdown_day);
		s_refday.selectByVisibleText("17");
		Thread.sleep(2000);
		
		WebElement dropdown_month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s_refmonth = new Select(dropdown_month);
		s_refmonth.selectByVisibleText("Feb");
		Thread.sleep(2000);
		
		WebElement dropdown_year = driver.findElement(By.xpath("//select[@id='year']"));
		Select s_refyr = new Select(dropdown_year);
		s_refyr.selectByVisibleText("2002");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@class='_58mt']/following::input[2]")).click();		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();		
		
	}
	
	
}
