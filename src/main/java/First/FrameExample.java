package First;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

public class FrameExample {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\raghu.a\\Downloads\\Selenium\\geckodriver.exe");
	     WebDriver driver = new FirefoxDriver();
	     
	     driver.get("file:///C:/Users/raghu.a/Downloads/fExample1.html");
	     
	     //By executing a java script
	     JavascriptExecutor exe = (JavascriptExecutor) driver;
	     Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
	     System.out.println("Number of iframes on the page are " + numberOfFrames);
	     
	     //By finding all the web elements using iframe tag
	     List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
	     System.out.println("The total number of iframes are " + iframeElements.size());
	     
	   //Switch by Index
	     driver.switchTo().frame(0);
	  // Print the frame source code
	     System.out.println("Frame Source" +driver.getPageSource());
	     
	     driver.switchTo().defaultContent();
	     
	     //switch by Name
	     driver.switchTo().frame("iframe2");
	     // Print the frame source code
	     System.out.println("Frame Source" +driver.getPageSource());
	     
	     driver.switchTo().defaultContent();
	     //swith by ID
	     driver.switchTo().frame("IF1");
	     System.out.println("Frame Source" +driver.getPageSource());
	     
	     //switch back to main window
	     driver.switchTo().defaultContent();
	     driver.close();
	}
	
	
}
