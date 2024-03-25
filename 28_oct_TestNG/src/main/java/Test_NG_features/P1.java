package Test_NG_features;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P1 {

	WebDriver driver; // declaring object globally so it could be used through out the class

	@BeforeMethod
	public void Setup() {//1 4 7

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

	}

	@Test(enabled = true)//to skip
	public void A() {//2
		boolean input1 = driver.findElement(By.id("email")).isDisplayed();
		System.out.println(input1);
	}

	@Test
	public void B() {//5
		boolean input2 = driver.findElement(By.id("pass")).isDisplayed();
		System.out.println(input2);
	}
	
	
	
	@Test
	public void C() {//8
		boolean input3 = driver.findElement(By.id("pass")).isDisplayed();
		System.out.println(input3);
	}
	
	@AfterClass
	public void teardown() {//3,6,9
		driver.close();
	}

}
