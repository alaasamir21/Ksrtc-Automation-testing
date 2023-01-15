package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class TestBase 
{
	public static WebDriver driver;

	@BeforeSuite
	@Parameters (("browser"))
	public void startDriver(String browserName)
	{
		if (browserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/webDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		}
		
		else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/webDrivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("MicrosoftEdge")) {
			System.setProperty("webdriver.msedgedriver.driver", System.getProperty("user.dir")+"/webDrivers/msedgedriver.exe");
			driver = new EdgeDriver();
		}
		Dimension dim =new Dimension(768, 1024);
		driver.manage().window().setSize(dim);
		driver.manage().timeouts().implicitlyWait (90, TimeUnit.SECONDS);
		driver.navigate().to("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		driver.manage().window().maximize();
	}

	@AfterSuite
	public void stopDriver()
	{
		driver.quit();
	}
}
