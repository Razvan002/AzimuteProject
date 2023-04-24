package stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import stepsDefinition.InitializareDriver.InitializareDriver;

import static java.lang.Thread.sleep;

public class Login {
    @Given("Deschidem pagina de web San Marco pentru login")
    public void deschidemPaginaDeWebSanMarco() throws InterruptedException {
        InitializareDriver.setup("https://www.pizzasanmarco.ro/");
        sleep(1000);
    }
    @Then("Click the Login button")
    public void clickTheLoginButton() throws InterruptedException{
        InitializareDriver.getDriver().findElement(By.xpath("//*[@id='login-button']")).click();
        sleep(1000);
    }
    @And("Introducem email: {string}")
    public void introducemEmailUl(String arg1) throws InterruptedException{
        InitializareDriver.getDriver().findElement(By.xpath("//*[@id='login-email']")).sendKeys(arg1);
        sleep(1000);
    }
    @And("Introducem parola: {string}")
    public void introducemParola(String arg2) throws InterruptedException{
        InitializareDriver.getDriver().findElement(By.xpath("//*[@id='login-password']")).sendKeys(arg2);
        sleep(1000);
    }
    @Then("Acceptam Politica de confidentialitate")
    public void acceptamPoliticaDeConfidentialitate() throws InterruptedException{
        InitializareDriver.getDriver().findElement(By.xpath("//*[@id='accept-privacy']")).click();
        sleep(1000);
    }
    @And("Apasam pe butonul Log In")
    public void apasamPeButonulLogIn() throws InterruptedException{
        InitializareDriver.getDriver().findElement(By.xpath("//*[@onclick='login()']")).click();
        sleep(3000);
    }

//     <------------- Butonul de recuperare parola ------------->

    @And("Click pe butonul de recuperare")
    public void clickPeButonulDeRecuperare() throws InterruptedException{
        InitializareDriver.getDriver().findElement(By.xpath("//*[@id='recuperare-buton']")).click();
        sleep(1000);
    }

    @And("Introducem email-ul {string} pentru recuperare")
    public void introducemEmailUlPentruRecuperare(String arg0) throws InterruptedException{
        InitializareDriver.getDriver().findElement(By.xpath("//*[@class='recuperare-parola']")).sendKeys(arg0);
        sleep(1000);
    }

    @Then("Click pe trimite parola")
    public void clickPeTrimiteParola() throws InterruptedException{
        InitializareDriver.getDriver().findElement(By.xpath("//*[@onclick='reset_password()']")).click();
        sleep(3000);
    }
}