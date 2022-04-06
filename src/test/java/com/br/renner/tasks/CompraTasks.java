package com.br.renner.tasks;

import com.br.renner.appobjects.HomeAppObjects;
import com.br.renner.appobjects.ProdutoAppObject;
import com.br.renner.utils.Utils;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class CompraTasks {
    private WebDriver driver;
    private HomeAppObjects homeAppObjects;
    private ProdutoAppObject produtoAppObject;
    private Utils utils;

    public CompraTasks(WebDriver driver){
        this.driver = driver;
        homeAppObjects = new HomeAppObjects(driver);
        produtoAppObject = new ProdutoAppObject(driver);
        utils = new Utils();
    }

    public void clickFadedTShirt(){
        homeAppObjects.getFadedShortSleeveTshirt().click();
    }

    public void clickCorAzul(){
        produtoAppObject.getCorAzul().click();
    }

    public void clickAddToCart(){
        produtoAppObject.getCarrinhoButton().click();
    }

    public void clickProceedCheckout(){
        produtoAppObject.getCheckoutButton().click();
    }

    public void setEmail(){
        produtoAppObject.getEmailTextBox().sendKeys("rhuandornelles@gmail.com");
    }

    public void setPass(){
        produtoAppObject.getPasswordTextBox().sendKeys("abcd1234");
    }

    public void clickSignIn(){
        produtoAppObject.getSignInButton().click();
    }

    public void clickAddressCheckout(){
        produtoAppObject.getAddressCheckout().click();
    }

    public void checkTerms(){
        produtoAppObject.getTermsCheckbox().click();
    }

    public void clickCarrierCheckout(){
        produtoAppObject.getCarrierCheckout().click();
    }

    public void clickBankWire(){
        produtoAppObject.getBankWireButton().click();
    }

    public void clickConfirmOrder(){
        produtoAppObject.getConfirmOrderButton().click();
    }

    public void clickPrintedChiffonDress(){
        homeAppObjects.getPrintedChiffonDress().click();
    }

    public void clickGreen(){
        produtoAppObject.getCorVerde().click();
    }

    public void selectMSize(){
        produtoAppObject.getSizeSelect().selectByValue("2");
    }

    public void clickBlouse(){
        homeAppObjects.getBlouse().click();
    }

    public void clickPlusQuantity(){
        produtoAppObject.getQuantityPlus().click();
    }

    public void clickPrintedDress(){
        homeAppObjects.getPrintedDress().click();
    }

    public void setEmailCadastro(){
        produtoAppObject.getCreateEmail().sendKeys(utils.generateRandomEmail());
    }

    public void clickCreateAccount(){
        produtoAppObject.getCreateAccountButton().click();
    }

    public void clickMrRadioButton(){
        produtoAppObject.getMrTitleRadioButton().click();
    }

    public void setFirstName(){
        produtoAppObject.getFirstName().sendKeys("Rhuan");
    }

    public void setLastName(){
        produtoAppObject.getLastName().sendKeys("Dornelles");
    }

    public void setPassword(){
        produtoAppObject.getPassword().sendKeys("abcd1234");
    }

    public void setDateOfBirth(){
        produtoAppObject.getDayOfBirth().selectByValue("13");
        produtoAppObject.getMonthOfBirth().selectByValue("11");
        produtoAppObject.getYearOfBirth().selectByValue("1995");
    }

    public void setAddressFirstName(){
        produtoAppObject.getFirstNameAddress().clear();
        produtoAppObject.getFirstNameAddress().sendKeys("Rhuan");
    }

    public void setAddressLastName(){
        produtoAppObject.getLastNameAddress().clear();
        produtoAppObject.getLastNameAddress().sendKeys("Dornelles");
    }

    public void setAddress(){
        produtoAppObject.getAddress().sendKeys("Main Street, 0202");
    }

    public void setCity(){
        produtoAppObject.getCity().sendKeys("Louisiana");
    }

    public void setState(){
        produtoAppObject.getState().selectByValue("40");
    }

    public void setZipCode(){
        produtoAppObject.getZipCode().sendKeys("99135");
    }

    public void setMobilePhone(){
        produtoAppObject.getMobilePhone().sendKeys(utils.generateRandomCelphone());
    }

    public void clickRegister(){
        produtoAppObject.getRegisterButton().click();
    }

    public void buyFadedSleeveTShirt(){
        clickFadedTShirt();
        clickCorAzul();
        clickAddToCart();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        clickProceedCheckout();
        clickProceedCheckout();
        setEmail();
        setPass();
        clickSignIn();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        clickAddressCheckout();
        checkTerms();
        clickCarrierCheckout();
        clickBankWire();
        clickConfirmOrder();
    }

    public void buyFadedSleeveTShirtCadastro(){
        clickFadedTShirt();
        clickCorAzul();
        clickAddToCart();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        clickProceedCheckout();
        clickProceedCheckout();
        setEmailCadastro();
        clickCreateAccount();
        clickMrRadioButton();
        setFirstName();
        setLastName();
        setPassword();
        setDateOfBirth();
        setAddressFirstName();
        setAddressLastName();
        setAddress();
        setCity();
        setState();
        setZipCode();
        setMobilePhone();
        clickRegister();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        clickAddressCheckout();
        checkTerms();
        clickCarrierCheckout();
        clickBankWire();
        clickConfirmOrder();
    }

    public void buyPrintedChiffonDress(){
        clickPrintedChiffonDress();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        clickGreen();
        selectMSize();
        clickAddToCart();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        clickProceedCheckout();
        clickProceedCheckout();
        setEmail();
        setPass();
        clickSignIn();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        clickAddressCheckout();
        checkTerms();
        clickCarrierCheckout();
        clickBankWire();
        clickConfirmOrder();
    }

    public void buyBlouse(){
        clickBlouse();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        clickPlusQuantity();
        clickAddToCart();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        clickProceedCheckout();
        clickProceedCheckout();
        setEmail();
        setPass();
        clickSignIn();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        clickAddressCheckout();
        checkTerms();
        clickCarrierCheckout();
        clickBankWire();
        clickConfirmOrder();
    }

    public void buyPrintedDress(){
        clickPrintedDress();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        clickAddToCart();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        clickProceedCheckout();
        clickProceedCheckout();
        setEmail();
        setPass();
        clickSignIn();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        clickAddressCheckout();
        checkTerms();
        clickCarrierCheckout();
        clickBankWire();
        clickConfirmOrder();
    }
}
