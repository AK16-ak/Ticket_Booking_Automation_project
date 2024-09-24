package Flight_Booking.Automation_project;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Flight_Booking.Automation_project_Testcases.BaseClass;
import Flight_Booking.Automation_project_Testcases.Listner;

public class HomePage_Objects extends BaseClass{

	public HomePage_Objects(){
		// TODO Auto-generated constructor stub
	
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "(//div[@id=\"divSignInPnl\"])")
	WebElement sign_upOrLogin_dropDown;
	
	
	
	
	public String   geteleText() {
		String s=sign_upOrLogin_dropDown.getText();
		return s;
	}
	
	
	
	public void sign_up ()
	{
		sign_upOrLogin_dropDown.click();
	}

	   @FindBy(id="shwlogn")
	   WebElement customer_loginorSignup;
	  
	   
	public void customer_login ()
	{
		customer_loginorSignup.click();
		}
	
	
	/////one way flight book/////////////
	
	
	@FindBy(xpath = "//input[@id='a_FromSector_show']")
	WebElement fromLocationElement;
	
	@FindBy(id="a_FromSector_show")
	WebElement  searchFromFlightElement;
	
	public void SearchFromFlight() {
		fromLocationElement.click();
	}
	
	public void SearchFlightfrom() {
		searchFromFlightElement.sendKeys("del");
	}
	
	@FindBy(className = "searcIcn")
	WebElement searchElementFlight;
	
	public void searchFlight() {
		searchElementFlight.click();
	}
	
	@FindBy(xpath = "//input[@id='Editbox13_show']")
	WebElement toEnterFlightElement;
	
	
	@FindBy(id="Editbox13_show")
	WebElement toSearchFlightdataElement;
	
	@FindBy(xpath = "//*[@id='toautoFill_in']/div[1]/i")
	WebElement toEnterDestinationFlight;
	
	public void clickToSearDestinationFlight() {
		toEnterFlightElement.click();
	}
	
	public void to_FlightSearch() {
		toSearchFlightdataElement.sendKeys("bom");
	}
	
	public void ClickDestinationFLight() {
		toEnterDestinationFlight.click();
	}
	
	////////////////Departure date////////////
	@FindBy(id="ddate")
	WebElement departureDatElement;
	public void ClickToSelectDepartureDate() {
		departureDatElement.click();
	}
	
	@FindBy(id="trd_4_19/09/2024")
	WebElement selectDepartureDatElement;
	
	public void SelectDeparturedate() {
		selectDepartureDatElement.click();
	}
	
	
	@FindBy(className = "srchBtnSe")
	WebElement searchButtonlickElement;
	
	public void ClickSearchButton() {
		searchButtonlickElement.click();
	}

	
/////////////////classes///
	
	@FindBy(id="spnTraveller")
	WebElement clickTravelandClassElement;
	
	public void ClickTravelAndClassbutton() {
		clickTravelandClassElement.click();
	}
	
	@FindBy(id="spanEconomy")
	WebElement selectEconomyclassElement;
	
	
	public void SelectEconomyClass() {
		boolean Flight_class=selectEconomyclassElement.isSelected();
		if(Flight_class==false) {
			selectEconomyclassElement.click();
		}
	}
	
	@FindBy(id="traveLer")
	WebElement clickDoneButtonToSelectClassElement;
	
	public void ClickDoneButtom() {
		clickDoneButtonToSelectClassElement.click();
	}
	
	
	
	
}
