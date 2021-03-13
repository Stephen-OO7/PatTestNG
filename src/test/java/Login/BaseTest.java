package Login;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BaseTest {
	private static WebDriver driver;
	
	public static WebDriver GetDriver(){
		
		
		
		if(driver == null){
			
			driver = new ChromeDriver();
			
		}
		return driver;
		
	}
	
	public void GoToHomePage(){
		
		//for online
		String homePageUrl = "https://app.patseer.com/Home";
		WebDriver driver =GetDriver(); 
		//if(!driver.getCurrentUrl().contains(homePageUrl)){
		driver.get(homePageUrl);
		
		//for de
//		String homePageUrl = "https://ec2-3-122-228-37.eu-central-1.compute.amazonaws.com/Home";
//		WebDriver driver =GetDriver(); 
//		//if(!driver.getCurrentUrl().contains(homePageUrl)){
//		driver.get(homePageUrl);
			
		//for 13
//		String homePageUrl = "https://192.168.1.246/Home";
//		WebDriver driver =GetDriver(); 
//		//if(!driver.getCurrentUrl().contains(homePageUrl)){
//		driver.get(homePageUrl);

		//for testlink
//		String homePageUrl = "https://ec2-54-172-68-12.compute-1.amazonaws.com/Home";
//		WebDriver driver =GetDriver(); 
//		//if(!driver.getCurrentUrl().contains(homePageUrl)){
//		driver.get(homePageUrl);
			
		}	
	
	public void logoutSession(){
		
		//for online
//		String logoutUrl = "https://app.patseer.com/Logout";
//		WebDriver driver =GetDriver(); 
//		driver.get(logoutUrl);	
		
		//for 13
//		String logoutUrl = "https://192.168.1.246/Logout";
//		WebDriver driver =GetDriver(); 
//		driver.get(logoutUrl);	
				
//		//for testlink
//		String logoutUrl = "https://app.patseer.com/Logout";
//		WebDriver driver =GetDriver(); 
//		driver.get(logoutUrl);	
		
	}
	
	@Test
	public void ApplyFilter()
	{
		JavascriptExecutor js2 = (JavascriptExecutor)GetDriver();
		WebElement ApplyFilter = GetDriver().findElement(By.xpath("//*[@id='applydivID']"));
		js2.executeScript("arguments[0].click();", ApplyFilter);
	}
	
	@Test
	public void MainFilter()
	{
		WebElement Filter=GetDriver().findElement(By.id("filterContainer"));
		Filter.getLocation();
		
	}
	
	@Test
	public void SearchWithin()
	{
		JavascriptExecutor js3 = (JavascriptExecutor)GetDriver();
		WebElement ClickonSearchWithin = GetDriver().findElement(By.xpath("//filterview[@name='searchresultFilter']//*[@filtertype='relevance']//child::span[1]"));
		js3.executeScript("arguments[0].click();", ClickonSearchWithin);
				
	}
	
	@Test
	public void ClearFilter()
	{
		JavascriptExecutor js= (JavascriptExecutor)GetDriver();
		WebElement ClickonClear = GetDriver().findElement(By.xpath("//*[@id='filterContainer']/div[1]/span[2]"));
		js.executeScript("arguments[0].click();", ClickonClear);
	}
	
	@Test
	public void EnableScript()
	{
		WebElement EnableScript= GetDriver().findElement(By.xpath("//span[@class='floatLeft']//input[@id='Checkbox1']"));
		EnableScript.click();
	}
	
	@Test
	public void AddDropdown() throws Exception
	{
		Thread.sleep(500);
		WebElement ClickonAddDropdown = GetDriver().findElement(By.xpath("//*[@id='liAdd']/div[1]/span"));
	    Actions action = new Actions(GetDriver());
	    action.moveToElement(ClickonAddDropdown).build().perform();		
		System.out.println("clicked on Add dropdown");
	}
	
	@Test
	public void SelectCurrentRecords() throws Exception
	{
		Thread.sleep(2000);
		
		//select current record tab
		  WebDriverWait wait4= new WebDriverWait(GetDriver(),60);
		  wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ulResultAction']/li[1]/div/checkuncheckcontrol/div/span[2]/i"))).click();
		  
		  Thread.sleep(200);
		  
		  WebElement selectCurrentRecords= GetDriver().findElement(By.xpath("//*[@id='chkCurrentPage_0']"));
		  selectCurrentRecords.click();
	}
	
	@Test
	public void SelectAllRecords() throws Exception
	{
		Thread.sleep(2000);
		
		//select current record tab
		  WebDriverWait wait4= new WebDriverWait(GetDriver(),60);
		  wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ulResultAction']/li[1]/div/checkuncheckcontrol/div/span[2]/i"))).click();
		  
		  Thread.sleep(200);
		  
		  WebElement selectCurrentRecords= GetDriver().findElement(By.xpath("//input[@id='chkAllPage_0']"));
		  selectCurrentRecords.click();
	}
	
	@Test
	public void Select_All_Records() throws Exception
	{
		Thread.sleep(2000);
		
		//select current record tab
		  WebDriverWait wait4= new WebDriverWait(GetDriver(),60);
		  wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ulResultAction']/li[1]/div/checkuncheckcontrol/div/span[2]/i"))).click();
		  
		  Thread.sleep(500);
		  
		  WebElement selectCurrentRecords= GetDriver().findElement(By.xpath("//input[@id='chkAllPage_0']"));
		  selectCurrentRecords.click();
	}
	
	@Test
	public void QuickSearch() 
	{
		GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)GetDriver();
		WebElement quick = GetDriver().findElement(By.xpath("//a[@href='Search#/quick']"));
		js.executeScript("arguments[0].click();", quick);		
	}
	
	@Test
	public void SelectCommandSearch() 
	  {	
		GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor)GetDriver();//WebDriver instance type cast into JavascriptExecutor interface

		WebElement cmd = GetDriver().findElement(By.xpath("//a[@class='m_1_s_4']"));
		js.executeScript("arguments[0].click();", cmd);
		 
	  }
	
	@Test
	  public void SelectNumberSearch() 
	  {
		  GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  JavascriptExecutor js = (JavascriptExecutor)GetDriver();//WebDriver instance type cast into JavascriptExecutor interface
		  WebElement number = GetDriver().findElement(By.xpath("//a[@class='m_1_s_5']"));
		  js.executeScript("arguments[0].click();", number);
		  
	  }
	
	@Test
	  public void GetCountSearch_QS() throws Exception
	  {
		//getcount
		WebDriverWait wait3= new WebDriverWait(GetDriver(),60);
		  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@ng-click='getCount()']")));
		  WebElement getCountBtn= GetDriver().findElement(By.xpath("//a[@ng-click='getCount()']"));
		  System.out.println(getCountBtn.getText());
		  
		  ((JavascriptExecutor)GetDriver()).executeScript("window.scrollTo(0,"+ getCountBtn.getLocation().y +")"); 
		  getCountBtn.click();
		  System.out.println("clicked on get count");
		  
		  GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		  //search
		  JavascriptExecutor js = (JavascriptExecutor)GetDriver();
		  WebElement search= GetDriver().findElement(By.xpath("//a[@id='searchId']"));
		  js.executeScript("arguments[0].click();",search);
		  System.out.println("clicked on search");
		  
		//on result page

		  Thread.sleep(2000);
		  
		  //change URL
