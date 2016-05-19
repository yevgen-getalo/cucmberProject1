package cucumberProject.pages;

import cucumberProject.Locators;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ContactUsPage extends PageObject {
    @FindBy(xpath = Locators.CONTACT_US_PAGE_NAME)
    WebElementFacade contactName;
    @FindBy(xpath = Locators.GOOGLE_MAP)
    WebElement googleMap;
    @FindBy(xpath = Locators.CONTACT_DETAILS)
    WebElementFacade contactDetails;
    @FindBy(xpath = Locators.ADDITIONAL_INFORMATION)
    WebElementFacade addInfo;

    public boolean checkName() {return contactName.isDisplayed();}

    public boolean checkGMap() {return googleMap.isDisplayed();}

    public boolean checkContDet() {return contactDetails.isDisplayed();}

    public boolean checkAddInfo() {return addInfo.isDisplayed();}
}
