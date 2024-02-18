package com.qa.selenium.test;

import com.qa.selenium.main.BaseClass;
import com.qa.selenium.main.LoginPage;
import com.qa.selenium.main.TestData;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest {


    TestData tn;

    /* @BeforeTest*/
  /*  public void pre(){
        ln=new LoginPage();
        setUpPreconditions(TestData.URL);
    }*/
    @Test
    public void loginProcess() throws InterruptedException {
        System.out.println("Execution starts");
        LoginPage  ln = new LoginPage();
        ln.init();
        ln.validateTitleName();
        ln.login();
    }


}
