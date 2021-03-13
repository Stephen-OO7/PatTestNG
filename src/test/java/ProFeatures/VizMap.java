package ProFeatures;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Login.BaseTest;

public class VizMap extends BaseTest
{
	
	@Test
	  public void CommonProjectVZ() throws Exception 
	  {
		  GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

			JavascriptExecutor js = (JavascriptExecutor)GetDriver();
			WebElement commonProj = GetDriver().findElement(By.xpath("//span[@class='patseer_Secondary_Button ng-binding'][contains(text(),'Automation_Project')]"));
			js.executeScript("arguments[0].click();", commonProj);
			
			Thread.sleep(2000);
			
			WebElement ele = GetDriver().findElement(By.xpath("//*[@id='headerCntrl_patseerLogoCntrl_liProjectName']"));
		    Actions action = new Actions(GetDriver());
		    action.moveToElement(ele).build().perform();
		      
			WebElement SelectVizmap=GetDriver().findElement(By.xpath("//*[@id='headerCntrl_patseerLogoCntrl_liVizMAP']/a"));
			SelectVizmap.click();
	  }
	
	@Test
	public void SelectNetworkMode() throws AWTException, Exception
	{
		GetDriver().get("https://app.patseer.com/Home");

	    // considering that there is only one tab opened in that point.
	    String oldTab = GetDriver().getWindowHandle();
	    
	    Thread.sleep(2000);
		
		CommonProjectVZ();
	    
		Thread.sleep(1000);
		
		ArrayList<String> newTab = new ArrayList<String>(GetDriver().getWindowHandles());
	    newTab.remove(oldTab);
	    // change focus to new tab
	    GetDriver().switchTo().window(newTab.get(0));
	    System.out.println("tab 0");

	    Thread.sleep(500);
	  
	    WebElement Mode = GetDriver().findElement(By.xpath("//a[@id='currentMode']"));
	    Actions action = new Actions(GetDriver());
	    action.moveToElement(Mode).build().perform();
	    System.out.println("mouse over on select");
	    
	    JavascriptExecutor js = (JavascriptExecutor)GetDriver();
		WebElement NetworkMode = GetDriver().findElement(By.id("currentMode"));
		js.executeScript("arguments[0].click();", NetworkMode);	  
		System.out.println("clicked on network mode");
		
		WebElement Select = GetDriver().findElement(By.xpath("//a[@id='selectedOption']"));	
		js.executeScript("arguments[0].click();", Select);	 
		System.out.println("clicked on Select");
		
		WebElement SelectInv=GetDriver().findElement(By.xpath("//*[@id='ntopINVS']"));
		js.executeScript("arguments[0].click();", SelectInv);	
		System.out.println("clicked on SelectInv");
		
		Thread.sleep(5000);
		
		GetDriver().findElement(By.id("mycanvas")).click();

		
	    GetDriver().close();
	    // change focus back to old tab
	    GetDriver().switchTo().window(oldTab);
	    System.out.println("tab 1"); 

	} 
}
