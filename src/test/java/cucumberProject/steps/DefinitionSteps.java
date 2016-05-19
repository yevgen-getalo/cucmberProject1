package cucumberProject.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberProject.steps.serenity.EndUserSteps;

import java.util.ArrayList;
import java.util.List;


public class DefinitionSteps {

    @Steps
    EndUserSteps endUserSteps;

    @Given("^Welcome page$")
    public void welcomePage() throws Throwable {endUserSteps.openWelcomePage();}


    @When("^click on the \"([^\"]*)\" link$")
    public void clickOnTheLink(String arg0) throws Throwable {
        endUserSteps.clickOnTheTextLink();
    }
    @Then("^Must be present URL\"([^\"]*)\"$")
    public void mustBePresentURL(String prodURL) throws Throwable {
        endUserSteps.prodCheckURL(prodURL);
    }
    @Then("^Page's name Products$")
    public void pageSNameProducts() throws Throwable {
        endUserSteps.checkProdName();
    }

    @Then("^Categories list$")
    public void categoriesList() throws Throwable {
        endUserSteps.checkProdCatList();
    }

    @Then("^Products list$")
    public void productsList() throws Throwable {
        endUserSteps.checkProdList();
        endUserSteps.openWelcomePage();
    }

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    @When("^click on the Special offers link$")
    public void clickOnTheSpecialOffersLink() throws Throwable {
        endUserSteps.clickOnTheSPLink();

    }

    @Then("^Must be present SP URL\"([^\"]*)\"$")
    public void mustBePresentSPURL(String spURL) throws Throwable {
        endUserSteps.checkSPURL(spURL);

    }

    @Then("^Page's name Special Offers$")
    public void pageSNameSpecialOffers() throws Throwable {
        endUserSteps.checkSPName();

    }

    @Then("^SP Products list$")
    public void spProductsList() throws Throwable {
        endUserSteps.checkSPProdList();

    }

    @Then("^Pagination block$")
    public void paginationBlock() throws Throwable {
        endUserSteps.checkSPPafBlock();

    }

    @Then("^SP label$")
    public void spLabel() throws Throwable {
        endUserSteps.checkProdLabel();

    }
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    @When("^click on the Blogs link$")
    public void clickOnTheBlogsLink() throws Throwable {
        endUserSteps.clickOnTheBlogsLink();
    }

    @Then("^Must be present Blogs URL\"([^\"]*)\"$")
    public void mustBePresentBlogsURL(String blogsURL) throws Throwable {
        endUserSteps.checkBlogsURL(blogsURL);
    }

    @Then("^Page's name Blogs$")
    public void pageSNameBlogs() throws Throwable {
        endUserSteps.checkBlogsName();
    }

    @Then("^Blogs news list$")
    public void blogsNewsList() throws Throwable {
        endUserSteps.checkNewsList();
    }

    @Then("^Bottom pagination block$")
    public void bottomPaginationBlock() throws Throwable {
        endUserSteps.checkPagBlock();
    }
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    @When("^click on the Contact us link$")
    public void clickOnTheContactUsLink() throws Throwable {
        endUserSteps.clickOnTheContactLink();
    }

    @Then("^Must be present Contact us URL\"([^\"]*)\"$")
    public void mustBePresentContactUsURL(String cont) throws Throwable {
        endUserSteps.checkContactURL(cont);
    }

    @Then("^Page's name Contact Us$")
    public void pageSNameContactUs() throws Throwable {
        endUserSteps.checkContName();
    }

    @Then("^Google Map$")
    public void googleMap() throws Throwable {
        endUserSteps.checkGMap();
    }

    @Then("^Contact details$")
    public void contactDetails() throws Throwable {
        endUserSteps.checkContDet();
    }

