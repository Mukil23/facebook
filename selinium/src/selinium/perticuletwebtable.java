package selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class perticuletwebtable {
	
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mukil\\eclipse-workspace\\selinium\\src\\chromedriver.exe");
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));
		
		WebElement tbody = table.findElement(By.tagName("tbody"));
		
		List<WebElement> trows = tbody.findElements(By.tagName("tr"));
		
		for (WebElement trow : trows) {
			
			List<WebElement> tdata = trow.findElements(By.tagName("td"));
			
			WebElement x = tdata.get(3);
			
			String text = x.getText();
			
			System.out.println(text);
			
			
		}
		driver.quit();
	}

}
