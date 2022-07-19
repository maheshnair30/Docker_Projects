package Tests;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class chromeStandaloneTest {

	
	@BeforeTest
	public void startDockerScale() throws IOException, InterruptedException
	{
		File fi =new File("output.txt");
		if(fi.delete())
		{
			System.out.println("file deleted successfully");
		}
		startDocker s=new startDocker();
		s.startFile();
	}
	
	@AfterTest
	public void stopDockerDeleteFile() throws IOException, InterruptedException
	{
		stopDocker d=new stopDocker();
		d.stopFile();
		
		
	}
	
	@Test
	public void Test1() throws MalformedURLException {
		
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url,cap);
		driver.get("https:google.com");
		System.out.println("Title name is:"+driver.getTitle());
	}
}
