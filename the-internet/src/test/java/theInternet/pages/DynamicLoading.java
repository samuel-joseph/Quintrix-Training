package theInternet.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoading extends PageObjectBase{
	
	public DynamicLoading(WebDriver driver, String url) {
		super(driver, url);
	}
	
	
	public DynamicLoading navigate() {
		super.navigate("dynamic_loading");
		return this;
	}
	
	public DynamicLoading select() {
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"start\"]/button")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().back();

		driver.findElement(By.xpath("//*[@id=\"content\"]/div/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"start\"]/button")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return this;
	}
	
	public String getOption() {
		return driver.findElement(By.xpath("//*[@id=\"finish\"]/h4")).getText();
	}

}
