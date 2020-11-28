package dataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ParameterDriven {

	@DataProvider(name = "data-provider")
	public Object[][] dataProviderMetho() {
		Object[][] data = new Object[3][11];

		data[0][0] = "Tj";
		data[0][1] = "Hotdog";
		data[0][2] = "tj@gmail.com";
		data[0][3] = "Male";
		data[0][4] = "0987654321";
		data[0][5] = "07 April 2020";
		data[0][6] = "Science";
		data[0][7] = "Reading";
		data[0][8] = "Valencia";
		data[0][9] = "NCR";
		data[0][10] = "Delhi";

		data[1][0] = "Mark";
		data[1][1] = "Cuba";
		data[1][2] = "mc@gmail.com";
		data[1][3] = "Male";
		data[1][4] = "0987654321";
		data[1][5] = "07 April 2020";
		data[1][6] = "Math";
		data[1][7] = "Sports";
		data[1][8] = "Bukidnon";
		data[1][9] = "NCR";
		data[1][10] = "Delhi";

		data[2][0] = "Martha";
		data[2][1] = "Wayne";
		data[2][2] = "mw@gmail.com";
		data[2][3] = "Female";
		data[2][4] = "0987654321";
		data[2][5] = "10 May 2020";
		data[2][6] = "Math";
		data[2][7] = "Sports";
		data[2][8] = "Valencia";
		data[2][9] = "NCR";
		data[2][10] = "Delhi";

		return data;
	}

	@Test(dataProvider = "data-provider")
	public void testMethod(String first_name, String last_name, String email, String gender, String contact,
			String birthDate, String subject, String hobby, String address, String state, String city) {
		System.out.println(first_name);
		System.out.println(last_name);
		System.out.println(gender);
		System.out.println(email);

		System.setProperty("webdriver.chrome.driver", "/Users/joe/git/chromedriver");

		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 30);

		driver.navigate().to("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		WebElement lastName = driver.findElement(By.id("lastName"));
		WebElement wEmail = driver.findElement(By.id("userEmail"));
//		
		String genderId = null;
		
		switch(gender) {
		case "Male":
			genderId = "gender-radio-1";
			break;
		case "Female":
			genderId = "gender-radio-2";
			break;
		case "Other":
			genderId = "gender-radio3";
			break;
		}
		
		
//		
		WebElement wGender = driver.findElement(By.id(genderId));
		WebElement mobile = driver.findElement(By.id("userNumber"));
		((JavascriptExecutor)driver).executeScript ("document.getElementById('dateOfBirthInput').removeAttribute('readonly',0);");
		WebElement wBirthDate = driver.findElement(By.id("dateOfBirthInput"));
		wBirthDate.clear();
//		WebElement subject = driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[2]"));
//		
		String hobbyId = null;
		
		switch(hobby) {
		case "Sports":
			hobbyId = "hobbies-checkbox-1";
			break;
		case "Reading":
			hobbyId = "hobbies-checkbox-2";
			break;
		case "Music":
			hobbyId = "hobbies-checkbox-3";
			break;
		}
		
		WebElement wHobby = driver.findElement(By.id(hobbyId));
		WebElement currentAddress = driver.findElement(By.id("currentAddress"));
		WebElement wState = driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]"));
//		WebElement city = driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[1]/div[1]"));
//		
//		
		//actions on elements
		
		firstName.sendKeys(first_name);
		lastName.sendKeys(last_name);
		wEmail.sendKeys(email);
		((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", wGender);
		mobile.sendKeys(contact);
		wBirthDate.clear();
		wBirthDate.sendKeys(birthDate);
		wBirthDate.sendKeys(Keys.ENTER);
		
//		subject= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("subjectsContainer")));
//		subject.sendKeys(user.getSubject());
//		subject.sendKeys(Keys.ENTER);
		((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", hobby);
		currentAddress.sendKeys(address);
//		state.sendKeys(user.getState());
//		city.sendKeys(user.getCity());
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"submit\"]")));
		WebElement button = driver.findElement(By.id("submit"));
		
		
		button.click();
		
		WebElement close = driver.findElement(By.id("closeLargeModal"));
		jse.executeScript("window.scrollBy(0,250)");
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS) ;
		close.click();
	}
}
