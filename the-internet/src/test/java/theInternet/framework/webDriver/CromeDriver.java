package theInternet.framework.webDriver;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CromeDriver {

	public WebDriver getPureChromeDriver() {
		
		URL url = ClassLoader.getSystemResource("chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", url.getFile());
		
		WebDriver chrome=new ChromeDriver();
		return chrome;
		
	}

}
