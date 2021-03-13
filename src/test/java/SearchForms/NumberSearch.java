package SearchForms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Login.BaseTest;

public class NumberSearch extends BaseTest
{
 
  @Test
  public void Relevance() throws Exception
  {
	 
	  Thread.sleep(2000);
	  
	  WebElement input= GetDriver().findElement(By.xpath("//textarea[@id='txtManual_0_0']"));
	  input.sendKeys("US8924733B2 ,US2014380310A1 ,WO2014195115A1,US2014365758A1 ,US8909944B2 ,US2014351661A1 ,GB2514395A ,US8898358B2 ,US2014339131A1 ,US8880740B2 ,IN-DEL-2010-00417 ,US2014325042A1 ,IN263915A1 ,IN/PCT/2001/00178/DEL ,1343/DEL/1996 ,IN2100 ,US1156545421556 ,AU111111 ,US20060004229,WO9816586");
  
	  Thread.sleep(1000);
	  
	  WebElement lookup=GetDriver().findElement(By.xpath("//div[@id='divAddButton_0_0']"));
	  lookup.click();
	  System.out.println("clicked on lookup");
	  
//	  WebElement ResultQueryPreview= GetDriver().findElement(By.xpath("//div[@id='divMatch']"));
//	  System.out.println(ResultQueryPreview.getText());
	  
	  WebElement Search=GetDriver().findElement(By.xpath("//div[@id='cmdManualUpload_0_0']"));
	  Search.click();
	  
	//on result page
	  GetDriver().manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
	
	  //iframe
//	  WebElement iframeElement = GetDriver().findElement(By.id("resultFrameID"));
//	  GetDriver().switchTo().frame(iframeElement);
	  
	  Thread.sleep(1000);
	  
	  //Click on search within
//	  WebElement search= GetDriver().findElement(By.xpath("//*[@id='leftUpperPanel_SearchSummaryContainer_filterContainer']/div[3]/div[1]"));
//	  JavascriptExecutor js = (JavascriptExecutor)GetDriver();
//	  js.executeScript("arguments[0].click();",search);
	  
//	  WebElement ClickonSearchWithin=GetDriver().findElement(By.xpath("//*[@id='leftUpperPanel_SearchSummaryContainer_filterContainer']/div[3]/div[1]/span[2]"));
//	  ClickonSearchWithin.click();
	  
//	  Thread.sleep(500);
	  
//	  WebElement EnterSearchTerm=GetDriver().findElement(By.xpath("//*[@id='SearchTerm']"));
//	  EnterSearchTerm.sendKeys("PNC:WO2014195115A1");
//	  
//	  Thread.sleep(500);
//	  
//	  WebElement ApplyFilter=GetDriver().findElement(By.xpath("//*[@id='applydivID']"));
//	  ApplyFilter.click();
	  
//	  Thread.sleep(1000);
	  
	//validation using assert
//	  WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
//	  wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
//	  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
//	  System.out.println("s1 : "+validate.getText());
//	  
//	  Thread.sleep(1000);
//	  
//	  String actualText="WEB SERVICE TESTING";
//	  Assert.assertEquals(validate.getText(), actualText);
	  
//	  Thread.sleep(500);
	
	  GoToHomePage();
	  
	  Thread.sleep(500);
	  
	  SelectNumberSearch();
	  
	  WebElement Clear=GetDriver().findElement(By.xpath("//div[@id='CmdReset_0_0']"));
	  Clear.click();
	  
  }
  
