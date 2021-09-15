package eoliveira.driverMng.drivers;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import eoliveira.driverMng.DriverMng;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxDriverMng extends DriverMng {

    @Override
    public void createDriver() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
}
