package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utilizingmethods {

	public static WebDriver driver;
	
	public static void preforChromeCondition()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void preforfireFoxCondition()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	public static void preforEdgeCondition()
	{
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	}
	
	public static void postCondition()
	{
		driver.close();
	}
	public static void postCondition1()
	{
		driver.quit();
	}
	
}
