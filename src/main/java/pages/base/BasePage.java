package pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

import static constants.Constant.TimeoutVariables.EXPLICIT_WAIT;

public class BasePage {

    WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver = driver;
    }
    public BasePage() {
    }

    /**
     * The method for navigating to a specific URL
     **/
    public void goToUrl (String url){
        driver.get(url);
    }


//    /**
//     * Wait for visibility element in DOM model
//     **/
    public WebElement waitElementIsVisible(WebElement element){
        new WebDriverWait(driver, EXPLICIT_WAIT).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public void switchToAnotherTab(int numberTab) {
        ArrayList<String> tabs_windows = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs_windows.get(numberTab));
    }

}
