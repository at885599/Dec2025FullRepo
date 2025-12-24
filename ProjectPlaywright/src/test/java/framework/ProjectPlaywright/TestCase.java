package framework.ProjectPlaywright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class TestCase {
	
	public static void main(String[] args) {
		Playwright playwright=Playwright.create();
		LaunchOptions lp=new LaunchOptions();
		lp.setChannel("Chrome");
		lp.setHeadless(false);
		Browser browser=playwright.chromium().launch(lp);
		BrowserContext context_1=browser.newContext();
		Page page=context_1.newPage();
		page.navigate("https://www.google.com");
	}

}
