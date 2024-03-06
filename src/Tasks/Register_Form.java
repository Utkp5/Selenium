package Tasks;

import java.time.Duration;

import javax.swing.text.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Basics.Utilizingmethods;

public class Register_Form extends Utilizingmethods {

	public static void main(String[] args) {
		preforChromeCondition();
		driver.get("https://demo.automationtesting.in/Register.html");

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
		WebElement First_name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='First Name']")));
		First_name.sendKeys("vivek");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("kumar");
		
		

	}
	
}
