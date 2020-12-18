package pages;

import org.openqa.selenium.JavascriptExecutor;

public class InfinityScrollPage extends BasePageCucumber{
	
	public InfinityScrollPage(){
	}
	
	public void navigate(String url) {
		super.navigateTo(url);
	}
	
	public void scroll(Integer scrollTotal) {
		for(Integer i = 0; i<=scrollTotal; i++) {
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		}
	}
	
	public String getString(String xpath) {
		String actual = super.getText(xpath);
		super.close();
		return actual;
	}

}
