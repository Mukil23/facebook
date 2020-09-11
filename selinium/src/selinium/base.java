package selinium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class base {
	
	public  static WebDriver driver;

	  public static void initializeBrowser(String browser) {
         try {
        	 
        	 if(browser.equalsIgnoreCase("chrome")) {
        	 System.setProperty("webdriver.chrome.driver","C:\\Users\\mukil\\eclipse-workspace\\selinium\\src\\chromedriver.exe");
 			
 	         driver=new ChromeDriver();
 			
 			driver.manage().window().maximize();  
        	 }else  if (browser.equalsIgnoreCase("IE")) {
        		 System.setProperty("webdriver.chrome.driver","C:\\Users\\mukil\\eclipse-workspace\\selinium\\src\\chromedriver.exe");
     			
     	         driver=new InternetExplorerDriver();
     			
     			driver.manage().window().maximize();
				
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
			
	  }
	  public static void launchApp(String url)   {
		  try {
			  
			  driver.get(url);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		  

	  }
	  
	  public static void entryText(WebElement element,String values) {
		  
		  try {
			  
			  element.sendKeys(values);
			  
		} catch (Exception e) {
			
			e.printStackTrace();

		}

	}
	  public static void clickButton(WebElement element) {
		  try {
			  element.click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	  }
	  public static void scrollHeight(String value) {
		  
		  try {
			  
			  JavascriptExecutor js=(JavascriptExecutor)driver;
			  
			  if (value.equalsIgnoreCase("down")) {
				  
				  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
				
			}else if (value.equalsIgnoreCase("up")) {
				
				js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
				
			}
			
		} catch (Exception e) {
              e.printStackTrace();
		}  
	  
	}
	  public static void scrollByValue(String value) {
		  try {
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  if (value.equalsIgnoreCase("down")) {
			  js.executeScript("window.scrollBy(0,300)");
			  } else if (value.equalsIgnoreCase("up")) {
			  js.executeScript("window.scrollBy(0,-300)");
			  }
			  } catch (Exception e) {
			  e.printStackTrace();
			  }
	  }
	  public static void mouseHover(WebElement element) {
		  try {
			  Actions ac =new Actions(driver);
			  ac.moveToElement(element).build().perform(); 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		  
	  }
	  public static void mouseClick(WebElement element) {
		  try {
		  Actions ac =new Actions(driver);
		  ac.click(element).build().perform();
		  }catch(Exception e) {
			  e.printStackTrace();
		  }
	  }
	  public static void screenShot(String name) {
		  try {
			  TakesScreenshot ts=(TakesScreenshot)driver;
			  File x = ts.getScreenshotAs(OutputType.FILE);
			  File x1 = new File("//"+name+".png");
			  FileUtils.copyFile(x, x1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	  }
	  public static void windowHandling(int i) {
		  try {
			  Set<String> win = driver.getWindowHandles();
			  List<String>li=new ArrayList<String>();
			  li.addAll(win);
			  driver.switchTo().window(li.get(i));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	  }
	  public static void windowTitle(String title) {
		  try {
			  Set<String> win = driver.getWindowHandles();
			  for (String x : win) {
				  String title2 = driver.switchTo().window(x).getTitle();
				if (title2.contains(title)) {
					driver.switchTo().window(x);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	  }
	  public String  getProperty(String key) throws Throwable {
		  
		  File f =new File("C:\\Users\\mukil\\eclipse-workspace\\selinium\\resorse\\config.property");
          FileInputStream f1=new FileInputStream(f);
          Properties p=new Properties();
          p.load(f1);
          String value = p.getProperty(key);
			return value;
		}
	  
	 public static void dropDown(WebElement element, int i) {
		 try {
			 Select s=new Select(element);
			 s.selectByIndex(i);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 		 
	 }
           
	}


