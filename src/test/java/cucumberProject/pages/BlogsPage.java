package cucumberProject.pages;


import cucumberProject.Locators;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class BlogsPage extends PageObject{
    @FindBy(xpath = Locators.BLOG_PAGE_NAME)
    private WebElementFacade blogsPageName;
    @FindBy(xpath = Locators.NEWS_LIST)
    private WebElementFacade newsList;
    @FindBy(xpath = Locators.BLOGS_PAGINATION_BLOCK)
    WebElementFacade blogsPagBlock;

    public boolean checkName() { return blogsPageName.isDisplayed();}

    public boolean checkList() {return newsList.isDisplayed();}

    public boolean checkPagBlock() {return blogsPagBlock.isDisplayed();
    }
}
