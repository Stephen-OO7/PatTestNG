package SearchForms;

import Login.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class QuickSearch extends BaseTest
{
	  @Test 

	  public void SelectQuicksearch() 
	  {
		  GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			JavascriptExecutor js = (JavascriptExecutor)GetDriver();
			WebElement quick = GetDriver().findElement(By.xpath("//a[@href='Search#/quick']"));
			js.executeScript("arguments[0].click();", quick);
	  }
	  
//	  @Test
//	  public void GetCountSearch_QS() throws Exception
//	  {
//		//getcount and click on search
//			 WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
//			  wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@ng-click='getCount()']")));
//			  WebElement getCountBtn= GetDriver().findElement(By.xpath("//a[@ng-click='getCount()']"));
//			  System.out.println(getCountBtn.getText());
//			  
//			  ((JavascriptExecutor)GetDriver()).executeScript("window.scrollTo(0,"+ getCountBtn.getLocation().y +")"); 
//			  getCountBtn.click();
//			  System.out.println("clicked on get count");
//			  
//			//QueryPreview
//			   Thread.sleep(500);
//			   WebElement QueryPreview= GetDriver().findElement(By.xpath("//div[@id='queryPreviewContainer']//div[6]"));
//			   System.out.println(QueryPreview.getText());
//			   
//			  GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//
//			  //search
//			  WebElement search= GetDriver().findElement(By.xpath("//a[@id='searchId']"));
//			  JavascriptExecutor js = (JavascriptExecutor)GetDriver();
//			  js.executeScript("arguments[0].click();",search);
//			  System.out.println("clicked on search");
//			  
//			//on result page
//			  GetDriver().manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
//			
			  //Frame
//			  WebDriverWait wait3=new WebDriverWait(GetDriver(), 60);
//			  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.id("resultFrameID")));
//			  WebElement iframeElement = GetDriver().findElement(By.id("resultFrameID"));
//			  GetDriver().switchTo().frame(iframeElement);				  
//	  }
	  
	  @Test
		 public void PTYP() throws Exception
		 {
		//clear
//		  WebElement clear1= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
//		  clear1.click();
//		  System.out.println("clicked on clear option");
		  
		  Thread.sleep(100);
		
		  WebElement ClickonTAC= GetDriver().findElement(By.xpath("//div[@id='main_0']"));
		  ClickonTAC.click();
		  
		  Actions action = new Actions(GetDriver());
		  action.moveToElement(ClickonTAC);
		  
			  GetDriver().findElement(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")).clear(); 
			  WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
			  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]"))).sendKeys("PTYP");
			  
			  Thread.sleep(1000);
			  WebElement SelectPTYP= GetDriver().findElement(By.xpath("//div[@id='main_0']//span[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Record Type (PTYP)')]"));
			  SelectPTYP.click();
			  
			  Thread.sleep(500);
			  
			  WebElement EnterText= GetDriver().findElement(By.xpath("//input[@id='txtLegalStatusEvent_0']"));
			  EnterText.sendKeys("Design Application");
			  Thread.sleep(500);
			  
			  //code for second tab pnc
			  WebElement ClickonSecondTAB= GetDriver().findElement(By.xpath("//div[@id='main_1']"));
			  ClickonSecondTAB.click();
			  
			  WebDriverWait wait3= new WebDriverWait(GetDriver(),60);
			  GetDriver().findElement(By.xpath("//div[@id='main_1']//input[@placeholder='Search']")).clear(); 

			  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_1']//input[@placeholder='Search']"))).sendKeys("PNC");
			  
			  WebElement selectPNC= GetDriver().findElement(By.xpath("//div[@id='main_1']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Publication No (PNC)')]"));
			                                                           
			  selectPNC.click();
			  
			  WebElement PNC= GetDriver().findElement(By.xpath("//input[@id='textDefault_1']"));
			  PNC.sendKeys("IND320481S");
		  
			  Thread.sleep(100);
			  
			  GetCountSearch_QS();	
			  
			  Thread.sleep(500);

				//validation using assert
				  WebElement validate=GetDriver().findElement(By.xpath("//label[contains(text(),'DISTRIBUTION BOARD')]"));
				  System.out.println("s1 : "+validate.getText());
				  
				  String actualText="DISTRIBUTION BOARD";
				  Assert.assertEquals(validate.getText(), actualText);
				  Thread.sleep(500);
				
				  GoToHomePage();
				  
				  SelectQuicksearch();
				   
				  
//				  try 
//				  {
//					  GetDriver().findElement(By.xpath("//label[contains(@class,'back-button')]")).click();
//					
//				} 
//				  catch (NoSuchElementException e) 
//				  {
//					  System.out.println("handled NoSuchElementException");
//
//				}
//			 WebElement backtoSearch= GetDriver().findElement(By.xpath("//label[contains(@class,'back-button')]"));
//			  backtoSearch.click();
//			  Thread.sleep(500);
					
				//clear
				  WebElement clear= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
				  clear.click();
				  System.out.println("clicked on clear option");
		
		 }
	  
	@Test  
	  public void SelectButton(String text, String txtElementName) throws Exception
		 {
		  
		  	SelectQuicksearch();
		  
			  WebElement ClickonTAC= GetDriver().findElement(By.xpath("//button[contains(text(),'Title, Abstract, Claims (TAC)')]"));
			  ClickonTAC.click();
			  WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
			  GetDriver().findElement(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")).clear(); 

			  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]"))).sendKeys("PTYP");
			  Thread.sleep(500);

			  WebElement SelectPTYP= GetDriver().findElement(By.xpath("//div[@id='main_0']//span[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Record Type (PTYP)')]"));
			  SelectPTYP.click();
			 
			  WebElement EnterText= GetDriver().findElement(By.xpath("//input[@id='txtLegalStatusEvent_0']"));
			  EnterText.sendKeys("Application");
			  Thread.sleep(500);

			  GetCountSearch_QS();
				  
			 //on result page switch to iframe
			  GetDriver().manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
				WebElement iframeElement = GetDriver().findElement(By.id("resultFrameID"));
				GetDriver().switchTo().frame(iframeElement);
				Thread.sleep(500);

				  logoutSession();
				  
		 }
	
	  @Test 
	  public void ASNP() throws Exception 
	  {	
		  
		  SelectQuicksearch();
		  List<WebElement> dropdownMenus = GetDriver().findElements(By.className("combineSubmenucont1"));
		  //WebElement ClickonTAC= GetDriver().findElement(By.xpath("//button[contains(text(),'Title, Abstract, Claims (TAC)')]"));
		  WebElement divTAC = dropdownMenus.get(0);
		  String id = divTAC.getAttribute("id");
		  System.out.println(divTAC.getAttribute("id"));
		  //WebElement clickOnTACButton =  divTAC.findElement(By.tagName("button"));
		  //clickOnTACButton.click();
		  WebDriverWait wait2= new WebDriverWait(GetDriver(),60);
		  //wait2.until(ExpectedConditions.visibilityOf(divTAC.findElement(By.xpath("//input[contains(@placeholder,'Search')]" )))).sendKeys("ASN");
		  
		  wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='" + id +  "']//input[contains(@placeholder,'Search')]"))).sendKeys("ASN");
		  Thread.sleep(1000);
		  System.out.println("entered assignee name in ASN");

		  WebElement SelectASN= divTAC.findElement(By.xpath("//span[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Assignee Orig & Norm (ASN)')]"));
		  SelectASN.click();
		 
		  WebElement EnterText= GetDriver().findElement(By.xpath("//input[@id='textASS_0']"));
		  //WebElement EnterText1= GetDriver().findElement(By.xpath("//input[@id='txtLegalStatusEvent_0']"));
			
		  //EnterText1.sendKeys(" ");
		  EnterText.sendKeys("IBM");
		  Thread.sleep(500);
	  
		  GetCountSearch_QS();
		  
			 //on result page switch to iframe
			  GetDriver().manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
				WebElement iframeElement = GetDriver().findElement(By.id("resultFrameID"));
				GetDriver().switchTo().frame(iframeElement);
				Thread.sleep(500);

				//backtosearch
				  GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				  WebElement backtoSearch= GetDriver().findElement(By.xpath("//span[contains(text(),'back to search')]"));
				//span[contains(text(),'back to search')]
				  backtoSearch.click();
				  Thread.sleep(500);
						
					//clear
					  WebElement clear= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
					  clear.click();
					  System.out.println("clicked on clear option");
		  
	  }
	  
	  @Test
	  public void PASN() throws Exception 
	  {
		//clear
		  WebElement clear1= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		  clear1.click();
		  System.out.println("clicked on clear option");
		  
		  Thread.sleep(300);
		  
		  WebElement ClickonTAC= GetDriver().findElement(By.xpath("//div[@id='main_0']"));
		  ClickonTAC.click();
		  
		  Actions action = new Actions(GetDriver());
		  action.moveToElement(ClickonTAC);
		  
		  WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")).clear(); 

		  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]"))).sendKeys("PASN");
		  
		  WebElement selectPASN= GetDriver().findElement(By.xpath("//div[@id='main_0']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Current Owner (PASN)')]"));
		                                                           
		  selectPASN.click();
		  
		  WebElement pasn= GetDriver().findElement(By.xpath("//input[@id='textASS_0']"));
		  pasn.sendKeys("Fujits");
	  
		  Thread.sleep(500);
		   
		//code for second tab pnc
		  WebElement ClickonSecondTAB= GetDriver().findElement(By.xpath("//div[@id='main_1']"));
		  ClickonSecondTAB.click();
		  
		  WebDriverWait wait3= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_1']//input[@placeholder='Search']")).clear(); 

		  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_1']//input[@placeholder='Search']"))).sendKeys("PNC");
		  
		  WebElement selectPNC= GetDriver().findElement(By.xpath("//div[@id='main_1']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Publication No (PNC)')]"));
		                                                           
		  selectPNC.click();
		  
		  WebElement PNC= GetDriver().findElement(By.xpath("//input[@id='textDefault_1']"));
		  PNC.sendKeys("CN1153020C");
	  
		  Thread.sleep(100);
		  
		  GetCountSearch_QS();	  
		  
			//validation using assert
