package Tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class firefoxStandaloneTest {

	@Test
	public void Test1() throws MalformedURLException {
		
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url,cap);
		driver.get("https:amazon.com");
		System.out.println("Title name is:"+driver.getTitle());
	}
}
