
package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launchbrowser {

	public static void main(String[] args) {
		
		  ChromeDriver utkarsh = new ChromeDriver();
		  //utkarsh.get("https://www.youtube.com");
		  utkarsh.manage().window().maximize();
		  
		  //launch shoes website
		  //utkarsh.get("https://www.bata.com/in/men/");
		  
		  //launch laptop website
		  //utkarsh.get("https://www.flipkart.com/laptops-store");
		  
		  //launch car website
		  utkarsh.get("https://www.cars24.com/");
		  
		//  utkarsh.close();
	}

}
