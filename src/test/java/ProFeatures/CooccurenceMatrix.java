package ProFeatures;

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

public class CooccurenceMatrix extends BaseTest {

	@Test
	public void CommonProjectCM() throws InterruptedException {
		
		GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement commonProj = GetDriver().findElement(By
				.xpath("//span[@class='patseer_Secondary_Button ng-binding'][contains(text(),'Automation_Project')]"));
		js.executeScript("arguments[0].click();", commonProj);

		Thread.sleep(2000);

		WebElement ele = GetDriver().findElement(By.xpath("//*[@id='headerCntrl_patseerLogoCntrl_liProjectName']"));
		Actions action = new Actions(GetDriver());
		action.moveToElement(ele).build().perform();

		WebElement SelectCooccurence = GetDriver()
				.findElement(By.xpath("//*[@id='headerCntrl_patseerLogoCntrl_liCooccurnc']/a"));
		SelectCooccurence.click();
	}

	@Test
	public void AssigneeMatrix() throws InterruptedException {

		CommonProjectCM();

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]")));

		WebElement Dropdown1 = GetDriver().findElement(By.xpath("//div[@class='rowDdl']"));
		Dropdown1.click();

		Thread.sleep(200);

		WebElement Dropdown2 = GetDriver().findElement(By.xpath("//div[@class='colDdl']"));
		Dropdown2.click();

		WebElement SelectINV = GetDriver().findElement(By.xpath("//div[@class='colDdl']//option[4]"));
		SelectINV.click();

		WebElement GenerateMatrix = GetDriver().findElement(By.xpath("//a[contains(text(),'Generate Matrix')]"));
		GenerateMatrix.click();

		Thread.sleep(1000);

		// iframe
		WebElement iframeElement = GetDriver().findElement(By.id("matrixframe0"));
		GetDriver().switchTo().frame(iframeElement);

		Thread.sleep(1000);

