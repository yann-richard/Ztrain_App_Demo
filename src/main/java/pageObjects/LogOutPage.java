package pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LogOutPage extends Page {



    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"continue\"]")
    private MobileElement confirmLogoutButton;

    public void confirmLogout(){
        click(confirmLogoutButton);
    }





}