  @Test
  public void CopyPaste() throws Exception
  {

	  Thread.sleep(1000);

	  
	  WebElement input= GetDriver().findElement(By.xpath("//textarea[@id='txtManual_0_0']"));
	  input.sendKeys("  US2006004229A1,US6000000A  ");
	  
	  //lookup
	  WebElement lookup=GetDriver().findElement(By.xpath("//div[@id='divAddButton_0_0']"));
	  lookup.click();
	  System.out.println("clicked on lookup");
	  
	  GetDriver().manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
	  
//		WebElement iframeElement = GetDriver().findElement(By.id("resultFrameID"));
//		GetDriver().switchTo().frame(iframeElement);
		Thread.sleep(500);
	  
		//Click on search within
//		  WebElement search= GetDriver().findElement(By.xpath("//span[@class='imgNav floatRight patseerImage ui-icon ui-icon-carat-1-s']"));
//		  JavascriptExecutor js = (JavascriptExecutor)GetDriver();
//		  js.executeScript("arguments[0].click();",search);
//		  
//		  try 
//		  {
//			  GetDriver().findElement(By.xpath("//span[@class='imgNav floatRight patseerImage ui-icon ui-icon-carat-1-s']")).click();
//		  } 
//		  catch (NoSuchElementException e)
//		  {
//			  System.out.println("handled NoSuchElementException");
//		  }
//		  
//		  Thread.sleep(100);
//		  
//		  WebElement ClickonDropArrow=GetDriver().findElement(By.xpath("//*[@id='leftUpperPanel_SearchSummaryContainer_filterContainer']/div[3]/div[1]/span[2]"));
//		  ClickonDropArrow.click();
	  
//	  WebElement ClickonSearchWithin=GetDriver().findElement(By.xpath("//*[@id='leftUpperPanel_SearchSummaryContainer_filterContainer']/div[3]/div[1]/span[2]"));
//	  ClickonSearchWithin.click();
	  
//	  Thread.sleep(500);
	  
//	  WebElement EnterSearchTerm=GetDriver().findElement(By.xpath("//*[@id='SearchTerm']"));
//	  EnterSearchTerm.sendKeys("PNC:US2006004229A1");
//	  
//	  Thread.sleep(500);
//	  
//	  WebElement ApplyFilter=GetDriver().findElement(By.xpath("//*[@id='applydivID']"));
//	  ApplyFilter.click();
//	  
//	  Thread.sleep(1000);
	  
	//validation using assert
//	  WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
//	  wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
//	  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
//	  System.out.println("s1 : "+validate.getText());
//	  
//	  String actualText="Preparation of acrylic acid by heterogeneously catalyzed partial gas phase oxidation of propylene";
//	  Assert.assertEquals(validate.getText(), actualText);
	  
	  Thread.sleep(500);
	
	  GoToHomePage();
	  
	  Thread.sleep(500);
	  
	  SelectNumberSearch();
	  
	  WebElement Clear=GetDriver().findElement(By.xpath("//div[@id='CmdReset_0_0']"));
	  Clear.click();
	  
  }
  
  @Test
  public void APN() throws Exception
  {
	  Thread.sleep(1000);
	  
	  WebElement application= GetDriver().findElement(By.xpath("//textarea[@id='txtManual_0_0']"));
	  application.sendKeys("8123880");
	  System.out.println("Support for searching application number");
	  
	  //lookup
	  WebElement lookup=GetDriver().findElement(By.xpath("//div[@id='divAddButton_0_0']"));
	  lookup.click();
	  System.out.println("clicked on lookup");
	
	//on result page
	  GetDriver().manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
	
	  //iframe
//	  WebElement iframeElement = GetDriver().findElement(By.id("resultFrameID"));
//	  GetDriver().switchTo().frame(iframeElement);
	
		  
//		  Thread.sleep(1000);
		  
		//validation using assert
//		  WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
//		  wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
//		  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
//		  System.out.println("s1 : "+validate.getText());
//		  
//		  String actualText="Curable silicate compositions containing condensed phosphate hardeners and pH controlling bases[US4319926A]";
//		  Assert.assertEquals(validate.getText(), actualText);
		  
	  Thread.sleep(500);
	
	  GoToHomePage();
	  
	  Thread.sleep(500);
	  
	  SelectNumberSearch();
	  
	  WebElement Clear=GetDriver().findElement(By.xpath("//div[@id='CmdReset_0_0']"));
	  Clear.click();
  }
 
  
  
  @Test 
  public void SFAM() throws Exception
  {
	  Thread.sleep(1000);

	  WebElement input= GetDriver().findElement(By.xpath("//textarea[@id='txtManual_0_0']"));
	  input.sendKeys("US8924733B2");
	  
	  WebDriverWait wait3= new WebDriverWait(GetDriver(),60);
	  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='SearchWithinCntrl_cmbSearchType_0_0']")));
	 