		// validation using assert
		WebElement validate = GetDriver().findElement(By.xpath("//th[contains(text(),'BAYER AG')]"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "BAYER AG";
		Assert.assertEquals(validate.getText(), actualText);
		Thread.sleep(500);

		GoToHomePage();

		// for handling browser closing popup
		GetDriver().switchTo().alert().accept();

		Thread.sleep(500);

	}

	@Test
	public void InventorMatrix() throws InterruptedException {
		CommonProjectCM();

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]")));

		WebElement Dropdown1 = GetDriver().findElement(By.xpath("//div[@class='rowDdl']"));
		Dropdown1.click();

		WebElement SelectINV = GetDriver().findElement(By.xpath("//div[@class='rowDdl']//option[4]"));
		SelectINV.click();

		Thread.sleep(200);

		WebElement Dropdown2 = GetDriver().findElement(By.xpath("//div[@class='colDdl']"));
		Dropdown2.click();

		WebElement PublicationCountry = GetDriver()
				.findElement(By.xpath("//div[@class='colDdl']//option[contains(text(),'Publication Country')]"));
		PublicationCountry.click();

		WebElement GenerateMatrix = GetDriver().findElement(By.xpath("//a[contains(text(),'Generate Matrix')]"));
		GenerateMatrix.click();

		Thread.sleep(1000);

		// iframe
		WebElement iframeElement = GetDriver().findElement(By.id("matrixframe0"));
		GetDriver().switchTo().frame(iframeElement);

		Thread.sleep(1000);

		// validation using assert
		WebElement validate = GetDriver().findElement(By.xpath("//th[contains(text(),'METZGER GEORGES')]"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "METZGER GEORGES";
		Assert.assertEquals(validate.getText(), actualText);
		Thread.sleep(500);

		GoToHomePage();

		// for handling browser closing popup
		GetDriver().switchTo().alert().accept();

		Thread.sleep(500);
	}

	@Test
	public void AssigneeCountryMatrix() throws InterruptedException {
		CommonProjectCM();

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]")));

		WebElement Dropdown1 = GetDriver().findElement(By.xpath("//div[@class='rowDdl']"));
		Dropdown1.click();

		WebElement AssigneeCountry = GetDriver()
				.findElement(By.xpath("//div[@class='rowDdl']//option[contains(text(),'Assignee Country')]"));
		AssigneeCountry.click();

		Thread.sleep(200);

		WebElement Dropdown2 = GetDriver().findElement(By.xpath("//div[@class='colDdl']"));
		Dropdown2.click();

		WebElement PublicationCountry = GetDriver()
				.findElement(By.xpath("//div[@class='colDdl']//option[contains(text(),'IPC Full')]"));
		PublicationCountry.click();

		WebElement GenerateMatrix = GetDriver().findElement(By.xpath("//a[contains(text(),'Generate Matrix')]"));
		GenerateMatrix.click();

		Thread.sleep(1000);

		// iframe
		WebElement iframeElement = GetDriver().findElement(By.id("matrixframe0"));
		GetDriver().switchTo().frame(iframeElement);

		Thread.sleep(1000);

		// validation using assert
		WebElement validate = GetDriver().findElement(By.xpath("//th[contains(text(),'DE')]"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "DE";
		Assert.assertEquals(validate.getText(), actualText);
		Thread.sleep(500);

		GoToHomePage();

		// for handling browser closing popup
		GetDriver().switchTo().alert().accept();

		Thread.sleep(500);
	}

	@Test
	public void IPCMainMatrix() throws InterruptedException {
		CommonProjectCM();

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]")));

		WebElement Dropdown1 = GetDriver().findElement(By.xpath("//div[@class='rowDdl']"));
		Dropdown1.click();

		WebElement IPCMain = GetDriver()
				.findElement(By.xpath("//div[@class='rowDdl']//option[contains(text(),'IPC Main')]"));
		IPCMain.click();

		Thread.sleep(200);

		WebElement Dropdown2 = GetDriver().findElement(By.xpath("//div[@class='colDdl']"));
		Dropdown2.click();

		WebElement RecordType = GetDriver()
				.findElement(By.xpath("//div[@class='colDdl']//option[contains(text(),'Record Type')]"));
		RecordType.click();

		WebElement GenerateMatrix = GetDriver().findElement(By.xpath("//a[contains(text(),'Generate Matrix')]"));
		GenerateMatrix.click();

		// iframe
		WebElement iframeElement = GetDriver().findElement(By.id("matrixframe0"));
		GetDriver().switchTo().frame(iframeElement);

		Thread.sleep(1000);

		// validation using assert
		WebElement validate = GetDriver().findElement(By.xpath("//th[contains(text(),'C09B')]"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "C09B";
		Assert.assertEquals(validate.getText(), actualText);
		Thread.sleep(500);

		GoToHomePage();

		// for handling browser closing popup
		GetDriver().switchTo().alert().accept();

		Thread.sleep(500);
	}

	@Test
	public void CPCFullMatrix() throws InterruptedException {
		CommonProjectCM();

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]")));

		WebElement Dropdown1 = GetDriver().findElement(By.xpath("//div[@class='rowDdl']"));
		Dropdown1.click();

		WebElement CPCFull = GetDriver()
				.findElement(By.xpath("//div[@class='rowDdl']//option[contains(text(),'CPC Full')]"));
		CPCFull.click();

		Thread.sleep(200);

		WebElement Dropdown2 = GetDriver().findElement(By.xpath("//div[@class='colDdl']"));
		Dropdown2.click();

		WebElement RegisterLegalStatus = GetDriver()
				.findElement(By.xpath("//div[@class='colDdl']//option[contains(text(),'Register Legal Status')]"));
		RegisterLegalStatus.click();

		WebElement GenerateMatrix = GetDriver().findElement(By.xpath("//a[contains(text(),'Generate Matrix')]"));
		GenerateMatrix.click();

		// iframe
		WebElement iframeElement = GetDriver().findElement(By.id("matrixframe0"));
		GetDriver().switchTo().frame(iframeElement);

		Thread.sleep(1000);

		// validation using assert
		WebElement validate = GetDriver().findElement(By.xpath("//th[contains(text(),'D06P1/908')]"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "D06P1/908";
		Assert.assertEquals(validate.getText(), actualText);
		Thread.sleep(500);

		GoToHomePage();

		// for handling browser closing popup
		GetDriver().switchTo().alert().accept();

		Thread.sleep(500);
	}

	@Test
	public void RecordTypeMatrix() throws InterruptedException {
		CommonProjectCM();

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]")));

		WebElement Dropdown1 = GetDriver().findElement(By.xpath("//div[@class='rowDdl']"));
		Dropdown1.click();

		WebElement RecordType = GetDriver()
				.findElement(By.xpath("//div[@class='rowDdl']//option[contains(text(),'Record Type')]"));
		RecordType.click();

		Thread.sleep(200);

		WebElement Dropdown2 = GetDriver().findElement(By.xpath("//div[@class='colDdl']"));
		Dropdown2.click();

		WebElement PublicationCountry = GetDriver()
				.findElement(By.xpath("//div[@class='colDdl']//option[contains(text(),'Publication Country')]"));
		PublicationCountry.click();

		WebElement GenerateMatrix = GetDriver().findElement(By.xpath("//a[contains(text(),'Generate Matrix')]"));
		GenerateMatrix.click();

		// iframe
		WebElement iframeElement = GetDriver().findElement(By.id("matrixframe0"));
		GetDriver().switchTo().frame(iframeElement);

		Thread.sleep(1000);

		// validation using assert
		WebElement validate = GetDriver().findElement(By.xpath("//th[contains(text(),'APPLICATION')]"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "APPLICATION";
		Assert.assertEquals(validate.getText(), actualText);
		Thread.sleep(500);

		GoToHomePage();

		// for handling browser closing popup
		GetDriver().switchTo().alert().accept();

		Thread.sleep(500);
	}

	@Test
	public void LegalStatusMatrix() throws InterruptedException {
		CommonProjectCM();

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]")));

		WebElement Dropdown1 = GetDriver().findElement(By.xpath("//div[@class='rowDdl']"));
		Dropdown1.click();

		WebElement LegalStatusCurrent = GetDriver()
				.findElement(By.xpath("//select[@class='width100']//option[contains(text(),'Legal Status Current')]"));
		LegalStatusCurrent.click();

		Thread.sleep(200);

		WebElement Dropdown2 = GetDriver().findElement(By.xpath("//div[@class='colDdl']"));
		Dropdown2.click();

		WebElement PublicationCountry = GetDriver()
				.findElement(By.xpath("//div[@class='colDdl']//option[contains(text(),'Publication Country')]"));
		PublicationCountry.click();

		WebElement GenerateMatrix = GetDriver().findElement(By.xpath("//a[contains(text(),'Generate Matrix')]"));
		GenerateMatrix.click();

		// iframe
		WebElement iframeElement = GetDriver().findElement(By.id("matrixframe0"));
		GetDriver().switchTo().frame(iframeElement);

		Thread.sleep(1000);

		// validation using assert
		WebElement validate = GetDriver().findElement(By.xpath("//th[contains(text(),'INACTIVE - EXPIRED')]"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "INACTIVE - EXPIRED";
		Assert.assertEquals(validate.getText(), actualText);
		Thread.sleep(500);

		GoToHomePage();

		// for handling browser closing popup
		GetDriver().switchTo().alert().accept();

		Thread.sleep(500);
	}

	@Test
	public void ApplicationYearMatrix() throws InterruptedException {
		CommonProjectCM();

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]")));

		WebElement Dropdown1 = GetDriver().findElement(By.xpath("//div[@class='rowDdl']"));
		Dropdown1.click();

		WebElement ApplicationYear = GetDriver()
				.findElement(By.xpath("//div[@class='rowDdl']//option[contains(text(),'Application Year')]"));
		ApplicationYear.click();

		Thread.sleep(200);

		WebElement Dropdown2 = GetDriver().findElement(By.xpath("//div[@class='colDdl']"));
		Dropdown2.click();

		WebElement TechSubDomain = GetDriver()
				.findElement(By.xpath("//div[@class='colDdl']//option[contains(text(),'Tech Sub Domain')]"));
		TechSubDomain.click();

		WebElement GenerateMatrix = GetDriver().findElement(By.xpath("//a[contains(text(),'Generate Matrix')]"));
		GenerateMatrix.click();

		// iframe
		WebElement iframeElement = GetDriver().findElement(By.id("matrixframe0"));
		GetDriver().switchTo().frame(iframeElement);

		Thread.sleep(1000);

		// validation using assert
		// WebElement
		// validate=GetDriver().findElement(By.xpath("//th[contains(text(),'1970')]"));
		// System.out.println("s1 : "+validate.getText());
		//
		// String actualText="1970";
		// Assert.assertEquals(validate.getText(), actualText);
		// Thread.sleep(500);

		GoToHomePage();

		// for handling browser closing popup
		GetDriver().switchTo().alert().accept();

		Thread.sleep(500);
	}

	@Test
	public void AttorneyMatrix() throws InterruptedException {
		CommonProjectCM();

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]")));

		WebElement Dropdown1 = GetDriver().findElement(By.xpath("//div[@class='rowDdl']"));
		Dropdown1.click();

		WebElement Attorney = GetDriver()
				.findElement(By.xpath("//div[@class='rowDdl']//option[contains(text(),'Attorney')]"));
		Attorney.click();

		Thread.sleep(200);

		WebElement Dropdown2 = GetDriver().findElement(By.xpath("//div[@class='colDdl']"));
		Dropdown2.click();

		WebElement Categories = GetDriver()
				.findElement(By.xpath("//div[@class='colDdl']//option[contains(text(),'Categories')]"));
		Categories.click();

		WebElement GenerateMatrix = GetDriver().findElement(By.xpath("//a[contains(text(),'Generate Matrix')]"));
		GenerateMatrix.click();

		// iframe
		WebElement iframeElement = GetDriver().findElement(By.id("matrixframe0"));
		GetDriver().switchTo().frame(iframeElement);

		Thread.sleep(1000);

		// validation using assert
		// WebElement
		// validate=GetDriver().findElement(By.xpath("//th[contains(text(),'CABINET
		// BEAU DE LOMENIE')]"));
		// System.out.println("s1 : "+validate.getText());
		//
		// String actualText="CABINET BEAU DE LOMENIE";
		// Assert.assertEquals(validate.getText(), actualText);
		// Thread.sleep(500);

		GoToHomePage();

		// for handling browser closing popup
		GetDriver().switchTo().alert().accept();

		Thread.sleep(500);
	}

	@Test
	public void TechDomainMatrix() throws InterruptedException {
		CommonProjectCM();

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]")));

		WebElement Dropdown1 = GetDriver().findElement(By.xpath("//div[@class='rowDdl']"));
		Dropdown1.click();

		WebElement TechDomain = GetDriver()
				.findElement(By.xpath("//div[@class='rowDdl']//option[contains(text(),'Tech Domain')]"));
		TechDomain.click();

		Thread.sleep(200);

		WebElement Dropdown2 = GetDriver().findElement(By.xpath("//div[@class='colDdl']"));
		Dropdown2.click();

		WebElement Keywords = GetDriver()
				.findElement(By.xpath("//div[@class='colDdl']//option[contains(text(),'Keywords')]"));
		Keywords.click();

		WebElement GenerateMatrix = GetDriver().findElement(By.xpath("//a[contains(text(),'Generate Matrix')]"));
		GenerateMatrix.click();

		// iframe
		WebElement iframeElement = GetDriver().findElement(By.id("matrixframe0"));
		GetDriver().switchTo().frame(iframeElement);

		Thread.sleep(1000);

		// validation using assert
		WebElement validate = GetDriver().findElement(By.xpath("//th[contains(text(),'MECHANICAL ENGINEERING')]"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "MECHANICAL ENGINEERING";
		Assert.assertEquals(validate.getText(), actualText);
		Thread.sleep(500);

		GoToHomePage();

		// for handling browser closing popup
		GetDriver().switchTo().alert().accept();

		Thread.sleep(500);
	}

	@Test
	public void FlagsMatrix() throws InterruptedException {
		CommonProjectCM();

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]")));

		WebElement Dropdown1 = GetDriver().findElement(By.xpath("//div[@class='rowDdl']"));
		Dropdown1.click();

		WebElement Flags = GetDriver()
				.findElement(By.xpath("//div[@class='rowDdl']//option[contains(text(),'Flags')]"));
		Flags.click();

		Thread.sleep(200);

		WebElement Dropdown2 = GetDriver().findElement(By.xpath("//div[@class='colDdl']"));
		Dropdown2.click();

		WebElement InventorCountry = GetDriver()
				.findElement(By.xpath("//div[@class='colDdl']//option[contains(text(),'Inventor Country')]"));
		InventorCountry.click();

		WebElement GenerateMatrix = GetDriver().findElement(By.xpath("//a[contains(text(),'Generate Matrix')]"));
		GenerateMatrix.click();

		// iframe
		WebElement iframeElement = GetDriver().findElement(By.id("matrixframe0"));
		GetDriver().switchTo().frame(iframeElement);

		Thread.sleep(1000);

		// validation using assert
		WebElement validate = GetDriver().findElement(By.xpath("//th[contains(text(),'Orange')]"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Orange";
		Assert.assertEquals(validate.getText(), actualText);
		Thread.sleep(500);

		GoToHomePage();

		// for handling browser closing popup
		GetDriver().switchTo().alert().accept();

		Thread.sleep(500);
	}

	@Test
	public void CustomFieldMatrix() throws InterruptedException {
		CommonProjectCM();

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]")));

		WebElement Dropdown1 = GetDriver().findElement(By.xpath("//div[@class='rowDdl']"));
		Dropdown1.click();

		WebElement CustomFields = GetDriver()
				.findElement(By.xpath("//div[@class='rowDdl']//option[contains(text(),'Dropdown')]"));
		CustomFields.click();

		Thread.sleep(200);

		WebElement Dropdown2 = GetDriver().findElement(By.xpath("//div[@class='colDdl']"));
		Dropdown2.click();

		WebElement Industry = GetDriver()
				.findElement(By.xpath("//div[@class='colDdl']//option[contains(text(),'Industry')]"));
		Industry.click();

		WebElement GenerateMatrix = GetDriver().findElement(By.xpath("//a[contains(text(),'Generate Matrix')]"));
		GenerateMatrix.click();

		// iframe
		WebElement iframeElement = GetDriver().findElement(By.id("matrixframe0"));
		GetDriver().switchTo().frame(iframeElement);

		Thread.sleep(1000);

		// validation using assert
		// WebElement
		// validate=GetDriver().findElement(By.xpath("//th[contains(text(),'2')]"));
		// System.out.println("s1 : "+validate.getText());
		//
		// String actualText="2";
		// Assert.assertEquals(validate.getText(), actualText);
		// Thread.sleep(500);

		GoToHomePage();

		// for handling browser closing popup
		GetDriver().switchTo().alert().accept();

		Thread.sleep(500);
	}

	@Test
	public void ClusterMatrix() throws InterruptedException {
		Thread.sleep(1000);

		CommonProjectCM();

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]")));

		WebElement Dropdown1 = GetDriver().findElement(By.xpath("//div[@class='rowDdl']"));
		Dropdown1.click();

		WebElement Cluster = GetDriver()
				.findElement(By.xpath("//div[@class='rowDdl']//option[contains(text(),'Themes')]"));
		Cluster.click();

		Thread.sleep(200);

		WebElement Dropdown2 = GetDriver().findElement(By.xpath("//div[@class='colDdl']"));
		Dropdown2.click();

		WebElement CurrentOwner = GetDriver()
				.findElement(By.xpath("//div[@class='colDdl']//option[contains(text(),'Current Owner')]"));
		CurrentOwner.click();

		WebElement GenerateMatrix = GetDriver().findElement(By.xpath("//a[contains(text(),'Generate Matrix')]"));
		GenerateMatrix.click();

		Thread.sleep(1000);

		WebElement themes_CurrentOwner = GetDriver().findElement(By.xpath("//a[contains(text(),'Themes - Current Owner')]"));
		themes_CurrentOwner.click();

		Thread.sleep(2000);

		// iframe
		WebElement iframeElement = GetDriver().findElement(By.xpath("//div[@id='panel_2']//iframe[@class='iframeClass dashboardFrame ng-scope']"));
		GetDriver().switchTo().frame(iframeElement);

		Thread.sleep(4000);

		// validation using assert
		WebElement validate = GetDriver().findElement(By.xpath("//th[contains(text(),'ARYL GROUP;OPTIONALLY SUBSTITUTED ALKYL;HETEROCYCL')]"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "ARYL GROUP;OPTIONALLY SUBSTITUTED ALKYL;HETEROCYCLIC RING";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();

		GetDriver().switchTo().alert().accept();

		Thread.sleep(500);
		
	}

	@Test
	public void GetCountSearch() throws InterruptedException {
		// getcount
		WebDriverWait wait3 = new WebDriverWait(GetDriver(), 60);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@ng-click='getCount()']")));
		WebElement getCountBtn = GetDriver().findElement(By.xpath("//a[@ng-click='getCount()']"));
		System.out.println(getCountBtn.getText());

		((JavascriptExecutor) GetDriver()).executeScript("window.scrollTo(0," + getCountBtn.getLocation().y + ")");
		getCountBtn.click();
		System.out.println("clicked on get count");

		GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		// search
		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement search = GetDriver().findElement(By.xpath("//a[@id='searchId']"));
		js.executeScript("arguments[0].click();", search);
		System.out.println("clicked on search");

		// on result page
		GetDriver().manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);

		// iframe
		WebElement iframeElement = GetDriver().findElement(By.id("resultFrameID"));
		GetDriver().switchTo().frame(iframeElement);
		Thread.sleep(500);
	}

	@Test
	public void SearchSideMatrix() throws InterruptedException {
		GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();

		WebElement cmd = GetDriver().findElement(By.xpath("//a[@class='m_1_s_4']"));
		js.executeScript("arguments[0].click();", cmd);

		// clear
		WebElement clearr = GetDriver().findElement(By.partialLinkText("Clear"));
		clearr.click();
		System.out.println("clicked on clear option");

		// for spell check
		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[@class='floatLeft leftSpacer col-xs-4 col-sm-4 col-md-4 col-lg-4 switchCaseCont']")));
		WebElement SpellCheck = GetDriver().findElement(By.xpath("//label[@class='onoffswitch-label']"));
		SpellCheck.click();

		Thread.sleep(500);
		// JavascriptExecutor js = (JavascriptExecutor)GetDriver();//WebDriver
		// instance type cast into JavascriptExecutor interface
		WebElement ALLCT = GetDriver().findElement(By.id("txtSpellCheck"));
		js.executeScript("arguments[0].click();", ALLCT);

		// used for blocking hidden element
		GetDriver().findElement(By.xpath("//textarea[@id='txtSpellCheck']")).clear();

		ALLCT.sendKeys("                TAC:soft computing             ");
		// System.out.println("entered search term in cmd ");

		Thread.sleep(500);

		GetCountSearch();

		WebElement ClickonMatrix = GetDriver().findElement(By.cssSelector("#ui-id-2"));
		js.executeScript("arguments[0].click();", ClickonMatrix);
		System.out.println("clicked on matrix");

		// on result page
		GetDriver().manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		// iframe
		WebElement iframeElement = GetDriver().findElement(By.id("searchMatrixFrame"));
		GetDriver().switchTo().frame(iframeElement);
		Thread.sleep(500);

		WebElement Dropdown1 = GetDriver().findElement(By.xpath("//div[@class='rowDdl']//select"));
		Dropdown1.click();

		WebElement ASN = GetDriver().findElement(By.xpath("//div[contains(@class,'rowDdl')]//option[2]"));
		ASN.click();

		Thread.sleep(200);

		WebElement Dropdown2 = GetDriver().findElement(By.xpath("//div[@class='colDdl']//select"));
		Dropdown2.click();

		WebElement CPCFull = GetDriver()
				.findElement(By.xpath("//div[contains(@class,'colDdl')]//option[contains(text(),'CPC Full')]"));
		CPCFull.click();

		WebElement GenerateMatrix = GetDriver().findElement(By.xpath("//a[contains(text(),'Generate Matrix')]"));
		GenerateMatrix.click();

		GoToHomePage();
	}

	@Test
	public void ToggleAxis() throws InterruptedException {
		Thread.sleep(1000);

		CommonProjectCM();

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]")));

		WebElement Dropdown1 = GetDriver().findElement(By.xpath("//div[@class='rowDdl']"));
		Dropdown1.click();

		Thread.sleep(200);

		WebElement Dropdown2 = GetDriver().findElement(By.xpath("//div[@class='colDdl']"));
		Dropdown2.click();

		WebElement SelectINV = GetDriver().findElement(By.xpath("//div[@class='colDdl']//option[4]"));
		SelectINV.click();

		WebElement GenerateMatrix = GetDriver().findElement(By.xpath("//a[contains(text(),'Generate Matrix')]"));
		GenerateMatrix.click();

		Thread.sleep(1000);

		WebElement Assignee_Inventor = GetDriver().findElement(By.xpath("//*[@id='tabControl']/div/div/ul/li[3]/a"));
		Assignee_Inventor.click();

		Thread.sleep(2000);

		// iframe
		WebElement iframeElement = GetDriver().findElement(By.xpath("//*[@id='panel_2']/iframe"));
		GetDriver().switchTo().frame(iframeElement);

		Thread.sleep(4000);

		// validation using assert
		WebElement validate = GetDriver().findElement(By.xpath("//th[contains(text(),'BAYER AG')]"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "BAYER AG";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		// clicken on toggle
		WebElement toggle = GetDriver().findElement(By.xpath("//input[@id='toggle']"));
		toggle.click();

		Thread.sleep(2000);

		WebElement VerifyRow = GetDriver().findElement(By.xpath("//th[@class='pvtAxisLabel']"));
		System.out.println("verified row is" + VerifyRow);

		// WebElement
		// DwnldPNG=GetDriver().findElement(By.xpath("//*[@id='output']/div[1]/div[2]/a"));
		// DwnldPNG.click();

		Thread.sleep(1000);

		GoToHomePage();

		// for handling browser closing popup
		GetDriver().switchTo().alert().accept();

		Thread.sleep(500);

		// GetDriver().close();

	}
	
	@Test
	public void CategoryMatrix() throws InterruptedException {
		Thread.sleep(1000);

		CommonProjectCM();

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]")));

		WebElement Dropdown1 = GetDriver().findElement(By.xpath("//div[@class='rowDdl']"));
		Dropdown1.click();

		WebElement Categories = GetDriver()
				.findElement(By.xpath("//div[@class='rowDdl']//option[contains(text(),'Categories')]"));
		Categories.click();

		Thread.sleep(200);

		WebElement Dropdown2 = GetDriver().findElement(By.xpath("//div[@class='colDdl']"));
		Dropdown2.click();

		WebElement CurrentOwner = GetDriver()
				.findElement(By.xpath("//div[@class='colDdl']//option[contains(text(),'Current Owner')]"));
		CurrentOwner.click();

		WebElement GenerateMatrix = GetDriver().findElement(By.xpath("//a[contains(text(),'Generate Matrix')]"));
		GenerateMatrix.click();

		Thread.sleep(1000);

		WebElement topLevelCategories_CurrentOwner = GetDriver().findElement(By.xpath("//a[contains(text(),'Top level categories - Current Owner')]"));
		topLevelCategories_CurrentOwner.click();

		Thread.sleep(2000);

		// iframe
		WebElement iframeElement = GetDriver().findElement(By.xpath("//div[@id='panel_2']//iframe[@class='iframeClass dashboardFrame ng-scope']"));
		GetDriver().switchTo().frame(iframeElement);

		Thread.sleep(4000);

		// validation using assert
		WebElement validate = GetDriver().findElement(By.xpath("//th[contains(text(),'thermal')]"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "thermal";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();

		GetDriver().switchTo().alert().accept();

		Thread.sleep(500);
		
	}
}
