//package theInternet.framework.webDriver;
//
//public final class WebDriverManagerFactory {
//
//	public static WebDriverManager getManager(String browserType) {
//
//		if(browserType.equals(BrowserTypes.Chrome)) {
//			return new ChromeDriverManager();		
//		}
//		
//		if(browserType.equals(BrowserTypes.Firefox)) {
//			return new FirefoxDriverManager();
//		}
//
//		if(browserType.equals(BrowserTypes.Edge)) {
//			return new EdgeDriverManager();		
//		}
//
//		throw new RuntimeException(browserType + " is not a supported browser.");
//	}
//}