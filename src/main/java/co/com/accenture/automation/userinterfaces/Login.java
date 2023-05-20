package co.com.accenture.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login {

    public static final Target INPUT_USER = Target.the("Input user Login").locatedBy("//android.widget.EditText[@content-desc='test-Usuario']");
    public static final Target INPUT_PASSWORD = Target.the("Input password Login").locatedBy("//android.widget.EditText[@content-desc='test-Contraseña']");
    public static final Target BTN_LOGIN = Target.the("Button login").locatedBy("//android.view.ViewGroup[@content-desc='test-LOGIN']");
    public static final Target LBL_PRODUCT = Target.the("Label Products").locatedBy("//android.widget.TextView[@text = 'PRODUCTOS']");

    public static final Target INPUT_USER_IOS = Target.the("Input user Login").located(By.name("test-Usuario"));
    public static final Target INPUT_PASSWORD_IOS = Target.the("Input password Login").located(By.name("test-Contraseña"));
    public static final Target BTN_LOGIN_IOS = Target.the("Button login").located(By.name("test-LOGIN"));
    public static final Target LBL_PRODUCT_IOS = Target.the("Label Products").locatedBy("//XCUIElementTypeStaticText[@name='PRODUCTOS']");


}


