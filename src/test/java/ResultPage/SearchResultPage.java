package ResultPage;

import java.io.File;
import java.sql.Date;
import java.sql.Ref;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.FileChooserUI;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Login.BaseTest;

public class SearchResultPage extends BaseTest

{
	// @Test
	// public void SearchFromHomePage() throws Exception
	// {
	// GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	//
	// WebDriverWait wait1=new WebDriverWait(GetDriver(),60);
	// wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='divDisplay']//div//div[1]//span[4]//span[4]")));
	//
	// WebElement Search=
	// GetDriver().findElement(By.xpath("//div[@id='divDisplay']//div//div[1]//span[4]//span[4]"));
	// Search.click();
	//
	// GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	// }

	@Test
	public void Searchwithin() throws Exception {
		Thread.sleep(1000);

		CommonSearchTerm();

		Thread.sleep(1000);

		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNumber = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		// SearchNumber.sendKeys("PNC:US2019059038A1");
		SearchNumber.sendKeys("  PNC: CN111297753A  ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(1000);

		// validation using assert
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Anti-aging and weight-losing tightening essence";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();

	}

	@Test
	public void CommonSearchTerm() throws Exception {
		Thread.sleep(1000);

		QuickSearch();

		Thread.sleep(500);

		// clear
		WebElement clear1 = GetDriver().findElement(
				By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		clear1.click();
		System.out.println("clicked on clear option");

		Thread.sleep(500);

		WebElement ClickonTAC = GetDriver().findElement(By.xpath("//div[@id='main_0']"));
		ClickonTAC.click();

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 30);
		GetDriver().findElement(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")).clear();

		wait1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")))
				.sendKeys("TAC");

		wait1.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("//div[@id='main_0']//span[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Title, Abstract, Claims (TAC)')]")))
				.click();

		WebElement EnterText = GetDriver().findElement(By.xpath("//textarea[@id='txtPatApp_0']"));
		EnterText.sendKeys("fiber cell");

		GetCountSearch_QS();

		// on result page
		GetDriver().manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);

		// change URL
		GetDriver().getCurrentUrl();

