package org.bcs.qa.community.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationPageYa {

    public void textRegistration(String text) {
        $(By.xpath("//*[text()='" + text + "']")).shouldBe(Condition.visible);}

//    @FindBy(id = "firstname")
//    private SelenideElement inputFirstName;
//
//    @FindBy(id = "lastname")
//    private SelenideElement inputLastName;
//
//    @FindBy(id = "login")
//    private SelenideElement inputLogin;
//
//    @FindBy(id = "password")
//    private SelenideElement inputPassword;
//
//    @FindBy(id = "password_confirm")
//    private SelenideElement passwordConfirm;
//
//    @FindBy(id = "phone")
//    private SelenideElement inputPhoneNumber;


}

