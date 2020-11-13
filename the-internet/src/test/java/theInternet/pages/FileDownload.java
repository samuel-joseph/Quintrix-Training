package theInternet.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import theInternet.framework.PageObjectBase;

public class FileDownload extends PageObjectBase{
	
	public FileDownload(WebDriver driver, String url) {
		super(driver, url);
	}
	
	public FileDownload navigate() {
		super.navigate("/download");
		return this;
	}
	
	public String mapClick() {
		List<WebElement> aTag = driver.findElements(By.cssSelector("#content > div > a"));
		for(WebElement a:aTag) {
//			a.click();
			System.out.print(a.getText());
		}
		return driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText();
	}
}
