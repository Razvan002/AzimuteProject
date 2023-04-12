package stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.*;

import static java.lang.Thread.sleep;

public class order {


    @Given("Deschidem pagina de web San Marco")
    public void deschidemPaginaDeWebSanMarco() throws InterruptedException {
        InitializareDriver.setup("https://www.pizzasanmarco.ro/");
        sleep(1000);
    }

    @Then("Click pe butonul {string}")
    public void clickPeButonulDeserturi(String arg) throws InterruptedException{
        InitializareDriver.getDriver().findElement(By.xpath("//*[@href='"+arg+"']")).click();
        sleep(1000);
    }

    @And("Click pe butonul de adaugat in cos")
    public void clickPeButonulDeAdaugatInCos() throws InterruptedException{
        InitializareDriver.getDriver().findElement(By.xpath("//div[text()='17.50 lei']")).click();
        sleep(1000);
    }

    @And("Click pe cos de produse")
    public void clickPeCosDeProduse() throws InterruptedException{
        InitializareDriver.getDriver().findElement(By.xpath("//*[@id='total_pret']")).click();
        sleep(1000);
    }

    @And("Completam detaliile necesare")
    public void completamDetaliileNecesare() throws InterruptedException{
        JavascriptExecutor js = (JavascriptExecutor) InitializareDriver.getDriver();
        js.executeScript("window.scrollBy(0,1500)", "");
        sleep(1000);
        InitializareDriver.getDriver().findElement(By.xpath("//*[@name='date-livrare']")).click();
        sleep(1000);
        InitializareDriver.getDriver().findElement(By.xpath("//*[@class='faracont-livrare-nume']")).sendKeys("Gradea");
        sleep(1000);
        InitializareDriver.getDriver().findElement(By.xpath("//*[@class='faracont-livrare-prenume']")).sendKeys("Andrei");
        sleep(1000);
        InitializareDriver.getDriver().findElement(By.xpath("//*[@class='faracont-livrare-email']")).sendKeys("gradea.razvan03@gmail.com");
        sleep(1000);
        InitializareDriver.getDriver().findElement(By.xpath("//*[@class='faracont-livrare-telefon']")).sendKeys("0755803088");
        sleep(1000);
        InitializareDriver.getDriver().findElement(By.xpath("//*[@class='select2-selection__placeholder']")).click();
        sleep(1000);
        InitializareDriver.getDriver().findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys("Prelungirea Mesterul Manole",Keys.ENTER);
        sleep(1000);
        InitializareDriver.getDriver().findElement(By.xpath("//*[@class='faracont-livrare-nrstrada']")).sendKeys("15");
        sleep(1000);
        InitializareDriver.getDriver().findElement(By.xpath("//*[@placeholder='Detalii (Bloc, Scara, Etaj, Apartament)']")).sendKeys("Casa galbena");
        sleep(1000);
        InitializareDriver.getDriver().findElement(By.xpath("//*[@class='faracont-livrare-repere']")).sendKeys("Masina shmekera in fata casei :))");
        sleep(1000);
        InitializareDriver.getDriver().findElement(By.xpath("//input[@value='2']")).click();
        sleep(3000);
    }
    @And("Click pe date livrare")
    public void clickPeDateLivrare() throws InterruptedException{
        JavascriptExecutor js = (JavascriptExecutor) InitializareDriver.getDriver();
        js.executeScript("window.scrollBy(0,1500)", "");
        sleep(1000);
        InitializareDriver.getDriver().findElement(By.xpath("//*[@name='date-livrare']")).click();
        sleep(1000);
    }

    //<------------- Datele necesare ------------->

    @Given("Deschidem pagina de web San Marco pentru comanda")
    public void deschidemPaginaDeWebSanMarcoPentruComanda() throws InterruptedException{
        InitializareDriver.setup("https://www.pizzasanmarco.ro/cos");
        sleep(1000);
    }

    @And("Completam {string}: {string}")
    public void completam(String arg1,String nume) throws InterruptedException{
        InitializareDriver.getDriver().findElement(By.xpath("//*[@class='faracont-livrare-"+arg1+"']")).sendKeys(nume);
        sleep(1000);
    }

    @And("Introducem strada")
    public void introducemStrada() throws InterruptedException{
        InitializareDriver.getDriver().findElement(By.xpath("//*[@class='select2-selection__placeholder']")).click();
        sleep(1000);
        InitializareDriver.getDriver().findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys("Prelungirea Mesterul Manole",Keys.ENTER);
        sleep(1000);
    }

    @And("Alegem metoda de plata")
    public void alegemMetodaDePlata() throws InterruptedException{
        InitializareDriver.getDriver().findElement(By.xpath("//input[@value='2']")).click();
        sleep(1000);
    }
}