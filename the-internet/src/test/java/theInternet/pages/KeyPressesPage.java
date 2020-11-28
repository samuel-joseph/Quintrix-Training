package theInternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import theInternet.framework.PageObjectBase;

public class KeyPressesPage extends PageObjectBase{
	
	public KeyPressesPage(WebDriver driver, String url) {
		super(driver, url);
	}
	
	public KeyPressesPage navigate() {
		super.navigate("/key_presses");
		return this;
	}
	
	public KeyPressesPage inputTarget() {
		WebElement inputPlaceHodler = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/input"));
		
		//To be transferred to a test folder
		inputPlaceHodler.sendKeys(Keys.BACK_SPACE);
		System.out.print(driver.findElement(By.id("result")).getText());
		return this;
	}
	
	public String getString() {
		return driver.findElement(By.xpath("/html/body/div[2]/div/div/h3")).getText();
	}

}
