package pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;


public class HomePage extends NavigationPage {

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Stan Smith Triple Black GY4980 €199.1\"]/android.widget.ImageView[1]")
    private MobileElement pantItem;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText\n")
    private MobileElement searchField;

    @AndroidFindBy(className = "android.view.View")
    private List<MobileElement> item;


    @AndroidFindBy(accessibility = "Panier mise à jours")
    private MobileElement cartNotification;

    @AndroidFindBy(accessibility = "Game")
    private MobileElement headerCategory;

    @AndroidFindBy(accessibility = "Aller au site")
    private MobileElement readyButton;


    @AndroidFindBy(accessibility = "Ajouter au panier")
    private MobileElement addToCart;


    @AndroidFindBy(accessibility = "Back")
    private MobileElement back;





    public void goToCartPage(){clickOncarIcon();}
    public void addItemToCart(){
        click(addToCart);
    }
    public void goToHomeboard(){
        click(readyButton);
    }

    public void selectItem(){
        scroll("Nike Sport White - Man Pant €50.5");
        pantItem.click();
    }

    public void goToFavorisPage(){
        clickOnfavorisView();
    }
    public void goToaccountProfilPage(){
        clickOnaccountProfilView();
    }
    public boolean verifyNotification(){
        try{
            shortWaitUntil(visibilityOf(cartNotification));
            return cartNotification.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }

    public boolean verifyHomeView(){
        try{
            shortWaitUntil(visibilityOf(headerCategory));
            return headerCategory.isDisplayed()||!searchField.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }

}
