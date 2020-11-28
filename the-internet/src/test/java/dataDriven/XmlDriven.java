package dataDriven;

import java.io.File;
//import java.io.StringReader;
import java.util.concurrent.TimeUnit;

//import javax.xml.bind.JAXBContext;
//import javax.xml.bind.JAXBException;
//import javax.xml.bind.Marshaller;
//import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class XmlDriven {
	
//	public static void main(String[] args) {
//		System.err.close();
//	    System.setErr(System.out);
//		File file = new File("/Users/joe/git/Quintrix-Training/the-internet/src/test/resources/students.xml");
//		
//		try { 
//			JAXBContext jaxbContext = JAXBContext.newInstance(Students.class);
//			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
//			Students student = (Students) jaxbUnmarshaller.unmarshal(file);
//			
//			System.out.println(student.toString());
//			
//			
//		} catch (JAXBException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/joe/git/chromedriver");

		
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		
		try {
			
			File file = new File("/Users/joe/git/Quintrix-Training/the-internet/src/test/resources/students.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(file);
			
			doc.getDocumentElement().normalize();
			
			
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			
			NodeList nList = doc.getElementsByTagName("student");
			
			for(Integer i = 0; i<nList.getLength();i++) {
				Node nNode = nList.item(i);
				System.out.println("\nCurrent Element :" + nNode.getNodeName());
				
				 if (nNode.getNodeType() == Node.ELEMENT_NODE) {

			            Element eElement = (Element) nNode;

			            System.out.println("First Name : " + eElement.getElementsByTagName("first_name").item(0).getTextContent());
			            System.out.println("Last Name : " + eElement.getElementsByTagName("last_name").item(0).getTextContent());
			            System.out.println("Gender : " + eElement.getElementsByTagName("gender").item(0).getTextContent());
			            System.out.println("Birthday : " + eElement.getElementsByTagName("birthDate").item(0).getTextContent());
			            System.out.println("Subject : " + eElement.getElementsByTagName("subject").item(0).getTextContent());
			            System.out.println("Contact : " + eElement.getElementsByTagName("contact").item(0).getTextContent());
			            System.out.println("Address : " + eElement.getElementsByTagName("address").item(0).getTextContent());
			            
			            
						WebElement firstName = driver.findElement(By.id("firstName"));
						WebElement lastName = driver.findElement(By.id("lastName"));
						WebElement email = driver.findElement(By.id("userEmail"));
//						
						String genderId = null;
						
						switch(eElement.getElementsByTagName("gender").item(0).getTextContent()) {
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
//						WebElement subject = driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[2]"));
//						
						String hobbyId = null;
						
						switch(eElement.getElementsByTagName("hobby").item(0).getTextContent()) {
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
//						WebElement city = driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[1]/div[1]"));
//						
//						
						//actions on elements
						
						firstName.sendKeys(eElement.getElementsByTagName("first_name").item(0).getTextContent());
						lastName.sendKeys(eElement.getElementsByTagName("last_name").item(0).getTextContent());
						email.sendKeys(eElement.getElementsByTagName("email").item(0).getTextContent());
						((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", gender);
						mobile.sendKeys(eElement.getElementsByTagName("contact").item(0).getTextContent());
						birthDate.clear();
						birthDate.sendKeys(eElement.getElementsByTagName("birthDate").item(0).getTextContent());
						birthDate.sendKeys(Keys.ENTER);
						
//						subject= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("subjectsContainer")));
//						subject.sendKeys(user.getSubject());
//						subject.sendKeys(Keys.ENTER);
						((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", hobby);
						currentAddress.sendKeys(eElement.getElementsByTagName("address").item(0).getTextContent());
//						state.sendKeys(user.getState());
//						city.sendKeys(user.getCity());
						
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
			
			
			driver.close();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
