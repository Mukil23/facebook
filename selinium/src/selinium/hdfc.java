package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hdfc {
	
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mukil\\eclipse-workspace\\selinium\\src\\chromedriver.exe");
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		WebElement frame1 = driver.findElement(By.name("login_page"));
		
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mukil@gmail.com");;
		
	}

}
