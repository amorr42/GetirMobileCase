package setups;

import org.openqa.selenium.remote.DesiredCapabilities;

public class Capabilities {

    public DesiredCapabilities localAndroid(){
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "9");
        capabilities.setCapability("deviceName", "89U4C19312001454");
        capabilities.setCapability("appPackage", "com.allandroidprojects.getirsample");
        capabilities.setCapability("appActivity", "com.allandroidprojects.getirsample.startup.SplashActivity");
        capabilities.setCapability("noReset", "true");
        capabilities.setCapability("clearSystemFiles", "true");
        capabilities.setCapability("autoGrantPermissions","true");

        return capabilities;
    }
}