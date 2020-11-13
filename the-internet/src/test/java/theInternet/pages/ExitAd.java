package theInternet.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ExitAd extends PageObjectBase {

	public ExitAd(WebDriver driver, String url) {
		super(driver, url);
	}
	
	public ExitAd navigate() {
		super.navigate("exit_intent");
		return this;
	}
	
	public ExitAd select() throws InterruptedException, AWTException {
//		Actions action = new Actions(driver);
//		action.moveByOffset(0, 10000).perform();
		driver.navigate().refresh();
		driver.manage().window().maximize();
		Robot robot = new Robot();
		robot.mouseMove(700, 0);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"ouibounce-modal\"]/div[2]/div[3]/p")).click();
		return this;
	}
	
	public String getOption() {
		return driver.findElement(By.xpath("//*[@id=\"ouibounce-modal\"]/div[2]/div[1]/h3")).getText();
	}
}
