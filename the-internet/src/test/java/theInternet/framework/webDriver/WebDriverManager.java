package theInternet.framework.webDriver;

import org.openqa.selenium.WebDriver;

public abstract class WebDriverManager {
	
	protected WebDriver driver;
	protected abstract void createDriver();
	
	public WebDriver getDriver() {
		if(driver == null) {
			createDriver();
		}
		
		return driver;
	}
	
	public void quitDriver() {
		if(driver != null) {
			driver.quit();
		}
	}
}