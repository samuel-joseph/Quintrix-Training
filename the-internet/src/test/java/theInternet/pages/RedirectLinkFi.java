package theInternet.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;

import theInternet.framework.PageObjectBase;

public class RedirectLinkFi extends PageObjectBase {

	public RedirectLinkFi(WebDriver driver, String url) {
		super(driver, url);
	}

	public RedirectLinkFi navigate() {
		super.navigate("/redirector");
		return this;
	}

	public RedirectLinkFi clickLink() {
		WebElement click = driver.findElement(By.id("redirect"));

		click.click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//		WebElement ul = driver.findElement(By.tagName("ul"));
//		List<WebElement> li = ul.findElements(By.tagName("li"));
		
//		for(WebElement statCode:li) {
//			JavascriptExecutor executor = (JavascriptExecutor) driver;
//			executor.executeScript("arguments[0].scrollIntoView(true);", statCode); 
//			statCode.click();
//			driver.navigate().back();
//		}

		for (Integer i = 1; i <= 4; i++) {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String xpath = String.format("//*[@id=\"content\"]/div/ul/li[%s]/a", i);
			WebElement li = driver.findElement(By.xpath(xpath));
			
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].scrollIntoView(true);", li); 
			
			li.click();
			driver.navigate().back();;
		}

		return this;

	}

	public String getString() {
		return driver.getCurrentUrl();
	}
}
