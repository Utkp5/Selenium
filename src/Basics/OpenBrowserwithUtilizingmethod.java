package Basics;

public class OpenBrowserwithUtilizingmethod extends Utilizingmethods {

	public static void main(String[] args) {
		
		preforfireFoxCondition();
		driver.get("https://demowebshop.tricentis.com/");
//		postCondition1();
		preforEdgeCondition();
		driver.get("https://demowebshop.tricentis.com/");
		postCondition1();
		
	}
}
