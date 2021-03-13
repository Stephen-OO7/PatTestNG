package ProFeatures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Login.BaseTest;

public class SummaryReport extends BaseTest
{
	@Test
	public void GenerateMatrix()
	{
		WebElement Generate=GetDriver().findElement(By.xpath("//a[contains(text(),'Generate')]"));
		Generate.click();
	}
	
	@Test
	  public void CommonProject() throws Exception 
	  {
		  GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

			JavascriptExecutor js = (JavascriptExecutor)GetDriver();
			WebElement commonProj = GetDriver().findElement(By.xpath("//span[@class='patseer_Secondary_Button ng-binding'][contains(text(),'Automation_Project')]"));
			js.executeScript("arguments[0].click();", commonProj);
			
			Thread.sleep(2000);
			
			WebElement ele = GetDriver().findElement(By.xpath("//*[@id='headerCntrl_patseerLogoCntrl_liProjectName']"));
		    Actions action = new Actions(GetDriver());
		    action.moveToElement(ele).build().perform();
		      
			WebElement SelectSummaryReport=GetDriver().findElement(By.xpath("//*[@id='headerCntrl_patseerLogoCntrl_liSummaryRepo']/a"));
			SelectSummaryReport.click();
	  }
	
	@Test
	public void MoveToRight()
	{
		WebDriverWait wait1= new WebDriverWait(GetDriver(), 60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='floatLeft width10 topSpacer middleBox']")));

		WebElement MoveToRightt=GetDriver().findElement(By.xpath("//button[@name='moveToRight']"));
		MoveToRightt.click();
	}
	
	@Test
	public void AssigneeReport() throws Exception
	{
		CommonProject();
		
		WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='MultiSelectContainer']")));
		
//		WebDriverWait wait2= new WebDriverWait(GetDriver(), 60);
//		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ui-id-22']")));
		
		//asn
		WebElement SelectASN=GetDriver().findElement(By.xpath("//select[@id='Patent_Fields']//option[contains(text(),'Assignee')]"));
		SelectASN.click();
		
		MoveToRight();
		
		//IPC
		WebElement SelectIPC=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[7]"));
		SelectIPC.click();
		
		MoveToRight();
		
		//Register Legal Status
		WebElement SelectLegalStatus=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[16]"));
		SelectLegalStatus.click();
		
		MoveToRight();
		
		//Earliest Publication Year
		WebElement EPY=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[20]"));
		EPY.click();
		
		MoveToRight();
		
		//Industry
		WebElement SelectIndustry=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[18]"));
		SelectIndustry.click();
						
		MoveToRight();
		
		Thread.sleep(200);
		
		//ClickonProjectFieldsDropdown
		WebElement ProjectFieldsDropdown =GetDriver().findElement(By.xpath("//*[@id='ui-id-23']"));
		ProjectFieldsDropdown.click();
		
		//Categories(Top Level)
//		WebElement Categories=GetDriver().findElement(By.xpath("//*[@id='repoTreeContainer']/ul/li/span"));		
//		Categories.click();
		
		Thread.sleep(200);
		
		MoveToRight();
		
		//ClickonGenerate
		GenerateMatrix();
		
		Thread.sleep(5000);
		
		WebElement VerifyData=GetDriver().findElement(By.xpath("//*[@id='ID-rowTable']/tbody[3]"));
		System.out.println(VerifyData.getText());
		
		Thread.sleep(2000);
		
		GoToHomePage();
		
		//for handling browser closing popup
		  GetDriver().switchTo().alert().accept(); 
	}
	
	@Test
	public void InventorReport() throws Exception
	{

		CommonProject();
		
	    WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='rowDdl floatLeft width60']"))).click();
		
		WebElement SelectINVDropDown=GetDriver().findElement(By.xpath("//div[@class='floatLeft width60 centerText']//option[4]"));
		SelectINVDropDown.click();
		
		WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='MultiSelectContainer']")));
		
//		WebDriverWait wait2= new WebDriverWait(GetDriver(), 60);
//		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ui-id-22']")));
		
		//UC Full
		WebElement SelectASN=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[6]"));
		SelectASN.click();
		
		MoveToRight();
		
		//Tech Domain
		WebElement SelectIPC=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[18]"));
		SelectIPC.click();
		
		MoveToRight();
		
		//Industry
		WebElement SelectIndustry=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[10]"));
		SelectIndustry.click();
						
		MoveToRight();
		
		//ClickonProjectFieldsDropdown
