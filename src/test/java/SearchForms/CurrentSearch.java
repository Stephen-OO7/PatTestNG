package SearchForms;

import java.sql.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Login.BaseTest;


public class CurrentSearch extends BaseTest
{
  @Test
  public void ClickonCurrentSearch() 
  {
	  GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  JavascriptExecutor js = (JavascriptExecutor)GetDriver();
	  WebElement CurrentSearch = GetDriver().findElement(By.xpath("//a[contains(text(),'Current Search')]"));
	  js.executeScript("arguments[0].click();", CurrentSearch);
	  System.out.println("clicked on Current Search");
  }


@Test
  public void ViewStats() throws Exception
  {
	
	  Thread.sleep(2000);  
	  
	  WebElement ViewStats = GetDriver().findElement(By.xpath("//tr[7]//td[2]//div[1]//div[1]//span[1]//button[2]"));
	  JavascriptExecutor executor = (JavascriptExecutor)GetDriver();
	  executor.executeScript("arguments[0].click();", ViewStats);
	  
	  Thread.sleep(2000);
	  
//	  WebElement SelectDropdown=GetDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_CurrentSearchNG_currentSearchFilterID']/div/select"));
//	  SelectDropdown.click();
//	 
//	  Thread.sleep(1000);
		 
	  WebElement SelectASN= GetDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_CurrentSearchNG_currentSearchFilterID']/div/select/option[3]"));
	  SelectASN.click();
		 
	  Thread.sleep(2000);
		 
	  WebElement sugg1= GetDriver().findElement(By.xpath("//*[@id='facetMainContainer']/div[2]/div[2]/div[1]/div/div[1]/div[1]"));
	  sugg1.click();
		 
	  Thread.sleep(1000);
			
	  WebElement Add=GetDriver().findElement(By.xpath("//div[contains(@class,'patseer_button')]"));
	  Add.click();
	  
	  Thread.sleep(800);
	  
	  WebElement search=GetDriver().findElement(By.xpath("//div[@class='CodeMirror-sizer']"));
	  System.out.println(search.getText());
	  
	  WebElement ClickonAdd=GetDriver().findElement(By.xpath("//a[contains(@class,'patseer_button btn btn-success CS_button')]"));
	  ClickonAdd.click();
	  
	  Thread.sleep(2000);
	  
	  GoToHomePage();
	  
	  Thread.sleep(2000);
	  
	  ClickonCurrentSearch();

	  
  }
  
  @Test
  public void SearchIcon() throws Exception
  {
	  Thread.sleep(1000);
 
	  WebElement SearchViewStats = GetDriver().findElement(By.xpath("//tr[1]//td[2]//div[1]//div[1]//span[1]//button[3]"));
	  JavascriptExecutor executor = (JavascriptExecutor)GetDriver();
	  executor.executeScript("arguments[0].click();", SearchViewStats);
	
	  System.out.println("clicked on search icon of current search");
	  
	  Thread.sleep(2000);
	
	  GoToHomePage();
	  
	  Thread.sleep(1000);
	  
	  ClickonCurrentSearch();
  }
  
  @Test
  public void FilterByTags() throws Exception
  {
	  Thread.sleep(1000);
	  
	  WebElement element1 = GetDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtTagsFilter']"));
	  JavascriptExecutor executor = (JavascriptExecutor)GetDriver();
	  executor.executeScript("arguments[0].click();", element1);
	  
	  WebElement tag= GetDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtTagsFilter']"));
	  tag.sendKeys("tag");
  
	  WebElement apply= GetDriver().findElement(By.xpath("//span[@id='ContentPlaceHolder1_cmdAddCommand']"));
	  apply.click();
	  
	  WebElement getTXT=GetDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_CurrentSearchNG_CurrentSearchContainer']//tbody//tr[1]"));
	  System.out.println(getTXT.getText());
	  
	  GoToHomePage();
	  
	  Thread.sleep(1000);
	  
	  ClickonCurrentSearch();
	  
  }
  
  @Test
  public void AlertIcon() throws Exception
  {
	  Thread.sleep(1000);
	  
	  WebElement AlertViewStats = GetDriver().findElement(By.xpath("//tr[1]//td[2]//div[1]//div[1]//span[1]//button[4]"));
	  JavascriptExecutor executor = (JavascriptExecutor)GetDriver();
	  executor.executeScript("arguments[0].click();", AlertViewStats);
	  
	  System.out.println("clicked on Alert icon of current search");
	  
	  Thread.sleep(2000);
	  
	  Date d = new Date(System.currentTimeMillis());
	  GetDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_alertMainCntrl_txtAlertName']")).sendKeys("CurrentSearchAlert3" + d);
	  
	  Thread.sleep(1000);
	  
	  WebElement selectType= GetDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_alertMainCntrl_alertjobCntrl_cmbAlertType']/option[2]"));
	  selectType.click();
	  
	  Thread.sleep(1000);

	  WebElement SelectAction=GetDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_alertMainCntrl_alertActionCntrl_cmbAction']/option[2]"));
	  SelectAction.click();
	  
	  Thread.sleep(2000);
	  
	  WebElement ClickonAddAction=GetDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_alertMainCntrl_alertActionCntrl_cmdAdd']"));
	  ClickonAddAction.click();
	  
	  Thread.sleep(2000);
	  
	  WebElement SaveAlert= GetDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_alertMainCntrl_cmdSave']"));
	  SaveAlert.click();
	  
	  GoToHomePage();
	  
	  Thread.sleep(1000);
	  
	  ClickonCurrentSearch();
  }
  
