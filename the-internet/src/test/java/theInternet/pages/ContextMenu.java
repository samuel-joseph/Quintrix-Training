package theInternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import theInternet.framework.PageObjectBase;

public class ContextMenu extends PageObjectBase{
	
	public ContextMenu(WebDriver driver, String url) {
		super(driver,url);
	}
	
	public ContextMenu navigate() {
		super.navigate("/context_menu");
		return this;
	}
	
	public ContextMenu select() {
		WebElement contextMenu = driver.findElement(By.id("hot-spot"));
		Actions actions = new Actions(driver);
		actions.contextClick(contextMenu).perform();
		driver.switchTo().alert().accept();
		return this;
	}
	
	public String getOption() {
		return driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText();
	}

}
