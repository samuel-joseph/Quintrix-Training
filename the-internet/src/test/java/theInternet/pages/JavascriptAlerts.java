package theInternet.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptAlerts extends PageObjectBase{
	
	public JavascriptAlerts(WebDriver driver, String url) {
		super(driver,url);
	}
	
	public JavascriptAlerts navigate() {
		super.navigate("javascript_alerts");
		return this;
	}
	
	public JavascriptAlerts clickJS() {
		
		for(int i =1; i<=3; i++) {
			String xpath = String.format("/html/body/div[2]/div/div/ul/li[%s]/button",i);
			WebElement li = driver.findElement(By.xpath(xpath));
			li.click();
			
//			String onclick = li.getAttribute("onclick");
//			if(onclick == "jsAlert()"||onclick == "jsConfirm()") {
				Alert alert = driver.switchTo().alert();
				if(i==3) {
					alert.sendKeys("Hello World");
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				}
				alert.accept();
//			}
//			if(onclick == "jsPrompt()") {
//				Alert alert = driver.switchTo().alert();
//				alert.sendKeys("Hello World");
//				alert.accept();
//			}
		}
		
		return this;
	}
	
	public String getString() {
		return driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
	}

}
