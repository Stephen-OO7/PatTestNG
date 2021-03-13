package ResultPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Login.BaseTest;

public class FilterEnhancements extends BaseTest{
	
  @Test
  public void CommonSearch() throws Exception 
  {	 
		//clear
		  WebElement clear1= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		  clear1.click();
		  System.out.println("clicked on clear option");
		  
		  Thread.sleep(300);
		  
		  WebElement ClickonTAC= GetDriver().findElement(By.xpath("//div[@id='main_0']"));
		  ClickonTAC.click();
		  
		WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")).clear(); 

		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]"))).sendKeys("TAC");		  
		wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='main_0']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Title, Abstract, Claims (TAC)')]"))).click();
	
		Thread.sleep(200);
		
		WebElement EnterText= GetDriver().findElement(By.xpath("//textarea[@id='txtPatApp_0']"));
		EnterText.sendKeys("Fiber cell");
	
		  Thread.sleep(500);
		  
		  GetCountSearch_QS();	
		  
		  Thread.sleep(1000);
	  }
  
  @Test
  public void Is_PartiesOption() throws Exception
  {
	  QuickSearch();
	  
	  CommonSearch();
	  
//	  WebElement ClickonPlus=GetDriver().findElement(By.xpath("//span[@class='mdi mdi-plus']"));
//	  ClickonPlus.click();
	  
	  JavascriptExecutor js = (JavascriptExecutor)GetDriver();
		WebElement Clickon_Assignee = GetDriver().findElement(By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='ASNN']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_Assignee);
		
		Thread.sleep(1000);
		
		WebElement SelectIS=GetDriver().findElement(By.name("optradio_ASNN_op_0"));
		SelectIS.click();
		
		Thread.sleep(1000);
		
		JavascriptExecutor js1 = (JavascriptExecutor)GetDriver();
		WebElement SelectAssignee = GetDriver().findElement(By.xpath("//input[@value='BAYER CROPSCIENCE NV']"));
		js1.executeScript("arguments[0].click();", SelectAssignee);
		
		Thread.sleep(200);
		
		//search within
		SearchWithin();
		
		Thread.sleep(1000);
		
		WebElement SearchNo=GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: EP2661498A1  ");
		
		Thread.sleep(5000);
		
		ApplyFilter();
		
		Thread.sleep(5000);
		 //validation using assert
		  WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
		  wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		  System.out.println("s1 : "+validate.getText());
			  
		  String actualText="FIBER SELECTIVE PROMOTERS";
		  Assert.assertEquals(validate.getText(), actualText);
			
		  Thread.sleep(1000);
		 
		  GoToHomePage();
	  
  }
  
  @Test
  public void IsNOT_PartiesOption() throws Exception
  {
	  QuickSearch();
	  
	  CommonSearch();
	  
//	  WebElement ClickonPlus=GetDriver().findElement(By.xpath("//span[@class='mdi mdi-plus']"));
//	  ClickonPlus.click();
	  
	  JavascriptExecutor js = (JavascriptExecutor)GetDriver();
		WebElement Clickon_Assignee = GetDriver().findElement(By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='ASNN']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_Assignee);
		
		Thread.sleep(1000);
		
		WebElement SelectIsNOT=GetDriver().findElement(By.name("optradio_ASNN_op_1"));
		SelectIsNOT.click();
		
		Thread.sleep(1000);
		
		JavascriptExecutor js1 = (JavascriptExecutor)GetDriver();
		WebElement SelectAssignee = GetDriver().findElement(By.xpath("//input[@value='ANTHROGENESIS CORP']"));
		js1.executeScript("arguments[0].click();", SelectAssignee);
		
		Thread.sleep(200);
		
		//search within
		SearchWithin();
		
		Thread.sleep(1000);
		
		WebElement SearchNo=GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC:  US10604893B2  ");
		
		Thread.sleep(5000);
		
		ApplyFilter();
		
		Thread.sleep(5000);
		 //validation using assert
		  WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
		  wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		  System.out.println("s1 : "+validate.getText());
			  
		  String actualText="Method for producing fibrillated cellulose";
		  Assert.assertEquals(validate.getText(), actualText);
			
		  Thread.sleep(1000);
		 
		  GoToHomePage();
	  
  }
  
  @Test
  public void Contain_TestType() throws Exception
  {
	  QuickSearch();
	  
	  CommonSearch();
	  
	  Thread.sleep(3000);
	  
	  WebElement ClickonPlus=GetDriver().findElement(By.xpath("//span[@class='mdi mdi-plus']"));
	  ClickonPlus.click();
	  
	  WebElement ele = GetDriver().findElement(By.linkText("TEXT(EN)"));
	  Actions action = new Actions(GetDriver());
	  action.moveToElement(ele).build().perform();
	  
	  WebElement SelectTAC= GetDriver().findElement(By.xpath("//span[contains(text(),'Title, Abstract, Claims (TAC)')]"));
	  SelectTAC.click();
	  
	  JavascriptExecutor js = (JavascriptExecutor)GetDriver();
		WebElement Clickon_TAC = GetDriver().findElement(By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='TAC']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_TAC);
	  
	  Thread.sleep(200);
	  
	  WebElement EnterTAC= GetDriver().findElement(By.xpath("//*[@id='divDate_TAC']/div[1]/div/div/input"));
	  EnterTAC.sendKeys("FABRIC MADE OF TWISTED YARNS");
	  
	  Thread.sleep(200);

	  ApplyFilter();
	  
	  Thread.sleep(5000);
	//validation using assert
	WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
	wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
	WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
	System.out.println("s1 : "+validate.getText());
			  
	String actualText="FABRIC MADE OF TWISTED YARNS";
	Assert.assertEquals(validate.getText(), actualText);
			
	Thread.sleep(1000);
		 
	GoToHomePage();	  
  }
  
  @Test
  public void NOTContain_TestType() throws Exception
  {
	  QuickSearch();
	  
	  CommonSearch();
	  
	  Thread.sleep(3000);
	  
	  WebElement ClickonPlus=GetDriver().findElement(By.xpath("//span[@class='mdi mdi-plus']"));
	  ClickonPlus.click();
	  
	  WebElement ele = GetDriver().findElement(By.linkText("TEXT(EN)"));
	  Actions action = new Actions(GetDriver());
	  action.moveToElement(ele).build().perform();
	  
	  WebElement SelectTAC= GetDriver().findElement(By.xpath("//span[contains(text(),'Title, Abstract, Claims (TAC)')]"));
	  SelectTAC.click();
	  
	  JavascriptExecutor js = (JavascriptExecutor)GetDriver();
		WebElement Clickon_TAC = GetDriver().findElement(By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='TAC']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_TAC);
	  
	  Thread.sleep(200);
	  
	  WebElement NotContain=GetDriver().findElement(By.xpath("//*[@id='divDate_TAC']/div[2]/label/input"));	  
	  NotContain.click();
	  
	  Thread.sleep(200);

	  WebElement EnterTAC= GetDriver().findElement(By.xpath("//*[@id='divDate_TAC']/div[2]/div/div/input"));
	  EnterTAC.sendKeys("FABRIC MADE OF TWISTED YARNS");
	  
	  Thread.sleep(200);

	  ApplyFilter();
	  
