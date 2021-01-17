package TestRunner;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.testng.TestRunner;
import org.testng.annotations.BeforeClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.cucumber.testng.TestNGCucumberRunner;

@RunWith(Cucumber.class)
@CucumberOptions(		
features = { "src/test/java/features/feature1.feature","src/test/java/features/feature2.feature" },
glue = {"stepDefinations" },
monochrome= true,
plugin = {"pretty", "html:CucumberReport/cucumber-html-reports","json:target/cucumber.json","junit:target/cucumber.xml","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class ebayRunner {
	private TestNGCucumberRunner testNGCucumberRunner;
	
	@BeforeClass(alwaysRun = true)
	public void setUpClass() throws Exception{
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}
}
