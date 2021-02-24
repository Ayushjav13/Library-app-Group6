package com.cybertek.library.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {
    public static void wait(int second){
        second*=1000;
        try{
            Thread.sleep(second);
        }catch(InterruptedException e){
            System.out.println("Something happen in sleep method");
        }
    }

    public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),timeToWaitInSec);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static List<String> getElements(List<WebElement> element){
        List<String> elemtxt = new ArrayList<>();
        for(WebElement el : element){
            elemtxt.add(el.getText());
        }
        return elemtxt;
    }
}