//	  Thread.sleep(5000);
//	//validation using assert
//	WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
//	wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
//	WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
//	System.out.println("s1 : "+validate.getText());
//			  
//	String actualText="FABRIC MADE OF TWISTED YARNS";
//	Assert.assertEquals(validate.getText(), actualText);
			
	Thread.sleep(1000);
		 
	GoToHomePage();  
  }
  
  @Test
  public void Contain_PNC() throws Exception
  {
	  QuickSearch();
	  
	  CommonSearch();
	  
	  Thread.sleep(3000);
	  
	  WebElement ClickonPlus=GetDriver().findElement(By.xpath("//span[@class='mdi mdi-plus']"));
	  ClickonPlus.click();
	  
	  WebElement ele = GetDriver().findElement(By.linkText("BIBLIO"));
	  Actions action = new Actions(GetDriver());
	  action.moveToElement(ele).build().perform();
	  
	  WebElement SelectTAC= GetDriver().findElement(By.xpath("//span[contains(text(),'Publication No (PNC)')]"));
	  SelectTAC.click();
	  
	  JavascriptExecutor js = (JavascriptExecutor)GetDriver();
		WebElement Clickon_PNC = GetDriver().findElement(By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='PNC']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_PNC);
	  
	  Thread.sleep(200);
	  
	  WebElement EnterTAC= GetDriver().findElement(By.xpath("//*[@id='divDate_PNC']/div[1]/div/div/input"));
	  EnterTAC.sendKeys("  US6941720B2");
	  
	  Thread.sleep(200);

	  ApplyFilter();
	  
	  Thread.sleep(5000);
	//validation using assert
	WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
	wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
	WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
	System.out.println("s1 : "+validate.getText());
			  
	String actualText="Composite building material";
	Assert.assertEquals(validate.getText(), actualText);
			
	Thread.sleep(1000);
		 
	GoToHomePage();	  
  }
  
  @Test
  public void NotContain_PNC() throws Exception
  {
	  QuickSearch();
	  
	  CommonSearch();
	  
	  Thread.sleep(3000);
	  
	  WebElement ClickonPlus=GetDriver().findElement(By.xpath("//span[@class='mdi mdi-plus']"));
	  ClickonPlus.click();
	  
	  WebElement ele = GetDriver().findElement(By.linkText("BIBLIO"));
	  Actions action = new Actions(GetDriver());
	  action.moveToElement(ele).build().perform();
	  
	  WebElement SelectTAC= GetDriver().findElement(By.xpath("//span[contains(text(),'Publication No (PNC)')]"));
	  SelectTAC.click();
	  
	  JavascriptExecutor js = (JavascriptExecutor)GetDriver();
		WebElement Clickon_PNC = GetDriver().findElement(By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='PNC']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_PNC);
	  
	  Thread.sleep(200);
	 	  
	  WebElement NotContain=GetDriver().findElement(By.xpath("//*[@id='divDate_PNC']/div[2]/label/input"));	  
	  NotContain.click();
	  
	  Thread.sleep(200);
	  
	  WebElement EnterTAC= GetDriver().findElement(By.xpath("//*[@id='divDate_PNC']/div[2]/div/div/input"));
	  EnterTAC.sendKeys("  US6941720B2");
	  
	  Thread.sleep(200);

	  ApplyFilter();
	  
