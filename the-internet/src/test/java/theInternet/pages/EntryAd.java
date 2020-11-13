package theInternet.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import theInternet.framework.PageObjectBase;

public class EntryAd extends PageObjectBase {

	public EntryAd(WebDriver driver, String url) {
		super(driver, url);
	}

	public EntryAd navigate() {
		super.navigate("entry_ad");
		return this;
	}

	public EntryAd select() {
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		

		WebElement element = driver.findElement(By.xpath("//*[@id=\"modal\"]/div[2]/div[3]/p"));

		element.click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement reset = driver.findElement(By.id("restart-ad"));
		reset.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		executor.executeScript("arguments[0].scrollIntoView(true);", element);
//		element.click();
		return this;
	}

	public String getOption() {
		return driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/h3")).getText();
	}

}
