package com.cybertek.library.utilities;

public class BrowserUtils {
    public static void wait(int second){
        second*=1000;
        try{
            Thread.sleep(second);
        }catch(InterruptedException e){
            System.out.println("Something happen in sleep method");
        }
    }
}
