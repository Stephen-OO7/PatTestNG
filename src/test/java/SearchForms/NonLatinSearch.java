package SearchForms;

import java.sql.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import Login.BaseTest;

public class NonLatinSearch extends BaseTest {
	@Test
	public void SelectNonLatin() throws InterruptedException {

		Thread.sleep(1000);

		GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement NonLatin = GetDriver().findElement(By.xpath("//a[@href='Search#/nonLatin']"));
		js.executeScript("arguments[0].click();", NonLatin);

		Thread.sleep(1000);

	}

	@Test
	public void Clear() throws Exception {
		Thread.sleep(1000);

		WebElement ClickonClear = GetDriver().findElement(By.xpath("//*[@id='scriptContainer']/div[2]/div[4]/a"));
		ClickonClear.click();

		Thread.sleep(1000);

		/*
		 * //Clear JavascriptExecutor js = (JavascriptExecutor)GetDriver();
		 * GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 * WebElement Clear3= GetDriver().findElement(By.xpath(
		 * "//*[@id='scriptContainer']/div[2]/div[4]"));
		 * js.executeScript("arguments[0].click();",Clear3);
		 */
	}

	@Test
	public void GetCountSearch_NonLatin() throws Exception {
		// get count

		Thread.sleep(1000);

		WebDriverWait wait3 = new WebDriverWait(GetDriver(), 60);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Get Count')]")));
		WebElement getCountBtn = GetDriver().findElement(By.xpath("//a[contains(text(),'Get Count')]"));
		System.out.println(getCountBtn.getText());

		((JavascriptExecutor) GetDriver()).executeScript("window.scrollTo(0," + getCountBtn.getLocation().y + ")");
		getCountBtn.click();
		System.out.println("clicked on get count");

		Thread.sleep(1000);

		// search
		WebElement search = GetDriver().findElement(By.xpath("//a[@id='searchId']"));
		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		js.executeScript("arguments[0].click();", search);
		System.out.println("clicked on search");

		// on result page

		Thread.sleep(2000);

	}

	@Test
	public void Japanese() throws Exception {

		SelectNonLatin();

		Thread.sleep(1000);

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[@id='JP_ID']//div[@class='fieldSearchMainDivStyle ng-scope']")));
		System.out.println("in japanese tab");

		Thread.sleep(500);

		WebElement TAJA = GetDriver().findElement(By.xpath("//textarea[@propertyname='TAJA']"));
		TAJA.sendKeys("  燃料 AND エンジン    ");
		System.out.println("entered search term in TAJA");

		GetCountSearch_NonLatin();

		Thread.sleep(2000);
		// search within
		// SearchWithin();
		//
		// Thread.sleep(1000);
		//
		// WebElement
		// SearchNo=GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		// SearchNo.sendKeys(" PNC:JP2017143676A ");
		//
		// Thread.sleep(5000);
		//
		// ApplyFilter();
		//
		// Thread.sleep(5000);
		// //validation using assert
		// WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
		// wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='lblTtl']")));
		// WebElement
		// validate=GetDriver().findElement(By.xpath("//label[@id='lblTtl']"));
		// System.out.println("s1 : "+validate.getText());
		//
		// String actualText="POWER GENERATION/SUPPLY METHOD";
		// Assert.assertEquals(validate.getText(), actualText);
		//
		// Thread.sleep(1000);

		GoToHomePage();

		SelectNonLatin();

		Clear();

	}

	@Test
	public void Chinese() throws Exception {

		SelectNonLatin();

		Thread.sleep(1000);

		WebElement chinese = GetDriver().findElement(By.xpath("//a[contains(text(),'(Chinese)')]"));
		chinese.click();

		Thread.sleep(1000);

		WebElement TAZH = GetDriver().findElement(By.xpath("//*[@id='CN_ID']/div/div/div[1]/div[1]/div/textarea"));
		TAZH.sendKeys("  发动机 NOT 汽油   ");

		Thread.sleep(1000);

		GetCountSearch_NonLatin();

		Thread.sleep(1000);

		// validation using assert
		// WebElement
		// validate=GetDriver().findElement(By.xpath("//div[@id='trnumber_WO2019192289A1']//label[@id='lblTtl']"));
		// System.out.println("s1 : "+validate.getText());
		//
		// String actualText="METHOD FOR IMPROVING EFFECTIVE THERMAL EFFICIENCY
		// OF ENGINE AND POWER TRANSMISSION MECHANISM PREPARED BY MEANS OF
		// SAME";
		// Assert.assertEquals(validate.getText(), actualText);
		// Thread.sleep(500);

		GoToHomePage();

		Thread.sleep(1000);

		SelectNonLatin();

		Clear();

	}

