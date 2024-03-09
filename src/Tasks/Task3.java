package Tasks;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task3 {

	public static void main(String[] args) {
		
		String given_url = "https://demoapp.skillrary.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.skillrary.com/");
		
		Actions act = new Actions(driver);
		WebElement click_txt = driver.findElement(By.xpath("//span[text()='GEARS']"));
		act.moveToElement(click_txt).click().build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'SkillRary Demo APP')]")).click();
		
		Set<String> wind_ids = driver.getWindowHandles();
		System.out.println(wind_ids);
		
		for(String ids:wind_ids)
		{
			WebDriver Capture_url = driver.switchTo().window(ids);
			String current_url = Capture_url.getCurrentUrl();
			System.out.println(current_url);
			
			if(given_url.equalsIgnoreCase(current_url))
			{
				JavascriptExecutor js = (JavascriptExecutor) driver;
				WebElement subs_txtfield = driver.findElement(By.xpath("//input[@class='form-control']"));
				js.executeScript("arguments[0].click();", subs_txtfield);
				js.executeScript("arguments[0].value='I dont want subscription!'",subs_txtfield);
				System.out.println("My script is successfull........");
			}
			
		}
		
		
	}
}
