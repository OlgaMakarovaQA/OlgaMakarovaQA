package org.bcs.qa.community.steps;


import io.cucumber.java.ru.Тогда;
import org.bcs.qa.community.page.RegistrationPageYa;


public class CheckTextDef {

        RegistrationPageYa registrationPageYa = new RegistrationPageYa();

        @Тогда("^текст \"([^\"]*)\" отобразился на странце$")

        public void  RegistrationButton(String arg0) {

            registrationPageYa.textRegistration(arg0);
        }
    }

