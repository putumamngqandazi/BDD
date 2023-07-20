package StepDefinationPack;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import com.example.utils.HelperClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

    public class screenshot {

        @Before
        public static void setUp() {

            Screenshot.setUpDriver();
        }

        @After
        public static void screenshot(Scenario scenario) {

            //validate if scenario has failed
            if(scenario.isFailed()) {
                final byte[] screenshot = ((TakesScreenshot) StepDefinationPack.screenshot.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", scenario.getName());
            }

            screenshot.tearDown();
        }
    }
