package ru.PolinaTest;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;


public class JunitTest {
    @Test
    void testJunit(){
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $x("//a[text()='SoftAssertions']").shouldBe(visible);
        $("a[href=\"/selenide/selenide/wiki/SoftAssertions\"]").click();
        $("h4 #user-content-3-using-junit5-extend-test-class").parent().shouldHave(text("3. Using JUnit5 extend test class:"));
    }
}
