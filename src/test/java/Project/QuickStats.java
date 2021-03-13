package Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Login.BaseTest;

public class QuickStats extends BaseTest 
{
	
	@Test
	public void CommonProjectQS() throws Exception
	{
		  GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

			JavascriptExecutor js = (JavascriptExecutor)GetDriver();
			WebElement commonProj = GetDriver().findElement(By.xpath("//span[@class='patseer_Secondary_Button ng-binding'][contains(text(),'Automation_Project')]"));
			js.executeScript("arguments[0].click();", commonProj);
			
			Thread.sleep(2000);	  
		  
	}
	
	@Test
	public void DateChart() throws Exception
	{
		Thread.sleep(1000);

		CommonProjectQS();
		  
		Thread.sleep(1000);
		
		//quickstats
		
		WebElement ClickonQuickStats = GetDriver().findElement(By.xpath("//a[contains(text(),'Quick Stats')]"));
		JavascriptExecutor executor = (JavascriptExecutor)GetDriver();
		executor.executeScript("arguments[0].click();", ClickonQuickStats);
		System.out.println("clicked on Quick stats");
		
		Thread.sleep(1000);
		
		//iframe
		WebElement iframeElement = GetDriver().findElement(By.xpath("//iframe[@class='iframeClass dashboardFrame ng-scope']"));
		GetDriver().switchTo().frame(iframeElement);
			 
		Thread.sleep(1000);

		WebDriverWait wait2=new WebDriverWait(GetDriver(),60);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side-menu']/li[2]/a"))).click();
		  
		 System.out.println("Clicked on DATE type option");
		 
		 Thread.sleep(800);
		 
		 WebDriverWait wait3=new WebDriverWait(GetDriver(),60);
		 wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='side-menu']/li[2]/ul/li[2]/a"))).click();
		 
		 System.out.println("Clicked on application year chart");
		 
		 Thread.sleep(500);
		 
		 WebElement Validate=GetDriver().findElement(By.xpath("//*[@class='highcharts-root']"));
		 System.out.println(Validate.getText());
		 
		  Thread.sleep(1000);
		  
		  Publication_Year_Chart();
		  
