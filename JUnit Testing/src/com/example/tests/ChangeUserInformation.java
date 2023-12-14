package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ChangeUserInformation {
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
  public void testChangeUserInformation() throws Exception {
    driver.get("http://ec2-3-14-143-146.us-east-2.compute.amazonaws.com:8080/ContractOne/Login.jsp");
    Thread.sleep(1000);
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("q");
    Thread.sleep(1000);
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("q");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(1000);
    driver.findElement(By.linkText("Profile")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("newUser")).clear();
    driver.findElement(By.id("newUser")).sendKeys("qq");
    Thread.sleep(1000);
    driver.findElement(By.id("newAddress")).clear();
    driver.findElement(By.id("newAddress")).sendKeys("qq");
    Thread.sleep(1000);
    driver.findElement(By.id("newPhone")).clear();
    driver.findElement(By.id("newPhone")).sendKeys("qq");
    Thread.sleep(1000);
    driver.findElement(By.id("newEmail")).clear();
    driver.findElement(By.id("newEmail")).sendKeys("qq");
    Thread.sleep(1000);
    driver.findElement(By.id("newDescription")).clear();
    driver.findElement(By.id("newDescription")).sendKeys("qq");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(1000);
    driver.findElement(By.linkText("Profile")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("newUser")).clear();
    driver.findElement(By.id("newUser")).sendKeys("q");
    Thread.sleep(1000);
    driver.findElement(By.id("newAddress")).clear();
    driver.findElement(By.id("newAddress")).sendKeys("q");
    Thread.sleep(1000);
    driver.findElement(By.id("newPhone")).clear();
    driver.findElement(By.id("newPhone")).sendKeys("q");
    Thread.sleep(1000);
    driver.findElement(By.id("newEmail")).clear();
    driver.findElement(By.id("newEmail")).sendKeys("q");
    Thread.sleep(1000);
    driver.findElement(By.id("newDescription")).clear();
    driver.findElement(By.id("newDescription")).sendKeys("q");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(1000);
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