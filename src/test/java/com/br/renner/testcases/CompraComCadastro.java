package com.br.renner.testcases;

import com.br.renner.tasks.CompraTasks;
import com.br.renner.verificationpoints.CompraVerificationPoint;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompraComCadastro {
    public WebDriver driver;
    private CompraTasks compraTasks;
    private CompraVerificationPoint compraVerificationPoint;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        compraTasks = new CompraTasks(driver);
        compraVerificationPoint = new CompraVerificationPoint(driver);
    }

    @Test
    public void compraTestCase(){
        compraTasks.buyFadedSleeveTShirtCadastro();
        compraVerificationPoint.verifyBuy();
    }

    @After
    public void shutDown(){
        driver.quit();
    }
}
