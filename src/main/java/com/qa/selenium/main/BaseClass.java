package com.qa.selenium.main;

public class BaseClass {
    org.openqa.selenium.WebDriver driver;
    public BaseClass(){
        driver=new org.openqa.selenium.chrome.ChromeDriver();

    }
    public void setUpPreconditions(String url){
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));


    }


}
