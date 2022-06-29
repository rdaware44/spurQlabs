package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import assigenment.Code;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Calcutator {
	
    public WebDriver driver;
	
@BeforeMethod
	public void setup()
	{
		WebDriverManager.chromedriver().driverVersion("103.0.5060.66").setup();
	   // System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
@Test(priority=1)
public void multiply() throws InterruptedException
    {
	    Code cd= new Code(driver);
	    Thread.sleep(2000);
	    cd.four();
	    Thread.sleep(2000);
	    cd.two();
	    Thread.sleep(2000);
	    cd.three();
	    Thread.sleep(2000);
	    cd.Multiplication();
	    Thread.sleep(2000);
	    cd.five();
	    Thread.sleep(2000);
	    cd.two();
	    Thread.sleep(2000);
	    cd.five();
	    Thread.sleep(2000);
	    cd.Output();
    }

@Test(priority=2)
 public void Division() throws InterruptedException
   {
	 Code cd= new Code(driver);
	 Thread.sleep(2000);
	 cd.four();
	 Thread.sleep(2000);
	 cd.zero();
	 Thread.sleep(2000);
	 cd.zero();
	 Thread.sleep(2000);
	 cd.zero();
	 Thread.sleep(3000);
	 cd.Division();
	 Thread.sleep(3000);
	 cd.two();
	 Thread.sleep(2000);
	 cd.zero();
	 Thread.sleep(2000);
	 cd.zero();
	 Thread.sleep(2000);
	 cd.Output();
   }

@Test(priority=3)
public void Addition()
{
	 Code cd= new Code(driver);
	 cd.Substraction();
	 cd.two();
	 cd.three();
	 cd.four();
	 cd.two();
	 cd.three();
	 cd.four();
	 cd.Addition();
	 cd.three();
	 cd.four();
	 cd.five();
	 cd.three();
	 cd.four();
	 cd.five();
	 cd.Output();
}

@Test(priority=4)
public void Substraction()
{
	 Code cd= new Code(driver);
	 cd.two();
	 cd.three();
	 cd.four();
	 cd.eight();
	 cd.two();
	 cd.three();
	 cd.Addition();
	 cd.two();
	 cd.three();
	 cd.zero();
	 cd.nine();
	 cd.four();
	 cd.eight();
	 cd.two();
	 cd.three();
	 cd.Output();
}


@AfterMethod
  public void teardown()
  {
	driver.quit();
  }









}
