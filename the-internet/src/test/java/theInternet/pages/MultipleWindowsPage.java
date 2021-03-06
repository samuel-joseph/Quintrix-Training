package theInternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import theInternet.framework.PageObjectBase;

public class MultipleWindowsPage extends PageObjectBase {

	public MultipleWindowsPage(WebDriver driver, String url) {
		super(driver, url);
	}

	public MultipleWindowsPage navigate() {
		super.navigate("/windows");
		return this;
	}

	public MultipleWindowsPage clickHere() {
		for (int i = 3; i <= 3; i++) {
			WebElement click = driver.findElement(By.xpath("/html/body/div[2]/div/div/a"));
			click.click();
		}
		return this;
	}

	public String getString() {
		return driver.getCurrentUrl();
	}

}
