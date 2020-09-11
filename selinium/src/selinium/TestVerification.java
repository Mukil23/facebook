package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestVerification extends base {
	
	public static void main(String[] args) {
		
			initializeBrowser("chrome");
			launchApp("https://www.opencart.com/index.php?route=marketplace/extension/info&extension_id=37117&filter_license=0&filter_download_id=43");
		    clickButton(driver.findElement(By.xpath("(//a[text()='Demo'])[1]")));
		    clickButton(driver.findElement(By.xpath("(//a[@target='_blank'])[1]")));
		    windowHandling(2);
		    clickButton(driver.findElement(By.xpath("//a[@title='My Account']")));
		    clickButton(driver.findElement(By.xpath("//a[text()='Login']")));
		    entryText(driver.findElement(By.name("email")), "zzzmukil@gmail.com");
		    entryText(driver.findElement(By.name("password")), "ponmukilan23");
		    clickButton(driver.findElement(By.xpath("//input[@type='submit']")));
		    mouseClick(driver.findElement(By.xpath("//a[text()='Desktops']")));
		    mouseClick(driver.findElement(By.xpath(" //a[text()='Mac (1)']")));
		    clickButton(driver.findElement(By.xpath("(//button[@type='button'])[9]")));
		    clickButton(driver.findElement(By.id("cart")));
	}

}
