package Project;

import java.sql.Date;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Login.BaseTest;

public class ProjectSettings extends BaseTest {

	@Test
	public void ProjectDetails() throws Exception {

		Thread.sleep(1000);

		CommonProject();

		Thread.sleep(2000);

		// click on project details
		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Details = GetDriver().findElement(
				By.xpath("//*[@id='ContentPlaceHolder1_prjContainer']/div[1]/div/div[1]/div[1]/span/span[1]"));
		js.executeScript("arguments[0].click();", Details);

		WebElement getProjectDetails = GetDriver().findElement(By.xpath("//div[@id='divProjectInfo']"));
		System.out.println(getProjectDetails.getText());

		Thread.sleep(1000);

		GoToHomePage();

	}

	@Test
	public void CreateCatalogue1() throws Exception {
		Thread.sleep(1000);

		Project_CreatebyMe();

		WebElement ClickonCatalogue = GetDriver().findElement(By.cssSelector("#divCreateMoveBtn"));
		ClickonCatalogue.click();

		Thread.sleep(500);

		// JavascriptExecutor js = (JavascriptExecutor)GetDriver();
		WebElement ClickonCreateNew = GetDriver().findElement(By.xpath("//span[contains(text(),'Create New')]"));
		ClickonCreateNew.click();

		Thread.sleep(500);

		GetDriver().findElement(By.xpath(
				"//div[@id='ContentPlaceHolder1_UserProjectList_projectListCreatedByMeAG_newCatalougeContainer']"));

		Thread.sleep(500);

		Date d = new Date(System.currentTimeMillis());
		GetDriver()
				.findElement(By
						.xpath("//*[@id='ContentPlaceHolder1_UserProjectList_projectListCreatedByMeAG_newCatalougeContainer']/div[1]/span[2]/input"))
				.sendKeys("catalogue" + d);

		Thread.sleep(500);

		WebElement ClickonAdd = GetDriver().findElement(By.xpath("//input[@class='patseer_button']"));
		ClickonAdd.click();

		Thread.sleep(1000);

		GoToHomePage();

	}

	@Test
	public void MoveToRight() {
		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='divSetting']/div[2]/div[1]")));