		  GoToHomePage();
			  
	}
	
	
	@Test
	public void Publication_Year_Chart() throws Exception
	{
		Thread.sleep(1000);
		
		CommonProjectQS();
		
		Thread.sleep(2000);
		
		//quickstats
		
		WebElement ClickonQuickStats = GetDriver().findElement(By.xpath("//a[contains(text(),'Quick Stats')]"));
		JavascriptExecutor executor = (JavascriptExecutor)GetDriver();
		executor.executeScript("arguments[0].click();", ClickonQuickStats);
		System.out.println("clicked on Quick stats");
		
		Thread.sleep(1000);
		
		//iframe
		WebElement iframeElement = GetDriver().findElement(By.xpath("//iframe[@class='iframeClass dashboardFrame ng-scope']"));
		GetDriver().switchTo().frame(iframeElement);
	 
		  Thread.sleep(1000);
		 
		 WebDriverWait wait3=new WebDriverWait(GetDriver(),60);
		 wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side-menu']/li[2]/ul/li[3]/a"))).click();
		 
		 System.out.println("Clicked on Publication Year Chart");
		 
		 Thread.sleep(1000);
		 
		 WebElement Validate=GetDriver().findElement(By.xpath("//div[contains(@class,'highcharts-container')]"));
		 System.out.println(Validate.getText());
		 
		 Thread.sleep(1000);
	
		  GoToHomePage();
			  			
	}
	
	
	@Test
	public void AssigneeOriginal() throws Exception
	{
		Thread.sleep(1000);
		
		CommonProjectQS();
		
		Thread.sleep(2000);
		
		//quickstats
		
		WebElement ClickonQuickStats = GetDriver().findElement(By.xpath("//a[contains(text(),'Quick Stats')]"));
		JavascriptExecutor executor = (JavascriptExecutor)GetDriver();
		executor.executeScript("arguments[0].click();", ClickonQuickStats);
		System.out.println("clicked on Quick stats");
		
		Thread.sleep(1000);
		
		//iframe
		WebElement iframeElement = GetDriver().findElement(By.xpath("//iframe[@class='iframeClass dashboardFrame ng-scope']"));
		GetDriver().switchTo().frame(iframeElement);
	 
		  Thread.sleep(1000);
		  WebDriverWait wait2=new WebDriverWait(GetDriver(),60);
		  wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side-menu']/li[1]/a"))).click();
		  
		 System.out.println("Clicked on parties type option");
		 
		 Thread.sleep(1000);
		 
		 WebDriverWait wait3=new WebDriverWait(GetDriver(),60);
		 wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side-menu']/li[1]/ul/li[1]/a"))).click();
		 
		 System.out.println("Clicked on asn chart");
		 
		 Thread.sleep(1000);
		 
		 WebElement Validate=GetDriver().findElement(By.xpath("//div[contains(@class,'highcharts-container')]"));
		 System.out.println(Validate.getText());
		 
		 Thread.sleep(1000);
	
		  GoToHomePage();

			  		
	}
	
	@Test
	public void ClassificationChart() throws Exception
	{
		Thread.sleep(1000);
		
		CommonProjectQS();
		
		Thread.sleep(2000);
		
		//quickstats
		
		WebElement ClickonQuickStats = GetDriver().findElement(By.xpath("//a[contains(text(),'Quick Stats')]"));
		JavascriptExecutor executor = (JavascriptExecutor)GetDriver();
		executor.executeScript("arguments[0].click();", ClickonQuickStats);
		System.out.println("clicked on Quick stats");
		
		Thread.sleep(1000);
		
		//iframe
		WebElement iframeElement = GetDriver().findElement(By.xpath("//iframe[@class='iframeClass dashboardFrame ng-scope']"));
		GetDriver().switchTo().frame(iframeElement);
	 
		  Thread.sleep(1000);
		  
		  GetDriver().findElement(By.xpath("//*[@id='side-menu']/li[2]/a")).click();
		  
		  Thread.sleep(800);
		  
		  GetDriver().findElement(By.xpath("//*[@id='side-menu']/li[3]/a")).click();
		  
		 System.out.println("Clicked on Classification type option");
		 
		 Thread.sleep(1000);
		 
		WebDriverWait wait3=new WebDriverWait(GetDriver(),60);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side-menu']/li[3]/ul/li[5]/a"))).click();
				 
		System.out.println("Clicked on CPC Full Class chart");
				 
		Thread.sleep(1000);
				
		WebElement Validate=GetDriver().findElement(By.xpath("//*[@class='highcharts-root']"));
		System.out.println(Validate.getText());
				 
		 Thread.sleep(2000);
		
		 GoToHomePage();

	}
	
	@Test
	public void Publication_Country_Chart() throws Exception
	{
		Thread.sleep(1000);
		
		CommonProjectQS();
		
		Thread.sleep(2000);
		
		//quickstats
		
		WebElement ClickonQuickStats = GetDriver().findElement(By.xpath("//a[contains(text(),'Quick Stats')]"));
		JavascriptExecutor executor = (JavascriptExecutor)GetDriver();
		executor.executeScript("arguments[0].click();", ClickonQuickStats);
		System.out.println("clicked on Quick stats");
		
		Thread.sleep(1000);
		
		//iframe
		WebElement iframeElement = GetDriver().findElement(By.xpath("//iframe[@class='iframeClass dashboardFrame ng-scope']"));
		GetDriver().switchTo().frame(iframeElement);
	 
		  Thread.sleep(1000);

		  GetDriver().findElement(By.xpath("//*[@id='side-menu']/li[4]/a")).click();
		  
		 System.out.println("Clicked on Countries option");
		 
		 Thread.sleep(1000);
		 
		 WebDriverWait wait3=new WebDriverWait(GetDriver(),60);
		 wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side-menu']/li[4]/ul/li[1]/a"))).click();
		 
		 System.out.println("Clicked on publication countries chart");
		 
		 Thread.sleep(1000);
		 
		 WebElement Validate=GetDriver().findElement(By.xpath("//div[contains(@class,'highcharts-container')]"));
		 System.out.println(Validate.getText());
		 
		 Thread.sleep(1000);
	
		  GoToHomePage();

			  		
	}
	
	@Test
	public void TopicsChart() throws Exception
	{
		Thread.sleep(1000);
		
		CommonProjectQS();
		
		Thread.sleep(2000);
		
		//quickstats
		
		WebElement ClickonQuickStats = GetDriver().findElement(By.xpath("//a[contains(text(),'Quick Stats')]"));
		JavascriptExecutor executor = (JavascriptExecutor)GetDriver();
		executor.executeScript("arguments[0].click();", ClickonQuickStats);
		System.out.println("clicked on Quick stats");
		
		Thread.sleep(1000);
		
		//iframe
		WebElement iframeElement = GetDriver().findElement(By.xpath("//iframe[@class='iframeClass dashboardFrame ng-scope']"));
		GetDriver().switchTo().frame(iframeElement);
	 
		  Thread.sleep(1000);
		  WebDriverWait wait2=new WebDriverWait(GetDriver(),60);
		  wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side-menu']/li[6]/a"))).click();
		  
		 System.out.println("Clicked on technologies option");
		 
		 Thread.sleep(1000);
		 
		 WebDriverWait wait3=new WebDriverWait(GetDriver(),60);
		 wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side-menu']/li[6]/ul/li[1]/a"))).click();
		 
		 System.out.println("Clicked on Topics chart");
		 
		 Thread.sleep(1000);
		 
		 WebElement Validate=GetDriver().findElement(By.xpath("//div[@id='morris-area-chart1']"));
		 System.out.println(Validate.getText());
		 
		 Thread.sleep(1000);
	
		  GoToHomePage();
			  			
	}
	
	@Test
	public void LegalStatusChart() throws Exception
	{
		Thread.sleep(1000);
		
		CommonProjectQS();
		
		Thread.sleep(2000);
		
		//quickstats
		
		WebElement ClickonQuickStats = GetDriver().findElement(By.xpath("//a[contains(text(),'Quick Stats')]"));
		JavascriptExecutor executor = (JavascriptExecutor)GetDriver();
		executor.executeScript("arguments[0].click();", ClickonQuickStats);
		System.out.println("clicked on Quick stats");
		
		Thread.sleep(1000);
		
		//iframe
		WebElement iframeElement = GetDriver().findElement(By.xpath("//iframe[@class='iframeClass dashboardFrame ng-scope']"));
		GetDriver().switchTo().frame(iframeElement);
	 
		  Thread.sleep(1000);
		  WebDriverWait wait2=new WebDriverWait(GetDriver(),60);
		  wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side-menu']/li[5]/a"))).click();
		  
		 System.out.println("Clicked on Legal Status option");
		 
		 Thread.sleep(1000);
		 
		 WebDriverWait wait3=new WebDriverWait(GetDriver(),60);
		 wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side-menu']/li[5]/ul/li[1]/a"))).click();
		 
		 System.out.println("Clicked on Current Legal Status chart");
		 
		 Thread.sleep(1000);
		 
		 WebElement Validate=GetDriver().findElement(By.xpath("//div[contains(@class,'highcharts-container')]"));
		 System.out.println(Validate.getText());
		 
		 Thread.sleep(1000);
	
		  GoToHomePage();
	}
	
	@Test
	public void CategoryChart() throws Exception
	{

		Thread.sleep(1000);
		
		CommonProjectQS();
		
		Thread.sleep(2000);
		//quickstats
		
		WebDriverWait wait1 = new WebDriverWait(GetDriver(),60);
		WebElement ClickonQuickStats = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Quick Stats')]")));
		ClickonQuickStats.click();
		  
		System.out.println("clicked on Quick stats");
		  
		//iframe
		WebElement iframeElement = GetDriver().findElement(By.xpath("//iframe[@class='iframeClass dashboardFrame ng-scope']"));
		GetDriver().switchTo().frame(iframeElement);
			 
		Thread.sleep(1000);
		
		GetDriver().findElement(By.xpath("//*[@id='side-menu']/li[12]/a")).click();
		  
		 System.out.println("Clicked on categories Chart option");
		 
		 Thread.sleep(800);
		 
		 WebDriverWait wait3=new WebDriverWait(GetDriver(),60);
		 wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side-menu']/li[12]/ul/li[1]/a"))).click();
		 
		 System.out.println("Clicked on top level category chart");
		 
		 Thread.sleep(8000);
		 
		 WebElement Validate=GetDriver().findElement(By.xpath("//div[contains(@class,'highcharts-container')]"));
		 System.out.println(Validate.getText());
		 
		 Thread.sleep(1000);
		 
		 WebDriverWait wait4=new WebDriverWait(GetDriver(),60);
		 wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side-menu']/li[12]/ul/li[2]/a"))).click();
		 
		 System.out.println("Clicked on sub level category chart");
		 
		 Thread.sleep(1000);
		 
		 WebElement Validate2=GetDriver().findElement(By.xpath("//div[@id='morris-area-chart1']"));
		 System.out.println(Validate2.getText());
		 
		 Thread.sleep(1000);
		 		 
		  GoToHomePage();
	}
	
	@Test
	public void FlagChart() throws Exception
	{
		Thread.sleep(1000);
		
		CommonProjectQS();
		
		Thread.sleep(2000);
		//quickstats
		
		WebDriverWait wait1 = new WebDriverWait(GetDriver(),60);
		WebElement ClickonQuickStats = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Quick Stats')]")));
		ClickonQuickStats.click();
		  
		System.out.println("clicked on Quick stats");
		  
		//iframe
		WebElement iframeElement = GetDriver().findElement(By.xpath("//iframe[@class='iframeClass dashboardFrame ng-scope']"));
		GetDriver().switchTo().frame(iframeElement);
	 
		Thread.sleep(2000);

		GetDriver().findElement(By.xpath("//*[@id='side-menu']/li[11]/a")).click();
		  
		 System.out.println("Clicked on flags Chart option");
		 
		 Thread.sleep(500);
		 
		 WebElement Flag=GetDriver().findElement(By.xpath("//*[@id='side-menu']/li[11]/ul/li[1]/a"));
		 ((JavascriptExecutor)GetDriver()).executeScript("window.scrollTo(0,"+ Flag.getLocation().y +")"); 
		 Flag.click();
		 System.out.println("Clicked on flag chart");
		 
		 Thread.sleep(1000);
		 
		 WebElement Validate=GetDriver().findElement(By.xpath("//div[contains(@class,'highcharts-container')]"));
		 System.out.println(Validate.getText());
		 
		 Thread.sleep(1000);
		 
		  GoToHomePage();

	}
	
	@Test
	public void RatingChart() throws Exception
	{
		Thread.sleep(1000);
		
		CommonProjectQS();
		
		Thread.sleep(2000);
		//quickstats
		
		WebDriverWait wait1 = new WebDriverWait(GetDriver(),60);
		WebElement ClickonQuickStats = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Quick Stats')]")));
		ClickonQuickStats.click();
		  
		System.out.println("clicked on Quick stats");
		  
		//iframe
		WebElement iframeElement = GetDriver().findElement(By.xpath("//iframe[@class='iframeClass dashboardFrame ng-scope']"));
		GetDriver().switchTo().frame(iframeElement);
	 
		Thread.sleep(2000);

		GetDriver().findElement(By.xpath("//*[@id='side-menu']/li[11]/a")).click();
		  
		 System.out.println("Clicked on flags Chart option");
		 
		 Thread.sleep(1000);
		 
		 WebElement Rating=GetDriver().findElement(By.xpath("//*[@id='side-menu']/li[11]/ul/li[2]/a"));
		 ((JavascriptExecutor)GetDriver()).executeScript("window.scrollTo(0,"+ Rating.getLocation().y +")"); 
		 Rating.click();
		 
		 Thread.sleep(800);
		 
		 WebElement Validate2=GetDriver().findElement(By.xpath("//div[contains(@class,'highcharts-container')]"));
		 System.out.println(Validate2.getText());
		 
		 Thread.sleep(1000);
		 
		  GoToHomePage();
	}
	
	@Test
	public void TimeToGrantChart() throws Exception
	{
		Thread.sleep(1000);
		
		CommonProjectQS();
		
		Thread.sleep(2000);
		
		//quickstats
		
		WebDriverWait wait1 = new WebDriverWait(GetDriver(),60);
		WebElement ClickonQuickStats = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Quick Stats')]")));
		ClickonQuickStats.click();
		  
		System.out.println("clicked on Quick stats");
		  
		//iframe
		WebElement iframeElement = GetDriver().findElement(By.xpath("//iframe[@class='iframeClass dashboardFrame ng-scope']"));
		GetDriver().switchTo().frame(iframeElement);
	 
		 Thread.sleep(800);

		 GetDriver().findElement(By.xpath("//*[@id='side-menu']/li[7]/a")).click();
		 System.out.println("Clicked on Time To Grant Chart option");
		 
		 Thread.sleep(500);
		 
		 WebDriverWait wait3=new WebDriverWait(GetDriver(),60);
		 wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='side-menu']/li[7]/ul/li/a"))).click();
		 
		 System.out.println("Clicked on Average Time to Grant in Months chart");
		 
		 Thread.sleep(500);
		 
		 WebElement Validate=GetDriver().findElement(By.xpath("//*[@class='highcharts-root']"));
		 System.out.println(Validate.getText());
		 
		 Thread.sleep(500);
	
		  GoToHomePage();		
	}
	
	@Test
	public void InnovationTimelineChart() throws Exception
	{
		Thread.sleep(500);
		
		CommonProjectQS();
		
		Thread.sleep(500);
		//quickstats
		
		WebDriverWait wait1 = new WebDriverWait(GetDriver(),60);
		WebElement ClickonQuickStats = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Quick Stats')]")));
		ClickonQuickStats.click();
		  
		System.out.println("clicked on Quick stats");
		  
		//iframe
		WebElement iframeElement = GetDriver().findElement(By.id("ContentPlaceHolder1_tabCntrl_ifrm_1"));
		GetDriver().switchTo().frame(iframeElement);
		 Thread.sleep(500);

		  Thread.sleep(500);

		  WebDriverWait wait2=new WebDriverWait(GetDriver(),60);
		  wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='side-menu']/li[8]/a"))).click();
		  
		 System.out.println("Clicked on Timeline Chart option");
		 
		 Thread.sleep(500);
		 
		 WebDriverWait wait3=new WebDriverWait(GetDriver(),60);
		 wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='side-menu']/li[8]/ul/li/a"))).click();
		 
		 System.out.println("Clicked on Innovation Timeline chart");
		 
		 Thread.sleep(500);
		 
