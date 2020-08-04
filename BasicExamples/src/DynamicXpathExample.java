import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathExample extends Thread {

	public void run() {

		System.setProperty("webdriver.chrome.driver", "C:\\Reddy Workspace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localautomation.com/");

		try {
			Thread.sleep(5000);
			//driver.

			//driver.close();
		}

		catch (Exception e) {
			System.out.println("Exception:" + e);
		}

	}

	public static void main(String[] args) {

		DynamicXpathExample login = new DynamicXpathExample();
		login.start();

	}

}
