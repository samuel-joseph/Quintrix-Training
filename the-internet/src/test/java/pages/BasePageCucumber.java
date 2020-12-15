package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePageCucumber {
	
	WebDriver driver;
	String baseUrl;
	
	
	public BasePageCucumber() {
		driver = new ChromeDriver();
		baseUrl = "https://the-internet.herokuapp.com/";
	}
	
	public void navigateIndex() {
		System.setProperty("webdriver.chrome.driver",  "/Users/joe/git/chromedriver");
		driver.navigate().to(baseUrl);
	}
	
	public void navigateTo(String url) {
		driver.navigate().to(baseUrl+url);
	}
	
	public void close() {
		driver.close();
	}
	
	public void clickButton(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public String getText(String xpath) {
		return driver.findElement(By.xpath(xpath)).getText();
	}

}