//			  WebElement validate=GetDriver().findElement(By.xpath("//div[@id='trnumber_CN1153020C']//label[@id='lblTtl']"));
//			  System.out.println("s1 : "+validate.getText());
//			  
//			  String actualText="Air conditioner and control method of same";
//			  Assert.assertEquals(validate.getText(), actualText);
			
			  GoToHomePage();
			  
			  SelectQuicksearch();
			  
			  //clear
			  WebElement clear= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
			  clear.click();
			  System.out.println("clicked on clear option");
				  
	  } 
	  
	  @Test 
	  public void FCTPA() throws Exception 
	  {
		//clear
		  WebElement clear1= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		  clear1.click();
		  System.out.println("clicked on clear option");
		  
		  Thread.sleep(100);

		  WebElement ClickonTAC= GetDriver().findElement(By.xpath("//div[@id='main_0']"));
		  ClickonTAC.click();
		  
		  WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")).clear(); 

		  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]"))).sendKeys("FCTPA");
		  
		  wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='main_0']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Forward Citations by Applicant (FCTPA)')]"))).click();
		 
		  WebElement pasn= GetDriver().findElement(By.xpath("//input[@id='textDefault_0']"));
		  pasn.sendKeys("US6046935A");
		  
		//code for second tab pnc
		  WebElement ClickonSecondTAB= GetDriver().findElement(By.xpath("//div[@id='main_1']"));
		  ClickonSecondTAB.click();
		  
		  WebDriverWait wait3= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_1']//input[@placeholder='Search']")).clear(); 

		  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_1']//input[@placeholder='Search']"))).sendKeys("PNC");
		  
		  WebElement selectPNC= GetDriver().findElement(By.xpath("//div[@id='main_1']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Publication No (PNC)')]"));
		                                                           
		  selectPNC.click();
		  
		  WebElement PNC= GetDriver().findElement(By.xpath("//input[@id='textDefault_1']"));
		  PNC.sendKeys("US2019164616A1");
	  
		  Thread.sleep(500);
		  
		  GetCountSearch_QS();	  
		  
			//validation using assert
//			  WebElement validate=GetDriver().findElement(By.xpath("//label[contains(text(),'SENSE AMPLIFIER WITH NEGATIVE THRESHOLD SENSING FO')]"));
//			  System.out.println("s1 : "+validate.getText());
//			  
//			  String actualText="SENSE AMPLIFIER WITH NEGATIVE THRESHOLD SENSING FOR NON-VOLATILE MEMORY";
//			  Assert.assertEquals(validate.getText(), actualText);
			
			  GoToHomePage();
			  
			  SelectQuicksearch();

			//clear
			  WebElement clear= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
			  clear.click();
			  System.out.println("clicked on clear option");
	  }
	  
	  @Test
	  public void MicrosoftSmart() throws Exception
	  {
		//clear
		  WebElement clear1= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		  clear1.click();
		  System.out.println("clicked on clear option");
		  
		  Thread.sleep(100);
		  
		  WebElement ClickonTAC= GetDriver().findElement(By.xpath("//div[@id='main_0']"));
		  ClickonTAC.click();
		  
		  WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")).clear(); 

		  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]"))).sendKeys("Title");
		  
		  wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='main_0']//span[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Title (T)')]"))).click();
		 
		  WebElement EnterText= GetDriver().findElement(By.xpath("//textarea[@id='txtPatApp_0']"));
		  EnterText.sendKeys("system and method FOR ANALYSIS");
		  Thread.sleep(500);
		  
		  System.out.println("entered search term in MicrosoftSmart field");
		  Thread.sleep(100);
		//code for second tab pnc
		  WebElement ClickonSecondTAB= GetDriver().findElement(By.xpath("//div[@id='main_1']"));
		  ClickonSecondTAB.click();
		  
		  WebDriverWait wait3= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_1']//input[@placeholder='Search']")).clear(); 

		  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_1']//input[@placeholder='Search']"))).sendKeys("PNC");
		  
		  WebElement selectPNC= GetDriver().findElement(By.xpath("//div[@id='main_1']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Publication No (PNC)')]"));
		                                                           
		  selectPNC.click();
		  
		  WebElement PNC= GetDriver().findElement(By.xpath("//input[@id='textDefault_1']"));
		  PNC.sendKeys("US9610010B2");
	  
		  
		  Thread.sleep(500);
		  
		  GetCountSearch_QS();	  
		  
		  Thread.sleep(500);
			//validation using assert
//			  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
//			  System.out.println("s1 : "+validate.getText());
//			  
//			  String actualText="The system and method for analysis and game for medical treatment";
//			  Assert.assertEquals(validate.getText(), actualText);
			
			  GoToHomePage();
			  
			  SelectQuicksearch();

			  //clear
			  WebElement clear= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
			  clear.click();
			  System.out.println("clicked on clear option");
	  
	  }
	  
	  @Test
		public void ASN() throws Exception
		{
		//clear
		  WebElement clear1= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		  clear1.click();
		  System.out.println("clicked on clear option");
		  
		  Thread.sleep(100);
		  
//		  JavascriptExecutor js = (JavascriptExecutor)GetDriver();
//			WebElement ClickonTAC = GetDriver().findElement(By.xpath("//div[@id='main_0']"));
//			js.executeScript("arguments[0].click();", ClickonTAC);
			
		  WebElement ClickonTAC= GetDriver().findElement(By.id("main_0"));
		  ClickonTAC.click();
		  Actions action = new Actions(GetDriver());
		  action.moveToElement(ClickonTAC);
		  
		  WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")).clear(); 

		  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]"))).sendKeys("ASN");
		  
		  wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='main_0']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Assignee Orig & Norm (ASN)')]"))).click();
	
		  WebDriverWait wait2= new WebDriverWait(GetDriver(),60);
		  wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='textASS_0']"))).click();
		  
		  WebElement EnterText= GetDriver().findElement(By.xpath("//input[@id='textASS_0']"));
		  EnterText.sendKeys("IBM");
		  
		  Thread.sleep(200);
		  
			//code for second tab pnc
			  WebElement ClickonSecondTAB= GetDriver().findElement(By.xpath("//div[@id='main_1']"));
			  ClickonSecondTAB.click();
			  
			  WebDriverWait wait3= new WebDriverWait(GetDriver(),60);
			  GetDriver().findElement(By.xpath("//div[@id='main_1']//input[@placeholder='Search']")).clear(); 

			  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_1']//input[@placeholder='Search']"))).sendKeys("PNC");
			  
			  WebElement selectPNC= GetDriver().findElement(By.xpath("//div[@id='main_1']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Publication No (PNC)')]"));
			                                                           
			  selectPNC.click();
			  
			  WebElement PNC= GetDriver().findElement(By.xpath("//input[@id='textDefault_1']"));
			  PNC.sendKeys("US10426057B2");
		  
		  
		  Thread.sleep(500);

		  GetCountSearch_QS();	  
			  
				//validation using assert
				  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
				  System.out.println("s1 : "+validate.getText());
				  
				  String actualText="Integrated cooling in automated tape libraries";
				  Assert.assertEquals(validate.getText(), actualText);
				
				  GoToHomePage();
				  
				  SelectQuicksearch();

				  //clear
				  WebElement clear= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
				  clear.click();
				  System.out.println("clicked on clear option");
	
		}
	  
	  @Test
	  public void AddBtn() throws Exception
	  {
		  
		  Thread.sleep(1000);
		  
		  //add button
		  WebElement Add= GetDriver().findElement(By.xpath("//span[@id='btnAdd']"));
		  Add.click();
		  System.out.println("click on add option");
		  
//		  WebElement ClickonTAC= GetDriver().findElement(By.xpath("//div[@id='main_3']//button[@class='btn width100 btn-default dropdown-toggle combineEllipsis ng-binding'][contains(text(),'Title, Abstract, Claims (TAC)')]"));
//		  ClickonTAC.click();
		  
//		  WebDriverWait wait1= new WebDriverWait(GetDriver(),30);
//		  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_3']//input[@placeholder='Search']"))).sendKeys("PNC");
//		  
//		  WebElement selectPNC= GetDriver().findElement(By.xpath("//div[@id='main_3']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Publication No (PNC)')]"));                                                        
//		  selectPNC.click();
//		  
//		  WebElement PNC= GetDriver().findElement(By.xpath("//input[@id='textDefault_3']"));
//		  PNC.sendKeys("CN1153020C");
	  
		  Thread.sleep(1000);
		  
		  GoToHomePage();
		  
		  SelectQuicksearch();

		  //clear
		  WebElement clear= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		  clear.click();
		  System.out.println("clicked on clear option");
		  
		  
		  
	  }
	  
	  @Test 
	  public void MultiLanguage() throws Exception
	  {
		  //clear
		  WebElement clear1= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		  clear1.click();
		  System.out.println("clicked on clear option");
		  
		  Thread.sleep(100);
		  
		  WebElement ClickonTAC= GetDriver().findElement(By.xpath("//div[@id='main_0']"));
		  ClickonTAC.click();
		  
		  WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")).clear(); 

		  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]"))).sendKeys("TAC$");
		  
		  Thread.sleep(200);
		  
		  wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='main_0']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Title, Abstract, Claims All (TAC$)')]"))).click();
	
		  Thread.sleep(200);
		  
			  WebElement EnterText= GetDriver().findElement(By.xpath("//textarea[@id='txtPatApp_0']"));
			  EnterText.sendKeys("automobile");
			  
//			  WebElement synonym=GetDriver().findElement(By.xpath("//span[contains(text(),'cars')]"));
//			  synonym.click();
			  
			  System.out.println("entered search term in TAC$ field");
			  
			  Thread.sleep(100);
				//code for second tab pnc
				  WebElement ClickonSecondTAB= GetDriver().findElement(By.xpath("//div[@id='main_1']"));
				  ClickonSecondTAB.click();
				  
				  WebDriverWait wait3= new WebDriverWait(GetDriver(),60);
				  GetDriver().findElement(By.xpath("//div[@id='main_1']//input[@placeholder='Search']")).clear(); 

				  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_1']//input[@placeholder='Search']"))).sendKeys("PNC");
				  
				  WebElement selectPNC= GetDriver().findElement(By.xpath("//div[@id='main_1']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Publication No (PNC)')]"));
				                                                           
				  selectPNC.click();
				  
				  WebElement PNC= GetDriver().findElement(By.xpath("//input[@id='textDefault_1']"));
				  PNC.sendKeys("USD861236S");
				  
			  Thread.sleep(500);
			  
			  GetCountSearch_QS();	  
			  
				//validation using assert
				  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
				  System.out.println("s1 : "+validate.getText());
				  
				  String actualText="Automobile headlight lens";
				  Assert.assertEquals(validate.getText(), actualText);
				
				  GoToHomePage();
				  
				  SelectQuicksearch();

				  //clear
				  WebElement clear= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
				  clear.click();
				  System.out.println("clicked on clear option");
		  
	  }
	  
	  @Test
	  public void CorporateTree() throws Exception
	  {
		  
		//clear
		  WebElement clear1= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		  clear1.click();
		  System.out.println("clicked on clear option");
		  
		  Thread.sleep(100);
		  
		  WebElement ClickonTAC= GetDriver().findElement(By.xpath("//div[@id='main_0']"));
		  ClickonTAC.click();
		  
		  WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")).clear(); 

		  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]"))).sendKeys("ASN");
		  
		  wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='main_0']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Assignee Orig & Norm (ASN)')]"))).click();
	
			  WebElement EnterText= GetDriver().findElement(By.xpath("//input[@id='textASS_0']"));
			  EnterText.sendKeys("IBM");
			  
			  Thread.sleep(100);
			  
				//code for second tab pnc
				  WebElement ClickonSecondTAB= GetDriver().findElement(By.xpath("//div[@id='main_1']"));
				  ClickonSecondTAB.click();
				  
				  WebDriverWait wait3= new WebDriverWait(GetDriver(),60);
				  GetDriver().findElement(By.xpath("//div[@id='main_1']//input[@placeholder='Search']")).clear(); 

				  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_1']//input[@placeholder='Search']"))).sendKeys("PNC");
				  
				  WebElement selectPNC= GetDriver().findElement(By.xpath("//div[@id='main_1']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Publication No (PNC)')]"));
				                                                           
				  selectPNC.click();
				  
				  WebElement PNC= GetDriver().findElement(By.xpath("//input[@id='textDefault_1']"));
				  PNC.sendKeys("US10426057B2");
			  
			  Thread.sleep(500);

			  GetCountSearch_QS();	  
			  
				//validation using assert
				  WebElement validate=GetDriver().findElement(By.xpath("//label[contains(text(),'Integrated cooling in automated tape libraries')]"));
				  System.out.println("s1 : "+validate.getText());
				  
				  String actualText="Integrated cooling in automated tape libraries";
				  Assert.assertEquals(validate.getText(), actualText);
				
				  GoToHomePage();
				  
				  SelectQuicksearch();

				  //clear
				  WebElement clear= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
				  clear.click();
				  System.out.println("clicked on clear option");
	  }
	  
	@Test
	  public void TAC() throws Exception 
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
			
