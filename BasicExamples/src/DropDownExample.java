
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test; 

public class DropDownExample{

	@Test
	public void selectDDvalues() throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Reddy Workspace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
		try {
			Thread.sleep(5000);
			Select dropdown = new Select(driver.findElement(By.id("month")));
			System.out.println("Dropdown Element found");
			// It should return month
			WebElement selected_value=dropdown.getFirstSelectedOption();
			System.out.println("Before selected values is :"+selected_value.getText());
			
			// It will select march month
			dropdown.selectByIndex(3);
			WebElement selected_value1=dropdown.getFirstSelectedOption();
			System.out.println("After selected values is :"+selected_value1.getText());
			
			
			Thread.sleep(3000);
			
			// It will select october month
			dropdown.selectByValue("10");
			
			Thread.sleep(3000);
			
			// It will select August month
			dropdown.selectByVisibleText("Aug");
			System.out.println("Completed");
			
			}
		catch(Exception e) {
			System.out.println("Exception:"+e);
		}
	
	}

}
