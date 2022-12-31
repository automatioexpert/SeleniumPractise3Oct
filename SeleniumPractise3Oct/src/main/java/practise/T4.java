package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T4 {

	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.armymwr.com/patrons");

		driver.findElement(By.cssSelector("a[href*='contact-us']")).click();
		System.out.println(driver.findElement(By.xpath("//h4")).getText());

		List<WebElement> prs = driver.findElements(By.xpath("//h4/following-sibling::p"));

		for (WebElement p : prs) {
			System.out.println(p.getText());
		}
		System.out.println("I am the top expert on the Planet");
		driver.quit();
	}
}