//		  WebElement semantic= GetDriver().findElement(By.xpath("//div[contains(@class,'modelContainer_0')]//div[contains(@class,'input-group width99')]//span[2]"));
//		  semantic.click();
//		  System.out.println("clicked on semantic search");
//		  
//		  Thread.sleep(100);
//		  WebElement selectSuggestion= GetDriver().findElement(By.xpath("//button[@id='semanticItem_0_0']"));
//		  selectSuggestion.click();
//		  
//		  Thread.sleep(100);
//		  System.out.println("selected suggestion of semantic search");		  
//		  
//		  WebElement apply= GetDriver().findElement(By.id("applybtn"));
//		  apply.click();
//		  
		  Thread.sleep(500);
		  
			//code for second tab pnc

			  WebElement ClickonSecondTAB= GetDriver().findElement(By.xpath("//div[@id='main_1']"));
			  ClickonSecondTAB.click();
			  
			  GetDriver().findElement(By.xpath("//div[@id='main_1']//input[@placeholder='Search']")).clear(); 
			  
			  WebDriverWait wait3= new WebDriverWait(GetDriver(),60);
			  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_1']//input[@placeholder='Search']"))).sendKeys("PNC");
			  
			  WebElement selectPNC= GetDriver().findElement(By.xpath("//div[@id='main_1']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Publication No (PNC)')]"));                                            
			  selectPNC.click();
			  
			  WebDriverWait wait4=new WebDriverWait(GetDriver(),60);
			  wait4.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='textDefault_1']")));
			  
			  WebElement PNC= GetDriver().findElement(By.xpath("//input[@id='textDefault_1']"));
			  PNC.sendKeys("AU2018264110A1");
		  
		  Thread.sleep(100);
		  
		  GetCountSearch_QS();	  
		  	 
			//validation using assert
			  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
			  System.out.println("s1 : "+validate.getText());
			  
			  String actualText="Methods of tissue generation";
			  Assert.assertEquals(validate.getText(), actualText);
			
			  GoToHomePage();
			  
			  SelectQuicksearch();

			  //clear
			  WebElement clear= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
			  clear.click();
			  System.out.println("clicked on clear option");
		 
	  }
	  
	@Test
	 public void CPC() throws Exception
	 {
		//clear
		  WebElement clear1= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		  clear1.click();
		  System.out.println("clicked on clear option");
		  
		  Thread.sleep(100);
		
		 WebElement ClickonTAC= GetDriver().findElement(By.xpath("//div[@id='main_0']"));
		  ClickonTAC.click();
		  
		  WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")).clear(); 

		  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]"))).sendKeys("CPC");
		  
		  wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='main_0']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'CPC Full (CPC)')]"))).click();
	
		  WebElement EnterText= GetDriver().findElement(By.xpath("//input[@id='textClass_0']"));
		  EnterText.sendKeys("G06*");
		  
		  
		  Thread.sleep(100);
		  
			//code for second tab pnc
			  WebElement ClickonSecondTAB= GetDriver().findElement(By.xpath("//div[@id='main_1']"));
			  ClickonSecondTAB.click();
			  
			  WebDriverWait wait3= new WebDriverWait(GetDriver(),60);
			  GetDriver().findElement(By.xpath("//div[@id='main_1']//input[@placeholder='Search']")).clear(); 

			  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_1']//input[@placeholder='Search']"))).sendKeys("PNC");
			  
			  WebElement selectPNC= GetDriver().findElement(By.xpath("//div[@id='main_1']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Publication No (PNC)')]"));
			                                                           
			  selectPNC.click();
			  
			  WebElement PNC= GetDriver().findElement(By.xpath("//input[@id='textDefault_1']"));
			  PNC.sendKeys(" USRE47621E");
			  
			  
		  Thread.sleep(500);

