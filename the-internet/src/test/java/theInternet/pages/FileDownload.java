package theInternet.pages;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import theInternet.framework.PageObjectBase;

public class FileDownload extends PageObjectBase{
	
	public FileDownload(WebDriver driver, String url) {
		super(driver, url);
	}
	
	public FileDownload navigate() {
		super.navigate("/download");
		return this;
	}
	
	public String mapClick() {
		List<WebElement> aTag = driver.findElements(By.cssSelector("#content > div > a"));
		for(WebElement a:aTag) {
			a.click();
			System.out.print(a.getText());
			ListFiles(a.getText());
		}
		return driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText();
	}
	
	
	public static void ListFiles(String DirectoryName)
    {
        //project directory
        String workingDirectory = System.getProperty("user.dir");
        String  dir = workingDirectory + File.separator + DirectoryName;

        System.out.println("Final file directory : " + dir);

        //List files in the directory

        File file = new File(dir);
        File[] files=file.listFiles();

        if (file.exists()) {
            System.out.println("Directory is found!");
            for(File eachFile: files)
            {
                System.out.println(eachFile.getName());
            }
        } else {
            System.out.println("Directory is not exits");
        }

    }
}
