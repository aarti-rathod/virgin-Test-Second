package com.virgingames.basepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by JANVI on 23/11/2019.
 */


/*
 Test that the error message appears and is displayed correctly with invalid credentials.

 */
public class BasePage {
public static WebDriver driver;         //initialized driver

    public BasePage() {
       PageFactory.initElements(driver,this);
    }
}
