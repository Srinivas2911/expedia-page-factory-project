package co.uk.expedia.testsuite;

/*
Created by SP
*/

import co.uk.expedia.pages.FlightsPage;
import co.uk.expedia.pages.FlightsResultPage;
import co.uk.expedia.pages.HomePage;
import co.uk.expedia.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/*
        2.FlightTest - click on Flights tab, enter Flying from, Going to, Departing, Returning Travellers and click on Search Button
        and verify the same destination flight you see in search results.
 */
public class FlightTest extends TestBase {

    HomePage hp ;
    FlightsPage fp;
    FlightsResultPage frp;
    SoftAssert sa = new SoftAssert();

    // test data used
    String flyingOutFrom = "Delhi";
    String flyingToDestination = "Brisbane";
    // flyoutDate in dd/mm/yyyy format
    String flyoutDateInFormat = "07/05/2020";
    // returnDate in dd/mm/yyyy format
    String returnDateInFormat = "21/05/2020";

    @BeforeMethod (groups = { "regression"})
    public void setUpMethod(){
        hp = new HomePage();
        fp = new FlightsPage();
        frp = new FlightsResultPage();

    }

    @Test (priority = 0, groups = { "regression"})
    public void verifyThatSameDestinationFlightsInSearchFields() {
        hp.clickOnAcceptTab();
        hp.clickOnFlightsTab();
        fp.enterFlightFromOriginCity(flyingOutFrom);
        fp.enterFlightToDestinationCity(flyingToDestination);
        fp.enterOutboundDateOfTravel(flyoutDateInFormat);
        fp.enterReturnDateOfTravel(returnDateInFormat);
        fp.clickOnTravellers();
        fp.addTwoAdultTravellersAndClose();
        fp.clickOnSearchButton();
        System.out.println(frp.getSameDestinationTextMessage());
        sa.assertTrue(frp.getSameDestinationTextMessage().contains(flyingToDestination));
        sa.assertAll();
    }
}