    @Then("^Additional information$")
    public void additionalInformation() throws Throwable {
        endUserSteps.checkAddInfo();
    }
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    @When("^click on the Google play image link$")
    public void clickOnTheGooglePlayImageLink() throws Throwable {
        endUserSteps.clickOnGPlay();
    }
    @Then("^Must be opened Google play page with URL\"([^\"]*)\"$")
    public void mustBeOpenedGooglePlayPageWithURL(String gooPlay) throws Throwable {
        endUserSteps.checkGPlay(gooPlay);
    }

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    @When("^click on the App store image link$")
    public void clickOnTheAppStoreImageLink() throws Throwable {
        endUserSteps.clickOnAppStore();
    }
    @Then("^Must be opened App store page with URL\"([^\"]*)\"$")
    public void mustBeOpenedAppStorePageWithURL(String appStore) throws Throwable {
        endUserSteps.checkAppStore(appStore);
    }

    //03.0001 "Check "OUR SPECIAL OFFERS" image carousel spinning to the right"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    @When("^Scroll images in carousel with holding LMB and move to the right two times$")
    public void scrollImagesInCarouselWithHoldingLMBAndMoveToTheRightTwoTimes() throws Throwable {
        endUserSteps.moveToCarousel();
        endUserSteps.scrollWithMouseToTheRight();
    }
    @Then("^Images in carousel must spin in a circle to the right by mouse$")
    public void imagesInCarouselMustSpinInACircleToTheRightByMouse() throws Throwable {
        endUserSteps.checkCarousel();
    }

    //03.0002 "Check "OUR SPECIAL OFFERS" image carousel spinning to the left"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    @When("^Scroll images in carousel with holding LMB and move to the left two times$")
    public void scrollImagesInCarouselWithHoldingLMBAndMoveToTheLeftTwoTimes() throws Throwable {
        endUserSteps.moveToCarousel();
        endUserSteps.scrollWithMouseToTheLeft();
    }
    @Then("^Images in carousel must spin in a circle to the left by mouse$")
    public void imagesInCarouselMustSpinInACircleToTheLeftByMouse() throws Throwable {
        endUserSteps.checkCarousel();
    }

    //03.0003 "Check the ">" button for the image carousel"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    @When("^Click with LMB on the > button$")
    public void clickWithLMBOnTheButtonTwoTimes() throws Throwable {
        endUserSteps.clickOnRButton();
    }
    @Then("^Images in carousel must spin in a circle to the right$")
    public void imagesInCarouselMustSpinInACircleToTheRight() throws Throwable {
        endUserSteps.checkCarousel();
    }

    //03.0004 "Check the "<" button for the image carousel"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    @When("^Click with LMB on the < button$")
    public void clickWithLMBOnTheButton() throws Throwable {
        endUserSteps.moveToCarousel();
        endUserSteps.clickOnLButton();
    }
    @Then("^Images in carousel must spin in a circle to the left$")
    public void imagesInCarouselMustSpinInACircleToTheLeft() throws Throwable {
        endUserSteps.checkCarousel();
    }

    //03.0005 "Check the transition by clicking the first product's item name link"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    @When("^Hover the mouse pointer over the first image of the product and click the item name link with LMB$")
    public void hoverTheMousePointerOverTheFirstImageOfTheProductAndClickTheItemNameLinkWithLMB() throws Throwable {
        endUserSteps.moveToCarousel();
        endUserSteps.moveMouseAndClick();
    }
    @Then("^open link \"([^\"]*)\"$")
    public void openLink(String arg0) throws Throwable {
        endUserSteps.checkLink(arg0);
    }
    @Then("^name of this product \"([^\"]*)\"$")
    public void nameOfThisProduct(String currProdName) throws Throwable {
        endUserSteps.checkCurrProdName(currProdName);
    }
    @Then("^navigation tag link \"([^\"]*)\"$")
    public void navigationTagLink(String prodTagLink) throws Throwable {
        endUserSteps.checkTagLink(prodTagLink);
    }

    //03.0013 "Check the transition by clicking first image link in product categories list slider"~~~~~~~~~~~~~~~~~~~~~
    @When("^Hover the mouse pointer over the first image of the category and click$")
    public void hoverTheMousePointerOverTheFirstImageOfTheCategoryAndClick() throws Throwable {
        endUserSteps.moveMouseToFCategory();
    }
    @Then("^open page \"([^\"]*)\"$")
    public void openPage(String arg0) throws Throwable {
        endUserSteps.checkPage(arg0);
    }

