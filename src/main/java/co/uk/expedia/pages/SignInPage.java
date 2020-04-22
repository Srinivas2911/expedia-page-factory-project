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

public class SignInPage extends Utility {

    //Log the webelements and methods into Log4j reports for
    private static final Logger log = LogManager.getLogger(SignInPage.class.getName());

    // previously collected x paths
//    By emailField = By.cssSelector("#gss-signin-email");
//    By passwordField = By.xpath("//input[@id='gss-signin-password']");
//    By signInSumbitBtn = By.xpath("//button[@id='gss-signin-submit']");
//    By alertMessage = By.xpath("//h5[@class='alert-message']");
//    By errorMessage = By.xpath("/html[1]/body[1]/div[12]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/fieldset[1]/div[1]/div[1]/div[2]");
//
    //Using selenium @Findby and initElement methods
    // using _ help separate from variable

    @FindBy(id = "gss-signin-email")
    WebElement _emailField;

    @FindBy(id = "gss-signin-password")
    WebElement _passwordField;

    @FindBy(id = "gss-signin-submit")
    WebElement _signInSumbitBtn;

    @FindBy(id = "gss-signin-incorrect-email-or-password")
    WebElement _errorMessage;

    public void enterEmailId(String email) {
        Reporter.log("Entering Email Id : " + email + " " + _emailField.toString() + "<br>");
        clickOnElement(_emailField);
        sendTextToElement(_emailField, email);
        log.info("Entering Email Id : " + email + " " + _emailField.toString());
    }

    public void enterPassword(String password) {
        Reporter.log("Entering Password  : " + password + " " + _passwordField.toString() + "<br>");
        clickOnElement(_passwordField);
        sendTextToElement(_passwordField, password);
        log.info("Entering Password  : " + password + " " + _passwordField.toString());
    }

    public void clickonSignInButton() {
        Reporter.log("Clicking on Sign In Button  : " + _signInSumbitBtn.toString() + "<br>");
        clickOnElement(_signInSumbitBtn);
        log.info("Clicking on Sign In Button  : " + _signInSumbitBtn.toString());
    }

    public String getErrorMessage() {
        Reporter.log("Verify Error Message  : " + getTextFromElement(_errorMessage)+" "+_errorMessage.toString() + "<br>");
        log.info("Verify Error Message  : " + getTextFromElement(_errorMessage)+" "+_errorMessage.toString());
        //waitUntilVisibilityOfElementLocated(_errorMessage, 90);
        verifyThatTextIsDisplayed(_errorMessage, "You may have entered an unknown email address or an incorrect password.");
        return getTextFromElement(_errorMessage);
    }

}