	@Test
	public void Korean() throws Exception {

		Thread.sleep(1000);
		
		WebElement Korean = GetDriver().findElement(By.xpath("//a[contains(text(),'(Korean)')]"));
		Korean.click();

		Thread.sleep(1000);
		
		WebElement TAKR = GetDriver().findElement(By.xpath("//*[@id='KR_ID']/div/div/div[1]/div[1]/div/textarea"));
		TAKR.sendKeys("    엔진 OR 연료    ");

		Thread.sleep(1000);
		
		GetCountSearch_NonLatin();

		Thread.sleep(3000);

		// validation using assert
		// WebElement
		// validate=GetDriver().findElement(By.xpath("//label[contains(text(),'GAS
		// TREATMENT SYSTEM AND SHIP INCLUDING SAME')]"));
		// System.out.println("s1 : "+validate.getText());
		//
		// String actualText="GAS TREATMENT SYSTEM AND SHIP INCLUDING SAME";
		// Assert.assertEquals(validate.getText(), actualText);

		GoToHomePage();

		Thread.sleep(1000);

		SelectNonLatin();
		
		Clear();

	}

	@Test
	public void Thai() throws Exception {

		Thread.sleep(1000);
		
		WebElement Thai = GetDriver().findElement(By.xpath("//a[contains(text(),'(Thai)')]"));
		Thai.click();

		Thread.sleep(1000);
		
		WebElement TATH = GetDriver().findElement(By.xpath("//*[@id='TH_ID']/div/div/div[1]/div[1]/div/textarea"));
		TATH.sendKeys("  เครื่องยนต์ NOT เชื้อเพลิง   ");

		Thread.sleep(1000);
		
		GetCountSearch_NonLatin();

		Thread.sleep(1000);

		// validation using assert
		// WebElement
		// validate=GetDriver().findElement(By.xpath("//label[contains(text(),'DC
		// electric motor modified from engine alternator')]"));
		// System.out.println("s1 : "+validate.getText());
		//
		// String actualText="DC electric motor modified from engine
		// alternator";
		// Assert.assertEquals(validate.getText(), actualText);

		GoToHomePage();

		Thread.sleep(1000);

		SelectNonLatin();
		
		Clear();

	}

	@Test
	public void AllFields() throws Exception {
		
		Thread.sleep(1000);

		WebElement chinese = GetDriver().findElement(By.xpath("//a[contains(text(),'(Chinese)')]"));
		chinese.click();

		Thread.sleep(1000);
		
		WebElement ASNNL = GetDriver().findElement(By.xpath("//div[@id='CN_ID']//div[4]//div[1]//textarea[1]"));
		ASNNL.sendKeys("  トヨタ自動車   ");

		Thread.sleep(500);
		
		WebElement INVNL = GetDriver().findElement(By.xpath("//div[@id='CN_ID']//div[5]//div[1]//textarea[1]"));
		INVNL.sendKeys("  小島進     ");
		
		Thread.sleep(500);

		WebElement ATNNL = GetDriver().findElement(By.xpath("//*[@id='CN_ID']/div/div/div[1]/div[6]/div/textarea"));
		ATNNL.sendKeys("   陳建   ");
		
		Thread.sleep(1000);

		// get count
		WebDriverWait wait3 = new WebDriverWait(GetDriver(), 60);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Get Count')]")));
		WebElement getCountBtn = GetDriver().findElement(By.xpath("//a[contains(text(),'Get Count')]"));
		System.out.println(getCountBtn.getText());

		((JavascriptExecutor) GetDriver()).executeScript("window.scrollTo(0," + getCountBtn.getLocation().y + ")");
		getCountBtn.click();
		System.out.println("clicked on get count");
		Thread.sleep(500);

		WebElement Querybuilder = GetDriver()
				.findElement(By.xpath("//div[@id='ContentPlaceHolder1_lblCntrl_lblSearchCount']"));
		System.out.println(Querybuilder.getText());

		Thread.sleep(1000);
		
		GoToHomePage();

		Thread.sleep(1000);
		
		SelectNonLatin();
		Clear();

	}

