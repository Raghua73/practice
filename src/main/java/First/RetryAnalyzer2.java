package First;


import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer2 implements IRetryAnalyzer{

	int counter=1;
	int retryLimit=4;
	public boolean retry(ITestResult result) {
		
		if(counter<retryLimit) {
			counter++;
			return true;
		}
		return false;
	}
	
}