package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Login.BaseTest;

public class POM_EFAM extends BaseTest{
  
	@Test
	public void POMCommonProj() throws Exception
	{
		 Thread.sleep(2000);
			
			JavascriptExecutor js = (JavascriptExecutor)GetDriver();
			WebElement commonProj = GetDriver().findElement(By.xpath("//span[@class='patseer_Secondary_Button ng-binding'][contains(text(),'EFAMDedup_Automation')]"));
			js.executeScript("arguments[0].click();", commonProj);
			
			Thread.sleep(4000);
	}
	
	@Test
	public void RecordType() throws Exception 
	{
		POMCommonProj();
		
		MainFilter();
		
		JavascriptExecutor js = (JavascriptExecutor)GetDriver();
		WebElement Clickon_RecordType = GetDriver().findElement(By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='PTYP']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_RecordType);
		 
		System.out.println("clicked on record type");
		Thread.sleep(1000);
		
		JavascriptExecutor js1 = (JavascriptExecutor)GetDriver();
		WebElement Select_Patent = GetDriver().findElement(By.xpath("//input[@value='PATENT']"));
		js1.executeScript("arguments[0].click();", Select_Patent);
		
		System.out.println("checked suggestion of ptyp");
		Thread.sleep(200);
		
//		SearchWithin();
//		
//		Thread.sleep(1000);
//		
//		WebElement SearchNo=GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
//		SearchNo.sendKeys("   PNC: EP3607002A1  ");
//		
//		Thread.sleep(5000);
		
		ApplyFilter();
		
		Thread.sleep(5000);
		 //validation using assert
		  WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
		  wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		  System.out.println("s1 : "+validate.getText());
			  
		  String actualText="USER INTERFACE AND VIRTUAL PERSONALITY PRESENTATION BASED ON USER PROFILE";
		  Assert.assertEquals(validate.getText(), actualText);
			
		  Thread.sleep(1000);
		 
		  GoToHomePage();
	}
	
	@Test
	public void Assignee() throws Exception
	{
		POMCommonProj();
		
		MainFilter();
		
		JavascriptExecutor js = (JavascriptExecutor)GetDriver();
		WebElement Clickon_Assignee = GetDriver().findElement(By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='ASNN']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_Assignee);
		
		Thread.sleep(1000);
		
		JavascriptExecutor js1 = (JavascriptExecutor)GetDriver();
		WebElement SelectAssignee = GetDriver().findElement(By.xpath("//input[@value='AGARWAL ASHISH']"));
		js1.executeScript("arguments[0].click();", SelectAssignee);
		
		Thread.sleep(2000);
		
		//search within
//		SearchWithin();
//		
//		Thread.sleep(1000);
//		
//		WebElement SearchNo=GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
//		SearchNo.sendKeys("   PNC: EP2661498A1  ");
//		
//		Thread.sleep(5000);
		
		ApplyFilter();
		
		Thread.sleep(5000);
		 //validation using assert
		  WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
		  wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		  System.out.println("s1 : "+validate.getText());
			  
		  String actualText="USER INTERFACE AND VIRTUAL PERSONALITY PRESENTATION BASED ON USER PROFILE";
		  Assert.assertEquals(validate.getText(), actualText);
			
		  Thread.sleep(1000);
		 
		  GoToHomePage();
	}
	
	@Test
	public void CASN() throws Exception
	{
		POMCommonProj();
		
		MainFilter();
		
		JavascriptExecutor js = (JavascriptExecutor)GetDriver();
		WebElement Clickon_CurrentASN = GetDriver().findElement(By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='CASN']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_CurrentASN);
		
		Thread.sleep(1000);
		
		JavascriptExecutor js1 = (JavascriptExecutor)GetDriver();
		WebElement SelectCurrentASN = GetDriver().findElement(By.xpath("//input[@value='APPLE INC']"));
		js1.executeScript("arguments[0].click();", SelectCurrentASN);
		
		Thread.sleep(200);
		
		//for selection of IS option
		
//		WebElement ClickonIS=GetDriver().findElement(By.xpath("//*[@id='filterContainer']/div[6]/filteritems/div[1]/div/select"));
//		ClickonIS.click();
//				
//		WebElement SelectIS=GetDriver().findElement(By.xpath("//*[@id='filterContainer']/div[6]/filteritems/div[1]/div/select/option[1]"));
//		SelectIS.click();
//		
//		WebElement SelectIS=GetDriver().findElement(By.xpath("//*[@id='filterContainer']/div[6]/filteritems/div[1]/div/select/option[2]"));
//		SelectIS.click();
		
		//search within
//		SearchWithin();
//		
//		Thread.sleep(1000);
//		
//		WebElement SearchNo=GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
//		SearchNo.sendKeys("   PNC:  EP2661498A1 ");
		
		Thread.sleep(1000);
		
		ApplyFilter();
		
		Thread.sleep(5000);
		 //validation using assert
		  WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
		  wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		  System.out.println("s1 : "+validate.getText());
			  
		  String actualText="USER INTERFACE AND VIRTUAL PERSONALITY PRESENTATION BASED ON USER PROFILE";
		  Assert.assertEquals(validate.getText(), actualText);
			
		  Thread.sleep(1000);
		 
		  GoToHomePage();
	}
	
	@Test
	public void CurrentOwner() throws Exception
	{
		POMCommonProj();
		
		MainFilter();
		
		JavascriptExecutor js = (JavascriptExecutor)GetDriver();
		WebElement Clickon_CurrentOwner = GetDriver().findElement(By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='PASN']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_CurrentOwner);
		
		Thread.sleep(1000);
		
		JavascriptExecutor js1 = (JavascriptExecutor)GetDriver();
		WebElement SelectCurrentOwner = GetDriver().findElement(By.xpath("//input[@value='BOETTCHER JESSE']"));
		js1.executeScript("arguments[0].click();", SelectCurrentOwner);
		
		Thread.sleep(1000);
		
		//search within