//		  WebElement selectSug= GetDriver().findElement(By.xpath("//span[contains(text(),'takes preceden')]"));
//		  selectSug.click();
		  
		  GetCountSearch_QS();	  
		  
			//validation using assert
			  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
			  System.out.println("s1 : "+validate.getText());
			  
			  String actualText="Secure transaction microcontroller with secure boot loader";
			  Assert.assertEquals(validate.getText(), actualText);
			
			  GoToHomePage();
			  
			  SelectQuicksearch();

			  //clear
			  WebElement clear= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
			  clear.click();
			  System.out.println("clicked on clear option");
		
	}
	
	 @Test 
	  public void TechDOM() throws Exception
	  {
		//clear
		  WebElement clear1= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		  clear1.click();
		  System.out.println("clicked on clear option");
		  
		  Thread.sleep(100);
		 
		 WebElement ClickonTAC= GetDriver().findElement(By.xpath("//div[@id='main_0']"));
		  ClickonTAC.click();
		  
		  WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")).clear(); 

		  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]"))).sendKeys("Tech");
		  
		  wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='main_0']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Tech. Domain (DOM)')]"))).click();
	
		  WebElement Techdom= GetDriver().findElement(By.xpath("//input[@id='txtLegalStatusEvent_0']"));
		  Techdom.sendKeys("ELECTRICAL ENGINEERING");
		  
		  System.out.println("entered search term in tech domain field");
		  
		  Thread.sleep(100);
		  
			//code for second tab pnc
			  WebElement ClickonSecondTAB= GetDriver().findElement(By.xpath("//div[@id='main_1']"));
			  ClickonSecondTAB.click();
			  
			  WebDriverWait wait3= new WebDriverWait(GetDriver(),60);
			  GetDriver().findElement(By.xpath("//div[@id='main_1']//input[@placeholder='Search']")).clear(); 

			  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_1']//input[@placeholder='Search']"))).sendKeys("PNC");
			  
			  WebElement selectPNC= GetDriver().findElement(By.xpath("//div[@id='main_1']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Publication No (PNC)')]"));
			                                                           
			  selectPNC.click();
			  
			  WebElement PNC= GetDriver().findElement(By.xpath("//input[@id='textDefault_1']"));
			  PNC.sendKeys("USRE47622E");

		  Thread.sleep(500);
		  
		  GetCountSearch_QS();	  
		  
			//validation using assert
			  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
			  System.out.println("s1 : "+validate.getText());
			  
			  String actualText="High-sensitivity subsurface sensing system";
			  Assert.assertEquals(validate.getText(), actualText);
			
			  GoToHomePage();
			  
			  SelectQuicksearch();

			  //clear
			  WebElement clear= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
			  clear.click();
			  System.out.println("clicked on clear option");
		  
	  }
	 
	@Test 
	  public void SelectSpecialChar() throws Exception
	  {
		//clear
		  WebElement clear1= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		  clear1.click();
		  System.out.println("clicked on clear option");
		  
		  Thread.sleep(100);
		  
		  WebElement ClickonTAC= GetDriver().findElement(By.xpath("//div[@id='main_0']"));
		  ClickonTAC.click();
		  
		  WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")).clear(); 

		  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]"))).sendKeys("TAC");
		  
		  wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='main_0']//span[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Title, Abstract, Claims (TAC)')]"))).click();
	
			  WebElement EnterText= GetDriver().findElement(By.xpath("//textarea[@id='txtPatApp_0']"));
			  EnterText.sendKeys(" ");
			  
			  WebElement ClickSpecialChar=GetDriver().findElement(By.xpath("//span[@class='btn btn-default CS_keyboardvirtual']"));
			  ClickSpecialChar.click();
			  
			  Thread.sleep(200);
			  
			  WebElement SelectAlpha=GetDriver().findElement(By.xpath("//div[@class='KeysContainer']//div//div[1]"));
			  SelectAlpha.click();
			  
			  WebElement CloseSpecialChar=GetDriver().findElement(By.xpath("//span[@class='closeKeyboard handPointer']"));
			  CloseSpecialChar.click();
			  
			  WebElement EnterText2= GetDriver().findElement(By.xpath("//textarea[@id='txtPatApp_0']"));
			  EnterText2.sendKeys("  ray ");
			  
			  Thread.sleep(500);
			  
				//code for second tab pnc
				  WebElement ClickonSecondTAB= GetDriver().findElement(By.xpath("//div[@id='main_1']"));
				  ClickonSecondTAB.click();
				  
				  WebDriverWait wait3= new WebDriverWait(GetDriver(),60);
				  GetDriver().findElement(By.xpath("//div[@id='main_1']//input[@placeholder='Search']")).clear(); 

				  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_1']//input[@placeholder='Search']"))).sendKeys("PNC");
				  
				  WebElement selectPNC= GetDriver().findElement(By.xpath("//div[@id='main_1']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Publication No (PNC)')]"));
				                                                           
				  selectPNC.click();
				  
				  WebElement PNC= GetDriver().findElement(By.xpath("//input[@id='textDefault_1']"));
				  PNC.sendKeys("EP2254592A2");
			  
			  Thread.sleep(500);

			  GetCountSearch_QS();	  
			  
				//validation using assert
				  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
				  System.out.println("s1 : "+validate.getText());
				  
				  String actualText="MHC MULTIMERS IN BORRELIA DIAGNOSTICS AND DISEASE";
				  Assert.assertEquals(validate.getText(), actualText);
				
				  GoToHomePage();
				  
				  SelectQuicksearch();

				  //clear
				  WebElement clear= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
				  clear.click();
				  System.out.println("clicked on clear option");
		
	  }
  
	  @Test
	  public void TechSubDOM() throws Exception
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

		  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]"))).sendKeys("Tech");
		  
		  wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='main_0']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Tech. Sub Domain (SDOM)')]"))).click();
	
		  WebElement TechSubDom= GetDriver().findElement(By.xpath("//input[@id='txtLegalStatusEvent_0']"));
		  TechSubDom.sendKeys("COMPUTER TECHNOLOGY");
		  
		  System.out.println("entered search term in tech sub domain  field");
		  
		  Thread.sleep(100);
		//code for second tab pnc
		  WebElement ClickonSecondTAB= GetDriver().findElement(By.xpath("//div[@id='main_1']"));
		  ClickonSecondTAB.click();
		  
		  WebDriverWait wait3= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_1']//input[@placeholder='Search']")).clear(); 

		  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_1']//input[@placeholder='Search']"))).sendKeys("PNC");
		  
		  WebElement selectPNC= GetDriver().findElement(By.xpath("//div[@id='main_1']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Publication No (PNC)')]"));
		                                                           
		  selectPNC.click();
		  
		  WebElement PNC= GetDriver().findElement(By.xpath("//input[@id='textDefault_1']"));
		  PNC.sendKeys("US2019274236A1");

		  Thread.sleep(500);
	  
		  GetCountSearch_QS();	  
	  
		//validation using assert
		  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		  System.out.println("s1 : "+validate.getText());
		  
		  String actualText="POWER CONVERSION DEVICE";
		  Assert.assertEquals(validate.getText(), actualText);
		
		  GoToHomePage();
		  
		  SelectQuicksearch();

		  //clear
		  WebElement clear= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		  clear.click();
		  System.out.println("clicked on clear option");
	   
	  }
	  
	  
	  @Test
	  public void FCTPX() throws Exception
	  {
		//clear
		  WebElement clear1= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		  clear1.click();
		  System.out.println("clicked on clear option");
		  
		  Thread.sleep(100);
		  
		  WebElement ClickonTAC= GetDriver().findElement(By.xpath("//div[@id='main_0']"));
		  ClickonTAC.click();
		  
		  WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")).clear(); 

		  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]"))).sendKeys("FCTPX");
	
		  Thread.sleep(200);
		  wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='main_0']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Forward Citations by Examiner (FCTPX)')]"))).click();
	
		  Thread.sleep(200);
		  WebElement FCTPX= GetDriver().findElement(By.xpath("//input[@id='textDefault_0']"));
		  FCTPX.sendKeys("WO2014150626A1");
		  
		  System.out.println("entered search term in FCTPX field");
		  
		  Thread.sleep(100);
		//code for second tab pnc
		  WebElement ClickonSecondTAB= GetDriver().findElement(By.xpath("//div[@id='main_1']"));
		  ClickonSecondTAB.click();
		  
		  WebDriverWait wait3= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_1']//input[@placeholder='Search']")).clear(); 

		  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_1']//input[@placeholder='Search']"))).sendKeys("PNC");
		  
		  WebElement selectPNC= GetDriver().findElement(By.xpath("//div[@id='main_1']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Publication No (PNC)')]"));
		                                                           
		  selectPNC.click();
		  
		  WebElement PNC= GetDriver().findElement(By.xpath("//input[@id='textDefault_1']"));
		  PNC.sendKeys("WO2016186380A1");

		  Thread.sleep(1000);
	  
		  GetCountSearch_QS();	  
	  
		//validation using assert
		  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		  System.out.println("s1 : "+validate.getText());
		  
		  String actualText="UNMANNED SMART CAR CAPABLE OF RESCUE AND METHOD OF OPERATING SAME";
		  Assert.assertEquals(validate.getText(), actualText);
		
		  Thread.sleep(1000);
		  
		  GoToHomePage();
		  
		  Thread.sleep(1000);
		  
		  SelectQuicksearch();
		  
		  Thread.sleep(1000);

		  //clear
		  WebElement clear= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		  clear.click();
		  System.out.println("clicked on clear option");
	  
		  
	  }
	  
	
	  @Test
	  public void LSC() throws Exception
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

		  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]"))).sendKeys("LSC");
		  
		  wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='main_0']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Current Legal Status (LSC)')]"))).click();
	
		  WebElement LSC= GetDriver().findElement(By.xpath("//input[@id='txtLegalStatusEvent_0']"));
		  LSC.sendKeys("Active Granted");
		  
		  System.out.println("entered search term in LSC field"); 
		  
		  Thread.sleep(100);
		  
			//code for second tab pnc
			  WebElement ClickonSecondTAB= GetDriver().findElement(By.xpath("//div[@id='main_1']"));
			  ClickonSecondTAB.click();
			  
			  WebDriverWait wait3= new WebDriverWait(GetDriver(),60);
			  GetDriver().findElement(By.xpath("//div[@id='main_1']//input[@placeholder='Search']")).clear(); 

			  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_1']//input[@placeholder='Search']"))).sendKeys("PNC");
			  
			  WebElement selectPNC= GetDriver().findElement(By.xpath("//div[@id='main_1']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Publication No (PNC)')]"));
			                                                           
			  selectPNC.click();
			  
			  WebElement PNC= GetDriver().findElement(By.xpath("//input[@id='textDefault_1']"));
			  PNC.sendKeys("USRE47622E");

			  Thread.sleep(500);
		  
			  GetCountSearch_QS();	  
		  
			//validation using assert
			  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
			  System.out.println("s1 : "+validate.getText());
			  
			  String actualText="High-sensitivity subsurface sensing system";
			  Assert.assertEquals(validate.getText(), actualText);
			
			  GoToHomePage();
			  
			  SelectQuicksearch();

			  //clear
			  WebElement clear= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
			  clear.click();
			  System.out.println("clicked on clear option");
		  
	  }
	  
	  @Test 
	  public void PreviewBox() throws Exception 
	  {
		  //clear
		  WebElement clear1= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		  clear1.click();
		  System.out.println("clicked on clear option");
		  
		//code for second tab pnc
		  WebElement ClickonSecondTAB= GetDriver().findElement(By.xpath("//div[@id='main_1']"));
		  ClickonSecondTAB.click();
		  
		  WebDriverWait wait3= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_1']//input[@placeholder='Search']")).clear(); 

		  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_1']//input[@placeholder='Search']"))).sendKeys("PNC");
		  
		  WebElement selectPNC= GetDriver().findElement(By.xpath("//div[@id='main_1']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Publication No (PNC)')]"));
		                                                           
		  selectPNC.click();
		  
		  WebElement PNC= GetDriver().findElement(By.xpath("//input[@id='textDefault_1']"));
		  PNC.sendKeys("US2019164616A1");
	  
		  Thread.sleep(500);
		  
		  WebElement QueryPreview= GetDriver().findElement(By.xpath("//div[@id='queryPreviewContainer']//div[6]"));
		  System.out.println(QueryPreview.getText());
		  
		  //clear
		  WebElement clear= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		  clear.click();
		  System.out.println("clicked on clear option");
		  
		  GoToHomePage();
		  
		  SelectQuicksearch();

	  }
	  
	  
	  @Test 
	  public void CountrySelection() throws Exception
	  {
		//clear
//		  WebElement clear1= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
//		  clear1.click();
//		  System.out.println("clicked on clear option");
		  
		  Thread.sleep(1000);
		  
		  WebElement ClickonTAC= GetDriver().findElement(By.xpath("//div[@id='main_0']"));
		  ClickonTAC.click();
		  
		  WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")).clear(); 

		  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]"))).sendKeys("TA");
		  
		  wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='main_0']//span[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Title, Abstract (TA)')]"))).click();
	
		  WebElement EnterText= GetDriver().findElement(By.xpath("//textarea[@id='txtPatApp_0']"));
		  EnterText.sendKeys("fiber cell");
			  
		  Thread.sleep(1000);
		  		  
		//country dropdown
		  WebElement dropdown= GetDriver().findElement(By.xpath("//span[@class='token-label']"));
		  dropdown.click();
		  
		  //code to unselect aelect all checkbox
		  WebElement SelectAll= GetDriver().findElement(By.xpath("//label[contains(text(),'Select all')]//input"));
		  SelectAll.click();
		  
		  Thread.sleep(1000);
		  
		  WebElement selectUS=GetDriver().findElement(By.xpath("//label[contains(text(),'US - United States of America')]"));
		  selectUS.click();
		  
		  WebElement SelectEP=GetDriver().findElement(By.xpath("//label[contains(text(),'EP - European Patent Office')]"));
		  SelectEP.click();
		  
		  Thread.sleep(1000);
		  
		  GetCountSearch_QS();	
		  
		//for search within
//		  WebDriverWait wait2= new WebDriverWait(GetDriver(),60);
//		  wait2.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(".//*[@id='leftUpperPanel_filterContainer']")));
//		  
//		  WebElement clickonSearchWithin=GetDriver().findElement(By.xpath("//body[@class='pageBody ui-widget ng-scope']/form[@id='form1']/div[@class='ui-widget forclear']/div[@id='divDisplay']/div[@class='forclear']/div[@id='leftLowerPanelContainer']/div[@class='leftContent']/div[@class='ng-scope']/div[@class='flt-mim-wth ng-scope']/div[@id='leftUpperPanel_filterContainer']/div[@class='filters forclear']/div[@id='SearchSummaryContainer']/div[@id='leftUpperPanel_SearchSummaryContainer_filterContainer']/div[3]/div[1]"));
//		  clickonSearchWithin.click();
//		  	
//		  WebElement searchwithin=GetDriver().findElement(By.xpath("//div[@class='width100 ng-scope']//textarea[@id='SearchTerm']"));
//		  searchwithin.sendKeys("PNC:US2019101698A1");
//		  
//		  WebElement ApplyFilter= GetDriver().findElement(By.xpath(".//*[@id='leftUpperPanel_filterContainer']/div[1]/button[2]"));
//		  ApplyFilter.click();
//		  System.out.println("clicked on apply filter");
		  
		  //validation
//		  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
//		  System.out.println("s1 : "+validate.getText());
//		  
//		  String actualText="FLUID-FILLED HOLLOW OPTICAL FIBER CELL";
//		  Assert.assertEquals(validate.getText(), actualText);
//		
		  Thread.sleep(1000);
		  
		  GoToHomePage();
		  
		  SelectQuicksearch();

		  //clear
		  WebElement clear= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		  clear.click();
		  System.out.println("clicked on clear option");
		  
		  Thread.sleep(1000);
		  
		  //again select country dropdown
		  WebElement dropdown2= GetDriver().findElement(By.xpath("//span[@class='token-label']"));
		  dropdown2.click();
		  
		  Thread.sleep(500);

		//code to unselect aelect all checkbox
		  WebElement SelectAll2= GetDriver().findElement(By.xpath("//label[contains(text(),'Select all')]//input"));
		  SelectAll2.click();
	  }
	  
	  
	  @Test 
	  public void QueryAnalyzer() throws Exception
	  {
		  
		//clear
//		  WebElement clear1= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
//		  clear1.click();
//		  System.out.println("clicked on clear option");
		  
		  Thread.sleep(200);
		  
		  WebElement ClickonTAC= GetDriver().findElement(By.xpath("//div[@id='main_0']"));
		  ClickonTAC.click();
		  
		  WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")).clear(); 

		  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]"))).sendKeys("TA");
		  
		  wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='main_0']//span[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Title, Abstract (TA)')]"))).click();
	
		  Thread.sleep(200);
		  
			  WebElement EnterText= GetDriver().findElement(By.xpath("//textarea[@id='txtPatApp_0']"));
			  EnterText.sendKeys("nanotechnology");
			  
			  Thread.sleep(100);
			  
			  //getcount
			  WebDriverWait wait3= new WebDriverWait(GetDriver(),60);
			  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Get Count')]")));
			  WebElement getCountBtn= GetDriver().findElement(By.xpath("//a[contains(text(),'Get Count')]"));
			  System.out.println(getCountBtn.getText());
			  
			  ((JavascriptExecutor)GetDriver()).executeScript("window.scrollTo(0,"+ getCountBtn.getLocation().y +")"); 
			  getCountBtn.click();
			  System.out.println("clicked on get count");
			  
			  Thread.sleep(1000);
		
			  WebDriverWait wait2= new WebDriverWait(GetDriver(),60);
			  wait2.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='floatLeft rightSpacer']//div[@class='floatLeft']")));
			  
			  Thread.sleep(500);
			  
			  WebElement QueryAnalyzer=GetDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_lblCntrl_lblSearchCount']"));
			  QueryAnalyzer.click();
			  System.out.println(QueryAnalyzer.getText());
			  
			  Thread.sleep(1000);
			  
			  WebElement Window_of_QueryAlalyzer=GetDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_lblCntrl_divSearchAnalysisCntrlNG']"));
			  Window_of_QueryAlalyzer.click();
			  
			  Thread.sleep(1000);
			  
			  //validtion  
			  WebElement validate1=GetDriver().findElement(By.xpath("//*[@id='tblQueryAnalyzerId']/tbody/tr/td[1]"));
			  System.out.println("s1 : "+validate1.getText());
			  
			  String actualText="TA:nanotechnology";
			  Assert.assertEquals(validate1.getText(), actualText);
			
			  Thread.sleep(1000);
			  
