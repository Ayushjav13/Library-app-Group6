package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.AddUserPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalDate;

public class LibrarianAddingInfo {
    AddUserPage addUserPage = new AddUserPage();
    Select select;
    @And("User click on Users link")
    public void userClickOnUsersLink() {
        addUserPage.UsersPageLink.click();
    }

    @Given("click the add user button")
    public void click_the_add_user_button() {

        addUserPage.AddUserButton.click();
    }

    @Then("add Full Name")
    public void add_full_name() {
        addUserPage.FullNameBox.sendKeys("Thierry Henry");
    }
    @Then("add Password")
    public void add_password() {
        addUserPage.PasswordBox.sendKeys("LILLY16");
    }
    @Then("add Email")
    public void add_email() {
        addUserPage.EmailBox.sendKeys("thierry14@gmail.com");
    }
    @Then("choose Librarian in User Group")
    public void choose_librarian_in_user_group() {
        select = new Select(addUserPage.UserGroupBox);
        select.selectByValue("2");
    }
    @Then("choose ACTIVE from status")
    public void choose_active_from_status() {
        select = new Select(addUserPage.StatusBox);
        select.selectByValue("ACTIVE");
    }
    @Then("add Start Date")
    public void add_start_date() {

       // addUserPage.StartDateBox.sendKeys("LocalDate.now()");
    }
    @Then("add End Date")
    public void add_end_date() {

    }
    @Then("add Address")
    public void add_address() {

    }
    @Then("click save changes button")
    public void click_save_changes_button() {

    }


}
