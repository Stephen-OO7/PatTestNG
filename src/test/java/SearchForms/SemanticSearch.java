package SearchForms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import Login.BaseTest;

public class SemanticSearch extends BaseTest
{
  @Test
  public void SelectSemantic() throws Exception 
  {
	  GoToHomePage();

	  GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  JavascriptExecutor js = (JavascriptExecutor)GetDriver();

	  WebElement semantic = GetDriver().findElement(By.xpath("//a[@href='Search#/semantic']"));
	  js.executeScript("arguments[0].click();", semantic);
	  System.out.println("clicked on semantic search");
	  
	  WebElement Clear =GetDriver().findElement(By.xpath("//span[@class='leftSpacer']//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix'][contains(text(),'Clear')]"));
	  Clear.click();
  }
  
  @Test
  public void SemanticSearchoption() throws Exception
  {
	  WebElement InputData=GetDriver().findElement(By.xpath("//textarea[@id='txtSemanticSearch']"));
//	  WebElement InputData= GetDriver().findElement(By.id("txtSemanticSearch"));
	  GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  InputData.sendKeys("          We propose a way to have each autonomous car decide which car will go first at road intersections without central station intervention or having cars talking to each other. To overcome the shortcomings of the prior methods for autonomous vehicles crossing road intersections a method of the present invention is provided for at least two autonomous vehicles to safely pass through a road intersection. The location of the road intersection is stored in a map installed in a computer of each of the autonomous vehicles. Each of the computers of the autonomous vehicles has a communication module capable of broadcasting and receiving traffic information. The road intersection is where a plurality of roads meets. The method includes providing an information receiving circle in each of the maps circling the road intersection providing a broadcasting circle in each of the maps circling the road intersection in which each of the broadcasting circles is circled by each of the information receiving circles in each of the maps concentrically traveling all autonomous vehicles toward the road intersection and into the information receiving circle traveling one of the autonomous vehicles further into the broadcasting circle for broadcasting traffic information via the computer thereof receiving traffic information of the autonomous vehicle traveling in the broadcasting circle by the computer of the other autonomous vehicle and determining which autonomous vehicle passes through the road intersection first according to the traffic information of the autonomous vehicle broadcasted by the computer of the other autonomous vehicle that receives the traffic information broadcasted by the autonomous vehicle wherein when the computer of the other autonomous vehicle makes a determination to let the autonomous vehicle pass first the other autonomous vehicle stops before the intersection until the autonomous vehicle has passed through the road intersection.     ");
	  
	  WebElement search=GetDriver().findElement(By.xpath("//span[@class='patseer_button btn btn-success']"));
	  search.click();
	  System.out.println("clicked on search button");
	  
	  Thread.sleep(5000);
//	  GetDriver().manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
//	  
//	  GetDriver().findElement(By.className("sem-word")).isDisplayed();
//	  WebElement crossTechnologyTerms= GetDriver().findElement(By.xpath("//body[@class='pageBody ui-widget body modal-open']/form[@id='form1']/div[@class='ui-widget']/div[@id='divDisplay']/div[@class='master_middlepanel ui-widget-content patseermaster_middlepanel forclear']/div[@id='search-ng-con-id']/div[@id='allSearchFormContainer']/div/div[@class='floatLeft width100 searchFormContjq semanticSearch']/div[@class='floatLeft topSpacer p-searchform-container']/div[@id='_divQuickSearchMain']/div[@class='ng-scope']/div[@id='nlsModel']/div[@class='modal-dialog ui-draggable']/div[@class='modal-content']/div[@class='modal-body']/div[@id='divExpText']/a[1]/span[1]"));
//	  crossTechnologyTerms.click();
	  
	  Thread.sleep(5000);	  
	  WebElement submit=GetDriver().findElement(By.xpath("//button[@class='btn btn-primary submitbtn floatRight']"));
	  submit.click();
	  
	  
	//on result page
	  GetDriver().manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
	
	  //iframe
//	  WebElement iframeElement = GetDriver().findElement(By.id("resultFrameID"));
//	  GetDriver().switchTo().frame(iframeElement);
//	  
	  Thread.sleep(500);
	  
	  
//	//for search within
//	  WebDriverWait wait2= new WebDriverWait(GetDriver(),60);
//	  wait2.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(".//*[@id='leftUpperPanel_filterContainer']")));
//	  
//	  WebElement clickonSearchWithin=GetDriver().findElement(By.xpath("//body[@class='pageBody ui-widget ng-scope']/form[@id='form1']/div[@class='ui-widget forclear']/div[@id='divDisplay']/div[@class='forclear']/div[@id='leftLowerPanelContainer']/div[@class='leftContent']/div[@class='ng-scope']/div[@class='flt-mim-wth ng-scope']/div[@id='leftUpperPanel_filterContainer']/div[@class='filters forclear']/div[@id='SearchSummaryContainer']/div[@id='leftUpperPanel_SearchSummaryContainer_filterContainer']/div[3]/div[1]"));
//	  clickonSearchWithin.click();
//	  	
//	  WebElement searchwithin=GetDriver().findElement(By.xpath("//div[@class='width100 ng-scope']//textarea[@id='SearchTerm']"));
//	  searchwithin.sendKeys("PNC:US2016231746A1");
//	  
//	  WebElement ApplyFilter= GetDriver().findElement(By.xpath(".//*[@id='leftUpperPanel_filterContainer']/div[1]/button[2]"));
//	  ApplyFilter.click();
//	  System.out.println("clicked on apply filter");
	  
	  
	//validation using assert
//	  WebElement validate=GetDriver().findElement(By.xpath("//label[contains(text(),'System And Method To Operate An Automated Vehicle')]"));
//	  System.out.println("s1 : "+validate.getText());
//	  
//	  String actualText="System And Method To Operate An Automated Vehicle";
//	  Assert.assertEquals(validate.getText(), actualText);
	
	  GoToHomePage();  
	  
  }
  
}
