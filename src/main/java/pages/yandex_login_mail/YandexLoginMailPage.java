package pages.yandex_login_mail;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class YandexLoginMailPage extends BasePage {
    WebDriver driver;
    public YandexLoginMailPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By inputLogin = By.xpath("//input[@data-t='field:input-login']");
    private final By inputPassword = By.xpath("//input[@data-t='field:input-passwd']");

    /**
     * insert login
     **/
    public YandexLoginMailPage insertLogin(String login) {
        driver.findElement(inputLogin).sendKeys(login, Keys.ENTER);
        return this;
    }

    /**
     * insert login
     **/
    public YandexLoginMailPage insertPassword(String password) {
        driver.findElement(inputPassword).sendKeys(password, Keys.ENTER);
        return this;
    }
}
