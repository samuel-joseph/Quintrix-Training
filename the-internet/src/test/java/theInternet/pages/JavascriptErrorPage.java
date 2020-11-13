package theInternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import theInternet.framework.PageObjectBase;

public class JavascriptErrorPage extends PageObjectBase{
	
	public JavascriptErrorPage(WebDriver driver, String url) {
		super(driver,url);
	}
	
	public JavascriptErrorPage navigate() {
		super.navigate("/javascript_error");
		return this;
	}
	
	public JavascriptErrorPage getAttribute() {
		WebElement body = driver.findElement(By.xpath("/html/body"));
		String stringOnload = body.getAttribute("onload");
		return this;
	}
	
	public String getPageSource() {
		return driver.getCurrentUrl();
	}

}
