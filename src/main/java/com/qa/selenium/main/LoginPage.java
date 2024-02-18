package com.qa.selenium.main;

public class LoginPage extends BaseClass{

    public void init(){
        setUpPreconditions(TestData.URL);
    }



    public void validateTitleName(){
        String actualTitleName=driver.getTitle();
        java.lang.System.out.println("The actual title of the page is " +actualTitleName);
        if(actualTitleName.equals(TestData.EXPECTED_TITLE_NAME)){
            java.lang.System.out.println("The title of the landing page is matched");
        }
        else{
            java.lang.System.out.println("The title of the landing page is not matched");
        }

    }
    public void login() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(org.openqa.selenium.By.xpath(XpathClass.LoginBtn)).click();
        driver.findElement(org.openqa.selenium.By.xpath(XpathClass.EMAIL_INPUT_XPATH)).sendKeys(TestData.EMAIL_ID);

        driver.findElement(org.openqa.selenium.By.xpath(XpathClass.PASSWORD_INPUT_XPATH)).sendKeys(TestData.PASSWORD);
        driver.findElement(org.openqa.selenium.By.xpath(XpathClass.loginButtonXpath)).click();
    }


}
