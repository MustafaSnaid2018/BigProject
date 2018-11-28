package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MOOD950445SnaidTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testMOOD950445Snaid() throws Exception {
    driver.get("https://www.google.com/");
    driver.findElement(By.name("q")).clear();
    driver.findElement(By.name("q")).sendKeys("forttest");
    // ERROR: Caught exception [unknown command [sendKeys]]
    driver.findElement(By.name("q")).clear();
    driver.findElement(By.name("q")).sendKeys("hello");
    // ERROR: Caught exception [unknown command [sendKeys]]
    driver.findElement(By.name("q")).clear();
    driver.findElement(By.name("q")).sendKeys("www.");
    // ERROR: Caught exception [unknown command [sendKeys]]
    driver.findElement(By.name("q")).clear();
    driver.findElement(By.name("q")).sendKeys("www.youtube.com");
    // ERROR: Caught exception [unknown command [sendKeys]]
    // ERROR: Caught exception [unknown command [sendKeys]]
    // ERROR: Caught exception [unknown command [sendKeys]]
    // ERROR: Caught exception [unknown command [sendKeys]]
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sign in'])[1]/following::img[1]")).click();
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
