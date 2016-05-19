package cucumberProject.pages;

import cucumberProject.Locators;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;


@DefaultUrl("http://192.168.214.3:8080/products")
public class ProductsPage extends PageObject {
    @FindBy(xpath = Locators.PRODUCTS_CATEGORIES)
    WebElementFacade prodCat;
    @FindBy(xpath = Locators.PRODUCTS_LIST)
    WebElementFacade prodList;
    @FindBy(xpath = Locators.PRODUCTS_PAGE_NAME)
    WebElement prodName;

    public boolean checkName() {return prodName.isDisplayed();}

    public boolean checkCatList() {return prodCat.isDisplayed();}

    public boolean checkProdList() {return prodList.isDisplayed();}

    public void clickCategory() {getDriver().findElement(By.xpath("//*[@id='_CATEGORY_PORTLET_WAR_ict4appsportlet_mainTreeMenu']/ul/li[1]/div/span/a")).click();
    }

    public void transByBreadCrumb() {getDriver().findElement(By.xpath("//*[contains(concat(' ', @class, ' '), 'current-parent breadcrumb-truncate')]/a")).click();
    }

    public void clickProd(String arg0) {
        getDriver().findElement(By.xpath("//*[@id='_PRODUCT_PORTLET_WAR_ict4appsportlet_product-list']/ul/li/div[2]/div/h3/a[contains(text(),'"+arg0+"')]")).click();
    }

    public void changeProductView(String arg0) {
        getDriver().findElement(By.xpath("//a[@href='http://192.168.214.3:8080/products/-/product/asc/orderValue/1/all/1/12/"+arg0+"']")).click();
    }

    public boolean checkProductView() {
        try {
            getDriver().findElement(By.xpath("//*[contains(concat(' ', @class, ' '), ' b-product-gallery b-gallery b-gallery-grid gallery-items-row grid cols-3 ')]"));
            return true;
        }catch (Exception e){return false;}
    }

    public boolean checkProductViewInList() {
        try {
            getDriver().findElement(By.xpath("//*[contains(concat(' ', @class, ' '), ' b-product-gallery b-gallery b-gallery-list ')]"));
            return true;
        }catch (Exception e){return false;}
    }

    public void clickProduct(String arg) {
        getDriver().findElement(By.xpath("//*[@id='_PRODUCT_PORTLET_WAR_ict4appsportlet_product-list']/ul/li[1]/div/div["+arg+"]//a")).click();
    }

    public void isElementPresent() {
    getDriver().findElement(By.xpath("//*[@id='_PRODUCT_PORTLET_WAR_ict4appsportlet_fullPage']")).isDisplayed();
    }
/*
    public void clickLink(String link) {
        getDriver().findElement(By.xpath("//ul/li[1]/div[2]/div[3]/div/span/a[@data-service='"+link+"']")).click();
    }
    */

    public void checkUrl(String link, String url) {
        final Set<String> oldWindowsSet = getDriver().getWindowHandles();
        getDriver().findElement(By.xpath("//ul/li[1]/div[2]/div[3]/div/span/a[@data-service='"+link+"']")).click();
        String newWindowHandle = (new WebDriverWait(getDriver(), 10))
                .until(new ExpectedCondition<String>() {
                           public String apply(WebDriver driver) {
                               Set<String> newWindowsSet = driver.getWindowHandles();
                               newWindowsSet.removeAll(oldWindowsSet);
                               return newWindowsSet.size() > 0 ?
                                       newWindowsSet.iterator().next() : null;
                           }
                       }
                );
        Assert.assertTrue(getDriver().switchTo().window(newWindowHandle).getCurrentUrl().contains(url));

    }

    public void clickOnMinHeaderLinks(String arg) {
        getDriver().findElement(By.xpath("//*[@id='navigation']/ul/li/a/span[contains(text(),'"+arg+"')]")).click();
    }

    public void clickTheButton(String arg) {
        getDriver().findElement(By.xpath("//*[contains(concat(' ', @class, ' '), '"+arg+"')]")).click();
    }
}


