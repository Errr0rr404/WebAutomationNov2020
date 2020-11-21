package com.ebay;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(id = "gh-a78c")
    private WebElement searchBar;

    public void typeOnSearchBar() {
        searchBar.sendKeys("Java Books");
    }

}