    //03.0015 "Check the transition by clicking eighth link in product categories list slider"~~~~~~~~~~~~~~~~~~~~~~~~~~
    @When("^Click next button$")
    public void clickNextButton() throws Throwable {
        endUserSteps.clickNextButton();
    }
    @When("^Hover the mouse pointer over the eight image of the category and click$")
    public void hoverTheMousePointerOverTheEightImageOfTheCategoryAndClick() throws Throwable {
        Thread.sleep(3000);
        endUserSteps.clickEightCat();
    }
    @Then("^check open page \"([^\"]*)\"$")
    public void checkOpenPage(String arg0) throws Throwable {
        endUserSteps.checkCatPage(arg0);
    }

    //03.0018 "Check first blog's link"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    @When("^Click with LMB on the text link of the first blog's link in the list$")
    public void clickWithLMBOnTheTextLinkOfTheFirstBlogSLinkInTheList() throws Throwable {
        endUserSteps.clickFNewsLink();
    }
    @Then("^check open page that contains \"([^\"]*)\"$")
    public void checkOpenPageThatContains(String arg0) throws Throwable {
        endUserSteps.checkBlogPage(arg0);
    }

    //03.0019 "Check fifth blog's link"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    @When("^Click with LMB on the text link of the fifth blog's link in the list$")
    public void clickWithLMBOnTheTextLinkOfTheFifthBlogSLinkInTheList() throws Throwable {
        endUserSteps.clickLNewsLink();
    }
    @Then("^Check open page that contains \"([^\"]*)\"$")
    public void check_OpenPageThatContains(String arg0) throws Throwable {
        endUserSteps.checkBlogPage(arg0);
    }

    //03.0020 "Check search with filled searching field"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    @When("^Type the word \"([^\"]*)\", click on the SEARCH button with LMB$")
    public void typeTheWordClickOnTheSEARCHButtonWithLMB(String arg0) throws Throwable {
        endUserSteps.fillSearch(arg0);
    }
    @Then("^Check open page that contains \"([^\"]*)\" in search field$")
    public void checkOpenPageThatContainsInSearchField(String arg0) throws Throwable {
         endUserSteps.checkSearchField(arg0);
    }
    @Then("^in field of search category sets \"([^\"]*)\" scope$")
    public void inFieldOfSearchCategorySetsScope(String arg0) throws Throwable {
        endUserSteps.checkScope(arg0);
    }

    //03.0021 "Check "SEARCH" button"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    @When("^click on the SEARCH button with LMB$")
    public void clickOnTheSEARCHButtonWithLMB() throws Throwable {
        endUserSteps.clcickSearchButton();
    }
    @Then("^Check open page that contains empty \"([^\"]*)\" in search field$")
    public void checkOpenPageThatContainsEmptyInSearchField(String arg0) throws Throwable {
        endUserSteps.checkSearchField(arg0);
    }
    @Then("^in field of search category must be displayed \"([^\"]*)\" scope$")
    public void inFieldOfSearchCategoryMustBeDisplayedScope(String arg0) throws Throwable {
        endUserSteps.checkScope(arg0);
    }

    //03.0022 "Check "Read more About us" text link"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    @When("^Click with LMB on the Read more About Us link$")
    public void clickWithLMBOnTheReadMoreAboutUsLink() throws Throwable {
        endUserSteps.clickReadMoreLink();
    }
    @Then("^Must be opened page with name \"([^\"]*)\"$")
    public void mustBeOpenedPageWithName(String arg0) throws Throwable {
        endUserSteps.checkReadMorePage(arg0);
    }

    //03.0023 "Check back-to-top button"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    @When("^Scroll to the bottom of the page using scroll bar and click Up button$")
    public void scrollToTheBottomOfThePageUsingScrollBarAndClickUpButton() throws Throwable {
        endUserSteps.scrollDown();
    }

//=================================================04 - "WELCOME" page localization=====================================

