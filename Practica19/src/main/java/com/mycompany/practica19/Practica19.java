
package com.mycompany.practica19;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Leonidas Adrian Mendoza Flores
 */
public class Practica19 {

    public static void main(String[] args) throws InterruptedException 
    {
        testLogin();
        testTitle();
        testSuma();
        testResta();
        testMultiplicar();
        testDividir();
    }
     //Pagina Guru99
    public static void testTitle()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Leoni\\Desktop\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        
        String url = "https://demo.guru99.com/test/newtours/";
        
        String expectedResult = "Welcome: Mercury Tours";
        String result = "";
        
        driver.get(url);
        
        result = driver.getTitle();
        
        if(result.equals(expectedResult))
        {
            System.out.println("Aprovado");
        }
        else System.out.println("Fallido");
        
        driver.close();
    }
    public static void testLogin()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Leoni\\Desktop\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        
        String url = "https://demo.guru99.com/test/newtours/";
        
        String expectedResult = "Login Successfully";
        String result = "";
        
        driver.get(url);
        
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("", "");
        driver.findElement(By.name("userName")).sendKeys("ejemplo");
        driver.findElement(By.name("password")).sendKeys("ejemplo");
        driver.findElement(By.name("submit")).click();
        
        result = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3")).getText();
        
        if(result.equals(expectedResult))
        {
            System.out.println("Aprobado");
        }
        else System.out.println("Fallido");
        
        driver.close();
    }
    
    // Pagina TestSheepNZ
    public static void testSuma() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Leoni\\Desktop\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        
        String url = "https://testsheepnz.github.io/BasicCalculator.html";
        
        String expectedResult = "49";
        String result = "";
        
        driver.get(url);
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1200)", "");
        driver.findElement(By.name("number1")).sendKeys("24");
        driver.findElement(By.name("number2")).sendKeys("25");
        
        WebElement element = (WebElement) driver.findElement(By.name("selectOperation"));
        Select select = new Select (element) ;
        
        select.selectByValue("0");
        driver.findElement(By.id("calculateButton")).click();
        Thread.sleep(3000);
        result = driver.findElement(By.name("numberAnswer")).getAttribute("value");
        if(result.contains(expectedResult))
        {
            System.out.println("Aprobado");
        }
        else System.out.println("Fallido");
        
        driver.close();
    }
    
    public static void testResta() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Leoni\\Desktop\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        
        String url = "https://testsheepnz.github.io/BasicCalculator.html";
        
        String expectedResult = "35";
        String result = "";
        
        driver.get(url);
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1200)", "");
        driver.findElement(By.name("number1")).sendKeys("100");
        driver.findElement(By.name("number2")).sendKeys("65");
        
        WebElement element = (WebElement) driver.findElement(By.name("selectOperation"));
        Select select = new Select (element) ;
        
        select.selectByValue("1");
        driver.findElement(By.id("calculateButton")).click();
        Thread.sleep(3000);
        result = driver.findElement(By.name("numberAnswer")).getAttribute("value");
        if(result.contains(expectedResult))
        {
            System.out.println("Aprobado");
        }
        else System.out.println("Fallido");
        
        driver.close();
    }
    public static void testDividir() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Leoni\\Desktop\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        
        String url = "https://testsheepnz.github.io/BasicCalculator.html";
        
        String expectedResult = "64";
        String result = "";
        
        driver.get(url);
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1200)", "");
        driver.findElement(By.name("number1")).sendKeys("1024");
        driver.findElement(By.name("number2")).sendKeys("16");
        
        WebElement element = (WebElement) driver.findElement(By.name("selectOperation"));
        Select select = new Select (element) ;
        
        select.selectByValue("3");
        driver.findElement(By.id("calculateButton")).click();
        Thread.sleep(3000);
        result = driver.findElement(By.name("numberAnswer")).getAttribute("value");
        if(result.contains(expectedResult))
        {
            System.out.println("Aprobado");
        }
        else System.out.println("Fallido");
        
        driver.close();
    }
    
    public static void testMultiplicar() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Leoni\\Desktop\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        
        String url = "https://testsheepnz.github.io/BasicCalculator.html";
        
        String expectedResult = "256";
        String result = "";
        
        driver.get(url);
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1200)", "");
        driver.findElement(By.name("number1")).sendKeys("16");
        driver.findElement(By.name("number2")).sendKeys("16");
        
        WebElement element = (WebElement) driver.findElement(By.name("selectOperation"));
        Select select = new Select (element) ;
        
        select.selectByValue("2");
        driver.findElement(By.id("calculateButton")).click();
        Thread.sleep(3000);
        result = driver.findElement(By.name("numberAnswer")).getAttribute("value");
        if(result.contains(expectedResult))
        {
            System.out.println("Aprobado");
        }
        else System.out.println("Fallido");
        
        driver.close();
    }
    
}

