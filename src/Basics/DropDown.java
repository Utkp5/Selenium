package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	/*  These all are methods of single(1-3) and multi(4-9) drop down although there are 12 but we'll learn only 9             */
//	    1.	selectByIndex();   
//	    2.	selectByVisibleText();
//	    3.	selectByValue();
//	    4.	deSelectByIndex();
//	    5.	deSelectByVisibleText();
//   	6.	deSelectByValue();
//	    7.	getOptions();
//	    8.	isMultiple();
//	    9.	deSelectAll();

	
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement single_dropdown = driver.findElement(By.xpath("//p/select"));
		Select sref = new Select(single_dropdown);
		
		//sref.selectByIndex(1);
		sref.selectByVisibleText("India");
		//sref.selectByValue("Congo, the");
	}
	
}
