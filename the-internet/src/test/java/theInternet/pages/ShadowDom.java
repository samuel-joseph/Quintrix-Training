package theInternet.pages;

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
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		WebElement clearData = driver.findElement(By.xpath("//*[@id=\"content\"]/my-paragraph[1]/span"));
		
		clearData.sendKeys("Hello World!");
		return this;
	}
	
	public String getString() {
		return driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText();
	}
}
