package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T1 {

	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.armymwr.com/");
		System.out.println(driver.findElement(By.cssSelector("div.logo")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("div.col-6>span")).getText());
		driver.findElement(By.cssSelector("a#ewHomeLifeBtn")).click();

		List<WebElement> h1s = driver.findElements(By.xpath("//h1"));

		for (WebElement h1 : h1s) {
			System.out.println(h1.getText());
		}

		driver.findElement(By.cssSelector("a[href*='advertising']")).click();
		System.out.println(driver.findElement(By.cssSelector("dl.accordion")).getText());
		driver.close();
	}
}
