package SearchForms;

import java.sql.Date;
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

public class SearchScript extends BaseTest
{
	@Test 

	  public void SelectQuicksearch() 
	  {
		  GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

			JavascriptExecutor js = (JavascriptExecutor)GetDriver();
			WebElement quick = GetDriver().findElement(By.xpath("//a[@href='Search#/quick']"));
			js.executeScript("arguments[0].click();", quick);
		  
		  
	  }
	
  @Test
  public void Export() throws Exception 
  {
	  Thread.sleep(500);
	  WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
	  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='floatLeft']//input[@id='Checkbox1']")));
	 
	  EnableScript();
	  
	  Thread.sleep(500);
	  
	  EnableScript();
	  
	  Thread.sleep(1000);
	  
	  WebDriverWait wait2= new WebDriverWait(GetDriver(),60);
	  wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ContentPlaceHolder1_searchScriptCntrl_SavedSearch_selectSavedExport']")));
	  
	  WebElement exportPDF=GetDriver().findElement(By.xpath("//select[@id='ContentPlaceHolder1_searchScriptCntrl_SavedSearch_selectSavedExport']//option[contains(text(),'PDF')]"));
	  exportPDF.click();
	  
	  JavascriptExecutor js = (JavascriptExecutor)GetDriver();
		WebElement ClickonDownload = GetDriver().findElement(By.xpath("//i[@id='ContentPlaceHolder1_searchScriptCntrl_SavedSearch_scriptSavedExportCSV']"));
		js.executeScript("arguments[0].click();", ClickonDownload);
		
//	  WebElement ClickonDownload=GetDriver().findElement(By.xpath("//i[@id='ContentPlaceHolder1_searchScriptCntrl_SavedSearch_scriptSavedExportCSV']"));
//	  ClickonDownload.click();
	  
	  GoToHomePage();
	  
//	  SelectQuicksearch();
	  
  }
  
  @Test
  public void CommentTags() throws Exception
  {
	  Thread.sleep(500);
	  WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
	  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='floatLeft']//input[@id='Checkbox1']")));
	 
	  EnableScript();
	  
	  Thread.sleep(500);
	  
	  EnableScript();
	  
	  Thread.sleep(500);
	  
	  WebElement ClickonComment=GetDriver().findElement(By.xpath("//div[@id='tabs-script']//tr[2]//td[2]//div[2]//div[1]//span[1]//span[1]"));
	  ClickonComment.click();
	  
	  Thread.sleep(200);
	  
	  WebElement AddComment=GetDriver().findElement(By.xpath("//div[@id='tabs-script']//tr[2]//td[2]//div[2]//div[1]//span[1]//textarea[1]"));
	  AddComment.sendKeys("comment 1");
	  
	  WebElement ViewComment=GetDriver().findElement(By.xpath("//div[@id='tabs-script']//tr[2]//td[2]//div[2]//div[1]"));
	  System.out.println(ViewComment.getText());
	  
	  Thread.sleep(2000);
	  
	  WebElement ClickonTag=GetDriver().findElement(By.xpath("//div[@id='tabs-script']//tr[2]//td[2]//div[2]//div[2]//span[1]//span[1]"));
	  ClickonTag.click();
	  
	  Thread.sleep(200);
	  
	  WebElement AddTag= GetDriver().findElement(By.xpath("//div[@id='tabs-script']//tr[2]//td[2]//div[2]//div[2]//span[1]//textarea[1]"));
	  AddTag.sendKeys("tag 1");
	  
	  
	  Thread.sleep(5000);
	  
	  WebElement ViewTags=GetDriver().findElement(By.xpath("//div[@id='tabs-script']//tr[2]//td[2]//div[2]//div[2]"));
	  System.out.println(ViewTags.getText());
	  
	  GoToHomePage();
	  
	  SelectQuicksearch();
	  
  }
  
  @Test
  public void ScriptID() throws Exception
  {
	  Thread.sleep(500);
	  WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
	  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='floatLeft']//input[@id='Checkbox1']")));
	 
	  EnableScript();
	  
	  Thread.sleep(500);
	  
	  EnableScript();
	  
	  Thread.sleep(500);
	  
	  JavascriptExecutor js = (JavascriptExecutor)GetDriver();
		WebElement ClickonScriptID = GetDriver().findElement(By.xpath("//div[@id='tabs-script']//tr[3]//td[1]//a[1]"));
		js.executeScript("arguments[0].click();", ClickonScriptID);
	 
	//getcount and click on search
