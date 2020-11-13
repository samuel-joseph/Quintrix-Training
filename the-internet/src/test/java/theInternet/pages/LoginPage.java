package theInternet.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import theInternet.framework.PageObjectBase;

public class LoginPage extends PageObjectBase{
	
	public LoginPage(WebDriver driver, String url) {
		super(driver, url);
	}
	
	public LoginPage navigate() {
		super.navigate("login");
		return this;
	}
	
	public LoginPage inputSubmitCredentials() {
		WebElement usernameTarget = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		WebElement passwordTarget = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		WebElement login = driver.findElement(By.xpath("//*[@id=\"login\"]/button/i"));
		
		usernameTarget.sendKeys("tomsmith");
		passwordTarget.sendKeys("SuperSecretPassword!");
		login.click();
		
		WebElement logout = driver.findElement(By.xpath("//*[@id=\"content\"]/div/a/i"));
		logout.click();
		return this;
	}
	
	public String getString() {
		return driver.findElement(By.xpath("//*[@id=\"content\"]/div/h2")).getText();
	}
	
}
