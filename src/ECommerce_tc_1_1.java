import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ECommerce_tc_1_1 extends Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = Capabilities();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("hello");

		//driver.hideKeyboard();
		
		driver.findElement(By.xpath("//*[@text='Female']")).click();
		
		driver.findElement(By.id("android:id/text1")).click();
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
		
		driver.findElement(By.xpath("//*[@text='Argentina']")).click();
		
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		String toastMessage=driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");

		System.out.println(toastMessage);

		Assert.assertEquals("Please enter your name", toastMessage);//Actual validation

		//name attribute for toast messages will have content
		
		
		

		
	}
}
