package com.br.renner.verificationpoints;

import com.br.renner.appobjects.ProdutoAppObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CompraVerificationPoint {
    private WebDriver driver;
    private ProdutoAppObject produtoAppObject;

    public CompraVerificationPoint(WebDriver driver){
        this.driver = driver;
        produtoAppObject = new ProdutoAppObject(driver);
    }

    public void verifyBuy(){
        Assert.assertEquals("Your order on My Store is complete.", produtoAppObject.getConfirmationBuy().getText());
    }
}
