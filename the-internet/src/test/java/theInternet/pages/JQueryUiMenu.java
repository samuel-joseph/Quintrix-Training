package theInternet.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import theInternet.framework.PageObjectBase;

public class JQueryUiMenu extends PageObjectBase {

	public JQueryUiMenu(WebDriver driver, String url) {
		super(driver, url);
	}

	public JQueryUiMenu navigate() {
		super.navigate("jqueryui/menu");
		return this;
	}

	public JQueryUiMenu hoverClick() {
		WebDriverWait wait = new WebDriverWait(driver, 10); 
		WebElement downloads = driver.findElement(By.xpath("//*[@id=\"ui-id-4\"]"));
		WebElement enable = driver.findElement(By.xpath("//*[@id=\"ui-id-2\"]"));
		WebElement backToJquery = driver.findElement(By.xpath("//*[@id=\"ui-id-5\"]"));
//		List<WebElement> enabled = driver.findElements(By.xpath("//*[@id=\"menu\"]/li[2]/ul/li[1]/ul"));
//
//		for (WebElement li : enabled) {
//			enable.click();
//			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//			downloads.click();
//			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//			if (li.isEnabled()) {
//				li.click();
//			}
//			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		}
//


		Actions actions = new Actions(driver);
		actions.moveToElement(enable);
		List<WebElement> enabled = driver.findElements(By.xpath("//*[@id=\"menu\"]/li[2]/ul/li[1]/ul"));

		for (WebElement li : enabled) {
			enable.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			downloads.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			actions.moveToElement(li);
			JavascriptExecutor ex = (JavascriptExecutor)driver;
			ex.executeScript("arguments[0].click()", li);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		
		enable.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		backToJquery.click();
		return this;
	}

	public String getString() {
		return driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText();
	}

}
