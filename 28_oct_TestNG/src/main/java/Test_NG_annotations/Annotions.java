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

public class Annotions {
	
	//no main method
	
	
	//1//Pre annotaion
	@BeforeSuite
	@BeforeClass
	@BeforeMethod
    @BeforeTest	


//2// Test annotation
    @Test
    public void name() {
		System.out.println("Test");
	}

//3// Post Annotation
   
    
    @AfterTest
    @AfterMethod
    @AfterClass
    @AfterSuite
  
    public void Teardown() {
    	
    }
    
    // @AfterClass
   // @AfterMethod
   // @AfterTest

    //parameter annotation
    //dataprovider annotation
    
}