    //04.0001 "Check Italian localization"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    @When("^Select \"([^\"]*)\" ITALIANO language$")
    public void selectLanguage(String arg) throws Throwable {
        endUserSteps.selectItLang(arg);
    }
    @Then("^Page must be restarted in Italiano language$")
    public void pageMustBeRestartedInItalianoLanguage(List<String> loc) throws Throwable {
        endUserSteps.checkLocalization(loc);
    }
    @Then("^Page must be restarted in Italiano language footer$")
    public void pageMustBeRestartedInItalianoLanguageFooter(List<String> footLoc) throws Throwable {
        endUserSteps.checkFooterLocal(footLoc);
    }

    //04.0002 "Check Ukrainian localization"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    @When("^Select \"([^\"]*)\" українська language$")
    public void selectУкраїнськаLanguage(String arg) throws Throwable {
        endUserSteps.selectItLang(arg);
    }
    @Then("^Page must be restarted in Ukrainian language$")
    public void pageMustBeRestartedInUkrainianLanguage(List<String> loc) throws Throwable {
        endUserSteps.checkLocalization(loc);
    }
    @Then("^Page must be restarted in Ukrainian language footer$")
    public void pageMustBeRestartedInUkrainianLanguageFooter(List<String> footLoc) throws Throwable {
        endUserSteps.checkFooterLocal(footLoc);
    }

    //04.0003 "Check Russian localization"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    @When("^Select \"([^\"]*)\" русский language$")
    public void selectРусскийLanguage(String arg) throws Throwable {
        endUserSteps.selectItLang(arg);
    }
    @Then("^Page must be restarted in Russian language$")
    public void pageMustBeRestartedInRussianLanguage(List<String> loc) throws Throwable {
        endUserSteps.checkLocalization(loc);
    }
    @Then("^Page must be restarted in Russian language footer$")
    public void pageMustBeRestartedInRussianLanguageFooter(List<String> footLoc) throws Throwable {
        endUserSteps.checkFooterLocal(footLoc);
    }

    //04.0004 "Check English localization"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    @When("^Select \"([^\"]*)\" English language$")
    public void selectEnglishLanguage(String arg0) throws Throwable {
        endUserSteps.selectItLang(arg0);
    }
    @Then("^Page must be restarted in English language$")
    public void pageMustBeRestartedInEnglishLanguage(List<String> loc) throws Throwable {
        endUserSteps.checkLocalization(loc);
    }
    @Then("^Page must be restarted in English language footer$")
    public void pageMustBeRestartedInEnglishLanguageFooter(List<String> footLoc) throws Throwable {
        endUserSteps.checkFooterLocal(footLoc);
    }

//=================================================05 - "PRODUCTS" page=================================================

    @Given("^Products page$")
    public void productsPage() throws Throwable {
        endUserSteps.openProductsPage();
    }

    //05.0006 "Check transition using breadcrumbs container"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    @When("^Click with LMB on first category in categories list$")
    public void clickWithLMBOnFirstCategoryInCategoriesList() throws Throwable {
        endUserSteps.clickOnTheFirstCategory();
    }
    @And("^Click with LMB on the previous breadcrumb-truncate$")
    public void clickWithLMBOnThePreviousBreadcrumbTruncate() throws Throwable {
        endUserSteps.transByBreadCrumb();
    }
    @Then("^Must be transition to the \"([^\"]*)\" page$")
    public void mustBeTransitionToThePage(String arg0) throws Throwable {
        endUserSteps.checkCurrentPage(arg0);
    }

    //05.0007 "Check the transition to the produc's category from current product's page using breadcrumb link"~~~~~~~~~
    @When("^Click with LMB on the \"([^\"]*)\" name link$")
    public void clickWithLMBOnTheNameLink(String arg0) throws Throwable {
        endUserSteps.clickProdLink(arg0);
    }
    @And("^Click on the previous breadcrumb-truncate$")
    public void clickOnThePreviousBreadcrumbTruncate() throws Throwable {
        endUserSteps.transByBreadCrumb();
    }
    @Then("^Must be transition to \"([^\"]*)\" page$")
    public void mustBeTransitionToPage(String arg0) throws Throwable {
        endUserSteps.checkCurrentPage(arg0);
    }

