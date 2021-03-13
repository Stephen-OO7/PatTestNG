package DetailView;

import java.util.ArrayList;
import java.util.Set;
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

public class SearchSideDetailview extends BaseTest
{
	
	static String patseerh;	

  @Test
  public void Detailedview_Iconand_Link() throws Exception
  {
	  System.out.println("Detailedview_Iconand_Link");																	
		WebDriverWait wait=new WebDriverWait(GetDriver(),60);																
		GetDriver();
		
		SelectCommandSearch();
	
		Thread.sleep(1000);
		
		  //for spell check
		
		  SpellCheck();
		   
		Thread.sleep(500);
		JavascriptExecutor jss = (JavascriptExecutor)GetDriver();
		WebElement SFAMOF = GetDriver().findElement(By.id("txtSpellCheck"));
		jss.executeScript("arguments[0].click();", SFAMOF);

		//used for blocking hidden element
		JavascriptExecutor jsss = (JavascriptExecutor) GetDriver();
		jsss.executeScript("document.getElementById('txtCommandSearch_0_0').setAttribute('style', 'display:block')");
				
//		GetDriver().findElement(By.xpath("//textarea[@id='txtCommandSearch_0_0']")).clear();
		GetDriver().findElement(By.xpath("//textarea[@id='txtSpellCheck']")).clear();
		SFAMOF.sendKeys("             (  ASN:google and PBC:DE) or  (pnc:(TW201005116A   or DE112013004585T8 or JP5841162B2 or US5796952A or DE102013106879A1 or TW201005116A or DE60313195T or US7605268B2 or US2017039363A1 or  GB0611990D0 or EP1465369A1 or DE112013004585T8 or DE102013106879A1 or  DE60313195T2 or DE60313195T2 or US7605268B2 or US7605268B2 or US2017039363A1 or US2017039363A1 or US2017039363A1 or JP5841162B2 or US5796952A or DE102013106879A1 or  DE112013004585T8   or EP1465369A1 or GB0611990D0 or US2017039363A  or US7605268B2 )) ");
		               
		System.out.println("entered search term of SFAMOF in cmd");
		
		Thread.sleep(500);
		
		GetCountSearch_CMD();
		
		Thread.sleep(4000);
		  patseerh = GetDriver().getWindowHandle().toString();																		
		  GetDriver().switchTo().frame(GetDriver().findElement(By.id("resultFrameID")));																	
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By																	
				.xpath("//div[@id='leftUpperPanel_SearchSummaryContainer_filterContainer']//span[@class='floatLeft ng-binding'][contains(text(),'Search within Records')]"))).click();										
														
														
		wait.until(ExpectedConditions.visibilityOfElementLocated(By																	
				.xpath("//div[@class='width100 ng-scope']//textarea[@id='SearchTerm']"))).sendKeys("pnc:(DE112013004585T8 or DE112013004585B4 or DE112013004585T8 or TW201005116A or DE60313195T2 or US2017039363A1 or JP5841162B2 or US5796952A or DE102013106879A1 or DE112013004585T8 or EP1465369A1 or GB0611990D0 or DE60313195T2)");										
															
		GetDriver().findElement(By.xpath("//button[@id='applydivID']")).click();																														
																			
JavascriptExecutor js = (JavascriptExecutor) GetDriver();	

wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[@id='lblText_DE112013004585T8']")));	
js.executeScript("arguments[0].click();", GetDriver().findElement(By.xpath("//label[@id='lblText_DE112013004585T8']")));					
					Thread.sleep(500);														
		Set<String> handle = GetDriver().getWindowHandles();		
		
		for(String f:handle)
		{
			
			System.out.println(f);
			
		}
																			
		for (String h : handle) {																	
			if (!h.equals(patseerh)) {		
				System.out.println(h);
				System.out.println(patseerh);															
				GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);															
				GetDriver().switchTo().window(h);															
				GetDriver().findElement(By.cssSelector("#claimsTab")).click();															
				Thread.sleep(1000);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ContentPlaceHolder1_detailsViewCntrl_claimsCntrl_txtClaims']//p[contains(text(),'1. A method comprising: outputting, by means of a')]")));
					String claims=GetDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_detailsViewCntrl_claimsCntrl_txtClaims']//p[contains(text(),'1. A method comprising: outputting, by means of a')]")).getText();
					if(claims.contains("A method comprising: outputting"))
					{
					
					}
					else
					{
					Assert.assertEquals(claims, "A method comprising: outputting");
					}
				
					GetDriver().findElement(By.cssSelector("#ui-id-20")).click();	
				Thread.sleep(1000);	
				GetDriver().switchTo().frame(GetDriver().findElement(By.id("IfrMosic")));
				
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@id='imagebox_DE112013004585T8_0']")));
				
					if(GetDriver().findElement(By.xpath("//img[@id='imagebox_DE112013004585T8_0']")).isDisplayed())
					{
					
					}
					else
					{
						Assert.assertTrue(false);
					}
				
					GetDriver().switchTo().defaultContent();
					GetDriver().findElement(By.cssSelector("#ui-id-21")).click();	
				Thread.sleep(1000);
				GetDriver().switchTo().frame(GetDriver().findElement(By.id("frmFamily")));
				if(GetDriver().findElement(By.xpath("//input[@id='chkAllCheckBox_DE112013004585T8_sFamCntnr']")).isDisplayed())
				{
				
				}
				else
				{
					Assert.assertTrue(false);
				}
				GetDriver().switchTo().defaultContent();
				GetDriver().findElement(By.cssSelector("#ui-id-22")).click();															
				Thread.sleep(1000);		
				
				GetDriver().switchTo().frame(GetDriver().findElement(By.id("frmBackCitation")));
				if(GetDriver().findElement(By.xpath("//input[@id='chkAllCheckBox_Backward']")).isDisplayed())
				{
				
				}
				else
				{
					Assert.assertTrue(false);
				}
				GetDriver().switchTo().defaultContent();
				wait.until(ExpectedConditions.elementToBeClickable(GetDriver().findElement(By.cssSelector("#ui-id-24")))).click();
																		
				Thread.sleep(1000);															
				GetDriver().findElement(By.cssSelector("#ui-id-26")).click();															
												
																			
			      }																
				if(!h.equals(patseerh))															
              {																			
					GetDriver().close();																		
              }																			
				GetDriver().switchTo().window(patseerh);															
																			
																			
																			
		}																	
																		
		GetDriver().switchTo().frame(GetDriver().findElement(By.id("resultFrameID")));																	
		GetDriver().findElement(By																	
				.xpath("//div[@id='trnumber_DE112013004585T8']//div[@class='floatLeft tbview-patent-title']//div//span[@id='lnkimgDetails']")).click();															
	              Thread.sleep(1000);
	              Set<String> handle4 = GetDriver().getWindowHandles();
	              for (String h : handle4) {																	
	      			if (!h.equals(patseerh)) {		
	      				System.out.println(h);
	      				System.out.println(patseerh);															
	      				GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);															
	      				GetDriver().switchTo().window(h);			
	      			}
	              }
	              GetDriver().findElement(By.xpath("//a[@id='ui-id-19']")).click();
	              
	           
	              GetDriver().switchTo().window(patseerh);													
																			
	
  }
  
  @Test
  public void Check_Rejection_Details() throws Exception
  {
	  Thread.sleep(1000);
	  
	  SelectNumberSearch();
	  
	  Thread.sleep(1000);
	  
	  WebElement input= GetDriver().findElement(By.xpath("//textarea[@id='txtManual_0_0']"));
	  input.sendKeys(" US2009059863A1,US2008139646A1,US8474748B2 ");
	  
	  Thread.sleep(500);
	  
	  WebElement lookup=GetDriver().findElement(By.xpath("//div[@id='divAddButton_0_0']"));
	  lookup.click();
	  
	  System.out.println("clicked on lookup");
	  
	  Thread.sleep(2000);
	  
	  SearchWithin();
	 
	  WebElement SearchNumber=GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
	  SearchNumber.sendKeys(" PNC: US2009059863A1 ");
	  
	  Thread.sleep(1000);
		
	  ApplyFilter();
	  
	  Thread.sleep(3000);
		
	  WebElement ClickonPNKC=GetDriver().findElement(By.xpath("//label[@id='lblText_US2009059863A1']"));
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
	    JavascriptExecutor js2 = (JavascriptExecutor)GetDriver();
		WebElement ClickonCitation= GetDriver().findElement(By.xpath("//a[@id='ui-id-22']"));
		js2.executeScript("arguments[0].click();", ClickonCitation);	  
		System.out.println("clicked on Citation tab");
		
		Thread.sleep(2000);
		
		//iframe
		  WebElement iframeElement = GetDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_detailsViewCntrl_citationPanel']//iframe[@id='frmBackCitation']"));
		  GetDriver().switchTo().frame(iframeElement);
		  		
		Thread.sleep(2000);
		
		//validation using assert
		  WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
		  wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'(102, 103-CTNF)')]")));
		  WebElement validate=GetDriver().findElement(By.xpath("//label[contains(text(),'(102, 103-CTNF)')]"));
		  System.out.println("s1 : "+validate.getText());
		  
		  String actualText="(102, 103-CTNF)";
		  Assert.assertEquals(validate.getText(), actualText);
		  
		  Thread.sleep(2000);
		  
		  String expectedTooltip = "Rejection:+"
		  		+ "102-Lack of Novelty"
		  		+ "103-Obviousness";					
	        		
	      Actions builder = new Actions (GetDriver());							
	      builder.clickAndHold().moveToElement(validate);					
	      builder.moveToElement(validate).build().perform(); 	
	        
	      WebElement toolTipElement = GetDriver().findElement(By.xpath("//label[contains(text(),'(102, 103-CTNF)')]"));							
	      String actualTooltip = toolTipElement.getText();			
	        
	      System.out.println("Actual Title of Tool Tip  "+actualTooltip);							
	      if(actualTooltip.equals(expectedTooltip)) 
	      {							
	           System.out.println("Test Case Passed");					
	      }	
		  Thread.sleep(2000);

	    GetDriver().close();
	    // change focus back to old tab
	    GetDriver().switchTo().window(oldTab); 
	    System.out.println("tab 1");
	    
	    Thread.sleep(2000);
	    
	    OpenNumberinDetailView();

	    GoToHomePage();
	    
	    Thread.sleep(500);
  }
  
  @Test
  public void OpenNumberinDetailView() throws Exception
  {	  
	//for 2nd record
	  WebElement ClearFilter=GetDriver().findElement(By.xpath("//*[@id='filterContainer']/div[1]/span[2]"));
	  ClearFilter.click();
	  
	   Thread.sleep(1000);
	    
	    SearchWithin();
		 
		  WebElement SearchNumber2=GetDriver().findElement(By.xpath("//textarea[@id='SearchTerm']"));
		  SearchNumber2.sendKeys(" PNC: US2008139646A1  ");
		  
		  Thread.sleep(1000);
			
		  ApplyFilter();
		  
		  Thread.sleep(3000);
			
		  WebElement ClickonPNKC2=GetDriver().findElement(By.xpath("//label[@id='lblText_US2008139646A1']"));
		  ClickonPNKC2.click();
		  
	// considering that there is only one tab opened in that point.
	    String oldTab = GetDriver().getWindowHandle();
	    
	    Thread.sleep(2000);
		
		ArrayList<String> newTab = new ArrayList<String>(GetDriver().getWindowHandles());
	    newTab.remove(oldTab);
	    // change focus to new tab
	    GetDriver().switchTo().window(newTab.get(0));
	    System.out.println("tab 0");

	    Thread.sleep(2000);
	    JavascriptExecutor js2 = (JavascriptExecutor)GetDriver();
		WebElement ClickonCitation= GetDriver().findElement(By.xpath("//a[@id='ui-id-22']"));
		js2.executeScript("arguments[0].click();", ClickonCitation);	  
		System.out.println("clicked on Citation tab");
		
		Thread.sleep(2000);
		
		//iframe
		  WebElement iframeElement = GetDriver().findElement(By.xpath("//div[@id='ContentPlaceHolder1_detailsViewCntrl_citationPanel']//iframe[@id='frmBackCitation']"));
		  GetDriver().switchTo().frame(iframeElement);
		  		
		Thread.sleep(2000);
		
		//validation using assert
		  WebDriverWait wait11= new WebDriverWait(GetDriver(),60);
		  wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='trnumber_US2003129758A1']//label[@id='lblRejection']")));
		  WebElement validate=GetDriver().findElement(By.xpath("//div[@id='trnumber_US2003129758A1']//label[@id='lblRejection']"));
		  System.out.println("s1 : "+validate.getText());
		  
		  String actualText="(103-CTNF)";
		  Assert.assertEquals(validate.getText(), actualText);
		  
		  Thread.sleep(2000);
		  
		  String expectedTooltip = "Rejection:+"
		  		+ "103-Obviousness";					
	        		
	      Actions builder = new Actions (GetDriver());							
	      builder.clickAndHold().moveToElement(validate);					
	      builder.moveToElement(validate).build().perform(); 	
	        
	      WebElement toolTipElement = GetDriver().findElement(By.xpath("//div[@id='trnumber_US2003129758A1']//label[@id='lblRejection']"));							
	      String actualTooltip = toolTipElement.getText();			
	        
	      System.out.println("Actual Title of Tool Tip  "+actualTooltip);							
	      if(actualTooltip.equals(expectedTooltip)) 
	      {							
	           System.out.println("Test Case Passed");					
	      }	
		  Thread.sleep(2000);

	    GetDriver().close();
	    // change focus back to old tab
	    GetDriver().switchTo().window(oldTab);
	    System.out.println("tab 1");
	    
	    Thread.sleep(2000);
  }
}
