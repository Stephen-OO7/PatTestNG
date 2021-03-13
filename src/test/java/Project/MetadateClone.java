package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Login.BaseTest;

public class MetadateClone extends BaseTest {

	@Test
	public void Create() throws Exception {
		
		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor)GetDriver();
		WebElement clickCreateProject = GetDriver().findElement(By.xpath("//button[contains(@class,'ng-binding')]"));
		js.executeScript("arguments[0].click();", clickCreateProject);
		
//		WebElement Clickon_Create = GetDriver().findElement(By.xpath("//button[contains(text(),'Create')]"));
//		Clickon_Create.click();
	}

	@Test
	public void Delete_Multiple_Project() throws Exception {
		
		Thread.sleep(1000);

		Project_CreatebyMe();

		Thread.sleep(4000);

		Create_Project();

		GetDriver().findElement(By.xpath("//input[@name='ProjectList']")).sendKeys("Automated_Project");

		Thread.sleep(2000);
		
		Create();
		
		Thread.sleep(4000);

//		CreateSecond_Project();
		
	}
	
	@Test
	public void CreateSecond_Project() throws Exception
	{
		Thread.sleep(3000);
		
		Create_Project();

		Thread.sleep(2000);

		WebElement CreateProject2 = GetDriver().findElement(By.xpath("//input[@name='ProjectList']"));
		CreateProject2.sendKeys("Automated_Project_2");
		
		Thread.sleep(2000);

		Create();
		
		Thread.sleep(7000);
	
		WebElement select_FirstProject=GetDriver().findElement(By.xpath("//tr[1]//td[1]//div[1]//input[1]"));
		select_FirstProject.click();
		
		Thread.sleep(2000);
		
		WebElement select_SecondProject=GetDriver().findElement(By.xpath("//body[@id='MASTERPAGEBODYID']//tr//tr[2]//td[1]//div[1]//input[1]"));
		select_SecondProject.click();
		
		Thread.sleep(3000);
		
		WebElement clickon_Delete=GetDriver().findElement(By.xpath("//button[@id='delMulProj_2 ']"));
		clickon_Delete.click();
		
		Thread.sleep(2000);
		
		WebElement verifyProjectName=GetDriver().findElement(By.xpath("//div[@id='del_popup_2']//ul[contains(@class,'token-input-list-facebook')]"));
		System.out.println(verifyProjectName.getText());
		
		Thread.sleep(200);
		
		WebElement clickon_Yes=GetDriver().findElement(By.xpath("//div[@id='del_popup_2']//a[@class='patseer_button'][contains(text(),'Yes')]"));
		clickon_Yes.click();
		
		Thread.sleep(6000);
		
		WebElement clickon_NotificationIcon=GetDriver().findElement(By.xpath("//i[@id='headerCntrl_patseerLogoCntrl_NotifIcon']"));
		clickon_NotificationIcon.click();
		
		Thread.sleep(500);
		
		WebElement validate=GetDriver().findElement(By.xpath("//div[@class='floatLeft width100']//div[1]//p[1]"));
		System.out.println("s1 : "+validate.getText());
		  
		String actualText="Project Automated_Project_2 Deleted";
		Assert.assertEquals(validate.getText(), actualText);
		
		Thread.sleep(3000);
		
		GoToHomePage();
	}
}