		WebElement MoveToRightt = GetDriver()
				.findElement(By.xpath("//*[@id='ContentPlaceHolder1_dashLetCntrl_dashletCntrl_btnRight']"));
		MoveToRightt.click();
	}

	@Test
	public void AddDashlet() throws Exception {
		GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement commonProj = GetDriver().findElement(By
				.xpath("//span[@class='patseer_Secondary_Button ng-binding'][contains(text(),'Automation_Project')]"));
		js.executeScript("arguments[0].click();", commonProj);

		Thread.sleep(4000);

		// click on project settings
		WebElement ClickonSettings = GetDriver().findElement(
				By.xpath("//*[@id='ContentPlaceHolder1_prjContainer']/div[1]/div/div[1]/div[1]/div/div[2]/span[2]"));
		ClickonSettings.click();
		System.out.println("clicked on settings");

		Thread.sleep(1000);

		WebElement OtherProjectSettings = GetDriver()
				.findElement(By.xpath("//a[contains(text(),'Other Project Settings')]"));
		OtherProjectSettings.click();
		System.out.println("clicked on other project settings");

		Thread.sleep(2000);

		// iframe
		WebElement iframeElement = GetDriver().findElement(By.id("frmProjectConfigurationContainer"));
		GetDriver().switchTo().frame(iframeElement);

		Thread.sleep(1000);

		WebElement AddDashlet = GetDriver()
				.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ProjectConfigurationControl1_tabCntrl_atag_3']"));
		AddDashlet.click();
		System.out.println("clicked on add dashlet");

		Thread.sleep(2000);

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id='ContentPlaceHolder1_dashLetCntrl_dashletCntrl_lstOptionNonDbField']")));

		// JavascriptExecutor js = (JavascriptExecutor)GetDriver();
		WebElement SelectAbstract = GetDriver().findElement(By.xpath("//option[contains(text(),'Abstract')]"));
		js.executeScript("arguments[0].click();", SelectAbstract);

		System.out.println("clicked on abstract");

		MoveToRight();

	}

	@Test
	public void LogoURL() throws Exception {
		/*
		 * CommonMethod();
		 * 
		 * Thread.sleep(1000);
		 * 
		 * JavascriptExecutor js = (JavascriptExecutor)GetDriver(); WebElement
		 * CreateProj=GetDriver().findElement(By.xpath(
		 * "//*[@id='ContentPlaceHolder1_UserProjectList_projectListCreatedByMeAG_divCreateProjectBtn']"
		 * )); js.executeScript("arguments[0].click();", CreateProj);
		 * 
		 * // WebElement CreateProj=GetDriver().findElement(By.xpath(
		 * "//*[@id='ContentPlaceHolder1_UserProjectList_projectListCreatedByMeAG_divCreateProjectBtn']"
		 * )); // CreateProj.click();
		 * 
		 * Thread.sleep(2000);
		 * 
		 * JavascriptExecutor js2 = (JavascriptExecutor)GetDriver(); Date d =
		 * new Date(System.currentTimeMillis()); WebElement
		 * AddProjName=GetDriver().findElement(By.name(
		 * "addNewProjectNew:projName"));
		 * js2.executeScript("arguments[0].click();", CreateProj);
		 * AddProjName.sendKeys("AddProjName" +d);
		 * 
		 * Thread.sleep(2000);
		 * 
		 * WebElement AddNewProject=GetDriver().findElement(By.xpath(
		 * "//*[@id='addNewProjectNew:submitButton']")); AddNewProject.click();
		 */

		GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement commonProj = GetDriver().findElement(By
				.xpath("//span[@class='patseer_Secondary_Button ng-binding'][contains(text(),'Automation_Project')]"));
		js.executeScript("arguments[0].click();", commonProj);

		Thread.sleep(4000);

		// click on project settings
		WebElement ClickonSettings = GetDriver().findElement(By.xpath("//span[contains(text(),'Settings')]"));
		ClickonSettings.click();
		System.out.println("clicked on settings");

		Thread.sleep(1000);

		WebElement OtherProjectSettings = GetDriver()
				.findElement(By.xpath("//a[contains(text(),'Other Project Settings')]"));
		OtherProjectSettings.click();
		System.out.println("clicked on other project settings");

		Thread.sleep(2000);

		// iframe
		WebElement iframeElement = GetDriver().findElement(By.id("frmProjectConfigurationContainer"));
		GetDriver().switchTo().frame(iframeElement);

		Thread.sleep(1000);

		WebElement ProjSetting = GetDriver()
				.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ProjectConfigurationControl1_tabCntrl_atag_0']"));
		ProjSetting.click();
		System.out.println("clicked on project settings");

		Thread.sleep(1000);

		WebElement Logo = GetDriver().findElement(By.xpath("//input[@name='logoUploader']"));
		Logo.click();

		Thread.sleep(2000);

	}

	@Test
	public void ProjectOperationMode() throws Exception {
		// select project
		GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement commonProj = GetDriver()
				.findElement(By.xpath("//*[@id='recentProjectHome']/div[3]/div[3]/div[1]/span[1]"));
		js.executeScript("arguments[0].click();", commonProj);

		Thread.sleep(4000);

		// click on project settings
		WebElement ClickonSettings = GetDriver().findElement(
				By.xpath("//*[@id='ContentPlaceHolder1_prjContainer']/div[1]/div/div[1]/div[1]/div/div[2]/span[2]"));
		ClickonSettings.click();
		System.out.println("clicked on settings");

		Thread.sleep(1000);

		WebElement OtherProjectSettings = GetDriver()
				.findElement(By.xpath("//a[contains(text(),'Other Project Settings')]"));
		OtherProjectSettings.click();
		System.out.println("clicked on other project settings");

		Thread.sleep(2000);

		// iframe
		WebElement iframeElement = GetDriver().findElement(By.id("frmProjectConfigurationContainer"));
		GetDriver().switchTo().frame(iframeElement);

		Thread.sleep(1000);

		JavascriptExecutor js2 = (JavascriptExecutor) GetDriver();
		WebElement SFAM = GetDriver().findElement(By.xpath("//div[contains(text(),'Project Operation Mode :')]"));
		js2.executeScript("arguments[0].click();", SFAM);

		Thread.sleep(1000);

		JavascriptExecutor js3 = (JavascriptExecutor) GetDriver();
		WebElement EFAM = GetDriver().findElement(By.xpath("//option[contains(text(),'Extended Family (EFAM)')]"));
		js3.executeScript("arguments[0].click();", EFAM);

	}

	@Test
	public void ProjectAddHistory() throws Exception {

		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement commonProj = GetDriver().findElement(By
				.xpath("//span[@class='patseer_Secondary_Button ng-binding'][contains(text(),'Automation_Project')]"));
		js.executeScript("arguments[0].click();", commonProj);

		Thread.sleep(3000);

		// click on project settings
		WebElement ClickonSettings = GetDriver().findElement(
				By.xpath("//*[@id='ContentPlaceHolder1_prjContainer']/div[1]/div/div[1]/div[1]/div/div[2]/span[2]"));
		ClickonSettings.click();
		System.out.println("clicked on settings");

		Thread.sleep(1000);

		WebElement AddProjectHistory = GetDriver()
				.findElement(By.xpath("//*[@id='proHistoryId']/div/div[2]/ul/li[1]/a"));
		AddProjectHistory.click();
		System.out.println("clicked on Add Project History");

		Thread.sleep(2000);

		WebElement ClickonImport = GetDriver()
				.findElement(By.xpath("//*[@id='searchHistoryId']/div/div/table/tbody/tr[1]/td[6]/span"));
		ClickonImport.click();

		Thread.sleep(1000);

		// WebElement
		// Clear=GetDriver().findElement(By.xpath("//div[contains(text(),'Clear')]"));
		// Clear.click();

		// validation using assert
		//// WebElement
		//// validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		// System.out.println("s1 : "+CheckRecord.getText());
		//
		// String actualText="3 Records";
		// Assert.assertEquals(CheckRecord.getText(), actualText);

		GoToHomePage();
	}

	@Test
	public void CopyPaste() throws Exception {

		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement commonProj = GetDriver().findElement(By
				.xpath("//span[@class='patseer_Secondary_Button ng-binding'][contains(text(),'Automated_Project2020-09-23')]"));
		js.executeScript("arguments[0].click();", commonProj);

		Thread.sleep(3000);

		// click on project settings
		WebElement ClickonImport = GetDriver().findElement(
				By.xpath("//span[@class='patseer_Secondary_Button addBtnCSS handPointer fontSize11 ng-scope'][contains(text(),'Import')]"));
		ClickonImport.click();
		System.out.println("clicked on Import");

		Thread.sleep(3000);

		WebElement CopyPasleNos = GetDriver().findElement(By.xpath("//textarea[@id='importCpyPstTextareaId']"));
		CopyPasleNos.sendKeys(
				"US2008248748A1,US8213908B2 ,US8838073B2 ,US9363253B2 ,US2014351901A1 ,US2012238212A1,WO9816586");

		Thread.sleep(1000);

		WebElement Lookup = GetDriver().findElement(By.xpath("//*[@id='MyImportID']/div/div[4]/button[1]"));
		Lookup.click();

		Thread.sleep(2000);

		WebElement ClickonMoreOptions = GetDriver().findElement(By.xpath("//a[@id='shMAnchID']"));
		ClickonMoreOptions.click();

		// Thread.sleep(2000);
		//
		// WebElement
		// Flag=GetDriver().findElement(By.xpath("//*[@id='divmanuals']/div[2]/div[2]/span/span"));
		// Flag.click();
		//
		// WebElement
		// ClickOnSet=GetDriver().findElement(By.xpath("//*[@id='divmanuals']/div[2]/div[2]/span/ul"));
		// ClickOnSet.click();

		// JavascriptExecutor js1 = (JavascriptExecutor)GetDriver();
		// WebElement SelectRed =
		// GetDriver().findElement(By.xpath("//*[@id='prjflgs']"));
		// js1.executeScript("arguments[0].click();", SelectRed);

		// Thread.sleep(2000);
		//
		// WebElement
		// Ratings=GetDriver().findElement(By.xpath("//*[@id='divmanuals']/div[3]/div[2]/span/span"));
		// Ratings.click();
		//
		// WebElement
		// ClickOnSet=GetDriver().findElement(By.xpath("//*[@id='divmanuals']/div[3]/div[2]/span/ul/li[2]/a"));
		// ClickOnSet.click();
		//
		// Thread.sleep(500);
		//
		// WebElement
		// SelectStar=GetDriver().findElement(By.xpath("//*[@id='divmanuals']/div[3]/div[3]/div/div[2]/span[2]/span[2]/i"));
		// SelectStar.click();
		//
		Thread.sleep(2000);

		WebElement Comments = GetDriver().findElement(By.xpath("//*[@id='divmanuals']/div[4]/div[2]/span/span"));
		Comments.click();

		WebElement ClickOnSet2 = GetDriver()
				.findElement(By.xpath("//*[@id='divmanuals']/div[4]/div[2]/span/ul/li[2]/a"));
		ClickOnSet2.click();

		Thread.sleep(500);

		WebElement LocoteComments = GetDriver().findElement(By.xpath("//*[@id='txtCommentsprjs']"));
		LocoteComments.click();
		LocoteComments.sendKeys("test1");

		Thread.sleep(500);

		// WebElement
		// EnterComments=GetDriver().findElement(By.xpath("//*[@id='txtCommentsprjs']"));
		// EnterComments.click();
		// Ent

		WebElement ClickOnLookup = GetDriver().findElement(By.xpath("//*[@id='manualImportbtnId']"));
		ClickOnLookup.click();

		Thread.sleep(3000);

		WebElement Close = GetDriver().findElement(By.xpath("//*[@id='MyImportID']/div/div[1]/button"));
		Close.click();

		GoToHomePage();

	}

	@Test
	public void OpenProjectSetting() throws Exception {

		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement commonProj = GetDriver().findElement(By
				.xpath("//span[@class='patseer_Secondary_Button ng-binding'][contains(text(),'Automation_Project')]"));
		js.executeScript("arguments[0].click();", commonProj);

		Thread.sleep(4000);

		// click on project settings
		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement commonProj1 = GetDriver().findElement(
				By.xpath("//*[@id='ContentPlaceHolder1_prjContainer']/div[1]/div/div[1]/div[1]/div/div[2]/span[2]"));
		js1.executeScript("arguments[0].click();", commonProj1);
		// WebElement
		// ClickonSettings=GetDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_prjContainer']/div[1]/div/div[1]/div[1]/div/div[2]/span[2]"));
		// ClickonSettings.click();
		System.out.println("clicked on settings");

		Thread.sleep(2000);

		GoToHomePage();

	}

	@Test
	public void AddHistory() throws Exception {
		OpenProjectSetting();

		Thread.sleep(2000);

		WebElement Clickonadd = GetDriver().findElement(By.partialLinkText("Project Add Histo"));
		Clickonadd.click();

		Thread.sleep(1000);

		GetDriver().findElement(By.xpath("//*[@id='searchHistoryId']/div/div/table/tbody/tr[1]"));

		WebElement ClickonApply = GetDriver()
				.findElement(By.xpath("//*[@id='searchHistoryId']/div/div/table/tbody/tr[1]/td[6]/span"));
		ClickonApply.click();

	}

	@Test
	public void AddToGroup1() throws Exception {
		OpenProjectSetting();

		Thread.sleep(3000);
		/*
		 * WebElement ClickonaddGrp=GetDriver().findElement(By.xpath(
		 * "//*[@id='proHistoryId']/div/div[2]/ul/li[6]/a"));
		 * ClickonaddGrp.click();
		 * 
		 * Thread.sleep(1000);
		 * 
		 * //iframe WebElement iframeElement =
		 * GetDriver().findElement(By.id("frmAddGroupSettings"));
		 * GetDriver().switchTo().frame(iframeElement);
		 * 
		 * Thread.sleep(1000);
		 * 
		 * Date GrpName = new Date(System.currentTimeMillis());
		 * GetDriver().findElement(By.name(
		 * "ctl00$ContentPlaceHolder1$ProjectList1$txtProjectList")).sendKeys(
		 * "catalogue" + GrpName);
		 * 
		 * Thread.sleep(2000);
		 * 
		 * WebElement AddToProject=GetDriver().findElement(By.xpath(
		 * "//*[@id='ContentPlaceHolder1_ProjectList1_cmdAddProjectList']"));
		 * AddToProject.click();
		 * 
		 * Thread.sleep(3000);
		 * 
		 * //validation using assert WebElement
		 * GrpName1=GetDriver().findElement(By.xpath(
		 * "//*[@id='ContentPlaceHolder1_ProjectList1_rptList_rep_ItemControl_divItemTeplate_0']/div[1]"
		 * )); System.out.println(GrpName1.getText());
		 * 
		 * 
		 * 
		 * // JavascriptExecutor js = (JavascriptExecutor)GetDriver(); //
		 * WebElement Close = GetDriver().findElement(By.xpath(
		 * "//*[@id='proHistoryId']/div/div[1]/button")); //
		 * js.executeScript("arguments[0].click();", Close); //
		 * 
		 */
		Thread.sleep(3000);

		GoToHomePage();

	}

	@Test
	public void EditGrpName() throws Exception {
		OpenProjectSetting();

		Thread.sleep(2000);
		/*
		 * WebElement ClickonaddGrp=GetDriver().findElement(By.xpath(
		 * "//*[@id='proHistoryId']/div/div[2]/ul/li[6]/a"));
		 * ClickonaddGrp.click();
		 * 
		 * Thread.sleep(1000);
		 * 
		 * //iframe WebElement iframeElement =
		 * GetDriver().findElement(By.id("frmAddGroupSettings"));
		 * GetDriver().switchTo().frame(iframeElement);
		 * 
		 * Thread.sleep(1000);
		 * 
		 * WebElement ClickonEditName=GetDriver().findElement(By.xpath(
		 * "//*[@id='ContentPlaceHolder1_ProjectList1_rptList_rep_ItemControl_itemTemplateControl_0_cmdEdit_0']"
		 * )); ClickonEditName.click();
		 * 
		 * Thread.sleep(1000);
		 * 
		 * GetDriver().findElement(By.id(
		 * "ContentPlaceHolder1_ProjectList1_txtProjectList")).sendKeys("edited"
		 * );
		 * 
		 * Thread.sleep(2000);
		 * 
		 * WebElement UpdateName=GetDriver().findElement(By.xpath(
		 * "//*[@id='ContentPlaceHolder1_ProjectList1_cmdUpdateProjectList']"));
		 * UpdateName.click();
		 * 
		 */
		Thread.sleep(3000);

		GoToHomePage();

	}

	@Test
	public void DeleteGroupName() throws Exception {
		OpenProjectSetting();

		Thread.sleep(2000);
		/*
		 * WebElement ClickonaddGrp=GetDriver().findElement(By.xpath(
		 * "//*[@id='proHistoryId']/div/div[2]/ul/li[6]/a"));
		 * ClickonaddGrp.click();
		 * 
		 * Thread.sleep(1000);
		 * 
		 * //iframe WebElement iframeElement =
		 * GetDriver().findElement(By.id("frmAddGroupSettings"));
		 * GetDriver().switchTo().frame(iframeElement);
		 * 
		 * Thread.sleep(2000);
		 * 
		 * WebElement DeleteName=GetDriver().findElement(By.xpath(
		 * "//input[@id='ContentPlaceHolder1_ProjectList1_rptList_rep_ItemControl_itemTemplateControl_0_cmdDelete_0']"
		 * )); DeleteName.click();
		 * 
		 * Thread.sleep(1000); //for handling browser closing popup
		 * GetDriver().switchTo().alert().accept();
		 */
		Thread.sleep(3000);

		GoToHomePage();

	}

	@Test
	public void ProjectFiles() throws Exception {
		OpenProjectSetting();

		Thread.sleep(2000);
		/*
		 * WebElement ClickonProjectFile=GetDriver().findElement(By.xpath(
		 * "//*[@id='proHistoryId']/div/div[2]/ul/li[8]/a"));
		 * ClickonProjectFile.click();
		 * 
		 * Thread.sleep(1000);
		 * 
		 * //iframe WebElement iframeElement =
		 * GetDriver().findElement(By.id("frmAddGroupSettings"));
		 * GetDriver().switchTo().frame(iframeElement);
		 * 
		 * Thread.sleep(1000);
		 * 
		 * WebElement ChooseFile=GetDriver().findElement(By.xpath(
		 * "//input[@id='fileupload']")); ChooseFile.click();
		 * 
		 * Thread.sleep(500);
		 * 
		 * //for importing external file GetDriver().switchTo()
		 * .activeElement().sendKeys("Z:/Pallavi/stnpatentdatabases.pdf");
		 * 
		 * Thread.sleep(100);
		 * 
		 * WebElement
		 * Upload=GetDriver().findElement(By.xpath("//*[@id='lnkFileUpload']"));
		 * Upload.click();
		 * 
		 * Thread.sleep(1000);
		 * 
		 * WebElement
		 * VerifyFile=GetDriver().findElement(By.xpath("//*[@id='divName']"));
		 * System.out.println(VerifyFile.getText());
		 * 
		 * Thread.sleep(2000);
		 * 
		 * WebElement ClickonDownload=GetDriver().findElement(By.xpath(
		 * "//*[@id='lnkDownload']")); ClickonDownload.click();
		 * 
		 * Thread.sleep(2000);
		 * 
		 * WebElement
		 * Delete=GetDriver().findElement(By.xpath("//*[@id='cmdDelete']"));
		 * Delete.click();
		 * 
		 * Thread.sleep(1000);
		 * 
		 * //for handling browser closing popup
		 * GetDriver().switchTo().alert().accept();
		 */
		Thread.sleep(3000);

		GoToHomePage();

	}

	@Test
	public void AddToGroup() throws Exception {
		OpenProjectSetting();

		Thread.sleep(3000);
		/*
		 * WebElement ClickonaddGrp=GetDriver().findElement(By.xpath(
		 * "//*[@id='proHistoryId']/div/div[2]/ul/li[6]/a"));
		 * ClickonaddGrp.click();
		 * 
		 * Thread.sleep(1000);
		 * 
		 * //iframe WebElement iframeElement =
		 * GetDriver().findElement(By.id("frmAddGroupSettings"));
		 * GetDriver().switchTo().frame(iframeElement);
		 * 
		 * Thread.sleep(1000);
		 * 
		 * Date GrpName = new Date(System.currentTimeMillis());
		 * GetDriver().findElement(By.name(
		 * "ctl00$ContentPlaceHolder1$ProjectList1$txtProjectList")).sendKeys(
		 * "catalogue" + GrpName);
		 * 
		 * Thread.sleep(2000);
		 * 
		 * WebElement AddToProject=GetDriver().findElement(By.xpath(
		 * "//*[@id='ContentPlaceHolder1_ProjectList1_cmdAddProjectList']"));
		 * AddToProject.click();
		 * 
		 * Thread.sleep(3000);
		 * 
		 * //validation using assert WebElement
		 * GrpName1=GetDriver().findElement(By.xpath(
		 * "//*[@id='ContentPlaceHolder1_ProjectList1_rptList_rep_ItemControl_divItemTeplate_0']/div[1]"
		 * )); System.out.println(GrpName1.getText());
		 * 
		 * 
		 * 
		 * // JavascriptExecutor js = (JavascriptExecutor)GetDriver(); //
		 * WebElement Close = GetDriver().findElement(By.xpath(
		 * "//*[@id='proHistoryId']/div/div[1]/button")); //
		 * js.executeScript("arguments[0].click();", Close); //
		 * 
		 */
		Thread.sleep(3000);

		GoToHomePage();

	}

	@Test
	public void ShareProject() throws Exception {

		Thread.sleep(1000);

		CommonProject();

		Thread.sleep(2000);

		SelectAllRecords();

		Thread.sleep(1000);

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 90);
		wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='PSharebtn']")));

		GetDriver().findElement(By.xpath("//div[@id='PSharebtn']")).click();

		Thread.sleep(2000);

		Actions a = new Actions(GetDriver());

		GetDriver().findElement(By.xpath("//input[@id='token-input-recEmailId_0']")).sendKeys("pallavi@patseerpro.com");
		Thread.sleep(2000);
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();

		Thread.sleep(5000);

		WebElement clickonSubmit = GetDriver().findElement(By.xpath("//sapn[@id='PS_SubmitId']"));
		clickonSubmit.click();

		Thread.sleep(5000);

		GoToHomePage();

	}

	@Test
	public void DownloadFileFormat() throws Exception {
		
		Thread.sleep(1000);

		CommonProject();

		Thread.sleep(3000);

		WebElement ClickonImport = GetDriver().findElement(
				By.xpath("//span[@class='patseer_Secondary_Button addBtnCSS handPointer fontSize11 ng-scope']"));
		ClickonImport.click();

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 90);
		wait1.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='MyImportID']//div[@class='modal-body']")));

		WebElement Clickon_Upload = GetDriver()
				.findElement(By.xpath("//a[contains(text(),'Upload from file (Upto 10,000)')]"));
		Clickon_Upload.click();

		Thread.sleep(1000);

		WebElement Clickon_NewRecords = GetDriver().findElement(By.xpath("//span[contains(text(),'New Records')]"));
		Clickon_NewRecords.click();

		Thread.sleep(500);

		WebElement Data_of_ExistingRecords = GetDriver()
				.findElement(By.xpath("//a[contains(text(),'Data for Existing Records')]"));
		Data_of_ExistingRecords.click();

		Thread.sleep(500);

		WebElement DownloadTemplate = GetDriver()
				.findElement(By.xpath("//a[@class='patseer_Secondary_Button floatRight handPointer ng-binding']"));
		DownloadTemplate.click();

		Thread.sleep(3000);

		WebElement Close = GetDriver().findElement(By.xpath("//button[@class='btn btn-default ng-binding']"));
		Close.click();

		Thread.sleep(2000);

		GoToHomePage();

	}

	@Test
	public void KeyConcept_BrowseClasses() throws Exception {
		
		Thread.sleep(1000);

		CommonProject();

		Thread.sleep(2000);

		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: ZA9702131B  ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(1000);

		WebElement ClickonPNKC = GetDriver().findElement(By.xpath("//label[@id='lblText_ZA9702131B']"));
		ClickonPNKC.click();

		Thread.sleep(3000);

		// considering that there is only one tab opened in that point.
		String oldTab = GetDriver().getWindowHandle();

		Thread.sleep(2000);

		ArrayList<String> newTab = new ArrayList<String>(GetDriver().getWindowHandles());
		newTab.remove(oldTab);
		// change focus to new tab
		GetDriver().switchTo().window(newTab.get(0));
		System.out.println("tab 0");

		Thread.sleep(1000);

		JavascriptExecutor js2 = (JavascriptExecutor) GetDriver();
		WebElement ClickonBibloTab = GetDriver().findElement(By.xpath("//a[@id='ui-id-19']"));
		js2.executeScript("arguments[0].click();", ClickonBibloTab);
		System.out.println("clicked on Click on Biblo Tab");

		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement BrowseClasses = GetDriver().findElement(
				By.xpath("//div[@id='ContentPlaceHolder1_detailsViewCntrl_detailViewDataNg_classDef_classDefShow']"));
		js.executeScript("arguments[0].click();", BrowseClasses);
		System.out.println("clicked on Browse Classes");

		Thread.sleep(1000);

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 90);
		wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By
				.xpath("//div[@id='ContentPlaceHolder1_detailsViewCntrl_detailViewDataNg_classDef_classDescViewer']")));

		Thread.sleep(1000);

		// validation using assert
		WebDriverWait wait2 = new WebDriverWait(GetDriver(), 60);
		wait2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[contains(text(),'HETEROCYCLIC COMPOUNDS ;')]")));
		WebElement validate = GetDriver().findElement(By.xpath("//div[contains(text(),'HETEROCYCLIC COMPOUNDS ;')]"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "HETEROCYCLIC COMPOUNDS ;";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		WebElement Close = GetDriver().findElement(By.xpath("//*[@id='classDescHeader']/div"));
		Close.click();

		Thread.sleep(2000);

		WebDriverWait wait3 = new WebDriverWait(GetDriver(), 90);
		wait3.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.xpath("//div[@id='ContentPlaceHolder1_detailsViewCntrl_detailViewDataNg_detailsViewtagcloudNG']")));

		Thread.sleep(2000);

		// validation using assert
		WebDriverWait wait4 = new WebDriverWait(GetDriver(), 60);
		wait4.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("// span[contains(text(),'Stabilizer Mixture')]")));
		WebElement validate2 = GetDriver().findElement(By.xpath("// span[contains(text(),'Stabilizer Mixture')]"));
		System.out.println("s1 : " + validate.getText());

		// String actualText2="Stabilizer Mixture ";
		// Assert.assertEquals(validate2.getText(), actualText2);

		Thread.sleep(3000);

		GetDriver().close();
		// change focus back to old tab
		GetDriver().switchTo().window(oldTab);
		System.out.println("tab 1");

		Thread.sleep(500);

		GoToHomePage();

	}

	@Test
	public void CreateCatalogue() throws Exception {

		Thread.sleep(1000);

		Project_CreatebyMe();

		Thread.sleep(1000);

		WebElement ClickonCatalogue = GetDriver().findElement(By.cssSelector("#divCreateMoveBtn"));
		ClickonCatalogue.click();

		Thread.sleep(500);

		// JavascriptExecutor js = (JavascriptExecutor)GetDriver();
		WebElement ClickonCreateNew = GetDriver().findElement(By.xpath("//span[contains(text(),'Create New')]"));
		ClickonCreateNew.click();

		Thread.sleep(500);

		GetDriver().findElement(By.xpath(
				"//div[@id='ContentPlaceHolder1_UserProjectList_projectListCreatedByMeAG_newCatalougeContainer']"));

		Thread.sleep(500);

		Date d = new Date(System.currentTimeMillis());
		GetDriver()
				.findElement(By
						.xpath("//*[@id='ContentPlaceHolder1_UserProjectList_projectListCreatedByMeAG_newCatalougeContainer']/div[1]/span[2]/input"))
				.sendKeys("catalogue" + d);

		Thread.sleep(500);

		WebElement ClickonAdd = GetDriver().findElement(By.xpath("//input[@class='patseer_button']"));
		ClickonAdd.click();

		Thread.sleep(1000);

		GoToHomePage();

	}

}
