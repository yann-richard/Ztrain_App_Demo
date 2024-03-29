package pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;


public class CartPage extends NavigationPage{

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View\n")
    private MobileElement emptyCartButton;
    @AndroidFindBy(accessibility = "Valider")
    private MobileElement submit;

    public void submitCartList(){
        click(submit);
    }
    public void emptyCartList(){
        click(emptyCartButton);
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


