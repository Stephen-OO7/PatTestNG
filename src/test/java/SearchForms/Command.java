package SearchForms;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import Login.BaseTest;

public class Command extends BaseTest {

	@Test
	public void SFAMOF() throws Exception {
		// clear
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
		SFAMOF.sendKeys(
				"                                        SFAMOF(T: (Electr* wd3 (communication OR comm OR wireless* OR online* ))) AND PNC: USD868051S                 ");
		System.out.println("entered search term of SFAMOF in cmd");

		Thread.sleep(2000);

		GetCountSearch_CMD();

		// code for unchecking highlight option
		// WebDriverWait wait3= new WebDriverWait(GetDriver(),60);
		// wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='ContentPlaceHolder1_SearchResultsControl_lihighlight']")));
		// WebElement
		// highlight=GetDriver().findElement(By.xpath("//span[@class='topalign
		// floatLeft']"));
		// highlight.click();

		// validation using assert
		// WebDriverWait wait2= new WebDriverWait(GetDriver(),60);
		// wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		// WebElement
		// validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		// System.out.println("s1 : "+validate.getText());
		//
		// String actualText="Case for electronic communications device";
		// Assert.assertEquals(validate.getText(), actualText);

		GoToHomePage();

		Thread.sleep(500);

		SelectCommandSearch();

		// clear
		WebElement clear = GetDriver().findElement(By.xpath("//div[@class='floatLeft leftSpacer']"));
		clear.click();
		System.out.println("clicked on clear option");

	}

	@Test
	public void EFAMOF() throws Exception {
		Thread.sleep(2000);

		SpellCheck();

		Thread.sleep(500);

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();// WebDriver
																	// instance
																	// type cast
																	// into
																	// JavascriptExecutor
																	// interface
		WebElement EFAMOF = GetDriver().findElement(By.id("txtSpellCheck"));
		js.executeScript("arguments[0].click();", EFAMOF);

		// used for blocking hidden element
		JavascriptExecutor jss = (JavascriptExecutor) GetDriver();
		jss.executeScript("document.getElementById('txtCommandSearch_0_0').setAttribute('style', 'display:block')");
		GetDriver().findElement(By.xpath("//textarea[@id='txtSpellCheck']")).clear();
		EFAMOF.sendKeys(
				"            EFAMOF(T: (nano* wd3 (fabric OR fiber* OR fibre* OR textile*) OR nanofabric OR nanotextile* OR nanofiber* OR nanofibre*)) AND PNC:US10487212B2   ");

		System.out.println("entered search term of EFAMOF in cmd");

		Thread.sleep(2000);

		GetCountSearch_CMD();

		Thread.sleep(1000);

		// validation using assert
		// WebDriverWait wait2= new WebDriverWait(GetDriver(),60);
		// wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		// WebElement
		// validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		// System.out.println("s1 : "+validate.getText());
		//
		// String actualText="Thermally stable color pigments with nanofiber
		// coating";
		// Assert.assertEquals(validate.getText(), actualText);

		GoToHomePage();

		Thread.sleep(500);

		SelectCommandSearch();

		// clear
		WebElement clear = GetDriver().findElement(By.xpath("//div[@class='floatLeft leftSpacer']"));
		clear.click();
		System.out.println("clicked on clear option");
	}

	@Test
	public void BCTOF() throws Exception {

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
		WebElement BCTOF = GetDriver().findElement(By.id("txtSpellCheck"));
		js.executeScript("arguments[0].click();", BCTOF);

		GetDriver().findElement(By.xpath("//textarea[@id='txtSpellCheck']")).clear();

		BCTOF.sendKeys(
				"              BCTOF(T: (nano* wd3 (fabric OR fiber* OR fibre* OR textile*) OR nanofabric OR nanotextile* OR nanofiber* OR nanofibre*)) AND PNC:US10478519B2     ");
		System.out.println("entered search term of BCTOF in cmd");

		Thread.sleep(2000);

		GetCountSearch_CMD();

		// validation using assert
		// WebElement
		// validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		// System.out.println("s1 : "+validate.getText());
		//
		// String actualText="Tissue substitute multilayer matrix and uses
		// thereof";
		// Assert.assertEquals(validate.getText(), actualText);

		GoToHomePage();

		Thread.sleep(500);

		SelectCommandSearch();

		// clear
		WebElement clear = GetDriver().findElement(By.xpath("//div[@class='floatLeft leftSpacer']"));
		clear.click();
		System.out.println("clicked on clear option");
	}

