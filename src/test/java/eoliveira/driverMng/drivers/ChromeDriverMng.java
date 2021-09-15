package eoliveira.driverMng.drivers;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import eoliveira.driverMng.DriverMng;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDriverMng extends DriverMng {

    @Override
    public void createDriver() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
}