		// GetDriver().get("https://192.168.1.246/SearchWF#/command/Result");
	}

	@Test
	public void AliveDead() throws Exception {
		Thread.sleep(1000);

		CommonSearchTerm();

		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Alive = GetDriver().findElement(By.xpath("//button[@id='btnAlive']"));
		js.executeScript("arguments[0].click();", Alive);

		Thread.sleep(1000);

		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNumber = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		// SearchNumber.sendKeys("PNC:US2019059038A1");
		SearchNumber.sendKeys("  PNC: CN111297753A  ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(1000);

		// validation using assert
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Anti-aging and weight-losing tightening essence";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();

	}

	@Test
	public void SearchinFilter() throws Exception {
		Thread.sleep(1000);

		CommonSearchTerm();

		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_RecordType = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='PTYP']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_RecordType);

		Thread.sleep(500);

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 30);
		GetDriver().findElement(By.xpath("//*[@id='filterContainer']/div[4]/filteritems/div[2]/div[4]/input")).click();

		Thread.sleep(200);
		WebElement SearchinPTYP = GetDriver()
				.findElement(By.xpath("//div[@class='fl_paddTop']//input[@placeholder='Search']"));
		SearchinPTYP.sendKeys("REISSUED PATENT");

		Thread.sleep(200);

		WebElement ClickonSearch = GetDriver()
				.findElement(By.xpath("//*[@id='filterContainer']/div[4]/filteritems/div[2]/div[4]/span[1]"));
		ClickonSearch.click();

		Thread.sleep(1000);

		WebElement Selectoption = GetDriver()
				.findElement(By.xpath("//*[@id='filter_PTYP_3']/filtercheckbox/div[1]/div/div/div/div[1]/input"));
		Selectoption.click();

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(2000);

		// validtion
		// WebElement
		// validate1=GetDriver().findElement(By.xpath("//*[@id='lblTtl']"));
		// System.out.println("s1 : "+validate1.getText());
		//
		// String actualText="MIETHOD FOR TREATING CELLULOSE AND PRODUCT
		// THEREOF";
		// Assert.assertEquals(validate1.getText(), actualText);
		//
		// Thread.sleep(1000);

		GoToHomePage();

	}

	@Test
	public void LoadQueryAnalyzer() throws Exception {

		Thread.sleep(1000);

		SelectCommandSearch();

		Thread.sleep(1000);
		// for spell check
		SpellCheck();

		Thread.sleep(500);
		JavascriptExecutor js = (JavascriptExecutor) GetDriver();// WebDriver
																	// instance
																	// type cast
																	// into
																	// JavascriptExecutor
																	// interface
		WebElement EnterText = GetDriver().findElement(By.id("txtSpellCheck"));
		js.executeScript("arguments[0].click();", EnterText);

		GetDriver().findElement(By.xpath("//textarea[@id='txtSpellCheck']")).clear();

		EnterText.sendKeys(
				"TACD:( (broadcast* OR ACK OR acknowledgement OR packet ORclock OR reference OR relative OR mutual OR offset OR bias ORdrift* OR adjust* OR compensat* OR calibrat*) )");
		System.out.println("entered search term of BCTOF in cmd");

		Thread.sleep(2000);

		GetCountSearch_CMD();

		// on result page
		Thread.sleep(5000);

		WebElement ClickonQueryAnalyzer = GetDriver().findElement(By.id("editSeparator"));
		ClickonQueryAnalyzer.click();

		Thread.sleep(1000);

		WebElement QueryAnalyzrWindow = GetDriver()
				.findElement(By.xpath("//*[@id='tblQueryAnalyzerId']/tbody/tr[1]/td[1]"));
		System.out.println(QueryAnalyzrWindow.getText());

		Thread.sleep(1000);

		// validtion
		WebElement validate1 = GetDriver().findElement(By.xpath("//*[@id='tblQueryAnalyzerId']/tbody/tr[1]/td[1]"));
		System.out.println("s1 : " + validate1.getText());

		String actualText = "TACD:broadcast*";
		Assert.assertEquals(validate1.getText(), actualText);

		Thread.sleep(1000);

		// JavascriptExecutor jsS = (JavascriptExecutor)GetDriver();
		// WebElement CloseAnalyzer=
		// GetDriver().findElement(By.xpath("//*[@id='MASTERPAGEBODYID']/div[9]/div[1]/button"));
		// jsS.executeScript("arguments[0].click();",CloseAnalyzer);
		//
		// Thread.sleep(1000);

		GoToHomePage();

	}

	@Test
	public void IsOpposedFilter() throws Exception {
		Thread.sleep(1000);

		CommonSearchTerm();

		Thread.sleep(1000);

		MainFilter();
		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement ClickonISOpposed = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='ISOP']//child::span[1]"));
		js.executeScript("arguments[0].click();", ClickonISOpposed);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement SelectUS = GetDriver().findElement(By.xpath("//input[@value='KR']"));
		js1.executeScript("arguments[0].click();", SelectUS);

		Thread.sleep(200);

		// search within
		SearchWithin();

		Thread.sleep(500);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: KR101044561B1 ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(2000);

		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Anode material and battery using the same";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();

	}

	@Test
	public void ISLitigatedFilter() throws Exception {
		Thread.sleep(1000);

		CommonSearchTerm();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement ClickonLitigation = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='ISL']//child::span[1]"));
		js.executeScript("arguments[0].click();", ClickonLitigation);

		Thread.sleep(1000);

		JavascriptExecutor js2 = (JavascriptExecutor) GetDriver();
		WebElement SelectUS = GetDriver().findElement(By.xpath("//input[@value='US']"));
		js2.executeScript("arguments[0].click();", SelectUS);

		Thread.sleep(1000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC:US6015612A ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(2000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Polymer wood composite";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();

	}

	@Test
	public void IgnoreRecord() throws Exception {
		Thread.sleep(1000);

		QuickSearch();

		Thread.sleep(1000);

		// clear
		WebElement clear1 = GetDriver().findElement(
				By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		clear1.click();
		System.out.println("clicked on clear option");

		Thread.sleep(500);

		// JavascriptExecutor js = (JavascriptExecutor)GetDriver();
		// WebElement ClickonTAC =
		// GetDriver().findElement(By.xpath("//div[@id='main_0']"));
		// js.executeScript("arguments[0].click();", ClickonTAC);

		WebElement ClickonTAC = GetDriver().findElement(By.xpath("//div[@id='main_0']"));
		ClickonTAC.click();

		GetDriver().findElement(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")).clear();

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		wait1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")))
				.sendKeys("SIM");
		wait1.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("//div[@id='main_0']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Similar Patents (SIM)')]")))
				.click();

		Thread.sleep(100);
		WebElement SIM = GetDriver().findElement(By.xpath("//input[@id='textDefault_0']"));
		SIM.sendKeys("US6000000A");

		Thread.sleep(500);

		// code for second tab pnc
		WebElement ClickonSecondTAB = GetDriver().findElement(By.xpath("//div[@id='main_1']"));
		ClickonSecondTAB.click();

		WebDriverWait wait3 = new WebDriverWait(GetDriver(), 60);
		GetDriver().findElement(By.xpath("//div[@id='main_1']//input[@placeholder='Search']")).clear();

		wait3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@id='main_1']//input[@placeholder='Search']")))
				.sendKeys("PNC");

		WebElement selectPNC = GetDriver().findElement(By.xpath(
				"//div[@id='main_1']//span[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Publication No (PNC)')]"));

		selectPNC.click();

		WebElement PNC = GetDriver().findElement(By.xpath("//input[@id='textDefault_1']"));
		PNC.sendKeys("CN109976953A");

		Thread.sleep(500);

		// enable script
		WebDriverWait wait4 = new WebDriverWait(GetDriver(), 60);
		wait4.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id='SearchScriptRecordingContainer']/span[1]")));

		WebElement EnableScript = GetDriver()
				.findElement(By.xpath("//span[@class='floatLeft']//input[@id='Checkbox1']"));
		EnableScript.click();

		Thread.sleep(500);

		GetCountSearch_QS();
		// //getcount and click on search
		// WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
		// wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@ng-click='getCount()']")));
		// WebElement getCountBtn=
		// GetDriver().findElement(By.xpath("//a[@ng-click='getCount()']"));
		// System.out.println(getCountBtn.getText());
		//
		// Thread.sleep(500);
		//
		// ((JavascriptExecutor)GetDriver()).executeScript("window.scrollTo(0,"+
		// getCountBtn.getLocation().y +")");
		// getCountBtn.click();
		// System.out.println("clicked on get count");
		//
		// GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//
		// Thread.sleep(500);
		//
		// WebElement search=
		// GetDriver().findElement(By.xpath("//a[@id='searchId']"));
		// JavascriptExecutor js = (JavascriptExecutor)GetDriver();
		// js.executeScript("arguments[0].click();",search);
		// System.out.println("clicked on search");

		// on result page
		GetDriver().manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);

		// click on ignore option
		WebElement ignore = GetDriver().findElement(By.xpath("//*[@id='disableSeachScriptRecord_CN109976953A']"));
		ignore.click();
		System.out.println("clicked on ignore option");

		Thread.sleep(1000);

		GoToHomePage();

	}

	@Test
	public void LegalStatusTimline() throws Exception {
		Thread.sleep(1000);

		CommonSearchTerm();

		Thread.sleep(2000);

		SelectCurrentRecords();

		Thread.sleep(1000);

		// view dropdown
		WebDriverWait wait22 = new WebDriverWait(GetDriver(), 60);
		wait22.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='liView']/div[1]"))).click();

		Thread.sleep(500);

		WebElement LegalStatus = GetDriver().findElement(By.xpath("//span[contains(text(),'Legal Status Timeline')]"));
		LegalStatus.click();
		System.out.println("clicked on LegalStatus");

		Thread.sleep(5000);

		WebElement validate = GetDriver().findElement(By.xpath("//*[@id='divlegalstausTimeLine']"));
		System.out.println(validate.getText());

		Thread.sleep(2000);
		// validation using assert
		// WebElement
		// validate2=GetDriver().findElement(By.xpath("//*[@id='ptl_cell_content']"));
		// System.out.println("s1 : "+validate2.getText());
		//
		// String actualText="US10544423B2";
		// Assert.assertEquals(validate2.getText(), actualText);

		// Thread.sleep(500);

		GoToHomePage();

	}

	@Test
	public void KWIC() throws Exception {
		Thread.sleep(1000);

		SelectCommandSearch();

		Thread.sleep(1000);

		SpellCheck();

		Thread.sleep(500);
		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement SFAMOF = GetDriver().findElement(By.id("txtSpellCheck"));
		js.executeScript("arguments[0].click();", SFAMOF);

		// used for blocking hidden element
		JavascriptExecutor jss = (JavascriptExecutor) GetDriver();
		jss.executeScript("document.getElementById('txtCommandSearch_0_0').setAttribute('style', 'display:block')");

		// GetDriver().findElement(By.xpath("//textarea[@id='txtCommandSearch_0_0']")).clear();
		GetDriver().findElement(By.xpath("//textarea[@id='txtSpellCheck']")).clear();
		SFAMOF.sendKeys("      D:MOTOR AND PNKC:JP6463285B2            ");
		System.out.println("entered search term in cmd");

		Thread.sleep(2000);

		GetCountSearch_CMD();

		Thread.sleep(1000);

		// click on KWIC
		WebElement search = GetDriver().findElement(By.xpath("//*[@id='spanId_JP6463285B2']"));
		JavascriptExecutor js2 = (JavascriptExecutor) GetDriver();
		js2.executeScript("arguments[0].click();", search);
		// System.out.println("clicked on KWIC");

		// By locator = By.id("kwicControl");
		// if (GetDriver().findElements(locator).size() > 0)
		// {
		// if (GetDriver().findElement(locator).isDisplayed())
		// {
		// GetDriver().findElement(locator).sendKeys("clicked on KWIC");
		// }
		// }
		//
		// WebElement ClickonKWIC= GetDriver().findElement(By.id("divKWIC"));
		// ClickonKWIC.click();

		Thread.sleep(2000);

		WebElement getDataofKWIC = GetDriver().findElement(By.xpath("//div[@id='divSnippetTable']"));
		System.out.println(getDataofKWIC.getText());

		// validation using assert
		// WebElement
		// validate2=GetDriver().findElement(By.xpath("//div[@id='div_C']"));
		// System.out.println("s1 : "+validate2.getText());
		//
		// String actualText="C";
		// Assert.assertEquals(validate2.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();

		// QuickSearch();

	}

	@Test
	public void ViewMoreKWIC() throws Exception {
		Thread.sleep(1000);

		SelectCommandSearch();

		Thread.sleep(2000);

		SpellCheck();

		Thread.sleep(500);

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();// WebDriver
																	// instance
																	// type cast
																	// into
																	// JavascriptExecutor
																	// interface
		WebElement search = GetDriver().findElement(By.id("txtSpellCheck"));
		js.executeScript("arguments[0].click();", search);

		// used for blocking hidden element
		JavascriptExecutor jss = (JavascriptExecutor) GetDriver();
		jss.executeScript("document.getElementById('txtCommandSearch_0_0').setAttribute('style', 'display:block')");
		GetDriver().findElement(By.xpath("//textarea[@id='txtSpellCheck']")).clear();
		search.sendKeys("  D:MOTOR AND PNKC:JP6463285B2   ");

		System.out.println("entered search term in cmd");

		Thread.sleep(2000);

		GetCountSearch_CMD();

		Thread.sleep(2000);

		// click on KWIC
		WebElement ClickonKWIC = GetDriver().findElement(By.xpath("//*[@id='spanId_JP6463285B2']"));
		ClickonKWIC.click();

		Thread.sleep(200);

		// click on view more option of kwic
		WebDriverWait wait2 = new WebDriverWait(GetDriver(), 60);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='divV']")));

		WebElement getCountBtnn = GetDriver().findElement(By.xpath("//*[@id='divV']"));
		((JavascriptExecutor) GetDriver()).executeScript("window.scrollTo(0," + getCountBtnn.getLocation().y + ")");
		getCountBtnn.click();
		System.out.println("clicked on view more");

		// Thread.sleep(500);
		//
		// //validation using assert
		//
		// JavascriptExecutor js3 = (JavascriptExecutor)GetDriver();
		// // This will scroll down the page by 1000 pixel vertical
		// js3.executeScript("window.scrollBy(0,1000)");
		//
		// Thread.sleep(1000);
		//
		// WebElement
		// validate2=GetDriver().findElement(By.xpath("//*[@id='div_49']"));
		// System.out.println("s1 : "+validate2.getText());
		//
		// String actualText=" / inspected label KSA in the inspection resuming
		// position (from the label detection means 9 to the guide roller). 5
		// side). In the rewind mode, the control means 37 executes rewinding /
		// ";
		// Assert.assertEquals(validate2.getText(), actualText);

		Thread.sleep(2000);

		GoToHomePage();

	}

	@Test
	public void ChartType() throws Exception {
		Thread.sleep(1000);

		CommonSearchTerm();

		Thread.sleep(1000);

		// quickstats

		WebElement ClickonQuickStats = GetDriver().findElement(By.xpath("//a[contains(text(),'Quick Stats')]"));
		JavascriptExecutor executor = (JavascriptExecutor) GetDriver();
		executor.executeScript("arguments[0].click();", ClickonQuickStats);
		System.out.println("clicked on Quick stats");

		Thread.sleep(1000);

		// iframe
		WebElement iframeElement = GetDriver()
				.findElement(By.xpath("//div[@id='panel_1']//iframe[@class='iframeClass dashboardFrame ng-scope']"));
		GetDriver().switchTo().frame(iframeElement);

		Thread.sleep(1000);

		WebDriverWait wait2 = new WebDriverWait(GetDriver(), 60);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side-menu']/li[1]/a"))).click();

		System.out.println("Clicked on Parties Chart option");

		Thread.sleep(1000);

		WebDriverWait wait3 = new WebDriverWait(GetDriver(), 60);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side-menu']/li[1]/ul/li[3]/a")))
				.click();

		System.out.println("Clicked on Assignee Original");

		Thread.sleep(1000);
		// line chart
		WebElement SelectLine = GetDriver().findElement(By.xpath("//option[contains(text(),'Line')]"));
		SelectLine.click();

		Thread.sleep(1000);

		WebElement SelectCircleChart = GetDriver().findElement(By.xpath("//option[contains(text(),'Circle')]"));
		SelectCircleChart.click();

		Thread.sleep(1000);

		// Column chart
		WebElement SelectColumn = GetDriver().findElement(By.xpath("//option[contains(text(),'Column')]"));
		SelectColumn.click();

		Thread.sleep(3000);

		WebElement Validate = GetDriver().findElement(By.xpath("//*[@class='highcharts-root']"));
		System.out.println(Validate.getText());

		Thread.sleep(2000);

		GoToHomePage();

	}

	// @SuppressWarnings({ "deprecation", "unused" })
	@Test
	public void DateChart() throws Exception {
		Thread.sleep(1000);

		CommonSearchTerm();

		Thread.sleep(1000);

		// quickstats

		WebElement ClickonQuickStats = GetDriver().findElement(By.xpath("//a[contains(text(),'Quick Stats')]"));
		JavascriptExecutor executor = (JavascriptExecutor) GetDriver();
		executor.executeScript("arguments[0].click();", ClickonQuickStats);
		System.out.println("clicked on Quick stats");

		Thread.sleep(1000);

		// iframe
		WebElement iframeElement = GetDriver()
				.findElement(By.xpath("//div[@id='panel_1']//iframe[@class='iframeClass dashboardFrame ng-scope']"));
		GetDriver().switchTo().frame(iframeElement);

		Thread.sleep(1000);

		WebDriverWait wait2 = new WebDriverWait(GetDriver(), 60);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side-menu']/li[2]/a"))).click();

		System.out.println("Clicked on DATE type option");

		Thread.sleep(500);

		WebDriverWait wait3 = new WebDriverWait(GetDriver(), 60);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='side-menu']/li[2]/ul/li[2]/a")))
				.click();

		System.out.println("Clicked on application year chart");

		Thread.sleep(500);

		WebElement Validate = GetDriver().findElement(By.xpath("//*[@class='highcharts-root']"));
		System.out.println(Validate.getText());

		Thread.sleep(1000);

		GoToHomePage();

	}

	@Test
	public void PartiesChart() throws Exception {
		Thread.sleep(1000);

		CommonSearchTerm();

		Thread.sleep(1000);

		// quickstats

		WebElement ClickonQuickStats = GetDriver().findElement(By.xpath("//a[contains(text(),'Quick Stats')]"));
		JavascriptExecutor executor = (JavascriptExecutor) GetDriver();
		executor.executeScript("arguments[0].click();", ClickonQuickStats);
		System.out.println("clicked on Quick stats");

		Thread.sleep(1000);

		// iframe
		WebElement iframeElement = GetDriver()
				.findElement(By.xpath("//div[@id='panel_1']//iframe[@class='iframeClass dashboardFrame ng-scope']"));
		GetDriver().switchTo().frame(iframeElement);

		Thread.sleep(1000);

		WebDriverWait wait2 = new WebDriverWait(GetDriver(), 60);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side-menu']/li[1]/a"))).click();

		System.out.println("Clicked on Parties Chart option");

		Thread.sleep(1000);

		CircleChart();

		Thread.sleep(1000);

		GoToHomePage();

	}

	@Test
	public void OrderHightoLow() throws Exception {
		Thread.sleep(1000);

		CommonSearchTerm();

		Thread.sleep(1000);

		// quickstats

		WebElement ClickonQuickStats = GetDriver().findElement(By.xpath("//a[contains(text(),'Quick Stats')]"));
		JavascriptExecutor executor = (JavascriptExecutor) GetDriver();
		executor.executeScript("arguments[0].click();", ClickonQuickStats);
		System.out.println("clicked on Quick stats");

		Thread.sleep(1000);

		// iframe
		WebElement iframeElement = GetDriver()
				.findElement(By.xpath("//div[@id='panel_1']//iframe[@class='iframeClass dashboardFrame ng-scope']"));
		GetDriver().switchTo().frame(iframeElement);

		Thread.sleep(1000);

		WebDriverWait wait2 = new WebDriverWait(GetDriver(), 60);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side-menu']/li[1]/a"))).click();

		System.out.println("Clicked on Parties Chart option");

		Thread.sleep(1000);

		WebDriverWait wait3 = new WebDriverWait(GetDriver(), 60);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side-menu']/li[1]/ul/li[3]/a")))
				.click();

		System.out.println("Clicked on Assignee Original");

		Thread.sleep(1000);

		WebElement LowtoHigh = GetDriver().findElement(By.xpath("//option[contains(text(),'Low to High')]"));
		LowtoHigh.click();

		Thread.sleep(3000);

		WebElement Validate = GetDriver().findElement(By.xpath("//*[@class='highcharts-root']"));
		System.out.println(Validate.getText());

		Thread.sleep(2000);

		GoToHomePage();

	}

	@Test
	public void CPCFullClass() throws Exception {
		WebDriverWait wait3 = new WebDriverWait(GetDriver(), 60);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side-menu']/li[3]/ul/li[5]/a")))
				.click();

		System.out.println("Clicked on CPC Full Class chart");

		Thread.sleep(1000);

		WebElement Validate = GetDriver().findElement(By.xpath("//*[@class='highcharts-root']"));
		System.out.println(Validate.getText());

		Thread.sleep(2000);
	}

	@Test
	public void ICFullClass() throws Exception {
		WebDriverWait wait3 = new WebDriverWait(GetDriver(), 60);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side-menu']/li[3]/ul/li[1]/a")))
				.click();

		System.out.println("Clicked on IC Full Class chart");

		Thread.sleep(1000);

		WebElement Validate = GetDriver().findElement(By.xpath("//*[@class='highcharts-root']"));
		System.out.println(Validate.getText());

		Thread.sleep(2000);
	}

	@Test
	public void ClassificationChart() throws Exception {
		Thread.sleep(1000);

		CommonSearchTerm();

		Thread.sleep(1000);

		// quickstats

		WebElement ClickonQuickStats = GetDriver().findElement(By.xpath("//a[contains(text(),'Quick Stats')]"));
		JavascriptExecutor executor = (JavascriptExecutor) GetDriver();
		executor.executeScript("arguments[0].click();", ClickonQuickStats);
		System.out.println("clicked on Quick stats");

		Thread.sleep(1000);

		// iframe
		WebElement iframeElement = GetDriver()
				.findElement(By.xpath("//div[@id='panel_1']//iframe[@class='iframeClass dashboardFrame ng-scope']"));
		GetDriver().switchTo().frame(iframeElement);

		Thread.sleep(1000);
		WebDriverWait wait2 = new WebDriverWait(GetDriver(), 60);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side-menu']/li[3]/a/span[1]")))
				.click();

		System.out.println("Clicked on Classification type option");

		Thread.sleep(1000);

		CPCFullClass();

		Thread.sleep(1000);

		ICFullClass();

		GoToHomePage();

	}

	@Test
	public void CountriesChart() throws Exception {
		Thread.sleep(1000);

		CommonSearchTerm();

		Thread.sleep(1000);

		// quickstats

		WebElement ClickonQuickStats = GetDriver().findElement(By.xpath("//a[contains(text(),'Quick Stats')]"));
		JavascriptExecutor executor = (JavascriptExecutor) GetDriver();
		executor.executeScript("arguments[0].click();", ClickonQuickStats);
		System.out.println("clicked on Quick stats");

		Thread.sleep(1000);

		// iframe
		WebElement iframeElement = GetDriver()
				.findElement(By.xpath("//div[@id='panel_1']//iframe[@class='iframeClass dashboardFrame ng-scope']"));
		GetDriver().switchTo().frame(iframeElement);

		Thread.sleep(1000);
		WebDriverWait wait2 = new WebDriverWait(GetDriver(), 60);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side-menu']/li[4]/a"))).click();

		System.out.println("Clicked on Countries Chart option");

		Thread.sleep(1000);

		PubCountry();

		GoToHomePage();
	}

	@Test
	public void PubCountry() throws Exception {
		WebDriverWait wait3 = new WebDriverWait(GetDriver(), 60);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side-menu']/li[4]/ul/li[1]/a")))
				.click();

		System.out.println("Clicked on Publication Country chart");

		Thread.sleep(1000);

		WebElement Validate = GetDriver().findElement(By.xpath("//*[@class='highcharts-root']"));
		System.out.println(Validate.getText());

		Thread.sleep(2000);
	}

	@Test
	public void LegalStatusChart() throws Exception {
		Thread.sleep(1000);

		CommonSearchTerm();

		Thread.sleep(1000);

		// quickstats

		WebElement ClickonQuickStats = GetDriver().findElement(By.xpath("//a[contains(text(),'Quick Stats')]"));
		JavascriptExecutor executor = (JavascriptExecutor) GetDriver();
		executor.executeScript("arguments[0].click();", ClickonQuickStats);
		System.out.println("clicked on Quick stats");

		Thread.sleep(1000);

		// iframe
		WebElement iframeElement = GetDriver()
				.findElement(By.xpath("//div[@id='panel_1']//iframe[@class='iframeClass dashboardFrame ng-scope']"));
		GetDriver().switchTo().frame(iframeElement);

		Thread.sleep(1000);
		WebDriverWait wait2 = new WebDriverWait(GetDriver(), 60);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side-menu']/li[5]/a"))).click();

		System.out.println("Clicked on Legal Status Chart option");

		Thread.sleep(1000);

		CurrentLegalStatus();

		GoToHomePage();
	}

	@Test
	public void CurrentLegalStatus() throws Exception {
		WebDriverWait wait3 = new WebDriverWait(GetDriver(), 60);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side-menu']/li[5]/ul/li[1]/a")))
				.click();

		System.out.println("Clicked on Current Legal Status chart");

		Thread.sleep(1000);

		WebElement Validate = GetDriver().findElement(By.xpath("//*[@class='highcharts-root']"));
		System.out.println(Validate.getText());

		Thread.sleep(2000);
	}

	@Test
	public void TechnologiesChart() throws Exception {
		Thread.sleep(1000);

		CommonSearchTerm();

		Thread.sleep(1000);

		// quickstats

		WebElement ClickonQuickStats = GetDriver().findElement(By.xpath("//a[contains(text(),'Quick Stats')]"));
		JavascriptExecutor executor = (JavascriptExecutor) GetDriver();
		executor.executeScript("arguments[0].click();", ClickonQuickStats);
		System.out.println("clicked on Quick stats");

		Thread.sleep(1000);

		// iframe
		WebElement iframeElement = GetDriver()
				.findElement(By.xpath("//div[@id='panel_1']//iframe[@class='iframeClass dashboardFrame ng-scope']"));
		GetDriver().switchTo().frame(iframeElement);

		Thread.sleep(1000);
		WebDriverWait wait2 = new WebDriverWait(GetDriver(), 60);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side-menu']/li[6]/a"))).click();

		System.out.println("Clicked on Technologies Chart option");

		Thread.sleep(1000);

		TechDomainChart();

		GoToHomePage();

	}

	@Test
	public void TechDomainChart() throws Exception {
		WebDriverWait wait3 = new WebDriverWait(GetDriver(), 60);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side-menu']/li[6]/ul/li[3]/a")))
				.click();

		System.out.println("Clicked on Tech Domain Charts");

		// Thread.sleep(1000);
		//
		// WebElement
		// ForwardCitation=GetDriver().findElement(By.xpath("//*[@id='side-menu']/li[9]/ul/li[1]/ul/li[1]/a"));
		// ForwardCitation.click();
		//
		// System.out.println("Clicked on Forward Citation Charts");

		Thread.sleep(1000);

		WebElement Validate = GetDriver().findElement(By.xpath("//*[@class='highcharts-root']"));
		System.out.println(Validate.getText());

		Thread.sleep(2000);
	}

	@Test
	public void TimeToGrantChart() throws Exception {
		Thread.sleep(1000);

		CommonSearchTerm();

		Thread.sleep(1000);

		// quickstats

		WebElement ClickonQuickStats = GetDriver().findElement(By.xpath("//a[contains(text(),'Quick Stats')]"));
		JavascriptExecutor executor = (JavascriptExecutor) GetDriver();
		executor.executeScript("arguments[0].click();", ClickonQuickStats);
		System.out.println("clicked on Quick stats");

		Thread.sleep(1000);

		// iframe
		WebElement iframeElement = GetDriver()
				.findElement(By.xpath("//div[@id='panel_1']//iframe[@class='iframeClass dashboardFrame ng-scope']"));
		GetDriver().switchTo().frame(iframeElement);

		Thread.sleep(1000);
		WebDriverWait wait2 = new WebDriverWait(GetDriver(), 60);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side-menu']/li[7]/a"))).click();

		System.out.println("Clicked on Time To Grant Chart option");

		Thread.sleep(1000);

		WebDriverWait wait3 = new WebDriverWait(GetDriver(), 60);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side-menu']/li[7]/ul/li/a")))
				.click();

		System.out.println("Clicked on Average Time to Grant in Months ");

		Thread.sleep(1000);

		WebElement Validate = GetDriver().findElement(By.xpath("//*[@class='highcharts-root']"));
		System.out.println(Validate.getText());

		Thread.sleep(2000);

		GoToHomePage();
	}

	@Test
	public void CircleChart() throws Exception {
		WebDriverWait wait3 = new WebDriverWait(GetDriver(), 60);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side-menu']/li[1]/ul/li[3]/a")))
				.click();

		System.out.println("Clicked on Assignee Original");

		// Thread.sleep(1000);
		//
		// WebElement
		// ClickonTypeChart=GetDriver().findElement(By.className("className"));
		// ClickonTypeChart.click();
		//
		// System.out.println("Clicked on type");

		Thread.sleep(1000);

		WebElement SelectCircleChart = GetDriver().findElement(By.xpath("//option[contains(text(),'Circle')]"));
		SelectCircleChart.click();

		Thread.sleep(3000);

		WebElement Validate = GetDriver().findElement(By.xpath("//*[@class='highcharts-root']"));
		System.out.println(Validate.getText());

		Thread.sleep(2000);
	}

	@Test
	public void TimelineChart() throws Exception {
		// CommonSearchTerm();

		Thread.sleep(1000);
		WebElement SearchonHomePage = GetDriver()
				.findElement(By.xpath("//div[@id='divDisplay']//div//div[1]//span[4]//span[2]"));
		SearchonHomePage.click();

		// on result page
		GetDriver().manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);

		// iframe
		WebElement frameElement = GetDriver().findElement(By.id("resultFrameID"));
		GetDriver().switchTo().frame(frameElement);

		Thread.sleep(500);
		// quickstats

		WebElement ClickonQuickStats = GetDriver().findElement(By.xpath("//*[@id='ui-id-1']"));
		JavascriptExecutor executor = (JavascriptExecutor) GetDriver();
		executor.executeScript("arguments[0].click();", ClickonQuickStats);
		// WebElement ClickonQuickStats=
		// GetDriver().findElement(By.xpath("//*[@id='ui-id-1']"));
		// ClickonQuickStats.click();

		System.out.println("clicked on Quick stats");
		Thread.sleep(500);
		// iframe
		WebElement iframeElement = GetDriver().findElement(By.id("dashboardFrame"));
		GetDriver().switchTo().frame(iframeElement);

		Thread.sleep(500);

		WebDriverWait wait2 = new WebDriverWait(GetDriver(), 60);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='side-menu']/li[8]/a"))).click();

		System.out.println("Clicked on Timeline Chart option");

		Thread.sleep(500);

		WebDriverWait wait3 = new WebDriverWait(GetDriver(), 60);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='side-menu']/li[8]/ul/li/a")))
				.click();

		System.out.println("Clicked on Innovation Timeline chart");

		Thread.sleep(500);

		// WebElement
		// Validate=GetDriver().findElement(By.xpath("//*[@class='highcharts-root']"));
		// System.out.println(Validate.getText());

		Thread.sleep(500);

		GoToHomePage();

		// QuickSearch();

	}

	@Test
	public void TopRecordChart() throws Exception {
		Thread.sleep(1000);

		CommonSearchTerm();

		Thread.sleep(1000);

		// quickstats

		WebElement ClickonQuickStats = GetDriver().findElement(By.xpath("//a[contains(text(),'Quick Stats')]"));
		JavascriptExecutor executor = (JavascriptExecutor) GetDriver();
		executor.executeScript("arguments[0].click();", ClickonQuickStats);
		System.out.println("clicked on Quick stats");

		Thread.sleep(1000);

		// iframe
		WebElement iframeElement = GetDriver()
				.findElement(By.xpath("//div[@id='panel_1']//iframe[@class='iframeClass dashboardFrame ng-scope']"));
		GetDriver().switchTo().frame(iframeElement);

		Thread.sleep(1000);
		WebDriverWait wait2 = new WebDriverWait(GetDriver(), 60);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side-menu']/li[9]/a"))).click();

		System.out.println("Clicked on Top Record Chart option");

		Thread.sleep(1000);

		CitationsCharts();

		ClaimsCharts();

		InventorCharts();

		DrawingsCharts();

		ProsecutionTimeCharts();

		GoToHomePage();

	}

	@Test
	public void CitationsCharts() throws Exception {
		WebDriverWait wait3 = new WebDriverWait(GetDriver(), 60);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side-menu']/li[9]/ul/li[1]/a")))
				.click();

		System.out.println("Clicked on Citations Charts");

		Thread.sleep(1000);

		WebElement ForwardCitation = GetDriver()
				.findElement(By.xpath("//*[@id='side-menu']/li[9]/ul/li[1]/ul/li[1]/a"));
		ForwardCitation.click();

		System.out.println("Clicked on Forward Citation Charts");

		Thread.sleep(1000);

		WebElement Validate = GetDriver().findElement(By.xpath("//*[@class='highcharts-root']"));
		System.out.println(Validate.getText());

		Thread.sleep(2000);
	}

	@Test
	public void ClaimsCharts() throws Exception {
		WebDriverWait wait3 = new WebDriverWait(GetDriver(), 60);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side-menu']/li[9]/ul/li[2]/a")))
				.click();

		System.out.println("Clicked on Claims Charts");

		Thread.sleep(1000);

		WebElement IndependentClaims = GetDriver()
				.findElement(By.xpath("//*[@id='side-menu']/li[9]/ul/li[2]/ul/li[2]/a"));
		IndependentClaims.click();

		System.out.println("Clicked on Independent Claims Charts");

		Thread.sleep(1000);

		WebElement Validate = GetDriver().findElement(By.xpath("//*[@class='highcharts-root']"));
		System.out.println(Validate.getText());

		Thread.sleep(2000);
	}

	@Test
	public void FamiliesCharts() throws Exception {
		WebDriverWait wait3 = new WebDriverWait(GetDriver(), 60);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side-menu']/li[9]/ul/li[3]/a")))
				.click();

		System.out.println("Clicked on Families Charts");

		Thread.sleep(1000);

		WebElement FamilyCoverage = GetDriver().findElement(By.xpath("//*[@id='side-menu']/li[9]/ul/li[3]/ul/li[2]/a"));
		FamilyCoverage.click();

		System.out.println("Clicked on Family Coverage Charts");

		Thread.sleep(1000);

		WebElement Validate = GetDriver().findElement(By.xpath("//*[@class='highcharts-root']"));
		System.out.println(Validate.getText());

		Thread.sleep(2000);
	}

	@Test
	public void InventorCharts() throws Exception {
		WebDriverWait wait3 = new WebDriverWait(GetDriver(), 60);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side-menu']/li[9]/ul/li[4]/a")))
				.click();

		System.out.println("Clicked on Inventor Charts");

		Thread.sleep(1000);

		WebElement Inventors = GetDriver().findElement(By.xpath("//*[@id='side-menu']/li[9]/ul/li[4]/ul/li/a"));
		Inventors.click();

		System.out.println("Clicked on Inventors Charts");

		Thread.sleep(1000);

		WebElement Validate = GetDriver().findElement(By.xpath("//*[@class='highcharts-root']"));
		System.out.println(Validate.getText());

		Thread.sleep(2000);
	}

	@Test
	public void DrawingsCharts() throws Exception {
		WebDriverWait wait3 = new WebDriverWait(GetDriver(), 60);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side-menu']/li[9]/ul/li[5]/a")))
				.click();

		System.out.println("Clicked on Drawings Charts");

		Thread.sleep(1000);

		WebElement Inventors = GetDriver().findElement(By.xpath("//*[@id='side-menu']/li[9]/ul/li[5]/ul/li/a"));
		Inventors.click();

		System.out.println("Clicked on Drawings Charts");

		Thread.sleep(1000);

		WebElement Validate = GetDriver().findElement(By.xpath("//*[@class='highcharts-root']"));
		System.out.println(Validate.getText());

		Thread.sleep(2000);
	}

	@Test
	public void ProsecutionTimeCharts() throws Exception {
		WebDriverWait wait3 = new WebDriverWait(GetDriver(), 60);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='side-menu']/li[9]/ul/li[6]/a")))
				.click();

		System.out.println("Clicked on Prosecution Time Charts");

		Thread.sleep(1000);

		WebElement Inventors = GetDriver().findElement(By.xpath("//*[@id='side-menu']/li[9]/ul/li[6]/ul/li/a"));
		Inventors.click();

		System.out.println("Clicked on Max Time To Grant Charts");

		Thread.sleep(1000);

		WebElement Validate = GetDriver().findElement(By.xpath("//*[@class='highcharts-root']"));
		System.out.println(Validate.getText());

		Thread.sleep(2000);
	}

	@Test
	public void CitationViewer() throws Exception {
		CommonSearchTerm();

		Thread.sleep(500);

		// select current record tab
		WebDriverWait wait4 = new WebDriverWait(GetDriver(), 60);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'selector')]")))
				.click();

		WebElement selectCurrentRecords = GetDriver()
				.findElement(By.xpath("//span[contains(@class,'selector')]//div[2]//span[1]"));
		selectCurrentRecords.click();

		// click on view dropdown
		WebElement ele = GetDriver().findElement(By.xpath("//*[@id='liView']"));
		Actions action = new Actions(GetDriver());
		action.moveToElement(ele).build().perform();
		// WebDriverWait wait22= new WebDriverWait(GetDriver(),60);
		// wait22.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='liView']"))).click();
		System.out.println("clicked on view dropdown");
		Thread.sleep(500);

		WebElement ClickonCitation1 = GetDriver().findElement(By.xpath("//div[@id='divCit_Viewer']"));
		ClickonCitation1.click();
		System.out.println("selected citation viewer option ");

		Thread.sleep(500);

		GoToHomePage();

	}

	@Test
	public void DateFilter() throws Exception {

		CommonSearchTerm();

		Thread.sleep(2000);

		// WebDriverWait wait3= new WebDriverWait(GetDriver(),60);
		// wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='filters
		// forclear']//div[10]"))).click();
		//
		// WebElement
		// ClickonPubDate=GetDriver().findElement(By.xpath("//body[@class='pageBody
		// ui-widget ng-scope']/form[@id='form1']/div[@class='ui-widget
		// forclear']/div[@id='divDisplay']/div[@class='forclear']/div[@id='leftLowerPanelContainer']/div[@class='leftContent']/div[@class='ng-scope']/div[@class='flt-mim-wth
		// ng-scope']/div[@id='leftUpperPanel_filterContainer']/div[@class='filters
		// forclear']/div[@id='SearchSummaryContainer']/div[@id='leftUpperPanel_SearchSummaryContainer_filterContainer']/div[11]/div[1]"));
		// ClickonPubDate.click();

		GoToHomePage();

	}

	@Test
	public void EditSearch() throws Exception {
		Thread.sleep(1000);

		SelectCommandSearch();

		Thread.sleep(1000);

		// for spell check
		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[@class='floatLeft leftSpacer col-xs-4 col-sm-4 col-md-4 col-lg-4 switchCaseCont']")));
		WebElement SpellCheck = GetDriver().findElement(By.xpath("//label[@class='onoffswitch-label']"));
		SpellCheck.click();

		Thread.sleep(500);
		JavascriptExecutor js = (JavascriptExecutor) GetDriver();// WebDriver
																	// instance
																	// type cast
																	// into
																	// JavascriptExecutor
																	// interface
		WebElement Multilang = GetDriver().findElement(By.id("txtSpellCheck"));
		js.executeScript("arguments[0].click();", Multilang);

		// used for blocking hidden element
		JavascriptExecutor jss = (JavascriptExecutor) GetDriver();
		jss.executeScript("document.getElementById('txtCommandSearch_0_0').setAttribute('style', 'display:block')");
		GetDriver().findElement(By.xpath("//textarea[@id='txtSpellCheck']")).clear();
		Multilang.sendKeys("                 TAC$:cloud and PNC:US2019375592A1               ");
		System.out.println("entered search term of Multi language search in cmd ");

		Thread.sleep(500);

		GetCountSearch_QS();

		Thread.sleep(1000);

		WebElement BackToSearch = GetDriver().findElement(By.xpath("//*[@id='Container']/div/div[1]/div/div[1]/i"));
		BackToSearch.click();

		Thread.sleep(1000);

		SpellCheck();

		Thread.sleep(500);
		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();// WebDriver
																	// instance
																	// type cast
																	// into
																	// JavascriptExecutor
																	// interface
		WebElement TAIX = GetDriver().findElement(By.id("txtSpellCheck"));
		js1.executeScript("arguments[0].click();", TAIX);

		// used for blocking hidden element
		JavascriptExecutor js2 = (JavascriptExecutor) GetDriver();
		js2.executeScript("document.getElementById('txtCommandSearch_0_0').setAttribute('style', 'display:block')");
		GetDriver().findElement(By.xpath("//textarea[@id='txtSpellCheck']")).clear();
		TAIX.sendKeys(
				"                                             TAIX: glycerol ester or thyglycerol ester  AND pnc: US10501351B2                 ");
		System.out.println("entered search term of TAIX in cmd ");

		Thread.sleep(500);

		GetCountSearch_QS();

		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Composition and methods of use";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();

	}

	@Test
	public void QueryBuilder() throws Exception {
		Thread.sleep(1000);

		CommonSearchTerm();

		Thread.sleep(1000);

		MainFilter();

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement ClickonQueryBuilder = GetDriver().findElement(By.xpath("//*[@id='querybuilderbtn']"));
		ClickonQueryBuilder.click();

		Thread.sleep(500);

		// search in query builder
		WebElement EnterText = GetDriver().findElement(By.xpath("//*[@id='txtPatApp_0']"));
		EnterText.sendKeys("  Multi-core fiber-cell laser with stretching function ");

		WebElement ClickonSecondTab = GetDriver()
				.findElement(By.xpath("//button[contains(text(),'Assignee Orig & Norm (ASN)')]"));
		ClickonSecondTab.click();

		WebDriverWait wait3 = new WebDriverWait(GetDriver(), 60);
		GetDriver().findElement(By.xpath("//div[@id='main_1']//input[@placeholder='Search']")).clear();

		wait3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@id='main_1']//input[@placeholder='Search']")))
				.sendKeys("PNC");

		GetDriver()
				.findElement(By
						.xpath("//div[@id='main_1']//span[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu')][contains(text(),'Publication No (PNC)')]"))
				.click();

		WebElement EnterPNC = GetDriver().findElement(By.xpath("//input[@id='textDefault_1']"));
		EnterPNC.sendKeys("  CN110137792A  ");

		Thread.sleep(500);

		WebElement AddQuery = GetDriver().findElement(By.xpath("//*[@id='quickSearchPanelID']/div[2]/span"));
		AddQuery.click();

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(2000);

		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Multi-core fiber-cell laser with stretching function";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
	}

	@Test
	public void CheckAllIcon() throws Exception {
		Thread.sleep(1000);

		CommonSearchTerm();

		Thread.sleep(2000);
		// one click icon
		WebElement PdfIcon = GetDriver().findElement(By.xpath(".//*[@id='imgPdf']"));
		PdfIcon.click();
		System.out.println(GetDriver().getCurrentUrl());

		WebElement Mosaic = GetDriver().findElement(By.xpath(".//*[@id='imgMosaic']"));
		Mosaic.click();
		System.out.println(GetDriver().getCurrentUrl());

		WebElement LegalStatus = GetDriver().findElement(By.xpath(".//*[@id='imgLegalStatus']"));
		LegalStatus.click();
		System.out.println(GetDriver().getCurrentUrl());

		// WebElement
		// FamilyViewer=GetDriver().findElement(By.xpath("//i[@id='divFamilyView_AU2018264110A1']"));
		// FamilyViewer.click();
		// System.out.println(GetDriver().getCurrentUrl());

		Thread.sleep(1000);

		GoToHomePage();

		Thread.sleep(1000);

		// QuickSearch();

		// WebElement
		// Litigation=GetDriver().findElement(By.xpath(".//*[@id='I2']"));
		// Litigation.click();
		// System.out.println(GetDriver().getCurrentUrl());

		// WebElement
		// OrangeBook=GetDriver().findElement(By.xpath(".//*[@id='orangebook_CN110069363A']"));
		// OrangeBook.click();
		// System.out.println(GetDriver().getCurrentUrl());

		// WebElement orangebookwindow=
		// GetDriver().findElement(By.xpath(".//*[@id='divorangeTooltip_CN110069363A']"));
		// System.out.println(orangebookwindow.getText());
		// System.out.println(GetDriver().getCurrentUrl());
		//
		// WebElement
		// closeOrangebook=GetDriver().findElement(By.xpath(".//*[@id='divorangeTooltip_CN110069363A']/div[1]/div"));
		// closeOrangebook.click();
		// System.out.println(GetDriver().getCurrentUrl());

		// KWIC
		// WebElement KWIC=
		// GetDriver().findElement(By.xpath(".//*[@id='spanId_CN110069363A']"));
		// KWIC.click();
		//
		// WebElement
		// validateKWIC=GetDriver().findElement(By.xpath(".//*[@id='divSnippetTable']"));
		// System.out.println(validateKWIC.getText());
		//
		// WebElement
		// CloseKWIC=GetDriver().findElement(By.xpath(".//*[@id='imgClose']"));
		// CloseKWIC.click();

	}

	@Test
	public void PDFviewer() throws Exception {

		CommonSearchTerm();

		WebElement select = GetDriver().findElement(By.xpath(".//*[@id='ulResultAction']/li[1]/div/div/span[2]/i"));
		select.click();
		WebElement checkCurrent = GetDriver().findElement(By.xpath(".//*[@id='chkCurrentPage']"));
		checkCurrent.click();

		// validate selected record count
		WebElement validatecount = GetDriver().findElement(By.xpath(".//*[@id='ulResultAction']/li[3]/div"));
		System.out.println(validatecount.getText());

		Thread.sleep(500);

		WebElement ViewDropdown = GetDriver()
				.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_SearchResultsControl_liView']/div[1]/i"));
		ViewDropdown.click();

		WebElement SelectLegalStatus = GetDriver()
				.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_SearchResultsControl_divlegalstatus']"));
		SelectLegalStatus.click();

		Thread.sleep(2000);

		WebElement ValidateLegalStatus = GetDriver().findElement(By.xpath(".//*[@id='divlegalstausTimeLine']"));
		System.out.println(ValidateLegalStatus.getText());

		WebElement Close = GetDriver().findElement(By.xpath("html/body/div[2]/div[1]/button"));
		Close.click();

		Thread.sleep(1000);

		GoToHomePage();

	}

	@Test
	public void PDFCart() throws Exception {
		Thread.sleep(1000);

		CommonSearchTerm();

		SelectCurrentRecords();

		Thread.sleep(1000);

		AddDropdown();

		Thread.sleep(200);

		// WebDriverWait wait2= new WebDriverWait(GetDriver(), 60);
		// wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='addToCartText']/span")));

		WebElement ClickonAddoProj = GetDriver().findElement(By.xpath("//*[@id='addToCartText']/span"));
		ClickonAddoProj.click();
		System.out.println("selected records added to PDF cart ");

		Thread.sleep(200);

		AddDropdown();

		Thread.sleep(200);

		WebElement ViewPdfCart = GetDriver().findElement(By.xpath("//*[@id='CartContainer']/span"));
		ViewPdfCart.click();

		Thread.sleep(200);

		WebElement Download = GetDriver().findElement(By.xpath("//*[@id='bottomId']/input[3]"));
		Download.click();

		Thread.sleep(200);

		Date d = new Date(System.currentTimeMillis());
		GetDriver().findElement(By.xpath("//*[@id='bottomId']/input[1]")).sendKeys("CurrentSearchAlert3" + d);

		Thread.sleep(200);

		WebElement ClickonOK = GetDriver().findElement(By.xpath("//*[@id='bottomId']/input[5]"));
		ClickonOK.click();

		Thread.sleep(500);

		AddDropdown();

		Thread.sleep(200);

		WebElement ClickonBatches = GetDriver().findElement(By.xpath("//*[@id='ui-id-6']"));
		ClickonBatches.click();

		Thread.sleep(200);

		// WebElement
		// Refresh=GetDriver().findElement(By.xpath("//*[@id='ui-id-6']/span[2]"));
		// Refresh.click();

		Thread.sleep(1000);

		GoToHomePage();

	}

	@Test
	public void Share() throws Exception {
		CommonSearchTerm();

		// click on view dropdown
		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[@id='ContentPlaceHolder1_SearchResultsControl_PSharebtn']"))).click();
		System.out.println("clicked on Share option");
		Thread.sleep(500);

		WebDriverWait wait2 = new WebDriverWait(GetDriver(), 60);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='mainsynatxdiv']")));

		WebElement ProjectName = GetDriver().findElement(By.xpath("//input[@id='PS_projectNmId']"));
		ProjectName.sendKeys("Share proj 1");

		Thread.sleep(500);

		WebElement RecipientEmail = GetDriver().findElement(By.xpath("//input[@id='token-input-recEmailId']"));
		RecipientEmail.sendKeys("shrutika1@patseer.com");

		WebElement SelectEmail = GetDriver().findElement(By.xpath("//li[@class='token-input-input-token-facebook']"));
		SelectEmail.click();

		Thread.sleep(500);

		WebElement RecipentNote = GetDriver().findElement(By.xpath("//textarea[@placeholder='Add your message here']"));
		RecipentNote.sendKeys("Sharing project through automation");

		Thread.sleep(500);

		WebElement Submit = GetDriver().findElement(By.xpath("//sapn[@id='PS_SubmitId']"));
		Submit.click();

		Thread.sleep(500);

		GoToHomePage();

		// QuickSearch();
	}

	@Test
	public void Splitview() throws Exception {
		Thread.sleep(1000);

		CommonSearchTerm();

		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement ClickonSplitview = GetDriver()
				.findElement(By.xpath("//*[@id='searchResultContainerOUNUWwKr2h']/div[1]/div[6]/div[1]/div/div"));
		js1.executeScript("arguments[0].click();", ClickonSplitview);

		Thread.sleep(2000);

		// iframe
		WebElement iframeElement = GetDriver()
				.findElement(By.id("ContentPlaceHolder1_SearchResultsControl_IfrmDetailsView"));
		GetDriver().switchTo().frame(iframeElement);

		WebElement ClickonFamily = GetDriver()
				.findElement(By.xpath("//*[@id='ContentPlaceHolder1_detailsViewCntrl_tabcontainserID']/li[4]"));
		ClickonFamily.click();

		Thread.sleep(500);
		// WebElement ClickonCitation=
		// GetDriver().findElement(By.xpath("//ul[@id='ContentPlaceHolder1_detailsViewCntrl_tabcontainserID']//li[5]"));
		// ClickonCitation.click();

		GoToHomePage();

	}

	@Test
	public void OneClickAddToProj() throws Exception {
		CommonSearchTerm();

		WebDriverWait wait23 = new WebDriverWait(GetDriver(), 60);
		wait23.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//div[@id='dropdwnAction_CN110320182A']//i[@class='dropdown-toggle mdi mdi-dots-vertical medium']")))
				.click();

		Thread.sleep(500);

		WebElement AddToProj = GetDriver().findElement(By.xpath(
				"//li[@id='imgAddToProject_CN110320182A']//span[@class='fontsize13 handPointer'][contains(text(),'Add to Project')]"));
		AddToProj.click();
		Thread.sleep(1000);

		WebElement SelectProj = GetDriver().findElement(By.xpath("//label[contains(text(),'motor')]"));
		SelectProj.click();

		WebElement Add = GetDriver().findElement(By.xpath("//button[@id='divAPQ']"));
		Add.click();

		Thread.sleep(500);

		GoToHomePage();
	}

	@Test
	public void EyeIcon() throws Exception {
		CommonSearchTerm();

		WebDriverWait wait23 = new WebDriverWait(GetDriver(), 60);
		wait23.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//div[@id='dropdwnAction_CN110320182A']//i[@class='dropdown-toggle mdi mdi-dots-vertical medium']")))
				.click();

		Thread.sleep(500);

		WebElement AddToProj = GetDriver().findElement(By.xpath(
				"//li[@id='imgAddToProject_CN110320182A']//span[@class='fontsize13 handPointer'][contains(text(),'Add to Project')]"));
		AddToProj.click();
		Thread.sleep(1000);

		WebElement SelectProjEyeIcon = GetDriver().findElement(By.xpath("//i[@id='i_33371']"));
		SelectProjEyeIcon.click();

		WebElement Add = GetDriver().findElement(By.xpath("//button[@id='divAPQ']"));
		Add.click();

		Thread.sleep(500);

		GoToHomePage();

	}

	@Test
	public void DownloadinCSV() throws Exception {
		CommonSearchTerm();

		// litigation filter
		WebDriverWait wait2 = new WebDriverWait(GetDriver(), 60);
		wait2.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(
				"//body[@class='pageBody ui-widget ng-scope']/form[@id='form1']/div[@class='ui-widget forclear']/div[@id='divDisplay']/div[@class='forclear']/div[@id='leftLowerPanelContainer']/div[@class='leftContent']/div[@class='ng-scope']/div[@class='flt-mim-wth ng-scope']/div[@id='leftUpperPanel_filterContainer']/div[@class='filters forclear']/div[@id='SearchSummaryContainer']/div[@id='leftUpperPanel_SearchSummaryContainer_filterContainer']/div[5]/div[1]")));

		WebElement ClickonAssignee = GetDriver().findElement(By.xpath(
				"//body[@class='pageBody ui-widget ng-scope']/form[@id='form1']/div[@class='ui-widget forclear']/div[@id='divDisplay']/div[@class='forclear']/div[@id='leftLowerPanelContainer']/div[@class='leftContent']/div[@class='ng-scope']/div[@class='flt-mim-wth ng-scope']/div[@id='leftUpperPanel_filterContainer']/div[@class='filters forclear']/div[@id='SearchSummaryContainer']/div[@id='leftUpperPanel_SearchSummaryContainer_filterContainer']/div[5]/div[1]"));
		ClickonAssignee.click();

		WebElement ClickonDownloadCSV = GetDriver()
				.findElement(By.xpath("//span[@class='mdi mdi-arrow-down handPointer fs_searchbox']"));
		ClickonDownloadCSV.click();

		System.out.println("clicked on csv option");

		Thread.sleep(500);

		GoToHomePage();

	}

	@Test
	public void DownloadClassDef() throws Exception {
		CommonSearchTerm();

		// litigation filter
		WebDriverWait wait2 = new WebDriverWait(GetDriver(), 60);
		wait2.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(
				"//body[@class='pageBody ui-widget ng-scope']/form[@id='form1']/div[@class='ui-widget forclear']/div[@id='divDisplay']/div[@class='forclear']/div[@id='leftLowerPanelContainer']/div[@class='leftContent']/div[@class='ng-scope']/div[@class='flt-mim-wth ng-scope']/div[@id='leftUpperPanel_filterContainer']/div[@class='filters forclear']/div[@id='SearchSummaryContainer']/div[@id='leftUpperPanel_SearchSummaryContainer_filterContainer']/div[5]/div[1]")));

		WebElement ClickonICClass = GetDriver().findElement(By.xpath(
				"//body[@class='pageBody ui-widget ng-scope']/form[@id='form1']/div[@class='ui-widget forclear']/div[@id='divDisplay']/div[@class='forclear']/div[@id='leftLowerPanelContainer']/div[@class='leftContent']/div[@class='ng-scope']/div[@class='flt-mim-wth ng-scope']/div[@id='leftUpperPanel_filterContainer']/div[@class='filters forclear']/div[@id='SearchSummaryContainer']/div[@id='leftUpperPanel_SearchSummaryContainer_filterContainer']/div[15]/div[1]"));
		ClickonICClass.click();

		WebElement SelectFirstElement = GetDriver().findElement(By.xpath(
				"//body[@class='pageBody ui-widget ng-scope']/form[@id='form1']/div[@class='ui-widget forclear']/div[@id='divDisplay']/div[@class='forclear']/div[@id='leftLowerPanelContainer']/div[@class='leftContent']/div[@class='ng-scope']/div[@class='flt-mim-wth ng-scope']/div[@id='leftUpperPanel_filterContainer']/div[@class='filters forclear']/div[@id='SearchSummaryContainer']/div[@id='leftUpperPanel_SearchSummaryContainer_filterContainer']/div[@class='float-left separate ng-scope']/div/div[@class='width100 searchSummaryContainer ng-scope']/div[@class='itemsContainer']/div[1]/div[1]/div[1]/div[1]/input[1]"));
		SelectFirstElement.click();

		WebElement ClickonDownloadCSV = GetDriver()
				.findElement(By.xpath("//span[@class='mdi mdi-arrow-down handPointer fs_searchbox']"));
		ClickonDownloadCSV.click();

		System.out.println("clicked on csv option");

		Thread.sleep(500);

		GoToHomePage();

	}

	@Test
	public void CitationCategory() {
		WebElement openRecord = GetDriver().findElement(By.xpath(".//*[@id='lblText_EP1465369A1']"));
		openRecord.click();

		WebElement ClcikonCitationDetailview = GetDriver().findElement(By.xpath(".//*[@id='ui-id-20']"));
		ClcikonCitationDetailview.click();

	}

	@Test
	public void HitAnalysis() throws Exception {
		Thread.sleep(1000);

		CommonSearchTerm();

		Thread.sleep(3000);

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='views']/div[1]"))).click();

		Thread.sleep(200);

		WebElement selectSTDFAM = GetDriver().findElement(By.xpath("//*[@id='views']/div[2]/div[1]"));
		selectSTDFAM.click();

		Thread.sleep(1000);

		// view dropdown
		WebDriverWait wait22 = new WebDriverWait(GetDriver(), 60);
		wait22.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='liView']/div[1]"))).click();

		Thread.sleep(500);

		// WebElement ele =
		// GetDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_SearchResultsControl_liView']/div[1]"));
		// Actions action = new Actions(GetDriver());
		// action.moveToElement(ele).build().perform();
		// GetDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_SearchResultsControl_liView']/div[1]")).click();

		WebElement hit = GetDriver().findElement(By.xpath("//*[@id='showHitAnalysisBtn']"));
		hit.click();
		System.out.println("clicked on hit analysis");

		Thread.sleep(1000);

		WebElement VerifyCountofFiber = GetDriver().findElement(By.xpath("//tr[@id='tr_fiber']"));

		System.out.println(VerifyCountofFiber.getText());

		WebElement VerifyCountofCell = GetDriver().findElement(By.xpath("//tr[@id='tr_cell']"));
		System.out.println(VerifyCountofCell.getText());

		Thread.sleep(1000);

		GoToHomePage();

		// QuickSearch();
	}

	@Test
	public void FamilyViewer() throws Exception {
		Thread.sleep(1000);

		CommonSearchTerm();

		Thread.sleep(500);

		SearchWithin();

		WebElement searchwithin = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		searchwithin.sendKeys("PNC:AU2018264110A1");

		ApplyFilter();

		Thread.sleep(2000);

		// family viewer
		WebElement FamilyViewer = GetDriver().findElement(By.xpath("//i[@id='divFamilyView_AU2018264110A1']"));
		FamilyViewer.click();
		System.out.println(GetDriver().getCurrentUrl());

		Thread.sleep(1000);

		GoToHomePage();

	}

	@Test
	public void AddTOQuickList() throws Exception {
		Thread.sleep(1000);

		CommonSearchTerm();

		Thread.sleep(2000);

		SelectCurrentRecords();

		Thread.sleep(1000);

		AddDropdown();

		Thread.sleep(200);

		WebElement SelectQuicklist = GetDriver().findElement(By.xpath("//div[@id='divAddToUserQuicklist']"));
		SelectQuicklist.click();

		Thread.sleep(2000);

		GoToHomePage();

		Thread.sleep(1000);

		WebElement ClickonQuickList = GetDriver().findElement(By.xpath("//a[contains(text(),'QuickList')]"));
		ClickonQuickList.click();

		Thread.sleep(1000);

		WebElement DisplayCount = GetDriver()
				.findElement(By.xpath("//label[@id='ContentPlaceHolder1_lblRecordCount']"));
		System.out.println(DisplayCount.getText());

		Thread.sleep(1000);

		GoToHomePage();

	}

	@Test
	public void AddtoPDFCart() throws Exception {
		CommonSearchTerm();

		// select current record tab
		WebDriverWait wait3 = new WebDriverWait(GetDriver(), 60);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'selector')]")))
				.click();

		WebElement selectCurrentRecords = GetDriver()
				.findElement(By.xpath("//span[contains(@class,'selector')]//div[2]//span[1]"));
		selectCurrentRecords.click();

		WebElement ClickonAdd = GetDriver()
				.findElement(By.xpath("//div[contains(@class,'div-result-action show-add-action dra-buttons')]"));
		ClickonAdd.click();

		WebElement SelectPDFCart = GetDriver()
				.findElement(By.xpath("//div[@id='ContentPlaceHolder1_SearchResultsControl_pdfCart_addToCartText']"));
		SelectPDFCart.click();

		WebElement ClickonAdd2 = GetDriver()
				.findElement(By.xpath("//div[contains(@class,'div-result-action show-add-action dra-buttons')]"));
		ClickonAdd2.click();

		WebElement ViewPDFCart = GetDriver()
				.findElement(By.xpath("//span[@class='floatLeft leftSpacer record-action-dropdown']"));
		ViewPDFCart.click();

		Thread.sleep(500);

		GoToHomePage();

	}

	@Test
	public void AddToProject() throws Exception {
		CommonSearchTerm();

		WebElement selectFirstrecord = GetDriver().findElement(By.xpath("//input[@id='chkRecordID_WO2019162942A1']"));
		selectFirstrecord.click();

		WebElement selectSecondRecord = GetDriver().findElement(By.xpath("//input[@id='chkRecordID_CN110157660A']"));
		selectSecondRecord.click();

		WebElement ClickonAdd = GetDriver()
				.findElement(By.xpath("//div[contains(@class,'div-result-action show-add-action dra-buttons')]"));
		ClickonAdd.click();

		WebElement SelectProject = GetDriver().findElement(By.xpath(
				"//div[@id='ContentPlaceHolder1_SearchResultsControl_divAddToProject']//span[contains(text(),'Project')]"));
		SelectProject.click();

		WebElement EnterProject = GetDriver().findElement(By.xpath("//input[@id='token-input-txtProjectNameRecent']"));
		EnterProject.sendKeys("Automated proj1");

		WebElement SelectProjectName = GetDriver()
				.findElement(By.xpath("//div[@class='token-input-dropdown-facebook']"));
		SelectProjectName.click();

		Thread.sleep(2000);

		WebElement Add = GetDriver().findElement(By.xpath("//button[@id='divAPQ']"));
		Add.click();

		Thread.sleep(500);

		GoToHomePage();

	}

	@Test
	public void LocarnoCustomView() throws Exception {
		Thread.sleep(1000);

		QuickSearch();

		Thread.sleep(1000);

		// clear
		WebElement clear = GetDriver().findElement(
				By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		clear.click();
		System.out.println("clicked on clear option");

		Thread.sleep(1000);

		WebElement ClickonTAC = GetDriver().findElement(By.xpath("//div[@id='main_0']"));
		ClickonTAC.click();

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 30);
		GetDriver().findElement(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")).clear();

		wait1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")))
				.sendKeys("LOC");

		wait1.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("//div[@id='main_0']//span[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Locarno Class (LOC)')]")))
				.click();

		WebElement EnterText = GetDriver().findElement(By.xpath("//input[@id='textDefault_0']"));
		EnterText.sendKeys("1214");

		GetCountSearch_QS();

		// on result page

		Thread.sleep(2000);

		WebDriverWait wait2 = new WebDriverWait(GetDriver(), 60);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='views']/div[1]"))).click();

		Thread.sleep(200);

		WebElement ClickonCustomView = GetDriver().findElement(By.xpath("//div[@class='optgroup']"));
		ClickonCustomView.click();

		Thread.sleep(200);

		WebElement ClickonLocarno = GetDriver().findElement(By.xpath("//div[contains(text(),'Locarno')]"));
		ClickonLocarno.click();

		Thread.sleep(1000);

		WebElement PubDateDropdown = GetDriver()
				.findElement(By.xpath("//*[@id='ulResultAction']/li[6]/div/div/button"));
		PubDateDropdown.click();

		Thread.sleep(500);

		WebElement SelectRelevence = GetDriver()
				.findElement(By.xpath("//*[@id='ulResultAction']/li[6]/div/div/ul/li[5]"));
		SelectRelevence.click();

		Thread.sleep(1000);

		// WebElement
		// getLocarnoData=GetDriver().findElement(By.xpath("//*[@id='trnumber_USD413550S']/div[5]/div"));
		// System.out.println(getLocarnoData.getText());

		Thread.sleep(1000);

		GoToHomePage();

	}

	@Test
	public void SortingOrder() throws Exception {
		CommonSearchTerm();

		WebElement ClickonSorting = GetDriver().findElement(By.xpath("//div[@class='placeholder']"));
		ClickonSorting.click();

		WebElement SelectSTDFAM = GetDriver().findElement(By.xpath("//div[contains(text(),'Standard + Family')]"));
		SelectSTDFAM.click();

		Thread.sleep(500);

		GoToHomePage();

	}

	@Test
	public void Subsidiaries() throws Exception {
		CommonSearchTerm();

		Thread.sleep(2000);

		WebElement ClickonSorting = GetDriver().findElement(By.xpath("//div[@class='placeholder']"));
		ClickonSorting.click();

		WebElement SelectSTD = GetDriver().findElement(By.xpath("//li[@class='viewDrpContainer']//div[3]"));
		SelectSTD.click();

		WebElement CheckPASN = GetDriver()
				.findElement(By.xpath("//span[contains(text(),'THERMO FISHER SCIENTIFIC INC')]"));
		CheckPASN.click();

		Thread.sleep(2000);
		// WebElement
		// GetData=GetDriver().findElement(By.xpath("//span[@id='PASN_US10434509B2_THERMOFISHERSCIENTIFICINC_0']"));
		// System.out.println(GetData.getText());

		Thread.sleep(500);

		GoToHomePage();

	}

	@Test
	public void StdFamView() throws Exception {
		// select number search
		Thread.sleep(1000);

		SelectNumberSearch();

		Thread.sleep(500);

		WebElement input = GetDriver().findElement(By.xpath("//textarea[@id='txtManual_0_0']"));
		input.sendKeys("DE112012004767T5");

		Thread.sleep(1000);

		WebElement lookup = GetDriver().findElement(By.xpath("//div[@id='divAddButton_0_0']"));
		lookup.click();
		System.out.println("clicked on lookup");

		Thread.sleep(2000);

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='views']/div[1]"))).click();

		Thread.sleep(200);

		WebElement selectSTDFAM = GetDriver().findElement(By.xpath("//*[@id='views']/div[2]/div[5]"));
		selectSTDFAM.click();

		Thread.sleep(1000);

		// select current record tab of sfam view

		WebElement ele = GetDriver().findElement(By.xpath(
				"//div[@class='floatLeft recordDetailConatinerView width41px recordInfoFamContainer1']//div[@class='selector']"));
		Actions action = new Actions(GetDriver());
		action.moveToElement(ele).build().perform();

		Thread.sleep(1000);

		// WebDriverWait wait2= new WebDriverWait(GetDriver(),90);
		// wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='famCntnr_DE112012004767T5']")));

		WebElement selectCurrentRecords = GetDriver()
				.findElement(By.xpath("//input[@id='chkCurrentPage_DE112012004767T5_sFamCntnr']"));
		selectCurrentRecords.click();

		Thread.sleep(500);

		WebElement AddtoProj = GetDriver().findElement(By.xpath("//*[@id='divAddToProjectSfam_txt_0']"));
		AddtoProj.click();

		Thread.sleep(1000);

		WebElement SelectProj = GetDriver()
				.findElement(By.xpath("//*[@id='divrecent_projects']/div/div[2]/div[3]/div[1]/span[1]/label/input"));
		SelectProj.click();

		Thread.sleep(500);

		WebElement ClickonAdd = GetDriver().findElement(By.xpath("//*[@id='divAPQ']"));
		ClickonAdd.click();

		Thread.sleep(1000);

		GoToHomePage();

	}

	@Test
	public void CurrentRecordsCount() throws Exception {
		Thread.sleep(1000);

		CommonSearchTerm();

		Thread.sleep(1000);

		SelectCurrentRecords();

		Thread.sleep(1000);

		WebElement Recordcount = GetDriver()
				.findElement(By.xpath("//div[contains(@class,'div-result-action-NoPointer dra-buttons')]"));
		System.out.println(Recordcount.getText());

		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='CheckCount']")));
		WebElement validate = GetDriver().findElement(By.xpath("//span[@id='CheckCount']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "20";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
	}

	@Test
	public void FullTextFilter() throws Exception {
		Thread.sleep(1000);

		CommonSearchTerm();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement ClickonTACD = GetDriver().findElement(By.xpath("//span[@title='FullText']"));
		js.executeScript("arguments[0].click();", ClickonTACD);

		Thread.sleep(1000);

		WebElement EnterText = GetDriver().findElement(By.xpath("//*[@id='divDate_TACD']/div[1]/div/div/input"));
		EnterText.sendKeys("Formed ligneous body");

		Thread.sleep(1000);
/*
		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: EP2857162A1  ");

		Thread.sleep(1000);
*/
		ApplyFilter();
/*
		Thread.sleep(2000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Formed ligneous body, and method of producing the same";
		Assert.assertEquals(validate.getText(), actualText);
*/
		Thread.sleep(2000);

		GoToHomePage();

//		Click_Doesnt_Contain();
	}

	@Test
	public void Click_Doesnt_Contain() throws Exception {
		Thread.sleep(1000);

		CommonSearchTerm();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement ClickonTACD = GetDriver().findElement(By.xpath("//span[@title='FullText']"));
		js.executeScript("arguments[0].click();", ClickonTACD);

		Thread.sleep(1000);
		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement ClickonDoesnt = GetDriver().findElement(By.xpath("//*[@id='divDate_TACD']/div[2]/label/input"));
		js1.executeScript("arguments[0].click();", ClickonDoesnt);

		Thread.sleep(1000);

		WebElement EnterText = GetDriver().findElement(By.xpath("//*[@id='divDate_TACD']/div[2]/div/div/input"));
		EnterText.sendKeys("WOOD MOLDING AND MANUFACTURING METHOD THEREOF");

		Thread.sleep(1000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: US5801151A  ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(2000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Estimation of ovular fiber production in cotton";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();

	}

	@Test
	public void PARTIES_CurrentOwner() throws Exception {
		Thread.sleep(1000);

		CommonSearchTerm();

		Thread.sleep(1000);

		MainFilter();

		WebElement ClickonAttorney = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='PASN']//child::span[1]"));
		Actions actions = new Actions(GetDriver());
		actions.moveToElement(ClickonAttorney).click().build().perform();

		Thread.sleep(1000);

		WebElement SelectFirstOption = GetDriver().findElement(By.xpath("//input[@value='BRISTOL MYERS SQUIBB CO']"));
		SelectFirstOption.click();

		Thread.sleep(1000);

		SearchWithin();

		WebElement SearchNumber = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNumber.sendKeys("PNC: WO2014039429A1 ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(1000);

		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "METHODS OF TISSUE GENERATION";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();

	}

	@Test
	public void CPCFull() throws Exception {
		Thread.sleep(1000);

		CommonSearchTerm();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_CPCFull = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='CPC']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_CPCFull);

		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_ClassSugg = GetDriver().findElement(By.xpath("//input[@value='C07K14/415']"));
		js1.executeScript("arguments[0].click();", Select_ClassSugg);

		Thread.sleep(1000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: ZA200506653B  ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(2000);

		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Genes controlling plant cell wall formation";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
	}

	@Test
	public void SimpleFamilyFilter() throws Exception {
		Thread.sleep(1000);

		CommonSearchTerm();

		Thread.sleep(1000);

		MainFilter();

		Thread.sleep(500);

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_ICSectionClass = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='FAMID']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_ICSectionClass);

		Thread.sleep(500);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_ClassSugg = GetDriver().findElement(By.xpath("//input[@value='39739089']"));
		js1.executeScript("arguments[0].click();", Select_ClassSugg);

		Thread.sleep(1000);

		// search within
		SearchWithin();

		Thread.sleep(500);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: US8309347B2  ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(1000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Cell expansion system and methods of use";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(2000);

		GoToHomePage();
	}

	@Test
	public void TAC$Filter() throws Exception {
		Thread.sleep(1000);

		CommonSearchTerm();

		Thread.sleep(1000);

		MainFilter();

		Thread.sleep(500);

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_TAC$ = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='TAC_D']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_TAC$);

		Thread.sleep(1000);

		WebElement EnterText = GetDriver().findElement(By.xpath("//*[@id='divDate_TAC_D']/div[1]/div/div/input"));
		EnterText.sendKeys("Manufacturing method of Sendan extract");

		Thread.sleep(1000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: JP5628639B2 ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(2000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Manufacturing method of Sendan extract";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(2000);

		GoToHomePage();

		Click_Doesnt_Contain_TAC$();
	}

	@Test
	public void Click_Doesnt_Contain_TAC$() throws Exception {
		Thread.sleep(1000);

		CommonSearchTerm();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_TAC$ = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='TAC_D']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_TAC$);

		Thread.sleep(1000);
		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement ClickonDoesnt = GetDriver().findElement(By.xpath("//*[@id='divDate_TAC_D']/div[2]/label/input"));
		js1.executeScript("arguments[0].click();", ClickonDoesnt);

		Thread.sleep(1000);

		WebElement EnterText = GetDriver().findElement(By.xpath("//*[@id='divDate_TAC_D']/div[2]/div/div/input"));
		EnterText.sendKeys("Hollow fiber cell propagation");

		Thread.sleep(1000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC:  JP5628639B2 ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(2000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Manufacturing method of Sendan extract";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();

	}

	@Test
	public void PublicationCountry() throws Exception {
		Thread.sleep(1000);

		CommonSearchTerm();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_CPCFull = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='PBC']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_CPCFull);

		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_ClassSugg = GetDriver().findElement(By.xpath("//input[@value='EP']"));
		js1.executeScript("arguments[0].click();", Select_ClassSugg);

		Thread.sleep(1000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: EP2129764B1  ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(2000);

		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "CELL EXPANSION SYSTEM AND METHODS OF USE";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
	}

	@Test
	public void PASNSubsidiaries() throws Exception {
		Thread.sleep(1000);

		CommonSearchTerm();

		Thread.sleep(1000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: ZA201702208B ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_View = GetDriver().findElement(By.xpath("//*[@id='views']/div[2]/div[3]"));
		js.executeScript("arguments[0].click();", Clickon_View);

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 90);
		wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'BAYER AG')]")))
				.click();

		WebDriverWait wait2 = new WebDriverWait(GetDriver(), 90);
		wait2.until(ExpectedConditions
				.presenceOfAllElementsLocatedBy(By.xpath("//span[@id='PASN_ZA201702208B_BAYERAG_0']")));

		WebElement ClickonAC = GetDriver().findElement(By.xpath("//span[@id='grp_0_ABC']"));
		ClickonAC.click();

		Thread.sleep(500);

		// verify subsidiary
		WebDriverWait wait3 = new WebDriverWait(GetDriver(), 90);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'AB SEEDS LTD')]")));
		WebElement validate = GetDriver().findElement(By.xpath("//div[contains(text(),'AB SEEDS LTD')]"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "AB SEEDS LTD";
		Assert.assertEquals(validate.getText(), actualText);

		// snapshot
		// TakesScreenshot scrShot =((TakesScreenshot)GetDriver());
		// File src=
		// ((TakesScreenshot)GetDriver()).getScreenshotAs(OutputType.FILE);
		// scrShot.copyFile(src,new File("D:\\snapshots\\subsidary.png"));

		Thread.sleep(1000);

		GoToHomePage();
	}

	@Test
	public void Check_Registerlinks_Tooltip() throws Exception {
		Thread.sleep(1000);

		SelectNumberSearch();

		Thread.sleep(1000);

		WebElement input = GetDriver().findElement(By.xpath("//textarea[@id='txtManual_0_0']"));
		input.sendKeys(" WO9952873A1 ");

		Thread.sleep(500);

		WebElement lookup = GetDriver().findElement(By.xpath("//div[@id='divAddButton_0_0']"));
		lookup.click();

		System.out.println("clicked on lookup");

		Thread.sleep(3000);

		// Select view
		WebElement ele = GetDriver().findElement(By.xpath("//div[@id='views']"));
		Actions action = new Actions(GetDriver());
		action.moveToElement(ele).build().perform();

		Thread.sleep(200);

		WebElement Select_STDFam = GetDriver().findElement(By.xpath("//*[@id='views']/div[2]/div[5]"));
		Select_STDFam.click();

		Thread.sleep(2000);

		// to check tooltip
		String expectedTooltip = "Granted EP number in Bulletin";

		WebElement getTooltip = GetDriver().findElement(By.id("divFamilyView_DE69926704D1"));

		String actualTooltip = getTooltip.getAttribute("title");

		System.out.println("Actual Tool Tip is : " + actualTooltip);

		if (actualTooltip.equals(expectedTooltip)) {
			System.out.println("Test Case Passed");
		}

		Thread.sleep(2000);

/*
		WebElement ClickonRegister = GetDriver().findElement(By.xpath("//*[@id='divItemTeplate']/div/div[1]/div[7]"));
		ClickonRegister.click();

		Thread.sleep(2000);

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
		WebElement ClickonEPWebsite = GetDriver()
				.findElement(By.xpath("//a[contains(text(),'EP0993447 - A PROCESS FOR THE PREPARATION OF AMLOD')]"));
		js2.executeScript("arguments[0].click();", ClickonEPWebsite);
		System.out.println("clicked on Click on EPWebsite");

		Thread.sleep(5000);

		// verify subsidiary
		WebDriverWait wait3 = new WebDriverWait(GetDriver(), 90);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'EP0993447 - A PROCESS FOR THE PREPARATION OF AMLOD')]")));
		WebElement validate = GetDriver().findElement(By.xpath("//a[contains(text(),'EP0993447 - A PROCESS FOR THE PREPARATION OF AMLOD')]"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "EP0993447 - A PROCESS FOR THE PREPARATION OF AMLODIPINE BENZENESULPHONATE";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);
		
		GetDriver().close();
		
		// change focus back to old tab
		GetDriver().switchTo().window(oldTab);
		System.out.println("tab 1");
*/
		GoToHomePage();

	}

}
