package com.br.renner.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeAppObjects {
    private WebDriver driver;

    public HomeAppObjects(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getFadedShortSleeveTshirt(){
        return driver.findElement(By.linkText("Faded Short Sleeve T-shirts"));
    }

    public WebElement getPrintedChiffonDress(){
        return driver.findElement(By.partialLinkText("Printed Chiffon Dress"));
    }

    public WebElement getBlouse(){
        return driver.findElement(By.partialLinkText("Blouse"));
    }

    public WebElement getPrintedDress(){
        return driver.findElement(By.partialLinkText("Printed Dress"));
    }
}
