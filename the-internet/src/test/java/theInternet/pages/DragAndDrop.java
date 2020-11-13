package Automation;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop extends PageObjectBase {

	public DragAndDrop(WebDriver driver, String url) {
		super(driver, url);
	}

	public DragAndDrop navigate() {
		super.navigate("drag_and_drop");
		return this;
	}

	public DragAndDrop select() {
		WebElement boxA = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]"));
		WebElement boxB = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]"));

		Actions actions = new Actions(driver);
		int xAxis = (int) (10.0 * Math.random());
		int yAxis = (int) (10.0 * Math.random());


//		actions.dragAndDropBy(boxB, xAxis, yAxis).build().perform();
//		actions.dragAndDropBy(boxA, xAxis, yAxis).build().perform();
		
//		actions.dragAndDrop(boxA, boxB).perform();
//		actions.dragAndDrop(boxB, boxA).perform();
		
		actions.clickAndHold().moveToElement(boxA).release(boxB).build().perform();

		return this;
	}

	public String getOption() {
		return driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText();
	}
}
