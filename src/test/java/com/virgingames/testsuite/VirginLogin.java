package com.virgingames.testsuite;

import com.virgingames.loadproperty.LoadProperty;
import com.virgingames.pages.Login;
import com.virgingames.testbase.TestBase;
import org.testng.annotations.Test;

/**
 * Created by JANVI on 23/11/2019.
 */
public class VirginLogin extends TestBase {
    Login loginpage =new Login();        //created object

    @Test
public void userShouldAbleToSeeErrorMesaageWithInvalidCredentialsInput(){

        loginpage =new Login();
        loginpage.clickOnTheLoginField();
        loginpage.enterEmail(new LoadProperty().getProperty("email_"));
        loginpage.enterPassword(new LoadProperty().getProperty("password_"));
        loginpage.clickOnTheLoginBtn();
        loginpage.verifyErrorMessage();
    }
}


