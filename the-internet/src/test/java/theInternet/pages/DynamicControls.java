package theInternet.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import theInternet.framework.PageObjectBase;

public class DynamicControls extends PageObjectBase{
	
	public DynamicControls(WebDriver driver, String url) {
		super(driver, url);
	}
	
	
	public DynamicControls navigate() {
		super.navigate("/dynamic_controls");
		return this;
	}
	
	public DynamicControls select() {
		
		driver.findElement(By.xpath("//*[@id=\"checkbox\"]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/button")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"input-example\"]/button")).click();

//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"input-example\"]/button")).click();
		return this;
	}
	
	public String getOption() {
		return driver.findElement(By.id("message")).getText();
	}
}
