package Login;

import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class Logout extends BaseTest{
  @Test
  public void Logout() 
  
  {
	  GetDriver().findElement(By.xpath("//div[@id='headerCntrl_patseerLogoCntrl_divuserinfo']")).click(); 
	  GetDriver().findElement(By.xpath("//a[@class='floatRight patseer_button']")).click();
	  GetDriver().quit();
  }
  
}
