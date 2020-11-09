package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChallengingDom extends PageObjectBase{
	
	public ChallengingDom(WebDriver driver, String url) {
		super(driver,url);
	}
	
	public ChallengingDom navigate() {
		super.navigate("challenging_dom");
		return this;
	}
	
	public ChallengingDom select() {
		loop("/html/body/div[2]/div/div/div/div/div[1]/a[1]");
		loop("/html/body/div[2]/div/div/div/div/div[1]/a[2]");
		loop("/html/body/div[2]/div/div/div/div/div[1]/a[3]");
		return this;
	}
	
	public String getOption() {
		return driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText();
	}
	
	public void loop(String id) {
		for(int i =0;i<=3;i++) {
			driver.findElement(By.xpath(id)).click();
		}
	}
	
}
