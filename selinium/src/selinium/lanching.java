package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lanching {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\mukil\\eclipse-workspace\\selinium\\src\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.name("email"));
		
		email.sendKeys("zzzmukil@gmail.com");
		
		WebElement pass = driver.findElement(By.name("pass"));
		
		pass.sendKeys("mukil2318");
		
		WebElement login = driver.findElement(By.xpath("//input[@value='Log In']"));
		
		login.click();
		
		Thread.sleep(2000);
		
		driver.quit();
	
}
}
