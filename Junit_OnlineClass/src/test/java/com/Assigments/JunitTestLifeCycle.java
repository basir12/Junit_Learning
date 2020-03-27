package com.Assigments;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTestLifeCycle {

	@BeforeClass
	public static void beforeClass() {
		
		System.out.println("Before class executions");

	}

	@Before
	public void beforMethod() {
		
		System.out.println("Before method executions");

	}

	@Test
	public void test() {

		System.out.println("Junit Test practice");

	}

	public void test2() {

		System.out.println("Junit Test2 practice");

	}

	@After
	public void afterMethod() {
		
		System.out.println("After methods executions");

	}

	@AfterClass
	public static void afterClass() {
		
		System.out.println("Before class executions");

	}

}
