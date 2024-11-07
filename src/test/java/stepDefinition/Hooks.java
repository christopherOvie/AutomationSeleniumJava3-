package stepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.reporter.FileUtil;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utility.Shared;

public class Hooks {
	
	Shared sh;
	public Hooks(Shared sh) {
		this.sh=sh;
	}
	@After
	public void AfterScenario() throws IOException {
		//sh.driver.quit();
		sh.testBase.driverManager().quit();
		//  sh.testBase.driverManager()  is my driver
	}
	@AfterStep
	public void addScreenshots(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			//castdriver
			WebDriver driver = sh.testBase.driverManager();
		File sourcepath =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		byte[] filecontent =FileUtils.readFileToByteArray(sourcepath);// convert into byte format
		scenario.attach(filecontent, "image/png", "image");
			
//			  final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//	            scenario.attach(screenshot, "image/png", "screenshot");  // Attaches screenshot to the report
//
//	            // Log or print details about the failed scenario
//	            System.out.println("Scenario '" + scenario.getName() + "' failed.");
		}
	}

}
