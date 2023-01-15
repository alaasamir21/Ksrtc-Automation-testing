package tests;
import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.SelectSeat;
import Pages.TravellingDetails;

public class BookingSeat extends TestBase
{

	HomePage homeObject;
	SelectSeat selectSeatObject;
	TravellingDetails travellingDetailsObject;
	
	
	@Test

	public void TypeInSearchBox()
	{
		homeObject = new HomePage (driver);
		homeObject.SelectPopularRoutes();
		selectSeatObject =new SelectSeat(driver);
		selectSeatObject.SeatSelection();
		travellingDetailsObject =new TravellingDetails(driver);
		travellingDetailsObject.SeatSelection("6789125987", "test@gmail.com", "Alaa", "25");
		
	}
}
