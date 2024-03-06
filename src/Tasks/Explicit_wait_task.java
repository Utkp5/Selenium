package Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait_task {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
		
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='timerButton']"))).click();
		 WebElement dropdwn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Dropdown']")));
		 dropdwn.click();
	}
}
