package Runcukes;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(tags = ("@Test"),
        plugin = {"pretty","html:target/html_report/TestCase_03/",
                "json:target/cucumber-report/TestCase_01.json"},
        features = {"src/test/resources/Test.feature"},
        glue = {"com.test.Steps"}
)


public class Test_TC01Test {


}
