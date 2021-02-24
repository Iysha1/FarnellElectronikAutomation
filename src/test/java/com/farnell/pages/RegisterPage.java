package com.farnell.pages;

import com.farnell.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
public RegisterPage(){ PageFactory.initElements(Driver.get(),this);}

    @FindBy(xpath = "//input[@id='logonId']")
    public WebElement userName;

   @FindBy(xpath = "//input[@id='logonPassword']")
    public WebElement passWord;

   @FindBy(css = "#firstName")
    public WebElement fullName;

   @FindBy(xpath = "#email1")
    public WebElement email;

   @FindBy(css = "label[for='rememberMe'] span")
    public WebElement rememberMe;

   @FindBy(css = "#registerValidate")
    public WebElement regiterButton;



}
