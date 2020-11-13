package theInternet.pages;

public class SetDriver {
	
	public SetDriver(String string) {
		// TODO Auto-generated constructor stub
	}

	public String[] getOption(String browser) {
		String[] param = null;
		
		if(browser == "Chrome") {
			param = new String[] {"webdriver.chrome.driver","/Users/joe/git/chromedriver"};
		}
		
		return param;
	}
}
