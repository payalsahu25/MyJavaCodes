package Test_NG_features;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Right_Click_2 {

	public static void main(String[] args) throws InterruptedException {
		//// 

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		WebElement ele = driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));

		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		
		act.contextClick(ele).build().perform();
		
		Thread.sleep(3000);
		
		driver.close();
		
		
	}

}
