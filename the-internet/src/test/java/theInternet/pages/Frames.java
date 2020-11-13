package theInternet.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frames extends PageObjectBase{
	
	public Frames(WebDriver driver, String url) {
		super(driver, url);
	}
	
	public Frames navigate() {
		super.navigate("frames");
		return this;
	}
	
	public Frames switchToFrames() {
		WebElement nestedFrames = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/a"));
		
		
		nestedFrames.click();
		driver.navigate().back();
		
		WebElement iFrame = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/a"));
		iFrame.click();
		

		System.out.print("TEST");
		driver.switchTo().frame(0);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement typeTo = driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p"));
//		WebElement bold = driver.findElement(By.xpath("//*[@id=\"mceu_3\"]/button"));
		
//		bold.click();
//		bold.click();
		typeTo.sendKeys("Hello World!");
		driver.navigate().back();
		return this;
	}
	
	public String getString() {
		return driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText();
	}
}