//		 WebElement Validate=GetDriver().findElement(By.xpath("//*[@class='highcharts-root']"));
//		 System.out.println(Validate.getText());
		 
		 Thread.sleep(500);
	
		  GoToHomePage();
		
	}
	
	@Test
	public void TopRecordChart() throws Exception
	{
		Thread.sleep(1000);
		
		CommonProjectQS();
		
		Thread.sleep(500);
		//quickstats
		
		WebDriverWait wait1 = new WebDriverWait(GetDriver(),60);
		WebElement ClickonQuickStats = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Quick Stats')]")));
		ClickonQuickStats.click();
		  
		System.out.println("clicked on Quick stats");
		  
		//iframe
		WebElement iframeElement = GetDriver().findElement(By.id("ContentPlaceHolder1_tabCntrl_ifrm_1"));
		GetDriver().switchTo().frame(iframeElement);
		Thread.sleep(500);

		  Thread.sleep(500);

		  WebDriverWait wait2=new WebDriverWait(GetDriver(),60);
		  wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='side-menu']/li[9]/a"))).click();
		  
		 System.out.println("Clicked on Top Record Chart option");
		 
		 Thread.sleep(500);
		 
		 WebDriverWait wait3=new WebDriverWait(GetDriver(),60);
		 wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='side-menu']/li[9]/ul/li[1]/a"))).click();
		 
		 System.out.println("Clicked on citation Chart");
		 
		 Thread.sleep(500);
		 
		 
		 WebDriverWait wait4=new WebDriverWait(GetDriver(),60);
		 wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='side-menu']/li[9]/ul/li[1]/ul/li[2]/a"))).click();
		 
		 System.out.println("Clicked on backward citation Chart");
		 
		 Thread.sleep(500);
		 
		 WebElement Validate=GetDriver().findElement(By.xpath("//*[@class='highcharts-root']"));
		 System.out.println(Validate.getText());
		 
		 Thread.sleep(500);
	
		  GoToHomePage();
			  		
	}
	
	@Test
	public void CorrelationChart() throws Exception
	{
		Thread.sleep(1000);
		
		CommonProjectQS();
		
		Thread.sleep(500);
		//quickstats
		
		WebDriverWait wait1 = new WebDriverWait(GetDriver(),60);
		WebElement ClickonQuickStats = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Quick Stats')]")));
		ClickonQuickStats.click();
		  
		System.out.println("clicked on Quick stats");
		  
		//iframe
		WebElement iframeElement = GetDriver().findElement(By.id("ContentPlaceHolder1_tabCntrl_ifrm_1"));
		GetDriver().switchTo().frame(iframeElement);
		Thread.sleep(500);

		  Thread.sleep(500);

		  WebDriverWait wait2=new WebDriverWait(GetDriver(),60);
		  wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Correlations')]"))).click();
		  
		 System.out.println("Clicked on Correlations Chart option");
		 
		 Thread.sleep(500);
		 
		 WebDriverWait wait3=new WebDriverWait(GetDriver(),60);
		 wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='active']//li[1]//a[1]"))).click();
		 
