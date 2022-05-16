package pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;




import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class AccountPage extends NavigationPage {

    @AndroidFindBy(accessibility = "Mon compte")
    private MobileElement accountSettingButton;

    @AndroidFindBy( accessibility = "Déconnexion")
    private MobileElement logoutButton;


    public void  goToaccountSettingPage(){
        click(accountSettingButton);
    }
    public void goTologoutPage(){
        click(logoutButton);
    }
    public void goToHomeboardpage(){
        clickOnHomeboardView();
    }
    public void goToFavorisPage(){
        clickOnfavorisView();
    }

}