	  WebElement SelectSFAM= GetDriver().findElement(By.xpath("//select[@id='SearchWithinCntrl_cmbSearchType_0_0']//option[contains(text(),'Simple Family')]"));
	  SelectSFAM.click();
	  
	  WebElement lookup=GetDriver().findElement(By.xpath("//div[@id='divAddButton_0_0']"));
	  lookup.click();
	  System.out.println("clicked on lookup");
	  
	//on result page
	  GetDriver().manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
	
	  //iframe
//	  WebElement iframeElement = GetDriver().findElement(By.id("resultFrameID"));
//	  GetDriver().switchTo().frame(iframeElement);
	  
	  Thread.sleep(500);
		//Click on search within
//		  WebElement search= GetDriver().findElement(By.xpath("//*[@id='leftUpperPanel_SearchSummaryContainer_filterContainer']/div[3]"));
//		  JavascriptExecutor js = (JavascriptExecutor)GetDriver();
//		  js.executeScript("arguments[0].click();",search);
//		  
//		  Thread.sleep(100);
//		  
//		  WebElement ClickonDropArrow=GetDriver().findElement(By.xpath("//*[@id='leftUpperPanel_SearchSummaryContainer_filterContainer']/div[3]/div[1]/span[2]"));
//		  ClickonDropArrow.click();
		  
//		  WebElement ClickonSearchWithin=GetDriver().findElement(By.xpath("//*[@id='leftUpperPanel_SearchSummaryContainer_filterContainer']/div[3]/div[1]/span[2]"));
//		  ClickonSearchWithin.click();
		  
//		  Thread.sleep(500);
//		  
//		  WebElement EnterSearchTerm=GetDriver().findElement(By.xpath("//*[@id='SearchTerm']"));
//		  EnterSearchTerm.sendKeys("PNC: US8924733B2");
//		  
//		  Thread.sleep(500);
//		  
//		  WebElement ApplyFilter=GetDriver().findElement(By.xpath("//*[@id='applydivID']"));
//		  ApplyFilter.click();
//		  
//		  Thread.sleep(1000);
		  
		//validation using assert
//		  WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
//		  wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
//		  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
//		  System.out.println("s1 : "+validate.getText());
//		  
//		  String actualText="Enabling access to removable hard disk drives";
//		  Assert.assertEquals(validate.getText(), actualText);
		  
	  Thread.sleep(500);
	
	  GoToHomePage();
	  
	  Thread.sleep(500);
	  
	  SelectNumberSearch();
	  
	  WebElement Clear=GetDriver().findElement(By.xpath("//div[@id='CmdReset_0_0']"));
	  Clear.click();
  }  
	
  @Test 
  public void EFAM() throws Exception
  {
	  Thread.sleep(1000);

	  WebElement input= GetDriver().findElement(By.xpath("//textarea[@id='txtManual_0_0']"));
	  input.sendKeys("US8924733B2");
	  
	  WebDriverWait wait3= new WebDriverWait(GetDriver(),60);
	  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='SearchWithinCntrl_cmbSearchType_0_0']")));
	 
	  WebElement SelectEFAM= GetDriver().findElement(By.xpath("//select[@id='SearchWithinCntrl_cmbSearchType_0_0']//option[contains(text(),'Extended Family')]"));
	  SelectEFAM.click();
	  
	  WebElement lookup=GetDriver().findElement(By.xpath("//div[@id='divAddButton_0_0']"));
	  lookup.click();
	  System.out.println("clicked on lookup");
	  
	//on result page
	  GetDriver().manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
	
	  //iframe
//	  WebElement iframeElement = GetDriver().findElement(By.id("resultFrameID"));
//	  GetDriver().switchTo().frame(iframeElement);
	  
	  Thread.sleep(500);
	//Click on search within
//	  WebElement search= GetDriver().findElement(By.xpath("//*[@id='leftUpperPanel_SearchSummaryContainer_filterContainer']/div[3]/div[1]"));
//	  JavascriptExecutor js = (JavascriptExecutor)GetDriver();
//	  js.executeScript("arguments[0].click();",search);
	  
