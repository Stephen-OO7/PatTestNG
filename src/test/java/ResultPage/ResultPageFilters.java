package ResultPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Login.BaseTest;

public class ResultPageFilters extends BaseTest

{
	@Test
	public void Search_For_LOC() throws Exception {
		
		Thread.sleep(1000);

		QuickSearch();

		Thread.sleep(1000);

		// clear
		WebElement clear1 = GetDriver().findElement(
				By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		clear1.click();
		System.out.println("clicked on clear option");

		Thread.sleep(1000);

		WebElement ClickonTAC = GetDriver().findElement(By.xpath("//div[@id='main_0']"));
		ClickonTAC.click();

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		GetDriver().findElement(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")).clear();

		wait1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")))
				.sendKeys(" LOC ");

		Thread.sleep(300);

		wait1.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("//div[@id='main_0']//span[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Locarno Class (LOC)')]")))
				.click();

		Thread.sleep(500);
		
		WebElement pasn = GetDriver().findElement(By.xpath("//input[@id='textDefault_0']"));
		pasn.sendKeys(" 1216 ");

		Thread.sleep(1000);

		GetCountSearch_QS();

	}

	// @Test
	// public void CommonSearch_WF() throws Exception
	// {
	// QuickSearch();
	//
	// Thread.sleep(500);
	//
	// //clear
	// WebElement clear1=
	// GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1
	// btn btn-link patseer_Secondary_ButtonFix']"));
	// clear1.click();
	// System.out.println("clicked on clear option");
	//
	// Thread.sleep(500);
	//
	// WebElement ClickonTAC=
	// GetDriver().findElement(By.xpath("//div[@id='main_0']"));
	// ClickonTAC.click();
	//
	// WebDriverWait wait1= new WebDriverWait(GetDriver(),30);
	// GetDriver().findElement(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")).clear();
	//
	// wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]"))).sendKeys("TAC");
	//
	// wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='main_0']//span[@class='col-xs-12
	// col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Title,
	// Abstract, Claims (TAC)')]"))).click();
	//
	// WebElement EnterText=
	// GetDriver().findElement(By.xpath("//textarea[@id='txtPatApp_0']"));
	// EnterText.sendKeys(" fiber optics");
	//
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
	//
	// //on result page
	// GetDriver().manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
	//
	// //change URL
	// GetDriver().getCurrentUrl();
	//
	// GetDriver().get("https://192.168.1.246/SearchWF#/command/Result");
	//
	// }

