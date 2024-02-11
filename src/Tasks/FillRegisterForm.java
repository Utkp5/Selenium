package Tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillRegisterForm {

	public static void main(String[] args) throws InterruptedException {
		
		/* Go to the mentioned site and fill the Register form */
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("FirstName")).sendKeys("Utkarsh");		
		Thread.sleep(3000);
		driver.findElement(By.id("LastName")).sendKeys("Pandit");		
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).sendKeys("Pandit5@temp.com");		
		Thread.sleep(3000);
		driver.findElement(By.id("Password")).sendKeys("Pandit");		
		Thread.sleep(3000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Pandit");		
		Thread.sleep(3000);
		driver.findElement(By.className("register-next-step-button")).click();		
		Thread.sleep(3000);
		driver.findElement(By.className("register-continue-button")).click();		
	}
	
}