//	  WebElement ClickonSearchWithin=GetDriver().findElement(By.xpath("//*[@id='leftUpperPanel_SearchSummaryContainer_filterContainer']/div[3]/div[1]/span[2]"));
//	  ClickonSearchWithin.click();
	  
//	  Thread.sleep(500);
	  
//	  WebElement EnterSearchTerm=GetDriver().findElement(By.xpath("//*[@id='SearchTerm']"));
//	  EnterSearchTerm.sendKeys("PNC:US8924733B2");
//	  
//	  Thread.sleep(500);
//	  
//	  WebElement ApplyFilter=GetDriver().findElement(By.xpath("//*[@id='applydivID']"));
//	  ApplyFilter.click();
	  
//	  Thread.sleep(1000);
	  
	//validation using assert
//	  WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
//	  wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
//	  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
//	  System.out.println("s1 : "+validate.getText());
//	  
//	  String actualText="Enabling access to removable hard disk drives";
//	  Assert.assertEquals(validate.getText(), actualText);
	  
//	  Thread.sleep(500);
	
	  GoToHomePage();
	  
	  Thread.sleep(500);
	  
	  SelectNumberSearch();
	  
	  WebElement Clear=GetDriver().findElement(By.xpath("//div[@id='CmdReset_0_0']"));
	  Clear.click();
  }  
  
  @Test 
  public void ImportDatabase() throws Exception
  {
	  Thread.sleep(1000);
	  
	  SelectNumberSearch();
	  
	  Thread.sleep(1000);
	  
	  WebElement Clear=GetDriver().findElement(By.xpath("//div[@id='CmdReset_0_0']"));
	  Clear.click();
	  
	  Thread.sleep(1000);

	  WebElement Database= GetDriver().findElement(By.xpath("//input[@id='txtNumberConvertorWizard_0_0']"));
	  Database.sendKeys(" dwpi ");
	  
	  Thread.sleep(200);
	  
//	  GetDriver().findElement(By.xpath("//*[@id='ui-id-9']")).sendKeys(Keys.ARROW_DOWN);
//
//	  Thread.sleep(200);
//	  
//	  GetDriver().findElement(By.xpath("//*[@id='ui-id-9']")).sendKeys(Keys.ENTER);
	  
//	  WebElement SelectSuggestion=GetDriver().findElement(By.xpath("//*[@id='ui-id-17']"));
//	  SelectSuggestion.click();
	  
	  Thread.sleep(1000);
	  
	  WebElement input= GetDriver().findElement(By.xpath("//textarea[@id='txtManual_0_0']"));
	  input.sendKeys("US2012-221770A1");
	  
	  WebElement lookup=GetDriver().findElement(By.xpath("//div[@id='divAddButton_0_0']"));
	  lookup.click();
	  System.out.println("clicked on lookup");
	  
	//on result page
	  GetDriver().manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
	
		  Thread.sleep(3000);
		  
		//validation using assert
		  WebDriverWait wait2= new WebDriverWait(GetDriver(),60);
		  wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		  System.out.println("s1 : "+validate.getText());
		  
		  String actualText="MEMORY SYSTEM CAPABLE OF PROHIBITING ACCESS TO APPLICATION SOFTWARE AND SYSTEM SOFTWARE";
		  Assert.assertEquals(validate.getText(), actualText);
		  
	  Thread.sleep(1000);
	
	  GoToHomePage();
	  
	  Thread.sleep(2000);
	  
//	  SelectNumberSearch();
//	  
//	  WebElement Clear=GetDriver().findElement(By.xpath("//div[@id='CmdReset_0_0']"));
//	  Clear.click();
  }  
	
  @Test 
  public void BCT() throws Exception
  {
	  Thread.sleep(1000);

	  
	  WebElement input= GetDriver().findElement(By.xpath("//textarea[@id='txtManual_0_0']"));
	  input.sendKeys("US2006004229A1");
	  
	  WebDriverWait wait3= new WebDriverWait(GetDriver(),60);
	  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='SearchWithinCntrl_cmbSearchType_0_0']")));
	 
	  WebElement SelectBCT= GetDriver().findElement(By.xpath("//select[@id='SearchWithinCntrl_cmbSearchType_0_0']//option[contains(text(),'Backward Citations')]"));
	  SelectBCT.click();
	  
	  WebElement lookup=GetDriver().findElement(By.xpath("//div[@id='divAddButton_0_0']"));
	  lookup.click();
	  System.out.println("clicked on lookup");
	  
	//on result page
	  GetDriver().manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
	
	  //iframe
