package selinium;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FacebookLogIn  {
       
	  public static final String AUTOMATE_USERNAME = "mukilan3";
	  public static final String AUTOMATE_ACCESS_KEY = "iqygi7bTYC3iM1Ma6kxt";
	  public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
	public static void main(String[] args) throws IOException {
		 DesiredCapabilities caps = new DesiredCapabilities();
		    caps.setCapability("browserName", "Android");
		    caps.setCapability("device", "Samsung Galaxy J7 Prime");
		    caps.setCapability("realMobile", "true");
		    caps.setCapability("os_version", "8.1");
		    WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("zzzmukil@gmail.com");
		WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys("mukil123");
		WebElement login = driver.findElement(By.id("u_0_b"));
		login.click();
		driver.quit();
	}

}
