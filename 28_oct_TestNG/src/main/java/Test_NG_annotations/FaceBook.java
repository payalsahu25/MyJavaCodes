package Test_NG_annotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
//execution BM- test- AM
	WebDriver driver;

	@BeforeMethod
	public void set() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

	}

	@Test
	public void AppTitle() {
		String title = driver.getTitle();
		System.out.println(title);

		if (title.equals("Facebbok - log in or sign up")) {
			System.out.println("Correct title");
		} else {
			System.out.println("Incorrect title");
		}

	}

	@Test
	public void Facebook_logo() {
		boolean logo = driver.findElement(By.id("email")).isDisplayed();
		System.out.println(logo);

		if (logo) {
			System.out.println("input textbox displayed");
		} else {
			System.out.println(logo);
		}

	}

	@AfterMethod
	public void teardown() {

		driver.quit();
	}

}
