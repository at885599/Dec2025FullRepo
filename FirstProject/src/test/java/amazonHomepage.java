import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

//comment added
public class amazonHomepage {
	WebDriver driver;
	
	@FindBy(xpath=".//input[@id='twotabsearchtextbox']") WebElement searchBox;
	@FindBy(xpath=".//input[@id='nav-search-submit-button']")WebElement searchButton;
	public amazonHomepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	public void enterProductAndSearch(String item) {
		searchBox.sendKeys(item);
		searchButton.click();
	}
	
}
