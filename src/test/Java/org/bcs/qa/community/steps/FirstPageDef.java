package org.bcs.qa.community.steps;

import io.cucumber.java.bg.И;
import org.bcs.qa.community.page.FirstPageYa;

public class FirstPageDef {

        FirstPageYa firstPageYa = new FirstPageYa();

        @И("^нажатие на кнопку \"([^\"]*)\"$")
        public void  registrationButton(String arg0) {

            firstPageYa.registrationButton(arg0);
        }
}