    //05.0009 "Check the search from "PRODUCTS" page with filled search field"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    @When("^Type the word \"([^\"]*)\" into the search field and press search button$")
    public void typeTheWordIntoTheSearchFieldAndPressSearchButton(String arg0) throws Throwable {
        endUserSteps.fillSearch(arg0);
    }
    @Then("^Then Check open page that contains \"([^\"]*)\" in search field$")
    public void thenCheckOpenPageThatContainsInSearchField(String arg0) throws Throwable {
        endUserSteps.checkSearchField(arg0);
    }
    @Then("^in field of search category must be \"([^\"]*)\" scope$")
    public void inFieldOfSearchCategoryMustBeScope(String arg0) throws Throwable {
        endUserSteps.checkScope(arg0);
    }
    @Then("^Must be present the list of products that contain \"([^\"]*)\"$")
    public void mustBePresentTheListOfProductsThatContain(String arg0) throws Throwable {
        endUserSteps.checkSearchContent(arg0);
    }

    //====================================================================================================================
    @When("^Type the  word \"([^\"]*)\" into the search field and press search button$")
    public void typeThe_WordIntoTheSearchFieldAndPressSearchButton(String arg0) throws Throwable {
        endUserSteps.fillSearch(arg0);
    }
    @When("^select \"([^\"]*)\"$")
    public void selectGlobal(String arg) throws Throwable {
        endUserSteps.changeScope(arg);
    }
    @When("^Click search button$")
    public void clickSearchButton() throws Throwable {
        endUserSteps.clickSearchButton();
    }
    //05.0010 "Check grid-view trigger"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    @When("^Click with LMB on the \"([^\"]*)\" view trigger button$")
    public void clickWithLMBOnTheViewTriggerButton(String arg0) throws Throwable {
        endUserSteps.changeProductView(arg0);
    }

    @Then("^Page must reload and all images of products must displayed in grid with three columns$")
    public void pageMustReloadAndAllImagesOfProductsMustDisplayedInWithThreeColumns() throws Throwable {
        endUserSteps.checkProductsView();
    }

    @When("^Click with LMB on the \"([^\"]*)\" view  trigger button$")
    public void clickWithLMBOnTheViewTriggerButtonAgain(String arg0) throws Throwable {
        endUserSteps.changeProductView(arg0);
    }

    @Then("^Page must reload and all images of products must displayed in list$")
    public void pageMustReloadAndAllImagesOfProductsMustDisplayedInListWithThreeColumns() throws Throwable {
        endUserSteps.checkProductsViewInList();
    }

    //05.0012 "Check transition to product page by clicking on the first product's image"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    @When("^Click with LMB on the ([^\"]*) in the list$")
    public void clickWithLMBOnTheFirstProductInTheList(String arg) throws Throwable {
        endUserSteps.clickProduct(arg);
    }

    @Then("^Must be opened current product page$")
    public void mustBeOpenedCurrentProductPage() throws Throwable {
        endUserSteps.isElementsPresent();
    }

    //05.0015,0016,0017,0018,0019,0020 "Check of the redirection to the social pages"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    @When("^Must ([^\"]*)transition to ([^\"]*) page in new window$")
    public void mustImageLinkTransitionToTargetPageaInNewWindow(String link, String url) throws Throwable {
        endUserSteps.checkUrl(link, url);
    }

    //==========================================06 "Minimized header"===================================================

    //06.0001,06.0002,06.0003,06.0004,06.0005~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    @When("^Click on ([^\"]*)$")
    public void clickOnPageSName(String arg) throws Throwable {
        endUserSteps.clickOnMinHeaderLinks(arg);
    }
    @Then("^Must be transition to ([^\"]*) page$")
    public void mustBeTransitionToTargetPage(String arg) throws Throwable {
        endUserSteps.checkRightURL(arg);
    }

    //06.0006,06.0007
    @When("^click on the ([^\"]*) in header$")
    public void clickOnTheButtonInHeader(String arg) throws Throwable {
        endUserSteps.clickTheButton(arg);
    }
    @Then("^Must be appeared ([^\"]*)$")
    public void mustBeAppearedAims(String arg) throws Throwable {
        endUserSteps.checkRightURL(arg);
    }
}

