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
//import org.testng.annotations.AfterMethod;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import sun.plugin.javascript.navig.Navigator;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;

/**
 * Created by zhangys。
 */

public class test1 {
    public  WebDriver driver;
    @Before
    public  void setUp(){
    }

    @Test
    public static  void main(String[] args){
        WebDriver driver=new ChromeDriver();
        Navigation navigator=driver.navigate();
        navigator.to("http://www.baidu.com");
        navigator.refresh();
      //  WebElement baidutextbox= driver.findElement(By.id("kw"));
       // baidutextbox.sendKeys("ceshi");
        driver.findElement(By.id("kw")).sendKeys("自动化测试");
        driver.findElement(By.id("su"));



    }
    @After
    public void  tearDown() throws Exception {

        driver.quit();
        driver.close();

    }




}
