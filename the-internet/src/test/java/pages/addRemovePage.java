package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class addRemovePage extends BasePageCucumber {

	public addRemovePage() {
	}

	public void addButton(Integer addButton) {
		for (Integer i = 0; i <= addButton; i++) {
			driver.findElement(By.cssSelector("div.example button")).click();
		}
	}

	public Integer deleteButton(Integer delete) {
		for (Integer i = 0; i <= delete; i++) {
			driver.findElement(By.cssSelector("div#elements button.added-manually")).click();
		}
		WebElement div = driver.findElement(By.id("elements"));
		List<WebElement> button = div.findElements(By.tagName("button"));
		
		return button.size();
	}

	public void navigate(String url) {
		super.navigateTo(url);
	}
	
	public void close() {
		super.close();
	}



}
