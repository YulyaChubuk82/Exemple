import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ExempleUITest {
    @Test
    @DisplayName("Проверка открытия главной страницы")
    void testOpemMainPage() {
        open("https://xn--80afcdbalict6afooklqi5o.xn--p1ai/identity/account/login ");
        $(Bu.xpath(xpath"//a[@class='login-button']")).shoulBe(visible);


    }

}
