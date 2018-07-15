package jenkin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Jenkin {
	
	@Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver", ".\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		System.out.println("google opened");
		driver.quit();
		System.out.println("browser closed");
	}

}
