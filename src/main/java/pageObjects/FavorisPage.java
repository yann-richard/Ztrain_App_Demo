package pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import java.util.List;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;



public class FavorisPage extends NavigationPage{

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View\n")
    private MobileElement emptyButton;

    public void emptyFavorisPage(){
        click(emptyButton);
    }
    public void goToFavorisPage(){
        clickOnfavorisView();
    }
    public void goToaccountProfilPage(){
        clickOnaccountProfilView();
    }
    public void goToHomeboardpage(){
        clickOnHomeboardView();
    }
    public boolean verifyFavorisContain(){
        try{
            shortWaitUntil(visibilityOf(accountProfilView));
            return (favorisView.isDisplayed() && accountProfilView.isDisplayed());
        }catch (Exception e){
            return false;
        }
    }


    }


