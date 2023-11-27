package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase3 
{
	@Test
	public void tc1()
	{
		Reporter.log("hello jankins", true);
	}

}
