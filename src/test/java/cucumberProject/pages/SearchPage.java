package cucumberProject.pages;

import cucumberProject.Locators;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class SearchPage extends PageObject {
    @FindBy(xpath = Locators.SEARCH_FIELD)
    WebElementFacade searchField;
    @FindBy(xpath = Locators.SCOPE_FIELD)
    WebElementFacade scope;

    public void fillSearch(String arg0) {
        WebElement search = getDriver().findElement(By.xpath("//input[contains(concat(' ', @class, ' '), ' search-query ')]"));
        search.sendKeys(arg0);
        WebElement searchButton = getDriver().findElement(By.xpath("//button[contains(text(),'Search')]"));
        searchButton.click();
    }


    public String searchFieldResult() {
        return searchField.getValue();
    }

    public String checkScopeField() {
        return scope.getSelectedVisibleTextValue();
    }

    public boolean checkContent(String arg0) {
        try {
            getDriver().findElement(By.xpath("//*[span[contains(text(),'"+arg0+"')]]"));
            return true;
        }catch (Exception e){return false;}
    }

    public void changeScope(String arg) {
        Actions action = new Actions(getDriver());
        action.click(getDriver().findElement(By.xpath("//*[contains(concat(' ', @class, ' '), 'fieldset')]/*/select/option[contains(text(),'"+arg+"')]"))).perform();
    }

    public void clickSearchButton() {
        WebElement searchButton = getDriver().findElement(By.xpath("//button[contains(text(),'Search')]"));
        searchButton.click();
    }
}
