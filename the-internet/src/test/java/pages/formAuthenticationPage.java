package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class formAuthenticationPage extends BasePageCucumber{
	
	public formAuthenticationPage() {
	}
	
	public void navigate(String url) {
		super.navigateTo(url);
	}
	
	public void typeInput(String id, String string) {
		WebElement element = driver.findElement(By.id(id));
		element.sendKeys(string);
	}
	
	public void submit(String xpath) {
		super.clickButton(xpath);
	}
	
	public String getString(String xpath) {
		return super.getText(xpath);
	}
	
}