//		  GetDriver().getCurrentUrl();
//		  
//		  GetDriver().get("https://192.168.1.246/SearchWF#/command/Result");
					  
	  }
	
	@Test
	  public void GetCountSearch_CMD() throws Exception
	  {
		//getcount
		WebDriverWait wait3= new WebDriverWait(GetDriver(),60);
		  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@ng-click='getCount()']")));
		  WebElement getCountBtn= GetDriver().findElement(By.xpath("//a[@ng-click='getCount()']"));
		  System.out.println(getCountBtn.getText());
		  
		  ((JavascriptExecutor)GetDriver()).executeScript("window.scrollTo(0,"+ getCountBtn.getLocation().y +")"); 
		  getCountBtn.click();
		  System.out.println("clicked on get count");
		  
		  GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		  //search
		  JavascriptExecutor js = (JavascriptExecutor)GetDriver();
		  WebElement search= GetDriver().findElement(By.xpath("//a[@id='searchId']"));
		  js.executeScript("arguments[0].click();",search);
		  System.out.println("clicked on search");
			  
		//on result page

		  Thread.sleep(2000);
		  			  
	  }
	
	@Test
	public void SpellCheck()
	{
		//for spell check		
		WebDriverWait wait1= new WebDriverWait(GetDriver(),60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='floatLeft leftSpacer col-xs-4 col-sm-4 col-md-4 col-lg-4 switchCaseCont']")));	  
		WebElement SpellCheck=GetDriver().findElement(By.xpath("//label[@class='onoffswitch-label']"));
		SpellCheck.click();
	}
	
	@Test
	public void CommonSearch_WF() throws Exception
	{
		QuickSearch();
		
		Thread.sleep(500);
		
		//clear
		  WebElement clear1= GetDriver().findElement(By.xpath("//a[@class='patseer_Secondary_Button1 btn btn-link patseer_Secondary_ButtonFix']"));
		  clear1.click();
		  System.out.println("clicked on clear option");
		  
		  Thread.sleep(500);
		
		  WebElement ClickonTAC= GetDriver().findElement(By.xpath("//div[@id='main_0']"));
		  ClickonTAC.click();
		  
		  WebDriverWait wait1= new WebDriverWait(GetDriver(),30);
		  GetDriver().findElement(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]")).clear(); 

		  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_0']//input[contains(@placeholder,'Search')]"))).sendKeys("TAC");
		  
		  wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='main_0']//span[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Title, Abstract, Claims (TAC)')]"))).click();
	
		  WebElement EnterText= GetDriver().findElement(By.xpath("//textarea[@id='txtPatApp_0']"));
		  EnterText.sendKeys(" fiber cell");
		  
		 //getcount and click on search
		  WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
		  wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@ng-click='getCount()']")));
		  WebElement getCountBtn= GetDriver().findElement(By.xpath("//a[@ng-click='getCount()']"));
		  System.out.println(getCountBtn.getText());
		  
		  Thread.sleep(500);
		  
		  ((JavascriptExecutor)GetDriver()).executeScript("window.scrollTo(0,"+ getCountBtn.getLocation().y +")"); 
		  getCountBtn.click();
		  System.out.println("clicked on get count");
		  
		  GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  
		  Thread.sleep(500);
		  
		  WebElement search= GetDriver().findElement(By.xpath("//a[@id='searchId']"));
		  JavascriptExecutor js = (JavascriptExecutor)GetDriver();
		  js.executeScript("arguments[0].click();",search);
		  System.out.println("clicked on search");
		  
		//on result page
		  GetDriver().manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		  
		  //change URL
