package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AvoidNotification {

	public static void main(String[] args) {
		
		ChromeOptions ch_opt = new ChromeOptions();
		ch_opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(ch_opt);
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
	}
}
