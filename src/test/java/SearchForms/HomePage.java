package SearchForms;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Login.BaseTest;

public class HomePage extends BaseTest 
{
  @Test
  public void SmartSearch() throws Exception 
  {
	  GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	  WebElement search= GetDriver().findElement(By.xpath("//input[@id='topPanel_txtSmartSearchQueryAuto-tokenfield']"));
	  search.sendKeys("Microsoft ");
	  
	  WebElement selectSugg= GetDriver().findElement(By.xpath("//span[@class='suggpadding31']"));
	  selectSugg.click();
	  
	  Thread.sleep(100);
	  
	  WebElement searchIBM= GetDriver().findElement(By.xpath("//input[@id='topPanel_txtSmartSearchQueryAuto-tokenfield']"));
	  searchIBM.sendKeys("IBM");
	  
	  WebElement selectSuggestion= GetDriver().findElement(By.xpath("//span[contains(text(),'ibm corp')]"));
	  selectSuggestion.click();
	  
	  WebElement searchBtn= GetDriver().findElement(By.xpath("//button[@id='topPanel_divAddButton']"));
	  searchBtn.click();
	  
	//on result page
	  GetDriver().manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
	
	  //iframe
//	  WebElement iframeElement = GetDriver().findElement(By.id("resultFrameID"));
//	  GetDriver().switchTo().frame(iframeElement);
	  	  
	//validation using assert
//	  Thread.sleep(200);
//	  WebElement validate=GetDriver().findElement(By.xpath("//label[contains(text(),'Integrated cooling in automated tape libraries')]"));
//	  System.out.println("s1 : "+validate.getText());
//	  
//	  String actualText="Integrated cooling in automated tape libraries";
//	  Assert.assertEquals(validate.getText(), actualText);
	
	  Thread.sleep(1000);
	  GoToHomePage();
      
  }
  
  @Test
  public void KnowledgeBase()
  {
	  GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	  WebDriverWait wait2= new WebDriverWait(GetDriver(),60);
	  wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='topPanel_part2div']")));
	  
	  WebElement Knowledge= GetDriver().findElement(By.xpath("//input[@placeholder='Search Help Section']"));
	  Knowledge.sendKeys("citation");
	  
	  WebElement Search= GetDriver().findElement(By.xpath("//span[@class='mdi mdi-magnify patseerImage floatRight fontsize20 margin5']"));
	  Search.click();
	  
  }
  
  @Test
  public void Project()
  {
	  GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	  WebDriverWait wait2= new WebDriverWait(GetDriver(),60);
	  wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//body[@class='pageBody ui-widget body']/form[@id='form1']/div[@class='ui-widget']/div[@id='divDisplay']/div/div[@id='topPanel_homengMainDiv']/div[@id='topPanel_part1div']/div[@id='topPanel_divrecentProjectsCntrl']/div[@id='recentProjectHome']/div[3]")));
	  
	  WebElement LookupProject= GetDriver().findElement(By.xpath("//li[@class='token-input-input-token-facebook']"));
	  LookupProject.sendKeys("Methanol");
	  
	  WebElement Search= GetDriver().findElement(By.xpath("//li[@class='token-input-input-token-facebook']//tester"));
	  Search.click();


  }

}