//		 System.out.println("Clicked on citation Chart");
		 
		 Thread.sleep(500);
		 
		 
		 WebDriverWait wait4=new WebDriverWait(GetDriver(),60);
		 wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='active']//li[2]//a[1]"))).click();
		 
//		 System.out.println("Clicked on backward citation Chart");
		 
//		 Thread.sleep(500);
//		 
//		 WebElement Validate=GetDriver().findElement(By.xpath("//*[@class='highcharts-root']"));
//		 System.out.println(Validate.getText());
		 
		 Thread.sleep(500);
	
		  GoToHomePage();
			  		
	}
	
  @Test
  public void SaveToDashboard() throws Exception 
  {
	  GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor)GetDriver();//WebDriver instance type cast into JavascriptExecutor interface

		WebElement cmd = GetDriver().findElement(By.xpath("//span[@class='patseer_Secondary_Button ng-binding'][contains(text(),'SIM')]"));
		js.executeScript("arguments[0].click();", cmd);
		
		Thread.sleep(2000);
		
		 //on result page
		  GetDriver().manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		
		  //iframe
		  WebElement iframeElement = GetDriver().findElement(By.id("resultFrameID"));
		  GetDriver().switchTo().frame(iframeElement);
		  
		  Thread.sleep(500);
		  
		  GoToHomePage();

		
		//quickstats
