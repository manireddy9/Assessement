package com.ManiGopiReddy.TechAssessment3;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookClass {
	@Before
	public void Start() {
		HelperClass.SetUpDriver();
	}
	@After
	public void stop() {
//		HelperClass.TearDown();
	}


}
