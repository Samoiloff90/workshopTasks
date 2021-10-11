package pages.yandex_search;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class YandexSearchPage extends BasePage {


    private final By searchBar = By.xpath("//input[@ id='text']");
    private final By searchMail = By.xpath("//a[@href='https://mail.yandex.ru/']");


    WebDriver driver;
    public YandexSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    /** Search engine query method **/
    public YandexSearchPage searchOnInternet(String query) {
        driver.findElement(searchBar).sendKeys(query, Keys.ENTER);
        return this;
    }

    /** We find what we were looking for. Find a link to mail **/
    public YandexSearchPage goToMailFromSearch () {
        driver.findElement(searchMail).click();
        return this;
    }

}