//		
//				WebDriverWait wait1 = new WebDriverWait(GetDriver(),60);
//				WebElement ClickonQuickStats = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Quick Stats')]")));
//				ClickonQuickStats.click();
//				  
//				System.out.println("clicked on Quick stats");
//				  
//				//iframe
//				WebElement iframeElement2 = GetDriver().findElement(By.id("dashboardFrame"));
//				GetDriver().switchTo().frame(iframeElement2);
//			 
//				  Thread.sleep(500);
//
//				  WebDriverWait wait2=new WebDriverWait(GetDriver(),60);
//				  wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='side-menu']/li[6]/a"))).click();
//				  
//				 System.out.println("Clicked on Technologies Chart option");
//				 
//				 Thread.sleep(500);
				 
	
  }
  
  @Test
  public void OrderBy() throws Exception
  {
	  Thread.sleep(1000);
		
	  CommonProjectQS();
		
	  Thread.sleep(500);
	  
	  //quickstats
		
		WebDriverWait wait1 = new WebDriverWait(GetDriver(),60);
		WebElement ClickonQuickStats = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Quick Stats')]")));
		ClickonQuickStats.click();
		  
		System.out.println("clicked on Quick stats");
		  
		//iframe
		WebElement iframeElement = GetDriver().findElement(By.id("ContentPlaceHolder1_tabCntrl_ifrm_1"));
		GetDriver().switchTo().frame(iframeElement);
		Thread.sleep(500);

//		  Thread.sleep(500);	
		  
		  WebDriverWait wait2=new WebDriverWait(GetDriver(),60);
		  wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side-menu']/li[3]"))).click();
		  
		 System.out.println("Clicked on Dates option");
		 
		 Thread.sleep(500);
		 
		 WebDriverWait wait3=new WebDriverWait(GetDriver(),60);
		 wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side-menu']/li[3]/ul/li[3]"))).click();
		 
		 System.out.println("Clicked on  Publication Year chart");
		 
		 Thread.sleep(500);
		 
//		 WebElement Validate=GetDriver().findElement(By.xpath("//*[@class='highcharts-root']"));
//		 System.out.println(Validate.getText());
		  
}
  
  
}
