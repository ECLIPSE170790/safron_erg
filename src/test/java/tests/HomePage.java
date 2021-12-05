package tests;

import static com.codeborne.selenide.Selectors.byText;
import static io.qameta.allure.Allure.step;
import org.junit.jupiter.api.Test;
import tests.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class HomePage extends TestBase{

    @Test
    void checkHomePage() {
        step("Open home page of ERG", () -> {
            open("https://www.erg.kz/ru"); });

        step("Checking word 'Главная'", () -> {
            $(".navigation").shouldHave(text("Главная"));
        });
    }

   // @Test //не работает, вылезают согласия куки
   // void gotToYouTube() {
   //    step("Open home page of ERG", () -> {
   //       open("https://www.erg.kz/ru");
   //    });
   //     step("Click YouTube", () -> {
   //         $(".social-media-item", 3).click();
   //         switchTo().window(1);
   //         $(".style-scope.ytd-channel-name").shouldHave(text("ERG Kazakhstan"));
   //     });
   // }

    @Test
    void gotToSmartERG() {
        step("Open home page of ERG", () -> {
            open("https://www.erg.kz/ru");
        });

        step("Click SmartERG", () -> {
            $(".social-media-item", 2).click();
        });

        step("Switch new window", () -> {
            switchTo().window(1);
        });

        step("Checking word 'SmartERG'", () -> {
            $(".jss13",0).shouldHave(text("SmartERG"));
        });
    }

    @Test
    void searchBTS() {
        step("Open home page of ERG", () -> {
            open("https://www.erg.kz/ru");
        });

        step("Click Search", () -> {
            $(".search-link__button").click();
        });

        step("Input BTS", () -> {
            $(".search__input").setValue("BTS").pressEnter();
        });

        step("Checking results of search", () -> {
            $(".search__item", 2).shouldHave(text("BTS"));
        });
    }
}
