package Test_NG_annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test_NG_Annotaion {

	// Execution sequence

	// Before Suit
	// Before Test
	// Before class
	// Before Method
	// test
	// After method
	// after class
	// after test
	// after suit

	// real time project we dont need only @beforeMethod @AfterMethod @Test
	// @beforeClass @Afterclass

	@BeforeSuite
	public void setup() {
		System.out.println("@Before suit setup system config");

	}

	@BeforeClass
	public void URL() {
		System.out.println("@Beforeclass Enter URL");
	}

	@BeforeMethod
	public void LaunchBrowser() {
		System.out.println("@Beforemethod launch browser");

	}

	@BeforeTest
	public void LoginApp() {
		System.out.println("@BeforeTest  Login application");
	}

//post condition annotation

	@AfterSuite
	public void logout() {
		System.out.println("@After suit logout application");
	}

	@AfterClass
	public void CloseBrowser() {
		System.out.println("@Afterclass close browser");
	}

	@AfterMethod
	public void deleteCookies() {
		System.out.println("@AfterMethod deleteCookies");
	}

	@AfterTest
	public void logOut1() {
		System.out.println("@AfterTest LogOut1");
	}

	@Test
	public void facebookPage() {
		System.out.println("@Test FacebookPage");
	}

	@Test
	public void facebookPage1() {
		System.out.println("@Test FacebookPage1");
	}

}
