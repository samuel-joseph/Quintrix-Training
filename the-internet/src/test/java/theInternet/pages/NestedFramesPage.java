package theInternet.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import theInternet.framework.PageObjectBase;

public class NestedFramesPage extends PageObjectBase{
	
	public NestedFramesPage(WebDriver driver, String url) {
		super(driver,url);
	}
	
	public NestedFramesPage navigate() {
		super.navigate("nested_frames");
		return this;
	}
	
	public NestedFramesPage inputText() {
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.print(size);
		for(int i=0; i<=size; i++) {
			driver.switchTo().frame(i);
			WebElement toWrite = driver.switchTo().activeElement();
			toWrite.sendKeys("Hello World");
			
			driver.switchTo().defaultContent();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return this;
		
	}
	
	public String getString() {
		return driver.getCurrentUrl();
	}

}
