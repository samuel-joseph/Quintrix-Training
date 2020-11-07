package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddRemoveElement extends PageObjectBase {

	public AddRemoveElement(WebDriver driver, String url) {
		super(driver, url);
	}

	@FindBy(id = "elements")
	WebElement element;

	public AddRemoveElement navigate() {
		super.navigate("add_remove_elements/");
		return this;
	}

	public AddRemoveElement select() {
		for (int i = 0; i <= 10; i++) {
			driver.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click();
		}
		for (int i = 0; i <= 9; i++) {
			driver.findElement(By.xpath("//*[@id=\"elements\"]/button")).click();
		}
		return this;
	}
	
	public String getOption(String del) {
		return driver.findElement(By.xpath("//*[@id=\"elements\"]/button")).getText();
	}
}
