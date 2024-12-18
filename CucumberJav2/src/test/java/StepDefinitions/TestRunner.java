package StepDefinitions;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\SS241\\eclipse-workspace\\CucumberJav2\\src\\test\\resources\\Features",glue={"StepDefinitions"},
monochrome=true,
//plugin= {"pretty","html:target/Html.reports"})
//plugin= {"pretty","json:target/JSONReports/reports.json"})
plugin= {"pretty","junit:target/JunitReports/reports.xml"})
//tags="@SmokeTesting")
public class TestRunner {

	
	
}
