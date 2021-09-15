package eoliveira.POM;

import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class DasaHome {

	private WebDriver driver;
	private String somosDasaMenuXpath = "//div[contains(@class,'eWFgbM')]//a[@label='Somos Dasa']/div";
	private String optionNossasMarcasXpath = "//a[@label='Nossas Marcas']";

	public DasaHome(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void mouseOverMenuSomosDasa() {
		WebElement menuSomosDasa = driver.findElement(By.xpath(somosDasaMenuXpath));
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(menuSomosDasa));
	}

	public void clickNossasMarcasOption() {
		WebElement menuSomosDasa = driver.findElement(By.xpath(somosDasaMenuXpath));
		WebElement nossasMarcasOption = driver.findElement(By.xpath(optionNossasMarcasXpath));
		
		Actions action = new Actions(driver);
		action.moveToElement(menuSomosDasa).moveToElement(nossasMarcasOption).click().perform();
	}
}
