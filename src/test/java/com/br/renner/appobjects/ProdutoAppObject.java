package com.br.renner.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProdutoAppObject {
    private WebDriver driver;

    public ProdutoAppObject(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getCorAzul(){
        return driver.findElement(By.name("Blue"));
    }

    public WebElement getCorVerde(){
        return driver.findElement(By.name("Green"));
    }

    public Select getSizeSelect(){
        return new Select(driver.findElement(By.id("group_1")));
    }

    public WebElement getCreateEmail(){
        return driver.findElement(By.id("email_create"));
    }

    public WebElement getCreateAccountButton(){
        return driver.findElement(By.id("SubmitCreate"));
    }

    public WebElement getMrTitleRadioButton(){
        return driver.findElement(By.id("id_gender1"));
    }

    public WebElement getFirstName(){
        return driver.findElement(By.id("customer_firstname"));
    }

    public WebElement getLastName(){
        return driver.findElement(By.id("customer_lastname"));
    }

    public WebElement getPassword(){
        return driver.findElement(By.id("passwd"));
    }

    public Select getDayOfBirth(){
        return new Select(driver.findElement(By.id("days")));
    }

    public Select getMonthOfBirth(){
        return new Select(driver.findElement(By.id("months")));
    }

    public Select getYearOfBirth(){
        return new Select(driver.findElement(By.id("years")));
    }

    public WebElement getFirstNameAddress(){
        return driver.findElement(By.id("firstname"));
    }

    public WebElement getLastNameAddress(){
        return driver.findElement(By.id("lastname"));
    }

    public WebElement getAddress(){
        return driver.findElement(By.id("address1"));
    }

    public WebElement getCity(){
        return driver.findElement(By.id("city"));
    }

    public Select getState(){
        return new Select(driver.findElement(By.id("id_state")));
    }

    public WebElement getZipCode(){
        return driver.findElement(By.id("postcode"));
    }

    public WebElement getMobilePhone(){
        return driver.findElement(By.id("phone_mobile"));
    }

    public WebElement getRegisterButton(){
        return driver.findElement(By.id("submitAccount"));
    }



    public WebElement getQuantityPlus(){
        return driver.findElement(By.className("icon-plus"));
    }

    public WebElement getCarrinhoButton(){
        return driver.findElement(By.name("Submit"));
    }

    public WebElement getCheckoutButton(){
        return driver.findElement(By.linkText("Proceed to checkout"));
    }

    public WebElement getEmailTextBox(){
        return driver.findElement(By.id("email"));
    }

    public WebElement getPasswordTextBox(){
        return driver.findElement(By.id("passwd"));
    }

    public WebElement getSignInButton(){
        return driver.findElement(By.id("SubmitLogin"));
    }

    public WebElement getAddressCheckout(){
        return driver.findElement(By.name("processAddress"));
    }

    public WebElement getCarrierCheckout(){
        return driver.findElement(By.name("processCarrier"));
    }

    public WebElement getTermsCheckbox(){
        return driver.findElement((By.name("cgv")));
    }

    public WebElement getBankWireButton(){
        return driver.findElement(By.className("bankwire"));
    }

    public WebElement getConfirmOrderButton(){
        //O único jeito de conseguir capturar esse botão foi com xpath.
        return driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button"));
    }

    public WebElement getConfirmationBuy(){
        return driver.findElement(By.className("cheque-indent"));
    }
}
