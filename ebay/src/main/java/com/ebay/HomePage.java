package com.ebay;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    private static Logger LOGGER = Logger.getLogger(HomePage.class);

    @FindBy(id = "gh-ac")
    private WebElement searchBar;

    @FindBy(id = "gh-btn")
    private WebElement searchBtn;

    @FindBy(linkText = "Sig in")
    private WebElement signInBtn;

    public void typeOnSearchBar() {
        LOGGER.info("sending keys : Java Books");
        searchBar.sendKeys("Java Books");
    }

    public void clickOnSearchButton() {
        searchBtn.click();
    }

    public void clickOnSignInButton() {
        signInBtn.click();
    }

}
