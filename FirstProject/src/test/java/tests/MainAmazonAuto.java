package tests;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.ProductResults;
import pages.amazonHomepage;
import utils.ScreenshotUtil;

public class MainAmazonAuto extends BaseTest{
	
	
	@Test
	public void Amazon() {
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.get("https://amazon.in");
		System.out.println("amazon opened.");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		amazonHomepage ahp=new amazonHomepage(driver);
		ahp.enterProductAndSearch("Asics Japan S mens");
		ProductResults pr=new ProductResults(driver);
		pr.printProductPrice();
		pr.getNameAndPrice();
	}

}





