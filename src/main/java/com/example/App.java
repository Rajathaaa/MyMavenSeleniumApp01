/*package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class App 
{
    public static void main( String[] args )
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }
}
*/


package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App 
{
    public static void main(String[] args) 
    {
        ChromeOptions options = new ChromeOptions();

        // 🔥 MUST for Jenkins / Linux
        options.addArguments("--headless=new");  // newer headless mode
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.saucedemo.com/");

        // ⚠️ maximize not needed in headless (can crash sometimes)
        // driver.manage().window().maximize();

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        System.out.println("Page Title: " + driver.getTitle());

        driver.quit(); // 🔥 VERY IMPORTANT (avoid hanging builds)
    }
}


/*package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;


public class App 
{
    public static void main( String[] args )
    {
        // Set the path to geckodriver
        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
        
        // Step 2: Create a temporary Firefox profile (using a clean profile each time)
        FirefoxOptions options = new FirefoxOptions();
        options.setProfile(new FirefoxProfile());  // This creates a new, temporary profile
        
        // Initialize FirefoxDriver
        WebDriver driver = new FirefoxDriver(options);

        //WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }
}
*/



