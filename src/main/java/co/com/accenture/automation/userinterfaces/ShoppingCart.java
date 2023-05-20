package co.com.accenture.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCart {
    public static final Target LBL_PRODUCT_LIST = Target.the("Label product").locatedBy("//android.widget.TextView[contains(@text, '{0}')]");
    public static final Target BTN_SHOPPING_CART = Target.the("Button shopping cart").locatedBy("//android.view.ViewGroup[@content-desc='test-Carrito']");

    public static final Target LBL_PRODUCT_LIST_IOS = Target.the("Label product").locatedBy("//XCUIElementTypeStaticText[@label= '{0}']");
    public static final Target ADD_CART_IOS = Target.the("Label product").locatedBy("(//XCUIElementTypeOther[@name='test-AÑADIR A CARRITO'])[1]");

    public static final Target BTN_SHOPPING_CART_IOS = Target.the("Button shopping cart").locatedBy("(//XCUIElementTypeOther[@name='1'])[4]");

}
