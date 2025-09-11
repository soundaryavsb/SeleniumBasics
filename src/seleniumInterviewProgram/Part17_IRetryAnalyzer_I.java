package seleniumInterviewProgram;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Part17_IRetryAnalyzer_I implements IRetryAnalyzer {

	int Initial=0;
	int ExecutionLimit=3;
	public boolean retry(ITestResult result) {
		if(Initial<ExecutionLimit)
		{
			Initial++;
			return true;
		}
		return false;
	}

}
