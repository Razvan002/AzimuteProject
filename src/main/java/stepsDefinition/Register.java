package stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class Register {

    @Given("Deschidem pagina de web San Marco pentru register")
    public void deschidem_pagina_de_web_san_marco() throws InterruptedException{
        InitializareDriver.setup("https://www.pizzasanmarco.ro/");
        sleep(1000);
    }
    @Then("Click the Register button")
    public void click_the_register_button() throws InterruptedException{
        InitializareDriver.getDriver().findElement(By.xpath("//*[@id='register-button']")).click();
        sleep(1000);
    }

    @And("Introducem {string}: {string}")
    public void introducemNumele(String arg1,String arg2) throws InterruptedException{
        InitializareDriver.getDriver().findElement(By.xpath("//*[@id='register-"+arg1+"']")).sendKeys(arg2);
        sleep(1000);
    }
    @And("Introducem numarul de {string}: {string}")
    public void introducemNumarulDeTelefon(String telefon,String telefon1) throws InterruptedException{
        InitializareDriver.getDriver().findElement(By.xpath("//*[@id='register-"+telefon+"']")).sendKeys(telefon1);
        sleep(1000);
    }
    @Then("Acceptam Politica de confidentialitate pentru cont nou")
    public void acceptamPoliticaDeConfidentialitate() throws InterruptedException{
        InitializareDriver.getDriver().findElement(By.xpath("//*[@id='accept-privacy-cont-nou']")).click();
        sleep(1000);
    }

    @And("Apasam pe butonul Inregistrare")
    public void apasamPeButonulInregistrare() throws InterruptedException{
        InitializareDriver.getDriver().findElement(By.xpath("//*[@onclick='register()']")).click();
        sleep(3000);
    }

    @And("Click pe butonul ai deja cont")
    public void clickPeButonulAiDejaCont() throws InterruptedException{
        InitializareDriver.getDriver().findElement(By.xpath("//*[@id=\"cont-existent\"]")).click();
        sleep(3000);
    }
}
