package pages;

import com.codeborne.selenide.SelenideElement;
import org.openga.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private final SelenideElement loginButton = $(By.xpath(xpathExpression:"//a@class='login-button'"));
    void checkVisibleLoginButton (){

    }
}
