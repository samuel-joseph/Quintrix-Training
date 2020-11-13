package theInternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import theInternet.framework.PageObjectBase;

public class ForgotPassword extends PageObjectBase{
	
	public ForgotPassword(WebDriver driver, String url) {
		super(driver, url);
	}
	
	public ForgotPassword navigate() {
		super.navigate("/forgot_password");
		return this;
	}
	
	public ForgotPassword retrievePassword() {
		String email = "pinangayjoel@gmail.com";
		WebElement input = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"form_submit\"]/i"));
		
		input.sendKeys(email);
		submit.click();
		
		return this;
	}
	
	public String getString() {
		driver.navigate().back();
		return driver.findElement(By.xpath("//*[@id=\"content\"]/div/h2")).getText();
	}

}
