package com.org.app.poc.itcares;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources")
public class CucumberTest {

}


//public class CucumberTest extends SpringIntegrationTest {
//}


//@CucumberOptions(features = "classpath:Feature")
