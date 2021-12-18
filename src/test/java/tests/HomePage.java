package tests;

import static com.codeborne.selenide.Selectors.byText;
import static io.qameta.allure.Allure.step;
import config.CredentialsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

@Tag("properties")
public class HomePage extends TestBase{

    public CredentialsConfig credentials =
            ConfigFactory.create(CredentialsConfig.class);

    @Test
    void checkHomePage() {
        step("Open home page of ERG", () -> {
            open("https://www.erg.kz/ru"); });

        step("Checking word 'Главная'", () -> {
            $(".navigation").shouldHave(text("Главная"));
        });
    }

    @Test
    void goToSmartERG() {

        String mobile_phone = credentials.mobile_phone();

        step("Open home page of ERG", () -> {
            open("https://www.erg.kz/ru");
        });

        step("Click on cookie", () -> {
            $("#acceptCookies").click();
        });

        step("Click SmartERG", () -> {
            $(".social-media-item", 3).click();
        });

        step("Switch new window", () -> {
            switchTo().window(1);
        });

        step("Click Войти", () -> {
            $(".jss22").click();
        });

        step("Add number", () -> {
            $("#mat-input-0").setValue(mobile_phone);
        });

        step("Click Получить код", () -> {
            $(".mt-24").click();
        });

        step("Check text", () -> {
            $("div.code-subtitle").shouldHave(text("Код отправлен на номер: +77010817156"));
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
            $(".search__item", 3).shouldHave(text("BTS"));
        });
    }

    @Test
    void searchEEC() {
        step("Open home page of ERG", () -> {
            open("https://www.erg.kz/ru");
        });

        step("Click all company", () -> {
            $("button.btn-light").click();
        });

        step("Click EEC", () -> {
            $("#bs-select-1-21").click();
        });

        step("Checking results of search", () -> {
            $("#Экибастуз").shouldHave(text("Экибастуз"));
        });
    }

    @Test
    void searchPurchases() {
        step("Open home page of ERG", () -> {
            open("https://www.erg.kz/ru");
        });

        step("Click on cookie", () -> {
            $("#acceptCookies").click();
        });

        step("Click Purchases", () -> {
            $(byText("Закупки")).click();
        });

        step("Checking Purchases portal", () -> {
            $(".article__heading-title").shouldHave(text("Портал закупок"));
        });
    }
}