//	  WebElement iframeElement = GetDriver().findElement(By.id("resultFrameID"));
//	  GetDriver().switchTo().frame(iframeElement);
	  
	  Thread.sleep(500);
	//Click on search within
//	  WebElement search= GetDriver().findElement(By.xpath("//span[@class='imgNav floatRight patseerImage ui-icon ui-icon-carat-1-s']"));
//	  JavascriptExecutor js = (JavascriptExecutor)GetDriver();
//	  js.executeScript("arguments[0].click();",search);
//	    
//		  Thread.sleep(100);
//		  
//		  WebElement ClickonDropArrow=GetDriver().findElement(By.xpath("//*[@id='leftUpperPanel_SearchSummaryContainer_filterContainer']/div[3]/div[1]/span[2]"));
//		  ClickonDropArrow.click();
		  
//		  WebElement ClickonSearchWithin=GetDriver().findElement(By.xpath("//*[@id='leftUpperPanel_SearchSummaryContainer_filterContainer']/div[3]/div[1]/span[2]"));
//		  ClickonSearchWithin.click();
		  
//		  Thread.sleep(500);
//		  
//		  WebElement EnterSearchTerm=GetDriver().findElement(By.xpath("//*[@id='SearchTerm']"));
//		  EnterSearchTerm.sendKeys("PNC:US7294741B2");
//		  
//		  Thread.sleep(500);
//		  
//		  WebElement ApplyFilter=GetDriver().findElement(By.xpath("//*[@id='applydivID']"));
//		  ApplyFilter.click();
//		  
//		  Thread.sleep(1000);
		  
		//validation using assert
//		  WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
//		  wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
//		  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
//		  System.out.println("s1 : "+validate.getText());
//		  
//		  String actualText="Process for the production of acrylic acid";
//		  Assert.assertEquals(validate.getText(), actualText);
		  
//	  Thread.sleep(500);
	
	  GoToHomePage();
	  
	  Thread.sleep(500);
	  
	  SelectNumberSearch();
	  
	  WebElement Clear=GetDriver().findElement(By.xpath("//div[@id='CmdReset_0_0']"));
	  Clear.click();
	  
  }
  
  @Test 
  public void FCT() throws Exception
  {
	  Thread.sleep(1000);

	  WebElement input= GetDriver().findElement(By.xpath("//textarea[@id='txtManual_0_0']"));
	  input.sendKeys("US2006004229A1");
	  
	  WebDriverWait wait3= new WebDriverWait(GetDriver(),60);
	  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='SearchWithinCntrl_cmbSearchType_0_0']")));
	 
	  WebElement SelectBCT= GetDriver().findElement(By.xpath("//select[@id='SearchWithinCntrl_cmbSearchType_0_0']//option[contains(text(),'Forward Citations of')]"));
	  SelectBCT.click();
	  
	  WebElement lookup=GetDriver().findElement(By.xpath("//div[@id='divAddButton_0_0']"));
	  lookup.click();
	  System.out.println("clicked on lookup");
	  
	//on result page
	  GetDriver().manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
	
	  //iframe
//	  WebElement iframeElement = GetDriver().findElement(By.id("resultFrameID"));
//	  GetDriver().switchTo().frame(iframeElement);
	  
	  Thread.sleep(500);

		//Click on search within
//		  WebElement search= GetDriver().findElement(By.xpath("//*[@id='leftUpperPanel_SearchSummaryContainer_filterContainer']/div[3]"));
//		  JavascriptExecutor js = (JavascriptExecutor)GetDriver();
//		  js.executeScript("arguments[0].click();",search);
//		  
//		  Thread.sleep(100);
//		  
//		  WebElement ClickonDropArrow=GetDriver().findElement(By.xpath("//*[@id='leftUpperPanel_SearchSummaryContainer_filterContainer']/div[3]/div[1]/span[2]"));
//		  ClickonDropArrow.click();
		  
