package selinium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handling {

	public static void main(String[] args) throws AWTException, InterruptedException {

		 System.setProperty("webdriver.chrome.driver","C:\\Users\\mukil\\eclipse-workspace\\selinium\\src\\chromedriver.exe");
			
	        WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.google.com/");
			
			Robot rb=new Robot();
			
			Actions ac=new Actions(driver);
			
			WebElement gmail = driver.findElement(By.xpath("(//a[@class='gb_g'])[1]"));
			
			ac.contextClick(gmail).build().perform();
			
			Thread.sleep(2000);
			
			rb.keyPress(KeyEvent.VK_DOWN);
			rb.keyRelease(KeyEvent.VK_DOWN);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(2000);
			
			WebElement image = driver.findElement(By.xpath("(//a[@class='gb_g'])[2]"));
			
			ac.contextClick(image).build().perform();
			
			Thread.sleep(2000);
			
			rb.keyPress(KeyEvent.VK_DOWN);
			rb.keyRelease(KeyEvent.VK_DOWN);
			rb.keyPress(KeyEvent.VK_DOWN);
			rb.keyRelease(KeyEvent.VK_DOWN);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(2000);
			
			
			
			
	}

}
