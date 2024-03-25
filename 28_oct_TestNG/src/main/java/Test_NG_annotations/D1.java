package Test_NG_annotations;

import org.testng.annotations.Test;

public class D1 {

	// test NextGen
	// we mention reports in jira

	@Test(priority = 1)

	public void name() {

		System.out.println("Hello");

	}

	@Test(priority = 2)
	public void name1() {

		System.out.println("hi");
	}
}
