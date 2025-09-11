package seleniumInterviewProgram;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class seleniumInterviewPracticeIRetryAnalyzer implements IRetryAnalyzer{

	int Iteration=3;
	int initial=0;
	public boolean retry(ITestResult result) {
		
		if(Iteration>initial)
		{
			initial++;
			return true;
		}
		else
		{
		return false;
		}
	}	
}
