package pages.yandex_mail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;
import java.util.List;
import static constants.Constant.TimeoutVariables.IMPLICIT_WAIT;

public class YandexMailPage extends BasePage {

    private final By btnEnterMail = By.xpath("//a[@href='https://passport.yandex.ru/auth?from=mail&origin=hostroot_homer_auth_ru&retpath=https%3A%2F%2Fmail.yandex.ru%2F&backpath=https%3A%2F%2Fmail.yandex.ru%3Fnoretpath%3D1']");
    private final By writeButton = By.xpath("//span[@class='mail-ComposeButton-Text']");
    private final By mailAddress = By.xpath("//div[@class='composeYabbles']");
    private final By mailTheme = By.xpath("//input[@class='composeTextField ComposeSubject-TextField']");
    private final By bodyLetter = By.xpath("//div[@class='cke_wysiwyg_div cke_reset cke_enable_context_menu cke_editable cke_editable_themed cke_contents_ltr cke_htmlplaceholder']");
    private final By btnSendIn = By.xpath("//button[@class='Button2 Button2_pin_circle-circle Button2_view_default Button2_size_l']");

    WebDriver driver;
    public YandexMailPage(WebDriver driver) {
        this.driver = driver;
    }


    public int getNumberOfMailBySubject() {
        /** This part of the code is waiting for all messages to be loaded.*/
        WebDriverWait wait = new WebDriverWait(driver, IMPLICIT_WAIT);
        wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//span[@title='Simbirsoft theme']")));

        /********************************************************/

        List<WebElement> inboxEmailsByItem = driver.findElements(
                By.xpath("//span[@title='Simbirsoft theme']"));
        return inboxEmailsByItem.size();
    }
    public String message(int number){
        return "Найдено" + number + "писем";
    };


    /** Click on the button enter the mail **/
    public YandexMailPage clickGoBtnMail () {
        driver.findElement(btnEnterMail).click();
        return this;
    }

    /** click write btn **/
    public YandexMailPage clickBtnWrite () {
        driver.findElement(writeButton).click();
        return this;
    }

    /** insert email **/
    public YandexMailPage insertAddressMail (String mail) {
        driver.findElement(mailAddress).sendKeys(mail);
        return this;
    }

    /** insert theme **/
    public YandexMailPage insertMailTheme (String theme) {
        driver.findElement(mailTheme).sendKeys(theme);
        return this;
    }

    /** Writing the text of the letter **/
    public YandexMailPage writingLetter () {
        driver.findElement(bodyLetter).sendKeys("Найдено " + getNumberOfMailBySubject() + " писем");
        return this;
    }

    /** To send a letter **/
    public YandexMailPage SendInLetter () {
        driver.findElement(btnSendIn).click();
        return this;
    }
}
