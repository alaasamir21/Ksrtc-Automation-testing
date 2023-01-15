package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectSeat extends PageBase{
	
	public SelectSeat(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = ("[value=\"Select Seats\"]"))
	WebElement SeatZero ;
	
	
	//@FindBy(id="SrvcSelectBtnForward0")
	//WebElement SeatZero;
		
	public void SeatSelection()
	{
		SeatZero.click();
	}
}