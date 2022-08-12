package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.checkerframework.framework.qual.DefaultQualifier;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D03_currenciesStepDef {

    P03_homePage homePage = new P03_homePage();
    @Given("Select Euro currency from the dropdown list on the top left of home page")
    public void Select_Euro_currency()
    {
        Select select =new Select(homePage.Changecurrency());
        select.selectByVisibleText("Euro");


    }
    SoftAssert softAssert = new SoftAssert();

//    @And("Use verify Euro is shown on the Four products displayed in Home page")
//    public void useVerifyEuroIsShownOnTheFourProductsDisplayedInHomePage()
//    {
//        String actualresult="";
//        for(int i=0; i<4; i++)
//        {
//             actualresult= homePage.EurocurrencyProducts.get(i).getText();
//        }
//        String expectedresult="€";
//
//        Assert.assertTrue(actualresult.contains(expectedresult));
//    }
}