//			  WebElement validate2=GetDriver().findElement(By.xpath("//*[@id='tblQueryAnalyzerId']/tbody/tr/td[2]"));
//			  System.out.println("s1 : "+validate2.getText());
			  
//			  String actualText2="3863";
//			  Assert.assertEquals(validate2.getText(), actualText2);
//			 
			  GoToHomePage();
				  
			  SelectQuicksearch();

			  //clear
			  WebElement clear= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
			  clear.click();
			  System.out.println("clicked on clear option");
		 
	  }
	  
	  @Test
	  public void PubDate() throws Exception
	  {
		//clear
		  WebElement clear1= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		  clear1.click();
		  System.out.println("clicked on clear option");
		  
		  Thread.sleep(100);
		
		 WebElement ClickonTAC= GetDriver().findElement(By.id("main_0"));
		  ClickonTAC.click();
		  
		  GetDriver().findElement(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")).clear();
		  
		  WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]"))).sendKeys("PBD");
		  
		  wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='main_0']//span[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Pub. Date (PBD)')]"))).click();
	
		  WebElement Date1= GetDriver().findElement(By.xpath("//div[@class='modelContainer_0']//div[@class='floatLeft col-xs-6 col-sm-6 col-md-6 col-lg-6 combineAlignPadding row']//input[1]"));
		  Date1.sendKeys("2010");
		  
		  WebElement date2=GetDriver().findElement(By.xpath("//div[@class='modelContainer_0']//input[2]"));
		  date2.sendKeys("2014");
		  
		  Thread.sleep(100);
		  
		//code for second tab pnc
		  WebElement ClickonSecondTAB= GetDriver().findElement(By.xpath("//div[@id='main_1']"));
		  ClickonSecondTAB.click();
		  
		  Thread.sleep(200);
		  WebDriverWait wait3= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_1']//input[@placeholder='Search']")).clear(); 

		  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_1']//input[@placeholder='Search']"))).sendKeys("PNC");
		  
		  WebElement selectPNC= GetDriver().findElement(By.xpath("//div[@id='main_1']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Publication No (PNC)')]"));
		                                                           
		  selectPNC.click();
		  
		  WebElement PNC= GetDriver().findElement(By.xpath("//input[@id='textDefault_1']"));
		  PNC.sendKeys("WO2014209889A1");

		  Thread.sleep(500);
	  
		  GetCountSearch_QS();	  
	  
		//validation using assert
		  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		  System.out.println("s1 : "+validate.getText());
		  
		  String actualText="SYSTEM AND METHOD FOR ANTIVIRUS PROTECTION";
		  Assert.assertEquals(validate.getText(), actualText);
		
		  GoToHomePage();
		  
		  SelectQuicksearch();

		  //clear
		  WebElement clear= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		  clear.click();
		  System.out.println("clicked on clear option");
		  
	  }
	  
	  
	  @Test
	  public void SearchScript() throws Exception
	  {
		  
		//clear
		  WebElement clear1= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		  clear1.click();
		  System.out.println("clicked on clear option");
		  
		  Thread.sleep(100);
		  
		  //enable script
		  WebElement enableScript= GetDriver().findElement(By.xpath("//span[@class='floatLeft']//input[@id='Checkbox1']"));
		  enableScript.click();
		  
		  Thread.sleep(500);
		  WebElement ClickonTAC= GetDriver().findElement(By.xpath("//div[@id='main_0']"));
		  ClickonTAC.click();
		  
		  WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")).clear(); 

		  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]"))).sendKeys("BCT");
		  
		  wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='main_0']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Backward Citations (BCT)')]"))).click();
		 
		  WebElement pasn= GetDriver().findElement(By.xpath("//input[@id='textDefault_0']"));
		  pasn.sendKeys("US6000000A");
		  
		//code for second tab pnc
		  WebElement ClickonSecondTAB= GetDriver().findElement(By.xpath("//div[@id='main_1']"));
		  ClickonSecondTAB.click();
		  
		  WebDriverWait wait3= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_1']//input[@placeholder='Search']")).clear(); 

		  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_1']//input[@placeholder='Search']"))).sendKeys("PNC");
		  
		  WebElement selectPNC= GetDriver().findElement(By.xpath("//div[@id='main_1']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Publication No (PNC)')]"));
		                                                           
		  selectPNC.click();
		  
		  WebElement PNC= GetDriver().findElement(By.xpath("//input[@id='textDefault_1']"));
		  PNC.sendKeys("US5857201A");
	  
		  Thread.sleep(500);
		  
		  //getcount
			 WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
			  wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@ng-click='getCount()']")));
			  WebElement getCountBtn= GetDriver().findElement(By.xpath("//a[@ng-click='getCount()']"));
			  System.out.println(getCountBtn.getText());
			  
			  ((JavascriptExecutor)GetDriver()).executeScript("window.scrollTo(0,"+ getCountBtn.getLocation().y +")"); 
			  getCountBtn.click();
			  System.out.println("clicked on get count");
			  
			  //validate script
			  WebElement validate= GetDriver().findElement(By.xpath("//div[@id='tabs-script']//tr[2]//td[2]//div[1]//div[1]//div[2]"));
				System.out.println(validate.getText());
				
				
				GoToHomePage();
				  
				  SelectQuicksearch();

				  //clear
				  WebElement clear= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
				  clear.click();
				  System.out.println("clicked on clear option");
		  
	  }
	 
	  @Test 
	  public void BCT() throws Exception
	  {
		//clear
		  WebElement clear1= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		  clear1.click();
		  System.out.println("clicked on clear option");
		  
		  Thread.sleep(500);
		  
		  WebElement ClickonTAC= GetDriver().findElement(By.xpath("//div[@id='main_0']"));
		  ClickonTAC.click();
		  
		  WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")).clear(); 

		  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]"))).sendKeys("BCT");
		  
		  Thread.sleep(300);
		  
		  wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='main_0']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Backward Citations (BCT)')]"))).click();
		 
		  WebElement pasn= GetDriver().findElement(By.xpath("//input[@id='textDefault_0']"));
		  pasn.sendKeys("US6000000A");
		  
		  Thread.sleep(100);

		//code for second tab pnc
		  WebElement ClickonSecondTAB= GetDriver().findElement(By.xpath("//div[@id='main_1']"));
		  ClickonSecondTAB.click();
		  
		  WebDriverWait wait2= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_1']//input[@placeholder='Search']")).clear(); 

		  wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_1']//input[@placeholder='Search']"))).sendKeys("PNC");
		  
		  WebElement selectPNC= GetDriver().findElement(By.xpath("//div[@id='main_1']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Publication No (PNC)')]"));
		                                                           
		  selectPNC.click();
		  
		  WebElement PNC= GetDriver().findElement(By.xpath("//input[@id='textDefault_1']"));
		  PNC.sendKeys("US5857201A");
	  
		  Thread.sleep(500);
		  
		  GetCountSearch_QS();	  
		  
			  Thread.sleep(500);
			 
