package selinium;

import org.openqa.selenium.By;

public class fullMain extends base {

	public static void main(String[] args) throws InterruptedException {
		
		initializeBrowser("chrome");
		launchApp("http://automationpractice.com/index.php");
		clickButton(driver.findElement(By.xpath("//a[@title='Log in to your customer account']")));
		scrollByValue("down");
		entryText(driver.findElement(By.id("email")),"zzzmukil@gmail.com");
		entryText(driver.findElement(By.id("passwd")),"mukil23");
		clickButton(driver.findElement(By.id("SubmitLogin")));
		Thread.sleep(2000);
		entryText(driver.findElement(By.id("search_query_top")),"dress");
		clickButton(driver.findElement(By.name("submit_search")));
		Thread.sleep(2000);
		scrollByValue("down");    
		clickButton(driver.findElement(By.xpath("(//a[@title='Add to cart'])[1]")));
	}

}
