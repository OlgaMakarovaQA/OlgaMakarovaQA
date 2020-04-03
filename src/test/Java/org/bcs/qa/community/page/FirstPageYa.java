package org.bcs.qa.community.page;


import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;


public class FirstPageYa {

    public void registrationButton(String text) {
        $(By.xpath("//span[text()='" + text + "']/..")).click();

    }
}