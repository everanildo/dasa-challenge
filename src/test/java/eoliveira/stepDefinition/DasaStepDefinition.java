package eoliveira.stepDefinition;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import eoliveira.POM.DasaHome;
import eoliveira.POM.DasaNossasMarcas;
import eoliveira.driverMng.DriverMng;
import eoliveira.driverMng.DriverMngFactory;
import eoliveira.driverMng.DriverType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DasaStepDefinition {

	DriverMng driverManager;
	private WebDriver driver;
	private DasaHome home;
	private DasaNossasMarcas nossasMarcas;

	@Before
	public void setup() {
		this.driverManager = DriverMngFactory.getManager(DriverType.CHROME);
		this.driver = this.driverManager.getDriver();
		this.home = new DasaHome(driver);
		this.nossasMarcas = new DasaNossasMarcas(driver);
	}

	@After
	public void teardown() {
		this.driverManager.quitDriver();
	}

	@Given("Eu navego até dasa home page")
	public void navigateToDasaPage() {
		this.driver.get("http://www.dasa.com.br");
	}
	
	@Given("Em Dasa Home page eu navego até companies")
	public void navigateToCompaniesPage() {
		home.mouseOverMenuSomosDasa();
		home.clickNossasMarcasOption();
	}

	@Given("Eu seleciono região São Paulo")
	public void selectRegion() throws Exception {
		nossasMarcas.selectOption("São Paulo");
	}	
	
	@Given("Eu listo os laboratórios de São Paulo no Console")
	public void printCompaniesURL() {
		for (WebElement brand : nossasMarcas.GetBrands()) {
			System.out.println(brand.getAttribute("href"));
		}
	}
	
	@Given("Eu seleciono delboniauremo via url")
	public void selectCompany() throws InterruptedException {
		nossasMarcas.selectCompany("delboniauriemo.com.br");
	}	
	
	@Then("Eu verifico que estou na pagina delboniauremo via url")
	public void verifyLink(String url) throws InterruptedException {
		List<String> companyTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(companyTab.get(1));
		assert (url.equals(driver.getCurrentUrl()));
	}
}