	@Test
	public void AliveDeadFilter() throws Exception {
		Thread.sleep(1000);

		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Alive = GetDriver().findElement(By.xpath("//button[@id='btnAlive']"));
		js.executeScript("arguments[0].click();", Alive);

		Thread.sleep(2000);

		// search within
		SearchWithin();

		Thread.sleep(2000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: AU2001285170A1 ");

		Thread.sleep(3000);

		ApplyFilter();

		Thread.sleep(5000);

		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Methods for diagnosing a neurodegenerative condition";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(2000);

		GoToHomePage();

		Thread.sleep(1000);
	}

	@Test
	public void SearchinFilter() throws Exception {
		Thread.sleep(1000);

		CommonSearch_WF();

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
				.findElement(By.xpath("//span[contains(@class,'filter_SearchBtn fl_clustBorder')]"));
		ClickonSearch.click();

		Thread.sleep(1000);

		WebElement Selectoption = GetDriver()
				.findElement(By.xpath("//*[@id='filter_PTYP_3']/filtercheckbox/div[1]/div/div/div/div[1]/input"));
		Selectoption.click();

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(2000);

		// validation
		// validation using assert
		// WebElement
		// validate=GetDriver().findElement(By.xpath("//label[contains(text(),'Recombinant
		// promoter with increased specific expre')]"));
		// System.out.println("s1 : "+validate.getText());
		//
		// String actualText="Recombinant promoter with increased specific
		// expression of fibers";
		// Assert.assertEquals(validate.getText(), actualText);
		// Thread.sleep(500);

		// Thread.sleep(2000);

		GoToHomePage();

		Thread.sleep(1000);

	}

	@Test
	public void IsOpposedFilter() throws Exception {
		Thread.sleep(1000);

		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();
		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement ClickonISOpposed = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='ISOP']//child::span[1]"));
		js.executeScript("arguments[0].click();", ClickonISOpposed);

		Thread.sleep(500);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement SelectUS = GetDriver().findElement(By.xpath("//input[@value='KR']"));
		js1.executeScript("arguments[0].click();", SelectUS);

		Thread.sleep(2000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: KR101044561B1 ");

		Thread.sleep(3000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Anode material and battery using the same";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(2000);

		GoToHomePage();

		Thread.sleep(1000);

	}

	@Test
	public void IsLitigateFilter() throws Exception {
		Thread.sleep(1000);

		CommonSearch_WF();

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
		SearchNo.sendKeys("   PNC: US6015612A ");

		Thread.sleep(5000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Polymer wood composite";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(2000);

		GoToHomePage();

		Thread.sleep(1000);

	}

	@Test
	public void DownloadinCSV() throws Exception {
		Thread.sleep(1000);

		CommonSearch_WF();

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

		Thread.sleep(2000);

		GoToHomePage();

		Thread.sleep(1000);

	}

	@Test
	public void DownloadClassDef() throws Exception {
		CommonSearch_WF();

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
	public void RecordTypeFilter() throws Exception {
		Thread.sleep(1000);

		CommonSearch_WF();

		Thread.sleep(2000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_RecordType = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='PTYP']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_RecordType);

		System.out.println("clicked on record type");

		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_Patent = GetDriver().findElement(By.xpath("//input[@value='PATENT']"));
		js1.executeScript("arguments[0].click();", Select_Patent);

		System.out.println("checked suggestion of ptyp");
		Thread.sleep(200);

		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: US10534134B2  ");

		Thread.sleep(3000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Fluid-filled hollow optical fiber cell";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();

		Thread.sleep(1000);
	}

	@Test
	public void AssigneeFilter() throws Exception {
		Thread.sleep(2000);

		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_Assignee = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='ASNN']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_Assignee);

		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement SelectAssignee = GetDriver().findElement(By.xpath("//input[@value='BAYER CROPSCIENCE NV']"));
		js1.executeScript("arguments[0].click();", SelectAssignee);

		Thread.sleep(2000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: EP2661498A1  ");

		Thread.sleep(3000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "FIBER SELECTIVE PROMOTERS";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();

		Thread.sleep(1000);
	}

	@Test
	public void CurrentAssigneeFilter() throws Exception {
		Thread.sleep(1000);

		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_CurrentASN = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='CASN']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_CurrentASN);

		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement SelectCurrentASN = GetDriver().findElement(By.xpath("//input[@value='BAYER CROPSCIENCE NV']"));
		js1.executeScript("arguments[0].click();", SelectCurrentASN);

		Thread.sleep(200);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC:  EP2661498A1 ");

		Thread.sleep(3000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "FIBER SELECTIVE PROMOTERS";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();

		Thread.sleep(1000);

	}

	@Test
	public void CurrentOwnerFilter() throws Exception {
		Thread.sleep(1000);

		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_CurrentOwner = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='PASN']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_CurrentOwner);

		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement SelectCurrentOwner = GetDriver().findElement(By.xpath("//input[@value='BAYER AG']"));
		js1.executeScript("arguments[0].click();", SelectCurrentOwner);

		Thread.sleep(1000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: CN107075527A  ");

		Thread.sleep(3000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Recombinant promoter with increased fiber-specific expression";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();

		Thread.sleep(1000);

	}

	@Test
	public void SearchWithinFilter() throws Exception {

		Thread.sleep(1000);

		CommonSearch_WF();

		Thread.sleep(1000);
		MainFilter();

		// search within
		SearchWithin();

		Thread.sleep(10000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: US10604893B2 ");

		Thread.sleep(3000);

		ApplyFilter();

		Thread.sleep(5000);

		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Method for producing fibrillated cellulose";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();

		Thread.sleep(1000);
	}

	@Test
	public void QueryBuilder() throws Exception {

		Thread.sleep(1000);

		CommonSearch_WF();

		Thread.sleep(1000);
		MainFilter();

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement ClickonQueryBuilder = GetDriver().findElement(By.xpath("//*[@id='querybuilderbtn']"));
		ClickonQueryBuilder.click();

		Thread.sleep(1000);

		// search in query builder
		WebElement EnterText = GetDriver().findElement(By.xpath("//*[@id='txtPatApp_0']"));
		EnterText.sendKeys("  LIGHT RELEASE BASE PAPER ");

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
		EnterPNC.sendKeys(" DE102018118271A1 ");

		Thread.sleep(1000);

		WebElement AddQuery = GetDriver().findElement(By.xpath("//*[@id='quickSearchPanelID']/div[2]/span"));
		AddQuery.click();

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(3000);

		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "LIGHT RELEASE BASE PAPER";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();

		Thread.sleep(1000);
	}

	@Test
	public void TopicFilter() throws Exception {

		Thread.sleep(1000);

		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement ClickonTopicFilter = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='TACD']//child::span[1]"));
		js.executeScript("arguments[0].click();", ClickonTopicFilter);

		Thread.sleep(4000);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement SelectTopicOption = GetDriver().findElement(By.xpath("//*[@id='topicstree']/ul/li[2]/span/span[2]"));
		js1.executeScript("arguments[0].click();", SelectTopicOption);

		Thread.sleep(2000);

		// search within
		JavascriptExecutor js3 = (JavascriptExecutor) GetDriver();
		WebElement ClickonSearchWithin = GetDriver()
				.findElement(By.xpath("//*[@id='filterContainer']/div[3]/filteritems/div[1]"));
		js3.executeScript("arguments[0].click();", ClickonSearchWithin);

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: US10544423B2   ");

		Thread.sleep(3000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Recombinant promoter with increased fiber-specific expression";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();

		Thread.sleep(1000);

	}

	@Test
	public void InventorsFilter() throws Exception {

		Thread.sleep(1000);

		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_Inventors = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='INV']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_Inventors);

		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_Inventors = GetDriver().findElement(By.xpath("//input[@value='WANG JIALUN']"));
		js1.executeScript("arguments[0].click();", Select_Inventors);

		Thread.sleep(2000);

		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: AU2015217406A1  ");

		Thread.sleep(3000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Micro-organoids, and methods of making and using the same";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();

		Thread.sleep(1000);
	}

	@Test
	public void LOCFilter() throws Exception {

		Thread.sleep(1000);

		Search_For_LOC();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_LOC = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='LOC']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_LOC);

		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_LOC = GetDriver().findElement(By.xpath("//input[@value='1216']"));
		js1.executeScript("arguments[0].click();", Select_LOC);

		Thread.sleep(2000);

		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: USD867228S  ");

		Thread.sleep(3000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Hitch ball mount";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();

		Thread.sleep(1000);
	}

	@Test
	public void IPCSectionClass() throws Exception {

		Thread.sleep(1000);

		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_IPCSectionClass = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='ICC']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_IPCSectionClass);

		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_ClassSugg = GetDriver().findElement(By.xpath("//input[@value='C12']"));
		js1.executeScript("arguments[0].click();", Select_ClassSugg);

		Thread.sleep(2000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: US5126238A  ");

		Thread.sleep(3000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Hollow fiber cell propagation system and method";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();

		Thread.sleep(1000);

	}

	@Test
	public void ICMainClass() throws Exception {

		Thread.sleep(1000);

		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_ICSectionClass = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='ICSC']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_ICSectionClass);

		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_ClassSugg = GetDriver().findElement(By.xpath("//input[@value='C12N']"));
		js1.executeScript("arguments[0].click();", Select_ClassSugg);

		Thread.sleep(2000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: ZA9605572B ");

		Thread.sleep(3000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Cotton fiber transcriptional factors";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();

		Thread.sleep(1000);
	}

	@Test
	public void UCMainClass() throws Exception {

		Thread.sleep(1000);

		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_ICSectionClass = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='UCMN']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_ICSectionClass);

		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_ClassSugg = GetDriver().findElement(By.xpath("//input[@value='800']"));
		js1.executeScript("arguments[0].click();", Select_ClassSugg);

		Thread.sleep(2000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: US2003106089A1 ");

		Thread.sleep(3000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Cotton fiber transcriptional factors";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();

		Thread.sleep(1000);

	}

	@Test
	public void UCClass() throws Exception {
		
		Thread.sleep(1000);
		
		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_ICSectionClass = GetDriver()
				.findElement(By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='UC']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_ICSectionClass);

		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_ClassSugg = GetDriver().findElement(By.xpath("//input[@value='800/314']"));
		js1.executeScript("arguments[0].click();", Select_ClassSugg);

		Thread.sleep(2000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: US9243260B2 ");

		Thread.sleep(3000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Fiber selective promoters";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
		
		Thread.sleep(1000);
	}

	@Test
	public void CPCMainGroups() throws Exception {
		
		Thread.sleep(1000);
		
		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_ICSectionClass = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='CPCG']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_ICSectionClass);

		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_ClassSugg = GetDriver().findElement(By.xpath("//input[@value='C12N15']"));
		js1.executeScript("arguments[0].click();", Select_ClassSugg);

		Thread.sleep(2000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC:  CA2221747A1 ");

		Thread.sleep(3000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "COTTON FIBER TRANSCRIPTIONAL FACTORS";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
		
		Thread.sleep(1000);
	}

	@Test
	public void CPCSubGroups() throws Exception {
		
		Thread.sleep(1000);
		
		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_CPCSubClass = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='CPC']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_CPCSubClass);

		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_ClassSugg = GetDriver().findElement(By.xpath("//input[@value='Y02A40/146']"));
		js1.executeScript("arguments[0].click();", Select_ClassSugg);

		Thread.sleep(2000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: EP0835311A2 ");

		Thread.sleep(3000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "COTTON FIBER TRANSCRIPTIONAL FACTORS";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
		
		Thread.sleep(1000);
	}

	@Test
	public void PBNCountry() throws Exception {
		
		Thread.sleep(1000);
		
		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_PBNCountry = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='PBC']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_PBNCountry);

		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_PBNCountrySugg = GetDriver().findElement(By.xpath("//input[@value='WO']"));
		js1.executeScript("arguments[0].click();", Select_PBNCountrySugg);

		Thread.sleep(2000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: WO9640924A3  ");

		Thread.sleep(3000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "COTTON FIBER TRANSCRIPTIONAL FACTORS";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
		
		Thread.sleep(1000);
	}

	@Test
	public void PRCCountry() throws Exception {
		Thread.sleep(1000);
		
		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_PRCCountry = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='PRC']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_PRCCountry);

		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_PRCCountrySugg = GetDriver().findElement(By.xpath("//input[@value='US']"));
		js1.executeScript("arguments[0].click();", Select_PRCCountrySugg);

		Thread.sleep(2000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: US10534134B2  ");

		Thread.sleep(3000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Fluid-filled hollow optical fiber cell";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
		
		Thread.sleep(1000);
		
	}

	@Test
	public void LSCFilter() throws Exception {
		
		Thread.sleep(1000);
		
		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_ICSectionClass = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='LSC']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_ICSectionClass);

		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_ClassSugg = GetDriver().findElement(By.xpath("//input[@value='ACTIVE - APPLIED']"));
		js1.executeScript("arguments[0].click();", Select_ClassSugg);

		Thread.sleep(2000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: CN107084984A  ");

		Thread.sleep(3000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Image measuring method for muscle fiber cell parameters";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
		
		Thread.sleep(1000);
	}

	@Test
	public void REGSTFilter() throws Exception {
		
		Thread.sleep(1000);
		
		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_REGST = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='REGST']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_REGST);

		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_REGSTSugg = GetDriver().findElement(
				By.xpath("//input[@value='Patent Expired Due to NonPayment of Maintenance Fees Under 37 CFR 1362']"));
		js1.executeScript("arguments[0].click();", Select_REGSTSugg);

		Thread.sleep(2000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: US2005044591A1 ");

		Thread.sleep(3000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Plant cell cycle genes and methods of use";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
		
		Thread.sleep(1000);
	}

	@Test
	public void LSSEFilter() throws Exception {
		
		Thread.sleep(1000);
		
		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_LSSE = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='LSSE']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_LSSE);

		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_LSSESugg = GetDriver().findElement(By.xpath("//input[@value='ACTIVE IN DESIGNATED STATE']"));
		js1.executeScript("arguments[0].click();", Select_LSSESugg);

		Thread.sleep(2000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC:   WO2020037743A1   ");

		Thread.sleep(3000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "METHOD FOR PREPARING WOOL KERATIN CORTEX CELLS AND USE THEREOF";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
		
		Thread.sleep(1000);
	}

	@Test
	public void Attorney() throws Exception {
		
		Thread.sleep(1000);
		
		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_ATN = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='ATN']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_ATN);

		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_ATNSugg = GetDriver().findElement(By.xpath("//input[@value='SPRUSON & FERGUSON']"));
		js1.executeScript("arguments[0].click();", Select_ATNSugg);

		Thread.sleep(2000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: AU3019800A  ");

		Thread.sleep(3000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Cotton fiber transcriptional factors";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
		
		Thread.sleep(1000);
	}

	@Test
	public void ASNNT() throws Exception {
		
		Thread.sleep(1000);

		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_ASNNT = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='ASNNT']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_ASNNT);

		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_ASNNTSugg = GetDriver().findElement(By.xpath("//input[@value='UNIV']"));
		js1.executeScript("arguments[0].click();", Select_ASNNTSugg);

		Thread.sleep(2000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: CN109591136A   ");

		Thread.sleep(3000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Preparation method of nano-silver antibacterial wood composite material";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
		
		Thread.sleep(1000);
	}

	@Test
	public void ApplDateFilter() throws Exception {
		
		Thread.sleep(1000);
		
		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_ICSectionClass = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='APD']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_ICSectionClass);

		Thread.sleep(2000);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		GetDriver().findElement(By.id("txtFrom_APD")).clear();
		WebElement FromAPD = GetDriver().findElement(By.id("txtFrom_APD"));
		js1.executeScript("arguments[0].click();", FromAPD);
		FromAPD.clear();
		FromAPD.sendKeys(" 2010 ");

		Thread.sleep(500);

		JavascriptExecutor js2 = (JavascriptExecutor) GetDriver();
		GetDriver().findElement(By.id("txtTo_APD")).clear();
		WebElement ToAPD = GetDriver().findElement(By.id("txtTo_APD"));
		js2.executeScript("arguments[0].click();", ToAPD);
		ToAPD.clear();
		ToAPD.sendKeys(" 2020 ");

		Thread.sleep(200);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: WO2017160986A1   ");

		Thread.sleep(3000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "MESENCHYMAL STEM CELLS WITH ENHANCED EFFICACY";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
	}

	@Test
	public void PubDateFilter() throws Exception {
		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_ICSectionClass = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='PBD']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_ICSectionClass);

		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		GetDriver().findElement(By.id("txtFrom_PBD")).clear();
		WebElement FromPBD = GetDriver().findElement(By.id("txtFrom_PBD"));
		js1.executeScript("arguments[0].click();", FromPBD);
		FromPBD.clear();
		FromPBD.sendKeys("  2010  ");

		Thread.sleep(200);

		JavascriptExecutor js2 = (JavascriptExecutor) GetDriver();
		GetDriver().findElement(By.id("txtTo_PBD")).clear();
		WebElement ToPBD = GetDriver().findElement(By.id("txtTo_PBD"));
		js2.executeScript("arguments[0].click();", ToPBD);
		ToPBD.clear();
		ToPBD.sendKeys("  2020  ");

		Thread.sleep(200);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: DE102018118271A1    ");

		Thread.sleep(5000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "LIGHT RELEASE BASE PAPER";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
	}

	@Test
	public void EPRDFilter() throws Exception {
		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_ICSectionClass = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='EPRD']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_ICSectionClass);

		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		GetDriver().findElement(By.id("txtFrom_EPRD")).clear();
		WebElement FromEPRD = GetDriver().findElement(By.id("txtFrom_EPRD"));
		js1.executeScript("arguments[0].click();", FromEPRD);
		FromEPRD.clear();
		FromEPRD.sendKeys("  2010 ");