//		WebElement ProjectFieldsDropdown =GetDriver().findElement(By.xpath("//*[@id='ui-id-23']"));
//		ProjectFieldsDropdown.click();
				
		//Categories(Top Level)
//		WebElement Categories=GetDriver().findElement(By.xpath("//*[@id='Project_Fields']/option[1]"));
//		Categories.click();
//		WebElement Categories=GetDriver().findElement(By.xpath("//*[@id='repoTreeContainer']/ul/li/span"));		
//		Categories.click();
				
		MoveToRight();
				
		//ClickonGenerate
		GenerateMatrix();
				
		Thread.sleep(5000);
				
		WebElement VerifyData=GetDriver().findElement(By.xpath("//*[@id='ID-rowTable']/tbody[3]"));
		System.out.println(VerifyData.getText());
				
		Thread.sleep(2000);
				
		GoToHomePage();
				
		//for handling browser closing popup
		GetDriver().switchTo().alert().accept(); 
		
	}
	
	@Test
	public void AttorneyReport() throws Exception
	{
		CommonProject();
		
		//*[@id="ui-id-25"]/div[1]/div[1]/span[2]/select/option[5]
		Thread.sleep(200);
		
	    WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='rowDdl floatLeft width60']"))).click();
		
		WebElement SelectATNDropDown=GetDriver().findElement(By.xpath("//select[@class='width100']//option[contains(text(),'Attorney')]"));
		SelectATNDropDown.click();
		
		WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='MultiSelectContainer']")));
		
//		WebDriverWait wait2= new WebDriverWait(GetDriver(), 60);
//		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ui-id-22']")));
		
		//CPC Full
		WebElement SelectASN=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[8]"));
		SelectASN.click();
		
		MoveToRight();
		
		//PBD
		WebElement SelectPBD=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[17]"));
		SelectPBD.click();
		
		MoveToRight();
		
		//TechDOM
//		WebElement SelectTechDOM=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[21]"));
//		SelectTechDOM.click();
				
		MoveToRight();
				
		//No Of References
		WebElement EPY=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[19]"));
		EPY.click();		
		
		//ClickonProjectFieldsDropdown
//		WebElement ProjectFieldsDropdown =GetDriver().findElement(By.xpath("//*[@id='ui-id-23']"));
//		ProjectFieldsDropdown.click();
				
		//Categories(Top Level)
//		WebElement Categories=GetDriver().findElement(By.xpath("//*[@id='Project_Fields']/option[1]"));
//		Categories.click();
		
//		WebElement Categories=GetDriver().findElement(By.xpath("//*[@id='repoTreeContainer']/ul/li/span"));		
//		Categories.click();
		
				
		MoveToRight();
				
		//ClickonGenerate
		GenerateMatrix();
				
		Thread.sleep(5000);
			
		WebElement VerifyData=GetDriver().findElement(By.xpath("//*[@id='ID-rowTable']/tbody[3]"));
		System.out.println(VerifyData.getText());
				
		Thread.sleep(2000);
				
		GoToHomePage();
				
		//for handling browser closing popup
		GetDriver().switchTo().alert().accept(); 
	}
	
	@Test
	public void ClassesReport() throws Exception
	{
		CommonProject();
		
	    WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='rowDdl floatLeft width60']"))).click();
		
		WebElement SelectUPCDropDown=GetDriver().findElement(By.xpath("//option[contains(text(),'UPC Main')]"));
		SelectUPCDropDown.click();
		
		WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='MultiSelectContainer']")));
		
//		WebDriverWait wait2= new WebDriverWait(GetDriver(), 60);
//		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ui-id-22']")));
		
		//CPC Full
		WebElement SelectASN=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[8]"));
		SelectASN.click();
		
		MoveToRight();
		
		//SFAM All Countries
		WebElement SFAMAllCountries=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[2]"));
		SFAMAllCountries.click();
		
		MoveToRight();
		
		//Tech Domain
		WebElement SelectIPC=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[18]"));
		SelectIPC.click();
		
		MoveToRight();
		
		//Industry
		WebElement SelectIndustry=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[10]"));
		SelectIndustry.click();
		
		MoveToRight();
				
		//No Of References
		WebElement EPY=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[19]"));
		EPY.click();		
		
		//ClickonProjectFieldsDropdown
