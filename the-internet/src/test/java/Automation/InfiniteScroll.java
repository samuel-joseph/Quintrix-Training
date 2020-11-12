package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScroll extends PageObjectBase {

	public InfiniteScroll(WebDriver driver, String url) {
		super(driver, url);
	}

	public InfiniteScroll navigate() {
		super.navigate("infinite_scroll");
		return this;
	}

	public InfiniteScroll scroll() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();

		for (int i = 0; i <= 500; i++) {
			js.executeScript("window.scrollBy(0,1000)");
		}
		return this;
	}

	public String getString() {
		return driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText();
	}

}