//		  WebElement ClickonSearchWithin=GetDriver().findElement(By.xpath("//*[@id='leftUpperPanel_SearchSummaryContainer_filterContainer']/div[3]/div[1]/span[2]"));
//		  ClickonSearchWithin.click();
//		  
//		  Thread.sleep(500);
//		  
//		  WebElement EnterSearchTerm=GetDriver().findElement(By.xpath("//*[@id='SearchTerm']"));
//		  EnterSearchTerm.sendKeys("PNC: US9822197B2");
//		  
//		  Thread.sleep(500);
//		  
//		  WebElement ApplyFilter=GetDriver().findElement(By.xpath("//*[@id='applydivID']"));
//		  ApplyFilter.click();
		  
//		  Thread.sleep(1000);
		  
		//validation using assert
//		  WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
//		  wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
//		  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
//		  System.out.println("s1 : "+validate.getText());
//		  
//		  String actualText="Method for producing superabsorbers based on renewable raw materials";
//		  Assert.assertEquals(validate.getText(), actualText);
		  
//	  Thread.sleep(500);
	
	  GoToHomePage();
	  
	  Thread.sleep(500);
	  
	  SelectNumberSearch();
//	  
//	  WebElement Clear=GetDriver().findElement(By.xpath("//div[@id='CmdReset_0_0']"));
//	  Clear.click();
	  
  }
  
  @Test 
  public void NumberConversion() throws Exception
  {
	  Thread.sleep(1000);

	  WebElement input= GetDriver().findElement(By.xpath("//textarea[@id='txtManual_0_0']"));
	  input.sendKeys("WO201961267A1,WO201960387A1,WO201940574A1,WO201935907A1,WO201900360A1,WO201864027A1,WO201863782A1,WO201858344A1,WO201848610A1,WO201844414A1,WO201831731A1,WO201831729A1");
	  
	  WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
	  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='SearchWithinCntrl_cmbSearchType_0_0']")));
	 
	  WebElement lookup=GetDriver().findElement(By.xpath("//div[@id='divAddButton_0_0']"));
	  lookup.click();
	  System.out.println("clicked on lookup");
	  
	//on result page
	  GetDriver().manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
	
	  //iframe
//	  WebElement iframeElement = GetDriver().findElement(By.id("resultFrameID"));
//	  GetDriver().switchTo().frame(iframeElement);
	  
	  Thread.sleep(500);

		//Click on search within
//		  WebElement search= GetDriver().findElement(By.xpath("//*[@id='leftUpperPanel_SearchSummaryContainer_filterContainer']/div[3]"));
//		  JavascriptExecutor js = (JavascriptExecutor)GetDriver();
//		  js.executeScript("arguments[0].click();",search);
//		  
//		  Thread.sleep(100);
//		  
//		  WebElement ClickonDropArrow=GetDriver().findElement(By.xpath("//*[@id='leftUpperPanel_SearchSummaryContainer_filterContainer']/div[3]/div[1]/span[2]"));
//		  ClickonDropArrow.click();
		  
//		  WebElement ClickonSearchWithin=GetDriver().findElement(By.xpath("//*[@id='leftUpperPanel_SearchSummaryContainer_filterContainer']/div[3]/div[1]/span[2]"));
//		  ClickonSearchWithin.click();
		  
//		  Thread.sleep(500);
//		  
//		  WebElement EnterSearchTerm=GetDriver().findElement(By.xpath("//*[@id='SearchTerm']"));
//		  EnterSearchTerm.sendKeys("PNC: WO2018044414A1");
//		  
//		  Thread.sleep(500);
//		  
//		  WebElement ApplyFilter=GetDriver().findElement(By.xpath("//*[@id='applydivID']"));
//		  ApplyFilter.click();
//		  
//		  Thread.sleep(1000);
		  
		//validation using assert
//		  WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
//		  wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
//		  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
//		  System.out.println("s1 : "+validate.getText());
//		  
//		  String actualText="METHOD FOR THERMALLY INSULATING SUBSEA STRUCTURES";
//		  Assert.assertEquals(validate.getText(), actualText);
		  
