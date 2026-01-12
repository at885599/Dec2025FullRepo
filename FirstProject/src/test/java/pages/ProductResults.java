package pages;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductResults {
	WebDriver driver;

	public ProductResults(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ".//div[contains(@data-cel-widget,'search_result_')]")
	List<WebElement> Products;

	@FindBy(xpath = ".//span[contains(text(),'ASICS')]")
	List<WebElement> Brand;

	By name=By.xpath(".//a[@class='a-link-normal s-line-clamp-2 s-line-clamp-3-for-col-12 s-link-style a-text-normal']//span");
	By price=By.xpath(".//span[@class='a-price']/span[@class='a-offscreen']");
	Map<String, String> productMap = new HashMap<>();
	@FindBy(xpath=".//span[@class='a-price-whole']")
	List<WebElement> Prices;

	public void printProductPrice() {
		for (WebElement Price : Prices) {
			System.out.println(Price.getText());
			for (WebElement BrandN : Brand) {
				System.out.println(BrandN.getText());
			}
		}
	}

	public void getNameAndPrice() {
		for (WebElement product : Products) {
			try {
				String ProdName = product.findElement((By)name)
						.getText();
				String ProdPrice = product.findElement((By)price)
						.getText();
				productMap.put(ProdName, ProdPrice);
			} catch (Exception e) {
				System.out.println("Error extracting producrt: " + e.getMessage());
			}
		}
		for (Map.Entry<String, String> entry : productMap.entrySet()) {
			System.out.println(entry.getKey() + entry.getValue());
		}
	}
}
