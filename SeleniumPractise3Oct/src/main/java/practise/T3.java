package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T3 {

	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.armymwr.com/patrons");
		List<WebElement> links = driver.findElements(By.cssSelector("div.col-md-6>p>a"));

		for (WebElement link : links) {
			System.out.println(link.getText());
		}

	driver.quit();
	}
}
