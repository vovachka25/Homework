package ElitTest;

import Runner.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

import static com.codeborne.selenide.Selectors.*;


public class EeTest extends ChromeRunner {
    @Test

    public void Registration(){
        $("#search_list").click();
        $("#search_list").setValue("კომპიუტერი");
        $(byText("კომპიუტერის ჯოისტიკი")).click();
        $(".title.d-xs-none", 0).click();
        $(byText("დაამატე კალათში")).click();
        $(".cart-count").click();
        Assert.assertEquals($(byText("კალათა ცარიელია")).isDisplayed(),false);
//        $(byText("კალათა ცარიელია")).shouldNotBe(Condition.visible, Duration.ofMillis(2000));


    }
}
