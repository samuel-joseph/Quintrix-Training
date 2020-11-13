package theInternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Hovers extends PageObjectBase {

	public Hovers(WebDriver driver, String url) {
		super(driver, url);
	}

	public Hovers navigate() {
		super.navigate("hovers");
		return this;
	}

	public Hovers hoverClick() {
		Actions actions = new Actions(driver);
		String string ="";
		String view = "";
		for (int i = 1; i <= 3; i++) {
			string = String.format("//*[@id=\"content\"]/div/div[%s]/img", i);
			view = String.format("//*[@id=\"content\"]/div/div[%s]/div/a", i);
			WebElement target = driver.findElement(By.xpath(string));
			actions.moveToElement(target).perform();
			WebElement profile = driver.findElement(By.xpath(view));
			System.out.print(i);
			profile.click();
			driver.navigate().back();
		}
		
		return this;
	}
	
	
	public String getString() {
		return driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText();
	}

}