//		WebElement ProjectFieldsDropdown =GetDriver().findElement(By.xpath("//*[@id='ui-id-23']"));
//		ProjectFieldsDropdown.click();
				
		//Categories(Top Level)
//		WebElement Categories=GetDriver().findElement(By.xpath("//*[@id='Project_Fields']/option[1]"));
//		Categories.click();
//		WebElement Categories=GetDriver().findElement(By.xpath("//*[@id='repoTreeContainer']/ul/li/span"));		
//		Categories.click();
				
		MoveToRight();
				
		//ClickonGenerate
		GenerateMatrix();
				
		Thread.sleep(5000);
			
		WebElement VerifyData=GetDriver().findElement(By.xpath("//*[@id='ID-rowTable']/tbody[3]"));
		System.out.println(VerifyData.getText());
				
		Thread.sleep(2000);
				
		GoToHomePage();
				
		//for handling browser closing popup
		GetDriver().switchTo().alert().accept(); 
	}
	
	@Test
	public void PubCountryReport() throws Exception
	{
		CommonProject();
		
	    WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='rowDdl floatLeft width60']"))).click();
		
		WebElement SelectPubCountryDropDown=GetDriver().findElement(By.xpath("//select[@class='width100']//option[contains(text(),'Publication Country')]"));
		SelectPubCountryDropDown.click();
		
		WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='MultiSelectContainer']")));
		
//		WebDriverWait wait2= new WebDriverWait(GetDriver(), 60);
//		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ui-id-22']")));
		
		//CPC Full
		WebElement SelectASN=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[8]"));
		SelectASN.click();
		
		MoveToRight();
		
		//SFAM All Countries
		WebElement SFAMAllCountries=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[2]"));
		SFAMAllCountries.click();
		
		MoveToRight();
		
		//Tech Domain
		WebElement SelectLegalStatus=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[16]"));
		SelectLegalStatus.click();
		
		MoveToRight();
		
		//Industry
		WebElement SelectIndustry=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[18]"));
		SelectIndustry.click();
		
		MoveToRight();
				
		//No Of References
		WebElement EPY=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[19]"));
		EPY.click();		
		
		//ClickonProjectFieldsDropdown
//		WebElement ProjectFieldsDropdown =GetDriver().findElement(By.xpath("//*[@id='ui-id-23']"));
//		ProjectFieldsDropdown.click();
//				
//		//Categories(Top Level)
//		WebElement Categories=GetDriver().findElement(By.xpath("//*[@id='Project_Fields']/option[1]"));
//		Categories.click();
				
		MoveToRight();
				
		//ClickonGenerate
		GenerateMatrix();
//		WebElement Generate=GetDriver().findElement(By.xpath("//*[@id='ui-id-29']/div[1]/div[2]/div"));
//		Generate.click();
				
		Thread.sleep(5000);
			
		WebElement VerifyData=GetDriver().findElement(By.xpath("//*[@id='ID-rowTable']/tbody[3]"));
		System.out.println(VerifyData.getText());
				
		Thread.sleep(2000);
				
		GoToHomePage();
				
		//for handling browser closing popup
		GetDriver().switchTo().alert().accept(); 
	}
	
	@Test
	public void PriorityCountry() throws Exception
	{
		CommonProject();
		
	    WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='rowDdl floatLeft width60']"))).click();
		
		WebElement SelectPriorityCountryDropDown=GetDriver().findElement(By.xpath("//select[@class='width100']//option[contains(text(),'Priority Country')]"));
		SelectPriorityCountryDropDown.click();
		
		WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='MultiSelectContainer']")));
		
//		WebDriverWait wait2= new WebDriverWait(GetDriver(), 60);
//		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ui-id-22']")));
		
		//CPC Full
		WebElement SelectASN=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[8]"));
		SelectASN.click();
		
		MoveToRight();
		
		//SFAM All Countries
		WebElement SFAMAllCountries=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[2]"));
		SFAMAllCountries.click();
		
		MoveToRight();
		
		//Tech Domain
		WebElement SelectLegalStatus=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[16]"));
		SelectLegalStatus.click();
		
		MoveToRight();
		
		//Industry
		WebElement SelectIndustry=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[18]"));
		SelectIndustry.click();
		
		MoveToRight();
				
		//No Of References
		WebElement EPY=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[19]"));
		EPY.click();		
		
		//ClickonProjectFieldsDropdown
