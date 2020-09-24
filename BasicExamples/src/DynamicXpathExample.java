import java.awt.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;




//import com.sun.org.apache.bcel.internal.generic.Select;

public class DynamicXpathExample extends Thread {

	public void run() {

		System.setProperty("webdriver.gecko.driver", "C:\\Reddy Workspace\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");

		try {
			System.out.println("Entering in site");
			//List<WebElement> list = driver.findElements(By.xpath("//span[@class='nav-line-2 nav-long-width']//span/descendant::span[@class='nav-icon nav-arrow']"));
			//Select dropdown = new Select(driver.findElement(By.xpath("//div[@class='tabnormal']//p[contains(text(),'Products')]")));
			System.out.println("product field identified");
			Thread.sleep(10000);
			//dropdown.selectByVisibleText("Create a List"); 
			//driver.findElement(By.xpath("//a[contains(text(),'Moxa Serial Device Server')]")).click();
			//List<WebElement> list=driver.findElements(By.xpath(""));
			Thread.sleep(5000);
		
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