//			  WebElement Results=GetDriver().findElement(By.xpath("//div[@id='trnumber_US5857201A']"));
//			  Results.click();
			//validation using assert
			  WebDriverWait wait4= new WebDriverWait(GetDriver(),90);
			  wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
			  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
			  System.out.println("s1 : "+validate.getText());
			  
			  String actualText="Enterprise connectivity to handheld devices";
			  Assert.assertEquals(validate.getText(), actualText);
			  
			  Thread.sleep(500);
		  
			  GoToHomePage();
			  
			  SelectQuicksearch();

			  //clear
			  WebElement clear= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
			  clear.click();
			  System.out.println("clicked on clear option");
		  
	  }
	  
	  @Test
	  public void FCT() throws Exception
	  {
		//clear
		  
		  //--------------------------------part1-------------------------------------
		  WebElement clear1= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		  clear1.click();
		  System.out.println("clicked on clear option");
		  
		  Thread.sleep(1000);
		  
		  WebElement ClickonTAC= GetDriver().findElement(By.xpath("//div[@id='main_0']"));
		  ClickonTAC.click();
		  
		  WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")).clear(); 
		//----------------------------------------part1-----------------------------------------------

		  //below lines to be changed with corresponding xpath
		  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]"))).sendKeys("FCT");
		  
		  wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='main_0']//span[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Forward Citations (FCT)')]"))).click();
		 
		  WebElement pasn= GetDriver().findElement(By.xpath("//input[@id='textDefault_0']"));
		  pasn.sendKeys("US6000000A");
		  
		//for assertion : code for second tab pnc
		  
		  Thread.sleep(500);
		  //------------------------------part2---------------------------
		  WebElement ClickonSecondTAB= GetDriver().findElement(By.xpath("//div[@id='main_1']"));
		  ClickonSecondTAB.click();
		  
		  WebDriverWait wait3= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_1']//input[@placeholder='Search']")).clear(); 
		  
		  Thread.sleep(500);
		  
		  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_1']//input[@placeholder='Search']"))).sendKeys("PNC");		  
		  WebElement selectPNC= GetDriver().findElement(By.xpath("//div[@id='main_1']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Publication No (PNC)')]"));		                                                         
		  selectPNC.click();
		  
		  WebElement PNC= GetDriver().findElement(By.xpath("//input[@id='textDefault_1']"));
			//----------------------------part2-------------------------------

		  //below number to be change according to test case
		  PNC.sendKeys("US10278041B2");
	    
		  
		  //-------------------------------part3-------------------------
		  Thread.sleep(500);
		  
		  GetCountSearch_QS();	  
		  //-------------------------------part3---------------------------------
		 
		
			  Thread.sleep(500);
			  
			//validation using assert
			  WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
			  wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
			  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
			  System.out.println("s1 : "+validate.getText());
			  
			  String actualText="System and method for remote asset management";
			  Assert.assertEquals(validate.getText(), actualText);
			  
			  Thread.sleep(500);
			  
			  //-----------------------------part4-------------------------
			
			  GoToHomePage();
			  
			  SelectQuicksearch();

			  //clear
			  WebElement clear= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
			  clear.click();
			  System.out.println("clicked on clear option");
			  //-----------------------------------part4--------------------------------------------------
	  }
	  
	  @Test 
	  public void SFAMEFAM() throws Exception
	  {
		//clear
		  WebElement clear1= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		  clear1.click();
		  System.out.println("clicked on clear option");
		  
		  Thread.sleep(100);
		  
		  WebElement ClickonTAC= GetDriver().findElement(By.xpath("//div[@id='main_0']"));
		  ClickonTAC.click();
		  
		  WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")).clear(); 

		  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]"))).sendKeys("Extended Families");
		  
		  wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='main_0']//span[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Extended Families (EFAM)')]"))).click();
		 
		  WebElement SFAMEFAM= GetDriver().findElement(By.xpath("//input[@id='textDefault_0']"));
		  SFAMEFAM.sendKeys("US2006004229A1");
		  
		  System.out.println("entered search term in SFAM/EFAM field"); 
		  
		//code for second tab pnc
		  WebElement ClickonSecondTAB= GetDriver().findElement(By.xpath("//div[@id='main_1']"));
		  ClickonSecondTAB.click();
		  
		  WebDriverWait wait3= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_1']//input[@placeholder='Search']")).clear(); 

		  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_1']//input[@placeholder='Search']"))).sendKeys("PNC");
		  
		  WebElement selectPNC= GetDriver().findElement(By.xpath("//div[@id='main_1']//span[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Publication No (PNC)')]"));
		                                                           
		  selectPNC.click();
		  
		  WebElement PNC= GetDriver().findElement(By.xpath("//input[@id='textDefault_1']"));
		  PNC.sendKeys("US8431743B2");
	  
		  Thread.sleep(100);
		  
		  
		  Thread.sleep(500);
		  
		  GetCountSearch_QS();	  
		  
			//validation using assert
			  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
			  System.out.println("s1 : "+validate.getText());
			  
			  String actualText="Preparation of acrylic acid by heterogeneously catalyzed partial gas phase oxidation of propylene";
			  Assert.assertEquals(validate.getText(), actualText);
			
			  GoToHomePage();
			  
			  SelectQuicksearch();

			  //clear
			  WebElement clear= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
			  clear.click();
			  System.out.println("clicked on clear option");
		
	  }
	  
	  @Test
	  public void SIM() throws Exception
	  {
		//clear
		  WebElement clear1= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		  clear1.click();
		  System.out.println("clicked on clear option");
		  
		  Thread.sleep(500);
		  
//		  JavascriptExecutor js = (JavascriptExecutor)GetDriver();
//			WebElement ClickonTAC = GetDriver().findElement(By.xpath("//div[@id='main_0']"));
//			js.executeScript("arguments[0].click();", ClickonTAC);
		  
		  WebElement ClickonTAC= GetDriver().findElement(By.xpath("//div[@id='main_0']"));
		  ClickonTAC.click();
		  
		  GetDriver().findElement(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")).clear(); 
		  
		  WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]"))).sendKeys("SIM");
		  wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='main_0']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Similar Patents (SIM)')]"))).click();
		 
		  Thread.sleep(100);
		  WebElement SIM= GetDriver().findElement(By.xpath("//input[@id='textDefault_0']"));
		  SIM.sendKeys("US6000000A");
		  
		  System.out.println("entered search term in SIM field");
		  
		//code for second tab pnc
		  WebElement ClickonSecondTAB= GetDriver().findElement(By.xpath("//div[@id='main_1']"));
		  ClickonSecondTAB.click();
		  
		  WebDriverWait wait3= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_1']//input[@placeholder='Search']")).clear(); 

		  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_1']//input[@placeholder='Search']"))).sendKeys("PNC");
		  
		  WebElement selectPNC= GetDriver().findElement(By.xpath("//div[@id='main_1']//span[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Publication No (PNC)')]"));
		                                                           
		  selectPNC.click();
		  
		  WebElement PNC= GetDriver().findElement(By.xpath("//input[@id='textDefault_1']"));
		  PNC.sendKeys("CN109976953A");
	  
		  Thread.sleep(100);
		  
		  GetCountSearch_QS();	  
		  
			//validation using assert
			  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
			  System.out.println("s1 : "+validate.getText());
			  
			  String actualText="Data backup method";
			  Assert.assertEquals(validate.getText(), actualText);
			
			  GoToHomePage();
			  
			  SelectQuicksearch();

			  //clear
			  WebElement clear= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
			  clear.click();
			  System.out.println("clicked on clear option");
		
	  }
	  
	  
	  @Test
	  public void INC() throws Exception
	  { 
		//clear
		  WebElement clear1= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		  clear1.click();
		  System.out.println("clicked on clear option");
		  
		  Thread.sleep(100);
		
		  WebElement ClickonTAC= GetDriver().findElement(By.id("main_0"));
		  ClickonTAC.click();
		  
		  WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")).clear(); 

		  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]"))).sendKeys("INC");
		  
		  wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='main_0']//span[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Indep. Claims (INC)')]"))).click();
	
		  WebElement EnterText= GetDriver().findElement(By.xpath("//textarea[@id='txtPatApp_0']"));
		  EnterText.sendKeys("Serial");
		  
		  Thread.sleep(100);
		  
		//code for second tab pnc
		  WebElement ClickonSecondTAB= GetDriver().findElement(By.xpath("//div[@id='main_1']"));
		  ClickonSecondTAB.click();
		  
		  WebDriverWait wait3= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_1']//input[@placeholder='Search']")).clear(); 

		  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_1']//input[@placeholder='Search']"))).sendKeys("PNC");
		  
		  WebElement selectPNC= GetDriver().findElement(By.xpath("//div[@id='main_1']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Publication No (PNC)')]"));
		                                                           
		  selectPNC.click();
		  
		  WebElement PNC= GetDriver().findElement(By.xpath("//input[@id='textDefault_1']"));
		  PNC.sendKeys("US10251797B2");

		  Thread.sleep(500);
	  
		  GetCountSearch_QS();	  
	  
		//validation using assert
		  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		  System.out.println("s1 : "+validate.getText());
		  
		  String actualText="Hospital bed";
		  Assert.assertEquals(validate.getText(), actualText);
		
		  GoToHomePage();
		  
		  SelectQuicksearch();

		  //clear
		  WebElement clear= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		  clear.click();
		  System.out.println("clicked on clear option");
		  
	  }
	  
	  @Test 
	  public void SOI() throws Exception
	  {
		//clear
		  WebElement clear1= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		  clear1.click();
		  System.out.println("clicked on clear option");
		  
		  Thread.sleep(100);
		  
		  WebElement ClickonTAC= GetDriver().findElement(By.xpath("//div[@id='main_0']"));
		  ClickonTAC.click();
		  
		  WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")).clear(); 

		  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]"))).sendKeys("SOI");
		  
		  Thread.sleep(200);
		  wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='main_0']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Summary of Invention (SOI)')]"))).click();

		  Thread.sleep(200);
		  WebElement SOI= GetDriver().findElement(By.xpath("//textarea[@id='txtPatApp_0']"));
		  SOI.sendKeys("((fan OR motor) AND blow*)");
		  
		  System.out.println("entered search term in SOI field"); 
		  
		  Thread.sleep(100);
		  
			//code for second tab pnc
			  WebElement ClickonSecondTAB= GetDriver().findElement(By.xpath("//div[@id='main_1']"));
			  ClickonSecondTAB.click();
			  
			  WebDriverWait wait3= new WebDriverWait(GetDriver(),60);
			  GetDriver().findElement(By.xpath("//div[@id='main_1']//input[@placeholder='Search']")).clear(); 

			  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_1']//input[@placeholder='Search']"))).sendKeys("PNC");
			  
			  WebElement selectPNC= GetDriver().findElement(By.xpath("//div[@id='main_1']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Publication No (PNC)')]"));
			                                                           
			  selectPNC.click();
			  
			  WebElement PNC= GetDriver().findElement(By.xpath("//input[@id='textDefault_1']"));
			  PNC.sendKeys("EP2573476B1");

			  Thread.sleep(500);
		  
			  GetCountSearch_QS();	  
		  
			//validation using assert
			  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
			  System.out.println("s1 : "+validate.getText());
			  
			  String actualText="Air conditioning apparatus";
			  Assert.assertEquals(validate.getText(), actualText);
			
			  GoToHomePage();
			  
			  SelectQuicksearch();

			  //clear
			  WebElement clear= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
			  clear.click();
			  System.out.println("clicked on clear option");
		   
	  }
	  
	  
	  @Test 
		public void BacktoSearch() throws Exception
		{
			GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			WebElement backtoSearch= GetDriver().findElement(By.xpath("//span[contains(text(),'back to search')]"));
			backtoSearch.click();
			Thread.sleep(5000);
		}
	  
	  @Test 
	  public void Clear()
	  {
		  WebElement clear= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		  clear.click();
		  System.out.println("clicked on clear option");
	  }
	  
	 
	 @Test
	 public void LSE() throws Exception
	 {
		//clear
//		  WebElement clear1= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
//		  clear1.click();
//		  System.out.println("clicked on clear option");
		  
		  Thread.sleep(400);
		  
		  WebElement ClickonTAC= GetDriver().findElement(By.xpath("//div[@id='main_0']"));
		  ClickonTAC.click();
		  
		  WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")).clear(); 

		  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]"))).sendKeys("TAC");
		  
		  wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='main_0']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Title, Abstract, Claims (TAC)')]"))).click();
	
		  WebElement TAC= GetDriver().findElement(By.xpath("//textarea[@id='txtPatApp_0']"));
		  TAC.sendKeys("acrylic acid");
		  
		  System.out.println("entered search term in TAC field"); 
		  
		  Thread.sleep(200);
		  
			//code for second tab for selecting LSE field
			  WebElement ClickonSecondTAB= GetDriver().findElement(By.xpath("//div[@id='main_1']"));
			  ClickonSecondTAB.click();
			  
			  WebDriverWait wait3= new WebDriverWait(GetDriver(),60);
			  GetDriver().findElement(By.xpath("//div[@id='main_1']//input[@placeholder='Search']")).clear(); 

			  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_1']//input[contains(@placeholder,'Search')]"))).sendKeys("LSE");
			  
			  WebElement SelectLSE= GetDriver().findElement(By.xpath("//div[@id='main_1']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Legal Status Events (LSE)')]"));                                                        
			  SelectLSE.click();
			  
			  WebElement LSEQueryBuilder= GetDriver().findElement(By.xpath("//div[contains(@class,'paddingLeft1per ng-scope')]//span[contains(@class,'btn btn-default')]"));
			  LSEQueryBuilder.click();
			  
			  //code for focus in a textbox
//			  JavascriptExecutor jse = (JavascriptExecutor) GetDriver();
//			  jse.executeScript("document.getElementById('txtCountry').focus();");
			  
