package com.herokuapp.theinternet.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.Logger;

public class WelcomePageObject extends BasePageObject {

    private String pageUrl = "http://the-internet.herokuapp.com/";
    private By formAuthenticationLinkLocator = By.linkText("Form Authentication");
    private By checkboxesLinkLocator = By.linkText("Checkboxes");
    private By dropdownLinkLocator = By.linkText("Dropdown");

    public WelcomePageObject(WebDriver driver, Logger log) {
        super(driver, log);
    }

    //Open Welcome page with it's Url
    public void openPage() {
        log.info("Opening page: " + pageUrl);
        openUrl(pageUrl);
        log.info("Page opened!");
    }

    //Open LoginPage by clicking on form authentication link
    public LoginPage clickFormAuthenticationLink() {
        log.info("Clicking Form Authentication link on Welcome Page");
        click(formAuthenticationLinkLocator);
        return new LoginPage(driver, log);
    }

    //Open Checkbox page on checkbox link
    public CheckboxesPage clickCheckboxesLink() {
        log.info("Clicking checkboxes link on Welcome Page");
        click(checkboxesLinkLocator);
        return new CheckboxesPage(driver,log);
    }
    public DropdownPage clickDropdownLink() {
        log.info("Clicking Dropdown link on Welcome Page");
        click(dropdownLinkLocator);
        return new DropdownPage(driver, log);
    }
}
