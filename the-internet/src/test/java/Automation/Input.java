package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Input extends PageObjectBase {

	public Input(WebDriver driver, String url) {
		super(driver, url);
	}

	public Input navigate() {
		super.navigate("inputs");
		return this;
	}

	public Input inputNumber() {
		WebElement inputPlaceHolder = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/input"));

		inputPlaceHolder.sendKeys("10");
		for (int i = 0; i <= 100; i++) {
			inputPlaceHolder.sendKeys(Keys.ARROW_UP);
		}
		inputPlaceHolder.sendKeys(Keys.ARROW_DOWN);
		return this;
	}
	
	public String getString() {
		return driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/h3")).getText();
	}

}