//		  GetDriver().getCurrentUrl();
		  
//		  GetDriver().get("https://192.168.1.246/SearchWF#/command/Result");
		
	}
	
	@Test
	  public void CommonProject() throws Exception 
	  {
		  GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

			JavascriptExecutor js = (JavascriptExecutor)GetDriver();
			WebElement commonProj = GetDriver().findElement(By.xpath("//span[@class='patseer_Secondary_Button ng-binding'][contains(text(),'Automation_Project')]"));
			js.executeScript("arguments[0].click();", commonProj);
			
			Thread.sleep(2000);
			
			WebElement ele = GetDriver().findElement(By.xpath("//*[@id='headerCntrl_patseerLogoCntrl_liProjectName']"));
		    Actions action = new Actions(GetDriver());
		    action.moveToElement(ele).build().perform();		  
	  }
	
	@Test
	public void Select_CitationAnalysis()throws Exception
	{
		WebElement CitationAnalysis=GetDriver().findElement(By.xpath("//*[@id='headerCntrl_patseerLogoCntrl_lnkCitnAnlis']"));
		CitationAnalysis.click();
	}
	
	@Test
	public void Select_VizMap()throws Exception
	{
		WebElement VIZ=GetDriver().findElement(By.xpath("//a[contains(text(),'VizMAP')]"));
		VIZ.click();
	}
	
	@Test
	public void Project_CreatebyMe() throws Exception
	{
		WebElement MouseOver = GetDriver().findElement(By.xpath("//*[@id='headerCntrl_patseerLogoCntrl_liProject']/a"));
		Actions action = new Actions(GetDriver());
		action.moveToElement(MouseOver).build().perform();

		Thread.sleep(1000);
		
		WebElement SelectCreatebyMe = GetDriver().findElement(By.xpath("//a[@class='m_5_s_2']"));
		SelectCreatebyMe.click();
	}
	
	@Test
	public void Create_Project() throws Exception
	{
		JavascriptExecutor js = (JavascriptExecutor)GetDriver();
		WebElement clickCreateProject = GetDriver().findElement(By.xpath("//button[contains(text(),'Create Project')]"));
		js.executeScript("arguments[0].click();", clickCreateProject);
		
//		WebElement clickCreateProject= GetDriver().findElement(By.xpath("//button[contains(text(),'Create Project')]"));
//		  clickCreateProject.click();
		  
		  Thread.sleep(1000);
	}
	@Test
	  public void login_S() throws Exception 
	  {
		  driver= GetDriver();
		  logoutSession();		  

		  //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		  
		  //13
	      driver.get("https://acc.patseer.com/p/login");
     	  
	      driver.manage().window().maximize();
		  driver.findElement(By.id("LoginForm:loginName")).clear();
		  driver.findElement(By.id("LoginForm:loginName")).sendKeys("pallavi@patseer.com");
		  driver.findElement(By.id("LoginForm:password")).sendKeys("771baner");
		  driver.findElement(By.id("LoginForm:submitButton")).click();
		  
	      Thread.sleep(1500);
		  if(driver.getCurrentUrl().contains("https://acc.patseer.com/p/login"))
		  {
			  System.out.println(driver.getCurrentUrl());
			  System.out.println("Session was not cleared. Clicking on login button again."); 
			  WebElement loginButton = driver.findElement(By.id("LoginForm:submitButton"));
		  	if(loginButton != null)
		  	{
			  loginButton.click();
		  	}
		  }
	 
	  }
	
}
