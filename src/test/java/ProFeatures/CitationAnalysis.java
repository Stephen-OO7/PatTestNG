package ProFeatures;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Login.BaseTest;

public class CitationAnalysis extends BaseTest {
	
	@Test
	public void CommonMthd() throws Exception
	{
		GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor)GetDriver();
		WebElement commonProj = GetDriver().findElement(By.xpath("//span[@class='patseer_Secondary_Button ng-binding'][contains(text(),'Automation_Project')]"));
		js.executeScript("arguments[0].click();", commonProj);
		
		Thread.sleep(2000);
				
		//select sorting as most cited
		WebDriverWait wait1 = new WebDriverWait(GetDriver(),60);
		WebElement Dropdown = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[6]//div[1]")));
		Dropdown.click();
				
		WebElement SelectMostCited=GetDriver().findElement(By.xpath("//a[contains(text(),'Most Cited')]"));
		SelectMostCited.click();
				
		Thread.sleep(1000);
			
		//select current record tab
		WebDriverWait wait4= new WebDriverWait(GetDriver(),60);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'selector')]"))).click();
		  
		WebElement selectCurrentRecords= GetDriver().findElement(By.xpath("//span[contains(@class,'selector')]//div[2]//span[1]"));
		selectCurrentRecords.click();
		  		
		Thread.sleep(500);
		
		//Select citation analysis
		WebElement ele = GetDriver().findElement(By.xpath("//*[@id='headerCntrl_patseerLogoCntrl_liProjectName']"));
	    Actions action = new Actions(GetDriver());
	    action.moveToElement(ele).build().perform();
	      
		WebElement SelectCooccurence=GetDriver().findElement(By.xpath("//*[@id='headerCntrl_patseerLogoCntrl_lnkCitnAnlis']"));
		SelectCooccurence.click();
	}
	
	@Test
	public void Node() throws Exception
	{
		CommonMthd();
		
	    // considering that there is only one tab opened in that point.
	    String oldTab = GetDriver().getWindowHandle();
	    
	    Thread.sleep(2000);
			    
		ArrayList<String> newTab = new ArrayList<String>(GetDriver().getWindowHandles());
	    newTab.remove(oldTab);
	    
	    // change focus to new tab
	    GetDriver().switchTo().window(newTab.get(0));
	    System.out.println("change focus to new tab");

	    Thread.sleep(500);
	  
//	    WebElement Mode = GetDriver().findElement(By.xpath("//*[@id='treeCntnrHdng']/div/div[2]/button"));
//	    Actions action = new Actions(GetDriver());
//	    action.moveToElement(Mode).build().perform();
//	    System.out.println("mouse over on select");
	    
	    JavascriptExecutor js = (JavascriptExecutor)GetDriver();
		WebElement NetworkMode = GetDriver().findElement(By.xpath("//*[@id='treeCntnrHdng']/div/div[2]/button"));
		js.executeScript("arguments[0].click();", NetworkMode);	  
		System.out.println("clicked on network mode");
		
		//iframe
		WebElement iframeElement = GetDriver().findElement(By.id("categoryHierarchybdy8ZCwm-canvas"));
		GetDriver().switchTo().frame(iframeElement);
		
		WebElement Select = GetDriver().findElement(By.xpath("//a[@id='selectedOption']"));	
		js.executeScript("arguments[0].click();", Select);	 
		System.out.println("clicked on Select");
		
		WebElement SelectInv=GetDriver().findElement(By.xpath("//*[@id='ntopINVS']"));
		js.executeScript("arguments[0].click();", SelectInv);	
		System.out.println("clicked on SelectInv");
	}
}