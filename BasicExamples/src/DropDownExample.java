import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select; 

public class DropDownExample extends Thread{

	public void run() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Reddy Workspace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Reddy Workspace\\Selenium Test Cases\\BasicExamples\\dropDown.html");
		try {
			Thread.sleep(5000);
			Select dropdown = new Select(driver.findElement(By.id("designation")));
			System.out.println("Dropdown Element found");
			dropdown.selectByIndex(1);
			//dropdown.selectByValue("prog");
			//dropdown.selectByVisibleText("Programmer ");
			System.out.println("Completed");
			
			}
		catch(Exception e) {
			System.out.println("Exception:"+e);
		}
	}
	
	public static void main(String[] args) {
	
		DropDownExample dropDown = new DropDownExample();
		dropDown.start();

	}

}
