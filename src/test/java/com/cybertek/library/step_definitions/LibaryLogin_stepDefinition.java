package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.LibrarianPage;
import com.cybertek.library.utilities.BrowserUtils;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibaryLogin_stepDefinition {
    LibrarianPage librarianPage = new LibrarianPage();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        BrowserUtils.wait(3);
        Driver.getDriver().get("http://library2.cybertekschool.com/login.html");
      //  BrowserUtils.wait(3);
    }

//    @When("the user login as a {string}")
//    public void the_user_login_as_a(String string) {
//
//    }

    @When("I login using {string} and {string}")
    public void i_login_using_and(String string0, String string1) {

        librarianPage.usernameBox.sendKeys(string0);
        librarianPage.passwordBox.sendKeys(string1);
        librarianPage.signIn.click();
    }
    @Then("the user on  {string}")
    public void the_user_on(String page) {
        if(page.equals("books")) {
            String expectedBook = page;
            String actualBook = librarianPage.booksLinkPage.getText();
            Assert.assertEquals(expectedBook,actualBook);
        }else if(page.equals("Dashboard")){
            String expectedDashboard = page;
            String actualDashboard = librarianPage.DashboardLinkPage.getText();
            Assert.assertEquals(expectedDashboard,actualDashboard);
        }

        Driver.closeDriver();
    }

}