//		WebElement ProjectFieldsDropdown =GetDriver().findElement(By.xpath("//*[@id='ui-id-23']"));
//		ProjectFieldsDropdown.click();
//				
//		//Categories(Top Level)
//		WebElement Categories=GetDriver().findElement(By.xpath("//*[@id='Project_Fields']/option[1]"));
//		Categories.click();
//				
		MoveToRight();
				
		//ClickonGenerate
		GenerateMatrix();
//		WebElement Generate=GetDriver().findElement(By.xpath("//*[@id='ui-id-29']/div[1]/div[2]/div"));
//		Generate.click();
				
		Thread.sleep(5000);
			
		WebElement VerifyData=GetDriver().findElement(By.xpath("//*[@id='ID-rowTable']/tbody[3]"));
		System.out.println(VerifyData.getText());
				
		Thread.sleep(2000);
				
		GoToHomePage();
				
		//for handling browser closing popup
		GetDriver().switchTo().alert().accept(); 
	}
	
	@Test
	public void LegalStatusCurrent() throws Exception
	{
		CommonProject();
		
	    WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='rowDdl floatLeft width60']"))).click();
		
		WebElement LegalStatusCurrentDropDown=GetDriver().findElement(By.xpath("//select[@class='width100']//option[contains(text(),'Legal Status Current')]"));
		LegalStatusCurrentDropDown.click();
		
		WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='MultiSelectContainer']")));
		
//		WebDriverWait wait2= new WebDriverWait(GetDriver(), 60);
//		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ui-id-22']")));
		
		//CPC Full
		WebElement SelectASN=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[8]"));
		SelectASN.click();
		
		MoveToRight();
		
		//SFAM All Countries
		WebElement SFAMAllCountries=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[2]"));
		SFAMAllCountries.click();
		
		MoveToRight();
		
		//PBD
		WebElement SelectPBD=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[17]"));
		SelectPBD.click();
		
		MoveToRight();
		
		//Industry
		WebElement SelectIndustry=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[18]"));
		SelectIndustry.click();
		
		MoveToRight();
				
		//No Of References
		WebElement EPY=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[19]"));
		EPY.click();		
		
		//ClickonProjectFieldsDropdown
//		WebElement ProjectFieldsDropdown =GetDriver().findElement(By.xpath("//*[@id='ui-id-23']"));
//		ProjectFieldsDropdown.click();
				
		//Categories(Top Level)
//		WebElement Categories=GetDriver().findElement(By.xpath("//*[@id='Project_Fields']/option[1]"));
//		Categories.click();
				
		MoveToRight();
				
		//ClickonGenerate
		GenerateMatrix();
//		WebElement Generate=GetDriver().findElement(By.xpath("//*[@id='ui-id-29']/div[1]/div[2]/div"));
//		Generate.click();
				
		Thread.sleep(5000);
			
		WebElement VerifyData=GetDriver().findElement(By.xpath("//*[@id='ID-rowTable']/tbody[3]"));
		System.out.println(VerifyData.getText());
				
		Thread.sleep(2000);
				
		GoToHomePage();
				
		//for handling browser closing popup
		GetDriver().switchTo().alert().accept(); 
	}
	
	@Test
	public void TechDomain() throws Exception
	{
		CommonProject();
		
	    WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='rowDdl floatLeft width60']"))).click();
		
		WebElement TechDomainDropDown=GetDriver().findElement(By.xpath("//select[@class='width100']//option[contains(text(),'Tech Domain')]"));
		TechDomainDropDown.click();
		
		WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='MultiSelectContainer']")));
		
//		WebDriverWait wait2= new WebDriverWait(GetDriver(), 60);
//		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ui-id-22']")));
		
		//CPC Full
		WebElement SelectASN=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[8]"));
		SelectASN.click();
		
		MoveToRight();
		
		//SFAM All Countries
		WebElement SFAMAllCountries=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[2]"));
		SFAMAllCountries.click();
		
		MoveToRight();
		
		//Tech Domain
		WebElement SelectLegalStatus=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[16]"));
		SelectLegalStatus.click();
//		WebElement SelectIPC=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[18]"));
//		SelectIPC.click();
		
		MoveToRight();
		
		//Industry
		WebElement SelectIndustry=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[18]"));
		SelectIndustry.click();
		
		MoveToRight();
				
		//No Of References
		WebElement EPY=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[19]"));
		EPY.click();		
		
		//ClickonProjectFieldsDropdown
