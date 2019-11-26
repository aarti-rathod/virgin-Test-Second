package com.virgingames.pages;

import com.virgingames.utillity.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by JANVI on 23/11/2019.
 */
public class Login extends Util {

    //used page factory syntax...

    @FindBy(xpath = "//a[contains(text(),'Login')]")
    WebElement loginField;

    @FindBy(xpath = "//input[@id='field-username']")
    WebElement emailField;

    @FindBy(xpath = "//input[@id='field-password']")
    WebElement _passWord;

    @FindBy(xpath = "//span[contains(text(),'Login')]")
    WebElement loginBtn;

    @FindBy(xpath = "//div[@class='output']")
    WebElement message;


    public void clickOnTheLoginField() {
        clickOnElement(loginField);
    }

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(_passWord, password);
    }

    public void clickOnTheLoginBtn() {
        clickOnElement(loginBtn);
    }

    public void verifyErrorMessage() {
        String actual = "Please try again, your username/email or password has not been recognised";
        String expected = "Please try again, your username/email or password has not been recognised";
        verifyActualAndExpected(expected, actual);
    }

}
