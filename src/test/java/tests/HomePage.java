package tests;

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
    void gotToSmartERG() {
        step("Open home page of ERG", () -> {
            open("https://www.erg.kz/ru");
        });

        step("Click SmartERG", () -> {
            $(".social-media-item", 3).click();
        });

        step("Switch new window", () -> {
            switchTo().window(1);
        });

        step("Checking word 'SmartERG'", () -> {
            $(".jss13",0).shouldHave(text("SmartERG"));
        });

        //добавить вставку номера из credential.properties
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
