package com.ebaytest;

import com.base.TestBase;
import com.ebay.data.DataProviders;
import com.ebay.pages.HomePage;
import com.ebay.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {

    @Test(enabled = false)
    public void validateUserBeingAbleToTypeOnSearchBar() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeOnSearchBar("Java Books");
    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "searchData", enabled = true)
    public void validateUserBeingAbleToSearchForAnItem(String data) {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeOnSearchBar(data);
        homePage.clickOnSearchButton();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnSignInButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSignInButton();
    }


    @Test(dataProviderClass = DataProviders.class, dataProvider = "credentials", enabled = false)
    public void validateUserBeingAbleToLogin(String userName, String password) {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        homePage.clickOnSignInButton();

        loginPage.typeOnEmailField(userName);
        loginPage.clickOnContinueButton();
        loginPage.typeOnPasswordField(password);
    }


}