//		 WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
//		  wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Get Count')]")));
//		  WebElement getCountBtn= GetDriver().findElement(By.xpath("//a[contains(text(),'Get Count')]"));
//		  System.out.println(getCountBtn.getText());
//		  
//		  ((JavascriptExecutor)GetDriver()).executeScript("window.scrollTo(0,"+ getCountBtn.getLocation().y +")"); 
//		  getCountBtn.click();
//		  System.out.println("clicked on get count");
		  
		  //search
//		  WebElement search= GetDriver().findElement(By.xpath("//a[@id='searchId']"));
//		  JavascriptExecutor js = (JavascriptExecutor)GetDriver();
//		  js.executeScript("arguments[0].click();",search);
//		  System.out.println("clicked on search");
		  
		//on result page
//		  GetDriver().manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		
		  //iframe
//		  WebElement iframeElement = GetDriver().findElement(By.id("resultFrameID"));
//		  GetDriver().switchTo().frame(iframeElement);
		  
//		  Thread.sleep(500);
		  
		//validation using assert
//		  WebElement validate=GetDriver().findElement(By.xpath("//label[contains(text(),'DISTRIBUTION BOARD')]"));
//		  System.out.println("s1 : "+validate.getText());
//		  
//		  String actualText="DISTRIBUTION BOARD";
//		  Assert.assertEquals(validate.getText(), actualText);
//		  Thread.sleep(500);
		
		  GoToHomePage();
		  
		  SelectQuicksearch();
  }
  
  @Test
  public void ExportClasses() throws Exception
  {
	  Thread.sleep(500);
	  WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
	  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='floatLeft']//input[@id='Checkbox1']")));
	 
	  EnableScript();
	  
	  Thread.sleep(500);
	  
	  EnableScript();
	  
	  Thread.sleep(2000);
	  
	  WebElement ClickonCCOption=GetDriver().findElement(By.xpath("//i[@class='leftSpacer1 CS_leftMargin mdi mdi-closed-caption large exp-Class ng-scope']"));
	  ClickonCCOption.click();
	  
	  GoToHomePage();
	  
	  SelectQuicksearch();
	  
  }
  
  @Test
  public void Qid() throws Exception
  {
	  Thread.sleep(500);
	  WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
	  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='floatLeft']//input[@id='Checkbox1']")));
	 
	  EnableScript();
	  
	  Thread.sleep(500);
	  
	  EnableScript();
	  
	  WebDriverWait wait2=new WebDriverWait(GetDriver(),60);
	  wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ContentPlaceHolder1_searchScriptCntrl_SavedSearch_combineSearchtxtId']")));
	  
	  WebElement CombineQueries= GetDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_searchScriptCntrl_SavedSearch_combineSearchtxtId']"));
	  CombineQueries.sendKeys("L1 OR Q");
	  
	  Thread.sleep(200);
	  
	  WebElement Add=GetDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_searchScriptCntrl_SavedSearch_combineSearchMainContainer']//span[@class='patseer_Secondary_Button'][contains(text(),'Add')]"));
	  Add.click();
	  
	  Thread.sleep(500);
	  
