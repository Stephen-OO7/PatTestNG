package ResultPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Login.BaseTest;

public class AddToProj extends BaseTest{
	
  @Test
  public void CopyPaste_Project() throws InterruptedException 
  {
	  Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)GetDriver();
		WebElement commonProj = GetDriver().findElement(By.xpath("//span[@class='patseer_Secondary_Button ng-binding'][contains(text(),'CheckAddToProj_Automation')]"));
		js.executeScript("arguments[0].click();", commonProj);
		
		Thread.sleep(4000);
		
		WebElement ClickonImport=GetDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_prjContainer']/div[1]/div/div[2]/div[1]/div/div[2]/span[1]"));
		ClickonImport.click();
		
		Thread.sleep(2000);
		
		WebElement EnterNumber=GetDriver().findElement(By.xpath("//*[@id='importCpyPstTextareaId']"));
		EnterNumber.sendKeys("CN110887291A , CN210162516U,WO2020054659A1,JP2020039326A,CN210163435U,CN110882274A ,CN210159023U,KR20200029475A,KR102090751B1,EP3052191B1,EP3622054A1 ,EP3500562A4,EP3621630A1,US2020085878A1,US10590382B2,US2020085914A1 ,US10590393B2");
		Thread.sleep(3000);
		
		WebElement Lookup=GetDriver().findElement(By.xpath("//*[@id='MyImportID']/div/div[4]/button[1]"));
		Lookup.click();
		
		Thread.sleep(2000);
		
		WebElement PrintMarchedRecords=GetDriver().findElement(By.xpath("//*[@id='cpNumberId']/div[2]/div[2]/div[2]"));
		System.out.println(PrintMarchedRecords.getText());
		
		Thread.sleep(3000);
		
		WebElement ClickOnAddToProj=GetDriver().findElement(By.xpath("//*[@id='manualImportbtnId']"));
		ClickOnAddToProj.click();
		
		Thread.sleep(3000);
		
		GoToHomePage();
  }
  
}
