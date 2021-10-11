package common;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static common.Config.BROWSER_AND_PLATFORM;
import static constants.Constant.TimeoutVariables.IMPLICIT_WAIT;

public class CommonActions {
    public static WebDriver createDriver(){
        WebDriver driver = null;
        switch (BROWSER_AND_PLATFORM) {
            case "chromedriver-mac":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver-mac");
                driver = new ChromeDriver();
                break;
            case "chromedriver-win.exe":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver-win.exe");
                driver = new ChromeDriver();
                break;
            case "geckodriver-mac":
                System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver-mac");
                driver = new FirefoxDriver();
                break;
            case "geckodriver-win.exe":
                System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver-win.exe");
                driver = new FirefoxDriver();
                break;
            default:
                Assertions.fail("INCORRECT BROWSER NAME" + BROWSER_AND_PLATFORM);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        return driver;
    }
}