//			  new Actions(GetDriver()).moveToElement(By.xpath("")).perform();

			  WebElement LSECountry=GetDriver().findElement(By.xpath("//input[@id='txtCountry']"));
			  LSECountry.sendKeys("US OR EP");

			  Thread.sleep(400);
			  
			  WebElement LSEYear=GetDriver().findElement(By.xpath("//input[@id='txtPRSYear']"));
			  LSEYear.sendKeys("2005");
			  
			  Thread.sleep(400);
			  
			  WebElement ClickonApply=GetDriver().findElement(By.xpath("//span[@id='Button3']"));
			  ClickonApply.click();
			  
			  Thread.sleep(1000);
		  
			  //Code for PNC
			  WebElement SelectPNC=GetDriver().findElement(By.xpath("//div[@id='main_2']"));
			  SelectPNC.click();
			  
			  GetDriver().findElement(By.xpath("//div[@id='main_2']//input[contains(@placeholder,'Search')]")).sendKeys("PNC");
			  GetDriver().findElement(By.xpath("//div[@id='main_2']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Publication No (PNC)')]")).click();
			  
			  WebElement SearchPNKC=GetDriver().findElement(By.xpath("//input[@id='textDefault_2']"));
			  SearchPNKC.sendKeys("US7553918B2");
			  
			  GetCountSearch_QS();	  
		  
			//validation using assert
//			  WebDriverWait wait4= new WebDriverWait(GetDriver(),90);
//			  wait4.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[@id='lblTtl']")));
			  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
			  System.out.println("s1 : "+validate.getText());
			  
			  String actualText="pH-sensitive polymer";
			  Assert.assertEquals(validate.getText(), actualText);
			  
			  Thread.sleep(500);
			
			  GoToHomePage();
			  
			  SelectQuicksearch();

			  //clear
			  WebElement clear= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
			  clear.click();
			  System.out.println("clicked on clear option");
		 
	 }
	 
	 @Test
	 public void LimitByInv() throws Exception
	 {
		//clear
		  WebElement clear1= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		  clear1.click();
		  System.out.println("clicked on clear option");
		  
		  Thread.sleep(100);
		  WebElement ClickonTAC= GetDriver().findElement(By.xpath("//div[@id='main_0']"));
		  ClickonTAC.click();
			
		  Actions action = new Actions(GetDriver());
		  action.moveToElement(ClickonTAC);
		  
		WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")).clear(); 

		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]"))).sendKeys("TAC");		  
		wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='main_0']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Title, Abstract, Claims (TAC)')]"))).click();
	
		WebElement EnterText= GetDriver().findElement(By.xpath("//textarea[@id='txtPatApp_0']"));
		EnterText.sendKeys("Fiber cell");
	 
		 /***********************************************************/

		 WebElement ClickonLimitBy=GetDriver().findElement(By.xpath("//*[@id='btnPromptCancel']"));
		 ClickonLimitBy.click();
		 
		 Thread.sleep(500);
	
		 WebElement SelectCheckBox= GetDriver().findElement(By.xpath("//*[@id='currentSearchFilterID']/div/div/span/input"));
		 SelectCheckBox.click();
		 
		 WebElement SelectDropdown=GetDriver().findElement(By.xpath("//*[@id='currentSearchFilterID']/div/div/select"));
		 SelectDropdown.click();
	 
		 Thread.sleep(200);
		 
		 WebElement SelectINV= GetDriver().findElement(By.xpath("//*[@id='currentSearchFilterID']/div/div/select/option[5]"));
		 SelectINV.click();
		 
		 Thread.sleep(1000);
		 
		 WebElement sugg1= GetDriver().findElement(By.xpath("//*[@id='facetMainContainer']/div[2]/div[2]/div[1]/div/div[1]/div[1]/input"));
		 sugg1.click();
		 
		 Thread.sleep(200);
		 
		 WebElement sugg2= GetDriver().findElement(By.xpath("//*[@id='facetMainContainer']/div[2]/div[2]/div[2]/div/div[1]/div[1]/input"));
		 sugg2.click();
		 
		 //click on apply
		 
		 WebElement Apply= GetDriver().findElement(By.xpath("//*[@id='currentStatFilterID']/div/div/div[3]/div"));
		 Apply.click();
		 
		 Thread.sleep(100);
		  
		  GetCountSearch_QS();	
		  
		  Thread.sleep(1000);
		  
		  //search within
			SearchWithin();
			
			Thread.sleep(2000);
			
			WebElement SearchNo=GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
			SearchNo.sendKeys("   PNC: US9873882B2  ");
			
			Thread.sleep(2000);
			
			ApplyFilter();
		  
			Thread.sleep(3000);
			
		//validation using assert
		  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		  System.out.println("s1 : "+validate.getText());
		  
		  String actualText="Enhanced selective expression of transgenes in fiber producing plants";
		  Assert.assertEquals(validate.getText(), actualText);
		
		  Thread.sleep(2000);
		  
		  GoToHomePage();
		  
		  SelectQuicksearch();

		  //clear
		  WebElement clear= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		  clear.click();
		  System.out.println("clicked on clear option");
		
	 
	 }
	 
	 @Test
	 public void LimitByClass() throws Exception
	 {
		 
		//clear
		  WebElement clear1= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		  clear1.click();
		  System.out.println("clicked on clear option");
		  
		  Thread.sleep(100);
		  WebElement ClickonTAC= GetDriver().findElement(By.xpath("//div[@id='main_0']"));
		  ClickonTAC.click();
			
		  Actions action = new Actions(GetDriver());
		  action.moveToElement(ClickonTAC);
		  
		WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")).clear(); 

		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]"))).sendKeys("TAC");		  
		wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='main_0']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Title, Abstract, Claims (TAC)')]"))).click();
	
		WebElement EnterText= GetDriver().findElement(By.xpath("//textarea[@id='txtPatApp_0']"));
		EnterText.sendKeys("Fiber cell");
		
		 /***********************************************************/

		 WebElement ClickonLimitBy=GetDriver().findElement(By.xpath("//*[@id='btnPromptCancel']"));
		 ClickonLimitBy.click();
		 
		 Thread.sleep(500);
	
		 WebElement SelectCheckBox= GetDriver().findElement(By.xpath("//*[@id='currentSearchFilterID']/div/div/span/input"));
		 SelectCheckBox.click();
		 
		 WebElement SelectDropdown=GetDriver().findElement(By.xpath("//*[@id='currentSearchFilterID']/div/div/select"));
		 SelectDropdown.click();
	 
		 WebElement SelectUCMain= GetDriver().findElement(By.xpath("//*[@id='currentSearchFilterID']/div/div/select/option[9]"));
		 SelectUCMain.click();
		 
		 Thread.sleep(1000);
		 
		 WebElement sugg1= GetDriver().findElement(By.xpath("//*[@id='facetMainContainer']/div[2]/div[2]/div[1]/div/div[1]/div[1]"));
		 sugg1.click();
		 
		 WebElement sugg2= GetDriver().findElement(By.xpath("//*[@id='facetMainContainer']/div[2]/div[2]/div[2]/div/div[1]/div[1]"));
		 sugg2.click();
		 
		 //click on apply
		 
		 WebElement Apply= GetDriver().findElement(By.xpath("//*[@id='currentStatFilterID']/div/div/div[3]/div"));
		 Apply.click();
		 
		 Thread.sleep(1000);
		  
		  GetCountSearch_QS();	
		  
		  Thread.sleep(1000);
		  
		  //search within
			SearchWithin();
			
			Thread.sleep(2000);
			
			WebElement SearchNo=GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
			SearchNo.sendKeys("   PNC:US5801151A ");
			
			Thread.sleep(5000);
			
			ApplyFilter();
		  
			Thread.sleep(3000);
			
		//validation using assert
		  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		  System.out.println("s1 : "+validate.getText());
		  
		  String actualText="Estimation of ovular fiber production in cotton";
		  Assert.assertEquals(validate.getText(), actualText);
		
		  Thread.sleep(2000);
		  
		  GoToHomePage();
		  		  
		  SelectQuicksearch();

		  //clear
		  WebElement clear= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		  clear.click();
		  System.out.println("clicked on clear option");
			  		
	 }
	 
	 @Test
	 public void LimitByASN() throws Exception
	 {
		//clear
		  WebElement clear1= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		  clear1.click();
		  System.out.println("clicked on clear option");
		  
		  Thread.sleep(100);
		  WebElement ClickonTAC= GetDriver().findElement(By.xpath("//div[@id='main_0']"));
		  ClickonTAC.click();
			
		  Actions action = new Actions(GetDriver());
		  action.moveToElement(ClickonTAC);
		  
		WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")).clear(); 

		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]"))).sendKeys("TAC");		  
		wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='main_0']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Title, Abstract, Claims (TAC)')]"))).click();
	
		WebElement EnterText= GetDriver().findElement(By.xpath("//textarea[@id='txtPatApp_0']"));
		EnterText.sendKeys("Fiber cell");
	 
		 /***********************************************************/

		 WebElement ClickonLimitBy=GetDriver().findElement(By.xpath("//*[@id='btnPromptCancel']"));
		 ClickonLimitBy.click();
		 
		 Thread.sleep(500);
	
		 WebElement SelectCheckBox= GetDriver().findElement(By.xpath("//*[@id='currentSearchFilterID']/div/div/span/input"));
		 SelectCheckBox.click();
		 
		 WebElement SelectDropdown=GetDriver().findElement(By.xpath("//*[@id='currentSearchFilterID']/div/div/select"));
		 SelectDropdown.click();
	 
		 Thread.sleep(200);
		 
		 WebElement SelectASN= GetDriver().findElement(By.xpath("//*[@id='currentSearchFilterID']/div/div/select/option[4]"));
		 SelectASN.click();
		 
		 Thread.sleep(1000);
		 
		 WebElement sugg1= GetDriver().findElement(By.xpath("//*[@id='facetMainContainer']/div[2]/div[2]/div[1]/div/div[1]/div[1]/input"));
		 sugg1.click();
		 
		 Thread.sleep(200);
		 
		 WebElement sugg2= GetDriver().findElement(By.xpath("//*[@id='facetMainContainer']/div[2]/div[2]/div[2]/div/div[1]/div[1]/input"));
		 sugg2.click();
		 
		 //click on apply
		 
		 WebElement Apply= GetDriver().findElement(By.xpath("//*[@id='currentStatFilterID']/div/div/div[3]/div"));
		 Apply.click();
		 
		 Thread.sleep(100);
		  
		  GetCountSearch_QS();	
		  
		  Thread.sleep(1000);
		  
		  //search within
			SearchWithin();
			
			Thread.sleep(1000);
			
			WebElement SearchNo=GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
			SearchNo.sendKeys("   PNC: US9873882B2  ");
			
			Thread.sleep(5000);
			
			ApplyFilter();
		  
			Thread.sleep(1000);
			
		//validation using assert
		  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		  System.out.println("s1 : "+validate.getText());
		  
		  String actualText="Enhanced selective expression of transgenes in fiber producing plants";
		  Assert.assertEquals(validate.getText(), actualText);
		
		  Thread.sleep(1000);
		  
		  GoToHomePage();
		  
		  SelectQuicksearch();

		  //clear
		  WebElement clear= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		  clear.click();
		  System.out.println("clicked on clear option");
		
	 
	 }
	 
	 @Test
	  public void SFAMEFAMEPD() throws Exception
	  {
		//clear
		  WebElement clear1= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		  clear1.click();
		  System.out.println("clicked on clear option");
		  
		  Thread.sleep(100);
		
		 WebElement ClickonTAC= GetDriver().findElement(By.xpath("//div[@id='main_0']"));
		  ClickonTAC.click();
		  
		  WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")).clear(); 

		  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]"))).sendKeys("EPRD");
		  
		  wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='main_0']//span[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Earliest Pri. Date (EPRD)')]"))).click();
	
		  WebElement Date1= GetDriver().findElement(By.xpath("//div[@class='modelContainer_0']//div[@class='floatLeft col-xs-6 col-sm-6 col-md-6 col-lg-6 combineAlignPadding row']//input[1]"));
		  Date1.sendKeys("2010");
		  
		  WebElement date2=GetDriver().findElement(By.xpath("//div[@class='modelContainer_0']//input[2]"));
		  date2.sendKeys("2014");
		
		  Thread.sleep(100);
		  
			//code for second tab pnc
			  WebElement ClickonSecondTAB= GetDriver().findElement(By.xpath("//div[@id='main_1']"));
			  ClickonSecondTAB.click();
			  
			  WebDriverWait wait3= new WebDriverWait(GetDriver(),60);
			  GetDriver().findElement(By.xpath("//div[@id='main_1']//input[@placeholder='Search']")).clear(); 

			  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_1']//input[@placeholder='Search']"))).sendKeys("PNC");
			  
			  WebElement selectPNC= GetDriver().findElement(By.xpath("//div[@id='main_1']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Publication No (PNC)')]"));
			                                                           
			  selectPNC.click();
			  
			  WebElement PNC= GetDriver().findElement(By.xpath("//input[@id='textDefault_1']"));
			  PNC.sendKeys("US10390321B2");
			  
			  
		  Thread.sleep(500);
 
		  GetCountSearch_QS();	  
		  
			//validation using assert
			  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
			  System.out.println("s1 : "+validate.getText());
			  
			  String actualText="Timing advance adjustment method and device";
			  Assert.assertEquals(validate.getText(), actualText);
			
			  GoToHomePage();
			  
			  SelectQuicksearch();

			  //clear
			  WebElement clear= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
			  clear.click();
			  System.out.println("clicked on clear option");
		  
		  //click on EPRD
