import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MainAmazonAuto extends BaseTest{
	
	
	@Test
	public void Amazon() {
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.get("https://amazon.in");
		System.out.println("amazon opened.");
		amazonHomepage ahp=new amazonHomepage(driver);
		ahp.enterProductAndSearch("Asics Japan S mens");
		ProductResults pr=new ProductResults(driver);
		pr.printProductPrice();
	}

}





