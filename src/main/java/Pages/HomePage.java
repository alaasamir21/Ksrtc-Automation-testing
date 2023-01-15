package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	//@FindBy(css = ("class=\"carousel-control-next-icon\""))
	//WebElement next;

	
	@FindBy(css = ("[onclick=\"populateSearch('1467469338690', 'Chikkamagaluru', '1467467616730', 'Bengaluru');\"]"))
	WebElement DepartReturnDestination ;
	
	//@FindBy(id="txtReturnJourneyDate")
	//WebElement ReturnDate ;
	
	//@FindBy(linkText = "25")
	//WebElement RDate;
	
	@FindBy(id="txtJourneyDate")
	WebElement DepDate ;
	
	@FindBy(linkText = "18")
	WebElement DepartureDate;
	
	@FindBy(css = ("[class=\"btn btn-primary btn-lg btn-block btn-booking\"]"))
	WebElement SearchForBus ;
	
	
		
	public void SelectPopularRoutes()
	{
		//next.click();
		DepartReturnDestination.click();
		//ReturnDate.click();
		//RDate.click();
		DepDate.click();
		DepartureDate.click();
		SearchForBus.click();
	}
}