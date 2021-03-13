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

public class SavedSearch extends BaseTest
{
	
  @Test
  public void ClickonSavedSearch() 
  {
	  GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)GetDriver();
		WebElement savedsearch = GetDriver().findElement(By.xpath("//a[contains(text(),'Saved Search')]"));
		js.executeScript("arguments[0].click();", savedsearch);
	  
  }
  
  @Test
  public void QueryID() throws Exception
  {
	  Thread.sleep(1000);
	  
	  WebElement Title=GetDriver().findElement(By.xpath("//td[contains(text(),'Automation')]"));
	  Title.click();
	  Thread.sleep(500);
	  
	  GetDriver().findElement(By.xpath("//tr[24]"));
	  
	  //Click on Lid
	  JavascriptExecutor js = (JavascriptExecutor)GetDriver();
		WebElement ClickOnQueryID = GetDriver().findElement(By.xpath("//a[contains(text(),'L6')]"));
		js.executeScript("arguments[0].click();", ClickOnQueryID);
	  
	Thread.sleep(1000);
	  
	//getcount and click on search
	 
	  GetCountSearch_QS();
	  
	//on result page
	GetDriver().manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		
	//iframe
//	WebElement iframeElement = GetDriver().findElement(By.id("resultFrameID"));
//	GetDriver().switchTo().frame(iframeElement);
//		  
		  
	Thread.sleep(2000);
	 //validation using assert
//	  WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
//	  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
//	  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
//	  System.out.println("s1 : "+validate.getText());
//		  
//	  String actualText="DISTRIBUTION BOARD";
//	  Assert.assertEquals(validate.getText(), actualText);
//		
//	  Thread.sleep(1000);
		
		  GoToHomePage();

		  Thread.sleep(500);
		  
		  ClickonSavedSearch();
  }
  
  
  @Test
  public void ViewResults() throws Exception
  {
	  GetDriver().manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	  WebElement Title=GetDriver().findElement(By.xpath("//td[contains(text(),'Automation')]"));
	  Title.click();
	  Thread.sleep(500);
	  
	  //three dots
	  WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
	  wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[6]//td[6]//div[1]//a[1]")));
	  WebElement dots= GetDriver().findElement(By.xpath("//tr[6]//td[6]//div[1]//a[1]"));
	  ((JavascriptExecutor)GetDriver()).executeScript("window.scrollTo(0,"+ dots.getLocation().y +")"); 
	  dots.click();
	  
	  Thread.sleep(500);
	  
//	  GetCountSearch_CMD();
	  
//	  Thread.sleep(500);
	  
	//on result page switch to iframe
//	  GetDriver().manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
//	  WebElement iframeElement = GetDriver().findElement(By.id("resultFrameID"));
//	  GetDriver().switchTo().frame(iframeElement);
//	  System.out.println("switched to iframe");
//	  Thread.sleep(500);		  
	  
	//search within
//	SearchWithin();
//			
//	Thread.sleep(1000);
//			
//	WebElement SearchNo=GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
//	SearchNo.sendKeys("   PNC:US2016082108A1  ");
//			
//	Thread.sleep(5000);
//			
//	ApplyFilter();
	  
	//validation using assert
//	  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
//	  System.out.println("s1 : "+validate.getText());
//	  
//	  String actualText="WIREFRAME NANOSTRUCTURES";
//	  Assert.assertEquals(validate.getText(), actualText);
//	  Thread.sleep(500);
	  
	  Thread.sleep(1000);
		
	  GoToHomePage();

	  Thread.sleep(500);
	  
	  ClickonSavedSearch();
	  
  }
  
  @Test
  public void Export() throws Exception
  {
	  GetDriver().manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	  WebElement Title=GetDriver().findElement(By.xpath("//td[contains(text(),'Automation')]"));
	  Title.click();
	  Thread.sleep(500);
	  
	  //three dots
//	  WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
//	  wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[6]//td[6]//div[1]//a[1]")));
//	  WebElement dots= GetDriver().findElement(By.xpath("//tr[6]//td[6]//div[1]//a[1]"));
//	  ((JavascriptExecutor)GetDriver()).executeScript("window.scrollTo(0,"+ dots.getLocation().y +")"); 
//	  dots.click();
	  
	  Thread.sleep(500);
	  
	  WebElement ClickonExport=GetDriver().findElement(By.id("ContentPlaceHolder1_SavedSearch_scriptExportCSV"));
	  ClickonExport.click();
	  
	  Thread.sleep(500);
	  
	  GoToHomePage();
	  	  
	  Thread.sleep(500);
	  
//	  ClickonSavedSearch();

  }
  
  @Test
  public void DeleteQuery() throws Exception
  {
	  Thread.sleep(1000);
	  
	  QuickSearch();
	  
	  Thread.sleep(2000);
	  
	  EnableScript();
	  
	  Thread.sleep(2000);
	  
	  WebElement ClickonPlus=GetDriver().findElement(By.xpath("//i[contains(@class,'mdi-plus-box-multiple medium handPointer marginLeft3px marginTop3')]"));
	  ClickonPlus.click();
	  
	  Thread.sleep(2000);
	  
	  Date d = new Date(System.currentTimeMillis());
	  GetDriver().findElement(By.xpath("//*[@id='AddSearchScriptDialog']/div/div[2]/input")).sendKeys("SavedScript" + d);
	  
	  Thread.sleep(1000);
	  
	  WebElement ClickonAdd=GetDriver().findElement(By.xpath("//*[@id='AddSearchScriptDialog']/div/div[3]/input"));
	  ClickonAdd.click();
	  
	  Thread.sleep(3000);	 
	  
	//clear
	  WebElement clear1= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
	  clear1.click();
	  System.out.println("clicked on clear option");
	  
	  Thread.sleep(1000);
	  
	  WebElement ClickonTAC= GetDriver().findElement(By.xpath("//div[@id='main_0']"));
	  ClickonTAC.click();
	  
	WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
	  GetDriver().findElement(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")).clear(); 

	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]"))).sendKeys("TAC");		  
	wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='main_0']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Title, Abstract, Claims (TAC)')]"))).click();

	Thread.sleep(200);
	
	WebElement EnterText= GetDriver().findElement(By.xpath("//textarea[@id='txtPatApp_0']"));
	EnterText.sendKeys("Fiber cell");
	
	Thread.sleep(1000);
	
	GetCountSearch_QS();
	  
	Thread.sleep(3000);

	ClickonSavedSearch();
	
	Thread.sleep(1000);
	
	  WebElement clickonscript=GetDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_SavedSearchList_SavedSearchListContainer']/table/tbody/tr[1]/td[1]"));
	  clickonscript.click();
 
		Thread.sleep(500);

	  //three dots
	  WebElement element = GetDriver().findElement(By.xpath("//a[contains(@class,'dropdown-toggle mdi mdi-dots-vertical medium floatRight alertmain fontsize20 Alertcolor')]"));
	  Actions actions = new Actions(GetDriver());
	  actions.moveToElement(element).click().perform();
	  
		Thread.sleep(500);

	  WebElement Remove = GetDriver().findElement(By.xpath("//li[contains(@class,'mdi mdi-close-circle-outline handPointer pasnfont paddingAlertLi noborder ng-scope')]"));
	  JavascriptExecutor executor = (JavascriptExecutor)GetDriver();
	  executor.executeScript("arguments[0].click();", Remove);
	  
	  Thread.sleep(500);
	  
	  WebDriverWait wait3=new WebDriverWait(GetDriver(),60);
	  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='confirmBox']")));
	 
	  WebElement ConfirmBox=GetDriver().findElement(By.xpath("//a[@id='btnPromptYes']"));
	  ConfirmBox.click();
	  
	  Thread.sleep(1000);

	  GoToHomePage();
  }
  
  @Test
  public void SetAlert() throws Exception
  {
	  ClickonSavedSearch();
	  
	  WebElement clickonscript=GetDriver().findElement(By.xpath("//td[contains(text(),'bosch')]"));
	  clickonscript.click();
	  
	  Thread.sleep(500);
	  
	  GoToHomePage();

	//three dots
	  WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
	  wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[6]//td[2]//div[1]//div[1]//div[2]")));
	  WebElement dots= GetDriver().findElement(By.xpath("//tr[6]//td[6]//div[1]//a[1]"));
	  ((JavascriptExecutor)GetDriver()).executeScript("window.scrollTo(0,"+ dots.getLocation().y +")"); 
	  dots.click();
	  
	  WebElement SetAlert=GetDriver().findElement(By.className("mdi mdi-clock handPointer pasnfont paddingAlertLi noborder"));
	  SetAlert.click();
	  System.out.println("clicked on SetAlert");
	  
	  Thread.sleep(1000);
	  
	  //
	  
	  Date d = new Date(System.currentTimeMillis());
	  GetDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_alertMainCntrl_txtAlertName']")).sendKeys("Alert" + d);
	  
	 //
	  
	  Thread.sleep(1000);
	  
	  WebElement selectType= GetDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_alertMainCntrl_alertActionCntrl_cmbAction']/option[2]"));
	  selectType.click();
	  
	  Thread.sleep(1000);

	  WebElement AddAction=GetDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_alertMainCntrl_alertActionCntrl_cmdAdd']"));
	  AddAction.click();
	  
	  Thread.sleep(2000);
	  
	  WebElement SaveAlert= GetDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_alertMainCntrl_cmdSave']"));
	  SaveAlert.click();
	  
	
	
	  }
  
  @Test
  public void editScript() throws Exception
  {
	  GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  WebElement title=GetDriver().findElement(By.xpath("//tr[1]//td[3]//span[1]"));
	  title.click();
	   
	  GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  WebDriverWait wait2= new WebDriverWait(GetDriver(),30);
	  wait2.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='ConfirmDialog']")));
	  
	  GetDriver().findElement(By.xpath("//input[@class='ng-pristine ng-untouched ng-valid']")).clear();
	  
	  WebElement editedname=GetDriver().findElement(By.xpath("//input[@class='ng-valid ng-dirty ng-valid-parse ng-touched']"));
	  editedname.sendKeys("new1234");
	  
	  WebElement update=GetDriver().findElement(By.xpath("//input[contains(@class,'patseer_button')]"));
	  update.click();
	  
	  GoToHomePage();
	  
	  ClickonSavedSearch();
	  
	  Thread.sleep(500);
	  
	  //delete script
//	  GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//
//	  WebElement delete=GetDriver().findElement(By.xpath("//tr[1]//td[3]//span[2]"));
//	  delete.click();
//	  
//	  GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//	  WebDriverWait wait3= new WebDriverWait(GetDriver(),30);
//	  wait3.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//body[contains(@class,'pageBody ui-widget body')]/div[3]")));
//	  
//	  WebElement deletescript=GetDriver().findElement(By.xpath("//a[@id='btnPromptYes']"));
//	  deletescript.click();
  }
}
