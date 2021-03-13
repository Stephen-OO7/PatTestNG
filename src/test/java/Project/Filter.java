package Project;

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

import java.awt.Desktop.Action;
import java.io.IOException;

import Login.BaseTest;

public class Filter extends BaseTest {

	@Test
	public void CommonProject() throws Exception {
		GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement commonProj = GetDriver().findElement(By
				.xpath("//span[@class='patseer_Secondary_Button ng-binding'][contains(text(),'Automation_Project')]"));
		js.executeScript("arguments[0].click();", commonProj);

		Thread.sleep(2000);

		// on result page
		GetDriver().manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);

		// //iframe
		// WebElement iframeElement =
		// GetDriver().findElement(By.id("frmProjectAddRecordContainer"));
		// GetDriver().switchTo().frame(iframeElement);
		//
		// Thread.sleep(500);
	}

	@Test
	public void PubDate() throws Exception {
		Thread.sleep(1000);

		CommonProject();

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
		SearchNo.sendKeys("   PNC: CN208216151U  ");

		Thread.sleep(5000);

		ApplyFilter();

		Thread.sleep(5000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Novel antibiotic textile fabric";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
	}

	@Test
	public void Attorney() throws Exception {
		Thread.sleep(1000);

		CommonProject();

		Thread.sleep(1000);

		MainFilter();

		WebElement ClickonAttorney = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='ATN']//child::span[1]"));
		Actions actions = new Actions(GetDriver());
		actions.moveToElement(ClickonAttorney).click().build().perform();

		Thread.sleep(1000);

		WebElement SelectFirstOption = GetDriver().findElement(By.xpath("//input[@value='MANSFIELD KEVIN T']"));
		SelectFirstOption.click();

		Thread.sleep(1000);

		SearchWithin();

		WebElement SearchNumber = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNumber.sendKeys("PNC:  US7078550B2");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(1000);

		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Silanyl phenols and naphthols";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();

	}

	@Test
	public void Comments() throws Exception {
		Thread.sleep(1000);

		CommonProject();

		Thread.sleep(1000);

		MainFilter();

		WebElement ClickonComment = GetDriver().findElement(By.xpath(
				"//filterview[@name='searchresultFilter']//*[@filtertype='projectfieldsComment']//child::span[1]"));
		Actions actions = new Actions(GetDriver());
		actions.moveToElement(ClickonComment).click().build().perform();

		Thread.sleep(1000);

		ContainsOptionComments();

		DoesntOptionComments();

		GoToHomePage();

	}

	@Test
	public void ContainsOptionComments() throws Exception {
		WebElement SelectFirstOption = GetDriver()
				.findElement(By.xpath("//*[@id='div_projectfieldsComment']/div[1]/div/div/input"));
		SelectFirstOption.click();

		SelectFirstOption.sendKeys("check contains option");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(1000);

		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "DETERGENT COMPOSITIONS";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

	}

	@Test
	public void DoesntOptionComments() throws Exception {
		WebElement clickonRadioButton = GetDriver()
				.findElement(By.xpath("//*[@id='div_projectfieldsComment']/div[2]/label/input"));
		clickonRadioButton.click();

		Thread.sleep(500);

		WebElement SelectFirstOption = GetDriver()
				.findElement(By.xpath("//*[@id='div_projectfieldsComment']/div[2]/div/div/input"));
		SelectFirstOption.click();

		SelectFirstOption.sendKeys("check contains option");

		Thread.sleep(1000);

		SearchWithin();

		WebElement SearchNumber = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNumber.sendKeys("PNC:  US5498345A ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(1000);

		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Aqueous dispersion of sparingly soluble UV absorbers";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);
	}

	@Test
	public void FullText() throws Exception {
		
		Thread.sleep(1000);

		CommonProject();

		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement ClickonTACD = GetDriver().findElement(By.xpath("//span[@title='FullText']"));
		js.executeScript("arguments[0].click();", ClickonTACD);

		Thread.sleep(1000);

		// JavascriptExecutor js2 = (JavascriptExecutor) GetDriver();
		WebElement EnterText = GetDriver().findElement(By.xpath("//*[@id='divDate_TACD']/div[1]/div/div/input"));
		EnterText.sendKeys(" Etiquette suggestion ");

		Thread.sleep(1000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: US9330567B2   ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(1000);

		// validation using assert
		WebDriverWait wait111 = new WebDriverWait(GetDriver(), 60);
		wait111.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Etiquette suggestion";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();

	}

	@Test
	public void AliveDead() throws Exception {
		Thread.sleep(1000);

		CommonProject();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Alive = GetDriver().findElement(By.xpath("//button[@id='btnAlive']"));
		js.executeScript("arguments[0].click();", Alive);

		Thread.sleep(1000);

		// search within
		SearchWithin();

		Thread.sleep(500);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC:  US10301024B1 ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(3000);

		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Aerodynamic package";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();

	}

	@Test
	public void LitigateFilter() throws Exception {
		Thread.sleep(1000);

		CommonProject();

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
		SearchNo.sendKeys("   PNC: US5871669A ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(1000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Stabilizer combination";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
	}

	@Test
	public void IsOpposed() throws Exception {
		Thread.sleep(1000);

		CommonProject();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement ClickonISOpposed = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='ISOP']//child::span[1]"));
		js.executeScript("arguments[0].click();", ClickonISOpposed);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement SelectUS = GetDriver().findElement(By.xpath("//input[@value='KR']"));
		js1.executeScript("arguments[0].click();", SelectUS);

		Thread.sleep(1000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: KR20040002848A");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(1000);

		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Surface-active compositions";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
	}

	@Test
	public void SearchWithinn() throws Exception {
		CommonProject();

		Thread.sleep(1000);

		MainFilter();

		Thread.sleep(1000);

		// search within
		SearchWithin();

		Thread.sleep(2000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC:  US10301024B1 ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(1000);

		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Aerodynamic package";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();

	}

	@Test
	public void Categories() throws Exception {
		Thread.sleep(1000);

		CommonProject();

		Thread.sleep(1000);

		WebElement ClickonCategories = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='categories']//child::span[1]"));
		Actions actions = new Actions(GetDriver());
		actions.moveToElement(ClickonCategories).click().build().perform();

		Thread.sleep(1000);

		WebElement Clickon_createTop_Level = GetDriver()
				.findElement(By.xpath("//span[@id='lnkBtnCreateRootCategory']"));
		Clickon_createTop_Level.click();

		// if(
		// GetDriver().findElement(By.xpath("//span[@id='lnkBtnCreateRootCategory']")).isDisplayed())
		// {
		//
		// System.out.println("Element is Visible");
		// Clickon_createTop_Level.sendKeys("123");
		// }
		// else
		// {
		//
		// System.out.println("Element is InVisible");
		//
		//
		// }

		// Clickon_createTop_Level.sendKeys("AutomatedCat");

		Thread.sleep(500);

		// WebElement
		// Enter_Category_Name=GetDriver().findElement(By.xpath("//li[@class='fancytree-lastsib']"));
		// Enter_Category_Name.sendKeys("123");
		//
		// Thread.sleep(200);

		// WebElement
		// ApplyFilter=GetDriver().findElement(By.xpath("//button[@class='btn
		// btn-secondary p-btn getInScope']"));
		// ApplyFilter.click();

		Thread.sleep(500);

		GoToHomePage();

		Thread.sleep(500);

	}

	@Test
	public void CategoryExport() throws Exception {
		Thread.sleep(1000);

		CommonProject();

		Thread.sleep(2000);

		WebElement ClickonCategories = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='categories']//child::span[1]"));
		Actions actions = new Actions(GetDriver());
		actions.moveToElement(ClickonCategories).click().build().perform();

		// Thread.sleep(1000);

		// WebElement ele =
		// GetDriver().findElement(By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='categories']//child::span[1]"));
		// Actions action = new Actions(GetDriver());
		// action.moveToElement(ele).build().perform();

		Thread.sleep(2000);

		WebElement CategoryExport = GetDriver().findElement(By.xpath("//a[contains(text(),'Current Search')]"));
		CategoryExport.click();

		Thread.sleep(2000);

		WebElement ClickonRefresh = GetDriver()
				.findElement(By.xpath("//div[@id='headerCntrl_patseerLogoCntrl_divLogo']"));
		ClickonRefresh.click();

		Thread.sleep(2000);

		// GoToHomePage();

	}

	@Test
	public void ProjectFields() throws Exception {
		CommonProject();

		Thread.sleep(500);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_ICSectionClass = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='projectfields']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_ICSectionClass);

		Thread.sleep(500);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_ClassSugg = GetDriver().findElement(By.xpath("//input[@id='Fcheckbox1']"));
		js1.executeScript("arguments[0].click();", Select_ClassSugg);

		Thread.sleep(500);

		// search within
		SearchWithin();

		Thread.sleep(500);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC:  EP3607002A1  ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(1000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "COLORANT MIXTURES";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(500);

		GoToHomePage();

	}

	@Test
	public void CPCFull() throws Exception {
		Thread.sleep(1000);

		CommonProject();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_CPCFull = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='CPC']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_CPCFull);

		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_ClassSugg = GetDriver().findElement(By.xpath("//input[@value='Y10S8/922']"));
		js1.executeScript("arguments[0].click();", Select_ClassSugg);

		Thread.sleep(1000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: US5051111A  ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(2000);

		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Whitener dispersion";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
	}

	@Test
	public void CPCMainDownloadCSV() throws Exception {
		Thread.sleep(1000);

		CommonProject();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_ICSectionClass = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='CPCG']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_ICSectionClass);

		Thread.sleep(1000);

		GetDriver().findElement(By.xpath("//*[@id='filterContainer']/div[14]/filteritems/div[2]/div[5]/span")).click();

		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_ClassSugg = GetDriver().findElement(By.xpath("//input[@value='Y10S8']"));
		js1.executeScript("arguments[0].click();", Select_ClassSugg);

		Thread.sleep(1000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: US8231691B2 ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(2000);

		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Azo dyes";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
	}

	@Test
	public void Flags_Filter() throws Exception {
		Thread.sleep(1000);

		CommonProject();

		Thread.sleep(1000);

		// SelectCurrentRecords();
		//
		// Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_CPCFull = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='flag']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_CPCFull);

		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_RedFlag = GetDriver().findElement(By.xpath("//input[@id='Fcheckbox1']"));
		js1.executeScript("arguments[0].click();", Select_RedFlag);

		Thread.sleep(1000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC:WO2009069077A2 ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(2000);

		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "DETERGENT COMPOSITIONS";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
	}

	@Test
	public void Ratings_Filter() throws Exception {
		Thread.sleep(1000);

		CommonProject();

		Thread.sleep(1000);

		// SelectCurrentRecords();
		//
		// Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_CPCFull = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='rate']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_CPCFull);

		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_RedFlag = GetDriver().findElement(By.xpath("//input[@id='Rcheckbox2']"));
		js1.executeScript("arguments[0].click();", Select_RedFlag);

		Thread.sleep(1000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC:US9330567B2 ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(2000);

		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Etiquette suggestion";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
	}

	@Test
	public void Check_ISNOT() throws Exception {
		Thread.sleep(1000);

		CommonProject();

		Thread.sleep(1000);

		MainFilter();

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_ATN = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='ATN']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_ATN);

		Thread.sleep(1000);

		WebElement SelectISNOT = GetDriver()
				.findElement(By.xpath("//*[@id='filterContainer']/div[5]/filteritems/div[2]/div[3]/label[2]/input"));
		SelectISNOT.click();

		Thread.sleep(500);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_Sugg1 = GetDriver().findElement(By.xpath("//input[@value='MANSFIELD KEVIN T']"));
		js1.executeScript("arguments[0].click();", Select_Sugg1);

		Thread.sleep(500);

		JavascriptExecutor js2 = (JavascriptExecutor) GetDriver();
		WebElement Select_Sugg2 = GetDriver()
				.findElement(By.xpath("//input[@value='CIBA SPECIALITY CHEM HOLDING INC']"));
		js2.executeScript("arguments[0].click();", Select_Sugg2);

		Thread.sleep(1000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC:  US9330567B2 ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(2000);

		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Etiquette suggestion";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
	}

	@Test
	public void LSC() throws Exception {
		Thread.sleep(1000);

		CommonProject();

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

		Thread.sleep(1000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC:  WO2018184770A1  ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(1000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "COLORANT MIXTURES";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
	}

	@Test
	public void SFAMID() throws Exception {
		Thread.sleep(1000);

		CommonProject();

		Thread.sleep(1000);

		MainFilter();

		Thread.sleep(500);

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_ICSectionClass = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='FAMID']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_ICSectionClass);

		Thread.sleep(500);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_ClassSugg = GetDriver().findElement(By.xpath("//input[@value='5901918']"));
		js1.executeScript("arguments[0].click();", Select_ClassSugg);

		Thread.sleep(1000);

		// search within
		SearchWithin();

		Thread.sleep(500);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: JPS53103081A   ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(1000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "TRANSFER PRINTING MATERIAL";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(2000);

		GoToHomePage();

	}

	@Test
	public void EFAMID() throws Exception {
		Thread.sleep(1000);

		CommonProject();

		Thread.sleep(1000);

		MainFilter();

		Thread.sleep(500);

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_ICSectionClass = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='EFID']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_ICSectionClass);

		Thread.sleep(500);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_ClassSugg = GetDriver().findElement(By.xpath("//input[@value='10804760']"));
		js1.executeScript("arguments[0].click();", Select_ClassSugg);

		Thread.sleep(1000);

		// search within
		SearchWithin();

		Thread.sleep(500);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: JP2001505599A ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(1000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "New condensation products and their uses";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(2000);

		GoToHomePage();

	}

	@Test
	public void CustomField() throws Exception {
		CommonProject();
		WebElement CustomField = GetDriver().findElement(
				By.xpath(".//*[@id='leftUpperPanel_SearchSummaryContainer_filterContainer']/div[9]/div[1]"));
		Actions actions = new Actions(GetDriver());
		actions.moveToElement(CustomField).click().build().perform();

		WebElement SelectFirst = GetDriver().findElement(By
				.xpath(".//*[@id='leftUpperPanel_SearchSummaryContainer_CustomFieldsContainer']/div[2]/div[1]/div[1]"));
		SelectFirst.click();

		WebElement Apply = GetDriver().findElement(By.xpath(".//*[@id='cfcntr']/div[2]/span/span[1]/input"));
		Apply.click();

		WebElement ApplyFilter = GetDriver()
				.findElement(By.xpath("//button[@class='btn btn-secondary p-btn getInScope']"));
		ApplyFilter.click();

		Thread.sleep(500);

		GoToHomePage();

		Thread.sleep(500);

		CommonProject();

	}

	@Test
	public void QueryBuilder() throws Exception {
		Thread.sleep(1000);

		CommonProject();

		Thread.sleep(1000);

		MainFilter();

		Thread.sleep(1000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement ClickonQueryBuilder = GetDriver().findElement(By.xpath("//*[@id='querybuilderbtn']"));
		ClickonQueryBuilder.click();

		Thread.sleep(1000);

		// search in query builder
		WebElement EnterText = GetDriver().findElement(By.xpath("//*[@id='txtPatApp_0']"));
		EnterText.sendKeys("  Aerodynamic package ");

		Thread.sleep(500);

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
		EnterPNC.sendKeys(" US10301024B1 ");

		Thread.sleep(500);

		WebElement AddQuery = GetDriver().findElement(By.xpath("//*[@id='quickSearchPanelID']/div[2]/span"));
		AddQuery.click();

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(1000);

		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Aerodynamic package";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();

	}

	@Test
	public void CategoryImport() throws Exception {
		Thread.sleep(1000);

		CommonProject();

		Thread.sleep(1000);

		WebElement ClickonCategories = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='categories']//child::span[1]"));
		Actions actions = new Actions(GetDriver());
		actions.moveToElement(ClickonCategories).click().build().perform();

		Thread.sleep(1000);

		WebElement ImportCategory = GetDriver().findElement(By.xpath("//div[@id='lnkCategoryImport']"));
		ImportCategory.click();

		Thread.sleep(100);

		// for importing external file
		GetDriver().switchTo().activeElement()
				.sendKeys("Z:/Testing/Testing Documents/Patseer/RFT documents/Import categories/catetories2.txt");

		Thread.sleep(100);

		WebElement Import = GetDriver().findElement(
				By.xpath("//*[@id='ContentPlaceHolder1_SearchSummaryContainer_CategoryTagContainer_lnkImportFile']"));
		Import.click();

		Thread.sleep(1000);

		WebElement VerifyCategory = GetDriver().findElement(By.xpath(
				"//*[@id='ContentPlaceHolder1_SearchSummaryContainer_CategoryTagContainer_CategoryTreeContainer']/ul"));
		System.out.println(VerifyCategory.getText());

		Thread.sleep(3000);

		GoToHomePage();

		// WebElement downloadButton =
		// GetDriver().findElement(By.id("messenger-download"));
		// String sourceLocation = downloadButton.getAttribute("href");
		// String wget_command = "cmd /c C:/Wget/wget-1.20.3-win32//wget.exe -P
		// D: --no-check-certificate " + sourceLocation;
		//
		// try {
		// Process exec = Runtime.getRuntime().exec(wget_command);
		// int exitVal = exec.waitFor();
		// System.out.println("Exit value: " + exitVal);
		// } catch (Exception | IOException ex) {
		// System.out.println(ex.toString());
		// }

	}

	@Test
	public void PTYP_ISNOT() throws Exception {
		Thread.sleep(1000);

		CommonProject();

		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Clickon_RecordType = GetDriver().findElement(
				By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='PTYP']//child::span[1]"));
		js.executeScript("arguments[0].click();", Clickon_RecordType);

		// is not dropdown
		// WebElement
		// ClickonIS=GetDriver().findElement(By.xpath("//*[@id='filterContainer']/div[5]/filteritems/div[1]/div/select"));
		// ClickonIS.click();

		Thread.sleep(500);

		WebElement SelectISNOT = GetDriver()
				.findElement(By.xpath("//*[@id='filterContainer']/div[23]/filteritems/div[2]/div[3]/label[2]/input"));
		SelectISNOT.click();

		Thread.sleep(500);

		JavascriptExecutor js1 = (JavascriptExecutor) GetDriver();
		WebElement Select_Patent = GetDriver().findElement(By.xpath("//input[@value='PATENT']"));
		js1.executeScript("arguments[0].click();", Select_Patent);

		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: WO2009069077A2 ");

		Thread.sleep(2000);

		ApplyFilter();

		Thread.sleep(4000);
		// validation using assert
		WebDriverWait wait11 = new WebDriverWait(GetDriver(), 60);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "DETERGENT COMPOSITIONS";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(1000);

		GoToHomePage();
	}

}
