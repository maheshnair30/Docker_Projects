package Tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class chromeStandaloneTest3 {

	@Test
	public void Test1() throws MalformedURLException {
		
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url,cap);
		driver.get("https:bigbasket.com");
		System.out.println("Title name is:"+driver.getTitle());
	}
}
