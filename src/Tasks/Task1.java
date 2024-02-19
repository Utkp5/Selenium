package Tasks;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		
		String givenTitle = "Demo Web Shop. $25 Virtual Gift Card";
		String values[] = {"Pandit","Pandit1@gmail.com","UP","vivek@gmail.com"};
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		String title = driver.getTitle();
		
		if(givenTitle.contains(title))
		{
			System.out.println("Getting title");
			Thread.sleep(2000);
			List<WebElement> gift_values = driver.findElements(By.xpath("//div[@class='giftcard']/div/input"));
			Thread.sleep(2000);
			
			int i=0;
			for(WebElement web: gift_values)
			{
				web.sendKeys(values[i++]);
			}
			driver.findElement(By.id("addtocart_2_EnteredQuantity")).clear();
			driver.findElement(By.id("addtocart_2_EnteredQuantity")).sendKeys("3");
			driver.findElement(By.id("add-to-cart-button-2")).click();

		}
		else 
		{
			System.out.println("not Getting title");
		}
		
		
	}
	
}
