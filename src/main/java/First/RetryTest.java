package First;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTest {

	
	 @Test(retryAnalyzer=First.RetryAnalyzer2.class) public void test1() {
		 Assert.assertEquals(false, true); 
	  }
	 

	@Test
	public void test2() {
		Assert.assertEquals(false, true);
	}

	@Test
	public void test3() {
		Assert.assertEquals(false, true);
	}

}