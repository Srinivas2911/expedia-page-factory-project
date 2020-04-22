package co.uk.expedia.pages;

/*
Created by SP
*/

import co.uk.expedia.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class FlightsPage extends Utility {

    //Log the Web Elements and methods into Log4j reports for
    private static final Logger log = LogManager.getLogger(FlightsPage.class.getName());

//  Previously collected x paths
//    By flightFromField = By.xpath("//input[@id='flight-origin-hp-flight']");
//    By flightToField = By.xpath("//input[@id='flight-destination-hp-flight']");
//    By departDate = By.xpath("//input[@id='flight-departing-hp-flight']");
//    By returnJourneyDate = By.xpath("//input[@id='flight-returning-hp-flight']");
//    By travellersField = By.xpath("//div[@class='menu-bar gcw-travel-selector-wrapper']//button[@class='trigger-utility menu-trigger btn-utility btn-secondary dropdown-toggle theme-standard pin-left menu-arrow gcw-component gcw-traveler-amount-select gcw-component-initialized']");
//
//    By addNoOfTravButton = By.xpath("//body[contains(@class,'')]/meso-native-marquee/section[@id='WizardHero']/div[@id='hero-banner']/div[contains(@class,'hero-banner-gradient native-marquee')]/div[contains(@class,'cols-row hero-banner-inner')]/section[@id='wizardSection']/div[contains(@class,'hero-banner-box siteId-3 cf hideClassicDcol')]/div[@id='wizard-tabs']/div[contains(@class,'tabs-container col')]/section[@id='section-flight-tab-hp']/form[@id='gcw-flights-form-hp-flight']/fieldset[contains(@class,'room-data')]/div[contains(@class,'cols-nested')]/div[contains(@class,'ab25184-traveler-wrapper-flight available-for-flights gcw-clear-both')]/div[@id='traveler-selector-hp-flight']/div[contains(@class,'menu-bar gcw-travel-selector-wrapper')]/ul[contains(@class,'menu-bar-inner')]/li[contains(@class,'open')]/div[contains(@class,'menu sticky gcw-menu')]/div[contains(@class,'menu-main')]/div[contains(@class,'traveler-selector-sinlge-room-data traveler-selector-room-data')]/div[contains(@class,'uitk-grid step-input-outside gcw-component gcw-component-step-input gcw-step-input gcw-component-initialized')]/div[contains(@class,'uitk-col all-col-shrink')]/button[contains(@class,'uitk-step-input-button uitk-step-input-plus')]/span[1]//*[local-name()='svg']");
//    By closeLink = By.xpath("//li[contains(@class,'open')]//button[contains(@class,'close btn-text')]");
//    By searchButton = By.xpath("//form[@id='gcw-flights-form-hp-flight']//button[contains(@class,'btn-primary btn-action gcw-submit')]");

    //Using selenium @Findby and initElement methods
    // using _ help separate from variable

    @FindBy(xpath = "//input[@id='flight-origin-hp-flight']")
    WebElement _flightFromField;

    @FindBy(xpath = "//input[@id='flight-destination-hp-flight']")
    WebElement _flightToField;

    @FindBy(xpath = "//input[@id='flight-departing-hp-flight']")
    WebElement _departDate;

    @FindBy(xpath = "//input[@id='flight-returning-hp-flight']")
    WebElement _returnJourneyDate;

    @FindBy(xpath = "//div[@class='menu-bar gcw-travel-selector-wrapper']//button[@class='trigger-utility menu-trigger btn-utility btn-secondary dropdown-toggle theme-standard pin-left menu-arrow gcw-component gcw-traveler-amount-select gcw-component-initialized']")
    WebElement _travellersField;

    @FindBy( xpath = "//body[contains(@class,'')]/meso-native-marquee/section[@id='WizardHero']/div[@id='hero-banner']/div[contains(@class,'hero-banner-gradient native-marquee')]/div[contains(@class,'cols-row hero-banner-inner')]/section[@id='wizardSection']/div[contains(@class,'hero-banner-box siteId-3 cf hideClassicDcol')]/div[@id='wizard-tabs']/div[contains(@class,'tabs-container col')]/section[@id='section-flight-tab-hp']/form[@id='gcw-flights-form-hp-flight']/fieldset[contains(@class,'room-data')]/div[contains(@class,'cols-nested')]/div[contains(@class,'ab25184-traveler-wrapper-flight available-for-flights gcw-clear-both')]/div[@id='traveler-selector-hp-flight']/div[contains(@class,'menu-bar gcw-travel-selector-wrapper')]/ul[contains(@class,'menu-bar-inner')]/li[contains(@class,'open')]/div[contains(@class,'menu sticky gcw-menu')]/div[contains(@class,'menu-main')]/div[contains(@class,'traveler-selector-sinlge-room-data traveler-selector-room-data')]/div[contains(@class,'uitk-grid step-input-outside gcw-component gcw-component-step-input gcw-step-input gcw-component-initialized')]/div[contains(@class,'uitk-col all-col-shrink')]/button[contains(@class,'uitk-step-input-button uitk-step-input-plus')]/span[1]//*[local-name()='svg']")
    WebElement _addNoOfTravButton;

    @FindBy(xpath = "//li[contains(@class,'open')]//button[contains(@class,'close btn-text')]")
    WebElement _closeLink;

    @FindBy(xpath = "//form[@id='gcw-flights-form-hp-flight']//button[contains(@class,'btn-primary btn-action gcw-submit')]")
    WebElement _searchButton;

    By getSameDestinationText = By.xpath("//span[@class='title-city-text']");


    public void enterFlightFromOriginCity(String flyingfrom) {
        Reporter.log("Entering Origin City : " +flyingfrom +" On Flying from field "+ _flightFromField.toString() + "<br>");
        sendTextToElement(_flightFromField, flyingfrom);
        log.info("Entering Origin City : " +flyingfrom +" On Flying from field "+ _flightFromField.toString());
    }

    public void enterFlightToDestinationCity(String flyingTo) {
        Reporter.log("Entering Destination City : " +flyingTo +" On Destination field "+ _flightFromField.toString() + "<br>");
        sendTextToElement(_flightToField, flyingTo);
        log.info("Entering Destination City : " +flyingTo +" On Destination field "+ _flightFromField.toString());
    }

    public void enterOutboundDateOfTravel(String flyoutDate) {
        Reporter.log("Entering Departure date : " +flyoutDate +" Departing Date "+ _departDate.toString() + "<br>");
        sendTextToElement(_departDate, flyoutDate);
//        sendTabAndEnterKey((By) _departDate);
        log.info("Entering Departure date : " +flyoutDate +" Departing Date "+ _departDate.toString());
    }

    public void enterReturnDateOfTravel(String returnDate) {
        Reporter.log("Entering Returning date : " +returnDate +" Returning Date "+ _returnJourneyDate.toString() + "<br>");
        (_returnJourneyDate).sendKeys(Keys.CONTROL, "a");
        (_returnJourneyDate).sendKeys(Keys.DELETE);
        sendTextToElement(_returnJourneyDate, returnDate);
        (_returnJourneyDate).sendKeys(Keys.TAB);
        clickOnElement(By.xpath("//button[@class='datepicker-close-btn close btn-text']"));
//       sendTabAndEnterKey((By)_returnJourneyDate);
        log.info("Entering Returning date : " +returnDate +" Returning Date "+ _returnJourneyDate.toString());
    }

    public void clickOnTravellers() {
        Reporter.log("Clicking  on Travellers Button : " + _travellersField.toString() + "<br>");
//        waitUntilElementToBeClickable((By)_travellersField, 50);
        mouseHoverToElementAndClick(_travellersField);
        log.info("Clicking  on Travellers Button : " + _travellersField.toString());
    }

    public void addTwoAdultTravellersAndClose() {
        Reporter.log("Clicking  on No of Adults Button  : " + _addNoOfTravButton.toString() + "<br>");
        Reporter.log("Clicking  on Close Button  : " + _closeLink.toString() + "<br>");
        clickOnElement(_addNoOfTravButton);
        clickOnElement(_closeLink);
        log.info("Clicking  on No of Adults Button  : " + _addNoOfTravButton.toString());
        log.info("Clicking  on Close Button  : " + _closeLink.toString());
    }

    public void clickOnSearchButton() {
        Reporter.log("Clicking  on Seacrch Button   : " + _searchButton.toString() + "<br>");
        clickOnElement(_searchButton);
        log.info("Clicking  on Seacrch Button   : " + _searchButton.toString());
    }

    public String getSameDestinationTextMessage() {
        waitUntilVisibilityOfElementLocated(getSameDestinationText, 50);
        return getTextFromElement(getSameDestinationText);
    }

    public String verifyBodyTextContainsDestinationName() {
        String bodyText = driver.findElement(By.tagName("body")).getText();
        //String bodyText = driver.findElement(By.cssSelector("#flightModuleList")).getText();
        return bodyText;
    }
}
