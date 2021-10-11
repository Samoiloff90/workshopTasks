package common;
    /**
     * Specify the browser and platform for test:
     * chromedriver-win.exe
     * chromedriver-mac
     * geckodriver-mac
     * geckodriver-win.exe
     **/
public class Config {
    public static final String BROWSER_AND_PLATFORM = "chromedriver-win.exe";
    /** Clean browser cookies after each iteration: **/
    public static final Boolean CLEAR_COOKIES = true;
    /** To keep the browser open after all scenario/tests: **/
    public static final Boolean HOLD_BROWSER_OPEN = false;
    /** Clear the directory the screen before starting the build: **/
    public static final Boolean CLEAR_REPORTS_DIR = true;

    }
