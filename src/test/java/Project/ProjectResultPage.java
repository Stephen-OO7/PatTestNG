package Project;

import java.sql.Date;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Login.BaseTest;

public class ProjectResultPage extends BaseTest {
	static final String FILE_NAME = "/Users/Downloads/file.pdf";

	@Test
	public void CommonProjectPRP() throws Exception {
		// GoToHomePage();

		WebDriverWait wait = new WebDriverWait(GetDriver(), 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//span[@class='patseer_Secondary_Button ng-binding'][contains(text(),'Automation_Project')]")));

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement commonProj = GetDriver().findElement(By
				.xpath("//span[@class='patseer_Secondary_Button ng-binding'][contains(text(),'Automation_Project')]"));
		js.executeScript("arguments[0].click();", commonProj);

		Thread.sleep(2000);
	}

	@Test
	public void LiveExport() throws Exception {
		Thread.sleep(1000);

		CommonProjectPRP();

		Thread.sleep(500);

		// select current record tab
		WebDriverWait wait4 = new WebDriverWait(GetDriver(), 60);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'selector')]")))
				.click();

		WebElement selectCurrentRecords = GetDriver()
				.findElement(By.xpath("//span[contains(@class,'selector')]//div[2]//span[1]"));
		selectCurrentRecords.click();

		Thread.sleep(100);

		WebElement ClickonExport = GetDriver()
				.findElement(By.xpath("//div[@id='ContentPlaceHolder1_tabCntrl_ctl02_divimgExport']"));
		ClickonExport.click();

		Thread.sleep(200);

		WebElement ClickOnDropArrow = GetDriver().findElement(By.xpath("//h2[@id='hdd']"));
		ClickOnDropArrow.click();

		Thread.sleep(200);

		WebElement SelectBibloDrawings = GetDriver().findElement(By.xpath("//div[@id='divmain_BiblioDrawings']"));
		SelectBibloDrawings.click();

		WebElement Export = GetDriver().findElement(By.xpath("//button[@class='btn btn-primary btn-export font14']"));
		Export.click();

		Thread.sleep(200);

		WebElement ClickonOK = GetDriver().findElement(By.xpath("//button[@class='btn btn-primary font16']"));
		ClickonOK.click();

		Thread.sleep(500);

		/*
		 * public static void main(String[] args){ { File file = new
		 * File(FILE_NAME); if (!file.exists() || !file.isFile()) return;
		 * 
		 * System.out.println(getFileSizeBytes(file));
		 * System.out.println(getFileSizeKiloBytes(file));
		 * System.out.println(getFileSizeMegaBytes(file)); }
		 * 
		 * private static String getFileSizeMegaBytes(File file) { return
		 * (double) file.length() / (1024 * 1024) + " mb"; }
		 * 
		 * private static String getFileSizeKiloBytes(File file) { return
		 * (double) file.length() / 1024 + "  kb"; }
		 * 
		 * private static String getFileSizeBytes(File file) { return
		 * file.length() + " bytes";
		 */

