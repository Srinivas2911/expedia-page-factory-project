package co.uk.expedia.pages;

/*
Created by SP
*/

import co.uk.expedia.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class FlightsResultPage extends Utility {

    //Log the webelements and methods into Log4j reports
    private static final Logger log = LogManager.getLogger(FlightsResultPage.class.getName());

//    By getSameDestinationText = By.xpath("//span[@class='title-city-text']");

    //Using selenium @Findby and initElement methods
    // using _ help separate from variable

    @FindBy(xpath = "//span[@class='title-city-text']")
    WebElement _getSameDestinationText;

    public String getSameDestinationTextMessage() {
        Reporter.log("Verify Destination City Message  : " + _getSameDestinationText.toString() + "<br>");
        log.info("Verify Destination City Message  : " + _getSameDestinationText.toString());
        //waitUntilVisibilityOfElementLocated((By)_getSameDestinationText,90);
        return getTextFromElement(_getSameDestinationText);
    }
}