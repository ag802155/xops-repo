package com.backend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import com.default_project.utils.ElementUtils;
import org.junit.Assert;

public class MyHooksPage {

    private WebDriver driver;
    private ElementUtils elementUtils;
    private static Logger logger = LogManager.getLogger(MyHooksPage.class);

    @FindBy(id = "vehicleLookupButton") // Assuming the locator for vehicle lookup button
    private WebElement vehicleLookupButton;

    @FindBy(id = "dropdownOption") // Assuming the locator for dropdown option
    private WebElement dropdownOption;

    @FindBy(id = "headerName") // Assuming the locator for header name
    private WebElement headerName;

    @FindBy(id = "proppantName1") // Assuming the locator for proppant name
    private WebElement proppantName1;

    public MyHooksPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        elementUtils = new ElementUtils(driver);
    }





}