//		SearchWithin();
//		
//		Thread.sleep(1000);
//		
//		WebElement SearchNo=GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
//		SearchNo.sendKeys("   PNC: AU2003200615A1 ");
//		
//		Thread.sleep(5000);
		
		ApplyFilter();
		
		Thread.sleep(5000);
		 //validation using assert
		  WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
		  wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		  System.out.println("s1 : "+validate.getText());
			  
		  String actualText="USER INTERFACE AND VIRTUAL PERSONALITY PRESENTATION BASED ON USER PROFILE";
		  Assert.assertEquals(validate.getText(), actualText);
			
		  Thread.sleep(1000);
		  
		  WebElement VerifyElement=GetDriver().findElement(By.xpath("//*[@id='filterContainer']/div[6]/filteritems/div[2]/div[6]/filtercheckboxwiththes/div[1]"));
		  System.out.println(VerifyElement.getText());
		  
		  Thread.sleep(2000);
		 
		  GoToHomePage();
	}
	
	@Test
	public void Inventors() throws Exception
	{
		POMCommonProj();
		
		MainFilter();
		
		JavascriptExecutor js = (JavascriptExecutor)GetDriver();
		WebElement Clickon_Inventors = GetDriver().findElement(By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='INV']//child::span[1]"));
		js.executeScript("arguments[0].click();",Clickon_Inventors);
		
		Thread.sleep(1000);
		
		JavascriptExecutor js1 = (JavascriptExecutor)GetDriver();
		WebElement Select_Inventors = GetDriver().findElement(By.xpath("//input[@value='ALEXANDER DE PAZ']"));
		js1.executeScript("arguments[0].click();",Select_Inventors);
		
		Thread.sleep(1000);
		
//		SearchWithin();
//		
//		Thread.sleep(1000);
//		
//		WebElement SearchNo=GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
//		SearchNo.sendKeys("   PNC: AU2015217406A1  ");
//		
//		Thread.sleep(5000);
		
		ApplyFilter();
		
		Thread.sleep(5000);
		 //validation using assert
		  WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
		  wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		  System.out.println("s1 : "+validate.getText());
			  
		  String actualText="USER INTERFACE AND VIRTUAL PERSONALITY PRESENTATION BASED ON USER PROFILE";
		  Assert.assertEquals(validate.getText(), actualText);
			
//		  Thread.sleep(1000);
//		  
//		  WebElement VerifyElement=GetDriver().findElement(By.xpath("//*[@id='filterContainer']/div[12]/filteritems/div[2]/div[6]/filtercheckboxwiththes/div[1]"));
//		  System.out.println(VerifyElement.getText());
		  
		  Thread.sleep(2000);
		 
		  GoToHomePage();
	}
	
	@Test
	public void PBNCountry() throws Exception
	{
		POMCommonProj();
		
		MainFilter();
		
		JavascriptExecutor js = (JavascriptExecutor)GetDriver();
		WebElement Clickon_PBNCountry = GetDriver().findElement(By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='PBC']//child::span[1]"));
		js.executeScript("arguments[0].click();",Clickon_PBNCountry);
		
		Thread.sleep(1000);
		
		JavascriptExecutor js1 = (JavascriptExecutor)GetDriver();
		WebElement Select_PBNCountrySugg= GetDriver().findElement(By.xpath("//input[@value='WO']"));
		js1.executeScript("arguments[0].click();",Select_PBNCountrySugg);
		
		Thread.sleep(1000);
		
		//search within
//		SearchWithin();
//		
//		Thread.sleep(1000);
//		
//		WebElement SearchNo=GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
//		SearchNo.sendKeys("   PNC: WO2017209521A1 ");
//		
//		Thread.sleep(5000);
		
		ApplyFilter();
		
		Thread.sleep(5000);
		 //validation using assert
		  WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
		  wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		  System.out.println("s1 : "+validate.getText());
			  
		  String actualText="USER INTERFACE AND VIRTUAL PERSONALITY PRESENTATION BASED ON USER PROFILE";
		  Assert.assertEquals(validate.getText(), actualText);
			
		  Thread.sleep(1000);
		 
		  GoToHomePage();
	}
	
	@Test
	public void PRCCountry() throws Exception
	{
		POMCommonProj();
		
		MainFilter();
		
		JavascriptExecutor js = (JavascriptExecutor)GetDriver();
		WebElement Clickon_PRCCountry = GetDriver().findElement(By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='PRC']//child::span[1]"));
		js.executeScript("arguments[0].click();",Clickon_PRCCountry);
		
		Thread.sleep(1000);
		
		JavascriptExecutor js1 = (JavascriptExecutor)GetDriver();
		WebElement Select_PRCCountrySugg= GetDriver().findElement(By.xpath("//input[@value='US']"));
		js1.executeScript("arguments[0].click();",Select_PRCCountrySugg);
		
		Thread.sleep(1000);
		
		ApplyFilter();

		Thread.sleep(5000);
		 //validation using assert
		  WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
		  wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		  WebElement validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		  System.out.println("s1 : "+validate.getText());
			  
		  String actualText="USER INTERFACE AND VIRTUAL PERSONALITY PRESENTATION BASED ON USER PROFILE";
		  Assert.assertEquals(validate.getText(), actualText);
			
		  Thread.sleep(1000);
		 
		  GoToHomePage();
	}
	
}
