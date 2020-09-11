package selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {
	
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mukil\\eclipse-workspace\\selinium\\src\\chromedriver.exe");
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));
		
		WebElement thead = table.findElement(By.tagName("thead"));
		
		WebElement tr = thead.findElement(By.tagName("tr"));
		
		List<WebElement> th = tr.findElements(By.tagName("th"));
		
		for (WebElement x : th) {
			
			String text = x.getText();
			
			System.out.print(text+"\t");
			
		}
		
		System.out.println();
		
		WebElement tbody = table.findElement(By.tagName("tbody"));
		
		List<WebElement> trow = tbody.findElements(By.tagName("tr"));
		
		for (WebElement trows : trow) {
			
			List<WebElement> tdata = trows.findElements(By.tagName("td"));
			
			for (WebElement y : tdata) {
				
				String text = y.getText();
				
				System.out.print(text+"\t");
				
			}
			System.out.println();
		}
		
			driver.quit();
		}
	}