	@Test
	public void QueryPreview() throws Exception {
		
		Thread.sleep(1000);

		WebElement chinese = GetDriver().findElement(By.xpath("//a[contains(text(),'(Chinese)')]"));
		chinese.click();

		Thread.sleep(1000);
		
		WebElement TACZH = GetDriver().findElement(By.xpath("//*[@id='CN_ID']/div/div/div[1]/div[2]/div/textarea"));
		TACZH.sendKeys("   发动机 OR 汽油      ");

		Thread.sleep(1000);
		
		WebElement QueryPreviewBox = GetDriver().findElement(By.xpath("//div[@class='CodeMirror-scroll']"));
		System.out.println(QueryPreviewBox.getText());

		Thread.sleep(1000);
		
		GoToHomePage();

		Thread.sleep(1000);
		
	}

	@Test
	public void PBD() throws Exception {
		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='JP_li']")));
		System.out.println("in japanese tab");

		WebElement TAJA = GetDriver().findElement(By.xpath("//textarea[@propertyname='TAJA']"));
		TAJA.sendKeys("  Ã§â€¡Æ’Ã¦â€“â„¢ AND Ã£â€šÂ¨Ã£Æ’Â³Ã£â€šÂ¸Ã£Æ’Â³   ");
		System.out.println("entered search term in TAJA");

		// date
		GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		WebDriverWait wait2 = new WebDriverWait(GetDriver(), 60);
		wait2.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.xpath("//div[@id='JP_ID']//div[@class='floatLeft width50']//div[1]")));

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement PubDate = GetDriver().findElement(By.id("JP_ID"));
		js.executeScript("arguments[0].click();", PubDate);
		PubDate.sendKeys("2000");

		// WebElement PubDate=
		// GetDriver().findElement(By.xpath("//body//div//div//div//div//div//div//div//div//div//div//div//div[1]//div[1]//div[1]//div[11]//div[1]//div[3]//div[1]//input[2]"));
		// PubDate.sendKeys("2010");

		WebElement date1 = GetDriver().findElement(By.xpath("//div[@class='modelContainer_2']//input[2]"));
		date1.sendKeys("2002");

		GetCountSearch_NonLatin();

		//
		// WebElement EnableScript=
		// GetDriver().findElement(By.xpath("//span[@class='floatLeft']//input[@id='Checkbox1']"));
		// EnableScript.click();

	}

	@Test
	public void SearchScript() throws Exception {
		Thread.sleep(1000);

		WebElement Thai = GetDriver().findElement(By.xpath("//li[@id='TH_li']"));
		Thai.click();

		Thread.sleep(1000);

		WebElement TATH = GetDriver().findElement(By.xpath("//textarea[@propertyname='TATH']"));
		TATH.sendKeys("  เครื่องยนต์ NOT เชื้อเพลิง   ");

		Thread.sleep(1000);

		// Searchscript
		WebElement EnableCheckBox = GetDriver()
				.findElement(By.xpath("//span[@class='floatLeft']//input[@id='Checkbox1']"));
		EnableCheckBox.click();

		Thread.sleep(1500);

		WebElement ClickonPlus = GetDriver()
				.findElement(By.xpath("//*[@id='SearchScriptRecordingContainer']/span[4]/i"));
		ClickonPlus.click();

		Thread.sleep(1000);

		Date d = new Date(System.currentTimeMillis());
		GetDriver().findElement(By.xpath("//*[@id='AddSearchScriptDialog']/div/div[2]/input")).sendKeys("Script" + d);

		Thread.sleep(500);

		WebElement ClickonAdd = GetDriver().findElement(By.xpath("//*[@id='AddSearchScriptDialog']/div/div[3]/input"));
		ClickonAdd.click();

		Thread.sleep(1000);

		GetCountSearch_NonLatin();

		Thread.sleep(4000);

		WebElement BackToSearch = GetDriver().findElement(By.xpath("//*[@id='Container']/div/div[1]/div/div[1]"));
		BackToSearch.click();

		Thread.sleep(2000);

		WebElement VerifySearchTerm = GetDriver().findElement(By.xpath(
				"//*[@id='ContentPlaceHolder1_searchScriptCntrl_SavedSearch_SavedSearchTableContainer']/div[2]/table/tbody/tr[2]/td[2]/div[1]/div[1]/div[2]"));
		System.out.println(VerifySearchTerm.getText());

		Thread.sleep(1000);

		GoToHomePage();

		Thread.sleep(1000);

	}

}