//		  Thread.sleep(500);
		  
	  GoToHomePage();
	  
	  Thread.sleep(500);
	  
	  SelectNumberSearch();
	  
	  WebElement Clear=GetDriver().findElement(By.xpath("//div[@id='CmdReset_0_0']"));
	  Clear.click();
  	} 	 
  
  @Test 
  public void SIM() throws Exception
  {
	  Thread.sleep(1000);

	  WebElement input= GetDriver().findElement(By.xpath("//textarea[@id='txtManual_0_0']"));
	  input.sendKeys("US2006004229A1");
	  
	  WebDriverWait wait3= new WebDriverWait(GetDriver(),60);
	  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='SearchWithinCntrl_cmbSearchType_0_0']")));
	 
	  WebElement SelectSIM= GetDriver().findElement(By.xpath("//select[@id='SearchWithinCntrl_cmbSearchType_0_0']//option[contains(text(),'Similar Patents to Matched')]"));
	  SelectSIM.click();
	  
	  WebElement lookup=GetDriver().findElement(By.xpath("//div[@id='divAddButton_0_0']"));
	  lookup.click();
	  System.out.println("clicked on lookup");
	  
	//on result page
	  GetDriver().manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
	
	  //iframe
//	  WebElement iframeElement = GetDriver().findElement(By.id("resultFrameID"));
//	  GetDriver().switchTo().frame(iframeElement);
	  
	  Thread.sleep(500);
	  
	  //for search within
//	 //Click on search within
//	  WebElement search= GetDriver().findElement(By.xpath("//*[@id='leftUpperPanel_SearchSummaryContainer_filterContainer']/div[3]"));
//	  JavascriptExecutor js = (JavascriptExecutor)GetDriver();
//	  js.executeScript("arguments[0].click();",search);
//	  
//	  Thread.sleep(100);
//	  
//	  WebElement ClickonDropArrow=GetDriver().findElement(By.xpath("//*[@id='leftUpperPanel_SearchSummaryContainer_filterContainer']/div[3]/div[1]/span[2]"));
//	  ClickonDropArrow.click();
	  
//	  WebElement ClickonSearchWithin=GetDriver().findElement(By.xpath("//*[@id='leftUpperPanel_SearchSummaryContainer_filterContainer']/div[3]/div[1]/span[2]"));
//	  ClickonSearchWithin.click();
	  
//	  Thread.sleep(500);
//	  
//	  WebElement EnterSearchTerm=GetDriver().findElement(By.xpath("//*[@id='SearchTerm']"));
//	  EnterSearchTerm.sendKeys("PNC:EP1484299B1");
//	  
//	  Thread.sleep(500);
//	  
//	  WebElement ApplyFilter=GetDriver().findElement(By.xpath("//*[@id='applydivID']"));
//	  ApplyFilter.click();
//	  
//	  Thread.sleep(1000);
	  
	//validation using assert