//	  Thread.sleep(5000);
//	//validation using assert
//	WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
//	wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
//	WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
//	System.out.println("s1 : "+validate.getText());
//			  
//	String actualText="Composite building material";
//	Assert.assertEquals(validate.getText(), actualText);
			
	Thread.sleep(1000);
		 
	GoToHomePage();	  
  }
  
  @Test
	public void CommonProjectFE() throws InterruptedException
	{
		GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor)GetDriver();
		WebElement commonProj = GetDriver().findElement(By.xpath("//span[@class='patseer_Secondary_Button ng-binding'][contains(text(),'Automation_Project')]"));
		js.executeScript("arguments[0].click();", commonProj);
		
		Thread.sleep(2000);
		
		//on result page
		  GetDriver().manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		
	}
  
  @Test
  public void ProjectFields_Flags() throws Exception
  {
	  CommonProjectFE();
	  
	  Thread.sleep(3000);
	  
	  WebElement ClickonPlus=GetDriver().findElement(By.xpath("//span[@class='mdi mdi-plus']"));
	  ClickonPlus.click();
	  
	  WebElement ele = GetDriver().findElement(By.partialLinkText("PROJECT FIE"));
	  Actions action = new Actions(GetDriver());
	  action.moveToElement(ele).build().perform();
	  
	  WebElement SelectFlags= GetDriver().findElement(By.xpath("//span[contains(text(),'Flags')]"));
	  SelectFlags.click();
	  
	  Thread.sleep(500);
	  
	  JavascriptExecutor js = (JavascriptExecutor)GetDriver();
		WebElement SelectRedFlag = GetDriver().findElement(By.xpath("//*[@id='Fcheckbox1']"));
		js.executeScript("arguments[0].click();", SelectRedFlag);
	  
	  Thread.sleep(200);

	  //search within
		SearchWithin();
		
		Thread.sleep(5000);
		
		WebElement SearchNo=GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC:   EP3607002A1 ");
		
		Thread.sleep(500);
		
	  ApplyFilter();
	  
	  Thread.sleep(5000);
	//validation using assert
	WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
	wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
	WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
	System.out.println("s1 : "+validate.getText());
			  
	String actualText="COLORANT MIXTURES";
	Assert.assertEquals(validate.getText(), actualText);
			
	Thread.sleep(1000);
		 
	GoToHomePage();	
  }
  
  @Test
  public void ProjectFields_Ratings() throws Exception
  {
	  CommonProjectFE();
	  
	  Thread.sleep(3000);
	  
	  WebElement ClickonPlus=GetDriver().findElement(By.xpath("//span[@class='mdi mdi-plus']"));
	  ClickonPlus.click();
	  
	  WebElement ele = GetDriver().findElement(By.partialLinkText("PROJECT FIE"));
	  Actions action = new Actions(GetDriver());
	  action.moveToElement(ele).build().perform();
	  
	  WebElement SelectFlags= GetDriver().findElement(By.xpath("//span[contains(text(),'Ratings')]"));
	  SelectFlags.click();
	  
	  Thread.sleep(500);
	  
	  JavascriptExecutor js = (JavascriptExecutor)GetDriver();
		WebElement SelectRedFlag = GetDriver().findElement(By.xpath("//*[@id='Rcheckbox3']"));
		js.executeScript("arguments[0].click();", SelectRedFlag);
	  
	  Thread.sleep(200);

	  //search within
		SearchWithin();
		
		Thread.sleep(5000);
		
		WebElement SearchNo=GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: CN103958767B ");
		
		Thread.sleep(500);
		
	  ApplyFilter();
	  
	  Thread.sleep(5000);
	//validation using assert
	WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
	wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
	WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
	System.out.println("s1 : "+validate.getText());
			  
	String actualText="Method of increasing chlorine fastness";
	Assert.assertEquals(validate.getText(), actualText);
			
	Thread.sleep(1000);
		 
	GoToHomePage();	
  }
  
  @Test
  public void AppDate_ISEqualTo() throws Exception
  {

	  QuickSearch();
	  
	  CommonSearch();
	  
	  Thread.sleep(3000);
	  
	  MainFilter();
		
		JavascriptExecutor js = (JavascriptExecutor)GetDriver();
		WebElement ClickonAPD = GetDriver().findElement(By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='APD']//child::span[1]"));
		js.executeScript("arguments[0].click();",ClickonAPD);
		
		Thread.sleep(2000);
	  
//	  JavascriptExecutor js1 = (JavascriptExecutor)GetDriver();
//		WebElement SelectIsEqualTo = GetDriver().findElement(By.xpath("//*[@id='divDate_APD']/div[2]/label/input"));
//		js1.executeScript("arguments[0].click();", SelectIsEqualTo);
//	  
//	  Thread.sleep(500);
//	 	  
//	  WebElement EnterDate=GetDriver().findElement(By.id("datetimepicker2"));	  
//	  EnterDate.sendKeys(" 2019-05-15 ");
	  
//	  Thread.sleep(500);

	  //search within
		SearchWithin();
		
		Thread.sleep(5000);
		
		WebElement SearchNo=GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: US2020017871A1 ");
		
		Thread.sleep(500);
		
	  ApplyFilter();
	  
	  Thread.sleep(3000);
	  
	//validation using assert
	WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
	wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
	WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
	System.out.println("s1 : "+validate.getText());
			  
	String actualText="TISSUE SPECIFIC REDUCTION OF LIGNIN";
	Assert.assertEquals(validate.getText(), actualText);
			
	Thread.sleep(1000);
		 
	GoToHomePage();	  
  }
}
