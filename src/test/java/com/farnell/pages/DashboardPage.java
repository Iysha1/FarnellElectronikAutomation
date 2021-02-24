package com.farnell.pages;

import com.farnell.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    public DashboardPage(){ PageFactory.initElements(Driver.get(),this);}

    @FindBy(xpath = "//a[contains(text(),'Register')]")
    public WebElement register;


    @FindBy(css = "#loggedInPar")
    public WebElement loggedIn;

}
