package setups;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;



public class DriverPool {

    private static AppiumDriver<MobileElement> driverInstance;

    public static AppiumDriver<MobileElement> getDriverInstance() {

        return DriverPool.driverInstance;
    }

    public void setDriverInstance(AppiumDriver<MobileElement> instance) {

        DriverPool.driverInstance = instance;
    }
}