//		WebElement ProjectFieldsDropdown =GetDriver().findElement(By.xpath("//*[@id='ui-id-23']"));
//		ProjectFieldsDropdown.click();
//				
//		//Categories(Top Level)
//		WebElement Categories=GetDriver().findElement(By.xpath("//*[@id='Project_Fields']/option[1]"));
//		Categories.click();
				
		MoveToRight();
				
		//ClickonGenerate
		GenerateMatrix();
//		WebElement Generate=GetDriver().findElement(By.xpath("//*[@id='ui-id-29']/div[1]/div[2]/div"));
//		Generate.click();
				
		Thread.sleep(5000);
			
		WebElement VerifyData=GetDriver().findElement(By.xpath("//*[@id='ID-rowTable']/tbody[3]"));
		System.out.println(VerifyData.getText());
				
		Thread.sleep(2000);
				
		GoToHomePage();
				
		//for handling browser closing popup
		GetDriver().switchTo().alert().accept(); 
	}
	
	@Test
	public void Flags()throws Exception
	{
		CommonProject(); 
		
		WebDriverWait wait1 =new WebDriverWait(GetDriver(),60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='rowDdl floatLeft width60']"))).click();
		
		WebElement Flags=GetDriver().findElement(By.xpath("//option[contains(text(),'Flags')]"));
		Flags.click();
		
		WebDriverWait wait2= new WebDriverWait(GetDriver(),60);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='MultiSelectContainer']")));
		
		//Select CASN
		WebElement CurrentOwner=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[2]"));
		CurrentOwner.click();
		
		MoveToRight();
		
		//SelectIPC
		WebElement SelectIPC=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[8]"));
		SelectIPC.click();
		
		//SelectRecord Type
		WebElement PTYP=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[13]"));
		PTYP.click();
				
		MoveToRight();
		
		//Tech Domain
		WebElement SelectLegalStatus=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[16]"));
		SelectLegalStatus.click();

		MoveToRight();
		
		//EEY
		WebElement EEY=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[18]"));
		EEY.click();
		
		MoveToRight();
				
		//No Of References
//		WebElement EPY=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[19]"));
//		EPY.click();		
				
		MoveToRight();
		
		GenerateMatrix();
		
		Thread.sleep(1000);
		
		WebElement FlagReport=GetDriver().findElement(By.xpath("//a[contains(text(),'Flags Report')]"));
		FlagReport.click();
		
		Thread.sleep(4000);
		
		WebElement VerifyData=GetDriver().findElement(By.xpath("//*[@id='ID-rowTable']/tbody[3]"));
		System.out.println(VerifyData.getText());
				
		Thread.sleep(2000);
				
		GoToHomePage();
				
		//for handling browser closing popup
		GetDriver().switchTo().alert().accept(); 
	}
	
	@Test
	public void Ratings() throws Exception
	{
		CommonProject(); 
		
		WebDriverWait wait1 =new WebDriverWait(GetDriver(),60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='rowDdl floatLeft width60']"))).click();
		
		WebElement Ratings=GetDriver().findElement(By.xpath("//option[contains(text(),'Ratings')]"));
		Ratings.click();
		
		WebDriverWait wait2= new WebDriverWait(GetDriver(),60);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='MultiSelectContainer']")));
		
		//Select CASN
		WebElement CurrentOwner=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[2]"));
		CurrentOwner.click();
		
		MoveToRight();
		
		//SelectIPC
		WebElement SelectIPC=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[8]"));
		SelectIPC.click();
		
		//SelectRecord Type
		WebElement PTYP=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[13]"));
		PTYP.click();
				
		MoveToRight();
		
		//Tech Domain
		WebElement SelectLegalStatus=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[16]"));
		SelectLegalStatus.click();

		MoveToRight();
		
		//EEY
		WebElement EEY=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[18]"));
		EEY.click();
		
		MoveToRight();
				
		//No Of References
