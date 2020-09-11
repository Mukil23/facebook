package selinium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webhandling {

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\mukil\\eclipse-workspace\\selinium\\src\\chromedriver.exe");
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		String frist = driver.getWindowHandle();
		
		System.out.println(frist);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile",Keys.ENTER);;
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]")).click();
		
		Set<String> second = driver.getWindowHandles();
		System.out.println(second);
		
		for ( String x : second) {
			
			
			driver.switchTo().window(x);
			
			String title = driver.getTitle();
			
			if(title.contains("Mi")) {
				
				driver.findElement(By.id("wishListMainButton-announce")).click();
			}else if(title.contains("Lava")) {
				
				driver.findElement(By.id("buybox-see-all-buying-choices-announce")).click();
			
		}
			
		}
		Thread.sleep(15000);
		driver.quit();
	}

}
