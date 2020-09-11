package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript {

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\mukil\\eclipse-workspace\\selinium\\src\\chromedriver.exe");
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement user = driver.findElement(By.id("email"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('value','zzzmukil@gmail.com')", user);
		
		WebElement password = driver.findElement(By.id("pass"));
		
		js.executeScript("arguments[0].setAttribute('value','Mukil23')", password);
		
		WebElement login = driver.findElement(By.xpath("//input[@value='Log In']"));
		
		js.executeScript("arguments [0].click", login);
		
		Thread.sleep(3000);
		 
		driver.quit();
		
	}

}
