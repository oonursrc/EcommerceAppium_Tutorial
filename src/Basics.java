import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Basics extends Base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		
		AndroidDriver<AndroidElement> driver =Capabilities();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//works
		//driver.findElementByXPath("//android.widget.TextView[@content-desc='Preference']").click();
		
		//works
		//driver.findElementByAccessibilityId("Preference").click();
		
		//works
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		
		driver.findElementById("android:id/checkbox").click();
		
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		
		driver.findElementByClassName("android.widget.EditText").sendKeys("Onur");
			
		driver.findElementByXPath("//android.widget.Button[@text='OK']").click();


	}

}
