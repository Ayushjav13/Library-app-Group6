package com.cybertek.library.pages;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.jvm.hotspot.debugger.Page;

import java.util.List;

public class UsersPage {
    public UsersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//li[@class='nav-item']")
    public List<WebElement> navBarList;

    @FindBy (xpath = "//select[@name='tbl_users_length']")
    public WebElement ShowRecordsDropdown;

    @FindBy (xpath = "//th")
    public List<WebElement> studentTable;

    @FindBy (linkText = "Borrowing Books")
    public WebElement borrowingBooksLink;

    @FindBy (id = "user_groups")
    public WebElement userCategorySelect;

    @FindBy (xpath = "//select[@id='user_groups']//option")
    public List<WebElement> userCategory;

    @FindBy (id = "user_status")
    public WebElement StatusSelect;

    @FindBy (xpath = "//select[@id='user_status']//option")
    public List<WebElement> userStatus;

}
