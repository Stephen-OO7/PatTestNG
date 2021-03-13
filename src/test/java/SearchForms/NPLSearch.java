package SearchForms;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Login.BaseTest;

public class NPLSearch extends BaseTest
{
	@Test 
	public void SelectNPLSearch() 
	  {	
		GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor)GetDriver();//WebDriver instance type cast into JavascriptExecutor interface

		WebElement cmd = GetDriver().findElement(By.xpath("//a[@class='m_1_s_7']"));
		js.executeScript("arguments[0].click();", cmd);
		 
	  }
	
	@Test
	public void SearchSuggestor() throws Exception
	{
		WebElement clickonTAC=GetDriver().findElement(By.xpath("//textarea[@id='txt_3_0']"));
		clickonTAC.sendKeys("fiber");
		System.out.println("entered search term in tac");
		
//		WebElement sugg= GetDriver().findElement(By.xpath("//span[contains(text(),'r reinforced')]"));
//		Thread.sleep(3000);
//		((BaseTest) sugg).GetDriver().findElement(By.id("txt_3_0")).sendKeys(Keys.ARROW_DOWN);
//		((BaseTest) sugg).GetDriver().findElement(By.name("txt_3_0")).sendKeys(Keys.ARROW_DOWN);
//		((BaseTest) sugg).GetDriver().findElement(By.name("txt_3_0")).sendKeys(Keys.ARROW_DOWN);
//		((BaseTest) sugg).GetDriver().findElement(By.name("txt_3_0")).sendKeys(Keys.ENTER);
////		sugg.click();
//		System.out.println("selected suggestion");
		
		WebElement Search=GetDriver().findElement(By.xpath("//a[@class='patseer_button'][contains(text(),'Search')]"));
		Search.click();
		  
		Thread.sleep(500);
		
		//validation using assert
//		  WebElement validate=GetDriver().findElement(By.xpath("//span[contains(text(),'forward neutrons ,')]"));
//		  System.out.println("s1 : "+validate.getText());
//		  
//		  String actualText="forward neutrons ,";
//		  Assert.assertEquals(validate.getText(), actualText);
//		  Thread.sleep(500);
//		
		GoToHomePage();
		
		SelectNPLSearch();
		
		WebElement Clear=GetDriver().findElement(By.xpath("//a[contains(@class,'patseer_Secondary_Button topSpacer')]"));
		Clear.click();
			
	}
	
	@Test
	public void AllDatabases() throws Exception
	{
		WebElement clickonT=GetDriver().findElement(By.xpath("//textarea[@id='txt_3_0']"));
		clickonT.sendKeys("cell");

		Thread.sleep(500);
		
//		WebElement ClickonDropDown=GetDriver().findElement(By.xpath("//select[@class='ng-pristine ng-valid ng-touched']"));
//		ClickonDropDown.click();
//		
//		Thread.sleep(500);
//		
//		WebElement SelectAbstract=GetDriver().findElement(By.xpath("//select[@class='ng-pristine ng-valid ng-touched']//option[@class='ng-binding ng-scope'][contains(text(),'Abstract - A')]"));
//		SelectAbstract.click();
//		
//		WebElement SearchinA=GetDriver().findElement(By.xpath("//textarea[@id='txt_16_1']"));
//		SearchinA.sendKeys("bacteria");
//		
//		Thread.sleep(500);
		
		WebElement PubDate1=GetDriver().findElement(By.xpath("//body/form/div/div/div/div/div/div/div/div/div/div[1]/input[1]"));
		PubDate1.sendKeys("2001");
		
		WebElement PubDate2=GetDriver().findElement(By.xpath("//body//div//div//div//input[2]"));
		PubDate2.sendKeys("2010");
		
		WebElement search= GetDriver().findElement(By.xpath("//a[@class='patseer_button'][contains(text(),'Search')]"));
		search.click();
		
		Thread.sleep(500);
/*		
		WebDriverWait wait1=new WebDriverWait(GetDriver(),60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='visiblityJquery ui-tabs-nav ui-helper-reset ui-helper-clearfix ui-widget-header ui-corner-all']"))).click();
		
		WebElement PubMed= GetDriver().findElement(By.xpath("//span[contains(text(),'(934610)')]"));
		System.out.println(PubMed.getText());
		Thread.sleep(500);
		
		  GetDriver().manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

		WebElement DOAJ= GetDriver().findElement(By.xpath("//span[contains(text(),'(70362)')]"));
		DOAJ.click();
		Thread.sleep(1000);
		System.out.println(DOAJ.getText());
		
		  GetDriver().manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

		WebElement AgriCola= GetDriver().findElement(By.xpath("//span[contains(text(),'(0)')]"));
		System.out.println(AgriCola.getText());
		Thread.sleep(1000);
		
		  GetDriver().manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

		WebElement Agris= GetDriver().findElement(By.xpath("//span[contains(text(),'(22081)')]"));
		System.out.println(Agris.getText());
		Thread.sleep(1000);
		
		  GetDriver().manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

		WebElement MDPI= GetDriver().findElement(By.xpath("//span[contains(text(),'(28658)')]"));
		System.out.println(MDPI.getText());
		Thread.sleep(1000);
		
		WebElement CrossRef= GetDriver().findElement(By.xpath("//span[contains(text(),'(1242103)')]"));
		System.out.println(CrossRef.getText());
*/		
		GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  
		  GoToHomePage();
		  SelectNPLSearch();
			
//			WebElement Clear=GetDriver().findElement(By.xpath("//a[contains(@class,'patseer_Secondary_Button topSpacer')]"));
//			Clear.click();
		 
	}
	
	@Test
	public void View() throws Exception
	{
		WebElement clickonTAC=GetDriver().findElement(By.xpath("//textarea[@id='txt_3_0']"));
		clickonTAC.sendKeys("curcumin");
		System.out.println("entered search term in tac");
	
		WebElement Search=GetDriver().findElement(By.xpath("//a[@class='patseer_button'][contains(text(),'Search')]"));
		Search.click();
		  
		Thread.sleep(2000);
		
//		WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
//		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='ui-id-8']")));
		  
		
//		WebElement CrossRef=GetDriver().findElement(By.xpath("//a[@id='ui-id-8']"));
//		CrossRef.click();
//		
//		Thread.sleep(500);
//		
//		WebElement ClickonLink=GetDriver().findElement(By.xpath("//a[contains(text(),'Time integration of a constitutive law for soft cl')]"));
//		ClickonLink.click();
		
		Thread.sleep(500);
		
		GoToHomePage();
		  
		Thread.sleep(2000);
		  
	}
	
	@Test
	public void TestHighlight() throws Exception
	{
		Thread.sleep(1000);
		
		SelectNPLSearch();
		
		Thread.sleep(1000);

		WebElement clickonT=GetDriver().findElement(By.xpath("//textarea[@id='txt_3_0']"));
		clickonT.sendKeys("cell");

		Thread.sleep(1000);
		
		WebElement SelectAbstract=GetDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_serachDivID']/div[2]/div[1]/select/option[3]"));
		SelectAbstract.click();
		
		WebElement EnterAbstract=GetDriver().findElement(By.xpath("//textarea[@id='txt_16_1']"));
		EnterAbstract.sendKeys("bacteria");
		
		Thread.sleep(2000);
		
		WebElement select=GetDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_serachDivID']/div[3]/div[1]/select"));
		select.click();
		
		Thread.sleep(2000);
		
		WebElement Search=GetDriver().findElement(By.xpath("//a[@class='patseer_button'][contains(text(),'Search')]"));
		Search.click();
		
		Thread.sleep(6000);
		
		WebElement checkHighlight=GetDriver().findElement(By.xpath("//*[@id='lblAbstractText']/span/span[2]"));
		checkHighlight.getText();
		
		Thread.sleep(2000);
		
		GoToHomePage();
	}
}
