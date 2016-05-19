package cucumberProject.pages;

import cucumberProject.Locators;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;


@DefaultUrl("http://192.168.214.3:8080/welcome")
public class WelcomePage extends PageObject {

    @FindBy(xpath = Locators.CAROUSEL_FIRST_IMAGE)
    WebElementFacade carouselFImage;

    public void clickOnTheTextLink(){$(Locators.CLICK_ON_PRODUCTS_BUTTON).click();}

    public void clickOnTheSP() {$(Locators.CLICK_ON_SPECAIL_OFFERS_BUTTON).click();}

    public void clickOnTheBlogs() {$(Locators.CLICK_ON_BLOGS_BUTTON).click();}

    public void clickOnTheContactLink() {$(Locators.CLICK_ON_CONTACT_US_BUTTON).click();}

    public void clickOnGPlay() {$(Locators.GOOGLE_PLAY).click();}

    public void clickOnAppStore() {$(Locators.APP_STORE).click();}

    public void clickOnRButton() {
        waitABit(5000);
        for (int i = 0; i < 3; i++) {
            $(Locators.RIGHT_CAROUSEL_BUTTON).click();
            waitABit(1000);
        }
    }
    public void checkcarouselImage() {
        Assert.assertTrue(carouselFImage.isDisplayed());
    }

    public void clickOnLButton() {
        for (int i=0;i<3;i++){
            $(Locators.LEFT_CAROUSEL_BUTTON).click();
        }
    }
    public void mouseClick() {
        Actions builder = new Actions(getDriver());
        waitABit(1000);
        WebElement imageLink = getDriver().findElement(By.xpath("//div[@data-slick-index='0']"));
        builder.moveToElement(imageLink).perform();
        WebElement itemLink = getDriver().findElement(By.xpath("//div[@data-slick-index='0']/div/div[2]/div/div/div/h3/a"));
        builder.click(itemLink).perform();
    }

    public void categoryClick() {
        Actions action = new Actions(getDriver());
        WebElement categoryLink = getDriver().findElement(By.xpath("//li[@data-slick-index='0']"));
        action.moveToElement(categoryLink).perform();
        WebElement itemLink = getDriver().findElement(By.xpath("//li[@data-slick-index='0']/div/a"));
        action.click(itemLink).perform();
    }

    public void clickNextBut() {$(Locators.NEXT_BUTTON).click();}

    public void clickEightCategory() {
        Actions action = new Actions(getDriver());
        WebElement eightCategoryLink = getDriver().findElement(By.xpath("//li[@data-slick-index='4']"));
        action.moveToElement(eightCategoryLink).perform();
        WebElement link = getDriver().findElement(By.xpath("//li[@data-slick-index='4']/div/a"));
        action.click(link).perform();
    }

    public void checkToTheRight() {
        Actions action = new Actions(getDriver());
        WebElement imageLink1 = getDriver().findElement(By.xpath("//div[@data-slick-index='0']"));
        action.dragAndDropBy(imageLink1,900,0).perform();
        waitABit(3000);
        WebElement imageLink2 = getDriver().findElement(By.xpath("//div[@data-slick-index='3']"));
        action.dragAndDropBy(imageLink2,900,0).perform();
    }

    public void checkToTheLeft() {
        Actions action = new Actions(getDriver());
        WebElement imageLink1 = getDriver().findElement(By.xpath("//div[@data-slick-index='2']"));
        action.dragAndDropBy(imageLink1,-900,0).perform();
        waitABit(2000);
        WebElement imageLink2 = getDriver().findElement(By.xpath("//div[@data-slick-index='4']"));
        action.dragAndDropBy(imageLink2,-500,0).perform();
    }

    public void clickFNewsLink() {
        WebElement newsLink = getDriver().findElement(By.xpath("//*[@id='p_p_id_101_INSTANCE_FdNrpnFe314s_']/div/div/div[3]/h3/a"));
        newsLink.click();
    }

    public void clickLNewsLink() {
        WebElement lNewsLink = getDriver().findElement(By.xpath("//*[@id='p_p_id_101_INSTANCE_FdNrpnFe314s_']/div/div/div[7]/h3/a"));
        lNewsLink.click();
    }


    public void moveToCarousel() {
        boolean image = false;
        while(image==false){
            try {
                getDriver().findElement(By.xpath("//div[@data-slick-index='0']")).isEnabled();
                image = true;
            }catch (Exception e){}
        }
        Actions moveToCarousel = new Actions(getDriver());
        WebElement target = getDriver().findElement(By.xpath("//*[contains(concat(' ', @class, ' '), ' portlet-content-container ')]"));
        moveToCarousel.moveToElement(target);
    }

    public void clickSearchButton() {
        WebElement searchButton = getDriver().findElement(By.xpath("//button[contains(text(),'Search')]"));
        searchButton.click();
    }

    public void clickReadMoreLink() {
        WebElement readMore = getDriver().findElement(By.xpath("//a[contains(text(),'Read more About us »')]"));
        readMore.click();
    }

    public String checkReadMorePage() {
        String name = getDriver().getTitle();
        return name;
    }

    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("scrollBy(0,2500)");
        getDriver().findElement(By.xpath("//*[@id='back-top']/a")).click();
    }
    public List<String> checkLocalization(){
        List<String>  locList = new ArrayList<>();
        for(WebElement resList : getDriver().findElements(By.xpath("//nav/ul/li/a/span"))) {
            locList.add(resList.getText().toUpperCase());
        }
        return locList;
    }

    public void selectItLang(String arg) {
        Actions action = new Actions(getDriver());
        action.click(getDriver().findElement(By.xpath("//*[contains(concat(' ', @class, ' '), 'language-panel inline')]"))).perform();
        action.click(getDriver().findElement(By.xpath("//*[contains(concat(' ', @class, ' '), 'control-group')]/select/option[" +arg +"]"))).perform();
    }

    public List<String> checkFooterLocal() {
        List<String>  locList = new ArrayList<>();
        for(WebElement resList : getDriver().findElements(By.xpath("//*[contains(concat(' ', @class, ' '), 'footer_nav')]/li/a/span"))) {
            locList.add(resList.getText().toUpperCase());
        }
        return locList;
    }
}
