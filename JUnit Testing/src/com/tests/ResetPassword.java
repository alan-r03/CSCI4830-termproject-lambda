package com.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ResetPassword {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	System.setProperty("webdriver.chrome.driver", "lib\\win\\chromedriver.exe");
	driver = new ChromeDriver();    
	baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testResetPassword() throws Exception {
    driver.get("http://ec2-3-14-143-146.us-east-2.compute.amazonaws.com:8080/ContractOne/Login.jsp");
    Thread.sleep(2000);
    driver.findElement(By.linkText("Reset Password")).click();
    Thread.sleep(2000);
    driver.get("http://ec2-3-14-143-146.us-east-2.compute.amazonaws.com:8080/ContractOne/PasswordReset.jsp");
    Thread.sleep(2000);
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("q");
    Thread.sleep(2000);
    driver.findElement(By.name("oldPW")).clear();
    driver.findElement(By.name("oldPW")).sendKeys("q");
    Thread.sleep(2000);
    driver.findElement(By.name("newPW")).clear();
    driver.findElement(By.name("newPW")).sendKeys("r");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(2000);
    driver.get("http://ec2-3-14-143-146.us-east-2.compute.amazonaws.com:8080/ContractOne/Login.jsp");
    Thread.sleep(2000);
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("q");
    Thread.sleep(2000);
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("r");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(2000);
    driver.get("http://ec2-3-14-143-146.us-east-2.compute.amazonaws.com:8080/ContractOne/Customer-Home.jsp");
    Thread.sleep(2000);
    driver.get("http://ec2-3-14-143-146.us-east-2.compute.amazonaws.com:8080/ContractOne/Login.jsp");
    Thread.sleep(2000);
    driver.findElement(By.linkText("Reset Password")).click();
    Thread.sleep(2000);
    driver.get("http://ec2-3-14-143-146.us-east-2.compute.amazonaws.com:8080/ContractOne/PasswordReset.jsp");
    Thread.sleep(2000);
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("q");
    Thread.sleep(2000);
    driver.findElement(By.name("oldPW")).clear();
    driver.findElement(By.name("oldPW")).sendKeys("r");
    Thread.sleep(2000);
    driver.findElement(By.name("newPW")).clear();
    driver.findElement(By.name("newPW")).sendKeys("q");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(2000);
    driver.get("http://ec2-3-14-143-146.us-east-2.compute.amazonaws.com:8080/ContractOne/Login.jsp");
    Thread.sleep(2000);
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("q");
    Thread.sleep(2000);
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("q");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(2000);
    driver.get("http://ec2-3-14-143-146.us-east-2.compute.amazonaws.com:8080/ContractOne/Customer-Home.jsp");
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