	@Test
	public void FCTOF() throws Exception {

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
		WebElement FCTOF = GetDriver().findElement(By.id("txtSpellCheck"));
		js.executeScript("arguments[0].click();", FCTOF);

		// used for blocking hidden element
		JavascriptExecutor jss = (JavascriptExecutor) GetDriver();
		jss.executeScript("document.getElementById('txtCommandSearch_0_0').setAttribute('style', 'display:block')");
		GetDriver().findElement(By.xpath("//textarea[@id='txtSpellCheck']")).clear();
		FCTOF.sendKeys(
				"           FCTOF(T:circuitbreak* or switchgear* or switch gear*)  AND PNC:US10483727B2        ");
		System.out.println("entered search term of FCTOF in cmd ");

		Thread.sleep(2000);

		GetCountSearch_CMD();

		// validation using assert
		// WebDriverWait wait2= new WebDriverWait(GetDriver(),60);
		// wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		// WebElement
		// validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		// System.out.println("s1 : "+validate.getText());
		//
		// String actualText="Cooling system for tanks";
		// Assert.assertEquals(validate.getText(), actualText);

		GoToHomePage();
		Thread.sleep(500);

		SelectCommandSearch();

		// clear
		WebElement clear = GetDriver().findElement(
				By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		clear.click();
		System.out.println("clicked on clear option");
	}

	@Test
	public void ALLCT() throws Exception {
		// clear
		WebElement clearr = GetDriver().findElement(By.partialLinkText("Clear"));
		clearr.click();
		System.out.println("clicked on clear option");

		// for spell check
		SpellCheck();

		Thread.sleep(500);
		JavascriptExecutor js = (JavascriptExecutor) GetDriver();// WebDriver
																	// instance
																	// type cast
																	// into
																	// JavascriptExecutor
																	// interface
		WebElement ALLCT = GetDriver().findElement(By.id("txtSpellCheck"));
		js.executeScript("arguments[0].click();", ALLCT);

		// used for blocking hidden element
		GetDriver().findElement(By.xpath("//textarea[@id='txtSpellCheck']")).clear();

		ALLCT.sendKeys("                ALLCT:US6000000A AND pnc: US10462189B2             ");
		System.out.println("entered search term of ALLCT in cmd ");

		Thread.sleep(500);
		GetCountSearch_CMD();

		// validation using assert
		// WebDriverWait wait2= new WebDriverWait(GetDriver(),60);
		// wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));

		// WebElement
		// validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		// System.out.println("s1 : "+validate.getText());
		//
		// String actualText="Method for providing wireless application
		// privilege management";
		// Assert.assertEquals(validate.getText(), actualText);

		GoToHomePage();
		Thread.sleep(500);

		SelectCommandSearch();

		// clear
		WebElement clear = GetDriver().findElement(By.xpath("//div[@class='floatLeft leftSpacer']"));
		clear.click();
		System.out.println("clicked on clear option");
	}

	@Test
	public void LargeQuery() throws Exception {
		// clear
		WebElement clearr = GetDriver().findElement(By.partialLinkText("Clear"));
		clearr.click();
		System.out.println("clicked on clear option");

		// for spell check
		SpellCheck();

		Thread.sleep(500);
		JavascriptExecutor js = (JavascriptExecutor) GetDriver();// WebDriver
																	// instance
																	// type cast
																	// into
																	// JavascriptExecutor
																	// interface
		WebElement largrquery = GetDriver().findElement(By.id("txtSpellCheck"));
		js.executeScript("arguments[0].click();", largrquery);

		// used for blocking hidden element
		JavascriptExecutor jss = (JavascriptExecutor) GetDriver();
		jss.executeScript("document.getElementById('txtCommandSearch_0_0').setAttribute('style', 'display:block')");
		GetDriver().findElement(By.xpath("//textarea[@id='txtSpellCheck']")).clear();

		largrquery.sendKeys(
				"           TAC:(ag?ng OR blemish* OR pigmentation change* OR discolo?ration OR laxity OR sagging OR rhytid* OR wrinkl* OR photoag?ng OR erythema OR dyspigmentation OR  solar elastosis OR keratose* OR poor texture OR soap OR clean?er OR moisturi?er OR detergent OR shampoo OR cologne OR oil OR paste OR cream OR ointment* OR lotion* OR gel OR gels OR balm OR emollient) AND REG:(WIPO OR AMERICAS OR ASIA) AND  DOM:CHEMISTRY AND ASNT:firm  AND PNC:US2019376888A1                 ");
		System.out.println("entered search term of large query in cmd ");

		Thread.sleep(2000);
		GetCountSearch_CMD();

		// validation using assert
		// WebDriverWait wait2= new WebDriverWait(GetDriver(),60);
		// wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		// WebElement
		// validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		// System.out.println("s1 : "+validate.getText());
		//
		// String actualText="ASSAY WITH TEXTURED SURFACE";
		// Assert.assertEquals(validate.getText(), actualText);

		GoToHomePage();

		Thread.sleep(500);

		SelectCommandSearch();

		// clear
		WebElement clear = GetDriver().findElement(By.xpath("//div[@class='floatLeft leftSpacer']"));
		clear.click();
		System.out.println("clicked on clear option");

	}

	@Test
	public void MultiLanguage() throws Exception {

		// for spell check
		SpellCheck();

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

		Thread.sleep(2000);

		GetCountSearch_CMD();

		// validation using assert
		// WebDriverWait wait2= new WebDriverWait(GetDriver(),60);
		// wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		// WebElement
		// validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		// System.out.println("s1 : "+validate.getText());
		//
		// String actualText="SMART BIN SYSTEM";
		// Assert.assertEquals(validate.getText(), actualText);

		GoToHomePage();

		Thread.sleep(500);

		SelectCommandSearch();
		// clear
		WebElement clear = GetDriver().findElement(
				By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		clear.click();
		System.out.println("clicked on clear option");
	}

	@Test
	public void TAIX() throws Exception {
		// for spell check
		SpellCheck();

		Thread.sleep(500);
		JavascriptExecutor js = (JavascriptExecutor) GetDriver();// WebDriver
																	// instance
																	// type cast
																	// into
																	// JavascriptExecutor
																	// interface
		WebElement TAIX = GetDriver().findElement(By.id("txtSpellCheck"));
		js.executeScript("arguments[0].click();", TAIX);

		// used for blocking hidden element
		JavascriptExecutor jss = (JavascriptExecutor) GetDriver();
		jss.executeScript("document.getElementById('txtCommandSearch_0_0').setAttribute('style', 'display:block')");
		GetDriver().findElement(By.xpath("//textarea[@id='txtSpellCheck']")).clear();
		TAIX.sendKeys(
				"                                             TAIX: glycerol ester or thyglycerol ester  AND pnc: US10501351B2                 ");
		System.out.println("entered search term of TAIX in cmd ");

		Thread.sleep(2000);

		GetCountSearch_CMD();

		// validation using assert
		// WebDriverWait wait2= new WebDriverWait(GetDriver(),60);
		// wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		// WebElement
		// validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		// System.out.println("s1 : "+validate.getText());
		//
		// String actualText="Composition and methods of use";
		// Assert.assertEquals(validate.getText(), actualText);

		GoToHomePage();

		Thread.sleep(500);

		SelectCommandSearch();

		// clear
		WebElement clear = GetDriver().findElement(
				By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		clear.click();
		System.out.println("clicked on clear option");
	}

	@Test
	public void NLPL() throws Exception {

		// for spell check
		SpellCheck();

		Thread.sleep(500);
		JavascriptExecutor js = (JavascriptExecutor) GetDriver();// WebDriver
																	// instance
																	// type cast
																	// into
																	// JavascriptExecutor
																	// interface
		WebElement NLPL = GetDriver().findElement(By.id("txtSpellCheck"));
		js.executeScript("arguments[0].click();", NLPL);

		// used for blocking hidden element
		JavascriptExecutor jss = (JavascriptExecutor) GetDriver();
		jss.executeScript("document.getElementById('txtCommandSearch_0_0').setAttribute('style', 'display:block')");
		GetDriver().findElement(By.xpath("//textarea[@id='txtSpellCheck']")).clear();

		NLPL.sendKeys(
				"                 NLPL(TAC:(The invention relates to an apparatus comprising an autobalancing circuit that is configured to be electrically connected to a first battery and a second battery. The autobalancing circuit is configured to determine voltage difference Vbat1−Vbat2 between the output voltage of the first battery Vbat1 and the output voltage of the second battery Vbat2. If the voltage difference Vbat1−Vbat2 is higher than a predetermined limiting voltage OR  the autobalancing circuit is configured to limit balancing current between the first battery and the second battery until the output voltage difference is less than the predetermined limiting voltage. The invention further relates to a method and a mobile device comprising the apparatus)) AND PNC: US10263297B2       ");
		System.out.println("entered search term of NLPL in cmd");

		Thread.sleep(2000);

		GetCountSearch_CMD();

		// validation using assert
		// WebElement
		// validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		// System.out.println("s1 : "+validate.getText());
		//
		// String actualText="Control system for a battery";
		// Assert.assertEquals(validate.getText(), actualText);

		GoToHomePage();

		Thread.sleep(500);

		SelectCommandSearch();

		// clear
		WebElement clear = GetDriver().findElement(By.xpath("//div[@class='floatLeft leftSpacer']"));
		clear.click();
		System.out.println("clicked on clear option");
	}

	@Test
	public void NLPH() throws Exception {

		// for spell check
		SpellCheck();

		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) GetDriver();// WebDriver
																	// instance
																	// type cast
																	// into
																	// JavascriptExecutor
																	// interface
		WebElement NLPH = GetDriver().findElement(By.id("txtSpellCheck"));
		js.executeScript("arguments[0].click();", NLPH);

		// used for blocking hidden element
		JavascriptExecutor jss = (JavascriptExecutor) GetDriver();
		jss.executeScript("document.getElementById('txtCommandSearch_0_0').setAttribute('style', 'display:block')");
		GetDriver().findElement(By.xpath("//textarea[@id='txtSpellCheck']")).clear();

		NLPH.sendKeys(
				"             NLPH(TAC:(The invention relates to an apparatus comprising an autobalancing circuit that is configured to be electrically connected to a first battery and a second battery. The autobalancing circuit is configured to determine voltage difference Vbat1−Vbat2 between the output voltage of the first battery Vbat1 and the output voltage of the second battery Vbat2. If the voltage difference Vbat1−Vbat2 is higher than a predetermined limiting voltage OR  the autobalancing circuit is configured to limit balancing current between the first battery and the second battery until the output voltage difference is less than the predetermined limiting voltage. The invention further relates to a method and a mobile device comprising the apparatus)) AND PNC:GB201400867D0           ");
		System.out.println("entered search term of NLPH in cmd");

		Thread.sleep(2000);

		GetCountSearch_CMD();

		Thread.sleep(4000);

		// validation using assert
		// WebElement
		// validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		// System.out.println("s1 : "+validate.getText());
		//
		// String actualText="Additional battery pack";
		// Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(2000);

		GoToHomePage();

	}

	@Test
	public void QueryFormat() throws Exception {
		// clear button
		Thread.sleep(2000);
		WebDriverWait wait2 = new WebDriverWait(GetDriver(), 30);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']")));
		WebElement clear = GetDriver().findElement(
				By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		clear.click();
		System.out.println("clicked on clear option");

		Thread.sleep(1000);
		WebElement QueryFrmt = GetDriver().findElement(By.id("txtCommandSearch_0_0"));

		// used for blocking hidden element
		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		js.executeScript("document.getElementById('txtCommandSearch_0_0').setAttribute('style', 'display:block')");
		GetDriver().findElement(By.xpath("//textarea[@id='txtCommandSearch_0_0']")).clear();
		QueryFrmt.sendKeys(
				"              CAAN:((Globus medical) OR GMEDelaware OR (excelsius surgical) \r\n OR (Facet Solutions) OR Soteira OR (algea therapies) OR (Transplant Technologies Texas) \r\n OR (Branch Medical Group) OR Trans1 OR Baxano OR (Paradigm Spine) OR (CENTINEL Spine) OR (Valorem Surgical) OR (Sea Spine) OR SeaSpine OR Brainlab OR Conformis)     ");
		System.out.println("entered search term of BCTOF in cmd");

		Thread.sleep(500);
		GetCountSearch_CMD();

		GoToHomePage();
		Thread.sleep(500);

		SelectCommandSearch();
	}

	@Test
	public void BacktoSearch() {
		GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement backtoSearch = GetDriver().findElement(By.xpath("//span[contains(text(),'back to search')]"));
		backtoSearch.click();
	}

	@Test
	public void ZeroResults() throws Exception {

		Thread.sleep(1000);
		// for spell check
		SpellCheck();

		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement Zero = GetDriver().findElement(By.id("txtSpellCheck"));
		js.executeScript("arguments[0].click();", Zero);

		GetDriver().findElement(By.xpath("//textarea[@id='txtSpellCheck']")).clear();

		Zero.sendKeys("     PBC:(IN AND US)      ");
		System.out.println("entered search term in cmd");

		Thread.sleep(2000);

		// getcount
		WebDriverWait wait3 = new WebDriverWait(GetDriver(), 60);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@ng-click='getCount()']")));
		WebElement getCountBtn = GetDriver().findElement(By.xpath("//a[@ng-click='getCount()']"));
		System.out.println(getCountBtn.getText());

		((JavascriptExecutor) GetDriver()).executeScript("window.scrollTo(0," + getCountBtn.getLocation().y + ")");
		getCountBtn.click();
		System.out.println("clicked on get count");

		Thread.sleep(1000);
		GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		WebElement CheckCount = GetDriver()
				.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lblCntrl_lblSearchCount']"));
		// System.out.println(CheckCount.getText());
		//
		String Actualtext = CheckCount.getText();
		String expectedText = "0 Records";
		Assert.assertEquals(Actualtext, expectedText);
		System.out.println("assertion passed");

		Thread.sleep(1000);

		GoToHomePage();

		Thread.sleep(500);

	}

	@Test
	public void CheckUnderScore() throws Exception {
		// clear button
		Thread.sleep(2000);
		WebDriverWait wait2 = new WebDriverWait(GetDriver(), 30);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']")));
		WebElement clear = GetDriver().findElement(
				By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		clear.click();
		System.out.println("clicked on clear option");

		Thread.sleep(500);
		WebElement underscore = GetDriver().findElement(By.id("txtCommandSearch_0_0"));
		// used for blocking hidden element
		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		js.executeScript("document.getElementById('txtCommandSearch_0_0').setAttribute('style', 'display:block')");
		GetDriver().findElement(By.xpath("//textarea[@id='txtCommandSearch_0_0']")).clear();
		underscore.sendKeys("                   T: 3_D OR 3_dimension*    ");
		System.out.println("entered search term of underscore in cmd");

		Thread.sleep(500);
		GetCountSearch_CMD();

		GoToHomePage();
		Thread.sleep(500);

		SelectCommandSearch();

		// GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// WebDriverWait wait2= new WebDriverWait(GetDriver(),60);
		// wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='divDisplay']")));
		//
		// GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//
		// WebDriverWait wait3= new WebDriverWait(GetDriver(),60);
		// wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='leftLowerPanelContainer']")));
		//
		// GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//
		// WebElement SearchWithin=
		// GetDriver().findElement(By.xpath("//span[contains(text(),'Search
		// within Records')]"));
		// SearchWithin.click();
		// System.out.println("clicked on search within");

	}

	@Test
	public void CountrySelection() throws Exception {
		// clear button
		Thread.sleep(500);
		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 10);
		WebElement Clear = wait1.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']")));
		Clear.click();
		System.out.println("clicked on clear option");

		Thread.sleep(1000);
		WebElement CountrySelect = GetDriver().findElement(By.id("txtCommandSearch_0_0"));
		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		js.executeScript("document.getElementById('txtCommandSearch_0_0').setAttribute('style', 'display:block')");

		CountrySelect.sendKeys("ASN:canon AND PBC:US AND IC:A01K*");
		System.out.println("entered search term of BCTOF in cmd");

		Thread.sleep(500);

		// getcount
		WebDriverWait wait3 = new WebDriverWait(GetDriver(), 60);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@ng-click='getCount()']")));
		WebElement getCountBtn = GetDriver().findElement(By.xpath("//a[@ng-click='getCount()']"));
		System.out.println(getCountBtn.getText());

		((JavascriptExecutor) GetDriver()).executeScript("window.scrollTo(0," + getCountBtn.getLocation().y + ")");
		getCountBtn.click();
		System.out.println("clicked on get count");

		GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		// query analyzer
		GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		JavascriptExecutor jss = (JavascriptExecutor) GetDriver();// WebDriver
																	// instance
																	// type cast
																	// into
																	// JavascriptExecutor
																	// interface

		WebElement QueryAnalyzer = GetDriver()
				.findElement(By.xpath("//div[@id='ContentPlaceHolder1_lblCntrl_lblSearchCount']"));
		jss.executeScript("arguments[0].click();", QueryAnalyzer);

		System.out.println(QueryAnalyzer.getText());

		GoToHomePage();

		SelectCommandSearch();

	}

	@Test
	public void LimitByASN() throws Exception {
		SelectCommandSearch();

		Thread.sleep(2000);

		SpellCheck();

		Thread.sleep(500);

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement EnterQuery = GetDriver().findElement(By.id("txtSpellCheck"));
		js.executeScript("arguments[0].click();", EnterQuery);

		// used for blocking hidden element
		JavascriptExecutor jss = (JavascriptExecutor) GetDriver();
		jss.executeScript("document.getElementById('txtCommandSearch_0_0').setAttribute('style', 'display:block')");
		GetDriver().findElement(By.xpath("//textarea[@id='txtSpellCheck']")).clear();
		EnterQuery.sendKeys(
				"TAC:(hybrid vehicle OR (Automatic Transmission)) AND ASN:(GENERAL MOTORS CO) AND PBD:([2008-01-01 TO 2018-10-15]) AND DOM:(mechanical OR (MECHANICAL ENGINEERING) OR (ELECTRICAL ENGINEERING))");

		System.out.println("entered search term in cmd");

		Thread.sleep(2000);

		WebElement ClickonLimitBy = GetDriver().findElement(By.xpath("//*[@id='btnPromptCancel']"));
		ClickonLimitBy.click();

		Thread.sleep(500);

		WebElement SelectCheckBox = GetDriver()
				.findElement(By.xpath("//*[@id='currentSearchFilterID']/div/div/span/input"));
		SelectCheckBox.click();

		WebElement SelectDropdown = GetDriver()
				.findElement(By.xpath("//*[@id='currentSearchFilterID']/div/div/select"));
		SelectDropdown.click();

		Thread.sleep(200);

		WebElement SelectASN = GetDriver()
				.findElement(By.xpath("//*[@id='currentSearchFilterID']/div/div/select/option[4]"));
		SelectASN.click();

		Thread.sleep(1000);

		WebElement select_Suggestion1 = GetDriver()
				.findElement(By.xpath("//*[@id='facetMainContainer']/div[2]/div[2]/div[1]/div/div[1]/div[1]/input"));
		select_Suggestion1.click();

		Thread.sleep(400);

		WebElement select_Suggestion2 = GetDriver()
				.findElement(By.xpath("//*[@id='facetMainContainer']/div[2]/div[2]/div[2]/div/div[1]/div[1]/input"));
		select_Suggestion2.click();

		Thread.sleep(500);

		// apply
		WebElement Apply = GetDriver()
				.findElement(By.xpath("//div[contains(@class,'btn btn-primary patentFieldBtn1')]"));
		Apply.click();

		Thread.sleep(1000);

		GetCountSearch_CMD();

		Thread.sleep(1000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC: CN204164322U ");

		Thread.sleep(5000);

		ApplyFilter();

		Thread.sleep(2000);

		// validation using assert
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Filling port for automatic transmission oil cooler";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(2000);

		GoToHomePage();

		Thread.sleep(500);

		SelectCommandSearch();

		Thread.sleep(1000);

		// clear
		WebElement clear = GetDriver().findElement(By.xpath("//div[@class='floatLeft leftSpacer']"));
		clear.click();
		System.out.println("clicked on clear option");
	}

	@Test
	public void LimitByTopics() throws Exception {

		// clear
		SelectCommandSearch();

		Thread.sleep(2000);

		SpellCheck();

		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement EnterQuery = GetDriver().findElement(By.id("txtSpellCheck"));
		js.executeScript("arguments[0].click();", EnterQuery);

		// used for blocking hidden element
		JavascriptExecutor jss = (JavascriptExecutor) GetDriver();
		jss.executeScript("document.getElementById('txtCommandSearch_0_0').setAttribute('style', 'display:block')");
		GetDriver().findElement(By.xpath("//textarea[@id='txtSpellCheck']")).clear();
		EnterQuery.sendKeys(
				"TAC:(hybrid vehicle OR (Automatic Transmission)) AND ASN:(GENERAL MOTORS CO) AND PBD:([2008-01-01 TO 2018-10-15]) AND DOM:(mechanical OR (MECHANICAL ENGINEERING) OR (ELECTRICAL ENGINEERING))");

		System.out.println("entered search term in cmd");

		Thread.sleep(2000);

		WebElement ClickonLimitBy = GetDriver().findElement(By.xpath("//*[@id='btnPromptCancel']"));
		ClickonLimitBy.click();

		Thread.sleep(1000);

		WebElement SelectCheckBox = GetDriver()
				.findElement(By.xpath("//*[@id='currentSearchFilterID']/div/div/span/input"));
		SelectCheckBox.click();
		SelectCheckBox.isSelected();

		WebElement SelectDropdown = GetDriver()
				.findElement(By.xpath("//*[@id='currentSearchFilterID']/div/div/select"));
		SelectDropdown.click();
		SelectDropdown.isSelected();

		Thread.sleep(500);

		WebElement selectTopic = GetDriver()
				.findElement(By.xpath("//*[@id='currentSearchFilterID']/div/div/select/option[19]"));
		selectTopic.click();
		selectTopic.isSelected();

		WebElement sugasn = GetDriver()
				.findElement(By.xpath("//*[@id='facetMainContainer']/div[2]/div[2]/div[1]/div/div[1]/div[1]/input"));
		sugasn.click();
		sugasn.isSelected();

		WebElement sugasn2 = GetDriver()
				.findElement(By.xpath("//*[@id='facetMainContainer']/div[2]/div[2]/div[2]/div/div[1]/div[1]/input"));
		sugasn2.click();
		sugasn2.isSelected();

		Thread.sleep(1000);

		// apply
		WebElement Apply = GetDriver().findElement(By.xpath("//div[@class='btn btn-primary patentFieldBtn1'][contains(text(),'Apply')]"));
		Apply.click();

		Thread.sleep(1000);

		GetCountSearch_CMD();

		Thread.sleep(1000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC:  CN201769689U ");

		Thread.sleep(5000);

		ApplyFilter();

		Thread.sleep(1000);

		// validation using assert
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Electronic transmission and automotive vehicle";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(2000);

		GoToHomePage();

		Thread.sleep(500);

		SelectCommandSearch();

		Thread.sleep(1000);

		// clear
		WebElement clear = GetDriver().findElement(By.xpath("//div[@class='floatLeft leftSpacer']"));
		clear.click();
		System.out.println("clicked on clear option");

	}

	@Test
	public void LimitByActiveRecords() throws Exception {
		Thread.sleep(2000);

		SpellCheck();

		Thread.sleep(500);

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();// WebDriver
																	// instance
																	// type cast
																	// into
																	// JavascriptExecutor
																	// interface
		WebElement EnterQuery = GetDriver().findElement(By.id("txtSpellCheck"));
		js.executeScript("arguments[0].click();", EnterQuery);

		// used for blocking hidden element
		JavascriptExecutor jss = (JavascriptExecutor) GetDriver();
		jss.executeScript("document.getElementById('txtCommandSearch_0_0').setAttribute('style', 'display:block')");
		GetDriver().findElement(By.xpath("//textarea[@id='txtSpellCheck']")).clear();
		EnterQuery.sendKeys(
				"TAC:(hybrid vehicle OR (Automatic Transmission)) AND ASN:(GENERAL MOTORS CO) AND PBD:([2008-01-01 TO 2018-10-15]) AND DOM:(mechanical OR (MECHANICAL ENGINEERING) OR (ELECTRICAL ENGINEERING))");

		System.out.println("entered search term in cmd");

		Thread.sleep(2000);

		WebElement ClickonLimitBy = GetDriver().findElement(By.xpath("//*[@id='btnPromptCancel']"));
		ClickonLimitBy.click();

		Thread.sleep(500);

		WebElement SelectCheckBox = GetDriver().findElement(By.xpath("//*[@id='restrictOpId']/div[1]/label[1]/input"));
		SelectCheckBox.click();

		Thread.sleep(500);

		// apply
		WebElement Apply = GetDriver().findElement(By.xpath("//div[@class='btn btn-primary patentFieldBtn1']"));
		Apply.click();

		Thread.sleep(1000);

		GetCountSearch_CMD();

		Thread.sleep(1000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys("   PNC:  CN201769689U ");

		Thread.sleep(5000);

		ApplyFilter();

		Thread.sleep(1000);

		// validation using assert
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Electronic transmission and automotive vehicle";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(2000);

		GoToHomePage();

		Thread.sleep(500);

		SelectCommandSearch();

		Thread.sleep(1000);
		// clear
		WebElement clear = GetDriver().findElement(By.xpath("//div[@class='floatLeft leftSpacer']"));
		clear.click();
		System.out.println("clicked on clear option");

	}

	@Test
	public void EditSearch() throws Exception {
		Thread.sleep(2000);

		SpellCheck();

		Thread.sleep(500);

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();// WebDriver
																	// instance
																	// type cast
																	// into
																	// JavascriptExecutor
																	// interface
		WebElement EFAMOF = GetDriver().findElement(By.id("txtSpellCheck"));
		js.executeScript("arguments[0].click();", EFAMOF);

		// used for blocking hidden element
		JavascriptExecutor jss = (JavascriptExecutor) GetDriver();
		jss.executeScript("document.getElementById('txtCommandSearch_0_0').setAttribute('style', 'display:block')");
		GetDriver().findElement(By.xpath("//textarea[@id='txtSpellCheck']")).clear();
		EFAMOF.sendKeys(
				"            EFAMOF(T: (nano* wd3 (fabric OR fiber* OR fibre* OR textile*) OR nanofabric OR nanotextile* OR nanofiber* OR nanofibre*)) AND PNC:US10487212B2   ");

		System.out.println("entered search term of EFAMOF in cmd");

		Thread.sleep(2000);

		GetCountSearch_CMD();

		Thread.sleep(3000);

		// validation using assert
		WebDriverWait wait2 = new WebDriverWait(GetDriver(), 60);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		WebElement validate = GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		System.out.println("s1 : " + validate.getText());

		String actualText = "Thermally stable color pigments with nanofiber coating";
		Assert.assertEquals(validate.getText(), actualText);

		Thread.sleep(2000);

		WebElement ClickonEditSearch = GetDriver().findElement(By.xpath("//*[@id='btnEditMode']"));
		ClickonEditSearch.click();

		Thread.sleep(3000);

		TAIX();

	}

}
