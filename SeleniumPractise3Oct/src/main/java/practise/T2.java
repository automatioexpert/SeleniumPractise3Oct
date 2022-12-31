package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T2 {

	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.armymwr.com/");
		System.out.println(driver.findElement(By.cssSelector("div.logo")).isDisplayed());

		driver.findElement(By.cssSelector("a[href*='patrons']")).click();
		System.out.println(driver.findElement(By.xpath("//h1")).getText());
	System.out.println(driver.findElement(By.xpath("//div/label[contains(text(),'looking')]")).getText());
	driver.findElement(By.xpath("(//input[starts-with(@id,'hero-search')][@name='query'])[4]")).sendKeys("products"+Keys.ENTER);
	
System.out.println("I am the best expert on the Planet");
	}
}
