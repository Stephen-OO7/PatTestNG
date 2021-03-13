package SearchForms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import Login.BaseTest;

public class Tools extends BaseTest {
	@Test

	public void SelectQuicksearch() throws Exception {
		/*********
		 * code for clicking on quick search from search dropdown
		 *********/

		GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();

		WebElement quick = GetDriver().findElement(By.xpath("//a[@href='Search#/quick']"));
		js.executeScript("arguments[0].click();", quick);

		Thread.sleep(3000);
	}

	@Test
	public void Translator() throws Exception {
		Thread.sleep(1000);

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 30);
		wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(
				"//span[@class='col-xs-2 col-sm-2 col-md-2 col-lg-2 mdi mdi-translate medium CS_ToolIconMenu handPointer']")));
		WebElement clickonChem = GetDriver().findElement(By.xpath(
				"//span[@class='col-xs-2 col-sm-2 col-md-2 col-lg-2 mdi mdi-translate medium CS_ToolIconMenu handPointer']"));
		clickonChem.click();

		WebDriverWait wait2 = new WebDriverWait(GetDriver(), 30);
		wait2.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//textarea[@id='txtOrg']")));

		WebElement search = GetDriver().findElement(By.xpath("//textarea[@id='txtOrg']"));
		search.sendKeys("fiber");

		WebElement Translate = GetDriver().findElement(By.xpath("//span[contains(text(),'Translate')]"));
		Translate.click();

		WebElement validate = GetDriver().findElement(By.xpath("//div[@id='txtTranslation']"));
		System.out.println(validate.getText());

		Thread.sleep(1000);

		WebElement cancelPanel = GetDriver().findElement(By.xpath("//h4[contains(text(),'Translate')]"));
		cancelPanel.isSelected();

		WebElement cancel = GetDriver().findElement(By.xpath(
				"//div[contains(@class,'modal-content ng-scope')]//button[contains(@class,'close')][contains(text(),'×')]"));
		cancel.click();

	}

	@Test
	public void SyntaxConversion() throws Exception {
		Thread.sleep(1000);

		// checking thomson rft point
		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 30);
		wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(
				"//div[@class='col1-lg11-offset-4 combineTempContainer CS_template well col-xs-12 col-sm-12 col-md-12 col-lg-12 ng-scope']")));
		WebElement clickonSyntaxConv = GetDriver().findElement(By.xpath(
				"//span[@class='col-xs-2 col-sm-2 col-md-2 col-lg-2 mdi mdi-format-rotate-90 medium CS_ToolIconMenu handPointer']"));
		clickonSyntaxConv.click();

		WebDriverWait wait2 = new WebDriverWait(GetDriver(), 30);
		wait2.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//textarea[@id='txtInput']")));
		WebElement getText = GetDriver().findElement(By.xpath("//textarea[@id='txtInput']"));
		getText.sendKeys(
				"           (IC=(A61B or A62C or A63F or B41J or C12Q)) AND CTB=(sensor?) AND CTB=((detect or find) and (input or signal) AND CTB=(method and produc* and (sensor? or actuator? or transducer)) AND (AY>=(1996) AND AY<=(2017)) OR CTB=((motion or strain gauge or stress or pressure or radio*) and (sensor? or actuator? or transducer)) AND (AY>=(1996) AND AY<=(2017)) OR AND (AY>=(1996) AND AY<=(2017)) OR (AY>=(1996) AND AY<=(2017)) AND CTB=(antibody or antigen or peptide or protein or DNA or enzyme or RNA or polymer or nanoparticle)           ");

		WebElement from = GetDriver().findElement(By.xpath("//input[@id='txtOptionSyntax']"));
		from.sendKeys("thomson");

		WebElement Convert = GetDriver().findElement(By.xpath("//span[@class='btn btn-primary']"));
		Convert.click();

		WebElement validateThomson = GetDriver().findElement(By.xpath("//div[@id='txtoutput']"));
		System.out.println(validateThomson.getText());

		Thread.sleep(500);

		WebElement clear = GetDriver().findElement(By.xpath("//span[@class='btn btn-link']"));
		clear.click();

		// checking USPTO rft point
		WebDriverWait wait3 = new WebDriverWait(GetDriver(), 30);
		wait3.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//textarea[@id='txtInput']")));
		WebElement getTextSC = GetDriver().findElement(By.xpath("//textarea[@id='txtInput']"));
		getTextSC.sendKeys(
				"            ttl/needle or ttl/syringe and abst/(needle or syringe) and not aclm/(sew or thread$)           ");

		WebElement fromDatabase = GetDriver().findElement(By.xpath("//input[@id='txtOptionSyntax']"));
		fromDatabase.sendKeys("USPTO");

		WebElement Convert2 = GetDriver().findElement(By.xpath("//span[@class='btn btn-primary']"));
		Convert2.click();

		WebElement validate = GetDriver().findElement(By.xpath("//div[@id='txtoutput']"));
		System.out.println(validate.getText());

		Thread.sleep(10000);

		WebElement cancelPanel = GetDriver().findElement(By.xpath("//h4[contains(text(),'Syntax Converter')]"));
		cancelPanel.isSelected();

		WebElement cancel = GetDriver().findElement(
				By.xpath("//div[@class='modal-content ng-scope']//button[@class='close'][contains(text(),'×')]"));
		cancel.click();

	}

	@Test
	public void ClassDefination() throws Exception {
		Thread.sleep(1000);

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 30);
		wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(
				"//div[@class='col1-lg11-offset-4 combineTempContainer CS_template well col-xs-12 col-sm-12 col-md-12 col-lg-12 ng-scope']")));

		WebElement ClickONClassDef = GetDriver().findElement(By.xpath(
				"//span[@class='col-xs-2 col-sm-2 col-md-2 col-lg-2 mdi mdi-format-list-bulleted-type medium CS_ToolIconMenu handPointer']"));
		ClickONClassDef.click();

		// search class number
		WebElement classNo = GetDriver()
				.findElement(By.xpath("//input[@id='ContentPlaceHolder1_searchClassControl_txtClassNo']"));
		classNo.sendKeys("C07*");

		WebElement Search = GetDriver()
				.findElement(By.xpath("//div[@id='ContentPlaceHolder1_searchClassControl_cmdSearch']"));
		Search.click();

		// validation
		// WebElement
		// validate=GetDriver().findElement(By.xpath("//tr[2]//td[3]//table[1]//tbody[1]//tr[3]//td[2]//def[1]"));
		// System.out.println("s1 : "+validate.getText());
		//
		// String actualText="GENERAL METHODS OF ORGANIC CHEMISTRY; APPARATUS
		// THEREFOR ";
		// Assert.assertEquals(validate.getText(), actualText);
		// Thread.sleep(500);

		GetDriver().findElement(By.xpath("//input[@id='ContentPlaceHolder1_searchClassControl_txtClassNo']")).clear();

		// search by text
		WebElement ByText = GetDriver()
				.findElement(By.xpath("//textarea[@id='ContentPlaceHolder1_searchClassControl_txtClassDef']"));
		ByText.sendKeys("Enzyme");

		WebElement SearchText = GetDriver()
				.findElement(By.xpath("//div[@id='ContentPlaceHolder1_searchClassControl_cmdSearch']"));
		SearchText.click();

		// validation
		// WebElement
		// validateText=GetDriver().findElement(By.xpath("//tr[1]//td[3]//table[1]//tbody[1]//tr[1]//td[2]"));
		// System.out.println("s1 : "+validate.getText());
		//
		// String actualTextvalidate="HUMAN NECESSITIES";
		// Assert.assertEquals(validateText.getText(), actualTextvalidate);
		// Thread.sleep(5000);

		for (int i = 0; i <= 2; i++) {
			try {
				GetDriver()
						.findElement(
								By.xpath("//div[@id='divSearchClasses']//button[@class='close'][contains(text(),'×')]"))
						.click();
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		Thread.sleep(500);

		// GoToHomePage();

		// WebElement
		// close=GetDriver().findElement(By.xpath("//div[@id='divSearchClasses']//button[@class='close'][contains(text(),'×')]"));
		// close.click();

	}

	@Test
	public void CalssDefByText() throws Exception {
		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 30);
		wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(
				"//div[@class='col1-lg11-offset-4 combineTempContainer CS_template well col-xs-12 col-sm-12 col-md-12 col-lg-12 ng-scope']")));

		WebElement ClickONClassText = GetDriver().findElement(By.xpath(
				"//span[@class='col-xs-2 col-sm-2 col-md-2 col-lg-2 mdi mdi-format-list-bulleted-type medium CS_ToolIconMenu handPointer']"));
		ClickONClassText.click();

		WebElement getText = GetDriver()
				.findElement(By.xpath("//div[@id='ContentPlaceHolder1_searchClassControl_classSearchResult']"));
		System.out.println(getText.getText());

	}

	@Test
	public void ChemLookup() throws Exception {
		Thread.sleep(1000);

		// WebDriverWait wait1= new WebDriverWait(GetDriver(),30);
		// wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='col1-lg11-offset-4
		// combineTempContainer CS_template well col-xs-12 col-sm-12 col-md-12
		// col-lg-12 ng-scope']")));
		WebElement clickonChem = GetDriver().findElement(By.xpath(
				"//span[@class='col-xs-2 col-sm-2 col-md-2 col-lg-2 mdi mdi-vector-circle medium CS_ToolIconMenu handPointer']"));
		clickonChem.click();

		WebElement search = GetDriver()
				.findElement(By.xpath("//input[@id='ContentPlaceHolder1_chemIndexCtrl_txtSearchBox']"));
		search.sendKeys("Benzene");

		WebElement verify = GetDriver().findElement(By.xpath("//a[@id='ContentPlaceHolder1_chemIndexCtrl_btnVerify']"));
		verify.click();

		WebDriverWait wait2 = new WebDriverWait(GetDriver(), 30);
		wait2.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(
				"//div[@id='ContentPlaceHolder1_chemIndexCtrl_divChemLookupContainer']//div[@class='modal-header ui-draggable-handle']")));

		WebElement ClickonBenzene = GetDriver().findElement(By.xpath("//td[@id='patseerSelectorItemBox']"));
		ClickonBenzene.click();

		Thread.sleep(2000);
		WebElement validateDetails = GetDriver()
				.findElement(By.xpath("//div[@id='ContentPlaceHolder1_chemIndexCtrl_divChemicalDetails']"));
		System.out.println(validateDetails.getText());

		Thread.sleep(1000);

		WebElement selectMolecularFormulas = GetDriver()
				.findElement(By.xpath("//div[@id='grpmolecularformula']//input[@name='chemCheck']"));
		selectMolecularFormulas.click();

		Thread.sleep(500);

		WebElement selectSynonyms = GetDriver().findElement(By.xpath("//input[@value='Pyrobenzol']"));
		selectSynonyms.click();

		Thread.sleep(500);

		WebElement createString = GetDriver().findElement(By.xpath(
				"//div[@id='ContentPlaceHolder1_chemIndexCtrl_btnCreateSearchString1'][contains(text(),'Create Search String')]"));
		createString.click();

		Thread.sleep(800);

		WebElement validate = GetDriver().findElement(By.xpath("//textarea[@id='ContentPlaceHolder1_chemIndexCtrl_txtSearchString']"));
		System.out.println("s1 : " + validate.getText());

		Thread.sleep(500);
		
		WebElement cancelPanel = GetDriver().findElement(By.xpath("//h4[contains(text(),'Chemical Lookup')]"));
		cancelPanel.isSelected();

		WebElement cancel = GetDriver().findElement(By.xpath(
				"//div[@id='ContentPlaceHolder1_chemIndexCtrl_divChemLookupContainer']//button[@class='close'][contains(text(),'×')]"));
		cancel.click();

		Thread.sleep(500);
		
		GoToHomePage();

	}

	@Test
	public void CorporateTree() throws Exception {
		Thread.sleep(1000);

		WebDriverWait wait1 = new WebDriverWait(GetDriver(), 30);
		wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(
				"//span[@class='col-xs-2 col-sm-2 col-md-2 col-lg-2 mdi mdi-pine-tree medium CS_ToolIconMenu handPointer']")));
		WebElement clickonChem = GetDriver().findElement(By.xpath(
				"//span[@class='col-xs-2 col-sm-2 col-md-2 col-lg-2 mdi mdi-pine-tree medium CS_ToolIconMenu handPointer']"));
		clickonChem.click();

		WebDriverWait wait2 = new WebDriverWait(GetDriver(), 30);
		wait2.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='pasncorpdivstyle']")));

		WebElement search = GetDriver()
				.findElement(By.xpath("//input[@class='pasncorpinputbox ng-pristine ng-untouched ng-valid']"));
		search.sendKeys("fujitsu");

		WebElement Lookup = GetDriver().findElement(By.xpath("//span[@class='patseer_button']"));
		Lookup.click();

		WebElement GEtData = GetDriver().findElement(By.xpath("//div[@id='maincorptree']//div[@class='modal-body']"));
		GEtData.getText();

		WebElement SearchSubsidiaries = GetDriver()
				.findElement(By.xpath("//div[@id='ContentPlaceHolder1_searchOpId']//div[3]//span[1]//span[2]"));
		SearchSubsidiaries.click();

		// on result page
		GetDriver().manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);

		// iframe
		// WebElement iframeElement =
		// GetDriver().findElement(By.id("resultFrameID"));
		// GetDriver().switchTo().frame(iframeElement);

		Thread.sleep(500);

		// validation using assert
		// WebElement
		// validate=GetDriver().findElement(By.xpath("//label[contains(text(),'CIRCUIT
		// BOARD AND MANUFACTURING METHOD THEREOF')]"));
		// System.out.println("s1 : "+validate.getText());
		//
		// String actualText="CIRCUIT BOARD AND MANUFACTURING METHOD THEREOF";
		// Assert.assertEquals(validate.getText(), actualText);
		// Thread.sleep(500);

		GoToHomePage();

		SelectQuicksearch();

	}

	@Test
	public void FieldCodes() throws Exception {
		Thread.sleep(1000);

		// WebDriverWait wait1= new WebDriverWait(GetDriver(),30);
		// wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[contains(@class,'col-xs-2
		// col-sm-2 col-md-2 col-lg-2 mdi mdi-code-tags-check medium
		// CS_ToolIconMenu handPointer')]")));
		WebElement SearchFieldCodes = GetDriver().findElement(By.xpath(
				"//span[@class='col-xs-2 col-sm-2 col-md-2 col-lg-2 mdi mdi-code-tags-check medium CS_ToolIconMenu handPointer']"));
		SearchFieldCodes.click();

		WebDriverWait wait2 = new WebDriverWait(GetDriver(), 30);
		wait2.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.xpath("//span[@id='fieldframe']//input[contains(@placeholder,'Search')]")));

		WebElement search = GetDriver()
				.findElement(By.xpath("//span[@id='fieldframe']//input[contains(@placeholder,'Search')]"));
		search.sendKeys("forward citation");

		WebElement validate = GetDriver()
				.findElement(By.xpath("//div[@class='SF_FieldCodeHeight1 searchScriptHeight']"));
		System.out.println(validate.getText());

		Thread.sleep(1000);

		WebElement cancelPanel = GetDriver().findElement(By.xpath("//div[@class='header h4 floatLeft width100']"));
		cancelPanel.isSelected();

		WebElement cancel = GetDriver().findElement(By.xpath(
				"//div[@class='header h4 floatLeft width100']//div[@class='floatRight mdi mdi-close handPointer patseerClassToolTipClose closeBtnPadding']"));
		cancel.click();

	}
}
