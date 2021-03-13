package Project;

import java.sql.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Login.BaseTest;


public class General extends BaseTest{
 
	@Test
	public void AcccessLastProject() throws Exception
	{
		Thread.sleep(1000);
		
		WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='recentProjectHome']")));
		  
//		GetDriver().findElement(By.xpath("//*[@id='recentProjectHome']/div[3]/div[2]")).getText();
		
		Thread.sleep(1000);
		
		WebElement ClickonProjectName=GetDriver().findElement(By.xpath("//span[contains(text(),'Automation_Project')]"));
		ClickonProjectName.click();
		
		Thread.sleep(2000);
		
		GoToHomePage();
		
		Thread.sleep(1000);
		
		//validation using assert		  
		  WebElement validate=GetDriver().findElement(By.xpath("//*[@id='headerCntrl_patseerLogoCntrl_projectNmId']"));
		  System.out.println("s1 : "+validate.getText());
		  
		  String actualText="Automation_Project";
		  Assert.assertEquals(validate.getText(), actualText);
		  
		  Thread.sleep(1000);
		
	}
	
	@Test
	public void CreateProject() throws Exception
	{
		Thread.sleep(1000);
		
		WebElement MouseOver = GetDriver().findElement(By.xpath("//*[@id='headerCntrl_patseerLogoCntrl_liProject']/a"));
	    Actions action = new Actions(GetDriver());
	    action.moveToElement(MouseOver).build().perform();
	    
	    WebElement SelectCreatebyMe=GetDriver().findElement(By.xpath("//a[@class='m_5_s_2']"));
	    SelectCreatebyMe.click();
	    
	    Thread.sleep(1000);
	    
	    JavascriptExecutor js2 = (JavascriptExecutor)GetDriver();
		WebElement ClickonCreateProject = GetDriver().findElement(By.xpath("//button[@class='btn btn-success'][contains(text(),'Create Project')]"));
		js2.executeScript("arguments[0].click();", ClickonCreateProject);
	  	
	  	Thread.sleep(1000);
	    
	    Date d = new Date(System.currentTimeMillis());
		GetDriver().findElement(By.name("ProjectList")).sendKeys("Automated_Project_" + d);
		  
	    Thread.sleep(1000);
	    
	    WebElement CreateProject=GetDriver().findElement(By.xpath("//*[@id='CreateProjectModal']/div/div/div[3]/button[1]"));
	    CreateProject.click();
	    
	    Thread.sleep(1000);
	    
		GoToHomePage(); 
	    
	}
	
	@Test
	public void AddProj_CurrentSearch() throws Exception
	{
		Thread.sleep(1000);
		
		WebElement MouseOver = GetDriver().findElement(By.xpath("//*[@id='headerCntrl_patseerLogoCntrl_liProject']/a"));
	    Actions action = new Actions(GetDriver());
	    action.moveToElement(MouseOver).build().perform();
	    
	    WebElement SelectCreatebyMe=GetDriver().findElement(By.xpath("//a[@class='m_5_s_2']"));
	    SelectCreatebyMe.click();
	    
	    Thread.sleep(1000);
	    
	    WebElement selectProject=GetDriver().findElement(By.xpath("//table//tr[14]/td[7]"));
	    selectProject.click();
//	    WebElement ClickonAddtoSearch=GetDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_UserProjectList_projectListCreatedByMeAG_tblProjectNameID']/tbody/tr[2]/td/table/tbody/tr[1]/td[7]"));
//	    ClickonAddtoSearch.click();
	    
	    Thread.sleep(1000);
	     
	    WebElement ClickOnCurrentSearch= GetDriver().findElement(By.xpath("//a[contains(text(),'Current Search')]"));
	    ClickOnCurrentSearch.click();
	    
	    WebElement VerifyProjectName=GetDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_CurrentSearchNG_divdataContainer']/table/tbody/tr[1]/td[2]/div"));
	    System.out.println(VerifyProjectName.getText());
	    
	    Thread.sleep(1000);
	    
	    GoToHomePage();
	}
	
	@Test
	public void compareProjects() throws Exception
	{
		Thread.sleep(1000);
		
		WebElement MouseOver = GetDriver().findElement(By.xpath("//*[@id='headerCntrl_patseerLogoCntrl_liProject']/a"));
	    Actions action = new Actions(GetDriver());
	    action.moveToElement(MouseOver).build().perform();
	    
	    WebElement SelectCreatebyMe=GetDriver().findElement(By.xpath("//a[@class='m_5_s_5']"));
	    SelectCreatebyMe.click();
	    
	    Thread.sleep(2000);

		// iframe
		WebElement iframeElement = GetDriver().findElement(By.xpath("//iframe[@id='ContentPlaceHolder1_UserProjectList_iFrameProjectComapre']"));
		GetDriver().switchTo().frame(iframeElement);

		Thread.sleep(4000);
	    
	    WebElement enterFirstProjName=GetDriver().findElement(By.xpath("//*[@id='token-input-ContentPlaceHolder1_compareProjectCntrl_txtAllProjectText']"));
	    enterFirstProjName.sendKeys("Test");
	    
	    Thread.sleep(1000);
	    
	    WebElement ClickOnCurrentSearch= GetDriver().findElement(By.xpath("//a[contains(text(),'Current Search')]"));
	    ClickOnCurrentSearch.click();
	    
	    WebElement VerifyProjectName=GetDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_CurrentSearchNG_divdataContainer']/table/tbody/tr[1]/td[2]/div"));
	    System.out.println(VerifyProjectName.getText());
	    
	    Thread.sleep(1000);
	    
	    GoToHomePage();
	}
}
