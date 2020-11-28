package theInternet.pages;
import io.github.sukgu.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import theInternet.framework.PageObjectBase;

public class ShadowDom extends PageObjectBase{
	
	public ShadowDom(WebDriver driver, String url) {
		super(driver, url);
	}
	
	public ShadowDom navigate() {
		super.navigate("/shadowdom");
		return this;
	}
	
	public ShadowDom editText() {
		
		//I have to use a dependency for shadowdom just to retrieve it
		Shadow shadow = new Shadow(driver);
		WebElement seeShadow = shadow.findElement("span");
		System.out.println(seeShadow.getText());
		
		return this;
	}
	
	public String getString() {
		return driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText();
	}
	
	
	public WebElement getShadowRootElement(WebElement element) {
		WebElement ele = (WebElement) ((JavascriptExecutor)driver)
		    .executeScript("return arguments[0].shadowRoot", element);
		        return ele;
		    }
}
