package theInternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import theInternet.framework.PageObjectBase;

public class BasicAuth extends PageObjectBase{
	
	public BasicAuth(WebDriver driver, String url) {
		super(driver, url);
	}
	
	public BasicAuth navigate() {
		super.navigate("/basic_auth");
		return this;
	}
	
	public BasicAuth select() {
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		return this;
	}
	
	public String getOption() {
		return driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText();
	}
}
