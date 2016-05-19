package cucumberProject.pages;

import cucumberProject.Locators;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;


public class CurrentProductPage extends PageObject {
    @FindBy(xpath = Locators.CURRENT_PRODUCT_PAGE_NAME)
    String currProdName;
    @FindBy(xpath = Locators.PRODUCT_TAG_LINK)
    String prodTagLink;

    public String checkName() {return currProdName;}

    public String checkTag() { return prodTagLink;}
}
