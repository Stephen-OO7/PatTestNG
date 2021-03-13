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
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Login.BaseTest;

public class DetailView extends BaseTest {
	@Test
	public void CommonProject_DV() throws Exception {
		GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement commonProj = GetDriver().findElement(By
				.xpath("//span[@class='patseer_Secondary_Button ng-binding'][contains(text(),'Automation_Project')]"));
		js.executeScript("arguments[0].click();", commonProj);

		Thread.sleep(2000);

	}

	@Test
	public void CitationTreeTab() throws Exception {
		CommonProject_DV();

		Thread.sleep(1000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys(" PNC: US6015612A ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(3000);

		WebElement ClickonPNKC = GetDriver().findElement(By.xpath("//label[@id='lblText_US6015612A']"));
		ClickonPNKC.click();

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
		WebElement ClickonFullView = GetDriver().findElement(By.xpath("//a[@id='ui-id-22']"));
		js2.executeScript("arguments[0].click();", ClickonFullView);
		System.out.println("clicked on Click on citation View");

		Thread.sleep(5000);

		// iframe
		WebElement iframeElement = GetDriver().findElement(By.id("frmBackCitation"));
		GetDriver().switchTo().frame(iframeElement);

		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement CitationTree = GetDriver().findElement(By.xpath("//a[@id='ui-id-3']"));
		js.executeScript("arguments[0].click();", CitationTree);
		System.out.println("clicked on CitationTree");

		Thread.sleep(7000);

		// WebElement
		// SelectInv=GetDriver().findElement(By.xpath("//body/form/div/div/div[3]/div[1]/div[2]"));
		// System.out.println(SelectInv.getText());
		// js.executeScript("arguments[0].click();", SelectInv);
		// System.out.println("clicked on 3rd image");
		//
		// Thread.sleep(3000);

		GetDriver().close();
		// change focus back to old tab
		GetDriver().switchTo().window(oldTab);
		System.out.println("tab 1");

		Thread.sleep(500);

		GoToHomePage();

		Thread.sleep(500);

	}

	@Test
	public void FamilyTreeTab() throws Exception {
		CommonProject_DV();

		Thread.sleep(1000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys(" PNC: US6015612A ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(3000);

		WebElement ClickonPNKC = GetDriver().findElement(By.xpath("//label[@id='lblText_US6015612A']"));
		ClickonPNKC.click();

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
		WebElement ClickonFullView = GetDriver().findElement(By.xpath("//a[@id='ui-id-21']"));
		js2.executeScript("arguments[0].click();", ClickonFullView);
		System.out.println("clicked on Click on Family View");

		Thread.sleep(5000);

		// iframe
		WebElement iframeElement = GetDriver().findElement(By.id("frmFamily"));
		GetDriver().switchTo().frame(iframeElement);

		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement FamilyTree = GetDriver().findElement(By.xpath("//a[@id='ui-id-3']"));
		js.executeScript("arguments[0].click();", FamilyTree);
		System.out.println("clicked on Family Tree");

		Thread.sleep(7000);

		// WebElement
		// SelectInv=GetDriver().findElement(By.xpath("//body/form/div/div/div[3]/div[1]/div[2]"));
		// System.out.println(SelectInv.getText());
		// js.executeScript("arguments[0].click();", SelectInv);
		// System.out.println("clicked on 3rd image");
		//
		// Thread.sleep(3000);

		GetDriver().close();
		// change focus back to old tab
		GetDriver().switchTo().window(oldTab);
		System.out.println("tab 1");

		Thread.sleep(500);

		GoToHomePage();

		Thread.sleep(500);

	}

	@Test
	public void ClaimsTreeTab() throws Exception {
		CommonProject_DV();

		Thread.sleep(1000);

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys(" PNC: US6015612A ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(3000);

		WebElement ClickonPNKC = GetDriver().findElement(By.xpath("//label[@id='lblText_US6015612A']"));
		ClickonPNKC.click();

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
		WebElement ClickonclaimsTab = GetDriver().findElement(By.id("claimsTab"));
		js2.executeScript("arguments[0].click();", ClickonclaimsTab);
		System.out.println("clicked on Click on claims Tab");

		Thread.sleep(5000);

		// iframe
		// WebElement iframeElement =
		// GetDriver().findElement(By.id("frmFamily"));
		// GetDriver().switchTo().frame(iframeElement);
		//
		// Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement FamilyTree = GetDriver().findElement(By.xpath("//a[@id='ui-id-6']"));
		js.executeScript("arguments[0].click();", FamilyTree);
		System.out.println("clicked on claims Tree");

		Thread.sleep(7000);

		// WebElement
		// SelectInv=GetDriver().findElement(By.xpath("//body/form/div/div/div[3]/div[1]/div[2]"));
		// System.out.println(SelectInv.getText());
		// js.executeScript("arguments[0].click();", SelectInv);
		// System.out.println("clicked on 3rd image");
		//
		// Thread.sleep(3000);

		GetDriver().close();
		// change focus back to old tab
		GetDriver().switchTo().window(oldTab);
		System.out.println("tab 1");

		Thread.sleep(500);

		GoToHomePage();

		Thread.sleep(500);

	}

	@Test
	public void LoadDrawings() throws Exception {
		CommonProject_DV();

		Thread.sleep(1000);

		// search within
		SearchWithin();

		Thread.sleep(500);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys(" PNC: EP3607002A1 ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(3000);

		WebElement ClickonPNKC = GetDriver().findElement(By.xpath("//*[@id='lblText_EP3607002A1']"));
		ClickonPNKC.click();

		// considering that there is only one tab opened in that point.
		String oldTab = GetDriver().getWindowHandle();

		Thread.sleep(2000);

		ArrayList<String> newTab = new ArrayList<String>(GetDriver().getWindowHandles());
		newTab.remove(oldTab);
		// change focus to new tab
		GetDriver().switchTo().window(newTab.get(0));
		System.out.println("tab 0");

		Thread.sleep(2000);
		JavascriptExecutor js2 = (JavascriptExecutor) GetDriver();
		WebElement ClickonFullView = GetDriver().findElement(By.xpath("//*[@id='ui-id-26']"));
		js2.executeScript("arguments[0].click();", ClickonFullView);
		System.out.println("clicked on ClickonFullView");

		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement LoadMore = GetDriver().findElement(By.xpath("//i[@id='loadimagesID']"));
		js.executeScript("arguments[0].click();", LoadMore);
		System.out.println("clicked on LoadMore");

		WebElement SelectInv = GetDriver().findElement(By.xpath("//*[@id='imagebox_EP3607002A1_2']"));
		js.executeScript("arguments[0].click();", SelectInv);
		System.out.println("clicked on 3rd image");

		Thread.sleep(5000);

		GetDriver().close();
		// change focus back to old tab
		GetDriver().switchTo().window(oldTab);
		System.out.println("tab 1");

		Thread.sleep(500);

		GoToHomePage();

		Thread.sleep(500);

	}

	@Test
	public void SimilarTabQuickList() throws Exception {
		
		Thread.sleep(1000);

		CommonProject_DV();

		// search within
		SearchWithin();

		Thread.sleep(1000);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys(" PNC: US9324234B2 ");

		Thread.sleep(2000);
		
		ApplyFilter();

		Thread.sleep(2000);
		
		WebElement ClickonPNKC = GetDriver().findElement(By.xpath("//label[@id='lblText_US9324234B2']"));
		ClickonPNKC.click();

		// considering that there is only one tab opened in that point.
		String oldTab = GetDriver().getWindowHandle();

		Thread.sleep(1000);
		
		ArrayList<String> newTab = new ArrayList<String>(GetDriver().getWindowHandles());
		newTab.remove(oldTab);

		GetDriver().switchTo().window(newTab.get(0));
		System.out.println("tab 0");

		Thread.sleep(1000);
		
		JavascriptExecutor js2 = (JavascriptExecutor) GetDriver();
		WebElement SimilarTab = GetDriver().findElement(By.xpath("//a[@id='ui-id-23']"));
		js2.executeScript("arguments[0].click();", SimilarTab);
		System.out.println("clicked on Similar tab");

		// select current record tab
//		WebDriverWait wait4 = new WebDriverWait(GetDriver(), 60);
//		wait4.until(ExpectedConditions.visibilityOfElementLocated(By
//				.xpath("//div[@id='ContentPlaceHolder1_detailsViewCntrl_SearchResultsControlNGview_searchResultContainerKIpz17I2uZ']//div[contains(@class,'ng-scope')]//div[contains(@class,'searchResultContainer ui-widget-content floatLeft width100')]//div//div[contains(@class,'action-menu')]//ul[@id='ulResultAction']//li//div//div//i[contains(@class,'mdi mdi-chevron-down')]")))
//				.click();

		Thread.sleep(3000);
		
		WebElement ele1 = GetDriver().findElement(By.xpath("//*[@id='ulResultAction']/li[1]/div/div/span[2]/i"));
		Actions action1 = new Actions(GetDriver());
		action1.moveToElement(ele1).build().perform();
		
		Thread.sleep(1000);
		
		WebElement selectCurrentRecords = GetDriver().findElement(By.xpath(
				"//*[@id='chkCurrentPage']"));
		selectCurrentRecords.click();

		Thread.sleep(2000);
		
		WebElement ele = GetDriver().findElement(By.xpath("//*[@id='ContentPlaceHolder1_detailsViewCntrl_SearchResultsControlNGview_liAdd']/div[1]"));
		Actions action = new Actions(GetDriver());
		action.moveToElement(ele).build().perform();

		WebElement addToProject = GetDriver()
				.findElement(By.xpath("//*[@id='ContentPlaceHolder1_detailsViewCntrl_SearchResultsControlNGview_divAddToProject']"));
		addToProject.click();
		
		Thread.sleep(2000);
		
		Actions a=new Actions(GetDriver());
		
		Date d = new Date(System.currentTimeMillis());		
	    GetDriver().findElement(By.xpath("//input[@id='token-input-txtProjectNameRecent']")).sendKeys("SimilarProject" + d);
	    Thread.sleep(2000);
	    a.sendKeys(Keys.ARROW_DOWN).build().perform();
	    a.sendKeys(Keys.ENTER).build().perform();
	
		Thread.sleep(3000);
		
		WebElement ClickonAdd=GetDriver().findElement(By.xpath("//button[@id='divAPQ']"));
		ClickonAdd.click();
		
		Thread.sleep(5000);
		
		WebElement addToQuickList = GetDriver()
				.findElement(By.xpath("//*[@id='ContentPlaceHolder1_detailsViewCntrl_SearchResultsControlNGview_divAddToUserQuicklist']"));
		addToQuickList.click();

		Thread.sleep(5000);
		
		GetDriver().close();
		// change focus back to old tab
		GetDriver().switchTo().window(oldTab);
		System.out.println("tab 1");

	}

	@Test
	public void ExportSimpleExtendedFam() throws Exception {

		CommonProject_DV();

		// search within
		SearchWithin();

		Thread.sleep(500);

		WebElement SearchNo = GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		SearchNo.sendKeys(" PNC: EP3607002A1 ");

		Thread.sleep(1000);

		ApplyFilter();

		Thread.sleep(3000);

		WebElement ClickonPNKC = GetDriver().findElement(By.xpath("//*[@id='lblText_EP3607002A1']"));
		ClickonPNKC.click();

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
		WebElement FamilyTab = GetDriver().findElement(By.xpath("//*[@id='ui-id-21']"));
		js2.executeScript("arguments[0].click();", FamilyTab);
		System.out.println("clicked on FamilyTab");

		Thread.sleep(500);

		// iframe
		WebElement iframeElement = GetDriver().findElement(By.xpath("//*[@id='frmFamily']"));
		GetDriver().switchTo().frame(iframeElement);

		JavascriptExecutor js = (JavascriptExecutor) GetDriver();
		WebElement SFAM = GetDriver().findElement(By.xpath("//*[@id='ui-id-1']"));
		js.executeScript("arguments[0].click();", SFAM);
		System.out.println("clicked on SFAM");

		Thread.sleep(1000);

		WebElement ClickonExport = GetDriver().findElement(By.xpath("//*[@id='divExport']/span"));
		ClickonExport.click();

		Thread.sleep(1000);

		WebElement EFAM = GetDriver().findElement(By.xpath("//*[@id='ui-id-2']"));
		js.executeScript("arguments[0].click();", EFAM);
		System.out.println("clicked on EFAM");

		// Thread.sleep(1000);
		//
		// WebElement
		// ClickonExport2=GetDriver().findElement(By.xpath("//*[@id='divExport']/span"));
		// ClickonExport2.click();

		Thread.sleep(5000);

		GetDriver().close();
		// change focus back to old tab
		GetDriver().switchTo().window(oldTab);
		System.out.println("tab 1");

		Thread.sleep(500);

		GoToHomePage();

		Thread.sleep(500);

	}

}
