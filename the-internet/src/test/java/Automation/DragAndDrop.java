package Automation;

import java.awt.Desktop.Action;

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
		WebElement boxA = driver.findElement(By.id("column-a"));
		WebElement boxB = driver.findElement(By.id("column-b"));

		Actions actions = new Actions(driver);
		for (int i = 0; i <= 5; i++) {
			int xAxis = 135;
			int yAxis = 75;
			actions.dragAndDropBy(boxA, xAxis, yAxis).build().perform();
			actions.dragAndDropBy(boxB, xAxis, yAxis).build().perform();
		}
		return this;
	}

	public String getOption() {
		return driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText();
	}
}
