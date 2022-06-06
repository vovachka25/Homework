package Runner;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeTest;

public class ChromeRunner {
    @BeforeTest

    public static void Setup(){
        Selenide.open("https://ee.ge/");
//        Configuration.browserSize - "1600 x 1200";
    }
}
