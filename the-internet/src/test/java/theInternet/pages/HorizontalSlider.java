package theInternet.pages;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import theInternet.framework.PageObjectBase;

public class HorizontalSlider extends PageObjectBase{
	
	public HorizontalSlider(WebDriver driver, String url) {
		super(driver, url);
	}
	
	public HorizontalSlider navigate() {
		super.navigate("horizontal_slider");
		return this;
	}
	
	public HorizontalSlider clickMovePointer() {
		WebElement pointer = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/input"));
		
		pointer.click();
		for(int i =0; i<=5; i++) {
		pointer.sendKeys(Keys.RIGHT);
		}
		pointer.sendKeys(Keys.LEFT);
		return this;
	}
	
	public String getString() {
		return driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText();
	}

}