		Thread.sleep(200);

		JavascriptExecutor js2 = (JavascriptExecutor) GetDriver();
		GetDriver().findElement(By.id("txtTo_EPRD")).clear();
		WebElement ToEPRD = GetDriver().findElement(By.id("txtTo_EPRD"));
		js2.executeScript("arguments[0].click();", ToEPRD);
		ToEPRD.clear();
		ToEPRD.sendKeys("  2020 ");

		Thread.sleep(200);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC:  DE102018118271A1 ");

		Thread.sleep(5000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "LIGHT RELEASE BASE PAPER";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
	}

	@Test
	public void EPBDFilter() throws Exception {
		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_EPBDClass = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='EPBD']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_EPBDClass);

		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		GetDriver().findElement(By.id("txtFrom_EPBD")).clear();
		WebElement FromEPBD = GetDriver().findElement(By.id("txtFrom_EPBD"));
		js1.executeScript("arguments[0].click();", FromEPBD);
		FromEPBD.clear();
		FromEPBD.sendKeys("  2008  ");

		Thread.sleep(200);

		JavascriptExecutor js2 = (JavascriptExecutor) GetDriver();
		GetDriver().findElement(By.id("txtTo_EPBD")).clear();
		WebElement ToEPBD = GetDriver().findElement(By.id("txtTo_EPBD"));
		js2.executeScript("arguments[0].click();", ToEPBD);
		ToEPBD.clear();
		ToEPBD.sendKeys("  2020  ");

		Thread.sleep(200);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC:  DE102018118271A1  ");

		Thread.sleep(5000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "LIGHT RELEASE BASE PAPER";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
	}

	@Test
	public void Region() throws Exception {
		
		Thread.sleep(1000);
		
		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_REG = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='REG']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_REG);

		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_REGSugg = GetDriver().findElement(By.xpath("//input[@value='ASIA']"));
		js1.executeScript("arguments[0].click();", Select_REGSugg);

		Thread.sleep(2000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: CN110137792A ");

		Thread.sleep(3000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Multi-core fiber-cell laser with stretching function";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
		
		Thread.sleep(1000);

	}

	@Test
	public void Industry() throws Exception {
		
		Thread.sleep(1000);

		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_Industry = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='INDY']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_Industry);

		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_IndustrySugg = GetDriver().findElement(By.xpath("//input[@value='FOOD PRODUCTS']"));
		js1.executeScript("arguments[0].click();", Select_IndustrySugg);

		Thread.sleep(2000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: ZA9605572B ");

		Thread.sleep(3000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Cotton fiber transcriptional factors";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
		
		Thread.sleep(1000);
	}

	@Test
	public void TechDomain() throws Exception {
		
		Thread.sleep(1000);
		
		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_DOM = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='DOM']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_DOM);

		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_DOMSugg = GetDriver().findElement(By.xpath("//input[@value='MECHANICAL ENGINEERING']"));
		js1.executeScript("arguments[0].click();", Select_DOMSugg);

		Thread.sleep(2000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: DE102018118271A1 ");

		Thread.sleep(3000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "LIGHT RELEASE BASE PAPER";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
		
		Thread.sleep(1000);
	}

	@Test
	public void TechSubDomain() throws Exception {

		Thread.sleep(1000);
		
		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_SDOM = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='SDOM']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_SDOM);

		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_SDOMSugg = GetDriver().findElement(By.xpath("//input[@value='MEDICAL TECHNOLOGY']"));
		js1.executeScript("arguments[0].click();", Select_SDOMSugg);

		Thread.sleep(2000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: CN110520140A  ");

		Thread.sleep(3000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Stimulation of angiogenesis by fibroblast derived exosomes";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();

		Thread.sleep(1000);
	}

	@Test
	public void SFAMAllCountries() throws Exception {
		
		Thread.sleep(1000);
		
		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_ICSectionClass = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='FAMC']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_ICSectionClass);

		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_ClassSugg = GetDriver().findElement(By.xpath("//input[@value='EP']"));
		js1.executeScript("arguments[0].click();", Select_ClassSugg);

		Thread.sleep(2000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: US10544423B2   ");

		Thread.sleep(3000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Recombinant promoter with increased fiber-specific expression";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
		
		Thread.sleep(1000);
	}

	@Test
	public void CASN_IS() throws Exception {
		
		Thread.sleep(1000);

		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_CurrentASN = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='CASN']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_CurrentASN);

		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement SelectCurrentASN = GetDriver().findElement(By.xpath("//input[@value='BAYER CROPSCIENCE NV']"));
		js1.executeScript("arguments[0].click();", SelectCurrentASN);

		Thread.sleep(2000);

		// for selection of IS option

		WebElement ClickonIS = GetDriver()
				.findElement(By.xpath("//*[@id='filterContainer']/div[6]/filteritems/div[1]/div/select"));
		ClickonIS.click();

		WebElement SelectIS = GetDriver()
				.findElement(By.xpath("//*[@id='filterContainer']/div[6]/filteritems/div[1]/div/select/option[1]"));
		SelectIS.click();
		
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC:  EP2661498A1 ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "FIBER SELECTIVE PROMOTERS";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
		
		Thread.sleep(1000);

	}

	@Test
	public void PASN_ISNOT() throws Exception {
		
		Thread.sleep(1000);
		
		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		// for selection of IS option

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_Assignee = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='PASN']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_Assignee);

		Thread.sleep(1000);

		WebElement ClickonIS = GetDriver()
				.findElement(By.xpath("//*[@id='filterContainer']/div[7]/filteritems/div[1]/div/select"));
		ClickonIS.click();

		WebElement SelectISNOT = GetDriver()
				.findElement(By.xpath("//*[@id='filterContainer']/div[7]/filteritems/div[1]/div/select/option[2]"));
		SelectISNOT.click();

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement SelectAssignee = GetDriver().findElement(By.xpath("//input[@value='CELGENE CORP']"));
		js1.executeScript("arguments[0].click();", SelectAssignee);

		Thread.sleep(2000);

		ApplyFilter();

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: DE102018118271A1   ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "LIGHT RELEASE BASE PAPER";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
	}

	@Test
	public void UCMain_IS() throws Exception {
		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_ICSectionClass = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='UCMN']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_ICSectionClass);

		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_ClassSugg = GetDriver().findElement(By.xpath("//input[@value='800']"));
		js1.executeScript("arguments[0].click();", Select_ClassSugg);

		Thread.sleep(200);

		// for selection of IS option

		WebElement ClickonIS = GetDriver()
				.findElement(By.xpath("//*[@id='filterContainer']/div[18]/filteritems/div[1]/div/select"));
		ClickonIS.click();

		WebElement SelectIS = GetDriver()
				.findElement(By.xpath("//*[@id='filterContainer']/div[18]/filteritems/div[1]/div/select/option[1]"));
		SelectIS.click();

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC:  US2013276170A1  ");

		Thread.sleep(5000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "FIBER SELECTIVE PROMOTERS";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
	}

	@Test
	public void CPCSub_ISNOT() throws Exception {
		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		// for selection of IS option

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_CPCSubClass = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='CPC']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_CPCSubClass);

		WebElement ClickonIS = GetDriver()
				.findElement(By.xpath("//*[@id='filterContainer']/div[21]/filteritems/div[1]/div/select"));
		ClickonIS.click();

		WebElement SelectISNOT = GetDriver()
				.findElement(By.xpath("//*[@id='filterContainer']/div[21]/filteritems/div[1]/div/select/option[2]"));
		SelectISNOT.click();

		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_ClassSugg = GetDriver().findElement(By.xpath("//input[@value='C12N15/8261']"));
		js1.executeScript("arguments[0].click();", Select_ClassSugg);

		Thread.sleep(200);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: AU658822B2  ");

		Thread.sleep(5000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Hollow fiber cell propagation";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
	}

	@Test
	public void PubDate_ISNOT() throws Exception {
		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_PBD = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='PBD']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_PBD);

		Thread.sleep(1000);

		WebElement ClickonIS = GetDriver()
				.findElement(By.xpath("//*[@id='filterContainer']/div[10]/filteritems/div[1]/div/select"));
		ClickonIS.click();
		WebElement SelectISNOT = GetDriver()
				.findElement(By.xpath("//*[@id='filterContainer']/div[10]/filteritems/div[1]/div/select/option[2]"));
		SelectISNOT.click();

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		GetDriver().findElement(By.id("txtFrom_PBD")).clear();
		WebElement FromPBD = GetDriver().findElement(By.id("txtFrom_PBD"));
		js1.executeScript("arguments[0].click();", FromPBD);
		FromPBD.clear();
		FromPBD.sendKeys("  2010  ");

		Thread.sleep(200);

		JavascriptExecutor js2 = (JavascriptExecutor) GetDriver();
		GetDriver().findElement(By.id("txtTo_PBD")).clear();
		WebElement ToPBD = GetDriver().findElement(By.id("txtTo_PBD"));
		js2.executeScript("arguments[0].click();", ToPBD);
		ToPBD.clear();
		ToPBD.sendKeys("  2020  ");

		Thread.sleep(200);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: EP2129764A2  ");

		Thread.sleep(5000);

		ApplyFilter();

		Thread.sleep(5000);
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
	public void EPBD_IS() throws Exception {
		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_EPBDClass = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='EPBD']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_EPBDClass);

		Thread.sleep(1000);

		WebElement ClickonIS = GetDriver()
				.findElement(By.xpath("//*[@id='filterContainer']/div[12]/filteritems/div[1]/div/select"));
		ClickonIS.click();
		WebElement SelectIS = GetDriver()
				.findElement(By.xpath("//*[@id='filterContainer']/div[12]/filteritems/div[1]/div/select/option[1]"));
		SelectIS.click();

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		GetDriver().findElement(By.id("txtFrom_EPBD")).clear();
		WebElement FromEPBD = GetDriver().findElement(By.id("txtFrom_EPBD"));
		js1.executeScript("arguments[0].click();", FromEPBD);
		FromEPBD.clear();
		FromEPBD.sendKeys("  2008 ");

		Thread.sleep(200);

		JavascriptExecutor js2 = (JavascriptExecutor) GetDriver();
		GetDriver().findElement(By.id("txtTo_EPBD")).clear();
		WebElement ToEPBD = GetDriver().findElement(By.id("txtTo_EPBD"));
		js2.executeScript("arguments[0].click();", ToEPBD);
		ToEPBD.clear();
		ToEPBD.sendKeys("  2020  ");

		Thread.sleep(200);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC:  WO2017011050A2  ");

		Thread.sleep(5000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "BILAYERED DEVICES FOR ENHANCED HEALING";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
	}

	@Test
	public void SDOM_ISNOT() throws Exception {
		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_ICSectionClass = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='SDOM']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_ICSectionClass);

		Thread.sleep(1000);

		WebElement ClickonIS = GetDriver()
				.findElement(By.xpath("//*[@id='filterContainer']/div[32]/filteritems/div[1]/div/select"));
		ClickonIS.click();

		WebElement SelectISNOT = GetDriver()
				.findElement(By.xpath("//*[@id='filterContainer']/div[32]/filteritems/div[1]/div/select/option[2]"));
		SelectISNOT.click();

		Thread.sleep(500);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_ClassSugg = GetDriver().findElement(By.xpath("//input[@value='MEDICAL TECHNOLOGY']"));
		js1.executeScript("arguments[0].click();", Select_ClassSugg);

		Thread.sleep(1000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: US2020017871A1  ");

		Thread.sleep(5000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "TISSUE SPECIFIC REDUCTION OF LIGNIN";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
	}

	@Test
	public void DOM_IS() throws Exception {
		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_ICSectionClass = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='DOM']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_ICSectionClass);

		Thread.sleep(1000);

		// is not dropdown
		WebElement ClickonIS = GetDriver()
				.findElement(By.xpath("//*[@id='filterContainer']/div[31]/filteritems/div[1]/div/select"));
		ClickonIS.click();

		WebElement SelectIS = GetDriver()
				.findElement(By.xpath("//*[@id='filterContainer']/div[31]/filteritems/div[1]/div/select/option[1]"));
		SelectIS.click();

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_ClassSugg = GetDriver().findElement(By.xpath("//input[@value='MECHANICAL ENGINEERING']"));
		js1.executeScript("arguments[0].click();", Select_ClassSugg);

		Thread.sleep(200);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: DE102018118271A1   ");

		Thread.sleep(5000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "LIGHT RELEASE BASE PAPER";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();

	}

	@Test
	public void REGST_IS() throws Exception {
		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_REGST = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='REGST']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_REGST);

		Thread.sleep(1000);

		// is not dropdown
		WebElement ClickonIS = GetDriver()
				.findElement(By.xpath("//*[@id='filterContainer']/div[25]/filteritems/div[1]/div/select"));
		ClickonIS.click();

		WebElement SelectIS = GetDriver()
				.findElement(By.xpath("//*[@id='filterContainer']/div[25]/filteritems/div[1]/div/select/option[1]"));
		SelectIS.click();

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_REGSTSugg = GetDriver().findElement(
				By.xpath("//input[@value='Patent Expired Due to NonPayment of Maintenance Fees Under 37 CFR 1362']"));
		js1.executeScript("arguments[0].click();", Select_REGSTSugg);

		Thread.sleep(200);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: US7732678B1   ");

		Thread.sleep(5000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Cotton fiber transcriptional factors";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
	}

	@Test
	public void LSSE_ISNOT() throws Exception {
		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_LSSE = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='LSSE']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_LSSE);

		Thread.sleep(1000);

		// is not dropdown
		WebElement ClickonIS = GetDriver()
				.findElement(By.xpath("//*[@id='filterContainer']/div[26]/filteritems/div[1]/div/select"));
		ClickonIS.click();

		WebElement SelectISNOT = GetDriver()
				.findElement(By.xpath("//*[@id='filterContainer']/div[26]/filteritems/div[1]/div/select/option[2]"));
		SelectISNOT.click();

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_LSSESugg = GetDriver().findElement(By.xpath("//input[@value='ACTIVE IN DESIGNATED STATE']"));
		js1.executeScript("arguments[0].click();", Select_LSSESugg);

		Thread.sleep(200);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: DE102018118271A1  ");

		Thread.sleep(5000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "LIGHT RELEASE BASE PAPER";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
	}

	@Test
	public void ATN_ISNOT() throws Exception {
		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_ATN = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='ATN']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_ATN);

		Thread.sleep(1000);

		// is not
		WebElement ClickonIS = GetDriver()
				.findElement(By.xpath("//*[@id='filterContainer']/div[27]/filteritems/div[1]/div/select"));
		ClickonIS.click();

		WebElement SelectISNOT = GetDriver()
				.findElement(By.xpath("//*[@id='filterContainer']/div[27]/filteritems/div[1]/div/select/option[2]"));
		SelectISNOT.click();

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_ATNSugg = GetDriver().findElement(By.xpath("//input[@value='DAVIES COLLISON CAVE PTY LTD']"));
		js1.executeScript("arguments[0].click();", Select_ATNSugg);

		Thread.sleep(200);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: DE102018118271A1 ");

		Thread.sleep(5000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "LIGHT RELEASE BASE PAPER";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
	}

	@Test
	public void REG_IS() throws Exception {
		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_REG = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='REG']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_REG);

		Thread.sleep(1000);

		// is not dropdown
		WebElement ClickonIS = GetDriver()
				.findElement(By.xpath("//*[@id='filterContainer']/div[29]/filteritems/div[1]/div/select"));
		ClickonIS.click();

		WebElement SelectISNOT = GetDriver()
				.findElement(By.xpath("//*[@id='filterContainer']/div[29]/filteritems/div[1]/div/select/option[2]"));
		SelectISNOT.click();

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_REGSugg = GetDriver().findElement(By.xpath("//input[@value='ASIA']"));
		js1.executeScript("arguments[0].click();", Select_REGSugg);

		Thread.sleep(200);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: EP3623509A1  ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "FABRIC MADE OF TWISTED YARNS";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
	}

	@Test
	public void PBNCountry_IS() throws Exception {
		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_PBNCountry = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='PBC']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_PBNCountry);

		Thread.sleep(1000);

		// is not dropdown
		WebElement ClickonIS = GetDriver()
				.findElement(By.xpath("//*[@id='filterContainer']/div[22]/filteritems/div[1]/div/select"));
		ClickonIS.click();

		WebElement SelectIS = GetDriver()
				.findElement(By.xpath("//*[@id='filterContainer']/div[22]/filteritems/div[1]/div/select/option[1]"));
		SelectIS.click();

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_PBNCountrySugg = GetDriver().findElement(By.xpath("//input[@value='WO']"));
		js1.executeScript("arguments[0].click();", Select_PBNCountrySugg);

		Thread.sleep(200);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: WO2017011050A2  ");

		Thread.sleep(5000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "BILAYERED DEVICES FOR ENHANCED HEALING";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
	}

	@Test
	public void PRCCountry_ISNOT() throws Exception {
		CommonSearch_WF();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_PRCCountry = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='PRC']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_PRCCountry);

		Thread.sleep(1000);

		// is not dropdown
		WebElement ClickonIS = GetDriver()
				.findElement(By.xpath("//*[@id='filterContainer']/div[23]/filteritems/div[1]/div/select"));
		ClickonIS.click();

		WebElement SelectISNOT = GetDriver()
				.findElement(By.xpath("//*[@id='filterContainer']/div[23]/filteritems/div[1]/div/select/option[2]"));
		SelectISNOT.click();

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_PRCCountrySugg = GetDriver().findElement(By.xpath("//input[@value='US']"));
		js1.executeScript("arguments[0].click();", Select_PRCCountrySugg);

		Thread.sleep(200);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC:  DE102018118271A1  ");

		Thread.sleep(5000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "LIGHT RELEASE BASE PAPER";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
	}

	@Test
	public void PTYP_ISNOT() throws Exception {
		CommonSearch_WF();

		Thread.sleep(2000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_RecordType = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='PTYP']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_RecordType);

		// is not dropdown
		WebElement ClickonIS = GetDriver()
				.findElement(By.xpath("//*[@id='filterContainer']/div[4]/filteritems/div[1]/div/select"));
		ClickonIS.click();

		WebElement SelectISNOT = GetDriver()
				.findElement(By.xpath("//*[@id='filterContainer']/div[4]/filteritems/div[1]/div/select/option[2]"));
		SelectISNOT.click();

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_Patent = GetDriver().findElement(By.xpath("//input[@value='PATENT']"));
		js1.executeScript("arguments[0].click();", Select_Patent);

		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: US2020017871A1 ");

		Thread.sleep(5000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "TISSUE SPECIFIC REDUCTION OF LIGNIN";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
	}
}
