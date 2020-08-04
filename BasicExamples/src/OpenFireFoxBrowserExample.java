import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenFireFoxBrowserExample extends Thread {
	public void run() {
		System.setProperty("webdriver.gecko.driver", "C:\\Reddy Workspace\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Reddy%20Workspace/Selenium%20Test%20Cases/BasicExamples/dropDown.html");
		try {
			Thread.sleep(5000);
			Select dropdown = new Select(driver.findElement(By.id("designation")));
			System.out.println("Dropdown Element found");
			dropdown.selectByIndex(1);
			// dropdown.selectByValue("prog");
			// dropdown.selectByVisibleText("Programmer ");
			System.out.println("Completed");

		} catch (Exception e) {
			System.out.println("Exception:" + e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OpenFireFoxBrowserExample dropDown = new OpenFireFoxBrowserExample();
		dropDown.start();

	}

}
