package First;

import org.testng.annotations.Test;

public class DependsTest {

	
	@Test(dependsOnMethods= {"OpenBrowser"})
	public void signIn() {
		System.out.println("SignIn Successfull");
	}
	
	@Test
	public void OpenBrowser() {
		System.out.println("The Browser is opened");
	}
	
	@Test(dependsOnMethods= {"signIn"})
	public void logout() {
		System.out.println("Logout Successfull");
	}
}
