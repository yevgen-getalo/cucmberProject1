package cucumberProject.steps.serenity;

import cucumberProject.Locators;
import cucumberProject.pages.*;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.junit.Ignore;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EndUserSteps extends ScenarioSteps {
    @FindBy(xpath = Locators.SEARCH_FIELD)
         WebElementFacade abc;

    WelcomePage welcomePage;
    ProductsPage productsPage;
    SpecialOffersPage specialOffersPage;
    BlogsPage blogsPage;
    ContactUsPage contactPage;
    CurrentProductPage currentProductPage;
    SearchPage searchPage;

@Step
    public void openWelcomePage() {
    getDriver().manage().window().maximize();
    welcomePage.open();
    }
@Step
    public void openProductsPage() {
        getDriver().manage().window().maximize();
        productsPage.open();
    }
@Step
    public void openSpecialOffersPage() {
        getDriver().manage().window().maximize();
        specialOffersPage.open();
    }
@Step
    public void openBlogsPage() {
        getDriver().manage().window().maximize();
        blogsPage.open();
    }
@Step
    public void openContactUsPage() {
        getDriver().manage().window().maximize();
        contactPage.open();
    }
@Step
    public void clickOnTheTextLink() {welcomePage.clickOnTheTextLink();}
@Step
    public void prodCheckURL(String prodURL) {assertEquals(prodURL, productsPage.getDriver().getCurrentUrl());}
@Step
    public void checkProdName() {assertTrue(productsPage.checkName());}
@Step
    public void checkProdCatList() {assertTrue(productsPage.checkCatList());}
@Step
    public void checkProdList() {assertTrue(productsPage.checkProdList());}
@Step
    public void clickOnTheSPLink() {welcomePage.clickOnTheSP();}
@Step
    public void checkSPURL(String spURL) {assertEquals(spURL, specialOffersPage.getDriver().getCurrentUrl());}
@Step
    public void checkSPName() {assertTrue(specialOffersPage.checkName());}
@Step
    public void checkSPProdList() {assertTrue(specialOffersPage.checkSPList());}
@Step
    public void checkSPPafBlock() {assertTrue(specialOffersPage.checkPagBlock());}
@Step
    public void checkProdLabel() {assertTrue(specialOffersPage.checkLabel());}
@Step
    public void clickOnTheBlogsLink() {welcomePage.clickOnTheBlogs();}
@Step
    public void checkBlogsURL(String blogsURL) {assertEquals(blogsURL, blogsPage.getDriver().getCurrentUrl());}
@Step
    public void checkBlogsName() {assertTrue(blogsPage.checkName());}
@Step
    public void checkNewsList() {assertTrue(blogsPage.checkList());}
@Step
    public void checkPagBlock() {assertTrue(blogsPage.checkPagBlock());}
@Step
    public void clickOnTheContactLink() {welcomePage.clickOnTheContactLink();}
@Step
    public void checkContactURL(String cont) {Assert.assertEquals(cont, contactPage.getDriver().getCurrentUrl());}
@Ignore
    public void checkContName() {assertTrue(contactPage.checkName());}
@Step
    public void checkGMap() {assertTrue(contactPage.checkGMap());}
@Step
    public void checkContDet() {assertTrue(contactPage.checkContDet());}
@Step
    public void checkAddInfo() {assertTrue(contactPage.checkAddInfo());}
@Step
    public void clickOnGPlay() {welcomePage.clickOnGPlay();}
@Step
    public void checkGPlay(String gooPlay) {assertEquals(gooPlay,  welcomePage.getDriver().getCurrentUrl());}
@Step
    public void clickOnAppStore() {welcomePage.clickOnAppStore();}
@Step
    public void checkAppStore(String appStore) {assertEquals(appStore, welcomePage.getDriver().getCurrentUrl());}
@Step
    public void clickOnRButton() {
    welcomePage.moveToCarousel();
    welcomePage.clickOnRButton();}
@Step
    public void checkCarousel() {welcomePage.checkcarouselImage();}
@Step
    public void clickOnLButton() {welcomePage.clickOnLButton();}
@Step
    public void moveMouseAndClick() {welcomePage.mouseClick();}
@Step
    public void checkLink(String arg0) {assertEquals(arg0, welcomePage.getDriver().getCurrentUrl());}
@Step
    public void checkCurrProdName(String currProdName) {assertEquals(currProdName, currentProductPage.checkName());}
@Step
    public void checkTagLink(String prodTagLink) {Assert.assertEquals(prodTagLink, currentProductPage.checkTag());}
@Step
    public void moveMouseToFCategory() {welcomePage.categoryClick();}
@Step
    public void checkPage(String arg0) {assertEquals(arg0, welcomePage.getDriver().getCurrentUrl());}
@Step
    public void clickNextButton() {welcomePage.clickNextBut();}
@Step
    public void clickEightCat() {welcomePage.clickEightCategory();}
@Step
    public void checkCatPage(String arg0) {assertEquals(arg0, welcomePage.getDriver().getCurrentUrl());}
@Step
    public void scrollWithMouseToTheRight() {welcomePage.checkToTheRight();}
@Step
    public void scrollWithMouseToTheLeft() {welcomePage.checkToTheLeft();}
@Step
    public void clickFNewsLink() {welcomePage.clickFNewsLink();}
@Step
    public void checkBlogPage(String arg0) {assertTrue(welcomePage.getDriver().getCurrentUrl().contains(arg0));}
@Step
    public void clickLNewsLink() {welcomePage.clickLNewsLink();}
@Step
    public void fillSearch(String arg0) {searchPage.fillSearch(arg0);}
@Step
    public void moveToCarousel() {welcomePage.moveToCarousel();}
@Step
    public void checkSearchField(String arg0) {assertEquals(arg0,searchPage.searchFieldResult());}
@Step
    public void checkScope(String arg0) {assertEquals(arg0, searchPage.checkScopeField());}
@Step
    public void clcickSearchButton() {welcomePage.clickSearchButton();}
@Step
    public void clickReadMoreLink() {welcomePage.clickReadMoreLink();}
@Step
    public void checkReadMorePage(String arg0) {assertEquals(arg0, welcomePage.checkReadMorePage());}
@Step
    public void scrollDown() {welcomePage.scrollDown();}
@Step
    public void selectItLang(String arg) {welcomePage.selectItLang(arg);}
@Step
    public void checkLocalization(List<String> loc) {assertEquals(loc, welcomePage.checkLocalization());}
@Step
    public void checkFooterLocal(List<String> footLoc) {assertEquals(footLoc, welcomePage.checkFooterLocal());}

//=================================================05 - "PRODUCTS" page=================================================
@Step
    public void clickOnTheFirstCategory() {productsPage.clickCategory();}
@Step
    public void transByBreadCrumb() {productsPage.transByBreadCrumb();}
@Step
    public void checkCurrentPage(String arg) {assertTrue(productsPage.getTitle().toUpperCase().contains(arg));}
@Step
    public void clickProdLink(String arg0) {productsPage.clickProd(arg0);}
@Step
    public void checkSearchContent(String arg0) {assertTrue(searchPage.checkContent(arg0));}
@Step
    public void changeScope(String arg) {searchPage.changeScope(arg);}
@Step
    public void clickSearchButton() {searchPage.clickSearchButton();}
@Step
    public void changeProductView(String arg0) {productsPage.changeProductView(arg0);}
@Step
    public void checkProductsView() {assertTrue(productsPage.checkProductView());}
@Step
    public void checkProductsViewInList() {assertTrue(productsPage.checkProductViewInList());}
@Step
    public void clickProduct(String arg) {productsPage.clickProduct(arg);}
@Step
    public void isElementsPresent() {productsPage.isElementPresent();}
@Step
    public void checkUrl(String link, String url) {productsPage.checkUrl(link, url);}
@Step
    public void clickOnMinHeaderLinks(String arg) {productsPage.clickOnMinHeaderLinks(arg);}
@Step
    public void checkRightURL(String arg) {assertEquals(arg, productsPage.getDriver().getCurrentUrl());}
@Step
    public void clickTheButton(String arg) {productsPage.clickTheButton(arg);}
}