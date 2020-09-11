package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {
	
	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mukil\\eclipse-workspace\\selinium\\src\\chromedriver.exe");
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement right = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		WebElement t = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		
		Actions ac=new Actions(driver);
		
        ac.contextClick(right).build().perform();
		
		Thread.sleep(3000);
		
		ac.doubleClick(t).build().perform();
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
