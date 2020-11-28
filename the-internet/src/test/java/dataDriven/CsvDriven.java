package dataDriven;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.groovy.parser.antlr4.util.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.mysql.cj.jdbc.Driver;

public class CsvDriven {

	public static void main(String[] args) throws IOException {

		String filePath = "/Users/joe/Desktop/homeworkCsV.csv";
		readCsvUsingBufferReader(filePath);

	}

	private static void readCsvUsingBufferReader(String filePath) {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/joe/git/chromedriver");

		
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();

		String line = "";

		try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath));

			line = reader.readLine();

			while ((line = reader.readLine()) != null) {
				String[] userData = line.split(",");

				Pojo user = new Pojo(userData[0], userData[1], userData[2], userData[3],
						userData[4], userData[5], userData[6], userData[7], userData[8], userData[9], userData[10]);
				String pojo = new Gson().toJson(user);
				
				
				System.out.println(user.getSubject());

				//Targeting elements
				
				WebElement firstName = driver.findElement(By.id("firstName"));
				WebElement lastName = driver.findElement(By.id("lastName"));
				WebElement email = driver.findElement(By.id("userEmail"));
//				
				String genderId = null;
				
				switch(user.getGender()) {
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
				WebElement gender = driver.findElement(By.id(genderId));
				WebElement mobile = driver.findElement(By.id("userNumber"));
				((JavascriptExecutor)driver).executeScript ("document.getElementById('dateOfBirthInput').removeAttribute('readonly',0);");
				WebElement birthDate = driver.findElement(By.id("dateOfBirthInput"));
				birthDate.clear();
//				WebElement subject = driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[2]"));
//				
				String hobbyId = null;
				
				switch(user.getHobby()) {
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
				
				WebElement hobby = driver.findElement(By.id(hobbyId));
				WebElement currentAddress = driver.findElement(By.id("currentAddress"));
				WebElement state = driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]"));
//				WebElement city = driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[1]/div[1]"));
//				
//				
				//actions on elements
				
				firstName.sendKeys(user.getFirst_name());
				lastName.sendKeys(user.getLast_name());
				email.sendKeys(user.getEmail());
				((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", gender);
				mobile.sendKeys(user.getContact().toString());
				birthDate.clear();
				birthDate.sendKeys(user.getBirthDate());
				birthDate.sendKeys(Keys.ENTER);
				
//				subject= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("subjectsContainer")));
//				subject.sendKeys(user.getSubject());
//				subject.sendKeys(Keys.ENTER);
				((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", hobby);
				currentAddress.sendKeys(user.getAddress());
//				state.sendKeys(user.getState());
//				city.sendKeys(user.getCity());
				
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
			
			driver.close();

		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		
	}

}
