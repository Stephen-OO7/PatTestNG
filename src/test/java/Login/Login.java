package Login;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;

public class Login extends BaseTest{
	
	
	public WebDriver driver;
	
  @Test
  public void login() throws InterruptedException 
  {
	  driver= GetDriver();
	  logoutSession();		  

	  //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//      //online
     driver.get("https://acc.patseer.com/p/login");
     	  
      driver.manage().window().maximize();
	  driver.findElement(By.id("LoginForm:loginName")).clear();
	  driver.findElement(By.id("LoginForm:loginName")).sendKeys("pallavi@patseer.com");
	  driver.findElement(By.id("LoginForm:password")).sendKeys("771baner");
	  driver.findElement(By.id("LoginForm:submitButton")).click();
	  
      Thread.sleep(1500);
	  if(driver.getCurrentUrl().contains("https://acc.patseer.com/p/login"))
	  {
		  System.out.println(driver.getCurrentUrl());
		  System.out.println("Session was not cleared. Clicking on login button again."); 
		  WebElement loginButton = driver.findElement(By.id("LoginForm:submitButton"));
	  	if(loginButton != null)
	  	{
		  loginButton.click();
	  	}
	  }
	  
	 
      
    //de
//      driver.get("https://acc.patseer.de/p/login");
//     	  
//      driver.manage().window().maximize();
//	  driver.findElement(By.id("LoginForm:loginName")).clear();
//	  driver.findElement(By.id("LoginForm:loginName")).sendKeys("pallavipro@patseer.com");
//	  driver.findElement(By.id("LoginForm:password")).sendKeys("771baner");
//	  driver.findElement(By.id("LoginForm:submitButton")).click();
//	  
//      Thread.sleep(1500);
//      
//	  if(driver.getCurrentUrl().contains("https://acc.patseer.de/p/login"))
//	  {
//		  System.out.println(driver.getCurrentUrl());
//		  System.out.println("Session was not cleared. Clicking on login button again."); 
//		  WebElement loginButton = driver.findElement(By.id("LoginForm:submitButton"));
//	  	if(loginButton != null)
//	  	{
//		  loginButton.click();
//	  	}
//	  }
/*	 
	//test link
     driver.get("https://acc.patseer.com/p/login");
     	  
      driver.manage().window().maximize();
	  driver.findElement(By.id("LoginForm:loginName")).clear();
	  driver.findElement(By.id("LoginForm:loginName")).sendKeys("pallavi2@patseer.com");
	  driver.findElement(By.id("LoginForm:password")).sendKeys("771baner");
	  driver.findElement(By.id("LoginForm:submitButton")).click();
	  
      Thread.sleep(1500);
  if(driver.getCurrentUrl().contains("https://acc.patseer.com/p/login"))
	  {
		  System.out.println(driver.getCurrentUrl());
		  System.out.println("Session was not cleared. Clicking on login button again."); 
	  WebElement loginButton = driver.findElement(By.id("LoginForm:submitButton"));
  	if(loginButton != null)
	  	{
		  loginButton.click();
	  	}
	  }
	  
  	ChromeOptions capability = new ChromeOptions();
  	capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
  	capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);

	  //	WebDriver driver = new ChromeDriver(capability);
	  }*/
	  
	  //13
//      driver.get("https://192.168.1.13/p/login");
//      
//	  driver.manage().window().maximize();
//	  Thread.sleep(1000);
//	  
//	  driver.findElement(By.id("LoginForm:loginName")).clear();
//	  driver.findElement(By.id("LoginForm:loginName")).sendKeys("pallavi@patseerpro.com");
//	  driver.findElement(By.id("LoginForm:password")).sendKeys("771baner");
//	  driver.findElement(By.id("LoginForm:submitButton")).click();	 
//	  Thread.sleep(1500);
//	  if(driver.getCurrentUrl().contains("https://192.168.1.13/p/login"))
//	  {
//		  System.out.println(driver.getCurrentUrl());
//		  System.out.println("Session was not cleared. Clicking on login button again."); 
//		  WebElement loginButton = driver.findElement(By.id("LoginForm:submitButton"));
//	  	if(loginButton != null)
//	  	{
//		  loginButton.click();
//	  	}
//	
//	  }	  
// }
  }
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  
  }

  @AfterMethod
  public void afterMethod() 
  {
//	  driver.quit();
  }

}
