package com.ebay;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(id = "gh-ac")
    private WebElement searchBar;

    @FindBy(id = "gh-btn")
    private WebElement searchBtn;

    @FindBy(linkText = "Sig in")
    private WebElement signInBtn;

    public void typeOnSearchBar() {
        searchBar.sendKeys("Java Books");
    }

    public void clickOnSearchButton() {
        searchBtn.click();
    }

    public void clickOnSignInButton() {
        signInBtn.click();
    }

}
