package com.virgingames.testbase;

import com.virgingames.basepage.BasePage;
import com.virgingames.browserselector.BrowserSelector;
import com.virgingames.loadproperty.LoadProperty;
import org.junit.Before;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by JANVI on 23/11/2019.
 */
public class TestBase extends BasePage{
    BrowserSelector browserSelector =new BrowserSelector();
    LoadProperty loadProperty =new LoadProperty();
    String browser =new LoadProperty().getProperty("browser");

    @BeforeMethod
    public void setUp(){
        browserSelector.selectBrowser(browser);
    }
    @AfterMethod
    public void tearDown(){

    }

}



/*
 BrowserSelector browserSelector = new BrowserSelector(); //Multiple inheritance is not possible in java so we use object to get more than one class
    LoadProperty loadProperty = new LoadProperty();
    String browser = new LoadProperty().getProperty("browser"); //retrun it gives the value of browser which is "chrome"

    @BeforeMethod
    public void setUP() {
        browserSelector.selectBrowsers(browser);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
 */