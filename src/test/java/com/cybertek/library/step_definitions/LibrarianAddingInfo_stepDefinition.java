package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.AddUserPage;
import com.cybertek.library.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalDate;

public class LibrarianAddingInfo_stepDefinition {
    AddUserPage addUserPage = new AddUserPage();
    Select select;
    @When("User click on Users link")
    public void userClickOnUsersLink() {
        addUserPage.UsersPageLink.click();
    }

    @When("click the add user button")
    public void click_the_add_user_button() {

        addUserPage.AddUserButton.click();
    }

    @And("User click on Edit User link")
    public void userClickOnEditUserLink() {
        addUserPage.EditUserLink.click();
    }

    @When("add Full Name {string}")
    public void addFullName(String arg0) {
        addUserPage.FullNameBox.sendKeys(arg0);
    }

    @And("add Password {string}")
    public void addPassword(String arg0) {
        addUserPage.PasswordBox.sendKeys(arg0);
    }

    @And("add Email {string}")
    public void addEmail(String arg0) {
        addUserPage.EmailBox.sendKeys(arg0);
    }

    @And("choose Librarian in User Group {string}")
    public void chooseLibrarianInUserGroup(String arg0) {
        select = new Select(addUserPage.UserGroupBox);
        select.selectByValue(arg0);
    }

    @And("choose {string} from status")
    public void chooseFromStatus(String arg0) {
        select = new Select(addUserPage.StatusBox);
        select.selectByValue(arg0);
    }

    @And("add Start Date {string}")
    public void addStartDate(String arg0) {
        addUserPage.StartDateBox.clear();
        addUserPage.StartDateBox.sendKeys(arg0);
    }

    @And("add End Date  {string}")
    public void addEndDate(String arg0) {
        addUserPage.EndDateBox.clear();
        addUserPage.EndDateBox.sendKeys(arg0);
    }

    @And("add Address {string}")
    public void addAddress(String arg0) {
        addUserPage.AddressBox.sendKeys(arg0);

    }

    @Then("click on close button")
    public void clickOnCloseButton() {
        addUserPage.CloseButton.submit();
    }


    @Then("click on save changes button")
    public void clickOnSaveChangesButton() {
        BrowserUtils.wait(4);
        addUserPage.SaveChangesButton.submit();
    }


}
