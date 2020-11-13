package theInternet.pages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import theInternet.framework.PageObjectBase;

public class FileUploaderPage extends PageObjectBase{
	
	public FileUploaderPage(WebDriver driver, String url) {
		super(driver, url);
	}
	
	public FileUploaderPage navigate() {
		super.navigate("upload");
		return this;
	}
	
	public FileUploaderPage chooseFile() {
		WebElement upload = driver.findElement(By.id("file-upload"));
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"file-submit\"]"));
		
		upload.sendKeys("/Users/joe/Desktop/pika.png");
		submit.click();
		
		driver.navigate().back();
		return this;
	}
	
	public FileUploaderPage dragFile() {
		WebElement dragNdrop = driver.findElement(By.id("drag-drop-upload"));
		return this;

	}
	
	public String getString() {
		return driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/h3")).getText();
	}

	
	

}
