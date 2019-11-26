package com.virgingames.browserselector;

import com.virgingames.basepage.BasePage;
import com.virgingames.loadproperty.LoadProperty;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by JANVI on 23/11/2019.
 */
public class BrowserSelector extends BasePage {
   // String path=new String("user.dir");
    String baseUrl = new LoadProperty().getProperty("baseUrl");
   // String baseUrl="https://www.virgingames.com/";

    public void selectBrowser(String browser){

        if(browser.equalsIgnoreCase("firefox")){
            //C:\Users\JANVI\IdeaProjects\virgingames-task\driver\geckodriver.exe

        System.setProperty("webdriver.gecko.driver","C:\\Users\\JANVI\\IdeaProjects\\virgingames-task\\driver\\geckodriver.exe");
            driver=new FirefoxDriver();                                      //created object
            driver.get(baseUrl);
            driver.manage().window().maximize();                             //will maximize window
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //will wait 10 sec

        }
        else if(browser.equalsIgnoreCase("chrome")){

            //C:\Users\JANVI\IdeaProjects\virgingames-task\driver\chromedriver.exe
            System.setProperty("webdriver.chrome.driver","C:\\Users\\JANVI\\IdeaProjects\\virgingames-task\\driver\\chromedriver.exe");
            driver=new ChromeDriver();
            driver.get(baseUrl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        }else {
            System.out.println("Wrong Browser Name ");
        }
    }



}
