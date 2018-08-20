package sisagendatest;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TC_66 {

	public static void main(String[] args) {
		
		File file  = new File("C:\\Users\\bkumar65\\Downloads\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
		cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		WebDriver driver = new InternetExplorerDriver(cap);
		driver.get("http://smsisagendadeveloper.amil.com.br/SisAgenda/");
		
		
	}
}
