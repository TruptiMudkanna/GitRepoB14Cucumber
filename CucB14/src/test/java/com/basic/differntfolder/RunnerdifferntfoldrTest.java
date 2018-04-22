package com.basic.differntfolder;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		dryRun=true, //checks typing misteks
		features={"src/test/resources/com/basic/differntfolderFF/"},
		glue={"com/basic/differntfolder/"}
		
		
		)

public class RunnerdifferntfoldrTest {
	
	

}
