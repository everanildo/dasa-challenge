package eoliveira.driverMng;


import eoliveira.driverMng.drivers.ChromeDriverMng;
import eoliveira.driverMng.drivers.FirefoxDriverMng;

public class DriverMngFactory {

    public static DriverMng getManager(DriverType type) {
        DriverMng driverManager;

        switch (type) {
            case FIREFOX:
                driverManager = new FirefoxDriverMng();
                break;
            default:
                driverManager = new ChromeDriverMng();
                break;
        }
        return driverManager;
        
    }
}
