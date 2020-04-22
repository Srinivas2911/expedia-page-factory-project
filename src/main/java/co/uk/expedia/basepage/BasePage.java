package co.uk.expedia.basepage;

/*
Created by SP
*/

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public static WebDriver driver;

    // create Constructor and give the path for the log4J properties file
    public BasePage() {

        PageFactory.initElements(driver, this);

        // configuring for Log4j reports
        PropertyConfigurator.configure(System.getProperty("user.dir") + "/src/test/java/co/uk/expedia/resources/propertiesfile/log4j.properties");

    }
}