  @Test
  public void  Remove() throws Exception
  {
	  Thread.sleep(2000);
	  
	  WebElement SecondRow= GetDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_CurrentSearchNG_divdataContainer']/table/tbody/tr[3]/td[1]/input"));
	  SecondRow.click();
//	  System.out.println(SecondRow.getText());
	  
	  Thread.sleep(500);
	  
	  WebElement ThirdRow=GetDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_CurrentSearchNG_divdataContainer']/table/tbody/tr[4]/td[1]/input"));
	  ThirdRow.click();
	  
	  Thread.sleep(1000);
	  
	  WebElement Remove= GetDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnRemoveAll']"));
	  Remove.click();
	  
	  Thread.sleep(1000);
	  
	  GoToHomePage();
	  
	  Thread.sleep(1000);
	  
	  ClickonCurrentSearch();
	  
  }
  
  @Test
  public void Delete() throws Exception
  {
	  Thread.sleep(1000);
	  
	  WebElement delete = GetDriver().findElement(By.xpath("//tr[3]//td[2]//div[1]//div[1]//span[1]//button[5]"));
	  JavascriptExecutor executor = (JavascriptExecutor)GetDriver();
	  executor.executeScript("arguments[0].click();", delete);
	  
	  WebElement ClickonYes=GetDriver().findElement(By.xpath("//a[@id='btnPromptYes']"));
	  ClickonYes.click();
	  
	  GoToHomePage();
	  
	  ClickonCurrentSearch();
  }
  
  @Test
  public void SearchID() throws Exception
  {
	  Thread.sleep(2000);
	  
//	  WebElement EnterSearchTerm= GetDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_CombineCurrentSearchControl_containerCommandText']/div[1]/div/div/div[2]/div[1]/div[6]/div[1]/div/div/div/div[5]/pre"));
//	  EnterSearchTerm.sendKeys(" TAC:fiber cell ");
//	  
//	  Thread.sleep(500);
//	  
//	  WebElement ClickonAdd=GetDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_CombineCurrentSearchControl_containerCommandText']/div[3]/a"));
//	  ClickonAdd.click();
//	  
//	  Thread.sleep(2000);
	  	  
	  WebElement ID = GetDriver().findElement(By.xpath("//a[contains(text(),'L248')]"));
	  JavascriptExecutor executor = (JavascriptExecutor)GetDriver();
	  executor.executeScript("arguments[0].click()", ID);
	  
	  Thread.sleep(3000);
	  
	  WebDriverWait wait3= new WebDriverWait(GetDriver(),60);
	  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@ng-click='getCount()']")));
	  WebElement getCountBtn= GetDriver().findElement(By.xpath("//a[@ng-click='getCount()']"));
	  System.out.println(getCountBtn.getText());
	  
	  ((JavascriptExecutor)GetDriver()).executeScript("window.scrollTo(0,"+ getCountBtn.getLocation().y +")"); 
	  getCountBtn.click();
	  System.out.println("clicked on get count");
	  
	  GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	  
	  JavascriptExecutor js = (JavascriptExecutor)GetDriver();
	  WebElement search= GetDriver().findElement(By.xpath("//a[@id='searchId']"));
	  js.executeScript("arguments[0].click();",search);
	  System.out.println("clicked on search");
	 
	  Thread.sleep(800);
	  
	  GoToHomePage();
	  
	  Thread.sleep(2000);
	  
	  ClickonCurrentSearch();
  }
 @Test
  public void Export() throws Exception
  {
	 Thread.sleep(1000);
	 
	  WebElement FirstRow= GetDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_CurrentSearchNG_CurrentSearchContainer']//tr[1]//td[2]"));
	  System.out.println(FirstRow.getText());
	  
	  WebElement FirstLid= GetDriver().findElement(By.xpath("//tr[1]//td[1]//input[1]"));
	  FirstLid.click();
	  
	  Thread.sleep(500);
	  
	  WebElement SecondRow= GetDriver().findElement(By.xpath("//tr[2]//td[2]"));
	  System.out.println(SecondRow.getText());
	  
	  WebElement SecondLid= GetDriver().findElement(By.xpath("//tr[2]//td[1]//input[1]"));
	  SecondLid.click();
	  
	  Thread.sleep(500);
	  
	  WebElement export=GetDriver().findElement(By.xpath("//button[@id='btnGroupDrop1']"));
	  export.click();
	 
	  Thread.sleep(500);
	  
	  WebElement word= GetDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_wordSelected']"));
	  word.click();
	  System.out.println("word file exported");
	  
	  GoToHomePage();
	  
	  ClickonCurrentSearch();

  }
 
 	@Test
 	public void BackToSearch() throws Exception
 	{
	  Thread.sleep(1000);

	  WebElement Search = GetDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_CurrentSearchNG_divdataContainer']/table/tbody/tr[65]/td[2]/div/div/span/button[3]"));
	  JavascriptExecutor executor = (JavascriptExecutor)GetDriver();
	  executor.executeScript("arguments[0].click();", Search);
	
	  System.out.println("clicked on search icon of current search");
	  
	  Thread.sleep(5000);
		
		WebElement BackToSearch=GetDriver().findElement(By.xpath("//*[@id='Container']/div/div[1]/div/div[1]"));
		BackToSearch.click();
		
		Thread.sleep(2000);
	 
		  GoToHomePage();
		
 	}
}
