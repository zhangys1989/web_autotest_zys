package pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.*;
import org.testng.annotations.Test;


import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
//import sun.plugin.javascript.navig.Navigator;
import org.junit.Assert.*;
import mysql.mysql;

import static java.lang.Thread.sleep;

/**
 * Created by zhangys。
 */

public class test3 {
    public  WebDriver driver;

    @BeforeTest
    public  void setUp() throws Exception{

    }

    @org.testng.annotations.Test
    public void test12() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        Navigation navigator=driver.navigate();
        navigator.to("http://www.baidu.com");
        navigator.refresh();
        driver.findElement(By.id("kw")).sendKeys("自动化测试");
        driver.findElement(By.id("su"));
        sleep(2000);

        driver.findElement(By.id("kw")).clear();//清除输入
        sleep(2000);
        String url=driver.getCurrentUrl();
        System.out.println(url);
        driver.quit();
    }
  /* public static  void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        Navigation navigator=driver.navigate();
        navigator.to("http://www.baidu.com");
        navigator.refresh();
      //  WebElement baidutextbox= driver.findElement(By.id("kw"));
       // baidutextbox.sendKeys("ceshi");
        driver.findElement(By.id("kw")).sendKeys("自动化测试");
        driver.findElement(By.id("su"));
        Thread.sleep(2000);

        driver.findElement(By.id("kw")).clear();//清除输入
        Thread.sleep(2000);
        String url=driver.getCurrentUrl();
        System.out.println(url);
        driver.quit();





    }*/

    @AfterTest
    public void  tearDown() throws Exception {
        //  driver.quit();
        //driver.close();
    }




}