		// GoToHomePage();
		//
		// Thread.sleep(1000);
		//
		// GetDriver().navigate().refresh();
		//
		// WebElement
		// ClickonDownload=GetDriver().findElement(By.xpath("//div[@id='recentExportHome']//div[1]//span[6]//span[1]//a[1]"));
		// ClickonDownload.click();
		//
		// Thread.sleep(500);
		//
		// File file = new
		// File("C:/Users/pallavi/Downloads/pallavi2@patseer.com_16Dec2019110017_0");
		// System.out.println(file.length());

	}

	@Test
	public void RecordCount() throws Exception {
		Thread.sleep(1000);

		CommonProjectPRP();

		Thread.sleep(1000);

		// select current record tab
		SelectCurrentRecords();

		Thread.sleep(1000);

		WebElement Recordcount = GetDriver()
				.findElement(By.xpath("//div[contains(@class,'div-result-action-NoPointer dra-buttons')]"));
		System.out.println(Recordcount.getText());

		Thread.sleep(1000);

		GoToHomePage();

	}

	@Test
	public void AllView() throws Exception {
		Thread.sleep(1000);

		CommonProjectPRP();

		Thread.sleep(500);

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='views']"))).click();

		Thread.sleep(500);

		WebElement Compact = GetDriver().findElement(By.xpath("//div[contains(text(),'Compact')]"));
		Compact.click();

		Thread.sleep(500);

		// GoToHomePage();

		// WebDriverWait wait2=new WebDriverWait(GetDriver(), 60);
		// wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='views']"))).click();
		//
		// WebElement
		// Standard=GetDriver().findElement(By.xpath("//li[contains(@class,'viewDrpContainer')]//div[3]"));
		// Standard.click();

		// validate text
		// WebElement
		// validate=GetDriver().findElement(By.xpath("//span[contains(text(),'A
		// kind of whole change Veneer quality on-line eval')]"));

	}

	@Test
	public void CurentRecord_CommonMethod() throws Exception {

		SelectCurrentRecords();

		Thread.sleep(1000);

		WebElement Recordcount = GetDriver()
				.findElement(By.xpath("//div[contains(@class,'div-result-action-NoPointer dra-buttons')]"));
		System.out.println(Recordcount.getText());
	}

	@Test
	public void Count_Dropdown() throws Exception {
		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		WebElement Dropdown = wait1.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='ulResultAction']/li[5]/div/div/button")));
		Dropdown.click();
	}

	@Test
	public void RecordCountDropdown() throws Exception {
		Thread.sleep(1000);

		CommonProjectPRP();

		Thread.sleep(1000);

		Count_Dropdown();

		Thread.sleep(400);

		WebElement select40 = GetDriver().findElement(By.xpath("//*[@id='ulResultAction']/li[5]/div/div/ul/li[3]"));
		select40.click();

		Thread.sleep(1000);

		CurentRecord_CommonMethod();

		Thread.sleep(800);

		WebElement ClickonClear = GetDriver().findElement(
				By.xpath("//*[@id='ulResultAction']/li[1]/div/checkuncheckcontrol/div/span[2]/div/div[3]/div"));
		ClickonClear.click();

		Thread.sleep(1000);

		Count_Dropdown();

		Thread.sleep(400);

		WebElement select60 = GetDriver().findElement(By.xpath("//*[@id='ulResultAction']/li[5]/div/div/ul/li[5]/a"));
		select60.click();

		Thread.sleep(2000);

		CurentRecord_CommonMethod();

		Thread.sleep(1000);

		GoToHomePage();

	}

	@Test
	public void PubDate_Descending_Sorting() throws Exception {
		
		Thread.sleep(1000);

		CommonProjectPRP();

		Thread.sleep(1000);

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		WebElement Dropdown = wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='ulResultAction']/li[6]/div/div")));
		Dropdown.click();

		Thread.sleep(500);
		
		// div[contains(@class,'dropdown padding0 floatLeft open')]//li[1]//a[1]
		WebElement selectPubDate = GetDriver().findElement(By.xpath("//a[contains(text(),'Pub. Date ↓')]"));
		selectPubDate.click();

		Thread.sleep(3000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: TWI434976B ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(3000);

		// validation using assert
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Process for the enhancement of thermostability";
		Assert.assertEquals(validate.getText(), actualText);
		
		Thread.sleep(1000);

		GoToHomePage();

	}

	@Test
	public void PubDate_Ascending_Sorting() throws Exception {
		Thread.sleep(1000);

		CommonProjectPRP();

		Thread.sleep(500);

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		WebElement Dropdown = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[6]//div[1]")));
		Dropdown.click();

		// div[contains(@class,'dropdown padding0 floatLeft open')]//li[1]//a[1]
		WebElement selectPubDate = GetDriver()
				.findElement(By.xpath("//a[contains(text(),'Pub. Date ↑')]"));
		selectPubDate.click();

		Thread.sleep(3000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC:IN116795A1 ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(3000);

		// validation using assert
		WebElement validate = GetDriver().findElement(
				By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "PROCESS FOR THE DYEING OF FIBRE MATERIALS OF POLYACRYLONTRILE OR COPOLYMERS CONTAINING ACRYLONTRILE";
		Assert.assertEquals(validate.getText(), actualText);
		
		Thread.sleep(1000);

		GoToHomePage();

	}

	@Test
	public void AppDate_Descending_Sorting() throws Exception {
		Thread.sleep(1000);

		CommonProjectPRP();

		Thread.sleep(500);

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		WebElement Dropdown = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[6]//div[1]")));
		Dropdown.click();

		// div[contains(@class,'dropdown padding0 floatLeft open')]//li[1]//a[1]
		WebElement selectAppDate = GetDriver()
				.findElement(By.xpath("//div[@class='dropdown padding0 floatLeft open']//li[3]//a[1]"));
		selectAppDate.click();

		Thread.sleep(3000);

		// search within
		SearchWithin();

		Thread.sleep(500);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: CN110358141A ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(3000);

		// validation using assert
		WebElement validate = GetDriver().findElement(By.xpath("//*[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Flame-retardant polymer material preparation method";
		Assert.assertEquals(validate.getText(), actualText);
		Thread.sleep(500);

		GoToHomePage();

	}

	@Test
	public void AppDate_Ascending_Sorting() throws Exception {
		Thread.sleep(1000);

		CommonProjectPRP();

		Thread.sleep(500);

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		WebElement Dropdown = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[6]//div[1]")));
		Dropdown.click();

		// div[contains(@class,'dropdown padding0 floatLeft open')]//li[1]//a[1]
		WebElement selectAppDate = GetDriver()
				.findElement(By.xpath("//div[contains(@class,'dropdown padding0 floatLeft open')]//li[4]"));
		selectAppDate.click();

		Thread.sleep(3000);

		// search within
		SearchWithin();

		Thread.sleep(500);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC:FR674638A");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(3000);

		// validation using assert
		WebElement validate = GetDriver().findElement(By.xpath("//*[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Method of obtaining azo dyes";
		Assert.assertEquals(validate.getText(), actualText);
		Thread.sleep(500);

		GoToHomePage();
	}

	@Test
	public void Relevance_Sorting() throws Exception {
		Thread.sleep(1000);

		CommonProjectPRP();

		Thread.sleep(500);

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		WebElement Dropdown = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[6]//div[1]")));
		Dropdown.click();

		WebElement selectRelevance = GetDriver()
				.findElement(By.xpath("//div[contains(@class,'dropdown padding0 floatLeft open')]//li[5]"));
		selectRelevance.click();

		Thread.sleep(1000);

		// validation using assert
		WebElement validate = GetDriver()
				.findElement(By.xpath("//label[contains(text(),'CONTINUOUS PROCESS FOR OPTICAL BRIGHTENING')]"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "CONTINUOUS PROCESS FOR OPTICAL BRIGHTENING";
		Assert.assertEquals(validate.getText(), actualText);
		Thread.sleep(500);

		GoToHomePage();
	}

	@Test
	public void MostCited_Sorting() throws Exception {
		Thread.sleep(1000);

		CommonProjectPRP();

		Thread.sleep(500);

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		WebElement Dropdown = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[6]//div[1]")));
		Dropdown.click();

		WebElement selectRelevance = GetDriver().findElement(By.xpath("//a[contains(text(),'Most Cited')]"));
		selectRelevance.click();

		Thread.sleep(1000);

		// validation using assert
		WebElement validate = GetDriver().findElement(
				By.xpath("//label[contains(text(),'Textile material and method for producing such a t')]"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Textile material and method for producing such a textile material";
		Assert.assertEquals(validate.getText(), actualText);
		Thread.sleep(500);

		GoToHomePage();
	}

	@Test
	public void SimpleFamily_Sorting() throws Exception {
		Thread.sleep(1000);

		CommonProjectPRP();

		Thread.sleep(500);

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		WebElement Dropdown = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[6]//div[1]")));
		Dropdown.click();

		WebElement selectRelevance = GetDriver()
				.findElement(By.xpath("//div[contains(@class,'dropdown padding0 floatLeft open')]//li[13]"));
		selectRelevance.click();

		Thread.sleep(1000);

		// validation using assert
		WebElement validate = GetDriver()
				.findElement(By.xpath("//div[@id='trnumber_WO02010287A1']//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "REACTIVE TRISAZO DYES";
		Assert.assertEquals(validate.getText(), actualText);
		Thread.sleep(500);

		GoToHomePage();
	}

	@Test
	public void ExtendedFamily_Sorting() throws Exception {
		Thread.sleep(1000);

		CommonProjectPRP();

		Thread.sleep(500);

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		WebElement Dropdown = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[6]//div[1]")));
		Dropdown.click();

		WebElement selectRelevance = GetDriver()
				.findElement(By.xpath("//div[contains(@class,'dropdown padding0 floatLeft open')]//li[14]"));
		selectRelevance.click();

		// search within
		SearchWithin();

		Thread.sleep(500);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: US7153332B2 ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(3000);

		// validation using assert
		WebElement validate = GetDriver().findElement(By.xpath("//*[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Use of a dyestuff for ink jet printing recording materials";
		Assert.assertEquals(validate.getText(), actualText);
		Thread.sleep(500);

		GoToHomePage();
	}

	@Test
	public void Splitview() throws Exception {
		Thread.sleep(1000);

		CommonProjectPRP();

		Thread.sleep(2000);

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		wait1.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//div[@class='patseer_Secondary_Button rs_split ng-scope']")))
				.click();

		Thread.sleep(2000);

		// iframe
		WebElement iframeElement = GetDriver().findElement(By.id("IfrmDetailsView"));
		GetDriver().switchTo().frame(iframeElement);

		Thread.sleep(2000);

		WebElement ClickonFamily = GetDriver()
				.findElement(By.xpath("//*[@id='ContentPlaceHolder1_detailsViewCntrl_tabcontainserID']/li[4]"));
		ClickonFamily.click();

		Thread.sleep(5000);

		WebElement ClickonCitation = GetDriver().findElement(By.xpath("//a[@id='ui-id-20']"));
		ClickonCitation.click();

		Thread.sleep(3000);

		GoToHomePage();

	}

	@Test
	public void CitationViewer() throws Exception {
		Thread.sleep(500);

		CommonProjectPRP();

		Thread.sleep(500);

		// select current record tab
		WebDriverWait wait4 = new WebDriverWait(GetDriver(), 60);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'selector')]")))
				.click();

		WebElement selectCurrentRecords = GetDriver()
				.findElement(By.xpath("//span[contains(@class,'selector')]//div[2]//span[1]"));
		selectCurrentRecords.click();

		// click on view dropdown
		// WebDriverWait wait22= new WebDriverWait(GetDriver(),60);
		// wait22.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Most
		// Cited')]"))).click();
		// System.out.println("clicked on view dropdown");
		// Thread.sleep(500);

		WebElement ele = GetDriver().findElement(By.xpath("//*[@id='liView']/div[1]"));
		Actions action = new Actions(GetDriver());
		action.moveToElement(ele).build().perform();

		WebDriverWait wait23 = new WebDriverWait(GetDriver(), 60);
		wait23.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='spn1']")));

		WebElement ClickonCitation1 = GetDriver().findElement(By.xpath("//*[@id='spn1']"));
		ClickonCitation1.click();
		System.out.println("selected citation viewer option ");

		Thread.sleep(500);

		GoToHomePage();

	}

	@Test
	public void LastAddedSorting() throws Exception {
		Thread.sleep(1000);

		CommonProjectPRP();

		Thread.sleep(3000);

		// select last added sorting type
		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		WebElement Dropdown = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[6]//div[1]//div[1]")));
		Dropdown.click();

		Thread.sleep(500);

		WebElement selectRelevance = GetDriver()
				.findElement(By.xpath("//*[@id='ulResultAction']/li[6]/div/div/ul/li[9]"));
		selectRelevance.click();

		Thread.sleep(2000);

		WebElement PrintText = GetDriver().findElement(By.xpath("//*[@id='model_4']/div[1]"));
		System.out.println(PrintText.getText());

		Thread.sleep(2000);

		GoToHomePage();
	}

	@Test
	public void RemoveRecord() throws Exception {

		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement commonProj = GetDriver().findElement(By.xpath(
				"//span[@class='patseer_Secondary_Button ng-binding'][contains(text(),'Automated_Project2020-09-23')]"));
		js.executeScript("arguments[0].click();", commonProj);

		Thread.sleep(1000);

		Select_All_Records();

		Thread.sleep(1000);

		WebElement ele = GetDriver().findElement(By.xpath("//span[contains(text(),'Edit')]"));
		Actions action = new Actions(GetDriver());
		action.moveToElement(ele).build().perform();

		Thread.sleep(500);

		WebElement clickon_RemoveRecord = GetDriver()
				.findElement(By.xpath("//span[contains(text(),'Remove Records')]"));
		clickon_RemoveRecord.click();

		Thread.sleep(1000);

		WebElement Clickon_Yes = GetDriver().findElement(By.xpath("//button[@id='okClick']"));
		Clickon_Yes.click();

		Thread.sleep(1000);

		WebElement clickon_Warning = GetDriver().findElement(By.xpath("//button[@id='btnMergeOk']"));
		clickon_Warning.click();

		Thread.sleep(1000);

		GoToHomePage();
	}

	@Test
	public void Category() throws Exception {
		Thread.sleep(1000);

		CommonProjectPRP();

		Thread.sleep(500);

		WebElement ClickonCategory = GetDriver()
				.findElement(By.xpath("//*[@id='ContentPlaceHolder1_SearchSummaryContainer_filterContainer']/div[8]"));
		ClickonCategory.click();

		Thread.sleep(500);

		// WebElement
		// ClickonCreate=GetDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_SearchSummaryContainer_CategoryTagContainer_lnkBtnCreateRootCategory']"));
		// ClickonCreate.click();
		//
		// WebElement
		// EnterCategoryName=GetDriver().findElement(By.xpath("//div[@id='CategoriesContainer']//span[2]"));
		// EnterCategoryName.sendKeys("test1");
		//
		// //select current record tab
		// WebDriverWait wait4= new WebDriverWait(GetDriver(),60);
		// wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'selector')]"))).click();
		//
		// WebElement selectCurrentRecords=
		// GetDriver().findElement(By.xpath("//span[contains(@class,'selector')]//div[2]//span[1]"));
		// selectCurrentRecords.click();
		//
		// WebElement
		// AddRecords=GetDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_SearchSummaryContainer_CategoryTagContainer_lnkBtnAddToSelectedCategory']"));
		// AddRecords.click();

		Thread.sleep(500);

		GoToHomePage();

	}

	@Test
	public void AddToGroup() throws Exception {
		Thread.sleep(1000);

		CommonProjectPRP();

		Thread.sleep(2000);

		Select_All_Records();

		Thread.sleep(1000);

		WebElement ele = GetDriver().findElement(By.xpath("//*[@id='liAdd']/div[1]"));
		Actions action = new Actions(GetDriver());
		action.moveToElement(ele).build().perform();

		WebElement AddToGrp = GetDriver().findElement(By.xpath("//*[@id='divAddtoQuickList']"));
		AddToGrp.click();

		Thread.sleep(1000);

		GetDriver().findElement(By.xpath("//div[@id='divGrpInfo']"));

		WebElement CreateGroup = GetDriver().findElement(By.xpath("//*[@id='divGrpList']/div[1]/span"));
		CreateGroup.click();

		WebElement ClcikonGrpName = GetDriver().findElement(By.xpath("//input[@placeholder='Enter Group Name']"));
		ClcikonGrpName.click();

		Thread.sleep(1000);

		Date d = new Date(System.currentTimeMillis());
		GetDriver().findElement(By.xpath("//input[contains(@placeholder,'Enter Group Name')]")).sendKeys("grp1" + d);

		WebElement ClickonSave = GetDriver().findElement(By.xpath("//span[@id='spanSaveNewGroup']"));
		ClickonSave.click();

		Thread.sleep(2000);

		GoToHomePage();

	}

	@Test
	public void ExportFamilyMember() throws Exception {
		Thread.sleep(1000);

		CommonProjectPRP();

		Thread.sleep(1000);

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='views']")));

		WebElement ClickonSorting = GetDriver().findElement(By.xpath("//*[@id='views']"));
		ClickonSorting.click();

		Thread.sleep(1000);

		WebElement SelectSTDFAM = GetDriver().findElement(By.xpath("//div[contains(text(),'Standard + Family')]"));
		SelectSTDFAM.click();

		Thread.sleep(1000);

		MainFilter();

		SearchWithin();

		Thread.sleep(800);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: ZA9702131B ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(4000);

		WebElement ClickonExport_SFAM = GetDriver().findElement(By.xpath("//div[@id='divExport']"));
		ClickonExport_SFAM.click();

		Thread.sleep(3000);

		// WebElement
		// Click_on_EFAM=GetDriver().findElement(By.xpath("//a[@href='#efam_ID']"));
		// Click_on_EFAM.click();
		//
		// Thread.sleep(1000);
		//
		// WebElement
		// ClickonExport_EFAM=GetDriver().findElement(By.xpath("//*[@id='divExport']"));
		// ClickonExport_EFAM.click();
		//
		// Thread.sleep(1000);

		GoToHomePage();

	}

	@Test
	public void FamilyCoverage() throws Exception {
		Thread.sleep(1000);

		CommonProjectPRP();

		Thread.sleep(1000);

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='views']"))).click();

		Thread.sleep(500);

		WebElement STD = GetDriver().findElement(By.xpath("//*[@id='views']/div[2]/div[3]"));
		STD.click();

		Thread.sleep(500);

		// search within
		SearchWithin();

		Thread.sleep(500);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys(" PNC:CN106458751B ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(3000);

		WebElement CheckCoverage = GetDriver()
				.findElement(By.xpath("//*[@id='divResult']/div/div/div[1]/div[2]/div[3]"));
		System.out.println(CheckCoverage.getText());

		Thread.sleep(1000);

		GoToHomePage();
	}

	@Test
	public void FamilyAliveDead() throws Exception {
		
		Thread.sleep(1000);

		CommonProjectPRP();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Alive = GetDriver().findElement(By.xpath("//button[@id='btnAlive']"));
		js.executeScript("arguments[0].click();", Alive);

		Thread.sleep(1000);
		
		// search within
		SearchWithin();

		Thread.sleep(1000);
		
		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: TWI434976B ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(3000);

		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Process for the enhancement of thermostability";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		// click on project settings
		WebElement ClickonSettings = GetDriver().findElement(
				By.xpath("//*[@id='ContentPlaceHolder1_prjContainer']/div[1]/div/div[1]/div[1]/div/div[2]/span[2]"));
		ClickonSettings.click();
		System.out.println("clicked on settings");

		Thread.sleep(1000);

		WebElement ProjectSettings = GetDriver().findElement(By.xpath("//a[contains(text(),'Project Settings')]"));
		ProjectSettings.click();
		System.out.println("clicked on other project settings");

		// iframe
		WebElement iframeElement = GetDriver().findElement(By.id("frmAddGroupSettings"));
		GetDriver().switchTo().frame(iframeElement);

		//
		// WebElement iframe2=
		// GetDriver().findElement(By.id("frmProjectSettings"));
		// GetDriver().switchTo().frame(iframe2);
		//
		// WebElement SelectMode=
		// GetDriver().findElement(By.xpath("//select[@class='ng-pristine
		// ng-valid ng-touched']"));
		// SelectMode.click();

		Thread.sleep(2000);

		GoToHomePage();

	}

	@Test
	public void ProjectOperationMode() throws Exception {
		CommonProjectPRP();

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

		// iframe
		WebElement iframeElement2 = GetDriver()
				.findElement(By.id("ContentPlaceHolder1_ProjectConfigurationControl1_tabCntrl_ifrm_0"));
		GetDriver().switchTo().frame(iframeElement2);

		Thread.sleep(2000);

		// WebDriverWait wait = new WebDriverWait(GetDriver(),60);
		// wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//select[@class='ng-pristine
		// ng-valid ng-touched']")));

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Dropdown = GetDriver().findElement(By.xpath(
				"//*[@id='ContentPlaceHolder1_projectDetailsViewControl_contactDetailsCntrl_divDetails']/div[1]/div[4]/select"));
		js1.executeScript("arguments[0].click();", Dropdown);

		JavascriptExecutor js2 = (JavascriptExecutor) GetDriver();
		WebElement SFAM = GetDriver().findElement(By.xpath(
				"//*[@id='ContentPlaceHolder1_projectDetailsViewControl_contactDetailsCntrl_divDetails']/div[1]/div[4]/select/option[3]"));
		js2.executeScript("arguments[0].click();", SFAM);

		Thread.sleep(1000);

	}

	@Test
	public void ReviewedRecord() throws Exception {
		CommonProjectPRP();

		Thread.sleep(1000);

		SearchWithin();

		WebElement SearchNumber = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNumber.sendKeys("PNC: TWI434976B");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(3000);

		WebElement ClickonRecord = GetDriver().findElement(By.xpath("//*[@id='lblText_TWI434976B']"));
		ClickonRecord.click();

		String oldTab = GetDriver().getWindowHandle();

		Thread.sleep(4000);

		ArrayList<String> newTab = new ArrayList<String>(GetDriver().getWindowHandles());
		newTab.remove(oldTab);
		// change focus to new tab
		GetDriver().switchTo().window(newTab.get(0));
		System.out.println("tab 0");

		Thread.sleep(1000);
		JavascriptExecutor js2 = (JavascriptExecutor) GetDriver();
		WebElement ClickonBiblo = GetDriver().findElement(By.xpath("//*[@id='ui-id-19']"));
		js2.executeScript("arguments[0].click();", ClickonBiblo);
		System.out.println("clicked on ClickonFullView");

		Thread.sleep(500);

		WebElement VerifyTitle = GetDriver().findElement(By.xpath("//*[@id='divpatno']/span[2]"));
		System.out.println("ttle of record is" + VerifyTitle);

		Thread.sleep(2000);

		GetDriver().close();
		// change focus back to old tab
		GetDriver().switchTo().window(oldTab);
		System.out.println("tab 1");

		Thread.sleep(500);

		String GetClassDetails = GetDriver()
				.findElement(By.xpath("//*[@id='trnumber_TWI434976B']/div[5]/div[1]/span[2]")).getAttribute("class");

		System.out.println("");
		System.out.println(GetClassDetails);

		// GetClassDetails.getAttribute("class");
		Thread.sleep(1000);

		GoToHomePage();
	}

	@Test
	public void AddFlagRating() throws Exception {

		Thread.sleep(1000);

		CommonProjectPRP();

		// WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		// WebElement Dropdown =
		// wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[6]//div[1]")));
		// Dropdown.click();
		//
		// Thread.sleep(500);
		//
		// WebElement selectPubDate =
		// GetDriver().findElement(By.xpath("//button[contains(text(),'Pub.
		// Date')]"));
		// selectPubDate.click();

		Thread.sleep(1000);

		Select_All_Records();

		// WebElement ele1 = GetDriver()
		// .findElement(By.xpath("//span[@class='selector']//i[@class='mdi
		// mdi-chevron-down']"));
		// Actions action1 = new Actions(GetDriver());
		// action1.moveToElement(ele1).build().perform();
		//
		// // select current record tab
		// WebDriverWait wait4 = new WebDriverWait(GetDriver(), 60);
		// wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='chkCurrentPage']"))).click();

		Thread.sleep(1000);

		WebElement ele2 = GetDriver().findElement(By.xpath("//*[@id='liAdd']/div[1]"));
		Actions action2 = new Actions(GetDriver());
		action2.moveToElement(ele2).build().perform();

		Thread.sleep(1000);
		
		WebElement SelectRating = GetDriver()
				.findElement(By.xpath("//*[@id='divProjectControls']/div/div[2]/span[2]/span[5]/i"));
		Actions action3 = new Actions(GetDriver());
		action3.moveToElement(SelectRating).build().perform();

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select2ndRating = GetDriver()
				.findElement(By.xpath("//*[@id='divProjectControls']/div/div[2]/span[2]/span[5]/i"));
		js1.executeScript("arguments[0].click();", Select2ndRating);

		Thread.sleep(1000);
		
		GetDriver().findElement(By.xpath("//*[@id='divProjectControls']/div/div[2]/span[2]/span[4]/i")).click();

		Thread.sleep(1000);

		WebElement SelectRedFlag = GetDriver()
				.findElement(By.xpath("//label[contains(@class,'flag1 marginLeft5 padding3px floatLeft')]"));
		SelectRedFlag.click();

		Thread.sleep(2000);

		// validation using assert
		// WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
		// wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'PROCESS
		// FOR THE ENHANCEMENT OF THERMOSTABILITY[WO2")));
		// WebElement
		// validate=GetDriver().findElement(By.xpath("//label[contains(text(),'PROCESS
		// FOR THE ENHANCEMENT OF THERMOSTABILITY[WO2"));
		// System.out.println("s1 : "+validate.getText());
		//
		// String actualText="PROCESS FOR THE ENHANCEMENT OF
		// THERMOSTABILITY[WO2007122142A2]";
		// Assert.assertEquals(validate.getText(), actualText);
		//
		// Thread.sleep(1000);

		GoToHomePage();

	}

	@Test
	public void ProjectFields() throws Exception {

		Thread.sleep(1000);

		CommonProjectPRP();

		Thread.sleep(2000);

		// select current record tab
		WebDriverWait wait4 = new WebDriverWait(GetDriver(), 60);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id='ulResultAction']/li[1]/div/checkuncheckcontrol/div/span[2]/i"))).click();

		Thread.sleep(500);

		WebElement selectCurrentRecords = GetDriver().findElement(By.xpath("//input[@id='chkCurrentPage_0']"));
		selectCurrentRecords.click();

		Thread.sleep(1500);

		WebElement ele5 = GetDriver().findElement(By.xpath("//*[@id='liAdd']/div[1]"));
		Actions action5 = new Actions(GetDriver());
		action5.moveToElement(ele5).build().perform();

		Thread.sleep(1000);

		WebElement SelectRating = GetDriver()
				.findElement(By.xpath("//div[@id='divProjectControls']//i[@class='mdi mdi-minus-circle']"));
		Actions action6 = new Actions(GetDriver());
		action6.moveToElement(SelectRating).build().perform();

		JavascriptExecutor js4 = (JavascriptExecutor) GetDriver();
		WebElement Select2ndRating = GetDriver()
				.findElement(By.xpath("//div[@id='divProjectControls']//i[@class='mdi mdi-minus-circle']"));
		js4.executeScript("arguments[0].click();", Select2ndRating);

		GetDriver().findElement(By.xpath("//div[@id='divProjectControls']//i[@class='mdi mdi-minus-circle']")).click();

		Thread.sleep(1000);

		WebElement SelectRedFlag = GetDriver().findElement(By.xpath("//*[@id='divallFlag']/label[1]"));
		SelectRedFlag.click();

		Thread.sleep(2000);

		// MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_Flag = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='flag']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_Flag);

		Thread.sleep(500);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_Flag = GetDriver().findElement(By.xpath("//*[@id='Fcheckbox1']"));
		js1.executeScript("arguments[0].click();", Select_Flag);

		Thread.sleep(500);

		JavascriptExecutor js2 = (JavascriptExecutor) GetDriver();
		WebElement Clickon_Rating = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='rate']//child::span[1]"));
		js2.executeScript("arguments[0].click();", Clickon_Rating);

		Thread.sleep(500);

		JavascriptExecutor js3 = (JavascriptExecutor) GetDriver();
		WebElement Select_Rating = GetDriver().findElement(By.xpath("//*[@id='Rcheckbox1']"));
		js3.executeScript("arguments[0].click();", Select_Rating);

		Thread.sleep(500);

		ApplyFilter();

		Thread.sleep(1000);

		// validation using assert
//		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
//		System.out.println("s1 : " + validate.getText());
//
//		String actualText = "REACTIVE DYE MIXTURES, PROCESSES FOR THEIR PREPARATION AND THEIR USE: REACTIVE SULFONATED TRI-PHENOL-DIOXAZINE DYE MIXTURE FOR CELLULOSE FIBERS";
//		Assert.assertEquals(validate.getText(), actualText);
//
//		Thread.sleep(1000);

		GoToHomePage();

	}

	@Test
	public void AddToCategory() throws Exception {
		Thread.sleep(1000);

		CommonProjectPRP();

		Thread.sleep(1000);

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		WebElement Dropdown = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[6]//div[1]")));
		Dropdown.click();

		WebElement selectPubDate = GetDriver().findElement(By.xpath("//button[contains(text(),'Pub. Date')]"));
		selectPubDate.click();

		Thread.sleep(1000);

		WebElement ClickonCategory = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='categories']//child::span[1]"));
		Actions actions = new Actions(GetDriver());
		actions.moveToElement(ClickonCategory).click().build().perform();

		/*
		 * WebElement ClickonCreateCat=GetDriver().findElement(By.xpath(
		 * "//*[@id='lnkBtnCreateRootCategory']")); ClickonCreateCat.click();
		 * 
		 * System.out.println("clicked on create category");
		 * 
		 * // WebElement Category1=GetDriver().findElement(By.xpath(
		 * "//ul[@class='ui-fancytree fancytree-container fancytree-ext-edit fancytree-treefocus']"
		 * ));
		 * 
		 * WebElement Category1=GetDriver().findElement(By.xpath(
		 * "//*[@id='lnkBtnCreateRootCategory']"));
		 * Category1.sendKeys("category1"); System.out.println(
		 * "created category");
		 * 
		 * Thread.sleep(2000);
		 */

		WebElement ImportCategory = GetDriver().findElement(By.xpath("//div[@id='lnkCategoryImport']//i[@id='i2']"));
		ImportCategory.click();

		// for importing external file
		GetDriver().switchTo().activeElement()
				.sendKeys("Z:/Testing/Testing Documents/Patseer/RFT documents/Import categories/catetories2.txt");

		Thread.sleep(100);

		WebElement Import = GetDriver().findElement(By.xpath("//*[@id='lnkImportFile']"));
		Import.click();

		Thread.sleep(1000);

		// WebElement VerifyCategory=GetDriver().findElement(By.xpath(""));
		// System.out.println(VerifyCategory.getText());

		// GoToHomePage();
		//
		// GetDriver().quit();

	}

	@Test
	public void KWIC() throws Exception {
		Thread.sleep(1000);

		CommonProjectPRP();

		Thread.sleep(1000);

		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNumber = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		// SearchNumber.sendKeys("PNC:US2019059038A1");
		SearchNumber.sendKeys("  tac:triphenylene ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(3000);

		// click on KWIC
		WebElement clickonKWIC = GetDriver().findElement(By.xpath("//span[@id='spanId_ZA9606984B']"));
		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		js.executeScript("arguments[0].click();", clickonKWIC);

		Thread.sleep(2000);

		WebElement ClickonSFAM = GetDriver().findElement(By.xpath("//h4[@id='ui-id-12']"));
		ClickonSFAM.click();

		Thread.sleep(1000);

		Thread.sleep(1000);

		WebElement clickonText = GetDriver().findElement(By.xpath("//span[@class='handPointer']"));
		clickonText.click();

		/// considering that there is only one tab opened in that point.
		String oldTab = GetDriver().getWindowHandle();

		Thread.sleep(2000);

		ArrayList<String> newTab = new ArrayList<String>(GetDriver().getWindowHandles());
		newTab.remove(oldTab);
		// change focus to new tab
		GetDriver().switchTo().window(newTab.get(0));
		System.out.println("tab 0");

		Thread.sleep(1000);
		JavascriptExecutor js2 = (JavascriptExecutor) GetDriver();
		WebElement ClickonFullView = GetDriver().findElement(By.xpath("//a[@id='ui-id-26']"));
		js2.executeScript("arguments[0].click();", ClickonFullView);
		System.out.println("clicked on Click on Full View");

		Thread.sleep(5000);

		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//annot-title[contains(text(),'Asymmetric triphenylene dioxazine compounds.')]")));
		WebElement validate = GetDriver().findElement(
				By.xpath("//annot-title[contains(text(),'Asymmetric triphenylene dioxazine compounds.')]"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Asymmetric triphenylene dioxazine compounds.";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(3000);

		GetDriver().close();
		// change focus back to old tab
		GetDriver().switchTo().window(oldTab);
		System.out.println("tab 1");

		Thread.sleep(500);

		Thread.sleep(1000);

		GoToHomePage();

	}
}