/*		  WebElement EPRD= GetDriver().findElement(By.xpath("//button[contains(text(),'EFAM Earliest Priority Date (EPRD)')]"));
		  EPRD.click();
		  
		  WebDriverWait wait3= new WebDriverWait(GetDriver(),30);
		  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_1']//input[@placeholder='Search']"))).sendKeys("sprd");
		  Thread.sleep(500);
		  
		  WebElement SelectSPRD= GetDriver().findElement(By.xpath("//div[@id='main_1']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'SFAM Earliest Priority Date (SPRD)')]"));
		  SelectSPRD.click();
		  
		  WebElement Date3= GetDriver().findElement(By.xpath("//div[contains(@class,'modelContainer_1')]//div[contains(@class,'floatLeft col-xs-6 col-sm-6 col-md-6 col-lg-6 combineAlignPadding row')]//input[1]"));
		  Date3.sendKeys("2001-04-28");
		  
		  WebElement date4=GetDriver().findElement(By.xpath("//div[contains(@class,'modelContainer_0')]//input[2]"));
		  date4.sendKeys("2014");
		  
*/	
	  }
	 
	 @Test
	 public void RelatedTERMS() throws Exception
	 {
		 Thread.sleep(1000);
		 
		 Clear();
		  
		  Thread.sleep(1000);
		
		 WebElement ClickonTAC= GetDriver().findElement(By.xpath("//div[@id='main_0']"));
		  ClickonTAC.click();
		  
		  WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")).clear(); 

		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]"))).sendKeys("TAC");
		  
		wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='main_0']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Title, Abstract, Claims (TAC)')]"))).click();
	
		WebElement EnterText= GetDriver().findElement(By.xpath("//textarea[@id='txtPatApp_0']"));
		
		EnterText.sendKeys("jet engine");
		
		Thread.sleep(500);
		
		EnterText.sendKeys(Keys.F9);
		
		Thread.sleep(1000);
		  
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='SelectionDiv']/div[1]")));

		Thread.sleep(500);
		
		WebElement SelectEngineSugg=GetDriver().findElement(By.xpath("//*[@id='SelectionDiv']/div[1]/input"));
		SelectEngineSugg.click();
		
		Thread.sleep(1000);
	
		JavascriptExecutor js = (JavascriptExecutor)GetDriver();
		WebElement ClickonAdd = GetDriver().findElement(By.xpath("//span[@class='patseer_button'][contains(text(),'Add')]"));
		js.executeScript("arguments[0].click();", ClickonAdd);
		
		  Thread.sleep(1000);
		 
		  GetCountSearch_QS();
		  
		  Thread.sleep(1000);
		  
		  GoToHomePage();
		  
		  Thread.sleep(2000); 
		  
		  SelectQuicksearch();

	 }
	 
	 @Test
	 public void KeywordsThesaurus () throws Exception
	 {
		 Thread.sleep(1000);
		 
//		  WebElement ClickonTAC= GetDriver().findElement(By.xpath("//textarea[@id='txtPatApp_1']"));
//		  ClickonTAC.click();
//		  WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
//		  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='txtPatApp_1']")));
//		  Thread.sleep(500);
//		 
//		  WebElement EnterSearchterm= GetDriver().findElement(By.xpath("//textarea[@id='txtPatApp_1']"));
//		  EnterSearchterm.sendKeys("jet engine");
//		  Thread.sleep(500);
//		  EnterSearchterm.sendKeys(Keys.F9);
//		  Thread.sleep(500);
//		  
//		  WebElement engine=GetDriver().findElement(By.xpath("//a[@id='ui-id-49']"));
//		  engine.click();
//		  Thread.sleep(500);
//		  
//		  JavascriptExecutor js = (JavascriptExecutor)GetDriver();
//			WebElement ClickononAdd = GetDriver().findElement(By.xpath("//span[@class='patseer_button'][contains(text(),'Add')]"));
//			js.executeScript("arguments[0].click();", ClickononAdd);
//			
//		  
//		  Thread.sleep(1000);
//			 
//		  GetCountSearch_QS();
		  
//		  Thread.sleep(1000);
		  
		  GoToHomePage();
		  
		  Thread.sleep(2000); 
		  
//		  SelectQuicksearch();
		
	 }
	 
	 @Test
	 public void Dedup() throws Exception
	 {
		 Thread.sleep(1000);
		 
		 Clear();
		  
		  Thread.sleep(1000);
		
		 WebElement ClickonTAC= GetDriver().findElement(By.xpath("//div[@id='main_0']"));
		  ClickonTAC.click();
		  
		  WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")).clear(); 

		  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]"))).sendKeys("CPC");
		  
		  wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='main_0']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'CPC Full (CPC)')]"))).click();
	
		  WebElement EnterText= GetDriver().findElement(By.xpath("//input[@id='textClass_0']"));
		  EnterText.sendKeys("G06*");
		  
		  Thread.sleep(1000);
		  
		 WebElement clickonDedup= GetDriver().findElement(By.xpath("//button[contains(@class,'btn btn-default dropdown-toggle ng-binding col-xs-12 col-sm-12 col-md-12 col-lg-12 CS_settingbtn1 CS_subMeuuSearchText CS_padding_top')]"));
		 clickonDedup.click();
		 
		 WebElement Sfam= GetDriver().findElement(By.xpath("//li[2]//a[1]//span[2]"));
		 Sfam.click();
		 
		 WebElement SelectEFAM= GetDriver().findElement(By.xpath("//div[@id='familyOptionID']//label[contains(@class,'ng-binding')][contains(text(),'Extended Family (EFAM)')]"));
		 SelectEFAM.click();
		 
		 WebElement Apply=GetDriver().findElement(By.xpath("//span[contains(@class,'btn btn-primary floatRight handPointer')]"));
		 Apply.click();
		 
		  Thread.sleep(1000);
		 
		  GetCountSearch_QS();
		  
		  Thread.sleep(1000);
		  
		  GoToHomePage();
		  
		  Thread.sleep(2000); 
		  
		  SelectQuicksearch();
		
	 }
	 
	 @Test
	 public void Templates() throws Exception
	 {
		 Thread.sleep(1000);
		 
		 SelectQuicksearch();
		 
		 Thread.sleep(1000);
		 
		 Clear();
		 
		 Thread.sleep(1000);
		 
		 WebElement ClickonTAC= GetDriver().findElement(By.xpath("//div[@id='main_0']"));
		  ClickonTAC.click();
		  
		  WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")).clear(); 

		  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]"))).sendKeys("DOM");
		  
		  wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='main_0']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Tech. Domain (DOM)')]"))).click();
	
		  Thread.sleep(500);
		  
		  //code for second tab 
		  
		  WebElement ClickonSecondTAB= GetDriver().findElement(By.xpath("//div[@id='main_1']"));
		  ClickonSecondTAB.click();
			  
		  WebDriverWait wait2= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_1']//input[@placeholder='Search']")).clear(); 

		  wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_1']//input[@placeholder='Search']"))).sendKeys("TAC");
			  
		  WebElement selectPNC= GetDriver().findElement(By.xpath("//div[@id='main_1']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Title, Abstract, Claims (TAC)')]"));                                                        
		  selectPNC.click();
			  
			//code for third tab
		 
		  WebElement ClickonThirdtab=GetDriver().findElement(By.xpath("//div[@id='main_2']"));
		  ClickonThirdtab.click();
			
		  WebDriverWait wait3= new WebDriverWait(GetDriver(),60);
		  GetDriver().findElement(By.xpath("//div[@id='main_2']//input[@placeholder='Search']")).clear(); 

		  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_2']//input[@placeholder='Search']"))).sendKeys("UC");
				  
		  WebElement SelectUC= GetDriver().findElement(By.xpath("//div[@id='main_2']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'US Class (UC)')]"));                                                        
		  SelectUC.click();
		  
		  Thread.sleep(1000);
		  
		  Date d = new Date(System.currentTimeMillis());
		  GetDriver().findElement(By.xpath("//input[@id='txtTemplateIdJQ ']")).sendKeys("Template" + d);
		  
		  WebDriverWait wait4= new WebDriverWait(GetDriver(),60);
		  wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='_divQuickSearchMain']/div/div[1]/ul/li[1]/div/span[2]"))).click();
		  
		  Thread.sleep(500);
		  
		 System.out.println(GetDriver().findElements(By.xpath("//*[@id='_divQuickSearchMain']/div/div[1]/ul/li[1]/div/ul/li[1]")));
		
		 Thread.sleep(1000);
		 
		 GoToHomePage();
		  
	 }
	
}