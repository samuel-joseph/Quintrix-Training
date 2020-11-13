package theInternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import theInternet.framework.PageObjectBase;

public class AddRemoveElement extends PageObjectBase {

	public AddRemoveElement(WebDriver driver, String url) {
		super(driver, url);
	}

	@FindBy(id = "elements")
	WebElement element;

	public AddRemoveElement navigate() {
		super.navigate("/add_remove_elements/");
		return this;
	}

	public AddRemoveElement select() {
			WebDriverWait wait = new WebDriverWait(driver,30);
			driver.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"elements\"]/button")));
			driver.findElement(By.xpath("//*[@id=\"elements\"]/button")).click();
		
		return this;
	}
	
	public String getOption(String del) {
		return driver.findElement(By.xpath("//*[@id=\"content\"]/h3")).getText();
	}
}