//	  WebElement DisplayQuery=GetDriver().findElement(By.xpath("//body[contains(@class,'pageBody ui-widget body')]/form[@id='form1']/div[contains(@class,'ui-widget')]/div[@id='divDisplay']/div[contains(@class,'master_middlepanel ui-widget-content patseermaster_middlepanel forclear')]/div[@id='search-ng-con-id']/div[@id='allSearchFormContainer']/div/div[contains(@class,'floatLeft width100 searchFormContjq SF_searchScript CombineSearch')]/div[@id='toolMainContainer']/div[contains(@class,'searchScriptCont floatRight searchScriptHeight')]/ul/li/div[contains(@class,'patseer-tab-min')]/div[@id='dockingTabsScript']/div[@id='tabs-script']/div[contains(@class,'marginLeft10')]/div[@id='ContentPlaceHolder1_searchScriptCntrl_saveSearchScriptContainer']/div[@id='ContentPlaceHolder1_searchScriptCntrl_SavedSearch_SavedSearchTableContainer']/div[contains(@class,'rowwize saveScriptTableTop saveScriptTableTopCC')]/table[contains(@class,'savedSearchTable width100 topSpacer')]/tbody/tr[2]/td[2]/div[1]"));
//	  DisplayQuery.getText();
	 
	  GoToHomePage();
	  
	  SelectQuicksearch();

  }
  
  @Test
  public void SingleSearchScriptID() throws Exception
  {
	  Thread.sleep(1000);
	  
	  GoToHomePage();

	  Thread.sleep(2000);
	  
	  SelectCommandSearch();
	  
	  
	  Thread.sleep(1000);
	  
	  WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
	  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='floatLeft']//input[@id='Checkbox1']")));
	 
	  EnableScript();
	  
	  Thread.sleep(500);
	  
	  EnableScript();
	  
	  Thread.sleep(2000);
		//for spell check		
		 SpellCheck();
		  
		  Thread.sleep(500);
			JavascriptExecutor js = (JavascriptExecutor)GetDriver();//WebDriver instance type cast into JavascriptExecutor interface
			WebElement ScriptID = GetDriver().findElement(By.id("txtSpellCheck"));
			js.executeScript("arguments[0].click();", ScriptID);

			GetDriver().findElement(By.xpath("//textarea[@id='txtSpellCheck']")).clear();
			
			ScriptID.sendKeys("      L130     ");
		System.out.println("entered search term in cmd");
		
		Thread.sleep(2000);
		
		GetCountSearch_CMD();
		
		Thread.sleep(1000);
		
		//search within
		SearchWithin();
						
		Thread.sleep(1000);
						
		WebElement SearchNo=GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys(" PNC:  DE102005021251B4 ");
						
		Thread.sleep(1000);
		
		ApplyFilter();
				
		Thread.sleep(3000);
		
		//validation using assert
		  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		  System.out.println("s1 : "+validate.getText());
		  
		  String actualText="Coordinated service and engine braking for a hybrid vehicle";
		  Assert.assertEquals(validate.getText(), actualText);
		
		GoToHomePage();
		
		Thread.sleep(500);
		  
//		SelectCommandSearch();
//
//		//clear
//		  WebElement clear= GetDriver().findElement(By.xpath("//div[@class='floatLeft leftSpacer']"));
//		  clear.click();
//		  System.out.println("clicked on clear option");
	  
	  
  }
  
  @Test
  public void SetAlert() throws Exception
  {
	  
	  Thread.sleep(1000);
	  
	  WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
	  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='floatLeft']//input[@id='Checkbox1']")));
	 
	  EnableScript();
	  
	  Thread.sleep(500);
	  
	  EnableScript();
	  
	  WebDriverWait wait2=new WebDriverWait(GetDriver(),60);
	  wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ContentPlaceHolder1_searchScriptCntrl_SavedSearch_SavedSearchTableContainer']/div[2]/table/tbody/tr[6]")));
	  
	  Thread.sleep(1000);
	  
//	  WebDriverWait wait3=new WebDriverWait(GetDriver(),60);
//	  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ContentPlaceHolder1_searchScriptCntrl_SavedSearch_SavedSearchTableContainer']/div[2]/table/tbody/tr[6]/td[6]/div/a")));
	  
	  WebElement Clickon3dots=GetDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_searchScriptCntrl_SavedSearch_SavedSearchTableContainer']/div[2]/table/tbody/tr[6]/td[6]/div/a"));
	  Clickon3dots.click();
	  
	  Thread.sleep(1000);
	  
	  JavascriptExecutor js2 = (JavascriptExecutor)GetDriver();
		WebElement SelectSetAlert = GetDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_searchScriptCntrl_SavedSearch_setalertLi']"));
		js2.executeScript("arguments[0].click();", SelectSetAlert);
	 
	  Thread.sleep(1000);
	  
	  Date d = new Date(System.currentTimeMillis());
	  GetDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_alertMainCntrl_txtAlertName']")).sendKeys("ScriptAlert" + d);
	  
	  Thread.sleep(1000);
	  
	  WebElement AddAction=GetDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_alertMainCntrl_alertActionCntrl_cmbAction']/option[2]"));
	  AddAction.click();
	  
	  Thread.sleep(1000);
	  
	  WebElement ClickonAddAction=GetDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_alertMainCntrl_alertActionCntrl_cmdAdd']"));
	  ClickonAddAction.click();
	  
	  Thread.sleep(2000);

	  WebElement SaveAlert= GetDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_alertMainCntrl_cmdSave']"));
	  SaveAlert.click();
	  
	  Thread.sleep(2000);
	  
	  GoToHomePage();
	  
	  Thread.sleep(1000);
	  
	  SelectQuicksearch();
	
  }
}
