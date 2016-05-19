package cucumberProject.pages;


import cucumberProject.Locators;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpecialOffersPage extends PageObject{
    @FindBy(xpath = Locators.SPECIAL_OFFERS_PAGE_NAME)
    private WebElement spPageName;
    @FindBy(xpath = Locators.SPEC_OFFERS_PRODUCTS_LIST)
    private WebElementFacade spProdList;
    @FindBy(xpath = Locators.SPEC_OFFERS_PAGINATION_BLOCK)
    private WebElementFacade spPagBlock;
    @FindBy(xpath = Locators.SPEC_OFFERS_LABEL)
    private WebElement spLabel;

    public boolean checkName() {return spPageName.isDisplayed();}

    public boolean checkSPList() {return  spProdList.isDisplayed();}

    public boolean checkPagBlock() {return spPagBlock.isDisplayed();}

    public boolean checkLabel() {return spLabel.isDisplayed();}
}
