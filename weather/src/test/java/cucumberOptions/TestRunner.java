package cucumberOptions;
import io.cucumber.junit.Cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;



	@SuppressWarnings("deprecation")
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/test/java/feature/Holiday.feature",
			glue="stepDefinations"
			
			    )
		
		
	public class TestRunner
	
	{

}
	
