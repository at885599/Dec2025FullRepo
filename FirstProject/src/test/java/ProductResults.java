import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductResults {
	WebDriver driver;
	public ProductResults(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		@FindBy(xpath=".//span[@class='a-price-whole']")
		List<WebElement> Prices;
		@FindBy(xpath=".//span[contains(text(),'ASICS')]")
		List<WebElement> Brand;
	
	public void printProductPrice() {
		for(WebElement Price:Prices) {
			System.out.println(Price.getText());
		for(WebElement BrandN:Brand) {
			System.out.println(BrandN.getText());
		}
		}
	}
}
