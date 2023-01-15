package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TravellingDetails extends PageBase{
	
	public TravellingDetails(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="Forwardboarding-tab")
	WebElement Boarding;
	
	@FindBy(id="Forward-1467550949362")
	WebElement BoardingPoint;
	
	@FindBy(id="Forward-1467467616730")
	WebElement 	DroppingPoint;
	
	@FindBy(id="mobileNo")
	WebElement 	MobNum;
	
	@FindBy(id="email")
	WebElement 	Email;
	
	@FindBy(id="Forward84")
	WebElement 	SeatNum;
	
	@FindBy(css = ("[data-target=\"#ForwardinPxInfoDv\"]"))
	WebElement PassengerDetails;
	
	@FindBy(id="passengerNameForward0")
	WebElement 	PassName;
	
	@FindBy(id="genderCodeIdForward0")
	WebElement 	PassGender;
	
	@FindBy(linkText = "MALE")
	WebElement MALE	;
	
	@FindBy(id="passengerAgeForward0")
	WebElement 	Age;
	
	@FindBy(id="concessionIdsForward0")
	WebElement 	concessionBtn;
	
	@FindBy(linkText = "GENERAL PUBLIC")
	WebElement 	concessionPublic;
	
	@FindBy(id="nationalityForward0")
	WebElement 	nationality;
	
	@FindBy(linkText = "INDIA")
	WebElement 	India;
	
	@FindBy(id="PgBtn")
	WebElement 	Payment;
	
	
	
	public void SeatSelection(String mobileNum, String emailID, String PassengerName, String PassAge)
	{
		Boarding.click();
		BoardingPoint.click();
		DroppingPoint.click();
		MobNum.sendKeys(mobileNum);
		Email.sendKeys(emailID);
		SeatNum.click();
		PassengerDetails.click();
		PassName.sendKeys(PassengerName);
		PassGender.click();
		MALE.click();
		Age.sendKeys(PassAge);
		concessionBtn.click();
		concessionPublic.click();
		nationality.click();
		India.click();
		Payment.click();
		
	}
}