//	  WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
//	  wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
//	  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
//	  System.out.println("s1 : "+validate.getText());
//	  
//	  String actualText="PROCESS FOR CATALYTIC VAPOR PHASE OXIDATION";
//	  Assert.assertEquals(validate.getText(), actualText);
	  
	  Thread.sleep(500);
	  	
	  GoToHomePage();
	  
	  Thread.sleep(500);
	  
  }
  
  @Test
  public void UploadFromFile() throws Exception
  {
	  Thread.sleep(1000);
	  
	  SelectNumberSearch();
	  
	  Thread.sleep(1000);
	  
	  WebElement ClickonUploadFromFile=GetDriver().findElement(By.xpath("//*[@id='numberUploadPanel']/div/div/div[2]"));
	  ClickonUploadFromFile.click();
	  
	  Thread.sleep(1000);
	  
	  WebElement ChooseXLSXFile=GetDriver().findElement(By.xpath("//input[@id='fileuploadImport_0_0']"));
	  ChooseXLSXFile.sendKeys("Z:\\Testing\\Testing Documents\\Patseer\\RFT documents\\RFT_INPUT_FILES\\148_records.xlsx");
	  
	  Thread.sleep(1000);
	  
	  WebElement ClickonLookup= GetDriver().findElement(By.xpath("//*[@id='divUpload_0_0']"));
	  ClickonLookup.click();
	  
	  Thread.sleep(5000);
	  
	  WebElement CheckCount=GetDriver().findElement(By.xpath("//*[@id='ulResultAction']/li[3]/div"));
	  System.out.println(CheckCount.getText());
	  
	  Thread.sleep(2000);
	  
	  GoToHomePage();
	  
	  
  }
  
  @Test
  public void STNxmlFileUpload() throws Exception
  {
	  Thread.sleep(1000);
	  
	  SelectNumberSearch();
	  
	  Thread.sleep(1000);
	  
	  WebElement ClickonUploadFromFile=GetDriver().findElement(By.xpath("//*[@id='numberUploadPanel']/div/div/div[2]"));
	  ClickonUploadFromFile.click();
	  
	  Thread.sleep(1000);
	  
	  WebElement ChooseXLSXFile=GetDriver().findElement(By.xpath("//input[@id='fileuploadImport_0_0']"));
	  ChooseXLSXFile.sendKeys("Z:\\Testing\\Sample Import Data\\STN XML\\NEM-test_CAplus.xml");
	  
	  Thread.sleep(4000);
	  
	  WebElement ClickonLookup= GetDriver().findElement(By.xpath("//div[@id='divUpload_0_0']"));
	  ClickonLookup.click();
	  
	  Thread.sleep(8000);
	  
//	  WebElement ClickonLookup2= GetDriver().findElement(By.xpath("//div[@id='divUpload_0_0']"));
//	  ClickonLookup2.click();
//	  
//	  Thread.sleep(2000);
	  
	  WebDriverWait wait1=new WebDriverWait(GetDriver(),90);
	//div[@id='divMatchNo']
	  WebElement DisplayRecords=GetDriver().findElement(By.xpath("//span[@id='divImportBtn']"));
	  DisplayRecords.click();
	  
	  Thread.sleep(5000);
	  
	  WebElement CheckCount=GetDriver().findElement(By.xpath("//*[@id='ulResultAction']/li[3]/div"));
	  System.out.println(CheckCount.getText());
	  
	  Thread.sleep(2000);
	  
	  GoToHomePage(); 
  }
  
  @Test
  public void Edit_nonMatching_Numbers() throws Exception
  {
	  Thread.sleep(1000);
	  
	  SelectNumberSearch();
	  
	  Thread.sleep(1000);
	  
	  WebElement Clear=GetDriver().findElement(By.xpath("//div[@id='CmdReset_0_0']"));
	  Clear.click();
	  
	  Thread.sleep(1000);
	  
	  WebElement input= GetDriver().findElement(By.xpath("//textarea[@id='txtManual_0_0']"));
	  input.sendKeys(" US2014380310A1 ,WO2014195115A1,US2014365758A1,US8924733B2000  ");
	  
	  Thread.sleep(1000);
	  
	  WebElement lookup=GetDriver().findElement(By.xpath("//div[@id='divAddButton_0_0']"));
	  lookup.click();
	  
	  Thread.sleep(2000);
	  
	  WebElement CorrectNumber=GetDriver().findElement(By.xpath("//div[@id='divExternalNo_US8924733B2000']"));
	  CorrectNumber.clear();
	  CorrectNumber.sendKeys("US8924733B2");
	  
	  Thread.sleep(1000);
	  
	  WebElement Copy=GetDriver().findElement(By.xpath("//span[@id='divMismatchCopy']"));
	  Copy.click();
	  
	  Thread.sleep(1000);
	  
	  WebDriverWait wait= new WebDriverWait(GetDriver(), 90);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='divVerifyImage_US8924733B2000']")));
	  
	  Thread.sleep(500);
	  
	  WebElement Verify=GetDriver().findElement(By.id("divVerifyImage_US8924733B2000"));
	  Verify.click();
	  
	  Thread.sleep(1000);
	  
	  WebElement Search=GetDriver().findElement(By.xpath("//*[@id='cmdManualUpload_0_0']"));
	  Search.click();
	  
	  Thread.sleep(2000);
  }
  }