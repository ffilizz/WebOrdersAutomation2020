package com.weborders.pages;

import com.weborders.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractBasePage {

    protected WebDriver driver=Driver.getDriver();
    protected WebDriverWait wait= new WebDriverWait(driver,5);

    public AbstractBasePage(){
        PageFactory.initElements(driver,this);
    }



}