//		WebElement EPY=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[19]"));
//		EPY.click();		
				
		MoveToRight();
		
		GenerateMatrix();
		
		Thread.sleep(1000);
		
		WebElement RatingsReport=GetDriver().findElement(By.xpath("//a[contains(text(),'Ratings Report')]"));
		RatingsReport.click();
		
		Thread.sleep(4000);
		
		
		WebElement VerifyData=GetDriver().findElement(By.xpath("//*[@id='ID-rowTable']/tbody[3]"));
		System.out.println(VerifyData.getText());
				
		Thread.sleep(2000);
				
		GoToHomePage();
				
		//for handling browser closing popup
		GetDriver().switchTo().alert().accept(); 
	}
	
	@Test
	public void CategoriesReport() throws Exception
	{
		Thread.sleep(1000);
		
		CommonProject();
		
		Thread.sleep(1000);
		
	    WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='rowDdl floatLeft width60']"))).click();
		
		WebElement SelectCategory=GetDriver().findElement(By.xpath("//select[@class='width100']//option[contains(text(),'Categories')]"));
		SelectCategory.click();
		
		WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='MultiSelectContainer']")));
		
//		WebDriverWait wait2= new WebDriverWait(GetDriver(), 60);
//		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ui-id-22']")));
		
		//UC Full
		WebElement SelectASN=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[6]"));
		SelectASN.click();
		
		MoveToRight();
		
		//Tech Domain
		WebElement SelectIPC=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[18]"));
		SelectIPC.click();
		
		MoveToRight();
		
		//Industry
		WebElement SelectIndustry=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[10]"));
		SelectIndustry.click();
		
		MoveToRight();
				
		//ClickonGenerate
		GenerateMatrix();
				
		Thread.sleep(5000);
				
		WebElement VerifyData=GetDriver().findElement(By.xpath("//div[@id='summarytab2']//td[2]"));
		System.out.println(VerifyData.getText());
				
		Thread.sleep(2000);
				
		GoToHomePage();
				
		//for handling browser closing popup
		GetDriver().switchTo().alert().accept(); 
		
		subLevelCategories();
	}
	
	@Test
	public void subLevelCategories() throws Exception
	{
		Thread.sleep(1000);
		
		CommonProject();
		
		Thread.sleep(1000);
		
	    WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='rowDdl floatLeft width60']"))).click();
		
		WebElement SelectCategory=GetDriver().findElement(By.xpath("//select[@class='width100']//option[contains(text(),'Categories')]"));
		SelectCategory.click();
		
		Thread.sleep(500);
		
		WebElement selectSub=GetDriver().findElement(By.xpath("//div[@class='rowCategoryOptions topSpacer width50']//div[2]//input[1]"));
		selectSub.click();
		
		Thread.sleep(800);
		
		GetDriver().findElement(By.xpath("//div[@class='rowCategoryOptions topSpacer width50']//div//span[@class='patseer_Secondary_Button'][contains(text(),'Select')]")).click();
		
		Thread.sleep(800);
		
		GetDriver().findElement(By.xpath("//div[@class='fancytree-radio']//span[@class='fancytree-node fancytree-has-children fancytree-exp-c fancytree-ico-c']//span[@class='fancytree-expander']")).click();
		
		Thread.sleep(800);
		
		GetDriver().findElement(By.xpath("//li[@id='ui-id-16']//ul//li//span[@class='fancytree-node fancytree-has-children fancytree-exp-c fancytree-ico-c']//span[@class='fancytree-checkbox']")).click();
		
		Thread.sleep(1000);
		
		GetDriver().findElement(By.xpath("//button[@class='floatLeft btn btn-default']")).click();
		
		Thread.sleep(1000);
		
		WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='MultiSelectContainer']")));
		
		//UC Full
		WebElement SelectASN=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[6]"));
		SelectASN.click();
		
		MoveToRight();
		
		//Tech Domain
		WebElement SelectIPC=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[18]"));
		SelectIPC.click();
		
		MoveToRight();
		
		//Industry
		WebElement SelectIndustry=GetDriver().findElement(By.xpath("//*[@id='Patent_Fields']/option[10]"));
		SelectIndustry.click();
		
		MoveToRight();
				
		//ClickonGenerate
		GenerateMatrix();
				
		Thread.sleep(5000);
				
		WebElement VerifyData=GetDriver().findElement(By.xpath("//div[@id='summarytab2']//td[2]"));
		System.out.println(VerifyData.getText());
				
		Thread.sleep(2000);
				
		GoToHomePage();
				
		//for handling browser closing popup
		GetDriver().switchTo().alert().accept(); 
	}
}
