package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class P03_homePage {

    public WebElement Changecurrency(){return Hooks.driver.findElement(By.id("customerCurrency"));}
    //public List<WebElement> EurocurrencyProductss(){return Hooks.driver.findElement(By.className("dd"));}
    @FindBy(className=("product-item"))
    public List<WebElement> EurocurrencyProducts;
}
