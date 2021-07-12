package com.lareau.pages;

import com.lareau.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//li[@id='menu-item-129']")
    public WebElement personal;

    @FindBy(xpath = "//li[@id='menu-item-116']")
    public WebElement commercial;

    @FindBy(xpath = "//li[@id='menu-item-806']")
    public By claims;

    @FindBy(xpath = "//li[@id='menu-item-810']")
    public WebElement whyLareau;

    @FindBy(xpath = "//li[@id='menu-item-163']")
    public WebElement blogs;

    @FindBy(xpath = "//li[@id='menu-item-163']")
    public WebElement contactUs;


}
