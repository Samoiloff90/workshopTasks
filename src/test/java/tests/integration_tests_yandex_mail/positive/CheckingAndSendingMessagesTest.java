package tests.integration_tests_yandex_mail.positive;
import org.junit.jupiter.api.Test;
import tests.base.BaseTest;
import static constants.Constant.Letters.LETTER_THEM;
import static constants.Constant.TestData.LOGIN;
import static constants.Constant.TestData.PASSWORD;
import static constants.Constant.Urls.SEARCH_ENGINE;
import static constants.Constant.UrlsQuery.SEARCH_QUERY;

public class CheckingAndSendingMessagesTest extends BaseTest {

    @Test
    public void checkingMail(){
        basePage.goToUrl(SEARCH_ENGINE);
        yandexSearchPage.searchOnInternet(SEARCH_QUERY)
                .goToMailFromSearch();
        basePage.switchToAnotherTab(1);
        yandexMailPage.clickGoBtnMail();
        yandexLoginMailPage.insertLogin(LOGIN)
                .insertPassword(PASSWORD);
        yandexMailPage.clickBtnWrite()
                .insertAddressMail(LOGIN)
                .insertMailTheme(LETTER_THEM)
                .writingLetter()
                .SendInLetter();
    }
}
