package theInternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import theInternet.framework.PageObjectBase;

public class DisappearingElements extends PageObjectBase{
	
	public DisappearingElements(WebDriver driver, String url) {
		super(driver, url);
	}
	
	public DisappearingElements navigate() {
		super.navigate("disappearing_elements");
		return this;
	}
	
	public DisappearingElements select() {
		
		for(int i = 1;i<=4;i++) {
			driver.findElement(By.xpath(String.format("//*[@id=\"content\"]/div/ul/li[%s]/a",i))).click();
			driver.navigate().back();
		}
		return this;
	}
	
	public String getOption() {
		return driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText();
	}

}
